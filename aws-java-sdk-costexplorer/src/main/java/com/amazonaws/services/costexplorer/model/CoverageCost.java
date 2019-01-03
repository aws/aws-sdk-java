/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How much it cost to run an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CoverageCost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageCost implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How much an On-Demand instance cost.
     * </p>
     */
    private String onDemandCost;

    /**
     * <p>
     * How much an On-Demand instance cost.
     * </p>
     * 
     * @param onDemandCost
     *        How much an On-Demand instance cost.
     */

    public void setOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
    }

    /**
     * <p>
     * How much an On-Demand instance cost.
     * </p>
     * 
     * @return How much an On-Demand instance cost.
     */

    public String getOnDemandCost() {
        return this.onDemandCost;
    }

    /**
     * <p>
     * How much an On-Demand instance cost.
     * </p>
     * 
     * @param onDemandCost
     *        How much an On-Demand instance cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageCost withOnDemandCost(String onDemandCost) {
        setOnDemandCost(onDemandCost);
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
        if (getOnDemandCost() != null)
            sb.append("OnDemandCost: ").append(getOnDemandCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageCost == false)
            return false;
        CoverageCost other = (CoverageCost) obj;
        if (other.getOnDemandCost() == null ^ this.getOnDemandCost() == null)
            return false;
        if (other.getOnDemandCost() != null && other.getOnDemandCost().equals(this.getOnDemandCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnDemandCost() == null) ? 0 : getOnDemandCost().hashCode());
        return hashCode;
    }

    @Override
    public CoverageCost clone() {
        try {
            return (CoverageCost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CoverageCostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
