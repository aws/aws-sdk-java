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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/MemberAdditionalConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberAdditionalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the additional configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Status of the additional configuration.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Name of the additional configuration.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration.
     * @see OrgFeatureAdditionalConfiguration
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the additional configuration.
     * </p>
     * 
     * @return Name of the additional configuration.
     * @see OrgFeatureAdditionalConfiguration
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the additional configuration.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public MemberAdditionalConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the additional configuration.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public MemberAdditionalConfiguration withName(OrgFeatureAdditionalConfiguration name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Status of the additional configuration.
     * </p>
     * 
     * @param status
     *        Status of the additional configuration.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the additional configuration.
     * </p>
     * 
     * @return Status of the additional configuration.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the additional configuration.
     * </p>
     * 
     * @param status
     *        Status of the additional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public MemberAdditionalConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the additional configuration.
     * </p>
     * 
     * @param status
     *        Status of the additional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public MemberAdditionalConfiguration withStatus(FeatureStatus status) {
        this.status = status.toString();
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberAdditionalConfiguration == false)
            return false;
        MemberAdditionalConfiguration other = (MemberAdditionalConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MemberAdditionalConfiguration clone() {
        try {
            return (MemberAdditionalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MemberAdditionalConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
