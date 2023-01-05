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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyActivityStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     */
    private String kinesisStreamName;
    /**
     * <p>
     * The status of the modification to the database activity stream.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Indicates whether engine-native audit fields are included in the database activity stream.
     * </p>
     */
    private Boolean engineNativeAuditFieldsIncluded;
    /**
     * <p>
     * The status of the modification to the policy state of the database activity stream.
     * </p>
     */
    private String policyStatus;

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyActivityStreamResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream to be used for the database activity stream.
     */

    public void setKinesisStreamName(String kinesisStreamName) {
        this.kinesisStreamName = kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis data stream to be used for the database activity stream.
     */

    public String getKinesisStreamName() {
        return this.kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyActivityStreamResult withKinesisStreamName(String kinesisStreamName) {
        setKinesisStreamName(kinesisStreamName);
        return this;
    }

    /**
     * <p>
     * The status of the modification to the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the modification to the database activity stream.
     * @see ActivityStreamStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the modification to the database activity stream.
     * </p>
     * 
     * @return The status of the modification to the database activity stream.
     * @see ActivityStreamStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the modification to the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the modification to the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public ModifyActivityStreamResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the modification to the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the modification to the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public ModifyActivityStreamResult withStatus(ActivityStreamStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @see ActivityStreamMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @return The mode of the database activity stream.
     * @see ActivityStreamMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public ModifyActivityStreamResult withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public ModifyActivityStreamResult withMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether engine-native audit fields are included in the database activity stream.
     * </p>
     * 
     * @param engineNativeAuditFieldsIncluded
     *        Indicates whether engine-native audit fields are included in the database activity stream.
     */

    public void setEngineNativeAuditFieldsIncluded(Boolean engineNativeAuditFieldsIncluded) {
        this.engineNativeAuditFieldsIncluded = engineNativeAuditFieldsIncluded;
    }

    /**
     * <p>
     * Indicates whether engine-native audit fields are included in the database activity stream.
     * </p>
     * 
     * @return Indicates whether engine-native audit fields are included in the database activity stream.
     */

    public Boolean getEngineNativeAuditFieldsIncluded() {
        return this.engineNativeAuditFieldsIncluded;
    }

    /**
     * <p>
     * Indicates whether engine-native audit fields are included in the database activity stream.
     * </p>
     * 
     * @param engineNativeAuditFieldsIncluded
     *        Indicates whether engine-native audit fields are included in the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyActivityStreamResult withEngineNativeAuditFieldsIncluded(Boolean engineNativeAuditFieldsIncluded) {
        setEngineNativeAuditFieldsIncluded(engineNativeAuditFieldsIncluded);
        return this;
    }

    /**
     * <p>
     * Indicates whether engine-native audit fields are included in the database activity stream.
     * </p>
     * 
     * @return Indicates whether engine-native audit fields are included in the database activity stream.
     */

    public Boolean isEngineNativeAuditFieldsIncluded() {
        return this.engineNativeAuditFieldsIncluded;
    }

    /**
     * <p>
     * The status of the modification to the policy state of the database activity stream.
     * </p>
     * 
     * @param policyStatus
     *        The status of the modification to the policy state of the database activity stream.
     * @see ActivityStreamPolicyStatus
     */

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * <p>
     * The status of the modification to the policy state of the database activity stream.
     * </p>
     * 
     * @return The status of the modification to the policy state of the database activity stream.
     * @see ActivityStreamPolicyStatus
     */

    public String getPolicyStatus() {
        return this.policyStatus;
    }

    /**
     * <p>
     * The status of the modification to the policy state of the database activity stream.
     * </p>
     * 
     * @param policyStatus
     *        The status of the modification to the policy state of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamPolicyStatus
     */

    public ModifyActivityStreamResult withPolicyStatus(String policyStatus) {
        setPolicyStatus(policyStatus);
        return this;
    }

    /**
     * <p>
     * The status of the modification to the policy state of the database activity stream.
     * </p>
     * 
     * @param policyStatus
     *        The status of the modification to the policy state of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamPolicyStatus
     */

    public ModifyActivityStreamResult withPolicyStatus(ActivityStreamPolicyStatus policyStatus) {
        this.policyStatus = policyStatus.toString();
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getKinesisStreamName() != null)
            sb.append("KinesisStreamName: ").append(getKinesisStreamName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getEngineNativeAuditFieldsIncluded() != null)
            sb.append("EngineNativeAuditFieldsIncluded: ").append(getEngineNativeAuditFieldsIncluded()).append(",");
        if (getPolicyStatus() != null)
            sb.append("PolicyStatus: ").append(getPolicyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyActivityStreamResult == false)
            return false;
        ModifyActivityStreamResult other = (ModifyActivityStreamResult) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getKinesisStreamName() == null ^ this.getKinesisStreamName() == null)
            return false;
        if (other.getKinesisStreamName() != null && other.getKinesisStreamName().equals(this.getKinesisStreamName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getEngineNativeAuditFieldsIncluded() == null ^ this.getEngineNativeAuditFieldsIncluded() == null)
            return false;
        if (other.getEngineNativeAuditFieldsIncluded() != null
                && other.getEngineNativeAuditFieldsIncluded().equals(this.getEngineNativeAuditFieldsIncluded()) == false)
            return false;
        if (other.getPolicyStatus() == null ^ this.getPolicyStatus() == null)
            return false;
        if (other.getPolicyStatus() != null && other.getPolicyStatus().equals(this.getPolicyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamName() == null) ? 0 : getKinesisStreamName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getEngineNativeAuditFieldsIncluded() == null) ? 0 : getEngineNativeAuditFieldsIncluded().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModifyActivityStreamResult clone() {
        try {
            return (ModifyActivityStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
