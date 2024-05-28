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
 * Specifies the custom metrics, how tasks will be rated, the flow definition ARN, and your custom prompt datasets.
 * Model evaluation jobs use human workers <i>only</i> support the use of custom prompt datasets. To learn more about
 * custom prompt datasets and the required format, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-prompt-datasets-custom.html">Custom
 * prompt datasets</a>.
 * </p>
 * <p>
 * When you create custom metrics in <code>HumanEvaluationCustomMetric</code> you must specify the metric's
 * <code>name</code>. The list of <code>names</code> specified in the <code>HumanEvaluationCustomMetric</code> array,
 * must match the <code>metricNames</code> array of strings specified in <code>EvaluationDatasetMetricConfig</code>. For
 * example, if in the <code>HumanEvaluationCustomMetric</code> array your specified the names
 * <code>"accuracy", "toxicity", "readability"</code> as custom metrics <i>then</i> the <code>metricNames</code> array
 * would need to look like the following <code>["accuracy", "toxicity", "readability"]</code> in
 * <code>EvaluationDatasetMetricConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/HumanEvaluationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanEvaluationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters of the human workflow.
     * </p>
     */
    private HumanWorkflowConfig humanWorkflowConfig;
    /**
     * <p>
     * A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are to be
     * evaluated, an optional description.
     * </p>
     */
    private java.util.List<HumanEvaluationCustomMetric> customMetrics;
    /**
     * <p>
     * Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * </p>
     */
    private java.util.List<EvaluationDatasetMetricConfig> datasetMetricConfigs;

    /**
     * <p>
     * The parameters of the human workflow.
     * </p>
     * 
     * @param humanWorkflowConfig
     *        The parameters of the human workflow.
     */

    public void setHumanWorkflowConfig(HumanWorkflowConfig humanWorkflowConfig) {
        this.humanWorkflowConfig = humanWorkflowConfig;
    }

    /**
     * <p>
     * The parameters of the human workflow.
     * </p>
     * 
     * @return The parameters of the human workflow.
     */

    public HumanWorkflowConfig getHumanWorkflowConfig() {
        return this.humanWorkflowConfig;
    }

    /**
     * <p>
     * The parameters of the human workflow.
     * </p>
     * 
     * @param humanWorkflowConfig
     *        The parameters of the human workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationConfig withHumanWorkflowConfig(HumanWorkflowConfig humanWorkflowConfig) {
        setHumanWorkflowConfig(humanWorkflowConfig);
        return this;
    }

    /**
     * <p>
     * A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are to be
     * evaluated, an optional description.
     * </p>
     * 
     * @return A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are
     *         to be evaluated, an optional description.
     */

    public java.util.List<HumanEvaluationCustomMetric> getCustomMetrics() {
        return customMetrics;
    }

    /**
     * <p>
     * A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are to be
     * evaluated, an optional description.
     * </p>
     * 
     * @param customMetrics
     *        A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are
     *        to be evaluated, an optional description.
     */

    public void setCustomMetrics(java.util.Collection<HumanEvaluationCustomMetric> customMetrics) {
        if (customMetrics == null) {
            this.customMetrics = null;
            return;
        }

        this.customMetrics = new java.util.ArrayList<HumanEvaluationCustomMetric>(customMetrics);
    }

    /**
     * <p>
     * A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are to be
     * evaluated, an optional description.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomMetrics(java.util.Collection)} or {@link #withCustomMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customMetrics
     *        A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are
     *        to be evaluated, an optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationConfig withCustomMetrics(HumanEvaluationCustomMetric... customMetrics) {
        if (this.customMetrics == null) {
            setCustomMetrics(new java.util.ArrayList<HumanEvaluationCustomMetric>(customMetrics.length));
        }
        for (HumanEvaluationCustomMetric ele : customMetrics) {
            this.customMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are to be
     * evaluated, an optional description.
     * </p>
     * 
     * @param customMetrics
     *        A <code>HumanEvaluationCustomMetric</code> object. It contains the names the metrics, how the metrics are
     *        to be evaluated, an optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationConfig withCustomMetrics(java.util.Collection<HumanEvaluationCustomMetric> customMetrics) {
        setCustomMetrics(customMetrics);
        return this;
    }

    /**
     * <p>
     * Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * </p>
     * 
     * @return Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     */

    public java.util.List<EvaluationDatasetMetricConfig> getDatasetMetricConfigs() {
        return datasetMetricConfigs;
    }

    /**
     * <p>
     * Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     */

    public void setDatasetMetricConfigs(java.util.Collection<EvaluationDatasetMetricConfig> datasetMetricConfigs) {
        if (datasetMetricConfigs == null) {
            this.datasetMetricConfigs = null;
            return;
        }

        this.datasetMetricConfigs = new java.util.ArrayList<EvaluationDatasetMetricConfig>(datasetMetricConfigs);
    }

    /**
     * <p>
     * Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetMetricConfigs(java.util.Collection)} or {@link #withDatasetMetricConfigs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationConfig withDatasetMetricConfigs(EvaluationDatasetMetricConfig... datasetMetricConfigs) {
        if (this.datasetMetricConfigs == null) {
            setDatasetMetricConfigs(new java.util.ArrayList<EvaluationDatasetMetricConfig>(datasetMetricConfigs.length));
        }
        for (EvaluationDatasetMetricConfig ele : datasetMetricConfigs) {
            this.datasetMetricConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Use to specify the metrics, task, and prompt dataset to be used in your model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationConfig withDatasetMetricConfigs(java.util.Collection<EvaluationDatasetMetricConfig> datasetMetricConfigs) {
        setDatasetMetricConfigs(datasetMetricConfigs);
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
        if (getHumanWorkflowConfig() != null)
            sb.append("HumanWorkflowConfig: ").append(getHumanWorkflowConfig()).append(",");
        if (getCustomMetrics() != null)
            sb.append("CustomMetrics: ").append(getCustomMetrics()).append(",");
        if (getDatasetMetricConfigs() != null)
            sb.append("DatasetMetricConfigs: ").append(getDatasetMetricConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanEvaluationConfig == false)
            return false;
        HumanEvaluationConfig other = (HumanEvaluationConfig) obj;
        if (other.getHumanWorkflowConfig() == null ^ this.getHumanWorkflowConfig() == null)
            return false;
        if (other.getHumanWorkflowConfig() != null && other.getHumanWorkflowConfig().equals(this.getHumanWorkflowConfig()) == false)
            return false;
        if (other.getCustomMetrics() == null ^ this.getCustomMetrics() == null)
            return false;
        if (other.getCustomMetrics() != null && other.getCustomMetrics().equals(this.getCustomMetrics()) == false)
            return false;
        if (other.getDatasetMetricConfigs() == null ^ this.getDatasetMetricConfigs() == null)
            return false;
        if (other.getDatasetMetricConfigs() != null && other.getDatasetMetricConfigs().equals(this.getDatasetMetricConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanWorkflowConfig() == null) ? 0 : getHumanWorkflowConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomMetrics() == null) ? 0 : getCustomMetrics().hashCode());
        hashCode = prime * hashCode + ((getDatasetMetricConfigs() == null) ? 0 : getDatasetMetricConfigs().hashCode());
        return hashCode;
    }

    @Override
    public HumanEvaluationConfig clone() {
        try {
            return (HumanEvaluationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.HumanEvaluationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
