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
 * Represents the output of one of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AuthorizeCacheSecurityGroupIngress</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateCacheSecurityGroup</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RevokeCacheSecurityGroupIngress</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The name of the cache security group.
     * </p>
     */
    private String cacheSecurityGroupName;
    /**
     * <p>
     * The description of the cache security group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the cache security group owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     * 
     * @return The AWS account ID of the cache security group owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the cache security group owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSecurityGroup withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        The name of the cache security group.
     */

    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     * 
     * @return The name of the cache security group.
     */

    public String getCacheSecurityGroupName() {
        return this.cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        The name of the cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSecurityGroup withCacheSecurityGroupName(String cacheSecurityGroupName) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     * 
     * @param description
     *        The description of the cache security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     * 
     * @return The description of the cache security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     * 
     * @param description
     *        The description of the cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSecurityGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache security group.
     * </p>
     * 
     * @return A list of Amazon EC2 security groups that are associated with this cache security group.
     */

    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
            eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>();
        }
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache security group.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of Amazon EC2 security groups that are associated with this cache security group.
     */

    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2SecurityGroups(java.util.Collection)} or {@link #withEC2SecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of Amazon EC2 security groups that are associated with this cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (this.eC2SecurityGroups == null) {
            setEC2SecurityGroups(new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups.length));
        }
        for (EC2SecurityGroup ele : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache security group.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of Amazon EC2 security groups that are associated with this cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: ").append(getCacheSecurityGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: ").append(getEC2SecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSecurityGroup == false)
            return false;
        CacheSecurityGroup other = (CacheSecurityGroup) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public CacheSecurityGroup clone() {
        try {
            return (CacheSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
