package com.af.cp.consumerportalbackend;

import com.af.cp.consumerportalbackend.repository.entity.Address;
import com.af.cp.consumerportalbackend.repository.entity.Notification;
import com.af.cp.consumerportalbackend.repository.entity.Party;
import com.af.cp.consumerportalbackend.repository.entity.address.*;
import com.af.cp.consumerportalbackend.repository.entity.parties.Company;
import com.af.cp.consumerportalbackend.repository.entity.parties.Person;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.Genders;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.PersonName;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.RegisteredIdentifier;
import com.af.cp.consumerportalbackend.repository.entity.roles.platformusertype.ServiceProvideUser;
import com.af.cp.consumerportalbackend.repository.entity.roles.platformusertype.ServiceProvideUserType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConsumerPortalBackendApplication {

	public static void main(String[] args) {

		Party partyRoleCompany=new Company();
		Person person = getPerson();
		Party partyRolePerson;
		partyRolePerson=(Party)person;

		partyCompany(partyRoleCompany, partyRolePerson);


		System.out.println(asJsonString(partyRoleCompany));
		System.out.println(asJsonString(partyRolePerson));
		System.out.println(new ResponseEntity<Party>(partyRolePerson, HttpStatus.OK).getBody());;
		SpringApplication.run(ConsumerPortalBackendApplication.class, args);


	}

	private static void partyCompany(Party partyRoleCompany, Party partyRolePerson) {
		List personList = new ArrayList();
		personList.add(partyRolePerson);

		Notification notification = new Notification();
		notification.setMessage("Message");
		notification.setRead(false);
		notification.setRedirectLink("nowhere");
		List<Notification> notifications = new ArrayList<Notification>();
		notifications.add(notification);

		ServiceProvideUser serviceProvideUser =  new ServiceProvideUser();


		EmailAddress emailAddress = new EmailAddress();
		PostalAddress postalAddress = new PostalAddress();
		SocialAddress socialAddress = new SocialAddress();
		TelecomAddress telecomAddres = new TelecomAddress();
		WebAddress webAddress = new WebAddress();


		webAddress.setUrl("Http.cmpy.com");
		emailAddress.setEmail("cmpy@tcs.com");
		socialAddress.setPlatform("FB");
		socialAddress.setSocialId("cmpy9239");
		telecomAddres.setAreaCode("001");
		telecomAddres.setCountryCode("+91");
		telecomAddres.setNumber("7080864865");
		ArrayList<String> addressLine = new ArrayList<String>();
		addressLine.add("cmpy Address Line 1");
		addressLine.add("cmpy Address Line 2");
		addressLine.add("cmpy Address Line 3");
		addressLine.add("cmpy Address Line 4");

		List<Address> addressList = new ArrayList<Address>();
		addressList.add(emailAddress);
		addressList.add(socialAddress);
		addressList.add(telecomAddres);
		addressList.add(postalAddress);
		addressList.add(emailAddress);

		serviceProvideUser.setServiceProvideUserType(ServiceProvideUserType.Devops_Engineer);
		serviceProvideUser.setPartyList(personList);
		serviceProvideUser.setNotifications(notifications);
		partyRoleCompany.setPartyrole(serviceProvideUser);
		partyRoleCompany.setAddressess(addressList);
	}

	private static Person getPerson() {
		Party partyRolePerson=new Person();
		Person person=new Person();
		person.setGender(Genders.Male);
		RegisteredIdentifier registeredIdentifierP=new RegisteredIdentifier();
		RegisteredIdentifier registeredIdentifierDL=new RegisteredIdentifier();
		ArrayList<RegisteredIdentifier> registeredIdentifiersList=new ArrayList<>();
		registeredIdentifiersList.add(registeredIdentifierDL);
		registeredIdentifiersList.add(registeredIdentifierP);
		registeredIdentifierP.setNumber("PassportNumber");
		registeredIdentifierDL.setNumber("DLNumber");
		PersonName personName = new PersonName();
		personName.setFirstName("Gaurav");
		personName.setLastName("Singh");
		person.setPersonName(personName);
		person.setRegisteredIdentifierLit(registeredIdentifiersList);

		EmailAddress emailAddress = new EmailAddress();
		PostalAddress postalAddress = new PostalAddress();
		SocialAddress socialAddress = new SocialAddress();
		TelecomAddress telecomAddres = new TelecomAddress();
		WebAddress webAddress = new WebAddress();

		webAddress.setUrl("Http.abc.com");
		emailAddress.setEmail("Gp@tcs.com");
		socialAddress.setPlatform("FB");
		socialAddress.setSocialId("382938");
		telecomAddres.setAreaCode("0531");
		telecomAddres.setCountryCode("+91");
		telecomAddres.setNumber("9560075131");
		ArrayList<String> addressLine = new ArrayList<String>();
		addressLine.add("Address Line 1");
		addressLine.add("Address Line 2");
		addressLine.add("Address Line 3");
		addressLine.add("Address Line 4");

		List<Address> addressList = new ArrayList<Address>();
		addressList.add(emailAddress);
		addressList.add(socialAddress);
		addressList.add(telecomAddres);
		addressList.add(postalAddress);
		addressList.add(emailAddress);

		postalAddress.setAddressLines(addressLine);
		postalAddress.setCity("City");

		person.setAddressess(addressList);
		return person;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
