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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceNetworkVpcAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The account that created the association.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The association status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The account that created the association.
     * </p>
     * 
     * @param createdBy
     *        The account that created the association.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The account that created the association.
     * </p>
     * 
     * @return The account that created the association.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The account that created the association.
     * </p>
     * 
     * @param createdBy
     *        The account that created the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param id
     *        The ID of the association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param id
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @return The IDs of the security groups.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationResult withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param status
     *        The association status.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @return The association status.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param status
     *        The association status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public CreateServiceNetworkVpcAssociationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param status
     *        The association status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public CreateServiceNetworkVpcAssociationResult withStatus(ServiceNetworkVpcAssociationStatus status) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
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

        if (obj instanceof CreateServiceNetworkVpcAssociationResult == false)
            return false;
        CreateServiceNetworkVpcAssociationResult other = (CreateServiceNetworkVpcAssociationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceNetworkVpcAssociationResult clone() {
        try {
            return (CreateServiceNetworkVpcAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
