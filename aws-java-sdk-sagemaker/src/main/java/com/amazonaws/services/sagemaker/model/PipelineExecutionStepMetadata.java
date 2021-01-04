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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata for a step execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PipelineExecutionStepMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     */
    private TrainingJobStepMetadata trainingJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     */
    private ProcessingJobStepMetadata processingJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     */
    private TransformJobStepMetadata transformJob;
    /**
     * <p>
     * Metadata for the Model step.
     * </p>
     */
    private ModelStepMetadata model;
    /**
     * <p>
     * Metadata for the RegisterModel step.
     * </p>
     */
    private RegisterModelStepMetadata registerModel;
    /**
     * <p>
     * If this is a Condition step metadata object, details on the condition.
     * </p>
     */
    private ConditionStepMetadata condition;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @param trainingJob
     *        The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     */

    public void setTrainingJob(TrainingJobStepMetadata trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     */

    public TrainingJobStepMetadata getTrainingJob() {
        return this.trainingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @param trainingJob
     *        The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withTrainingJob(TrainingJobStepMetadata trainingJob) {
        setTrainingJob(trainingJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @param processingJob
     *        The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     */

    public void setProcessingJob(ProcessingJobStepMetadata processingJob) {
        this.processingJob = processingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     */

    public ProcessingJobStepMetadata getProcessingJob() {
        return this.processingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @param processingJob
     *        The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withProcessingJob(ProcessingJobStepMetadata processingJob) {
        setProcessingJob(processingJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @param transformJob
     *        The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     */

    public void setTransformJob(TransformJobStepMetadata transformJob) {
        this.transformJob = transformJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     */

    public TransformJobStepMetadata getTransformJob() {
        return this.transformJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @param transformJob
     *        The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withTransformJob(TransformJobStepMetadata transformJob) {
        setTransformJob(transformJob);
        return this;
    }

    /**
     * <p>
     * Metadata for the Model step.
     * </p>
     * 
     * @param model
     *        Metadata for the Model step.
     */

    public void setModel(ModelStepMetadata model) {
        this.model = model;
    }

    /**
     * <p>
     * Metadata for the Model step.
     * </p>
     * 
     * @return Metadata for the Model step.
     */

    public ModelStepMetadata getModel() {
        return this.model;
    }

    /**
     * <p>
     * Metadata for the Model step.
     * </p>
     * 
     * @param model
     *        Metadata for the Model step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withModel(ModelStepMetadata model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * Metadata for the RegisterModel step.
     * </p>
     * 
     * @param registerModel
     *        Metadata for the RegisterModel step.
     */

    public void setRegisterModel(RegisterModelStepMetadata registerModel) {
        this.registerModel = registerModel;
    }

    /**
     * <p>
     * Metadata for the RegisterModel step.
     * </p>
     * 
     * @return Metadata for the RegisterModel step.
     */

    public RegisterModelStepMetadata getRegisterModel() {
        return this.registerModel;
    }

    /**
     * <p>
     * Metadata for the RegisterModel step.
     * </p>
     * 
     * @param registerModel
     *        Metadata for the RegisterModel step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withRegisterModel(RegisterModelStepMetadata registerModel) {
        setRegisterModel(registerModel);
        return this;
    }

    /**
     * <p>
     * If this is a Condition step metadata object, details on the condition.
     * </p>
     * 
     * @param condition
     *        If this is a Condition step metadata object, details on the condition.
     */

    public void setCondition(ConditionStepMetadata condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * If this is a Condition step metadata object, details on the condition.
     * </p>
     * 
     * @return If this is a Condition step metadata object, details on the condition.
     */

    public ConditionStepMetadata getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * If this is a Condition step metadata object, details on the condition.
     * </p>
     * 
     * @param condition
     *        If this is a Condition step metadata object, details on the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withCondition(ConditionStepMetadata condition) {
        setCondition(condition);
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
        if (getTrainingJob() != null)
            sb.append("TrainingJob: ").append(getTrainingJob()).append(",");
        if (getProcessingJob() != null)
            sb.append("ProcessingJob: ").append(getProcessingJob()).append(",");
        if (getTransformJob() != null)
            sb.append("TransformJob: ").append(getTransformJob()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getRegisterModel() != null)
            sb.append("RegisterModel: ").append(getRegisterModel()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecutionStepMetadata == false)
            return false;
        PipelineExecutionStepMetadata other = (PipelineExecutionStepMetadata) obj;
        if (other.getTrainingJob() == null ^ this.getTrainingJob() == null)
            return false;
        if (other.getTrainingJob() != null && other.getTrainingJob().equals(this.getTrainingJob()) == false)
            return false;
        if (other.getProcessingJob() == null ^ this.getProcessingJob() == null)
            return false;
        if (other.getProcessingJob() != null && other.getProcessingJob().equals(this.getProcessingJob()) == false)
            return false;
        if (other.getTransformJob() == null ^ this.getTransformJob() == null)
            return false;
        if (other.getTransformJob() != null && other.getTransformJob().equals(this.getTransformJob()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getRegisterModel() == null ^ this.getRegisterModel() == null)
            return false;
        if (other.getRegisterModel() != null && other.getRegisterModel().equals(this.getRegisterModel()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getProcessingJob() == null) ? 0 : getProcessingJob().hashCode());
        hashCode = prime * hashCode + ((getTransformJob() == null) ? 0 : getTransformJob().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getRegisterModel() == null) ? 0 : getRegisterModel().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecutionStepMetadata clone() {
        try {
            return (PipelineExecutionStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PipelineExecutionStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
