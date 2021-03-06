package com.macro.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.sms.model.SmsFlashPromotion;
import com.macro.mall.sms.service.SmsFlashPromotionRepository;

import java.util.List;

/**
 * 限时购活动管理Service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionService extends SmsFlashPromotionRepository {
    /**
     * 添加活动
     */
    boolean create(SmsFlashPromotion flashPromotion);

    /**
     * 修改指定活动
     */
    boolean update(Long id, SmsFlashPromotion flashPromotion);

    /**
     * 删除单个活动
     */
    boolean delete(Long id);

    /**
     * 修改上下线状态
     */
    boolean updateStatus(Long id, Integer status);

    /**
     * 获取详细信息
     */
    SmsFlashPromotion getItem(Long id);

    /**
     * 分页查询活动
     */
    Page<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum);
}
