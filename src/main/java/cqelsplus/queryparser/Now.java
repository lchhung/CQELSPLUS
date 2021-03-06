package cqelsplus.queryparser;
/** 
 * This class implements the now window - a triple-based window with just newest element
 * @author		Danh Le Phuoc
 * @author 		Chan Le Van
 * @organization DERI Galway, NUIG, Ireland  www.deri.ie
 * @email 	danh.lephuoc@deri.org
 * @email   chan.levan@deri.org
 */
public class Now extends RangeWindow {
	public Now(){
		super(0);
	}
}
