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
 * Specifies weight and capacity values for a production variant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DesiredWeightAndCapacity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DesiredWeightAndCapacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * The variant's weight.
     * </p>
     */
    private Float desiredWeight;
    /**
     * <p>
     * The variant's capacity.
     * </p>
     */
    private Integer desiredInstanceCount;
    /**
     * <p>
     * Specifies the serverless update concurrency configuration for an endpoint variant.
     * </p>
     */
    private ProductionVariantServerlessUpdateConfig serverlessUpdateConfig;

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * 
     * @param variantName
     *        The name of the variant to update.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * 
     * @return The name of the variant to update.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the variant to update.
     * </p>
     * 
     * @param variantName
     *        The name of the variant to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredWeightAndCapacity withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * 
     * @param desiredWeight
     *        The variant's weight.
     */

    public void setDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * 
     * @return The variant's weight.
     */

    public Float getDesiredWeight() {
        return this.desiredWeight;
    }

    /**
     * <p>
     * The variant's weight.
     * </p>
     * 
     * @param desiredWeight
     *        The variant's weight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredWeightAndCapacity withDesiredWeight(Float desiredWeight) {
        setDesiredWeight(desiredWeight);
        return this;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The variant's capacity.
     */

    public void setDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * 
     * @return The variant's capacity.
     */

    public Integer getDesiredInstanceCount() {
        return this.desiredInstanceCount;
    }

    /**
     * <p>
     * The variant's capacity.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The variant's capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredWeightAndCapacity withDesiredInstanceCount(Integer desiredInstanceCount) {
        setDesiredInstanceCount(desiredInstanceCount);
        return this;
    }

    /**
     * <p>
     * Specifies the serverless update concurrency configuration for an endpoint variant.
     * </p>
     * 
     * @param serverlessUpdateConfig
     *        Specifies the serverless update concurrency configuration for an endpoint variant.
     */

    public void setServerlessUpdateConfig(ProductionVariantServerlessUpdateConfig serverlessUpdateConfig) {
        this.serverlessUpdateConfig = serverlessUpdateConfig;
    }

    /**
     * <p>
     * Specifies the serverless update concurrency configuration for an endpoint variant.
     * </p>
     * 
     * @return Specifies the serverless update concurrency configuration for an endpoint variant.
     */

    public ProductionVariantServerlessUpdateConfig getServerlessUpdateConfig() {
        return this.serverlessUpdateConfig;
    }

    /**
     * <p>
     * Specifies the serverless update concurrency configuration for an endpoint variant.
     * </p>
     * 
     * @param serverlessUpdateConfig
     *        Specifies the serverless update concurrency configuration for an endpoint variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredWeightAndCapacity withServerlessUpdateConfig(ProductionVariantServerlessUpdateConfig serverlessUpdateConfig) {
        setServerlessUpdateConfig(serverlessUpdateConfig);
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
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getDesiredWeight() != null)
            sb.append("DesiredWeight: ").append(getDesiredWeight()).append(",");
        if (getDesiredInstanceCount() != null)
            sb.append("DesiredInstanceCount: ").append(getDesiredInstanceCount()).append(",");
        if (getServerlessUpdateConfig() != null)
            sb.append("ServerlessUpdateConfig: ").append(getServerlessUpdateConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DesiredWeightAndCapacity == false)
            return false;
        DesiredWeightAndCapacity other = (DesiredWeightAndCapacity) obj;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getDesiredWeight() == null ^ this.getDesiredWeight() == null)
            return false;
        if (other.getDesiredWeight() != null && other.getDesiredWeight().equals(this.getDesiredWeight()) == false)
            return false;
        if (other.getDesiredInstanceCount() == null ^ this.getDesiredInstanceCount() == null)
            return false;
        if (other.getDesiredInstanceCount() != null && other.getDesiredInstanceCount().equals(this.getDesiredInstanceCount()) == false)
            return false;
        if (other.getServerlessUpdateConfig() == null ^ this.getServerlessUpdateConfig() == null)
            return false;
        if (other.getServerlessUpdateConfig() != null && other.getServerlessUpdateConfig().equals(this.getServerlessUpdateConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getDesiredWeight() == null) ? 0 : getDesiredWeight().hashCode());
        hashCode = prime * hashCode + ((getDesiredInstanceCount() == null) ? 0 : getDesiredInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getServerlessUpdateConfig() == null) ? 0 : getServerlessUpdateConfig().hashCode());
        return hashCode;
    }

    @Override
    public DesiredWeightAndCapacity clone() {
        try {
            return (DesiredWeightAndCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DesiredWeightAndCapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
