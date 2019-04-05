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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information about the instance association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstanceAssociationStatusInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAssociationStatusInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The association ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The name of the association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The association document verions.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     */
    private String associationVersion;
    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The date the instance association ran.
     * </p>
     */
    private java.util.Date executionDate;
    /**
     * <p>
     * Status information about the instance association.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     */
    private String detailedStatus;
    /**
     * <p>
     * Summary information about association execution.
     * </p>
     */
    private String executionSummary;
    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     */
    private InstanceAssociationOutputUrl outputUrl;
    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     */
    private String associationName;

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @return The association ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @param name
     *        The name of the association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @return The name of the association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @param name
     *        The name of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The association document verions.
     * </p>
     * 
     * @param documentVersion
     *        The association document verions.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The association document verions.
     * </p>
     * 
     * @return The association document verions.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The association document verions.
     * </p>
     * 
     * @param documentVersion
     *        The association document verions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * 
     * @param associationVersion
     *        The version of the association applied to the instance.
     */

    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * 
     * @return The version of the association applied to the instance.
     */

    public String getAssociationVersion() {
        return this.associationVersion;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * 
     * @param associationVersion
     *        The version of the association applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
        return this;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * 
     * @param instanceId
     *        The instance ID where the association was created.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * 
     * @return The instance ID where the association was created.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * 
     * @param instanceId
     *        The instance ID where the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     * 
     * @param executionDate
     *        The date the instance association ran.
     */

    public void setExecutionDate(java.util.Date executionDate) {
        this.executionDate = executionDate;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     * 
     * @return The date the instance association ran.
     */

    public java.util.Date getExecutionDate() {
        return this.executionDate;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     * 
     * @param executionDate
     *        The date the instance association ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withExecutionDate(java.util.Date executionDate) {
        setExecutionDate(executionDate);
        return this;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     * 
     * @param status
     *        Status information about the instance association.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     * 
     * @return Status information about the instance association.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     * 
     * @param status
     *        Status information about the instance association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the instance association.
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     * 
     * @return Detailed status information about the instance association.
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the instance association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
        return this;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * 
     * @param executionSummary
     *        Summary information about association execution.
     */

    public void setExecutionSummary(String executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * 
     * @return Summary information about association execution.
     */

    public String getExecutionSummary() {
        return this.executionSummary;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * 
     * @param executionSummary
     *        Summary information about association execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withExecutionSummary(String executionSummary) {
        setExecutionSummary(executionSummary);
        return this;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * 
     * @param errorCode
     *        An error code returned by the request to create the association.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * 
     * @return An error code returned by the request to create the association.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * 
     * @param errorCode
     *        An error code returned by the request to create the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputUrl
     *        A URL for an Amazon S3 bucket where you want to store the results of this request.
     */

    public void setOutputUrl(InstanceAssociationOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @return A URL for an Amazon S3 bucket where you want to store the results of this request.
     */

    public InstanceAssociationOutputUrl getOutputUrl() {
        return this.outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputUrl
     *        A URL for an Amazon S3 bucket where you want to store the results of this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withOutputUrl(InstanceAssociationOutputUrl outputUrl) {
        setOutputUrl(outputUrl);
        return this;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * 
     * @param associationName
     *        The name of the association applied to the instance.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * 
     * @return The name of the association applied to the instance.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * 
     * @param associationName
     *        The name of the association applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationStatusInfo withAssociationName(String associationName) {
        setAssociationName(associationName);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getExecutionDate() != null)
            sb.append("ExecutionDate: ").append(getExecutionDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus()).append(",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: ").append(getExecutionSummary()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getOutputUrl() != null)
            sb.append("OutputUrl: ").append(getOutputUrl()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAssociationStatusInfo == false)
            return false;
        InstanceAssociationStatusInfo other = (InstanceAssociationStatusInfo) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getExecutionDate() == null ^ this.getExecutionDate() == null)
            return false;
        if (other.getExecutionDate() != null && other.getExecutionDate().equals(this.getExecutionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getExecutionDate() == null) ? 0 : getExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAssociationStatusInfo clone() {
        try {
            return (InstanceAssociationStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstanceAssociationStatusInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
