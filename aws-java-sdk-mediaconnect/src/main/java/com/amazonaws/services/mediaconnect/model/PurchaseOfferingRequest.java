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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to purchase a offering.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/PurchaseOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the offering. */
    private String offeringArn;
    /** The name that you want to use for the reservation. */
    private String reservationName;
    /**
     * The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can specify
     * any date and time between 12:00am on the first day of the current month to the current time on today's date,
     * inclusive. Specify the start in a 24-hour notation. Use the following format: YYYY-MM-DDTHH:mm:SSZ, where T and Z
     * are literal characters. For example, to specify 11:30pm on March 5, 2020, enter 2020-03-05T23:30:00Z.
     */
    private String start;

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) of the offering.
     */

    public void setOfferingArn(String offeringArn) {
        this.offeringArn = offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @return The Amazon Resource Name (ARN) of the offering.
     */

    public String getOfferingArn() {
        return this.offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withOfferingArn(String offeringArn) {
        setOfferingArn(offeringArn);
        return this;
    }

    /**
     * The name that you want to use for the reservation.
     * 
     * @param reservationName
     *        The name that you want to use for the reservation.
     */

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * The name that you want to use for the reservation.
     * 
     * @return The name that you want to use for the reservation.
     */

    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * The name that you want to use for the reservation.
     * 
     * @param reservationName
     *        The name that you want to use for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withReservationName(String reservationName) {
        setReservationName(reservationName);
        return this;
    }

    /**
     * The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can specify
     * any date and time between 12:00am on the first day of the current month to the current time on today's date,
     * inclusive. Specify the start in a 24-hour notation. Use the following format: YYYY-MM-DDTHH:mm:SSZ, where T and Z
     * are literal characters. For example, to specify 11:30pm on March 5, 2020, enter 2020-03-05T23:30:00Z.
     * 
     * @param start
     *        The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can
     *        specify any date and time between 12:00am on the first day of the current month to the current time on
     *        today's date, inclusive. Specify the start in a 24-hour notation. Use the following format:
     *        YYYY-MM-DDTHH:mm:SSZ, where T and Z are literal characters. For example, to specify 11:30pm on March 5,
     *        2020, enter 2020-03-05T23:30:00Z.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can specify
     * any date and time between 12:00am on the first day of the current month to the current time on today's date,
     * inclusive. Specify the start in a 24-hour notation. Use the following format: YYYY-MM-DDTHH:mm:SSZ, where T and Z
     * are literal characters. For example, to specify 11:30pm on March 5, 2020, enter 2020-03-05T23:30:00Z.
     * 
     * @return The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can
     *         specify any date and time between 12:00am on the first day of the current month to the current time on
     *         today's date, inclusive. Specify the start in a 24-hour notation. Use the following format:
     *         YYYY-MM-DDTHH:mm:SSZ, where T and Z are literal characters. For example, to specify 11:30pm on March 5,
     *         2020, enter 2020-03-05T23:30:00Z.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can specify
     * any date and time between 12:00am on the first day of the current month to the current time on today's date,
     * inclusive. Specify the start in a 24-hour notation. Use the following format: YYYY-MM-DDTHH:mm:SSZ, where T and Z
     * are literal characters. For example, to specify 11:30pm on March 5, 2020, enter 2020-03-05T23:30:00Z.
     * 
     * @param start
     *        The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can
     *        specify any date and time between 12:00am on the first day of the current month to the current time on
     *        today's date, inclusive. Specify the start in a 24-hour notation. Use the following format:
     *        YYYY-MM-DDTHH:mm:SSZ, where T and Z are literal characters. For example, to specify 11:30pm on March 5,
     *        2020, enter 2020-03-05T23:30:00Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withStart(String start) {
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
        if (getOfferingArn() != null)
            sb.append("OfferingArn: ").append(getOfferingArn()).append(",");
        if (getReservationName() != null)
            sb.append("ReservationName: ").append(getReservationName()).append(",");
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

        if (obj instanceof PurchaseOfferingRequest == false)
            return false;
        PurchaseOfferingRequest other = (PurchaseOfferingRequest) obj;
        if (other.getOfferingArn() == null ^ this.getOfferingArn() == null)
            return false;
        if (other.getOfferingArn() != null && other.getOfferingArn().equals(this.getOfferingArn()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
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

        hashCode = prime * hashCode + ((getOfferingArn() == null) ? 0 : getOfferingArn().hashCode());
        hashCode = prime * hashCode + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseOfferingRequest clone() {
        return (PurchaseOfferingRequest) super.clone();
    }

}
