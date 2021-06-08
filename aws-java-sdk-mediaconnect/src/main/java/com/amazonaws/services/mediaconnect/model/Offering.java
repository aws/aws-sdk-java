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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A savings plan that reserves a certain amount of outbound bandwidth usage at a discounted rate each month over a
 * period of time.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Offering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Offering implements Serializable, Cloneable, StructuredPojo {

    /** The type of currency that is used for billing. The currencyCode used for all reservations is US dollars. */
    private String currencyCode;
    /** The length of time that your reservation would be active. */
    private Integer duration;
    /** The unit of measurement for the duration of the offering. */
    private String durationUnits;
    /** The Amazon Resource Name (ARN) that MediaConnect assigns to the offering. */
    private String offeringArn;
    /** A description of the offering. */
    private String offeringDescription;
    /** The cost of a single unit. This value, in combination with priceUnits, makes up the rate. */
    private String pricePerUnit;
    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate.
     */
    private String priceUnits;
    /** A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering. */
    private ResourceSpecification resourceSpecification;

    /**
     * The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     * 
     * @param currencyCode
     *        The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     * 
     * @return The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     * 
     * @param currencyCode
     *        The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * The length of time that your reservation would be active.
     * 
     * @param duration
     *        The length of time that your reservation would be active.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The length of time that your reservation would be active.
     * 
     * @return The length of time that your reservation would be active.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * The length of time that your reservation would be active.
     * 
     * @param duration
     *        The length of time that your reservation would be active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * The unit of measurement for the duration of the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the offering.
     * @see DurationUnits
     */

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * The unit of measurement for the duration of the offering.
     * 
     * @return The unit of measurement for the duration of the offering.
     * @see DurationUnits
     */

    public String getDurationUnits() {
        return this.durationUnits;
    }

    /**
     * The unit of measurement for the duration of the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnits
     */

    public Offering withDurationUnits(String durationUnits) {
        setDurationUnits(durationUnits);
        return this;
    }

    /**
     * The unit of measurement for the duration of the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnits
     */

    public Offering withDurationUnits(DurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     */

    public void setOfferingArn(String offeringArn) {
        this.offeringArn = offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     * 
     * @return The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     */

    public String getOfferingArn() {
        return this.offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withOfferingArn(String offeringArn) {
        setOfferingArn(offeringArn);
        return this;
    }

    /**
     * A description of the offering.
     * 
     * @param offeringDescription
     *        A description of the offering.
     */

    public void setOfferingDescription(String offeringDescription) {
        this.offeringDescription = offeringDescription;
    }

    /**
     * A description of the offering.
     * 
     * @return A description of the offering.
     */

    public String getOfferingDescription() {
        return this.offeringDescription;
    }

    /**
     * A description of the offering.
     * 
     * @param offeringDescription
     *        A description of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withOfferingDescription(String offeringDescription) {
        setOfferingDescription(offeringDescription);
        return this;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     * 
     * @param pricePerUnit
     *        The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     */

    public void setPricePerUnit(String pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     * 
     * @return The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     */

    public String getPricePerUnit() {
        return this.pricePerUnit;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     * 
     * @param pricePerUnit
     *        The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withPricePerUnit(String pricePerUnit) {
        setPricePerUnit(pricePerUnit);
        return this;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate.
     * @see PriceUnits
     */

    public void setPriceUnits(String priceUnits) {
        this.priceUnits = priceUnits;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate.
     * 
     * @return The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *         the rate.
     * @see PriceUnits
     */

    public String getPriceUnits() {
        return this.priceUnits;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceUnits
     */

    public Offering withPriceUnits(String priceUnits) {
        setPriceUnits(priceUnits);
        return this;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceUnits
     */

    public Offering withPriceUnits(PriceUnits priceUnits) {
        this.priceUnits = priceUnits.toString();
        return this;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * 
     * @param resourceSpecification
     *        A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     */

    public void setResourceSpecification(ResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * 
     * @return A definition of the amount of outbound bandwidth that you would be reserving if you purchase the
     *         offering.
     */

    public ResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * 
     * @param resourceSpecification
     *        A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withResourceSpecification(ResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getDurationUnits() != null)
            sb.append("DurationUnits: ").append(getDurationUnits()).append(",");
        if (getOfferingArn() != null)
            sb.append("OfferingArn: ").append(getOfferingArn()).append(",");
        if (getOfferingDescription() != null)
            sb.append("OfferingDescription: ").append(getOfferingDescription()).append(",");
        if (getPricePerUnit() != null)
            sb.append("PricePerUnit: ").append(getPricePerUnit()).append(",");
        if (getPriceUnits() != null)
            sb.append("PriceUnits: ").append(getPriceUnits()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Offering == false)
            return false;
        Offering other = (Offering) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getDurationUnits() == null ^ this.getDurationUnits() == null)
            return false;
        if (other.getDurationUnits() != null && other.getDurationUnits().equals(this.getDurationUnits()) == false)
            return false;
        if (other.getOfferingArn() == null ^ this.getOfferingArn() == null)
            return false;
        if (other.getOfferingArn() != null && other.getOfferingArn().equals(this.getOfferingArn()) == false)
            return false;
        if (other.getOfferingDescription() == null ^ this.getOfferingDescription() == null)
            return false;
        if (other.getOfferingDescription() != null && other.getOfferingDescription().equals(this.getOfferingDescription()) == false)
            return false;
        if (other.getPricePerUnit() == null ^ this.getPricePerUnit() == null)
            return false;
        if (other.getPricePerUnit() != null && other.getPricePerUnit().equals(this.getPricePerUnit()) == false)
            return false;
        if (other.getPriceUnits() == null ^ this.getPriceUnits() == null)
            return false;
        if (other.getPriceUnits() != null && other.getPriceUnits().equals(this.getPriceUnits()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getDurationUnits() == null) ? 0 : getDurationUnits().hashCode());
        hashCode = prime * hashCode + ((getOfferingArn() == null) ? 0 : getOfferingArn().hashCode());
        hashCode = prime * hashCode + ((getOfferingDescription() == null) ? 0 : getOfferingDescription().hashCode());
        hashCode = prime * hashCode + ((getPricePerUnit() == null) ? 0 : getPricePerUnit().hashCode());
        hashCode = prime * hashCode + ((getPriceUnits() == null) ? 0 : getPriceUnits().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        return hashCode;
    }

    @Override
    public Offering clone() {
        try {
            return (Offering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.OfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
