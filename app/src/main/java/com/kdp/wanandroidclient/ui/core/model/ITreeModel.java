package com.kdp.wanandroidclient.ui.core.model;

import com.kdp.wanandroidclient.bean.TreeBean;
import com.kdp.wanandroidclient.net.callback.RxObserver;

import java.util.List;

/**
 * 知识体系业务接口
 * author: 康栋普
 * date: 2018/2/24
 */

public interface ITreeModel {
    /**
     * 知识体系分类
     *
     * @param callback
     */
    void getTree(RxObserver<List<TreeBean>> callback);
}
