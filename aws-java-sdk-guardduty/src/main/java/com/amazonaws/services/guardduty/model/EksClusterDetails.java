/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details about the EKS cluster involved in a Kubernetes finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EksClusterDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EKS cluster name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * EKS cluster ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The VPC ID to which the EKS cluster is attached.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The EKS cluster status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The EKS cluster tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The timestamp when the EKS cluster was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * EKS cluster name.
     * </p>
     * 
     * @param name
     *        EKS cluster name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * EKS cluster name.
     * </p>
     * 
     * @return EKS cluster name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * EKS cluster name.
     * </p>
     * 
     * @param name
     *        EKS cluster name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * EKS cluster ARN.
     * </p>
     * 
     * @param arn
     *        EKS cluster ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * EKS cluster ARN.
     * </p>
     * 
     * @return EKS cluster ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * EKS cluster ARN.
     * </p>
     * 
     * @param arn
     *        EKS cluster ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The VPC ID to which the EKS cluster is attached.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID to which the EKS cluster is attached.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID to which the EKS cluster is attached.
     * </p>
     * 
     * @return The VPC ID to which the EKS cluster is attached.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID to which the EKS cluster is attached.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID to which the EKS cluster is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The EKS cluster status.
     * </p>
     * 
     * @param status
     *        The EKS cluster status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The EKS cluster status.
     * </p>
     * 
     * @return The EKS cluster status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The EKS cluster status.
     * </p>
     * 
     * @param status
     *        The EKS cluster status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The EKS cluster tags.
     * </p>
     * 
     * @return The EKS cluster tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The EKS cluster tags.
     * </p>
     * 
     * @param tags
     *        The EKS cluster tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The EKS cluster tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The EKS cluster tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EKS cluster tags.
     * </p>
     * 
     * @param tags
     *        The EKS cluster tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The timestamp when the EKS cluster was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the EKS cluster was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the EKS cluster was created.
     * </p>
     * 
     * @return The timestamp when the EKS cluster was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the EKS cluster was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the EKS cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksClusterDetails withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksClusterDetails == false)
            return false;
        EksClusterDetails other = (EksClusterDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EksClusterDetails clone() {
        try {
            return (EksClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EksClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
