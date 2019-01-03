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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Reserved resources available for purchase
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Offering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Offering implements Serializable, Cloneable, StructuredPojo {

    /** Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321' */
    private String arn;
    /** Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD' */
    private String currencyCode;
    /** Lease duration, e.g. '12' */
    private Integer duration;
    /** Units for duration, e.g. 'MONTHS' */
    private String durationUnits;
    /** One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering */
    private Double fixedPrice;
    /** Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)' */
    private String offeringDescription;
    /** Unique offering ID, e.g. '87654321' */
    private String offeringId;
    /** Offering type, e.g. 'NO_UPFRONT' */
    private String offeringType;
    /** AWS region, e.g. 'us-west-2' */
    private String region;
    /** Resource configuration details */
    private ReservationResourceSpecification resourceSpecification;
    /** Recurring usage charge for each reserved resource, e.g. '157.0' */
    private Double usagePrice;

    /**
     * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * 
     * @param arn
     *        Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * 
     * @return Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * 
     * @param arn
     *        Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     * 
     * @param currencyCode
     *        Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     * 
     * @return Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     * 
     * @param currencyCode
     *        Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * Lease duration, e.g. '12'
     * 
     * @param duration
     *        Lease duration, e.g. '12'
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Lease duration, e.g. '12'
     * 
     * @return Lease duration, e.g. '12'
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Lease duration, e.g. '12'
     * 
     * @param duration
     *        Lease duration, e.g. '12'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * 
     * @param durationUnits
     *        Units for duration, e.g. 'MONTHS'
     * @see OfferingDurationUnits
     */

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * 
     * @return Units for duration, e.g. 'MONTHS'
     * @see OfferingDurationUnits
     */

    public String getDurationUnits() {
        return this.durationUnits;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * 
     * @param durationUnits
     *        Units for duration, e.g. 'MONTHS'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingDurationUnits
     */

    public Offering withDurationUnits(String durationUnits) {
        setDurationUnits(durationUnits);
        return this;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * 
     * @param durationUnits
     *        Units for duration, e.g. 'MONTHS'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingDurationUnits
     */

    public Offering withDurationUnits(OfferingDurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
        return this;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     * 
     * @param fixedPrice
     *        One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     * 
     * @return One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     * 
     * @param fixedPrice
     *        One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     * 
     * @param offeringDescription
     *        Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     */

    public void setOfferingDescription(String offeringDescription) {
        this.offeringDescription = offeringDescription;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     * 
     * @return Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     */

    public String getOfferingDescription() {
        return this.offeringDescription;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     * 
     * @param offeringDescription
     *        Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withOfferingDescription(String offeringDescription) {
        setOfferingDescription(offeringDescription);
        return this;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     * 
     * @param offeringId
     *        Unique offering ID, e.g. '87654321'
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     * 
     * @return Unique offering ID, e.g. '87654321'
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     * 
     * @param offeringId
     *        Unique offering ID, e.g. '87654321'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * 
     * @param offeringType
     *        Offering type, e.g. 'NO_UPFRONT'
     * @see OfferingType
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * 
     * @return Offering type, e.g. 'NO_UPFRONT'
     * @see OfferingType
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * 
     * @param offeringType
     *        Offering type, e.g. 'NO_UPFRONT'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingType
     */

    public Offering withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * 
     * @param offeringType
     *        Offering type, e.g. 'NO_UPFRONT'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingType
     */

    public Offering withOfferingType(OfferingType offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     * 
     * @param region
     *        AWS region, e.g. 'us-west-2'
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     * 
     * @return AWS region, e.g. 'us-west-2'
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     * 
     * @param region
     *        AWS region, e.g. 'us-west-2'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * Resource configuration details
     * 
     * @param resourceSpecification
     *        Resource configuration details
     */

    public void setResourceSpecification(ReservationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * Resource configuration details
     * 
     * @return Resource configuration details
     */

    public ReservationResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * Resource configuration details
     * 
     * @param resourceSpecification
     *        Resource configuration details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withResourceSpecification(ReservationResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     * 
     * @param usagePrice
     *        Recurring usage charge for each reserved resource, e.g. '157.0'
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     * 
     * @return Recurring usage charge for each reserved resource, e.g. '157.0'
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     * 
     * @param usagePrice
     *        Recurring usage charge for each reserved resource, e.g. '157.0'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getDurationUnits() != null)
            sb.append("DurationUnits: ").append(getDurationUnits()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getOfferingDescription() != null)
            sb.append("OfferingDescription: ").append(getOfferingDescription()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getOfferingDescription() == null ^ this.getOfferingDescription() == null)
            return false;
        if (other.getOfferingDescription() != null && other.getOfferingDescription().equals(this.getOfferingDescription()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getDurationUnits() == null) ? 0 : getDurationUnits().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getOfferingDescription() == null) ? 0 : getOfferingDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
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
        com.amazonaws.services.medialive.model.transform.OfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
