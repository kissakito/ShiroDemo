package test;

import org.junit.Test;

import java.util.Arrays;

public class PermissionTest_5 extends BaseTest {
	
	  @Test
	    public void testHasRole() {
	        login("classpath:test/shiro-role.ini", "zhang", "123");
	        //判断拥有角色：role1
	        System.out.println(subject().hasRole("role1"));
	        //判断拥有角色：role1 and role2
	        System.out.println(subject().hasAllRoles(Arrays.asList("role1", "role2")));
	        //判断拥有角色：role1 and role2 and !role3
	        boolean[] result = subject().hasRoles(Arrays.asList("role1", "role2", "role3"));
	        for (boolean b : result) {
				System.out.println(b);
			}
	  }

	    @Test
	    public void testCheckRole() {
	        login("classpath:test/shiro-role.ini", "zhang", "123");
	        //断言拥有角色：role1
	        try {
	        	subject().checkRole("role1");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("没有role1");
			}
	        
	        try {
	        	 //断言拥有角色：role1 and role3 失败抛出异常
		        subject().checkRoles("role1", "role3");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("没有role3");
			}
	    }
	    
    @Test
    public void testIsPermitted() {
        login("classpath:test/shiro-permission.ini", "zhang", "123");
        //判断拥有权限：user:create
        System.out.println(subject().isPermitted("user:create"));
        //判断拥有权限：user:update and user:delete
        System.out.println(subject().isPermittedAll("user:update", "user:delete"));
        //判断没有权限：user:view
       System.out.println(subject().isPermitted("user:view"));
    }

   @Test
    public void testCheckPermission(){
        login("classpath:test/shiro-permission.ini", "zhang", "123");
        //判断拥有权限：user:create
        try {
        	subject().checkPermission("user:create");
		} catch (Exception e) {
			System.out.println("没有create权限");
		}
        //判断拥有权限：user:delete and user:update
        try {
        	subject().checkPermissions("user:delete", "user:update");
		} catch (Exception e) {
			System.out.println("没有delte update权限");
		}
        //判断拥有权限：user:view 失败抛出异常
        try {
        	subject().checkPermissions("user:view");
		} catch (Exception e) {
			System.out.println("没有view权限");
		}
    }
    
  
   /* 
    @Test
    public void testWildcardPermission1() {
        login("classpath:test/shiro-permission.ini", "li", "123");

        subject().checkPermissions("system:user:update", "system:user:delete");
        subject().checkPermissions("system:user:update,delete");
    }

    @Test
    public void testWildcardPermission2() {
        login("classpath:test/shiro-permission.ini", "li", "123");
        subject().checkPermissions("system:user:create,delete,update:view");

        subject().checkPermissions("system:user:*");
        subject().checkPermissions("system:user");
    }

    @Test
    public void testWildcardPermission3() {
        login("classpath:test/shiro-permission.ini", "li", "123");
        subject().checkPermissions("user:view");

        subject().checkPermissions("system:user:view");
    }

    @Test
    public void testWildcardPermission4() {
        login("classpath:test/shiro-permission.ini", "li", "123");
        subject().checkPermissions("user:view:1");

        subject().checkPermissions("user:delete,update:1");
        subject().checkPermissions("user:update:1", "user:delete:1");

        subject().checkPermissions("user:update:1", "user:delete:1", "user:view:1");

        subject().checkPermissions("user:auth:1", "user:auth:2");

    }

    @Test
    public void testWildcardPermission5() {
        login("classpath:test/shiro-permission.ini", "li", "123");
        subject().checkPermissions("menu:view:1");

        subject().checkPermissions("organization");
        subject().checkPermissions("organization:view");
        subject().checkPermissions("organization:view:1");

    }


    @Test
    public void testWildcardPermission6() {
        login("classpath:test/shiro-permission.ini", "li", "123");
        subject().checkPermission("menu:view:1");
        subject().checkPermission(new WildcardPermission("menu:view:1"));

    }*/



}
