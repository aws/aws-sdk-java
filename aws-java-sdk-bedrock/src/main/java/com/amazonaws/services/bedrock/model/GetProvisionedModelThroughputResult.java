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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProvisionedModelThroughputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The number of model units allocated to this Provisioned Throughput.
     * </p>
     */
    private Integer modelUnits;
    /**
     * <p>
     * The number of model units that was requested for this Provisioned Throughput.
     * </p>
     */
    private Integer desiredModelUnits;
    /**
     * <p>
     * The name of the Provisioned Throughput.
     * </p>
     */
    private String provisionedModelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Provisioned Throughput.
     * </p>
     */
    private String provisionedModelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput. This value
     * differs from the <code>modelArn</code> if updating hasn't completed.
     * </p>
     */
    private String desiredModelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of the base
     * model that the custom model for which the Provisioned Throughput was created was customized.
     * </p>
     */
    private String foundationModelArn;
    /**
     * <p>
     * The status of the Provisioned Throughput.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of the creation time for this Provisioned Throughput.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of the last time that this Provisioned Throughput was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     * Throughput.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Commitment duration of the Provisioned Throughput.
     * </p>
     */
    private String commitmentDuration;
    /**
     * <p>
     * The timestamp for when the commitment term for the Provisioned Throughput expires.
     * </p>
     */
    private java.util.Date commitmentExpirationTime;

    /**
     * <p>
     * The number of model units allocated to this Provisioned Throughput.
     * </p>
     * 
     * @param modelUnits
     *        The number of model units allocated to this Provisioned Throughput.
     */

    public void setModelUnits(Integer modelUnits) {
        this.modelUnits = modelUnits;
    }

    /**
     * <p>
     * The number of model units allocated to this Provisioned Throughput.
     * </p>
     * 
     * @return The number of model units allocated to this Provisioned Throughput.
     */

    public Integer getModelUnits() {
        return this.modelUnits;
    }

    /**
     * <p>
     * The number of model units allocated to this Provisioned Throughput.
     * </p>
     * 
     * @param modelUnits
     *        The number of model units allocated to this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withModelUnits(Integer modelUnits) {
        setModelUnits(modelUnits);
        return this;
    }

    /**
     * <p>
     * The number of model units that was requested for this Provisioned Throughput.
     * </p>
     * 
     * @param desiredModelUnits
     *        The number of model units that was requested for this Provisioned Throughput.
     */

    public void setDesiredModelUnits(Integer desiredModelUnits) {
        this.desiredModelUnits = desiredModelUnits;
    }

    /**
     * <p>
     * The number of model units that was requested for this Provisioned Throughput.
     * </p>
     * 
     * @return The number of model units that was requested for this Provisioned Throughput.
     */

    public Integer getDesiredModelUnits() {
        return this.desiredModelUnits;
    }

    /**
     * <p>
     * The number of model units that was requested for this Provisioned Throughput.
     * </p>
     * 
     * @param desiredModelUnits
     *        The number of model units that was requested for this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withDesiredModelUnits(Integer desiredModelUnits) {
        setDesiredModelUnits(desiredModelUnits);
        return this;
    }

    /**
     * <p>
     * The name of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name of the Provisioned Throughput.
     */

    public void setProvisionedModelName(String provisionedModelName) {
        this.provisionedModelName = provisionedModelName;
    }

    /**
     * <p>
     * The name of the Provisioned Throughput.
     * </p>
     * 
     * @return The name of the Provisioned Throughput.
     */

    public String getProvisionedModelName() {
        return this.provisionedModelName;
    }

    /**
     * <p>
     * The name of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withProvisionedModelName(String provisionedModelName) {
        setProvisionedModelName(provisionedModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The Amazon Resource Name (ARN) of the Provisioned Throughput.
     */

    public void setProvisionedModelArn(String provisionedModelArn) {
        this.provisionedModelArn = provisionedModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Provisioned Throughput.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Provisioned Throughput.
     */

    public String getProvisionedModelArn() {
        return this.provisionedModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The Amazon Resource Name (ARN) of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withProvisionedModelArn(String provisionedModelArn) {
        setProvisionedModelArn(provisionedModelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model associated with this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput. This value
     * differs from the <code>modelArn</code> if updating hasn't completed.
     * </p>
     * 
     * @param desiredModelArn
     *        The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput.
     *        This value differs from the <code>modelArn</code> if updating hasn't completed.
     */

    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput. This value
     * differs from the <code>modelArn</code> if updating hasn't completed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput.
     *         This value differs from the <code>modelArn</code> if updating hasn't completed.
     */

    public String getDesiredModelArn() {
        return this.desiredModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput. This value
     * differs from the <code>modelArn</code> if updating hasn't completed.
     * </p>
     * 
     * @param desiredModelArn
     *        The Amazon Resource Name (ARN) of the model requested to be associated to this Provisioned Throughput.
     *        This value differs from the <code>modelArn</code> if updating hasn't completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withDesiredModelArn(String desiredModelArn) {
        setDesiredModelArn(desiredModelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of the base
     * model that the custom model for which the Provisioned Throughput was created was customized.
     * </p>
     * 
     * @param foundationModelArn
     *        The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of
     *        the base model that the custom model for which the Provisioned Throughput was created was customized.
     */

    public void setFoundationModelArn(String foundationModelArn) {
        this.foundationModelArn = foundationModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of the base
     * model that the custom model for which the Provisioned Throughput was created was customized.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of
     *         the base model that the custom model for which the Provisioned Throughput was created was customized.
     */

    public String getFoundationModelArn() {
        return this.foundationModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of the base
     * model that the custom model for which the Provisioned Throughput was created was customized.
     * </p>
     * 
     * @param foundationModelArn
     *        The Amazon Resource Name (ARN) of the base model for which the Provisioned Throughput was created, or of
     *        the base model that the custom model for which the Provisioned Throughput was created was customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withFoundationModelArn(String foundationModelArn) {
        setFoundationModelArn(foundationModelArn);
        return this;
    }

    /**
     * <p>
     * The status of the Provisioned Throughput.
     * </p>
     * 
     * @param status
     *        The status of the Provisioned Throughput.
     * @see ProvisionedModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Provisioned Throughput.
     * </p>
     * 
     * @return The status of the Provisioned Throughput.
     * @see ProvisionedModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Provisioned Throughput.
     * </p>
     * 
     * @param status
     *        The status of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public GetProvisionedModelThroughputResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Provisioned Throughput.
     * </p>
     * 
     * @param status
     *        The status of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public GetProvisionedModelThroughputResult withStatus(ProvisionedModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the creation time for this Provisioned Throughput.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of the creation time for this Provisioned Throughput.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of the creation time for this Provisioned Throughput.
     * </p>
     * 
     * @return The timestamp of the creation time for this Provisioned Throughput.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of the creation time for this Provisioned Throughput.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of the creation time for this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last time that this Provisioned Throughput was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of the last time that this Provisioned Throughput was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of the last time that this Provisioned Throughput was modified.
     * </p>
     * 
     * @return The timestamp of the last time that this Provisioned Throughput was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of the last time that this Provisioned Throughput was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of the last time that this Provisioned Throughput was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     * Throughput.
     * </p>
     * 
     * @param failureMessage
     *        A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     *        Throughput.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     * Throughput.
     * </p>
     * 
     * @return A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     *         Throughput.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     * Throughput.
     * </p>
     * 
     * @param failureMessage
     *        A failure message for any issues that occurred during creation, updating, or deletion of the Provisioned
     *        Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Commitment duration of the Provisioned Throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration of the Provisioned Throughput.
     * @see CommitmentDuration
     */

    public void setCommitmentDuration(String commitmentDuration) {
        this.commitmentDuration = commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration of the Provisioned Throughput.
     * </p>
     * 
     * @return Commitment duration of the Provisioned Throughput.
     * @see CommitmentDuration
     */

    public String getCommitmentDuration() {
        return this.commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration of the Provisioned Throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public GetProvisionedModelThroughputResult withCommitmentDuration(String commitmentDuration) {
        setCommitmentDuration(commitmentDuration);
        return this;
    }

    /**
     * <p>
     * Commitment duration of the Provisioned Throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public GetProvisionedModelThroughputResult withCommitmentDuration(CommitmentDuration commitmentDuration) {
        this.commitmentDuration = commitmentDuration.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the commitment term for the Provisioned Throughput expires.
     * </p>
     * 
     * @param commitmentExpirationTime
     *        The timestamp for when the commitment term for the Provisioned Throughput expires.
     */

    public void setCommitmentExpirationTime(java.util.Date commitmentExpirationTime) {
        this.commitmentExpirationTime = commitmentExpirationTime;
    }

    /**
     * <p>
     * The timestamp for when the commitment term for the Provisioned Throughput expires.
     * </p>
     * 
     * @return The timestamp for when the commitment term for the Provisioned Throughput expires.
     */

    public java.util.Date getCommitmentExpirationTime() {
        return this.commitmentExpirationTime;
    }

    /**
     * <p>
     * The timestamp for when the commitment term for the Provisioned Throughput expires.
     * </p>
     * 
     * @param commitmentExpirationTime
     *        The timestamp for when the commitment term for the Provisioned Throughput expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedModelThroughputResult withCommitmentExpirationTime(java.util.Date commitmentExpirationTime) {
        setCommitmentExpirationTime(commitmentExpirationTime);
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
        if (getModelUnits() != null)
            sb.append("ModelUnits: ").append(getModelUnits()).append(",");
        if (getDesiredModelUnits() != null)
            sb.append("DesiredModelUnits: ").append(getDesiredModelUnits()).append(",");
        if (getProvisionedModelName() != null)
            sb.append("ProvisionedModelName: ").append(getProvisionedModelName()).append(",");
        if (getProvisionedModelArn() != null)
            sb.append("ProvisionedModelArn: ").append(getProvisionedModelArn()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: ").append(getDesiredModelArn()).append(",");
        if (getFoundationModelArn() != null)
            sb.append("FoundationModelArn: ").append(getFoundationModelArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getCommitmentDuration() != null)
            sb.append("CommitmentDuration: ").append(getCommitmentDuration()).append(",");
        if (getCommitmentExpirationTime() != null)
            sb.append("CommitmentExpirationTime: ").append(getCommitmentExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProvisionedModelThroughputResult == false)
            return false;
        GetProvisionedModelThroughputResult other = (GetProvisionedModelThroughputResult) obj;
        if (other.getModelUnits() == null ^ this.getModelUnits() == null)
            return false;
        if (other.getModelUnits() != null && other.getModelUnits().equals(this.getModelUnits()) == false)
            return false;
        if (other.getDesiredModelUnits() == null ^ this.getDesiredModelUnits() == null)
            return false;
        if (other.getDesiredModelUnits() != null && other.getDesiredModelUnits().equals(this.getDesiredModelUnits()) == false)
            return false;
        if (other.getProvisionedModelName() == null ^ this.getProvisionedModelName() == null)
            return false;
        if (other.getProvisionedModelName() != null && other.getProvisionedModelName().equals(this.getProvisionedModelName()) == false)
            return false;
        if (other.getProvisionedModelArn() == null ^ this.getProvisionedModelArn() == null)
            return false;
        if (other.getProvisionedModelArn() != null && other.getProvisionedModelArn().equals(this.getProvisionedModelArn()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        if (other.getFoundationModelArn() == null ^ this.getFoundationModelArn() == null)
            return false;
        if (other.getFoundationModelArn() != null && other.getFoundationModelArn().equals(this.getFoundationModelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getCommitmentDuration() == null ^ this.getCommitmentDuration() == null)
            return false;
        if (other.getCommitmentDuration() != null && other.getCommitmentDuration().equals(this.getCommitmentDuration()) == false)
            return false;
        if (other.getCommitmentExpirationTime() == null ^ this.getCommitmentExpirationTime() == null)
            return false;
        if (other.getCommitmentExpirationTime() != null && other.getCommitmentExpirationTime().equals(this.getCommitmentExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelUnits() == null) ? 0 : getModelUnits().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelUnits() == null) ? 0 : getDesiredModelUnits().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelName() == null) ? 0 : getProvisionedModelName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelArn() == null) ? 0 : getProvisionedModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        hashCode = prime * hashCode + ((getFoundationModelArn() == null) ? 0 : getFoundationModelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getCommitmentDuration() == null) ? 0 : getCommitmentDuration().hashCode());
        hashCode = prime * hashCode + ((getCommitmentExpirationTime() == null) ? 0 : getCommitmentExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetProvisionedModelThroughputResult clone() {
        try {
            return (GetProvisionedModelThroughputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
