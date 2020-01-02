/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of a version of a model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectVersionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     */
    private String projectVersionArn;
    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The minimum number of inference units used by the model. For more information, see <a>StartProjectVersion</a>.
     * </p>
     */
    private Integer minInferenceUnits;
    /**
     * <p>
     * The current status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The duration, in seconds, that the model version has been billed for training. This value is only returned if the
     * model version has been successfully trained.
     * </p>
     */
    private Long billableTrainingTimeInSeconds;
    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     */
    private java.util.Date trainingEndTimestamp;
    /**
     * <p>
     * The location where training results are saved.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The manifest file that represents the training results.
     * </p>
     */
    private TrainingDataResult trainingDataResult;
    /**
     * <p>
     * The manifest file that represents the testing results.
     * </p>
     */
    private TestingDataResult testingDataResult;
    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     */
    private EvaluationResult evaluationResult;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withProjectVersionArn(String projectVersionArn) {
        setProjectVersionArn(projectVersionArn);
        return this;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the date and time that training started.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @return The Unix datetime for the date and time that training started.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the date and time that training started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units used by the model. For more information, see
     *        <a>StartProjectVersion</a>.
     */

    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @return The minimum number of inference units used by the model. For more information, see
     *         <a>StartProjectVersion</a>.
     */

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units used by the model. For more information, see
     *        <a>StartProjectVersion</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withMinInferenceUnits(Integer minInferenceUnits) {
        setMinInferenceUnits(minInferenceUnits);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @see ProjectVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @return The current status of the model version.
     * @see ProjectVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVersionStatus
     */

    public ProjectVersionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVersionStatus
     */

    public ProjectVersionDescription withStatus(ProjectVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive message for an error or warning that occurred.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @return A descriptive message for an error or warning that occurred.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive message for an error or warning that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that the model version has been billed for training. This value is only returned if the
     * model version has been successfully trained.
     * </p>
     * 
     * @param billableTrainingTimeInSeconds
     *        The duration, in seconds, that the model version has been billed for training. This value is only returned
     *        if the model version has been successfully trained.
     */

    public void setBillableTrainingTimeInSeconds(Long billableTrainingTimeInSeconds) {
        this.billableTrainingTimeInSeconds = billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the model version has been billed for training. This value is only returned if the
     * model version has been successfully trained.
     * </p>
     * 
     * @return The duration, in seconds, that the model version has been billed for training. This value is only
     *         returned if the model version has been successfully trained.
     */

    public Long getBillableTrainingTimeInSeconds() {
        return this.billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the model version has been billed for training. This value is only returned if the
     * model version has been successfully trained.
     * </p>
     * 
     * @param billableTrainingTimeInSeconds
     *        The duration, in seconds, that the model version has been billed for training. This value is only returned
     *        if the model version has been successfully trained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withBillableTrainingTimeInSeconds(Long billableTrainingTimeInSeconds) {
        setBillableTrainingTimeInSeconds(billableTrainingTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @param trainingEndTimestamp
     *        The Unix date and time that training of the model ended.
     */

    public void setTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        this.trainingEndTimestamp = trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @return The Unix date and time that training of the model ended.
     */

    public java.util.Date getTrainingEndTimestamp() {
        return this.trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @param trainingEndTimestamp
     *        The Unix date and time that training of the model ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        setTrainingEndTimestamp(trainingEndTimestamp);
        return this;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @param outputConfig
     *        The location where training results are saved.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @return The location where training results are saved.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @param outputConfig
     *        The location where training results are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The manifest file that represents the training results.
     * </p>
     * 
     * @param trainingDataResult
     *        The manifest file that represents the training results.
     */

    public void setTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
    }

    /**
     * <p>
     * The manifest file that represents the training results.
     * </p>
     * 
     * @return The manifest file that represents the training results.
     */

    public TrainingDataResult getTrainingDataResult() {
        return this.trainingDataResult;
    }

    /**
     * <p>
     * The manifest file that represents the training results.
     * </p>
     * 
     * @param trainingDataResult
     *        The manifest file that represents the training results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTrainingDataResult(TrainingDataResult trainingDataResult) {
        setTrainingDataResult(trainingDataResult);
        return this;
    }

    /**
     * <p>
     * The manifest file that represents the testing results.
     * </p>
     * 
     * @param testingDataResult
     *        The manifest file that represents the testing results.
     */

    public void setTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
    }

    /**
     * <p>
     * The manifest file that represents the testing results.
     * </p>
     * 
     * @return The manifest file that represents the testing results.
     */

    public TestingDataResult getTestingDataResult() {
        return this.testingDataResult;
    }

    /**
     * <p>
     * The manifest file that represents the testing results.
     * </p>
     * 
     * @param testingDataResult
     *        The manifest file that represents the testing results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTestingDataResult(TestingDataResult testingDataResult) {
        setTestingDataResult(testingDataResult);
        return this;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @param evaluationResult
     *        The training results. <code>EvaluationResult</code> is only returned if training is successful.
     */

    public void setEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @return The training results. <code>EvaluationResult</code> is only returned if training is successful.
     */

    public EvaluationResult getEvaluationResult() {
        return this.evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @param evaluationResult
     *        The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withEvaluationResult(EvaluationResult evaluationResult) {
        setEvaluationResult(evaluationResult);
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: ").append(getProjectVersionArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: ").append(getMinInferenceUnits()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getBillableTrainingTimeInSeconds() != null)
            sb.append("BillableTrainingTimeInSeconds: ").append(getBillableTrainingTimeInSeconds()).append(",");
        if (getTrainingEndTimestamp() != null)
            sb.append("TrainingEndTimestamp: ").append(getTrainingEndTimestamp()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTrainingDataResult() != null)
            sb.append("TrainingDataResult: ").append(getTrainingDataResult()).append(",");
        if (getTestingDataResult() != null)
            sb.append("TestingDataResult: ").append(getTestingDataResult()).append(",");
        if (getEvaluationResult() != null)
            sb.append("EvaluationResult: ").append(getEvaluationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectVersionDescription == false)
            return false;
        ProjectVersionDescription other = (ProjectVersionDescription) obj;
        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getBillableTrainingTimeInSeconds() == null ^ this.getBillableTrainingTimeInSeconds() == null)
            return false;
        if (other.getBillableTrainingTimeInSeconds() != null
                && other.getBillableTrainingTimeInSeconds().equals(this.getBillableTrainingTimeInSeconds()) == false)
            return false;
        if (other.getTrainingEndTimestamp() == null ^ this.getTrainingEndTimestamp() == null)
            return false;
        if (other.getTrainingEndTimestamp() != null && other.getTrainingEndTimestamp().equals(this.getTrainingEndTimestamp()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingDataResult() == null ^ this.getTrainingDataResult() == null)
            return false;
        if (other.getTrainingDataResult() != null && other.getTrainingDataResult().equals(this.getTrainingDataResult()) == false)
            return false;
        if (other.getTestingDataResult() == null ^ this.getTestingDataResult() == null)
            return false;
        if (other.getTestingDataResult() != null && other.getTestingDataResult().equals(this.getTestingDataResult()) == false)
            return false;
        if (other.getEvaluationResult() == null ^ this.getEvaluationResult() == null)
            return false;
        if (other.getEvaluationResult() != null && other.getEvaluationResult().equals(this.getEvaluationResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getBillableTrainingTimeInSeconds() == null) ? 0 : getBillableTrainingTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTimestamp() == null) ? 0 : getTrainingEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataResult() == null) ? 0 : getTrainingDataResult().hashCode());
        hashCode = prime * hashCode + ((getTestingDataResult() == null) ? 0 : getTestingDataResult().hashCode());
        hashCode = prime * hashCode + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        return hashCode;
    }

    @Override
    public ProjectVersionDescription clone() {
        try {
            return (ProjectVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProjectVersionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
