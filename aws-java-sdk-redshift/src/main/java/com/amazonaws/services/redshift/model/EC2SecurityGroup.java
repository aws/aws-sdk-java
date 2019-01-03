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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an Amazon EC2 security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EC2SecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2SecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the EC2 security group.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the EC2 Security Group.
     * </p>
     */
    private String eC2SecurityGroupName;
    /**
     * <p>
     * The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code> field.
     * </p>
     */
    private String eC2SecurityGroupOwnerId;
    /**
     * <p>
     * The list of tags for the EC2 security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The status of the EC2 security group.
     * </p>
     * 
     * @param status
     *        The status of the EC2 security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the EC2 security group.
     * </p>
     * 
     * @return The status of the EC2 security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the EC2 security group.
     * </p>
     * 
     * @param status
     *        The status of the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2SecurityGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The name of the EC2 Security Group.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the EC2 Security Group.
     */

    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the EC2 Security Group.
     * </p>
     * 
     * @return The name of the EC2 Security Group.
     */

    public String getEC2SecurityGroupName() {
        return this.eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the EC2 Security Group.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the EC2 Security Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        setEC2SecurityGroupName(eC2SecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code> field.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     *        field.
     */

    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code> field.
     * </p>
     * 
     * @return The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     *         field.
     */

    public String getEC2SecurityGroupOwnerId() {
        return this.eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code> field.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS ID of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2SecurityGroup withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        setEC2SecurityGroupOwnerId(eC2SecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * The list of tags for the EC2 security group.
     * </p>
     * 
     * @return The list of tags for the EC2 security group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the EC2 security group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the EC2 security group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the EC2 security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2SecurityGroup withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the EC2 security group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2SecurityGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEC2SecurityGroupName() != null)
            sb.append("EC2SecurityGroupName: ").append(getEC2SecurityGroupName()).append(",");
        if (getEC2SecurityGroupOwnerId() != null)
            sb.append("EC2SecurityGroupOwnerId: ").append(getEC2SecurityGroupOwnerId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2SecurityGroup == false)
            return false;
        EC2SecurityGroup other = (EC2SecurityGroup) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null)
            return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EC2SecurityGroup clone() {
        try {
            return (EC2SecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
