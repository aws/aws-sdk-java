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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutRetentionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRetentionSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The retention settings.
     * </p>
     */
    private RetentionSettings retentionSettings;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRetentionSettingsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @param retentionSettings
     *        The retention settings.
     */

    public void setRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @return The retention settings.
     */

    public RetentionSettings getRetentionSettings() {
        return this.retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @param retentionSettings
     *        The retention settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRetentionSettingsRequest withRetentionSettings(RetentionSettings retentionSettings) {
        setRetentionSettings(retentionSettings);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getRetentionSettings() != null)
            sb.append("RetentionSettings: ").append(getRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionSettingsRequest == false)
            return false;
        PutRetentionSettingsRequest other = (PutRetentionSettingsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRetentionSettings() == null ^ this.getRetentionSettings() == null)
            return false;
        if (other.getRetentionSettings() != null && other.getRetentionSettings().equals(this.getRetentionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRetentionSettings() == null) ? 0 : getRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutRetentionSettingsRequest clone() {
        return (PutRetentionSettingsRequest) super.clone();
    }

}
