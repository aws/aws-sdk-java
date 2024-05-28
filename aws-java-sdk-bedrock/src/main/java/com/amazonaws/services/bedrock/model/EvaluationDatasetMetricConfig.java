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
 * Defines the built-in prompt datasets, built-in metric names and custom metric names, and the task type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationDatasetMetricConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationDatasetMetricConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The task type you want the model to carry out.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * Specifies the prompt dataset.
     * </p>
     */
    private EvaluationDataset dataset;
    /**
     * <p>
     * The names of the metrics used. For automated model evaluation jobs valid values are
     * <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>. In
     * human-based model evaluation jobs the array of strings must match the <code>name</code> parameter specified in
     * <code>HumanEvaluationCustomMetric</code>.
     * </p>
     */
    private java.util.List<String> metricNames;

    /**
     * <p>
     * The task type you want the model to carry out.
     * </p>
     * 
     * @param taskType
     *        The task type you want the model to carry out.
     * @see EvaluationTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The task type you want the model to carry out.
     * </p>
     * 
     * @return The task type you want the model to carry out.
     * @see EvaluationTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The task type you want the model to carry out.
     * </p>
     * 
     * @param taskType
     *        The task type you want the model to carry out.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationTaskType
     */

    public EvaluationDatasetMetricConfig withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The task type you want the model to carry out.
     * </p>
     * 
     * @param taskType
     *        The task type you want the model to carry out.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationTaskType
     */

    public EvaluationDatasetMetricConfig withTaskType(EvaluationTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the prompt dataset.
     * </p>
     * 
     * @param dataset
     *        Specifies the prompt dataset.
     */

    public void setDataset(EvaluationDataset dataset) {
        this.dataset = dataset;
    }

    /**
     * <p>
     * Specifies the prompt dataset.
     * </p>
     * 
     * @return Specifies the prompt dataset.
     */

    public EvaluationDataset getDataset() {
        return this.dataset;
    }

    /**
     * <p>
     * Specifies the prompt dataset.
     * </p>
     * 
     * @param dataset
     *        Specifies the prompt dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationDatasetMetricConfig withDataset(EvaluationDataset dataset) {
        setDataset(dataset);
        return this;
    }

    /**
     * <p>
     * The names of the metrics used. For automated model evaluation jobs valid values are
     * <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>. In
     * human-based model evaluation jobs the array of strings must match the <code>name</code> parameter specified in
     * <code>HumanEvaluationCustomMetric</code>.
     * </p>
     * 
     * @return The names of the metrics used. For automated model evaluation jobs valid values are
     *         <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>.
     *         In human-based model evaluation jobs the array of strings must match the <code>name</code> parameter
     *         specified in <code>HumanEvaluationCustomMetric</code>.
     */

    public java.util.List<String> getMetricNames() {
        return metricNames;
    }

    /**
     * <p>
     * The names of the metrics used. For automated model evaluation jobs valid values are
     * <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>. In
     * human-based model evaluation jobs the array of strings must match the <code>name</code> parameter specified in
     * <code>HumanEvaluationCustomMetric</code>.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics used. For automated model evaluation jobs valid values are
     *        <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>.
     *        In human-based model evaluation jobs the array of strings must match the <code>name</code> parameter
     *        specified in <code>HumanEvaluationCustomMetric</code>.
     */

    public void setMetricNames(java.util.Collection<String> metricNames) {
        if (metricNames == null) {
            this.metricNames = null;
            return;
        }

        this.metricNames = new java.util.ArrayList<String>(metricNames);
    }

    /**
     * <p>
     * The names of the metrics used. For automated model evaluation jobs valid values are
     * <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>. In
     * human-based model evaluation jobs the array of strings must match the <code>name</code> parameter specified in
     * <code>HumanEvaluationCustomMetric</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricNames(java.util.Collection)} or {@link #withMetricNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics used. For automated model evaluation jobs valid values are
     *        <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>.
     *        In human-based model evaluation jobs the array of strings must match the <code>name</code> parameter
     *        specified in <code>HumanEvaluationCustomMetric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationDatasetMetricConfig withMetricNames(String... metricNames) {
        if (this.metricNames == null) {
            setMetricNames(new java.util.ArrayList<String>(metricNames.length));
        }
        for (String ele : metricNames) {
            this.metricNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the metrics used. For automated model evaluation jobs valid values are
     * <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>. In
     * human-based model evaluation jobs the array of strings must match the <code>name</code> parameter specified in
     * <code>HumanEvaluationCustomMetric</code>.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics used. For automated model evaluation jobs valid values are
     *        <code>"Builtin.Accuracy"</code>, <code>"Builtin.Robustness"</code>, and <code>"Builtin.Toxicity"</code>.
     *        In human-based model evaluation jobs the array of strings must match the <code>name</code> parameter
     *        specified in <code>HumanEvaluationCustomMetric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationDatasetMetricConfig withMetricNames(java.util.Collection<String> metricNames) {
        setMetricNames(metricNames);
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
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
        if (getDataset() != null)
            sb.append("Dataset: ").append(getDataset()).append(",");
        if (getMetricNames() != null)
            sb.append("MetricNames: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationDatasetMetricConfig == false)
            return false;
        EvaluationDatasetMetricConfig other = (EvaluationDatasetMetricConfig) obj;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        if (other.getMetricNames() == null ^ this.getMetricNames() == null)
            return false;
        if (other.getMetricNames() != null && other.getMetricNames().equals(this.getMetricNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
        hashCode = prime * hashCode + ((getMetricNames() == null) ? 0 : getMetricNames().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationDatasetMetricConfig clone() {
        try {
            return (EvaluationDatasetMetricConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationDatasetMetricConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
