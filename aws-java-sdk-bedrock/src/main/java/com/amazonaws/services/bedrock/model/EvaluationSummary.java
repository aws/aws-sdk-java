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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the model evaluation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The current status of the model evaluation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The type, either human or automatic, of model evaluation job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     */
    private java.util.List<String> evaluationTaskTypes;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * </p>
     */
    private java.util.List<String> modelIdentifiers;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @return The name of the model evaluation job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The current status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The current status of the model evaluation job.
     * @see EvaluationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model evaluation job.
     * </p>
     * 
     * @return The current status of the model evaluation job.
     * @see EvaluationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The current status of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public EvaluationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The current status of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public EvaluationSummary withStatus(EvaluationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @param creationTime
     *        When the model evaluation job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @return When the model evaluation job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @param creationTime
     *        When the model evaluation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The type, either human or automatic, of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type, either human or automatic, of model evaluation job.
     * @see EvaluationJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type, either human or automatic, of model evaluation job.
     * </p>
     * 
     * @return The type, either human or automatic, of model evaluation job.
     * @see EvaluationJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type, either human or automatic, of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type, either human or automatic, of model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobType
     */

    public EvaluationSummary withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type, either human or automatic, of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type, either human or automatic, of model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobType
     */

    public EvaluationSummary withJobType(EvaluationJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     * 
     * @return What task type was used in the model evaluation job.
     * @see EvaluationTaskType
     */

    public java.util.List<String> getEvaluationTaskTypes() {
        return evaluationTaskTypes;
    }

    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     * 
     * @param evaluationTaskTypes
     *        What task type was used in the model evaluation job.
     * @see EvaluationTaskType
     */

    public void setEvaluationTaskTypes(java.util.Collection<String> evaluationTaskTypes) {
        if (evaluationTaskTypes == null) {
            this.evaluationTaskTypes = null;
            return;
        }

        this.evaluationTaskTypes = new java.util.ArrayList<String>(evaluationTaskTypes);
    }

    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationTaskTypes(java.util.Collection)} or {@link #withEvaluationTaskTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param evaluationTaskTypes
     *        What task type was used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationTaskType
     */

    public EvaluationSummary withEvaluationTaskTypes(String... evaluationTaskTypes) {
        if (this.evaluationTaskTypes == null) {
            setEvaluationTaskTypes(new java.util.ArrayList<String>(evaluationTaskTypes.length));
        }
        for (String ele : evaluationTaskTypes) {
            this.evaluationTaskTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     * 
     * @param evaluationTaskTypes
     *        What task type was used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationTaskType
     */

    public EvaluationSummary withEvaluationTaskTypes(java.util.Collection<String> evaluationTaskTypes) {
        setEvaluationTaskTypes(evaluationTaskTypes);
        return this;
    }

    /**
     * <p>
     * What task type was used in the model evaluation job.
     * </p>
     * 
     * @param evaluationTaskTypes
     *        What task type was used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationTaskType
     */

    public EvaluationSummary withEvaluationTaskTypes(EvaluationTaskType... evaluationTaskTypes) {
        java.util.ArrayList<String> evaluationTaskTypesCopy = new java.util.ArrayList<String>(evaluationTaskTypes.length);
        for (EvaluationTaskType value : evaluationTaskTypes) {
            evaluationTaskTypesCopy.add(value.toString());
        }
        if (getEvaluationTaskTypes() == null) {
            setEvaluationTaskTypes(evaluationTaskTypesCopy);
        } else {
            getEvaluationTaskTypes().addAll(evaluationTaskTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     */

    public java.util.List<String> getModelIdentifiers() {
        return modelIdentifiers;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * </p>
     * 
     * @param modelIdentifiers
     *        The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     */

    public void setModelIdentifiers(java.util.Collection<String> modelIdentifiers) {
        if (modelIdentifiers == null) {
            this.modelIdentifiers = null;
            return;
        }

        this.modelIdentifiers = new java.util.ArrayList<String>(modelIdentifiers);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelIdentifiers(java.util.Collection)} or {@link #withModelIdentifiers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param modelIdentifiers
     *        The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationSummary withModelIdentifiers(String... modelIdentifiers) {
        if (this.modelIdentifiers == null) {
            setModelIdentifiers(new java.util.ArrayList<String>(modelIdentifiers.length));
        }
        for (String ele : modelIdentifiers) {
            this.modelIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * </p>
     * 
     * @param modelIdentifiers
     *        The Amazon Resource Names (ARNs) of the model(s) used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationSummary withModelIdentifiers(java.util.Collection<String> modelIdentifiers) {
        setModelIdentifiers(modelIdentifiers);
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getEvaluationTaskTypes() != null)
            sb.append("EvaluationTaskTypes: ").append(getEvaluationTaskTypes()).append(",");
        if (getModelIdentifiers() != null)
            sb.append("ModelIdentifiers: ").append(getModelIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationSummary == false)
            return false;
        EvaluationSummary other = (EvaluationSummary) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getEvaluationTaskTypes() == null ^ this.getEvaluationTaskTypes() == null)
            return false;
        if (other.getEvaluationTaskTypes() != null && other.getEvaluationTaskTypes().equals(this.getEvaluationTaskTypes()) == false)
            return false;
        if (other.getModelIdentifiers() == null ^ this.getModelIdentifiers() == null)
            return false;
        if (other.getModelIdentifiers() != null && other.getModelIdentifiers().equals(this.getModelIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getEvaluationTaskTypes() == null) ? 0 : getEvaluationTaskTypes().hashCode());
        hashCode = prime * hashCode + ((getModelIdentifiers() == null) ? 0 : getModelIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationSummary clone() {
        try {
            return (EvaluationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
