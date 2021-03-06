/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mobile.android;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public interface PushNotificationsDeviceService {

	public JSONObject addPushNotificationsDevice(String token, String platform)
		throws Exception;

	public JSONObject addVote(long questionId, long choiceId) throws Exception;

	public JSONObject deletePushNotificationsDevice(String token)
		throws Exception;

	public Boolean hasPermission(String actionId) throws Exception;

	public void sendPushNotification(String payload) throws Exception;

}