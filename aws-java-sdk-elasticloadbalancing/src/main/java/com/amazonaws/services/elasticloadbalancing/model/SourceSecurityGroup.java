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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a source security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SourceSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The owner of the security group.
     * </p>
     */
    private String ownerAlias;
    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The owner of the security group.
     * </p>
     * 
     * @param ownerAlias
     *        The owner of the security group.
     */

    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The owner of the security group.
     * </p>
     * 
     * @return The owner of the security group.
     */

    public String getOwnerAlias() {
        return this.ownerAlias;
    }

    /**
     * <p>
     * The owner of the security group.
     * </p>
     * 
     * @param ownerAlias
     *        The owner of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSecurityGroup withOwnerAlias(String ownerAlias) {
        setOwnerAlias(ownerAlias);
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @return The name of the security group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSecurityGroup withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: ").append(getOwnerAlias()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceSecurityGroup == false)
            return false;
        SourceSecurityGroup other = (SourceSecurityGroup) obj;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public SourceSecurityGroup clone() {
        try {
            return (SourceSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
