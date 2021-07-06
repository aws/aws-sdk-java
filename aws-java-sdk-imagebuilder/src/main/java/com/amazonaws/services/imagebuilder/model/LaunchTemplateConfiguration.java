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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies an Amazon EC2 launch template to use for a specific account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LaunchTemplateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the Amazon EC2 launch template to use.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The account ID that this configuration applies to.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * </p>
     */
    private Boolean setDefaultVersion;

    /**
     * <p>
     * Identifies the Amazon EC2 launch template to use.
     * </p>
     * 
     * @param launchTemplateId
     *        Identifies the Amazon EC2 launch template to use.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * Identifies the Amazon EC2 launch template to use.
     * </p>
     * 
     * @return Identifies the Amazon EC2 launch template to use.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * Identifies the Amazon EC2 launch template to use.
     * </p>
     * 
     * @param launchTemplateId
     *        Identifies the Amazon EC2 launch template to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateConfiguration withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The account ID that this configuration applies to.
     * </p>
     * 
     * @param accountId
     *        The account ID that this configuration applies to.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that this configuration applies to.
     * </p>
     * 
     * @return The account ID that this configuration applies to.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID that this configuration applies to.
     * </p>
     * 
     * @param accountId
     *        The account ID that this configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateConfiguration withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * </p>
     * 
     * @param setDefaultVersion
     *        Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     */

    public void setSetDefaultVersion(Boolean setDefaultVersion) {
        this.setDefaultVersion = setDefaultVersion;
    }

    /**
     * <p>
     * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * </p>
     * 
     * @return Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     */

    public Boolean getSetDefaultVersion() {
        return this.setDefaultVersion;
    }

    /**
     * <p>
     * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * </p>
     * 
     * @param setDefaultVersion
     *        Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateConfiguration withSetDefaultVersion(Boolean setDefaultVersion) {
        setSetDefaultVersion(setDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     * </p>
     * 
     * @return Set the specified Amazon EC2 launch template as the default launch template for the specified account.
     */

    public Boolean isSetDefaultVersion() {
        return this.setDefaultVersion;
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getSetDefaultVersion() != null)
            sb.append("SetDefaultVersion: ").append(getSetDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateConfiguration == false)
            return false;
        LaunchTemplateConfiguration other = (LaunchTemplateConfiguration) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSetDefaultVersion() == null ^ this.getSetDefaultVersion() == null)
            return false;
        if (other.getSetDefaultVersion() != null && other.getSetDefaultVersion().equals(this.getSetDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSetDefaultVersion() == null) ? 0 : getSetDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateConfiguration clone() {
        try {
            return (LaunchTemplateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LaunchTemplateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
