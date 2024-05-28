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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an association between a service network and a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ServiceNetworkVpcAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNetworkVpcAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the association was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
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
     * The date and time that the association was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     */
    private String serviceNetworkArn;
    /**
     * <p>
     * The ID of the service network.
     * </p>
     */
    private String serviceNetworkId;
    /**
     * <p>
     * The name of the service network.
     * </p>
     */
    private String serviceNetworkName;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

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

    public ServiceNetworkVpcAssociationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the association was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the association was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the association was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the association was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the association was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the association was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public ServiceNetworkVpcAssociationSummary withCreatedBy(String createdBy) {
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

    public ServiceNetworkVpcAssociationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the association was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the association was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the association was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the association was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the association was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the association was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkArn
     *        The Amazon Resource Name (ARN) of the service network.
     */

    public void setServiceNetworkArn(String serviceNetworkArn) {
        this.serviceNetworkArn = serviceNetworkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service network.
     */

    public String getServiceNetworkArn() {
        return this.serviceNetworkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkArn
     *        The Amazon Resource Name (ARN) of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withServiceNetworkArn(String serviceNetworkArn) {
        setServiceNetworkArn(serviceNetworkArn);
        return this;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param serviceNetworkId
     *        The ID of the service network.
     */

    public void setServiceNetworkId(String serviceNetworkId) {
        this.serviceNetworkId = serviceNetworkId;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @return The ID of the service network.
     */

    public String getServiceNetworkId() {
        return this.serviceNetworkId;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param serviceNetworkId
     *        The ID of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withServiceNetworkId(String serviceNetworkId) {
        setServiceNetworkId(serviceNetworkId);
        return this;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param serviceNetworkName
     *        The name of the service network.
     */

    public void setServiceNetworkName(String serviceNetworkName) {
        this.serviceNetworkName = serviceNetworkName;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @return The name of the service network.
     */

    public String getServiceNetworkName() {
        return this.serviceNetworkName;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param serviceNetworkName
     *        The name of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withServiceNetworkName(String serviceNetworkName) {
        setServiceNetworkName(serviceNetworkName);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public ServiceNetworkVpcAssociationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkVpcAssociationStatus
     */

    public ServiceNetworkVpcAssociationSummary withStatus(ServiceNetworkVpcAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNetworkVpcAssociationSummary withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getServiceNetworkArn() != null)
            sb.append("ServiceNetworkArn: ").append(getServiceNetworkArn()).append(",");
        if (getServiceNetworkId() != null)
            sb.append("ServiceNetworkId: ").append(getServiceNetworkId()).append(",");
        if (getServiceNetworkName() != null)
            sb.append("ServiceNetworkName: ").append(getServiceNetworkName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNetworkVpcAssociationSummary == false)
            return false;
        ServiceNetworkVpcAssociationSummary other = (ServiceNetworkVpcAssociationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getServiceNetworkArn() == null ^ this.getServiceNetworkArn() == null)
            return false;
        if (other.getServiceNetworkArn() != null && other.getServiceNetworkArn().equals(this.getServiceNetworkArn()) == false)
            return false;
        if (other.getServiceNetworkId() == null ^ this.getServiceNetworkId() == null)
            return false;
        if (other.getServiceNetworkId() != null && other.getServiceNetworkId().equals(this.getServiceNetworkId()) == false)
            return false;
        if (other.getServiceNetworkName() == null ^ this.getServiceNetworkName() == null)
            return false;
        if (other.getServiceNetworkName() != null && other.getServiceNetworkName().equals(this.getServiceNetworkName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkArn() == null) ? 0 : getServiceNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkId() == null) ? 0 : getServiceNetworkId().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkName() == null) ? 0 : getServiceNetworkName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public ServiceNetworkVpcAssociationSummary clone() {
        try {
            return (ServiceNetworkVpcAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.ServiceNetworkVpcAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
