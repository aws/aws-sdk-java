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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when services
 * or tasks are run without a specified launch type or capacity provider strategy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsClusterDefaultCapacityProviderStrategyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsClusterDefaultCapacityProviderStrategyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of tasks to run on the specified capacity provider.
     * </p>
     */
    private Integer base;
    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     */
    private String capacityProvider;
    /**
     * <p>
     * The relative percentage of the total number of tasks launched that should use the capacity provider.
     * </p>
     */
    private Integer weight;

    /**
     * <p>
     * The minimum number of tasks to run on the specified capacity provider.
     * </p>
     * 
     * @param base
     *        The minimum number of tasks to run on the specified capacity provider.
     */

    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * <p>
     * The minimum number of tasks to run on the specified capacity provider.
     * </p>
     * 
     * @return The minimum number of tasks to run on the specified capacity provider.
     */

    public Integer getBase() {
        return this.base;
    }

    /**
     * <p>
     * The minimum number of tasks to run on the specified capacity provider.
     * </p>
     * 
     * @param base
     *        The minimum number of tasks to run on the specified capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDefaultCapacityProviderStrategyDetails withBase(Integer base) {
        setBase(base);
        return this;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The name of the capacity provider.
     */

    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     * 
     * @return The name of the capacity provider.
     */

    public String getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The name of the capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDefaultCapacityProviderStrategyDetails withCapacityProvider(String capacityProvider) {
        setCapacityProvider(capacityProvider);
        return this;
    }

    /**
     * <p>
     * The relative percentage of the total number of tasks launched that should use the capacity provider.
     * </p>
     * 
     * @param weight
     *        The relative percentage of the total number of tasks launched that should use the capacity provider.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The relative percentage of the total number of tasks launched that should use the capacity provider.
     * </p>
     * 
     * @return The relative percentage of the total number of tasks launched that should use the capacity provider.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The relative percentage of the total number of tasks launched that should use the capacity provider.
     * </p>
     * 
     * @param weight
     *        The relative percentage of the total number of tasks launched that should use the capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDefaultCapacityProviderStrategyDetails withWeight(Integer weight) {
        setWeight(weight);
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
        if (getBase() != null)
            sb.append("Base: ").append(getBase()).append(",");
        if (getCapacityProvider() != null)
            sb.append("CapacityProvider: ").append(getCapacityProvider()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsClusterDefaultCapacityProviderStrategyDetails == false)
            return false;
        AwsEcsClusterDefaultCapacityProviderStrategyDetails other = (AwsEcsClusterDefaultCapacityProviderStrategyDetails) obj;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        hashCode = prime * hashCode + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsClusterDefaultCapacityProviderStrategyDetails clone() {
        try {
            return (AwsEcsClusterDefaultCapacityProviderStrategyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsClusterDefaultCapacityProviderStrategyDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
