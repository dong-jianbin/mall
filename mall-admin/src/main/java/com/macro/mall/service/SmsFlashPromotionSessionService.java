package com.macro.mall.service;

import com.macro.mall.domain.SmsFlashPromotionSessionDetail;
import com.macro.mall.sms.model.SmsFlashPromotionSession;
import com.macro.mall.sms.service.SmsFlashPromotionSessionRepository;

import java.util.List;

/**
 * 限时购场次管理Service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionSessionService extends SmsFlashPromotionSessionRepository {
    /**
     * 添加场次
     */
    boolean create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次
     */
    boolean update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次启用状态
     */
    boolean updateStatus(Long id, Integer status);

    /**
     * 删除场次
     */
    boolean delete(Long id);

    /**
     * 获取详情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根据启用状态获取场次列表
     */
    List<SmsFlashPromotionSession> listAll();

    /**
     * 获取全部可选场次及其数量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
