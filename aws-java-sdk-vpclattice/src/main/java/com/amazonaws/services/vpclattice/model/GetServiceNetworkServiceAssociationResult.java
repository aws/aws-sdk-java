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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkServiceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceNetworkServiceAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * The custom domain name of the service.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The DNS name of the service.
     * </p>
     */
    private DnsEntry dnsEntry;
    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The failure message.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The ID of the service network and service association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String serviceName;
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
     * The status of the association.
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

    public GetServiceNetworkServiceAssociationResult withArn(String arn) {
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

    public GetServiceNetworkServiceAssociationResult withCreatedAt(java.util.Date createdAt) {
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

    public GetServiceNetworkServiceAssociationResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name of the service.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @return The custom domain name of the service.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The DNS name of the service.
     * </p>
     * 
     * @param dnsEntry
     *        The DNS name of the service.
     */

    public void setDnsEntry(DnsEntry dnsEntry) {
        this.dnsEntry = dnsEntry;
    }

    /**
     * <p>
     * The DNS name of the service.
     * </p>
     * 
     * @return The DNS name of the service.
     */

    public DnsEntry getDnsEntry() {
        return this.dnsEntry;
    }

    /**
     * <p>
     * The DNS name of the service.
     * </p>
     * 
     * @param dnsEntry
     *        The DNS name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withDnsEntry(DnsEntry dnsEntry) {
        setDnsEntry(dnsEntry);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @return The failure message.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the service network and service association.
     * </p>
     * 
     * @param id
     *        The ID of the service network and service association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service network and service association.
     * </p>
     * 
     * @return The ID of the service network and service association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service network and service association.
     * </p>
     * 
     * @param id
     *        The ID of the service network and service association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkServiceAssociationResult withServiceName(String serviceName) {
        setServiceName(serviceName);
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

    public GetServiceNetworkServiceAssociationResult withServiceNetworkArn(String serviceNetworkArn) {
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

    public GetServiceNetworkServiceAssociationResult withServiceNetworkId(String serviceNetworkId) {
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

    public GetServiceNetworkServiceAssociationResult withServiceNetworkName(String serviceNetworkName) {
        setServiceNetworkName(serviceNetworkName);
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @see ServiceNetworkServiceAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @return The status of the association.
     * @see ServiceNetworkServiceAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkServiceAssociationStatus
     */

    public GetServiceNetworkServiceAssociationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNetworkServiceAssociationStatus
     */

    public GetServiceNetworkServiceAssociationResult withStatus(ServiceNetworkServiceAssociationStatus status) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getDnsEntry() != null)
            sb.append("DnsEntry: ").append(getDnsEntry()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceNetworkArn() != null)
            sb.append("ServiceNetworkArn: ").append(getServiceNetworkArn()).append(",");
        if (getServiceNetworkId() != null)
            sb.append("ServiceNetworkId: ").append(getServiceNetworkId()).append(",");
        if (getServiceNetworkName() != null)
            sb.append("ServiceNetworkName: ").append(getServiceNetworkName()).append(",");
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

        if (obj instanceof GetServiceNetworkServiceAssociationResult == false)
            return false;
        GetServiceNetworkServiceAssociationResult other = (GetServiceNetworkServiceAssociationResult) obj;
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
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getDnsEntry() == null ^ this.getDnsEntry() == null)
            return false;
        if (other.getDnsEntry() != null && other.getDnsEntry().equals(this.getDnsEntry()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getDnsEntry() == null) ? 0 : getDnsEntry().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkArn() == null) ? 0 : getServiceNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkId() == null) ? 0 : getServiceNetworkId().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkName() == null) ? 0 : getServiceNetworkName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceNetworkServiceAssociationResult clone() {
        try {
            return (GetServiceNetworkServiceAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
