/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/10 10:58:0
 * Project: T
 * File: ContactItemMaker.java
 * Class: ContactItemMaker
 * Module: smssdk
 * Author: yangyankai
 * Version: 1.0
 */

/*
 * 官网地站:http://www.mob.com
 * 技术支持QQ: 4006852216
 * 官方微信:ShareSDK   （如果发布新版本的话，我们将会第一时间通过微信将版本更新内容推送给您。如果使用过程中有任何问题，也可以通过微信与我们取得联系，我们将会在24小时内给予回复）
 *
 * Copyright (c) 2014年 mob.com. All rights reserved.
 */
package cn.smssdk.gui;

import java.util.HashMap;
import android.view.View;
import android.view.ViewGroup;

/** 联系人listview的item自定义接口 */
public interface ContactItemMaker {

	public View getView(HashMap<String, Object> user, View convertView, ViewGroup parent);

}
