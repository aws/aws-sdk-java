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
 * Detailed information about the source of a trial component. Either <code>ProcessingJob</code> or
 * <code>TrainingJob</code> is returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentSourceDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentSourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * Information about a training job that's the source of a trial component.
     * </p>
     */
    private TrainingJob trainingJob;
    /**
     * <p>
     * Information about a processing job that's the source of a trial component.
     * </p>
     */
    private ProcessingJob processingJob;
    /**
     * <p>
     * Information about a transform job that's the source of a trial component.
     * </p>
     */
    private TransformJob transformJob;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSourceDetail withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * Information about a training job that's the source of a trial component.
     * </p>
     * 
     * @param trainingJob
     *        Information about a training job that's the source of a trial component.
     */

    public void setTrainingJob(TrainingJob trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * Information about a training job that's the source of a trial component.
     * </p>
     * 
     * @return Information about a training job that's the source of a trial component.
     */

    public TrainingJob getTrainingJob() {
        return this.trainingJob;
    }

    /**
     * <p>
     * Information about a training job that's the source of a trial component.
     * </p>
     * 
     * @param trainingJob
     *        Information about a training job that's the source of a trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSourceDetail withTrainingJob(TrainingJob trainingJob) {
        setTrainingJob(trainingJob);
        return this;
    }

    /**
     * <p>
     * Information about a processing job that's the source of a trial component.
     * </p>
     * 
     * @param processingJob
     *        Information about a processing job that's the source of a trial component.
     */

    public void setProcessingJob(ProcessingJob processingJob) {
        this.processingJob = processingJob;
    }

    /**
     * <p>
     * Information about a processing job that's the source of a trial component.
     * </p>
     * 
     * @return Information about a processing job that's the source of a trial component.
     */

    public ProcessingJob getProcessingJob() {
        return this.processingJob;
    }

    /**
     * <p>
     * Information about a processing job that's the source of a trial component.
     * </p>
     * 
     * @param processingJob
     *        Information about a processing job that's the source of a trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSourceDetail withProcessingJob(ProcessingJob processingJob) {
        setProcessingJob(processingJob);
        return this;
    }

    /**
     * <p>
     * Information about a transform job that's the source of a trial component.
     * </p>
     * 
     * @param transformJob
     *        Information about a transform job that's the source of a trial component.
     */

    public void setTransformJob(TransformJob transformJob) {
        this.transformJob = transformJob;
    }

    /**
     * <p>
     * Information about a transform job that's the source of a trial component.
     * </p>
     * 
     * @return Information about a transform job that's the source of a trial component.
     */

    public TransformJob getTransformJob() {
        return this.transformJob;
    }

    /**
     * <p>
     * Information about a transform job that's the source of a trial component.
     * </p>
     * 
     * @param transformJob
     *        Information about a transform job that's the source of a trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSourceDetail withTransformJob(TransformJob transformJob) {
        setTransformJob(transformJob);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTrainingJob() != null)
            sb.append("TrainingJob: ").append(getTrainingJob()).append(",");
        if (getProcessingJob() != null)
            sb.append("ProcessingJob: ").append(getProcessingJob()).append(",");
        if (getTransformJob() != null)
            sb.append("TransformJob: ").append(getTransformJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSourceDetail == false)
            return false;
        TrialComponentSourceDetail other = (TrialComponentSourceDetail) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getProcessingJob() == null) ? 0 : getProcessingJob().hashCode());
        hashCode = prime * hashCode + ((getTransformJob() == null) ? 0 : getTransformJob().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentSourceDetail clone() {
        try {
            return (TrialComponentSourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentSourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
