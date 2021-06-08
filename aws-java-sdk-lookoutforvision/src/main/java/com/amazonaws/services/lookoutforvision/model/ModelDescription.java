/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon Lookout for Vision model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ModelDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the model
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The description for the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the model.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Performance metrics for the model. Created during training.
     * </p>
     */
    private ModelPerformance performance;
    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves model training files.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained model
     * and generate the performance scores.
     * </p>
     */
    private OutputS3Object evaluationManifest;
    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the performance metrics.
     * </p>
     */
    private OutputS3Object evaluationResult;
    /**
     * <p>
     * The unix timestamp for the date and time that the evaluation ended.
     * </p>
     */
    private java.util.Date evaluationEndTimestamp;
    /**
     * <p>
     * The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     * training.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The version of the model
     * </p>
     * 
     * @param modelVersion
     *        The version of the model
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model
     * </p>
     * 
     * @return The version of the model
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model
     * </p>
     * 
     * @param modelVersion
     *        The version of the model
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the model was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @return The unix timestamp for the date and time that the model was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @param description
     *        The description for the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @return The description for the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @param description
     *        The description for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @return The status of the model.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelDescription withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @return The status message for the model.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Performance metrics for the model. Created during training.
     * </p>
     * 
     * @param performance
     *        Performance metrics for the model. Created during training.
     */

    public void setPerformance(ModelPerformance performance) {
        this.performance = performance;
    }

    /**
     * <p>
     * Performance metrics for the model. Created during training.
     * </p>
     * 
     * @return Performance metrics for the model. Created during training.
     */

    public ModelPerformance getPerformance() {
        return this.performance;
    }

    /**
     * <p>
     * Performance metrics for the model. Created during training.
     * </p>
     * 
     * @param performance
     *        Performance metrics for the model. Created during training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withPerformance(ModelPerformance performance) {
        setPerformance(performance);
        return this;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves model training files.
     * </p>
     * 
     * @param outputConfig
     *        The S3 location where Amazon Lookout for Vision saves model training files.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves model training files.
     * </p>
     * 
     * @return The S3 location where Amazon Lookout for Vision saves model training files.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves model training files.
     * </p>
     * 
     * @param outputConfig
     *        The S3 location where Amazon Lookout for Vision saves model training files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained model
     * and generate the performance scores.
     * </p>
     * 
     * @param evaluationManifest
     *        The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained
     *        model and generate the performance scores.
     */

    public void setEvaluationManifest(OutputS3Object evaluationManifest) {
        this.evaluationManifest = evaluationManifest;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained model
     * and generate the performance scores.
     * </p>
     * 
     * @return The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained
     *         model and generate the performance scores.
     */

    public OutputS3Object getEvaluationManifest() {
        return this.evaluationManifest;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained model
     * and generate the performance scores.
     * </p>
     * 
     * @param evaluationManifest
     *        The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained
     *        model and generate the performance scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withEvaluationManifest(OutputS3Object evaluationManifest) {
        setEvaluationManifest(evaluationManifest);
        return this;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the performance metrics.
     * </p>
     * 
     * @param evaluationResult
     *        The S3 location where Amazon Lookout for Vision saves the performance metrics.
     */

    public void setEvaluationResult(OutputS3Object evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the performance metrics.
     * </p>
     * 
     * @return The S3 location where Amazon Lookout for Vision saves the performance metrics.
     */

    public OutputS3Object getEvaluationResult() {
        return this.evaluationResult;
    }

    /**
     * <p>
     * The S3 location where Amazon Lookout for Vision saves the performance metrics.
     * </p>
     * 
     * @param evaluationResult
     *        The S3 location where Amazon Lookout for Vision saves the performance metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withEvaluationResult(OutputS3Object evaluationResult) {
        setEvaluationResult(evaluationResult);
        return this;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the evaluation ended.
     * </p>
     * 
     * @param evaluationEndTimestamp
     *        The unix timestamp for the date and time that the evaluation ended.
     */

    public void setEvaluationEndTimestamp(java.util.Date evaluationEndTimestamp) {
        this.evaluationEndTimestamp = evaluationEndTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the evaluation ended.
     * </p>
     * 
     * @return The unix timestamp for the date and time that the evaluation ended.
     */

    public java.util.Date getEvaluationEndTimestamp() {
        return this.evaluationEndTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the evaluation ended.
     * </p>
     * 
     * @param evaluationEndTimestamp
     *        The unix timestamp for the date and time that the evaluation ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withEvaluationEndTimestamp(java.util.Date evaluationEndTimestamp) {
        setEvaluationEndTimestamp(evaluationEndTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     *        training.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @return The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     *         training.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during
     *        training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDescription withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getPerformance() != null)
            sb.append("Performance: ").append(getPerformance()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getEvaluationManifest() != null)
            sb.append("EvaluationManifest: ").append(getEvaluationManifest()).append(",");
        if (getEvaluationResult() != null)
            sb.append("EvaluationResult: ").append(getEvaluationResult()).append(",");
        if (getEvaluationEndTimestamp() != null)
            sb.append("EvaluationEndTimestamp: ").append(getEvaluationEndTimestamp()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDescription == false)
            return false;
        ModelDescription other = (ModelDescription) obj;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getPerformance() == null ^ this.getPerformance() == null)
            return false;
        if (other.getPerformance() != null && other.getPerformance().equals(this.getPerformance()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getEvaluationManifest() == null ^ this.getEvaluationManifest() == null)
            return false;
        if (other.getEvaluationManifest() != null && other.getEvaluationManifest().equals(this.getEvaluationManifest()) == false)
            return false;
        if (other.getEvaluationResult() == null ^ this.getEvaluationResult() == null)
            return false;
        if (other.getEvaluationResult() != null && other.getEvaluationResult().equals(this.getEvaluationResult()) == false)
            return false;
        if (other.getEvaluationEndTimestamp() == null ^ this.getEvaluationEndTimestamp() == null)
            return false;
        if (other.getEvaluationEndTimestamp() != null && other.getEvaluationEndTimestamp().equals(this.getEvaluationEndTimestamp()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getPerformance() == null) ? 0 : getPerformance().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getEvaluationManifest() == null) ? 0 : getEvaluationManifest().hashCode());
        hashCode = prime * hashCode + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        hashCode = prime * hashCode + ((getEvaluationEndTimestamp() == null) ? 0 : getEvaluationEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ModelDescription clone() {
        try {
            return (ModelDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ModelDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
