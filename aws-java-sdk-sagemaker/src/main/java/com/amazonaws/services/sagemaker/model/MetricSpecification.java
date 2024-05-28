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
 * An object containing information about a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MetricSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a predefined metric.
     * </p>
     */
    private PredefinedMetricSpecification predefined;
    /**
     * <p>
     * Information about a customized metric.
     * </p>
     */
    private CustomizedMetricSpecification customized;

    /**
     * <p>
     * Information about a predefined metric.
     * </p>
     * 
     * @param predefined
     *        Information about a predefined metric.
     */

    public void setPredefined(PredefinedMetricSpecification predefined) {
        this.predefined = predefined;
    }

    /**
     * <p>
     * Information about a predefined metric.
     * </p>
     * 
     * @return Information about a predefined metric.
     */

    public PredefinedMetricSpecification getPredefined() {
        return this.predefined;
    }

    /**
     * <p>
     * Information about a predefined metric.
     * </p>
     * 
     * @param predefined
     *        Information about a predefined metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSpecification withPredefined(PredefinedMetricSpecification predefined) {
        setPredefined(predefined);
        return this;
    }

    /**
     * <p>
     * Information about a customized metric.
     * </p>
     * 
     * @param customized
     *        Information about a customized metric.
     */

    public void setCustomized(CustomizedMetricSpecification customized) {
        this.customized = customized;
    }

    /**
     * <p>
     * Information about a customized metric.
     * </p>
     * 
     * @return Information about a customized metric.
     */

    public CustomizedMetricSpecification getCustomized() {
        return this.customized;
    }

    /**
     * <p>
     * Information about a customized metric.
     * </p>
     * 
     * @param customized
     *        Information about a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSpecification withCustomized(CustomizedMetricSpecification customized) {
        setCustomized(customized);
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
        if (getPredefined() != null)
            sb.append("Predefined: ").append(getPredefined()).append(",");
        if (getCustomized() != null)
            sb.append("Customized: ").append(getCustomized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricSpecification == false)
            return false;
        MetricSpecification other = (MetricSpecification) obj;
        if (other.getPredefined() == null ^ this.getPredefined() == null)
            return false;
        if (other.getPredefined() != null && other.getPredefined().equals(this.getPredefined()) == false)
            return false;
        if (other.getCustomized() == null ^ this.getCustomized() == null)
            return false;
        if (other.getCustomized() != null && other.getCustomized().equals(this.getCustomized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefined() == null) ? 0 : getPredefined().hashCode());
        hashCode = prime * hashCode + ((getCustomized() == null) ? 0 : getCustomized().hashCode());
        return hashCode;
    }

    @Override
    public MetricSpecification clone() {
        try {
            return (MetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
