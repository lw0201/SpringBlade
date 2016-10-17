/**
 * Copyright (c) 2015-2016, Chill Zhuang 庄骞 (smallchill@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.smallchill.core.toolbox.log;

import com.smallchill.core.constant.Cst;
import com.smallchill.core.interfaces.ILog;
import com.smallchill.core.toolbox.Paras;

/**
 * @title 日志工厂
 * @author zhuangqian
 * @email smallchill@163.com
 * @date 2016-1-26上午10:01:06
 * @copyright 2016
 */
public class BladeLogManager {
	private final static BladeLogManager me = new BladeLogManager();

	private ILog defaultLogFactory = Cst.me().getDefaultLogFactory();

	public static BladeLogManager me() {
		return me;
	}

	private BladeLogManager() {
	}

	public BladeLogManager(ILog checkFactory) {
		this.defaultLogFactory = checkFactory;
	}
	
	public ILog getDefaultLogFactory() {
		return defaultLogFactory;
	}

	public void setDefaultLogFactory(ILog defaultLogFactory) {
		this.defaultLogFactory = defaultLogFactory;
	}

	public static String[] logPatten() {
		return me.defaultLogFactory.logPatten();
	}
	
	public static Paras logMaps(){
		return me.defaultLogFactory.logMaps();
	}
	
	public static boolean isDoLog(){
		return me.defaultLogFactory.isDoLog();
	}
	
	public static boolean doLog(String logName, String msg, boolean succeed) {
		return me.defaultLogFactory.doLog(logName, msg, succeed);
	}
}
