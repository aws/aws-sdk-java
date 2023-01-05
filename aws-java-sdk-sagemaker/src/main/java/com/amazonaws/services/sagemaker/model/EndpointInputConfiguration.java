/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The endpoint configuration for the load test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointInputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointInputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance types to use for the load test.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     */
    private String inferenceSpecificationName;
    /**
     * <p>
     * The parameter you want to benchmark against.
     * </p>
     */
    private EnvironmentParameterRanges environmentParameterRanges;

    /**
     * <p>
     * The instance types to use for the load test.
     * </p>
     * 
     * @param instanceType
     *        The instance types to use for the load test.
     * @see ProductionVariantInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance types to use for the load test.
     * </p>
     * 
     * @return The instance types to use for the load test.
     * @see ProductionVariantInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance types to use for the load test.
     * </p>
     * 
     * @param instanceType
     *        The instance types to use for the load test.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public EndpointInputConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance types to use for the load test.
     * </p>
     * 
     * @param instanceType
     *        The instance types to use for the load test.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public EndpointInputConfiguration withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @param inferenceSpecificationName
     *        The inference specification name in the model package version.
     */

    public void setInferenceSpecificationName(String inferenceSpecificationName) {
        this.inferenceSpecificationName = inferenceSpecificationName;
    }

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @return The inference specification name in the model package version.
     */

    public String getInferenceSpecificationName() {
        return this.inferenceSpecificationName;
    }

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @param inferenceSpecificationName
     *        The inference specification name in the model package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInputConfiguration withInferenceSpecificationName(String inferenceSpecificationName) {
        setInferenceSpecificationName(inferenceSpecificationName);
        return this;
    }

    /**
     * <p>
     * The parameter you want to benchmark against.
     * </p>
     * 
     * @param environmentParameterRanges
     *        The parameter you want to benchmark against.
     */

    public void setEnvironmentParameterRanges(EnvironmentParameterRanges environmentParameterRanges) {
        this.environmentParameterRanges = environmentParameterRanges;
    }

    /**
     * <p>
     * The parameter you want to benchmark against.
     * </p>
     * 
     * @return The parameter you want to benchmark against.
     */

    public EnvironmentParameterRanges getEnvironmentParameterRanges() {
        return this.environmentParameterRanges;
    }

    /**
     * <p>
     * The parameter you want to benchmark against.
     * </p>
     * 
     * @param environmentParameterRanges
     *        The parameter you want to benchmark against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInputConfiguration withEnvironmentParameterRanges(EnvironmentParameterRanges environmentParameterRanges) {
        setEnvironmentParameterRanges(environmentParameterRanges);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInferenceSpecificationName() != null)
            sb.append("InferenceSpecificationName: ").append(getInferenceSpecificationName()).append(",");
        if (getEnvironmentParameterRanges() != null)
            sb.append("EnvironmentParameterRanges: ").append(getEnvironmentParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointInputConfiguration == false)
            return false;
        EndpointInputConfiguration other = (EndpointInputConfiguration) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInferenceSpecificationName() == null ^ this.getInferenceSpecificationName() == null)
            return false;
        if (other.getInferenceSpecificationName() != null && other.getInferenceSpecificationName().equals(this.getInferenceSpecificationName()) == false)
            return false;
        if (other.getEnvironmentParameterRanges() == null ^ this.getEnvironmentParameterRanges() == null)
            return false;
        if (other.getEnvironmentParameterRanges() != null && other.getEnvironmentParameterRanges().equals(this.getEnvironmentParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecificationName() == null) ? 0 : getInferenceSpecificationName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentParameterRanges() == null) ? 0 : getEnvironmentParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public EndpointInputConfiguration clone() {
        try {
            return (EndpointInputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointInputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
