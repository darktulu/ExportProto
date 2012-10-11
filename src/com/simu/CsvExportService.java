package com.simu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvExportService {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
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
		
//		List<String> test = new ArrayList<String>();
//		test.add("list 1");
//		test.add("list 2");
//		test.add("list 3");
//		a.setTest(test);
		
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = mapper.schemaFor(Account.class);
		String result = mapper.writer(schema).writeValueAsString(accounts);
		
		System.out.println(result);
	}
}
