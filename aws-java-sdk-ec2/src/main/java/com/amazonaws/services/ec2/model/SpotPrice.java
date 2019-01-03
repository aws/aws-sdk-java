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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the maximum price per hour that you are willing to pay for a Spot Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotPrice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotPrice implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * A general description of the AMI.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @return The Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPrice withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public SpotPrice withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public SpotPrice withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * 
     * @param productDescription
     *        A general description of the AMI.
     * @see RIProductDescription
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * 
     * @return A general description of the AMI.
     * @see RIProductDescription
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * 
     * @param productDescription
     *        A general description of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public SpotPrice withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * 
     * @param productDescription
     *        A general description of the AMI.
     * @see RIProductDescription
     */

    public void setProductDescription(RIProductDescription productDescription) {
        withProductDescription(productDescription);
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * 
     * @param productDescription
     *        A general description of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public SpotPrice withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per hour that you are willing to pay for a Spot Instance.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @return The maximum price per hour that you are willing to pay for a Spot Instance.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per hour that you are willing to pay for a Spot Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPrice withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param timestamp
     *        The date and time the request was created, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time the request was created, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param timestamp
     *        The date and time the request was created, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPrice withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPrice == false)
            return false;
        SpotPrice other = (SpotPrice) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SpotPrice clone() {
        try {
            return (SpotPrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
