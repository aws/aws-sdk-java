/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceRetentionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppInstanceRetentionSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     */
    private AppInstanceRetentionSettings appInstanceRetentionSettings;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code>.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceRetentionSettingsRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     * 
     * @param appInstanceRetentionSettings
     *        The time in days to retain data. Data type: number.
     */

    public void setAppInstanceRetentionSettings(AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     * 
     * @return The time in days to retain data. Data type: number.
     */

    public AppInstanceRetentionSettings getAppInstanceRetentionSettings() {
        return this.appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     * 
     * @param appInstanceRetentionSettings
     *        The time in days to retain data. Data type: number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceRetentionSettingsRequest withAppInstanceRetentionSettings(AppInstanceRetentionSettings appInstanceRetentionSettings) {
        setAppInstanceRetentionSettings(appInstanceRetentionSettings);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceRetentionSettings() != null)
            sb.append("AppInstanceRetentionSettings: ").append(getAppInstanceRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceRetentionSettingsRequest == false)
            return false;
        PutAppInstanceRetentionSettingsRequest other = (PutAppInstanceRetentionSettingsRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceRetentionSettings() == null ^ this.getAppInstanceRetentionSettings() == null)
            return false;
        if (other.getAppInstanceRetentionSettings() != null && other.getAppInstanceRetentionSettings().equals(this.getAppInstanceRetentionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceRetentionSettings() == null) ? 0 : getAppInstanceRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutAppInstanceRetentionSettingsRequest clone() {
        return (PutAppInstanceRetentionSettingsRequest) super.clone();
    }

}
