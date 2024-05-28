/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProtectConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     */
    private String protectConfigurationArn;
    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;
    /**
     * <p>
     * The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * This is true if the protect configuration is set as your account default protect configuration.
     * </p>
     */
    private Boolean accountDefault;
    /**
     * <p>
     * The status of deletion protection for the protect configuration. When set to true deletion protection is enabled.
     * By default this is set to false.
     * </p>
     */
    private Boolean deletionProtectionEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     */

    public void setProtectConfigurationArn(String protectConfigurationArn) {
        this.protectConfigurationArn = protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the protect configuration.
     */

    public String getProtectConfigurationArn() {
        return this.protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationResult withProtectConfigurationArn(String protectConfigurationArn) {
        setProtectConfigurationArn(protectConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     */

    public void setProtectConfigurationId(String protectConfigurationId) {
        this.protectConfigurationId = protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @return The unique identifier for the protect configuration.
     */

    public String getProtectConfigurationId() {
        return this.protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationResult withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
        return this;
    }

    /**
     * <p>
     * The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the protect configuration was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * This is true if the protect configuration is set as your account default protect configuration.
     * </p>
     * 
     * @param accountDefault
     *        This is true if the protect configuration is set as your account default protect configuration.
     */

    public void setAccountDefault(Boolean accountDefault) {
        this.accountDefault = accountDefault;
    }

    /**
     * <p>
     * This is true if the protect configuration is set as your account default protect configuration.
     * </p>
     * 
     * @return This is true if the protect configuration is set as your account default protect configuration.
     */

    public Boolean getAccountDefault() {
        return this.accountDefault;
    }

    /**
     * <p>
     * This is true if the protect configuration is set as your account default protect configuration.
     * </p>
     * 
     * @param accountDefault
     *        This is true if the protect configuration is set as your account default protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationResult withAccountDefault(Boolean accountDefault) {
        setAccountDefault(accountDefault);
        return this;
    }

    /**
     * <p>
     * This is true if the protect configuration is set as your account default protect configuration.
     * </p>
     * 
     * @return This is true if the protect configuration is set as your account default protect configuration.
     */

    public Boolean isAccountDefault() {
        return this.accountDefault;
    }

    /**
     * <p>
     * The status of deletion protection for the protect configuration. When set to true deletion protection is enabled.
     * By default this is set to false.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        The status of deletion protection for the protect configuration. When set to true deletion protection is
     *        enabled. By default this is set to false.
     */

    public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
    }

    /**
     * <p>
     * The status of deletion protection for the protect configuration. When set to true deletion protection is enabled.
     * By default this is set to false.
     * </p>
     * 
     * @return The status of deletion protection for the protect configuration. When set to true deletion protection is
     *         enabled. By default this is set to false.
     */

    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * The status of deletion protection for the protect configuration. When set to true deletion protection is enabled.
     * By default this is set to false.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        The status of deletion protection for the protect configuration. When set to true deletion protection is
     *        enabled. By default this is set to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectConfigurationResult withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        setDeletionProtectionEnabled(deletionProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * The status of deletion protection for the protect configuration. When set to true deletion protection is enabled.
     * By default this is set to false.
     * </p>
     * 
     * @return The status of deletion protection for the protect configuration. When set to true deletion protection is
     *         enabled. By default this is set to false.
     */

    public Boolean isDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
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
        if (getProtectConfigurationArn() != null)
            sb.append("ProtectConfigurationArn: ").append(getProtectConfigurationArn()).append(",");
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getAccountDefault() != null)
            sb.append("AccountDefault: ").append(getAccountDefault()).append(",");
        if (getDeletionProtectionEnabled() != null)
            sb.append("DeletionProtectionEnabled: ").append(getDeletionProtectionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProtectConfigurationResult == false)
            return false;
        UpdateProtectConfigurationResult other = (UpdateProtectConfigurationResult) obj;
        if (other.getProtectConfigurationArn() == null ^ this.getProtectConfigurationArn() == null)
            return false;
        if (other.getProtectConfigurationArn() != null && other.getProtectConfigurationArn().equals(this.getProtectConfigurationArn()) == false)
            return false;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getAccountDefault() == null ^ this.getAccountDefault() == null)
            return false;
        if (other.getAccountDefault() != null && other.getAccountDefault().equals(this.getAccountDefault()) == false)
            return false;
        if (other.getDeletionProtectionEnabled() == null ^ this.getDeletionProtectionEnabled() == null)
            return false;
        if (other.getDeletionProtectionEnabled() != null && other.getDeletionProtectionEnabled().equals(this.getDeletionProtectionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectConfigurationArn() == null) ? 0 : getProtectConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAccountDefault() == null) ? 0 : getAccountDefault().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProtectConfigurationResult clone() {
        try {
            return (UpdateProtectConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
