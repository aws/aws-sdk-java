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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets additional capacity units configured for your rescore execution plan. A rescore execution plan is an Amazon
 * Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API. You can add and remove
 * capacity units to fit your usage requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CapacityUnitsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityUnitsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of extra capacity for your rescore execution plan.
     * </p>
     * <p>
     * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You can add
     * up to 1000 extra capacity units.
     * </p>
     */
    private Integer rescoreCapacityUnits;

    /**
     * <p>
     * The amount of extra capacity for your rescore execution plan.
     * </p>
     * <p>
     * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You can add
     * up to 1000 extra capacity units.
     * </p>
     * 
     * @param rescoreCapacityUnits
     *        The amount of extra capacity for your rescore execution plan.</p>
     *        <p>
     *        A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You
     *        can add up to 1000 extra capacity units.
     */

    public void setRescoreCapacityUnits(Integer rescoreCapacityUnits) {
        this.rescoreCapacityUnits = rescoreCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra capacity for your rescore execution plan.
     * </p>
     * <p>
     * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You can add
     * up to 1000 extra capacity units.
     * </p>
     * 
     * @return The amount of extra capacity for your rescore execution plan.</p>
     *         <p>
     *         A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You
     *         can add up to 1000 extra capacity units.
     */

    public Integer getRescoreCapacityUnits() {
        return this.rescoreCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra capacity for your rescore execution plan.
     * </p>
     * <p>
     * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You can add
     * up to 1000 extra capacity units.
     * </p>
     * 
     * @param rescoreCapacityUnits
     *        The amount of extra capacity for your rescore execution plan.</p>
     *        <p>
     *        A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You
     *        can add up to 1000 extra capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUnitsConfiguration withRescoreCapacityUnits(Integer rescoreCapacityUnits) {
        setRescoreCapacityUnits(rescoreCapacityUnits);
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
        if (getRescoreCapacityUnits() != null)
            sb.append("RescoreCapacityUnits: ").append(getRescoreCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityUnitsConfiguration == false)
            return false;
        CapacityUnitsConfiguration other = (CapacityUnitsConfiguration) obj;
        if (other.getRescoreCapacityUnits() == null ^ this.getRescoreCapacityUnits() == null)
            return false;
        if (other.getRescoreCapacityUnits() != null && other.getRescoreCapacityUnits().equals(this.getRescoreCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRescoreCapacityUnits() == null) ? 0 : getRescoreCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public CapacityUnitsConfiguration clone() {
        try {
            return (CapacityUnitsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendraranking.model.transform.CapacityUnitsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
