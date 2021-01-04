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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metric policy that is associated with the container. A metric policy allows AWS Elemental MediaStore to send
 * metrics to Amazon CloudWatch. In the policy, you must indicate whether you want MediaStore to send container-level
 * metrics. You can also include rules to define groups of objects that you want MediaStore to send object-level metrics
 * for.
 * </p>
 * <p>
 * To view examples of how to construct a metric policy for your use case, see <a
 * href="https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html">Example Metric Policies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/MetricPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A setting to enable or disable metrics at the container level.
     * </p>
     */
    private String containerLevelMetrics;
    /**
     * <p>
     * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but
     * if you choose to include it, you must also include at least one rule. By default, you can include up to five
     * rules. You can also <a
     * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
     * quota increase</a> to allow up to 300 rules per policy.
     * </p>
     */
    private java.util.List<MetricPolicyRule> metricPolicyRules;

    /**
     * <p>
     * A setting to enable or disable metrics at the container level.
     * </p>
     * 
     * @param containerLevelMetrics
     *        A setting to enable or disable metrics at the container level.
     * @see ContainerLevelMetrics
     */

    public void setContainerLevelMetrics(String containerLevelMetrics) {
        this.containerLevelMetrics = containerLevelMetrics;
    }

    /**
     * <p>
     * A setting to enable or disable metrics at the container level.
     * </p>
     * 
     * @return A setting to enable or disable metrics at the container level.
     * @see ContainerLevelMetrics
     */

    public String getContainerLevelMetrics() {
        return this.containerLevelMetrics;
    }

    /**
     * <p>
     * A setting to enable or disable metrics at the container level.
     * </p>
     * 
     * @param containerLevelMetrics
     *        A setting to enable or disable metrics at the container level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerLevelMetrics
     */

    public MetricPolicy withContainerLevelMetrics(String containerLevelMetrics) {
        setContainerLevelMetrics(containerLevelMetrics);
        return this;
    }

    /**
     * <p>
     * A setting to enable or disable metrics at the container level.
     * </p>
     * 
     * @param containerLevelMetrics
     *        A setting to enable or disable metrics at the container level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerLevelMetrics
     */

    public MetricPolicy withContainerLevelMetrics(ContainerLevelMetrics containerLevelMetrics) {
        this.containerLevelMetrics = containerLevelMetrics.toString();
        return this;
    }

    /**
     * <p>
     * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but
     * if you choose to include it, you must also include at least one rule. By default, you can include up to five
     * rules. You can also <a
     * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
     * quota increase</a> to allow up to 300 rules per policy.
     * </p>
     * 
     * @return A parameter that holds an array of rules that enable metrics at the object level. This parameter is
     *         optional, but if you choose to include it, you must also include at least one rule. By default, you can
     *         include up to five rules. You can also <a
     *         href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas"
     *         >request a quota increase</a> to allow up to 300 rules per policy.
     */

    public java.util.List<MetricPolicyRule> getMetricPolicyRules() {
        return metricPolicyRules;
    }

    /**
     * <p>
     * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but
     * if you choose to include it, you must also include at least one rule. By default, you can include up to five
     * rules. You can also <a
     * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
     * quota increase</a> to allow up to 300 rules per policy.
     * </p>
     * 
     * @param metricPolicyRules
     *        A parameter that holds an array of rules that enable metrics at the object level. This parameter is
     *        optional, but if you choose to include it, you must also include at least one rule. By default, you can
     *        include up to five rules. You can also <a
     *        href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas"
     *        >request a quota increase</a> to allow up to 300 rules per policy.
     */

    public void setMetricPolicyRules(java.util.Collection<MetricPolicyRule> metricPolicyRules) {
        if (metricPolicyRules == null) {
            this.metricPolicyRules = null;
            return;
        }

        this.metricPolicyRules = new java.util.ArrayList<MetricPolicyRule>(metricPolicyRules);
    }

    /**
     * <p>
     * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but
     * if you choose to include it, you must also include at least one rule. By default, you can include up to five
     * rules. You can also <a
     * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
     * quota increase</a> to allow up to 300 rules per policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricPolicyRules(java.util.Collection)} or {@link #withMetricPolicyRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricPolicyRules
     *        A parameter that holds an array of rules that enable metrics at the object level. This parameter is
     *        optional, but if you choose to include it, you must also include at least one rule. By default, you can
     *        include up to five rules. You can also <a
     *        href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas"
     *        >request a quota increase</a> to allow up to 300 rules per policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPolicy withMetricPolicyRules(MetricPolicyRule... metricPolicyRules) {
        if (this.metricPolicyRules == null) {
            setMetricPolicyRules(new java.util.ArrayList<MetricPolicyRule>(metricPolicyRules.length));
        }
        for (MetricPolicyRule ele : metricPolicyRules) {
            this.metricPolicyRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but
     * if you choose to include it, you must also include at least one rule. By default, you can include up to five
     * rules. You can also <a
     * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
     * quota increase</a> to allow up to 300 rules per policy.
     * </p>
     * 
     * @param metricPolicyRules
     *        A parameter that holds an array of rules that enable metrics at the object level. This parameter is
     *        optional, but if you choose to include it, you must also include at least one rule. By default, you can
     *        include up to five rules. You can also <a
     *        href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas"
     *        >request a quota increase</a> to allow up to 300 rules per policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPolicy withMetricPolicyRules(java.util.Collection<MetricPolicyRule> metricPolicyRules) {
        setMetricPolicyRules(metricPolicyRules);
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
        if (getContainerLevelMetrics() != null)
            sb.append("ContainerLevelMetrics: ").append(getContainerLevelMetrics()).append(",");
        if (getMetricPolicyRules() != null)
            sb.append("MetricPolicyRules: ").append(getMetricPolicyRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricPolicy == false)
            return false;
        MetricPolicy other = (MetricPolicy) obj;
        if (other.getContainerLevelMetrics() == null ^ this.getContainerLevelMetrics() == null)
            return false;
        if (other.getContainerLevelMetrics() != null && other.getContainerLevelMetrics().equals(this.getContainerLevelMetrics()) == false)
            return false;
        if (other.getMetricPolicyRules() == null ^ this.getMetricPolicyRules() == null)
            return false;
        if (other.getMetricPolicyRules() != null && other.getMetricPolicyRules().equals(this.getMetricPolicyRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerLevelMetrics() == null) ? 0 : getContainerLevelMetrics().hashCode());
        hashCode = prime * hashCode + ((getMetricPolicyRules() == null) ? 0 : getMetricPolicyRules().hashCode());
        return hashCode;
    }

    @Override
    public MetricPolicy clone() {
        try {
            return (MetricPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediastore.model.transform.MetricPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
