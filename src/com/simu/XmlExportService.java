package com.simu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlExportService {

	public static void main(String[] args) throws JAXBException, IOException {
		
		Account a = new Account();
		a.setComment("commentaire de test");
		a.setSolde(50);
		a.setTitle("title test");
		
//		List<String> test = new ArrayList<String>();
//		test.add("list 1");
//		test.add("list 2");
//		test.add("list 3");
//		a.setTest(test);
		
		
		JAXBContext context = JAXBContext.newInstance(Account.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(a, System.out);
		
	}
}
