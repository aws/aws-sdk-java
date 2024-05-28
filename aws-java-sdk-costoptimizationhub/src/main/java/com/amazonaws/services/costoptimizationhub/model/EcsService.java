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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ECS service recommendation details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/EcsService" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ECS service configuration used for recommendations.
     * </p>
     */
    private EcsServiceConfiguration configuration;
    /**
     * <p>
     * Cost impact of the recommendation.
     * </p>
     */
    private ResourceCostCalculation costCalculation;

    /**
     * <p>
     * The ECS service configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The ECS service configuration used for recommendations.
     */

    public void setConfiguration(EcsServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The ECS service configuration used for recommendations.
     * </p>
     * 
     * @return The ECS service configuration used for recommendations.
     */

    public EcsServiceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The ECS service configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The ECS service configuration used for recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsService withConfiguration(EcsServiceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Cost impact of the recommendation.
     * </p>
     * 
     * @param costCalculation
     *        Cost impact of the recommendation.
     */

    public void setCostCalculation(ResourceCostCalculation costCalculation) {
        this.costCalculation = costCalculation;
    }

    /**
     * <p>
     * Cost impact of the recommendation.
     * </p>
     * 
     * @return Cost impact of the recommendation.
     */

    public ResourceCostCalculation getCostCalculation() {
        return this.costCalculation;
    }

    /**
     * <p>
     * Cost impact of the recommendation.
     * </p>
     * 
     * @param costCalculation
     *        Cost impact of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsService withCostCalculation(ResourceCostCalculation costCalculation) {
        setCostCalculation(costCalculation);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCostCalculation() != null)
            sb.append("CostCalculation: ").append(getCostCalculation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsService == false)
            return false;
        EcsService other = (EcsService) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCostCalculation() == null ^ this.getCostCalculation() == null)
            return false;
        if (other.getCostCalculation() != null && other.getCostCalculation().equals(this.getCostCalculation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCostCalculation() == null) ? 0 : getCostCalculation().hashCode());
        return hashCode;
    }

    @Override
    public EcsService clone() {
        try {
            return (EcsService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.EcsServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
