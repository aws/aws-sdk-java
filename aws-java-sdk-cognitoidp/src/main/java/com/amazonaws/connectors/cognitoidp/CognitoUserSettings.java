/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.math.pro.ak.util.cognito;

import com.amazonaws.services.cognitoidp.model.MFAOptionType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class encapsulates all settings for a user.
 */
public class CognitoUserSettings {
    /**
     * User Settings
     */
    private Map<String, String> userSettings;

    /**
     * Constructs an "empty" user settings object.
     */
    public CognitoUserSettings() {
        this(null);
    }

    /**
     * Constructs from MFAOptionType List
     *
     * @param userSettingsList      REQUIRED: User settings as a {@link MFAOptionType} list.
     */
    protected CognitoUserSettings(List<MFAOptionType> userSettingsList) {
        this.userSettings = new HashMap<String, String>();
        if (userSettingsList != null) {
            for (MFAOptionType option : userSettingsList) {
                userSettings.put(option.getAttributeName().toString(), option.getDeliveryMedium().toString());
            }
        }
    }

    /**
     * Returns a MFAOptionType list
     *
     * @return User settings as a {@link MFAOptionType} list.
     */
    protected List<MFAOptionType> getSettingsList() {
        List<MFAOptionType> settingsList = new ArrayList<MFAOptionType>();
        if (userSettings != null) {
            for (Map.Entry<String, String> detail : userSettings.entrySet()) {
                MFAOptionType option = new MFAOptionType();
                option.setAttributeName(detail.getKey());
                option.setDeliveryMedium(detail.getValue());
                settingsList.add(option);
            }
        }
        return  settingsList;
    }

    /**
     * Return user settings as key, value pairs.
     *
     * @return user settings as a key, value pairs.
     */
    public Map<String, String> getSettings() {
        return userSettings;
    }

    /**
     * Sets user settings.
     * <p>
     *     Add a new setting for this user. This will override an earlier value set for an attribute
     *     in this object.
     * </p>
     *
     * @param attributeName         REQUIRED: User's attribute name, whose setting is being changed
     * @param option                REQUIRED: The value of the setting.
     */
    public void setSettings(String attributeName, String option) {
        userSettings.put(attributeName, option);
    }
}
