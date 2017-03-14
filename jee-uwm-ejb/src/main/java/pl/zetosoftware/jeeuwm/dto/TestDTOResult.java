package pl.zetosoftware.jeeuwm.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author user
 *
 */
public class TestDTOResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String testName;
	private long id;
	private Date data;

	public TestDTOResult() {
	}

	public TestDTOResult(String testName, long id, Date data) {
		super();
		this.testName = testName;
		this.id = id;
		this.data = data;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestDTO [testName=" + testName + ", id=" + id + ", data=" + data + "]";
	}

}
