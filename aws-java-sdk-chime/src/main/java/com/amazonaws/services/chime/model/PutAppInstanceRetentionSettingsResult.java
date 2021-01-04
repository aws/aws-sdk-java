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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceRetentionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppInstanceRetentionSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     */
    private AppInstanceRetentionSettings appInstanceRetentionSettings;
    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     */
    private java.util.Date initiateDeletionTimestamp;

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

    public PutAppInstanceRetentionSettingsResult withAppInstanceRetentionSettings(AppInstanceRetentionSettings appInstanceRetentionSettings) {
        setAppInstanceRetentionSettings(appInstanceRetentionSettings);
        return this;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     * 
     * @param initiateDeletionTimestamp
     *        The time at which the API deletes data.
     */

    public void setInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     * 
     * @return The time at which the API deletes data.
     */

    public java.util.Date getInitiateDeletionTimestamp() {
        return this.initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     * 
     * @param initiateDeletionTimestamp
     *        The time at which the API deletes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceRetentionSettingsResult withInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        setInitiateDeletionTimestamp(initiateDeletionTimestamp);
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
        if (getAppInstanceRetentionSettings() != null)
            sb.append("AppInstanceRetentionSettings: ").append(getAppInstanceRetentionSettings()).append(",");
        if (getInitiateDeletionTimestamp() != null)
            sb.append("InitiateDeletionTimestamp: ").append(getInitiateDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceRetentionSettingsResult == false)
            return false;
        PutAppInstanceRetentionSettingsResult other = (PutAppInstanceRetentionSettingsResult) obj;
        if (other.getAppInstanceRetentionSettings() == null ^ this.getAppInstanceRetentionSettings() == null)
            return false;
        if (other.getAppInstanceRetentionSettings() != null && other.getAppInstanceRetentionSettings().equals(this.getAppInstanceRetentionSettings()) == false)
            return false;
        if (other.getInitiateDeletionTimestamp() == null ^ this.getInitiateDeletionTimestamp() == null)
            return false;
        if (other.getInitiateDeletionTimestamp() != null && other.getInitiateDeletionTimestamp().equals(this.getInitiateDeletionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceRetentionSettings() == null) ? 0 : getAppInstanceRetentionSettings().hashCode());
        hashCode = prime * hashCode + ((getInitiateDeletionTimestamp() == null) ? 0 : getInitiateDeletionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PutAppInstanceRetentionSettingsResult clone() {
        try {
            return (PutAppInstanceRetentionSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
