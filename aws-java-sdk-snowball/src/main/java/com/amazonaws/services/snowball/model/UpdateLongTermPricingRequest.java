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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateLongTermPricing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLongTermPricingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     */
    private String longTermPricingId;
    /**
     * <p>
     * Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     * </p>
     */
    private String replacementJob;
    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     */
    private Boolean isLongTermPricingAutoRenew;

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

    public UpdateLongTermPricingRequest withLongTermPricingId(String longTermPricingId) {
        setLongTermPricingId(longTermPricingId);
        return this;
    }

    /**
     * <p>
     * Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     * </p>
     * 
     * @param replacementJob
     *        Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     */

    public void setReplacementJob(String replacementJob) {
        this.replacementJob = replacementJob;
    }

    /**
     * <p>
     * Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     * </p>
     * 
     * @return Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     */

    public String getReplacementJob() {
        return this.replacementJob;
    }

    /**
     * <p>
     * Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     * </p>
     * 
     * @param replacementJob
     *        Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLongTermPricingRequest withReplacementJob(String replacementJob) {
        setReplacementJob(replacementJob);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *        automatically renewed before the long-term pricing contract expires.
     */

    public void setIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        this.isLongTermPricingAutoRenew = isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @return If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *         automatically renewed before the long-term pricing contract expires.
     */

    public Boolean getIsLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *        automatically renewed before the long-term pricing contract expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLongTermPricingRequest withIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        setIsLongTermPricingAutoRenew(isLongTermPricingAutoRenew);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @return If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *         automatically renewed before the long-term pricing contract expires.
     */

    public Boolean isLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
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
            sb.append("LongTermPricingId: ").append(getLongTermPricingId()).append(",");
        if (getReplacementJob() != null)
            sb.append("ReplacementJob: ").append(getReplacementJob()).append(",");
        if (getIsLongTermPricingAutoRenew() != null)
            sb.append("IsLongTermPricingAutoRenew: ").append(getIsLongTermPricingAutoRenew());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLongTermPricingRequest == false)
            return false;
        UpdateLongTermPricingRequest other = (UpdateLongTermPricingRequest) obj;
        if (other.getLongTermPricingId() == null ^ this.getLongTermPricingId() == null)
            return false;
        if (other.getLongTermPricingId() != null && other.getLongTermPricingId().equals(this.getLongTermPricingId()) == false)
            return false;
        if (other.getReplacementJob() == null ^ this.getReplacementJob() == null)
            return false;
        if (other.getReplacementJob() != null && other.getReplacementJob().equals(this.getReplacementJob()) == false)
            return false;
        if (other.getIsLongTermPricingAutoRenew() == null ^ this.getIsLongTermPricingAutoRenew() == null)
            return false;
        if (other.getIsLongTermPricingAutoRenew() != null && other.getIsLongTermPricingAutoRenew().equals(this.getIsLongTermPricingAutoRenew()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLongTermPricingId() == null) ? 0 : getLongTermPricingId().hashCode());
        hashCode = prime * hashCode + ((getReplacementJob() == null) ? 0 : getReplacementJob().hashCode());
        hashCode = prime * hashCode + ((getIsLongTermPricingAutoRenew() == null) ? 0 : getIsLongTermPricingAutoRenew().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLongTermPricingRequest clone() {
        return (UpdateLongTermPricingRequest) super.clone();
    }

}
