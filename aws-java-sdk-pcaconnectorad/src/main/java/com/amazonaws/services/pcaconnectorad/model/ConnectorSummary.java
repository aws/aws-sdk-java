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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary description of the Amazon Web Services Private CA AD connectors belonging to an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ConnectorSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     * </p>
     */
    private String certificateEnrollmentPolicyServerEndpoint;
    /**
     * <p>
     * The date and time that the connector was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Status of the connector. Status can be creating, active, deleting, or failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the connector status if the status is failed.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The date and time that the connector was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Information of the VPC and security group(s) used with the connector.
     * </p>
     */
    private VpcInformation vpcInformation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *         >CreateConnector</a>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority being used.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate authority being used.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     * </p>
     * 
     * @param certificateEnrollmentPolicyServerEndpoint
     *        Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     */

    public void setCertificateEnrollmentPolicyServerEndpoint(String certificateEnrollmentPolicyServerEndpoint) {
        this.certificateEnrollmentPolicyServerEndpoint = certificateEnrollmentPolicyServerEndpoint;
    }

    /**
     * <p>
     * Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     * </p>
     * 
     * @return Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     */

    public String getCertificateEnrollmentPolicyServerEndpoint() {
        return this.certificateEnrollmentPolicyServerEndpoint;
    }

    /**
     * <p>
     * Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     * </p>
     * 
     * @param certificateEnrollmentPolicyServerEndpoint
     *        Certificate enrollment endpoint for Active Directory domain-joined objects to request certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCertificateEnrollmentPolicyServerEndpoint(String certificateEnrollmentPolicyServerEndpoint) {
        setCertificateEnrollmentPolicyServerEndpoint(certificateEnrollmentPolicyServerEndpoint);
        return this;
    }

    /**
     * <p>
     * The date and time that the connector was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the connector was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the connector was created.
     * </p>
     * 
     * @return The date and time that the connector was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the connector was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the connector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @return The identifier of the Active Directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Status of the connector. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the connector. Status can be creating, active, deleting, or failed.
     * @see ConnectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the connector. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @return Status of the connector. Status can be creating, active, deleting, or failed.
     * @see ConnectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the connector. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the connector. Status can be creating, active, deleting, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public ConnectorSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the connector. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the connector. Status can be creating, active, deleting, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public ConnectorSummary withStatus(ConnectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the connector status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the connector status if the status is failed.
     * @see ConnectorStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional information about the connector status if the status is failed.
     * </p>
     * 
     * @return Additional information about the connector status if the status is failed.
     * @see ConnectorStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional information about the connector status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the connector status if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatusReason
     */

    public ConnectorSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Additional information about the connector status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the connector status if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatusReason
     */

    public ConnectorSummary withStatusReason(ConnectorStatusReason statusReason) {
        this.statusReason = statusReason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the connector was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the connector was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the connector was updated.
     * </p>
     * 
     * @return The date and time that the connector was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the connector was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the connector was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Information of the VPC and security group(s) used with the connector.
     * </p>
     * 
     * @param vpcInformation
     *        Information of the VPC and security group(s) used with the connector.
     */

    public void setVpcInformation(VpcInformation vpcInformation) {
        this.vpcInformation = vpcInformation;
    }

    /**
     * <p>
     * Information of the VPC and security group(s) used with the connector.
     * </p>
     * 
     * @return Information of the VPC and security group(s) used with the connector.
     */

    public VpcInformation getVpcInformation() {
        return this.vpcInformation;
    }

    /**
     * <p>
     * Information of the VPC and security group(s) used with the connector.
     * </p>
     * 
     * @param vpcInformation
     *        Information of the VPC and security group(s) used with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withVpcInformation(VpcInformation vpcInformation) {
        setVpcInformation(vpcInformation);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCertificateEnrollmentPolicyServerEndpoint() != null)
            sb.append("CertificateEnrollmentPolicyServerEndpoint: ").append(getCertificateEnrollmentPolicyServerEndpoint()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVpcInformation() != null)
            sb.append("VpcInformation: ").append(getVpcInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorSummary == false)
            return false;
        ConnectorSummary other = (ConnectorSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCertificateEnrollmentPolicyServerEndpoint() == null ^ this.getCertificateEnrollmentPolicyServerEndpoint() == null)
            return false;
        if (other.getCertificateEnrollmentPolicyServerEndpoint() != null
                && other.getCertificateEnrollmentPolicyServerEndpoint().equals(this.getCertificateEnrollmentPolicyServerEndpoint()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getVpcInformation() == null ^ this.getVpcInformation() == null)
            return false;
        if (other.getVpcInformation() != null && other.getVpcInformation().equals(this.getVpcInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateEnrollmentPolicyServerEndpoint() == null) ? 0 : getCertificateEnrollmentPolicyServerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVpcInformation() == null) ? 0 : getVpcInformation().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorSummary clone() {
        try {
            return (ConnectorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ConnectorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
