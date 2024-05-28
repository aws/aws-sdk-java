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
 * A specification for a predefined metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PredefinedMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedMetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     * </p>
     */
    private String predefinedMetricType;

    /**
     * <p>
     * The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     */

    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     * </p>
     * 
     * @return The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     */

    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. You can only apply SageMaker metric types to SageMaker endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        setPredefinedMetricType(predefinedMetricType);
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
        if (getPredefinedMetricType() != null)
            sb.append("PredefinedMetricType: ").append(getPredefinedMetricType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedMetricSpecification == false)
            return false;
        PredefinedMetricSpecification other = (PredefinedMetricSpecification) obj;
        if (other.getPredefinedMetricType() == null ^ this.getPredefinedMetricType() == null)
            return false;
        if (other.getPredefinedMetricType() != null && other.getPredefinedMetricType().equals(this.getPredefinedMetricType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedMetricType() == null) ? 0 : getPredefinedMetricType().hashCode());
        return hashCode;
    }

    @Override
    public PredefinedMetricSpecification clone() {
        try {
            return (PredefinedMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PredefinedMetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
