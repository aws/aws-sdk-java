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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a single cache security group and its status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/SecurityGroupMembership"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupMembership implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cache security group.
     * </p>
     */
    private String securityGroupId;
    /**
     * <p>
     * The status of the cache security group membership. The status changes whenever a cache security group is
     * modified, or when the cache security groups assigned to a cluster are modified.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of the cache security group.
     * </p>
     * 
     * @param securityGroupId
     *        The identifier of the cache security group.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * The identifier of the cache security group.
     * </p>
     * 
     * @return The identifier of the cache security group.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * The identifier of the cache security group.
     * </p>
     * 
     * @param securityGroupId
     *        The identifier of the cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupMembership withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
        return this;
    }

    /**
     * <p>
     * The status of the cache security group membership. The status changes whenever a cache security group is
     * modified, or when the cache security groups assigned to a cluster are modified.
     * </p>
     * 
     * @param status
     *        The status of the cache security group membership. The status changes whenever a cache security group is
     *        modified, or when the cache security groups assigned to a cluster are modified.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the cache security group membership. The status changes whenever a cache security group is
     * modified, or when the cache security groups assigned to a cluster are modified.
     * </p>
     * 
     * @return The status of the cache security group membership. The status changes whenever a cache security group is
     *         modified, or when the cache security groups assigned to a cluster are modified.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the cache security group membership. The status changes whenever a cache security group is
     * modified, or when the cache security groups assigned to a cluster are modified.
     * </p>
     * 
     * @param status
     *        The status of the cache security group membership. The status changes whenever a cache security group is
     *        modified, or when the cache security groups assigned to a cluster are modified.
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
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId()).append(",");
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
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
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

        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
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

}
