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
 * The service principal name that the connector uses to authenticate with Active Directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ServicePrincipalNameSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServicePrincipalNameSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The date and time that the service principal name was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     */
    private String directoryRegistrationArn;
    /**
     * <p>
     * The status of a service principal name.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information for the status of a service principal name if the status is failed.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Time when the service principal name was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
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

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePrincipalNameSummary withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the service principal name was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service principal name was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the service principal name was created.
     * </p>
     * 
     * @return The date and time that the service principal name was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the service principal name was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service principal name was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePrincipalNameSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param directoryRegistrationArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     */

    public void setDirectoryRegistrationArn(String directoryRegistrationArn) {
        this.directoryRegistrationArn = directoryRegistrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *         >CreateDirectoryRegistration</a>.
     */

    public String getDirectoryRegistrationArn() {
        return this.directoryRegistrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param directoryRegistrationArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePrincipalNameSummary withDirectoryRegistrationArn(String directoryRegistrationArn) {
        setDirectoryRegistrationArn(directoryRegistrationArn);
        return this;
    }

    /**
     * <p>
     * The status of a service principal name.
     * </p>
     * 
     * @param status
     *        The status of a service principal name.
     * @see ServicePrincipalNameStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a service principal name.
     * </p>
     * 
     * @return The status of a service principal name.
     * @see ServicePrincipalNameStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a service principal name.
     * </p>
     * 
     * @param status
     *        The status of a service principal name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServicePrincipalNameStatus
     */

    public ServicePrincipalNameSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a service principal name.
     * </p>
     * 
     * @param status
     *        The status of a service principal name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServicePrincipalNameStatus
     */

    public ServicePrincipalNameSummary withStatus(ServicePrincipalNameStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information for the status of a service principal name if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information for the status of a service principal name if the status is failed.
     * @see ServicePrincipalNameStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional information for the status of a service principal name if the status is failed.
     * </p>
     * 
     * @return Additional information for the status of a service principal name if the status is failed.
     * @see ServicePrincipalNameStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional information for the status of a service principal name if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information for the status of a service principal name if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServicePrincipalNameStatusReason
     */

    public ServicePrincipalNameSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Additional information for the status of a service principal name if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information for the status of a service principal name if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServicePrincipalNameStatusReason
     */

    public ServicePrincipalNameSummary withStatusReason(ServicePrincipalNameStatusReason statusReason) {
        this.statusReason = statusReason.toString();
        return this;
    }

    /**
     * <p>
     * Time when the service principal name was updated.
     * </p>
     * 
     * @param updatedAt
     *        Time when the service principal name was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Time when the service principal name was updated.
     * </p>
     * 
     * @return Time when the service principal name was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Time when the service principal name was updated.
     * </p>
     * 
     * @param updatedAt
     *        Time when the service principal name was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePrincipalNameSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDirectoryRegistrationArn() != null)
            sb.append("DirectoryRegistrationArn: ").append(getDirectoryRegistrationArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServicePrincipalNameSummary == false)
            return false;
        ServicePrincipalNameSummary other = (ServicePrincipalNameSummary) obj;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDirectoryRegistrationArn() == null ^ this.getDirectoryRegistrationArn() == null)
            return false;
        if (other.getDirectoryRegistrationArn() != null && other.getDirectoryRegistrationArn().equals(this.getDirectoryRegistrationArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDirectoryRegistrationArn() == null) ? 0 : getDirectoryRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ServicePrincipalNameSummary clone() {
        try {
            return (ServicePrincipalNameSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ServicePrincipalNameSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
