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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set this period to specify how long your data is stored in the warm tier before it is deleted. You can set this only
 * if cold tier is enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/WarmTierRetentionPeriod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarmTierRetentionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days the data is stored in the warm tier.
     * </p>
     */
    private Integer numberOfDays;
    /**
     * <p>
     * If set to true, the data is stored indefinitely in the warm tier.
     * </p>
     */
    private Boolean unlimited;

    /**
     * <p>
     * The number of days the data is stored in the warm tier.
     * </p>
     * 
     * @param numberOfDays
     *        The number of days the data is stored in the warm tier.
     */

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * <p>
     * The number of days the data is stored in the warm tier.
     * </p>
     * 
     * @return The number of days the data is stored in the warm tier.
     */

    public Integer getNumberOfDays() {
        return this.numberOfDays;
    }

    /**
     * <p>
     * The number of days the data is stored in the warm tier.
     * </p>
     * 
     * @param numberOfDays
     *        The number of days the data is stored in the warm tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmTierRetentionPeriod withNumberOfDays(Integer numberOfDays) {
        setNumberOfDays(numberOfDays);
        return this;
    }

    /**
     * <p>
     * If set to true, the data is stored indefinitely in the warm tier.
     * </p>
     * 
     * @param unlimited
     *        If set to true, the data is stored indefinitely in the warm tier.
     */

    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }

    /**
     * <p>
     * If set to true, the data is stored indefinitely in the warm tier.
     * </p>
     * 
     * @return If set to true, the data is stored indefinitely in the warm tier.
     */

    public Boolean getUnlimited() {
        return this.unlimited;
    }

    /**
     * <p>
     * If set to true, the data is stored indefinitely in the warm tier.
     * </p>
     * 
     * @param unlimited
     *        If set to true, the data is stored indefinitely in the warm tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmTierRetentionPeriod withUnlimited(Boolean unlimited) {
        setUnlimited(unlimited);
        return this;
    }

    /**
     * <p>
     * If set to true, the data is stored indefinitely in the warm tier.
     * </p>
     * 
     * @return If set to true, the data is stored indefinitely in the warm tier.
     */

    public Boolean isUnlimited() {
        return this.unlimited;
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
        if (getNumberOfDays() != null)
            sb.append("NumberOfDays: ").append(getNumberOfDays()).append(",");
        if (getUnlimited() != null)
            sb.append("Unlimited: ").append(getUnlimited());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarmTierRetentionPeriod == false)
            return false;
        WarmTierRetentionPeriod other = (WarmTierRetentionPeriod) obj;
        if (other.getNumberOfDays() == null ^ this.getNumberOfDays() == null)
            return false;
        if (other.getNumberOfDays() != null && other.getNumberOfDays().equals(this.getNumberOfDays()) == false)
            return false;
        if (other.getUnlimited() == null ^ this.getUnlimited() == null)
            return false;
        if (other.getUnlimited() != null && other.getUnlimited().equals(this.getUnlimited()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfDays() == null) ? 0 : getNumberOfDays().hashCode());
        hashCode = prime * hashCode + ((getUnlimited() == null) ? 0 : getUnlimited().hashCode());
        return hashCode;
    }

    @Override
    public WarmTierRetentionPeriod clone() {
        try {
            return (WarmTierRetentionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.WarmTierRetentionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
