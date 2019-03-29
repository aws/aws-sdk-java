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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes information about an entity recognizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     */
    private String entityRecognizerArn;
    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     */
    private java.util.Date trainingStartTime;
    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     */
    private java.util.Date trainingEndTime;
    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     */
    private EntityRecognizerInputDataConfig inputDataConfig;
    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     */
    private EntityRecognizerMetadata recognizerMetadata;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @param entityRecognizerArn
     *        The Amazon Resource Name (ARN) that identifies the entity recognizer.
     */

    public void setEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the entity recognizer.
     */

    public String getEntityRecognizerArn() {
        return this.entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @param entityRecognizerArn
     *        The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withEntityRecognizerArn(String entityRecognizerArn) {
        setEntityRecognizerArn(entityRecognizerArn);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @return The language of the input documents. All documents must be in the same language. Only English ("en") is
     *         currently supported.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public EntityRecognizerProperties withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public EntityRecognizerProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * 
     * @param status
     *        Provides the status of the entity recognizer.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * 
     * @return Provides the status of the entity recognizer.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * 
     * @param status
     *        Provides the status of the entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * 
     * @param status
     *        Provides the status of the entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerProperties withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     * 
     * @param message
     *        A description of the status of the recognizer.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     * 
     * @return A description of the status of the recognizer.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     * 
     * @param message
     *        A description of the status of the recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the recognizer was submitted for processing.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     * 
     * @return The time that the recognizer was submitted for processing.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the recognizer was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     * 
     * @param endTime
     *        The time that the recognizer creation completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     * 
     * @return The time that the recognizer creation completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     * 
     * @param endTime
     *        The time that the recognizer creation completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     * 
     * @param trainingStartTime
     *        The time that training of the entity recognizer started.
     */

    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     * 
     * @return The time that training of the entity recognizer started.
     */

    public java.util.Date getTrainingStartTime() {
        return this.trainingStartTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     * 
     * @param trainingStartTime
     *        The time that training of the entity recognizer started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withTrainingStartTime(java.util.Date trainingStartTime) {
        setTrainingStartTime(trainingStartTime);
        return this;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     * 
     * @param trainingEndTime
     *        The time that training of the entity recognizer was completed.
     */

    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     * 
     * @return The time that training of the entity recognizer was completed.
     */

    public java.util.Date getTrainingEndTime() {
        return this.trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     * 
     * @param trainingEndTime
     *        The time that training of the entity recognizer was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withTrainingEndTime(java.util.Date trainingEndTime) {
        setTrainingEndTime(trainingEndTime);
        return this;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data properties of an entity recognizer.
     */

    public void setInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     * 
     * @return The input data properties of an entity recognizer.
     */

    public EntityRecognizerInputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data properties of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     * 
     * @param recognizerMetadata
     *        Provides information about an entity recognizer.
     */

    public void setRecognizerMetadata(EntityRecognizerMetadata recognizerMetadata) {
        this.recognizerMetadata = recognizerMetadata;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     * 
     * @return Provides information about an entity recognizer.
     */

    public EntityRecognizerMetadata getRecognizerMetadata() {
        return this.recognizerMetadata;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     * 
     * @param recognizerMetadata
     *        Provides information about an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withRecognizerMetadata(EntityRecognizerMetadata recognizerMetadata) {
        setRecognizerMetadata(recognizerMetadata);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the
     *         storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId
     *         can be either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerProperties withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
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
        if (getEntityRecognizerArn() != null)
            sb.append("EntityRecognizerArn: ").append(getEntityRecognizerArn()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: ").append(getTrainingStartTime()).append(",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: ").append(getTrainingEndTime()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getRecognizerMetadata() != null)
            sb.append("RecognizerMetadata: ").append(getRecognizerMetadata()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerProperties == false)
            return false;
        EntityRecognizerProperties other = (EntityRecognizerProperties) obj;
        if (other.getEntityRecognizerArn() == null ^ this.getEntityRecognizerArn() == null)
            return false;
        if (other.getEntityRecognizerArn() != null && other.getEntityRecognizerArn().equals(this.getEntityRecognizerArn()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getRecognizerMetadata() == null ^ this.getRecognizerMetadata() == null)
            return false;
        if (other.getRecognizerMetadata() != null && other.getRecognizerMetadata().equals(this.getRecognizerMetadata()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityRecognizerArn() == null) ? 0 : getEntityRecognizerArn().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRecognizerMetadata() == null) ? 0 : getRecognizerMetadata().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerProperties clone() {
        try {
            return (EntityRecognizerProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
