// package com.capg;
// import org.junit.*;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.MockitoJUnitRunner;
// import static org.junit.Assert.assertEquals;
// import com.capg.entity.Admin;
// import com.capg.entity.Bookingdetails;
// import com.capg.repository.AdminRepository;
// import com.capg.service.AdminService;
// import com.capg.service.AdminServiceImpl;
// import com.capg.repository.*; 

// import static org.mockito.Mockito.*;

// import java.util.*;
// import java.util.List;
// import java.util.Optional;

// @RunWith(MockitoJUnitRunner.class)
// public class AdminTest {

//     @Mock
//     private AdminRepository adminRepository;

//     @InjectMocks
//     private AdminServiceImpl adminServiceImpl;

//     @Test
//     public void testAddAdmin() {        
//         Admin admin = mock(Admin.class);
//         adminServiceImpl.addAdmin(admin);
//         verify(adminRepository).saveAndFlush(admin);
//     }
    
//     @Test
//     public void testLoginAdmin(){
        
//         Admin admin = new Admin();
//         admin.setEmailId("admin@gmail.com");
//         admin.setPassword("abcxyz@123");
//         when(adminRepository.findAll()).thenReturn(Collections.singletonList(admin));
//         String result = adminServiceImpl.loginAdmin("admin@gmail.com", "abcxyz@123");
//         verify(adminRepository).findAll();
//         assertEquals("Logged in successfully", result);
//     }
//     @Test
//     public void testGetAdminByEmailId(){
        
//         Admin admin = new Admin();
//         admin.setEmailId("admin@gmail.com");
//         when(adminRepository.findAll()).thenReturn(Collections.singletonList(admin));
//         Admin result = adminServiceImpl.getAdminByEmailId("admin@gmail.com");
//         verify(adminRepository).findAll();
//         assertEquals(admin, result);
//     }
//     @Test
//     public void testUpdateAdmin(){
//         // Create a mock Admin object
//         Admin admin = new Admin();
//         admin.setaId(1);
//         admin.setAdminName("xyz");
//         Admin updatedAdmin = new Admin();
//         updatedAdmin.setaId(1);        
//         when(adminRepository.findById(admin.getaId())).thenReturn(Optional.of(admin));
//         adminServiceImpl.updateAdmin(updatedAdmin);
//         verify(adminRepository).findById(admin.getaId());
//         verify(adminRepository).saveAndFlush(updatedAdmin);
//         assertEquals(admin, adminServiceImpl.updateAdmin(updatedAdmin));
//     }
//     @Test
//     public void testDeleteAdmin() {
        
//         Admin admin = new Admin();
//         admin.setaId(1);
//         when(adminRepository.findById(1)).thenReturn(Optional.of(admin));
//         Admin deletedAdmin = adminServiceImpl.deleteAdmin(1);
//         verify(adminRepository, times(1)).deleteById(1);
//         assertEquals(admin, deletedAdmin);
//     }

//     @Test
//     public void testFindByAdminName(){
        
//         Admin admin = new Admin();
//         admin.setAdminName("adminName");
//         List<Admin> adminList = new ArrayList<>();
//         adminList.add(admin);
//         when(adminRepository.findAll()).thenReturn(adminList);
//         Admin result = adminServiceImpl.findByAdminName("adminName");
//         verify(adminRepository).findAll();
//         assertEquals(admin, result);
//     }   

// }




































