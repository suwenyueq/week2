import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.suwenyue.domain.Column;
import com.suwenyue.service.ColumnService;
import com.suwenyue.util.DateUtil;
import com.suwenyue.util.NumberUtil;
import com.suwenyue.util.StreamUtil;
import com.suwenyue.util.StringUtil;

/**
 * @author 苏文越
 *
 *         2020年1月6日
 */
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ColumnServiceImpltest {
	@Autowired
	private ColumnService columnService;

	@Test
	public void test() {
		// 调用工具栏
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
		List<Column> cList = new ArrayList<Column>();
		
		// 对每一条数据进行操作
		for (int i = 0; i < list.size(); i++) {
			String[] split = list.get(i).split("	");
			Column column = new Column();
			// 判断id是不是数值
			if (NumberUtil.isNumber(split[0])) {
				String iString = split[0];
				BigInteger bigInteger = new BigInteger(iString);
				column.setPkid(bigInteger);
			}
			// keywords 、description、公司名称、主营产品、地址要使用hasText()方法判断有没有值
			// 成立时间要使用hasText()方法判断有没有值,判断是不是日期
			// 注册资本要使用hasText()方法判断有没有值，并使用isNumber()判断是不是数字
			if (StringUtil.hasText(split[1]) && StringUtil.hasText(split[2]) && StringUtil.hasText(split[3])
					&& StringUtil.hasText(split[4]) && StringUtil.hasText(split[5]) && StringUtil.hasText(split[6])
					&& StringUtil.hasText(split[7])) {
				column.setPkgjz(split[1]);// 添加keywords
				column.setPkms(split[2]);// 添加description
				column.setPkname(split[3]);// 添加公司名称
				column.setPkcp(split[4]);// 添加主营产品
				column.setPkadress(split[5]);// 添加地址
				column.setPkctime(split[7]);// 成立时间
				// 判断是不是数值类型
				if (NumberUtil.isNumber(split[6])) {
					column.setPkprice(split[6]);// 注册资金
				}
			}
			cList.add(column);
		}
		columnService.adds(cList);
	}
}
