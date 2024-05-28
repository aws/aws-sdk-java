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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the additional configuration for the member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/MemberAdditionalConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberAdditionalConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the name of the additional configuration that is set for the member account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the status of the additional configuration that is set for the member account.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * Indicates the name of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param name
     *        Indicates the name of the additional configuration that is set for the member account.
     * @see OrgFeatureAdditionalConfiguration
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Indicates the name of the additional configuration that is set for the member account.
     * </p>
     * 
     * @return Indicates the name of the additional configuration that is set for the member account.
     * @see OrgFeatureAdditionalConfiguration
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Indicates the name of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param name
     *        Indicates the name of the additional configuration that is set for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public MemberAdditionalConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the name of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param name
     *        Indicates the name of the additional configuration that is set for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public MemberAdditionalConfigurationResult withName(OrgFeatureAdditionalConfiguration name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the status of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param status
     *        Indicates the status of the additional configuration that is set for the member account.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the additional configuration that is set for the member account.
     * </p>
     * 
     * @return Indicates the status of the additional configuration that is set for the member account.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param status
     *        Indicates the status of the additional configuration that is set for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public MemberAdditionalConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the additional configuration that is set for the member account.
     * </p>
     * 
     * @param status
     *        Indicates the status of the additional configuration that is set for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public MemberAdditionalConfigurationResult withStatus(FeatureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     * </p>
     * 
     * @return The timestamp at which the additional configuration was set for the member account. This is in UTC
     *         format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the additional configuration was set for the member account. This is in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAdditionalConfigurationResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberAdditionalConfigurationResult == false)
            return false;
        MemberAdditionalConfigurationResult other = (MemberAdditionalConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public MemberAdditionalConfigurationResult clone() {
        try {
            return (MemberAdditionalConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MemberAdditionalConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
