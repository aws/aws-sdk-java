/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The options for Spot Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateSpotMarketOptionsRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpotMarketOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this parameter
     * because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current
     * Spot price.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     * specify this parameter.
     * </p>
     * </important>
     */
    private String maxPrice;
    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     */
    private String spotInstanceType;
    /**
     * <p>
     * Deprecated.
     * </p>
     */
    private Integer blockDurationMinutes;
    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for persistent
     * requests.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all instances
     * launch or you cancel the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: 7 days from the current date
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     */
    private String instanceInterruptionBehavior;

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this parameter
     * because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current
     * Spot price.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     * specify this parameter.
     * </p>
     * </important>
     * 
     * @param maxPrice
     *        The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this
     *        parameter because it can lead to increased interruptions. If you do not specify this parameter, you will
     *        pay the current Spot price.</p> <important>
     *        <p>
     *        If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     *        specify this parameter.
     *        </p>
     */

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this parameter
     * because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current
     * Spot price.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     * specify this parameter.
     * </p>
     * </important>
     * 
     * @return The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this
     *         parameter because it can lead to increased interruptions. If you do not specify this parameter, you will
     *         pay the current Spot price.</p> <important>
     *         <p>
     *         If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do
     *         not specify this parameter.
     *         </p>
     */

    public String getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this parameter
     * because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current
     * Spot price.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     * specify this parameter.
     * </p>
     * </important>
     * 
     * @param maxPrice
     *        The maximum hourly price you're willing to pay for the Spot Instances. We do not recommend using this
     *        parameter because it can lead to increased interruptions. If you do not specify this parameter, you will
     *        pay the current Spot price.</p> <important>
     *        <p>
     *        If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not
     *        specify this parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpotMarketOptionsRequest withMaxPrice(String maxPrice) {
        setMaxPrice(maxPrice);
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * 
     * @param spotInstanceType
     *        The Spot Instance request type.
     * @see SpotInstanceType
     */

    public void setSpotInstanceType(String spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * 
     * @return The Spot Instance request type.
     * @see SpotInstanceType
     */

    public String getSpotInstanceType() {
        return this.spotInstanceType;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * 
     * @param spotInstanceType
     *        The Spot Instance request type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public LaunchTemplateSpotMarketOptionsRequest withSpotInstanceType(String spotInstanceType) {
        setSpotInstanceType(spotInstanceType);
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * 
     * @param spotInstanceType
     *        The Spot Instance request type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public LaunchTemplateSpotMarketOptionsRequest withSpotInstanceType(SpotInstanceType spotInstanceType) {
        this.spotInstanceType = spotInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param blockDurationMinutes
     *        Deprecated.
     */

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @return Deprecated.
     */

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param blockDurationMinutes
     *        Deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpotMarketOptionsRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        setBlockDurationMinutes(blockDurationMinutes);
        return this;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for persistent
     * requests.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all instances
     * launch or you cancel the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: 7 days from the current date
     * </p>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for
     *        persistent requests.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *        reached. Otherwise, the request remains active until you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all
     *        instances launch or you cancel the request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: 7 days from the current date
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for persistent
     * requests.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all instances
     * launch or you cancel the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: 7 days from the current date
     * </p>
     * 
     * @return The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for
     *         persistent requests.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *         reached. Otherwise, the request remains active until you cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all
     *         instances launch or you cancel the request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: 7 days from the current date
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for persistent
     * requests.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all instances
     * launch or you cancel the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: 7 days from the current date
     * </p>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format (<i>YYYY-MM-DD</i>T<i>HH:MM:SS</i>Z). Supported only for
     *        persistent requests.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *        reached. Otherwise, the request remains active until you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a one-time request, <code>ValidUntil</code> is not supported. The request remains active until all
     *        instances launch or you cancel the request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: 7 days from the current date
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpotMarketOptionsRequest withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @return The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public String getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public LaunchTemplateSpotMarketOptionsRequest withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        setInstanceInterruptionBehavior(instanceInterruptionBehavior);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public LaunchTemplateSpotMarketOptionsRequest withInstanceInterruptionBehavior(InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
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
        if (getMaxPrice() != null)
            sb.append("MaxPrice: ").append(getMaxPrice()).append(",");
        if (getSpotInstanceType() != null)
            sb.append("SpotInstanceType: ").append(getSpotInstanceType()).append(",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: ").append(getBlockDurationMinutes()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil()).append(",");
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: ").append(getInstanceInterruptionBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateSpotMarketOptionsRequest == false)
            return false;
        LaunchTemplateSpotMarketOptionsRequest other = (LaunchTemplateSpotMarketOptionsRequest) obj;
        if (other.getMaxPrice() == null ^ this.getMaxPrice() == null)
            return false;
        if (other.getMaxPrice() != null && other.getMaxPrice().equals(this.getMaxPrice()) == false)
            return false;
        if (other.getSpotInstanceType() == null ^ this.getSpotInstanceType() == null)
            return false;
        if (other.getSpotInstanceType() != null && other.getSpotInstanceType().equals(this.getSpotInstanceType()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null && other.getInstanceInterruptionBehavior().equals(this.getInstanceInterruptionBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        hashCode = prime * hashCode + ((getSpotInstanceType() == null) ? 0 : getSpotInstanceType().hashCode());
        hashCode = prime * hashCode + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getInstanceInterruptionBehavior() == null) ? 0 : getInstanceInterruptionBehavior().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateSpotMarketOptionsRequest clone() {
        try {
            return (LaunchTemplateSpotMarketOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
