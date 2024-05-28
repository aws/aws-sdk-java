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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration properties of a flywheel iteration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/FlywheelIterationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlywheelIterationProperties implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String flywheelArn;
    /** <p/> */
    private String flywheelIterationId;
    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
     * </p>
     */
    private String evaluatedModelArn;

    private FlywheelModelEvaluationMetrics evaluatedModelMetrics;
    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
     * </p>
     */
    private String trainedModelArn;
    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     */
    private FlywheelModelEvaluationMetrics trainedModelMetrics;
    /** <p/> */
    private String evaluationManifestS3Prefix;

    /**
     * <p/>
     * 
     * @param flywheelArn
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p/>
     * 
     * @param flywheelArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param flywheelIterationId
     */

    public void setFlywheelIterationId(String flywheelIterationId) {
        this.flywheelIterationId = flywheelIterationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFlywheelIterationId() {
        return this.flywheelIterationId;
    }

    /**
     * <p/>
     * 
     * @param flywheelIterationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withFlywheelIterationId(String flywheelIterationId) {
        setFlywheelIterationId(flywheelIterationId);
        return this;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     * 
     * @param creationTime
     *        The creation start time of the flywheel iteration.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     * 
     * @return The creation start time of the flywheel iteration.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     * 
     * @param creationTime
     *        The creation start time of the flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     * 
     * @param endTime
     *        The completion time of this flywheel iteration.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     * 
     * @return The completion time of this flywheel iteration.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     * 
     * @param endTime
     *        The completion time of this flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * 
     * @param status
     *        The status of the flywheel iteration.
     * @see FlywheelIterationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * 
     * @return The status of the flywheel iteration.
     * @see FlywheelIterationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * 
     * @param status
     *        The status of the flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlywheelIterationStatus
     */

    public FlywheelIterationProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * 
     * @param status
     *        The status of the flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlywheelIterationStatus
     */

    public FlywheelIterationProperties withStatus(FlywheelIterationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     * 
     * @param message
     *        A description of the status of the flywheel iteration.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     * 
     * @return A description of the status of the flywheel iteration.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     * 
     * @param message
     *        A description of the status of the flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
     * </p>
     * 
     * @param evaluatedModelArn
     *        The ARN of the evaluated model associated with this flywheel iteration.
     */

    public void setEvaluatedModelArn(String evaluatedModelArn) {
        this.evaluatedModelArn = evaluatedModelArn;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
     * </p>
     * 
     * @return The ARN of the evaluated model associated with this flywheel iteration.
     */

    public String getEvaluatedModelArn() {
        return this.evaluatedModelArn;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
     * </p>
     * 
     * @param evaluatedModelArn
     *        The ARN of the evaluated model associated with this flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withEvaluatedModelArn(String evaluatedModelArn) {
        setEvaluatedModelArn(evaluatedModelArn);
        return this;
    }

    /**
     * @param evaluatedModelMetrics
     */

    public void setEvaluatedModelMetrics(FlywheelModelEvaluationMetrics evaluatedModelMetrics) {
        this.evaluatedModelMetrics = evaluatedModelMetrics;
    }

    /**
     * @return
     */

    public FlywheelModelEvaluationMetrics getEvaluatedModelMetrics() {
        return this.evaluatedModelMetrics;
    }

    /**
     * @param evaluatedModelMetrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withEvaluatedModelMetrics(FlywheelModelEvaluationMetrics evaluatedModelMetrics) {
        setEvaluatedModelMetrics(evaluatedModelMetrics);
        return this;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
     * </p>
     * 
     * @param trainedModelArn
     *        The ARN of the trained model associated with this flywheel iteration.
     */

    public void setTrainedModelArn(String trainedModelArn) {
        this.trainedModelArn = trainedModelArn;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
     * </p>
     * 
     * @return The ARN of the trained model associated with this flywheel iteration.
     */

    public String getTrainedModelArn() {
        return this.trainedModelArn;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
     * </p>
     * 
     * @param trainedModelArn
     *        The ARN of the trained model associated with this flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withTrainedModelArn(String trainedModelArn) {
        setTrainedModelArn(trainedModelArn);
        return this;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     * 
     * @param trainedModelMetrics
     *        The metrics associated with the trained model.
     */

    public void setTrainedModelMetrics(FlywheelModelEvaluationMetrics trainedModelMetrics) {
        this.trainedModelMetrics = trainedModelMetrics;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     * 
     * @return The metrics associated with the trained model.
     */

    public FlywheelModelEvaluationMetrics getTrainedModelMetrics() {
        return this.trainedModelMetrics;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     * 
     * @param trainedModelMetrics
     *        The metrics associated with the trained model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withTrainedModelMetrics(FlywheelModelEvaluationMetrics trainedModelMetrics) {
        setTrainedModelMetrics(trainedModelMetrics);
        return this;
    }

    /**
     * <p/>
     * 
     * @param evaluationManifestS3Prefix
     */

    public void setEvaluationManifestS3Prefix(String evaluationManifestS3Prefix) {
        this.evaluationManifestS3Prefix = evaluationManifestS3Prefix;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEvaluationManifestS3Prefix() {
        return this.evaluationManifestS3Prefix;
    }

    /**
     * <p/>
     * 
     * @param evaluationManifestS3Prefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelIterationProperties withEvaluationManifestS3Prefix(String evaluationManifestS3Prefix) {
        setEvaluationManifestS3Prefix(evaluationManifestS3Prefix);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getFlywheelIterationId() != null)
            sb.append("FlywheelIterationId: ").append(getFlywheelIterationId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getEvaluatedModelArn() != null)
            sb.append("EvaluatedModelArn: ").append(getEvaluatedModelArn()).append(",");
        if (getEvaluatedModelMetrics() != null)
            sb.append("EvaluatedModelMetrics: ").append(getEvaluatedModelMetrics()).append(",");
        if (getTrainedModelArn() != null)
            sb.append("TrainedModelArn: ").append(getTrainedModelArn()).append(",");
        if (getTrainedModelMetrics() != null)
            sb.append("TrainedModelMetrics: ").append(getTrainedModelMetrics()).append(",");
        if (getEvaluationManifestS3Prefix() != null)
            sb.append("EvaluationManifestS3Prefix: ").append(getEvaluationManifestS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlywheelIterationProperties == false)
            return false;
        FlywheelIterationProperties other = (FlywheelIterationProperties) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getFlywheelIterationId() == null ^ this.getFlywheelIterationId() == null)
            return false;
        if (other.getFlywheelIterationId() != null && other.getFlywheelIterationId().equals(this.getFlywheelIterationId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEvaluatedModelArn() == null ^ this.getEvaluatedModelArn() == null)
            return false;
        if (other.getEvaluatedModelArn() != null && other.getEvaluatedModelArn().equals(this.getEvaluatedModelArn()) == false)
            return false;
        if (other.getEvaluatedModelMetrics() == null ^ this.getEvaluatedModelMetrics() == null)
            return false;
        if (other.getEvaluatedModelMetrics() != null && other.getEvaluatedModelMetrics().equals(this.getEvaluatedModelMetrics()) == false)
            return false;
        if (other.getTrainedModelArn() == null ^ this.getTrainedModelArn() == null)
            return false;
        if (other.getTrainedModelArn() != null && other.getTrainedModelArn().equals(this.getTrainedModelArn()) == false)
            return false;
        if (other.getTrainedModelMetrics() == null ^ this.getTrainedModelMetrics() == null)
            return false;
        if (other.getTrainedModelMetrics() != null && other.getTrainedModelMetrics().equals(this.getTrainedModelMetrics()) == false)
            return false;
        if (other.getEvaluationManifestS3Prefix() == null ^ this.getEvaluationManifestS3Prefix() == null)
            return false;
        if (other.getEvaluationManifestS3Prefix() != null && other.getEvaluationManifestS3Prefix().equals(this.getEvaluationManifestS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getFlywheelIterationId() == null) ? 0 : getFlywheelIterationId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEvaluatedModelArn() == null) ? 0 : getEvaluatedModelArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluatedModelMetrics() == null) ? 0 : getEvaluatedModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getTrainedModelArn() == null) ? 0 : getTrainedModelArn().hashCode());
        hashCode = prime * hashCode + ((getTrainedModelMetrics() == null) ? 0 : getTrainedModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getEvaluationManifestS3Prefix() == null) ? 0 : getEvaluationManifestS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public FlywheelIterationProperties clone() {
        try {
            return (FlywheelIterationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.FlywheelIterationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
