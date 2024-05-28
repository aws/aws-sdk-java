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
 * The OpenSearch reserved instances recommendation details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/OpenSearchReservedInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenSearchReservedInstances implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OpenSearch reserved instances configuration used for recommendations.
     * </p>
     */
    private OpenSearchReservedInstancesConfiguration configuration;
    /**
     * <p>
     * Cost impact of the purchase recommendation.
     * </p>
     */
    private ReservedInstancesCostCalculation costCalculation;

    /**
     * <p>
     * The OpenSearch reserved instances configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The OpenSearch reserved instances configuration used for recommendations.
     */

    public void setConfiguration(OpenSearchReservedInstancesConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The OpenSearch reserved instances configuration used for recommendations.
     * </p>
     * 
     * @return The OpenSearch reserved instances configuration used for recommendations.
     */

    public OpenSearchReservedInstancesConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The OpenSearch reserved instances configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The OpenSearch reserved instances configuration used for recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchReservedInstances withConfiguration(OpenSearchReservedInstancesConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Cost impact of the purchase recommendation.
     * </p>
     * 
     * @param costCalculation
     *        Cost impact of the purchase recommendation.
     */

    public void setCostCalculation(ReservedInstancesCostCalculation costCalculation) {
        this.costCalculation = costCalculation;
    }

    /**
     * <p>
     * Cost impact of the purchase recommendation.
     * </p>
     * 
     * @return Cost impact of the purchase recommendation.
     */

    public ReservedInstancesCostCalculation getCostCalculation() {
        return this.costCalculation;
    }

    /**
     * <p>
     * Cost impact of the purchase recommendation.
     * </p>
     * 
     * @param costCalculation
     *        Cost impact of the purchase recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchReservedInstances withCostCalculation(ReservedInstancesCostCalculation costCalculation) {
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

        if (obj instanceof OpenSearchReservedInstances == false)
            return false;
        OpenSearchReservedInstances other = (OpenSearchReservedInstances) obj;
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
    public OpenSearchReservedInstances clone() {
        try {
            return (OpenSearchReservedInstances) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.OpenSearchReservedInstancesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
