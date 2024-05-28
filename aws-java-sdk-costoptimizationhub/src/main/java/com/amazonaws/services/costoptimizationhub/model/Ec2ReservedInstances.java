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
 * The EC2 reserved instances recommendation details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/Ec2ReservedInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2ReservedInstances implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The EC2 reserved instances configuration used for recommendations.
     * </p>
     */
    private Ec2ReservedInstancesConfiguration configuration;
    /**
     * <p>
     * Cost impact of the purchase recommendation.
     * </p>
     */
    private ReservedInstancesCostCalculation costCalculation;

    /**
     * <p>
     * The EC2 reserved instances configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The EC2 reserved instances configuration used for recommendations.
     */

    public void setConfiguration(Ec2ReservedInstancesConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The EC2 reserved instances configuration used for recommendations.
     * </p>
     * 
     * @return The EC2 reserved instances configuration used for recommendations.
     */

    public Ec2ReservedInstancesConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The EC2 reserved instances configuration used for recommendations.
     * </p>
     * 
     * @param configuration
     *        The EC2 reserved instances configuration used for recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2ReservedInstances withConfiguration(Ec2ReservedInstancesConfiguration configuration) {
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

    public Ec2ReservedInstances withCostCalculation(ReservedInstancesCostCalculation costCalculation) {
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

        if (obj instanceof Ec2ReservedInstances == false)
            return false;
        Ec2ReservedInstances other = (Ec2ReservedInstances) obj;
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
    public Ec2ReservedInstances clone() {
        try {
            return (Ec2ReservedInstances) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.Ec2ReservedInstancesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
