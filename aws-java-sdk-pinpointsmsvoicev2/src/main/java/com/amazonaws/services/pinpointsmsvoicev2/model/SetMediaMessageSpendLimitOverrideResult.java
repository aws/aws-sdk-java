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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetMediaMessageSpendLimitOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetMediaMessageSpendLimitOverrideResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current monthly limit to enforce on sending text messages.
     * </p>
     */
    private Long monthlyLimit;

    /**
     * <p>
     * The current monthly limit to enforce on sending text messages.
     * </p>
     * 
     * @param monthlyLimit
     *        The current monthly limit to enforce on sending text messages.
     */

    public void setMonthlyLimit(Long monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    /**
     * <p>
     * The current monthly limit to enforce on sending text messages.
     * </p>
     * 
     * @return The current monthly limit to enforce on sending text messages.
     */

    public Long getMonthlyLimit() {
        return this.monthlyLimit;
    }

    /**
     * <p>
     * The current monthly limit to enforce on sending text messages.
     * </p>
     * 
     * @param monthlyLimit
     *        The current monthly limit to enforce on sending text messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetMediaMessageSpendLimitOverrideResult withMonthlyLimit(Long monthlyLimit) {
        setMonthlyLimit(monthlyLimit);
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
        if (getMonthlyLimit() != null)
            sb.append("MonthlyLimit: ").append(getMonthlyLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetMediaMessageSpendLimitOverrideResult == false)
            return false;
        SetMediaMessageSpendLimitOverrideResult other = (SetMediaMessageSpendLimitOverrideResult) obj;
        if (other.getMonthlyLimit() == null ^ this.getMonthlyLimit() == null)
            return false;
        if (other.getMonthlyLimit() != null && other.getMonthlyLimit().equals(this.getMonthlyLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonthlyLimit() == null) ? 0 : getMonthlyLimit().hashCode());
        return hashCode;
    }

    @Override
    public SetMediaMessageSpendLimitOverrideResult clone() {
        try {
            return (SetMediaMessageSpendLimitOverrideResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
