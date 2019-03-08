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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code>. Amazon
 * SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job
 * uses as its objective metric to choose the best training job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MetricDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A regular expression that searches the output of a training job and gets the value of the metric. For more
     * information about using regular expressions to define metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     * Objective Metrics</a>.
     * </p>
     */
    private String regex;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets the value of the metric. For more
     * information about using regular expressions to define metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     * Objective Metrics</a>.
     * </p>
     * 
     * @param regex
     *        A regular expression that searches the output of a training job and gets the value of the metric. For more
     *        information about using regular expressions to define metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     *        Objective Metrics</a>.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets the value of the metric. For more
     * information about using regular expressions to define metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     * Objective Metrics</a>.
     * </p>
     * 
     * @return A regular expression that searches the output of a training job and gets the value of the metric. For
     *         more information about using regular expressions to define metrics, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     *         >Defining Objective Metrics</a>.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets the value of the metric. For more
     * information about using regular expressions to define metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     * Objective Metrics</a>.
     * </p>
     * 
     * @param regex
     *        A regular expression that searches the output of a training job and gets the value of the metric. For more
     *        information about using regular expressions to define metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html">Defining
     *        Objective Metrics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withRegex(String regex) {
        setRegex(regex);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDefinition == false)
            return false;
        MetricDefinition other = (MetricDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        return hashCode;
    }

    @Override
    public MetricDefinition clone() {
        try {
            return (MetricDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MetricDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
