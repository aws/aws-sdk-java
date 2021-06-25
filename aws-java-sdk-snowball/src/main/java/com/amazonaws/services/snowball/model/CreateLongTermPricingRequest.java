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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateLongTermPricing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLongTermPricingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * </p>
     */
    private String longTermPricingType;
    /**
     * <p>
     * Specifies whether the current long-term pricing type for the device should be renewed.
     * </p>
     */
    private Boolean isLongTermPricingAutoRenew;
    /**
     * <p>
     * The type of AWS Snow Family device to use for the long-term pricing job.
     * </p>
     */
    private String snowballType;

    /**
     * <p>
     * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * @see LongTermPricingType
     */

    public void setLongTermPricingType(String longTermPricingType) {
        this.longTermPricingType = longTermPricingType;
    }

    /**
     * <p>
     * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * </p>
     * 
     * @return The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * @see LongTermPricingType
     */

    public String getLongTermPricingType() {
        return this.longTermPricingType;
    }

    /**
     * <p>
     * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongTermPricingType
     */

    public CreateLongTermPricingRequest withLongTermPricingType(String longTermPricingType) {
        setLongTermPricingType(longTermPricingType);
        return this;
    }

    /**
     * <p>
     * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongTermPricingType
     */

    public CreateLongTermPricingRequest withLongTermPricingType(LongTermPricingType longTermPricingType) {
        this.longTermPricingType = longTermPricingType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the current long-term pricing type for the device should be renewed.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        Specifies whether the current long-term pricing type for the device should be renewed.
     */

    public void setIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        this.isLongTermPricingAutoRenew = isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * Specifies whether the current long-term pricing type for the device should be renewed.
     * </p>
     * 
     * @return Specifies whether the current long-term pricing type for the device should be renewed.
     */

    public Boolean getIsLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * Specifies whether the current long-term pricing type for the device should be renewed.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        Specifies whether the current long-term pricing type for the device should be renewed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLongTermPricingRequest withIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        setIsLongTermPricingAutoRenew(isLongTermPricingAutoRenew);
        return this;
    }

    /**
     * <p>
     * Specifies whether the current long-term pricing type for the device should be renewed.
     * </p>
     * 
     * @return Specifies whether the current long-term pricing type for the device should be renewed.
     */

    public Boolean isLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for the long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for the long-term pricing job.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for the long-term pricing job.
     * </p>
     * 
     * @return The type of AWS Snow Family device to use for the long-term pricing job.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for the long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for the long-term pricing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateLongTermPricingRequest withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for the long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for the long-term pricing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateLongTermPricingRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
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
        if (getLongTermPricingType() != null)
            sb.append("LongTermPricingType: ").append(getLongTermPricingType()).append(",");
        if (getIsLongTermPricingAutoRenew() != null)
            sb.append("IsLongTermPricingAutoRenew: ").append(getIsLongTermPricingAutoRenew()).append(",");
        if (getSnowballType() != null)
            sb.append("SnowballType: ").append(getSnowballType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLongTermPricingRequest == false)
            return false;
        CreateLongTermPricingRequest other = (CreateLongTermPricingRequest) obj;
        if (other.getLongTermPricingType() == null ^ this.getLongTermPricingType() == null)
            return false;
        if (other.getLongTermPricingType() != null && other.getLongTermPricingType().equals(this.getLongTermPricingType()) == false)
            return false;
        if (other.getIsLongTermPricingAutoRenew() == null ^ this.getIsLongTermPricingAutoRenew() == null)
            return false;
        if (other.getIsLongTermPricingAutoRenew() != null && other.getIsLongTermPricingAutoRenew().equals(this.getIsLongTermPricingAutoRenew()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLongTermPricingType() == null) ? 0 : getLongTermPricingType().hashCode());
        hashCode = prime * hashCode + ((getIsLongTermPricingAutoRenew() == null) ? 0 : getIsLongTermPricingAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        return hashCode;
    }

    @Override
    public CreateLongTermPricingRequest clone() {
        return (CreateLongTermPricingRequest) super.clone();
    }

}
