/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An individual VPC security group and its status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/SecurityGroupMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for this security group.
     * </p>
     */
    private String securityGroupIdentifier;
    /**
     * <p>
     * The status of this security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID for this security group.
     * </p>
     * 
     * @param securityGroupIdentifier
     *        The unique ID for this security group.
     */

    public void setSecurityGroupIdentifier(String securityGroupIdentifier) {
        this.securityGroupIdentifier = securityGroupIdentifier;
    }

    /**
     * <p>
     * The unique ID for this security group.
     * </p>
     * 
     * @return The unique ID for this security group.
     */

    public String getSecurityGroupIdentifier() {
        return this.securityGroupIdentifier;
    }

    /**
     * <p>
     * The unique ID for this security group.
     * </p>
     * 
     * @param securityGroupIdentifier
     *        The unique ID for this security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupMembership withSecurityGroupIdentifier(String securityGroupIdentifier) {
        setSecurityGroupIdentifier(securityGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of this security group.
     * </p>
     * 
     * @param status
     *        The status of this security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this security group.
     * </p>
     * 
     * @return The status of this security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this security group.
     * </p>
     * 
     * @param status
     *        The status of this security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getSecurityGroupIdentifier() != null)
            sb.append("SecurityGroupIdentifier: ").append(getSecurityGroupIdentifier()).append(",");
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

        if (obj instanceof SecurityGroupMembership == false)
            return false;
        SecurityGroupMembership other = (SecurityGroupMembership) obj;
        if (other.getSecurityGroupIdentifier() == null ^ this.getSecurityGroupIdentifier() == null)
            return false;
        if (other.getSecurityGroupIdentifier() != null && other.getSecurityGroupIdentifier().equals(this.getSecurityGroupIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getSecurityGroupIdentifier() == null) ? 0 : getSecurityGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupMembership clone() {
        try {
            return (SecurityGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.SecurityGroupMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
