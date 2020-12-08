package com.qf.server.impl;

import com.qf.dao.IUserDao;
import com.qf.pojo.User;
import com.qf.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServerImpl implements IUserServer {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> getAllUser() {
        return iUserDao.getAllUser();
    }

    @Override
    public User queryById(int uid) {
        return this.iUserDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.iUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.iUserDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.iUserDao.update(user);
        return this.queryById(user.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int uid) {
        return this.iUserDao.deleteById(uid) > 0;
    }

    @Override
    public List<User> selectAllUser() {
        return iUserDao.selectAllUser();
    }

    @Override
    public User getUsername(String username) {
        return iUserDao.getUsername(username);
    }
}
