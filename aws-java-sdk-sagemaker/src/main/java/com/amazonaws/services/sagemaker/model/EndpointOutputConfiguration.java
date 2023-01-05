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
 * The endpoint configuration made by Inference Recommender during a recommendation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointOutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointOutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint made during a recommendation job.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of the production variant (deployed model) made during a recommendation job.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * The instance type recommended by Amazon SageMaker Inference Recommender.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances recommended to launch initially.
     * </p>
     */
    private Integer initialInstanceCount;

    /**
     * <p>
     * The name of the endpoint made during a recommendation job.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint made during a recommendation job.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint made during a recommendation job.
     * </p>
     * 
     * @return The name of the endpoint made during a recommendation job.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint made during a recommendation job.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint made during a recommendation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointOutputConfiguration withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of the production variant (deployed model) made during a recommendation job.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant (deployed model) made during a recommendation job.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the production variant (deployed model) made during a recommendation job.
     * </p>
     * 
     * @return The name of the production variant (deployed model) made during a recommendation job.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the production variant (deployed model) made during a recommendation job.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant (deployed model) made during a recommendation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointOutputConfiguration withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The instance type recommended by Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param instanceType
     *        The instance type recommended by Amazon SageMaker Inference Recommender.
     * @see ProductionVariantInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type recommended by Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @return The instance type recommended by Amazon SageMaker Inference Recommender.
     * @see ProductionVariantInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type recommended by Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param instanceType
     *        The instance type recommended by Amazon SageMaker Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public EndpointOutputConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type recommended by Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param instanceType
     *        The instance type recommended by Amazon SageMaker Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public EndpointOutputConfiguration withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances recommended to launch initially.
     * </p>
     * 
     * @param initialInstanceCount
     *        The number of instances recommended to launch initially.
     */

    public void setInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
    }

    /**
     * <p>
     * The number of instances recommended to launch initially.
     * </p>
     * 
     * @return The number of instances recommended to launch initially.
     */

    public Integer getInitialInstanceCount() {
        return this.initialInstanceCount;
    }

    /**
     * <p>
     * The number of instances recommended to launch initially.
     * </p>
     * 
     * @param initialInstanceCount
     *        The number of instances recommended to launch initially.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointOutputConfiguration withInitialInstanceCount(Integer initialInstanceCount) {
        setInitialInstanceCount(initialInstanceCount);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInitialInstanceCount() != null)
            sb.append("InitialInstanceCount: ").append(getInitialInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointOutputConfiguration == false)
            return false;
        EndpointOutputConfiguration other = (EndpointOutputConfiguration) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInitialInstanceCount() == null ^ this.getInitialInstanceCount() == null)
            return false;
        if (other.getInitialInstanceCount() != null && other.getInitialInstanceCount().equals(this.getInitialInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInitialInstanceCount() == null) ? 0 : getInitialInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public EndpointOutputConfiguration clone() {
        try {
            return (EndpointOutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointOutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
