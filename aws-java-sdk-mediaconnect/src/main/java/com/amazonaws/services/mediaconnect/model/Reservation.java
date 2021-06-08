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
 * A pricing agreement for a discounted rate for a specific outbound bandwidth that your MediaConnect account will use
 * each month over a specific time period. The discounted rate in the reservation applies to outbound bandwidth for all
 * flows from your account until your account reaches the amount of bandwidth in your reservation. If you use more
 * outbound bandwidth than the agreed upon amount in a single month, the overage is charged at the on-demand rate.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Reservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Reservation implements Serializable, Cloneable, StructuredPojo {

    /** The type of currency that is used for billing. The currencyCode used for your reservation is US dollars. */
    private String currencyCode;
    /** The length of time that this reservation is active. MediaConnect defines this value in the offering. */
    private Integer duration;
    /** The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering. */
    private String durationUnits;
    /**
     * The day and time that this reservation expires. This value is calculated based on the start date and time that
     * you set and the offering's duration.
     */
    private String end;
    /** The Amazon Resource Name (ARN) that MediaConnect assigns to the offering. */
    private String offeringArn;
    /** A description of the offering. MediaConnect defines this value in the offering. */
    private String offeringDescription;
    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines
     * this value in the offering.
     */
    private String pricePerUnit;
    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate. MediaConnect defines this value in the offering.
     */
    private String priceUnits;
    /** The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering. */
    private String reservationArn;
    /** The name that you assigned to the reservation when you purchased the offering. */
    private String reservationName;
    /** The status of your reservation. */
    private String reservationState;
    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * MediaConnect defines the values that make up the resourceSpecification in the offering.
     */
    private ResourceSpecification resourceSpecification;
    /** The day and time that the reservation becomes active. You set this value when you purchase the offering. */
    private String start;

    /**
     * The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     * 
     * @param currencyCode
     *        The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     * 
     * @return The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     * 
     * @param currencyCode
     *        The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * The length of time that this reservation is active. MediaConnect defines this value in the offering.
     * 
     * @param duration
     *        The length of time that this reservation is active. MediaConnect defines this value in the offering.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The length of time that this reservation is active. MediaConnect defines this value in the offering.
     * 
     * @return The length of time that this reservation is active. MediaConnect defines this value in the offering.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * The length of time that this reservation is active. MediaConnect defines this value in the offering.
     * 
     * @param duration
     *        The length of time that this reservation is active. MediaConnect defines this value in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the reservation. MediaConnect defines this value in the
     *        offering.
     * @see DurationUnits
     */

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
     * 
     * @return The unit of measurement for the duration of the reservation. MediaConnect defines this value in the
     *         offering.
     * @see DurationUnits
     */

    public String getDurationUnits() {
        return this.durationUnits;
    }

    /**
     * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the reservation. MediaConnect defines this value in the
     *        offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnits
     */

    public Reservation withDurationUnits(String durationUnits) {
        setDurationUnits(durationUnits);
        return this;
    }

    /**
     * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
     * 
     * @param durationUnits
     *        The unit of measurement for the duration of the reservation. MediaConnect defines this value in the
     *        offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnits
     */

    public Reservation withDurationUnits(DurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
        return this;
    }

    /**
     * The day and time that this reservation expires. This value is calculated based on the start date and time that
     * you set and the offering's duration.
     * 
     * @param end
     *        The day and time that this reservation expires. This value is calculated based on the start date and time
     *        that you set and the offering's duration.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * The day and time that this reservation expires. This value is calculated based on the start date and time that
     * you set and the offering's duration.
     * 
     * @return The day and time that this reservation expires. This value is calculated based on the start date and time
     *         that you set and the offering's duration.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * The day and time that this reservation expires. This value is calculated based on the start date and time that
     * you set and the offering's duration.
     * 
     * @param end
     *        The day and time that this reservation expires. This value is calculated based on the start date and time
     *        that you set and the offering's duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withEnd(String end) {
        setEnd(end);
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

    public Reservation withOfferingArn(String offeringArn) {
        setOfferingArn(offeringArn);
        return this;
    }

    /**
     * A description of the offering. MediaConnect defines this value in the offering.
     * 
     * @param offeringDescription
     *        A description of the offering. MediaConnect defines this value in the offering.
     */

    public void setOfferingDescription(String offeringDescription) {
        this.offeringDescription = offeringDescription;
    }

    /**
     * A description of the offering. MediaConnect defines this value in the offering.
     * 
     * @return A description of the offering. MediaConnect defines this value in the offering.
     */

    public String getOfferingDescription() {
        return this.offeringDescription;
    }

    /**
     * A description of the offering. MediaConnect defines this value in the offering.
     * 
     * @param offeringDescription
     *        A description of the offering. MediaConnect defines this value in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withOfferingDescription(String offeringDescription) {
        setOfferingDescription(offeringDescription);
        return this;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines
     * this value in the offering.
     * 
     * @param pricePerUnit
     *        The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect
     *        defines this value in the offering.
     */

    public void setPricePerUnit(String pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines
     * this value in the offering.
     * 
     * @return The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect
     *         defines this value in the offering.
     */

    public String getPricePerUnit() {
        return this.pricePerUnit;
    }

    /**
     * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines
     * this value in the offering.
     * 
     * @param pricePerUnit
     *        The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect
     *        defines this value in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withPricePerUnit(String pricePerUnit) {
        setPricePerUnit(pricePerUnit);
        return this;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate. MediaConnect defines this value in the offering.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate. MediaConnect defines this value in the offering.
     * @see PriceUnits
     */

    public void setPriceUnits(String priceUnits) {
        this.priceUnits = priceUnits;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate. MediaConnect defines this value in the offering.
     * 
     * @return The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *         the rate. MediaConnect defines this value in the offering.
     * @see PriceUnits
     */

    public String getPriceUnits() {
        return this.priceUnits;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate. MediaConnect defines this value in the offering.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate. MediaConnect defines this value in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceUnits
     */

    public Reservation withPriceUnits(String priceUnits) {
        setPriceUnits(priceUnits);
        return this;
    }

    /**
     * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the
     * rate. MediaConnect defines this value in the offering.
     * 
     * @param priceUnits
     *        The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up
     *        the rate. MediaConnect defines this value in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceUnits
     */

    public Reservation withPriceUnits(PriceUnits priceUnits) {
        this.priceUnits = priceUnits.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
     * 
     * @param reservationArn
     *        The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
     */

    public void setReservationArn(String reservationArn) {
        this.reservationArn = reservationArn;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
     * 
     * @return The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an
     *         offering.
     */

    public String getReservationArn() {
        return this.reservationArn;
    }

    /**
     * The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
     * 
     * @param reservationArn
     *        The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withReservationArn(String reservationArn) {
        setReservationArn(reservationArn);
        return this;
    }

    /**
     * The name that you assigned to the reservation when you purchased the offering.
     * 
     * @param reservationName
     *        The name that you assigned to the reservation when you purchased the offering.
     */

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * The name that you assigned to the reservation when you purchased the offering.
     * 
     * @return The name that you assigned to the reservation when you purchased the offering.
     */

    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * The name that you assigned to the reservation when you purchased the offering.
     * 
     * @param reservationName
     *        The name that you assigned to the reservation when you purchased the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withReservationName(String reservationName) {
        setReservationName(reservationName);
        return this;
    }

    /**
     * The status of your reservation.
     * 
     * @param reservationState
     *        The status of your reservation.
     * @see ReservationState
     */

    public void setReservationState(String reservationState) {
        this.reservationState = reservationState;
    }

    /**
     * The status of your reservation.
     * 
     * @return The status of your reservation.
     * @see ReservationState
     */

    public String getReservationState() {
        return this.reservationState;
    }

    /**
     * The status of your reservation.
     * 
     * @param reservationState
     *        The status of your reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationState
     */

    public Reservation withReservationState(String reservationState) {
        setReservationState(reservationState);
        return this;
    }

    /**
     * The status of your reservation.
     * 
     * @param reservationState
     *        The status of your reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationState
     */

    public Reservation withReservationState(ReservationState reservationState) {
        this.reservationState = reservationState.toString();
        return this;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * MediaConnect defines the values that make up the resourceSpecification in the offering.
     * 
     * @param resourceSpecification
     *        A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     *        MediaConnect defines the values that make up the resourceSpecification in the offering.
     */

    public void setResourceSpecification(ResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * MediaConnect defines the values that make up the resourceSpecification in the offering.
     * 
     * @return A definition of the amount of outbound bandwidth that you would be reserving if you purchase the
     *         offering. MediaConnect defines the values that make up the resourceSpecification in the offering.
     */

    public ResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     * MediaConnect defines the values that make up the resourceSpecification in the offering.
     * 
     * @param resourceSpecification
     *        A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
     *        MediaConnect defines the values that make up the resourceSpecification in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withResourceSpecification(ResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * The day and time that the reservation becomes active. You set this value when you purchase the offering.
     * 
     * @param start
     *        The day and time that the reservation becomes active. You set this value when you purchase the offering.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * The day and time that the reservation becomes active. You set this value when you purchase the offering.
     * 
     * @return The day and time that the reservation becomes active. You set this value when you purchase the offering.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * The day and time that the reservation becomes active. You set this value when you purchase the offering.
     * 
     * @param start
     *        The day and time that the reservation becomes active. You set this value when you purchase the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withStart(String start) {
        setStart(start);
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getOfferingArn() != null)
            sb.append("OfferingArn: ").append(getOfferingArn()).append(",");
        if (getOfferingDescription() != null)
            sb.append("OfferingDescription: ").append(getOfferingDescription()).append(",");
        if (getPricePerUnit() != null)
            sb.append("PricePerUnit: ").append(getPricePerUnit()).append(",");
        if (getPriceUnits() != null)
            sb.append("PriceUnits: ").append(getPriceUnits()).append(",");
        if (getReservationArn() != null)
            sb.append("ReservationArn: ").append(getReservationArn()).append(",");
        if (getReservationName() != null)
            sb.append("ReservationName: ").append(getReservationName()).append(",");
        if (getReservationState() != null)
            sb.append("ReservationState: ").append(getReservationState()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Reservation == false)
            return false;
        Reservation other = (Reservation) obj;
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
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
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
        if (other.getReservationArn() == null ^ this.getReservationArn() == null)
            return false;
        if (other.getReservationArn() != null && other.getReservationArn().equals(this.getReservationArn()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        if (other.getReservationState() == null ^ this.getReservationState() == null)
            return false;
        if (other.getReservationState() != null && other.getReservationState().equals(this.getReservationState()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
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
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getOfferingArn() == null) ? 0 : getOfferingArn().hashCode());
        hashCode = prime * hashCode + ((getOfferingDescription() == null) ? 0 : getOfferingDescription().hashCode());
        hashCode = prime * hashCode + ((getPricePerUnit() == null) ? 0 : getPricePerUnit().hashCode());
        hashCode = prime * hashCode + ((getPriceUnits() == null) ? 0 : getPriceUnits().hashCode());
        hashCode = prime * hashCode + ((getReservationArn() == null) ? 0 : getReservationArn().hashCode());
        hashCode = prime * hashCode + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        hashCode = prime * hashCode + ((getReservationState() == null) ? 0 : getReservationState().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public Reservation clone() {
        try {
            return (Reservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ReservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
