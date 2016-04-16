package com.zhuinden.flow_alpha_master_detail;

import flow.ClassKey;
import flow.TreeKey;

/**
 * Created by Zhuinden on 2016.04.16..
 */
public abstract class DetailKey extends ClassKey implements IsDetail, TreeKey {
    @Override
    public Object getParentKey() {
        return getMaster();
    }
}
