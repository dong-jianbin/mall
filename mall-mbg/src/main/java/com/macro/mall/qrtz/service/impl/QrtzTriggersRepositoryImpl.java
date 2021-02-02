package com.macro.mall.qrtz.service.impl;

import com.macro.mall.qrtz.model.QrtzTriggers;
import com.macro.mall.qrtz.mapper.QrtzTriggersMapper;
import com.macro.mall.qrtz.service.QrtzTriggersRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dongjb
 * @since 2021-01-26
 */
@Service
public class QrtzTriggersRepositoryImpl extends ServiceImpl<QrtzTriggersMapper, QrtzTriggers> implements QrtzTriggersRepository {

}
