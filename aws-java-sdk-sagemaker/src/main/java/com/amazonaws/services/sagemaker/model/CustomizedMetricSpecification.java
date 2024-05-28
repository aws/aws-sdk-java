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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A customized metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CustomizedMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomizedMetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the customized metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the customized metric.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic of the customized metric.
     * </p>
     */
    private String statistic;

    /**
     * <p>
     * The name of the customized metric.
     * </p>
     * 
     * @param metricName
     *        The name of the customized metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the customized metric.
     * </p>
     * 
     * @return The name of the customized metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the customized metric.
     * </p>
     * 
     * @param metricName
     *        The name of the customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the customized metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the customized metric.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the customized metric.
     * </p>
     * 
     * @return The namespace of the customized metric.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the customized metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic of the customized metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the customized metric.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic of the customized metric.
     * </p>
     * 
     * @return The statistic of the customized metric.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic of the customized metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CustomizedMetricSpecification withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic of the customized metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CustomizedMetricSpecification withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomizedMetricSpecification == false)
            return false;
        CustomizedMetricSpecification other = (CustomizedMetricSpecification) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        return hashCode;
    }

    @Override
    public CustomizedMetricSpecification clone() {
        try {
            return (CustomizedMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CustomizedMetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
