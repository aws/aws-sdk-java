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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of IAM policy.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The date and time that the service was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
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
     * The ID of the service.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the service was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the service.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @return The type of IAM policy.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public GetServiceResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public GetServiceResult withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the service was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the service was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the service was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the service was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public GetServiceResult withCustomDomainName(String customDomainName) {
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

    public GetServiceResult withDnsEntry(DnsEntry dnsEntry) {
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

    public GetServiceResult withFailureCode(String failureCode) {
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

    public GetServiceResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param id
     *        The ID of the service.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param id
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the service was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the service was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the service was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the service was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the service was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the service was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @see ServiceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @return The status of the service.
     * @see ServiceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public GetServiceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public GetServiceResult withStatus(ServiceStatus status) {
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
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

        if (obj instanceof GetServiceResult == false)
            return false;
        GetServiceResult other = (GetServiceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getDnsEntry() == null) ? 0 : getDnsEntry().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceResult clone() {
        try {
            return (GetServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
