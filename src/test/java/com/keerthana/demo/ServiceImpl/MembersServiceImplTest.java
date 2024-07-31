//package com.keerthana.demo.ServiceImpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.keerthana.demo.Model.Members;
//
//
//@SpringBootTest
//class MembersServiceImplTest {
//	
//	
//	@Autowired
//	MembersServiceImpl member;
//
//	@Test
//	void testGetApplication() {
//		assertNotNull(member.getApplication(51));
//	}
//
//	@Test
//	void testGetAllApplication() {
//		assertNotNull(member.getAllApplication());
//	}
////
//	@Test
//	void testDeleteApplication() {
//		assertEquals("deleted", member.deleteApplication(52));
//	}
//	
//	@Test
//	void testDeleteApplication1() {
//		assertEquals("failed to delete", member.deleteApplication(6));
//	}
//
//
////	@Test
////	@Disabled
////	void testAddEmp() {
////		Members mem=new Members(0, "praba", "soolakara","praba@gmail.com",33,null);
////		assertEquals("success", member.addEmp(mem, 3));	
////	}
//
//	
//	
////	@Test
////	void testUpdateApplication() {
////		Members mem =new Members(6, "praba", "thirunelveli","prabakaran@gmail.com",35,null);
////		assertEquals("updated",mem.updateApplication(mem));
////	}
////	
//
//	
//
//}
