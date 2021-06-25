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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateLongTermPricing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLongTermPricingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     */
    private String longTermPricingId;

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     */

    public void setLongTermPricingId(String longTermPricingId) {
        this.longTermPricingId = longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @return The ID of the long-term pricing type for the device.
     */

    public String getLongTermPricingId() {
        return this.longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLongTermPricingResult withLongTermPricingId(String longTermPricingId) {
        setLongTermPricingId(longTermPricingId);
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
        if (getLongTermPricingId() != null)
            sb.append("LongTermPricingId: ").append(getLongTermPricingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLongTermPricingResult == false)
            return false;
        CreateLongTermPricingResult other = (CreateLongTermPricingResult) obj;
        if (other.getLongTermPricingId() == null ^ this.getLongTermPricingId() == null)
            return false;
        if (other.getLongTermPricingId() != null && other.getLongTermPricingId().equals(this.getLongTermPricingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLongTermPricingId() == null) ? 0 : getLongTermPricingId().hashCode());
        return hashCode;
    }

    @Override
    public CreateLongTermPricingResult clone() {
        try {
            return (CreateLongTermPricingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
