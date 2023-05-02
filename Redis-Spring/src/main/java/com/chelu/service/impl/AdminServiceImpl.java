package com.chelu.service.impl;

import com.chelu.entity.Admin;
import com.chelu.mapper.AdminMapper;
import com.chelu.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chelu
 * @since 2023-03-12
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
