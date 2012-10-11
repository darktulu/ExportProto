package com.simu;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.adorsys.xlseasy.annotation.CellAlign;
import org.adorsys.xlseasy.annotation.Sheet;
import org.adorsys.xlseasy.annotation.SheetCellStyle;
import org.adorsys.xlseasy.annotation.SheetColumn;

@XmlRootElement
@Sheet(autoSizeColumns = true,  columnOrder = {
		"solde", "title", "comment" })
public class Account {

	@SheetColumn(headerStyle = @SheetCellStyle(align = CellAlign.CENTER, fontStyleBold = true))
	private Integer solde;
	@SheetColumn(headerStyle = @SheetCellStyle(align = CellAlign.CENTER, fontStyleBold = true))
	private String title;
	@SheetColumn(headerStyle = @SheetCellStyle(align = CellAlign.CENTER, fontStyleBold = true))
	private String comment;

	// private List<String> test;

	@XmlElement(name = "soldii")
	public Integer getSolde() {
		return solde;
	}

	public void setSolde(Integer solde) {
		this.solde = solde;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	// public List<String> getTest() {
	// return test;
	// }
	//
	// public void setTest(List<String> test) {
	// this.test = test;
	// }

}
