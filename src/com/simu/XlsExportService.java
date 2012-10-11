package com.simu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.adorsys.xlseasy.impl.proc.SpreadsheetServiceImpl;

public class XlsExportService {
	public static void main(String[] args) throws IOException {
		
		List<Account> accounts = new ArrayList<Account>();
		
		Account a = new Account();
		a.setComment("commentaire de test");
		a.setSolde(50);
		a.setTitle("title test");

		Account b = new Account();
		b.setComment("commentaire de test b");
		b.setSolde(501);
		b.setTitle("title test b");
		
		accounts.add(a);accounts.add(b);accounts.add(b);
		accounts.add(a);accounts.add(b);accounts.add(b);
		accounts.add(a);accounts.add(b);accounts.add(b);
		
		SpreadsheetServiceImpl spreadSheetImpl = new SpreadsheetServiceImpl();
        spreadSheetImpl.saveSpreadsheetRecords(Account.class, accounts, System.out);
//		File fs = new File("./test.xls");
//		OutputStream f = new FileOutputStream(fs);
//		spreadSheetImpl.saveSpreadsheetRecords(Account.class, accounts, f);
//		f.close();

	}
}
