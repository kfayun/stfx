package net.jpcode.stfx.manage.service;

import net.jpcode.stfx.BaseControllerTest;
import net.jpcode.stfx.PageList;
import net.jpcode.stfx.entity.SysRole;
import net.jpcode.stfx.service.SysUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2019/1/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTest extends BaseControllerTest {

    @Autowired
    private SysUserService user;

    @Test
    public void test_findRoleList(){
        PageList<SysRole> roleList = user.findRoleList(1, 10);
        assertNotNull(roleList);
    }

    @Test
    public void test_findRoleById(){
        SysRole roleById = user.findRoleById(1);
        assertNotNull(roleById);
    }

    @Test
    public void test_updateRoleById() {

    }

    @Test
    public void test_deleteRoleById() {

    }
}
