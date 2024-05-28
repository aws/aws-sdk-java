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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores the holiday featurization attributes applicable to each item of time-series datasets during the training of a
 * forecasting model. This allows the model to identify patterns associated with specific holidays.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HolidayConfigAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HolidayConfigAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The country code for the holiday calendar.
     * </p>
     * <p>
     * For the list of public holiday calendars supported by AutoML job V2, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     * >Country Codes</a>. Use the country code corresponding to the country of your choice.
     * </p>
     */
    private String countryCode;

    /**
     * <p>
     * The country code for the holiday calendar.
     * </p>
     * <p>
     * For the list of public holiday calendars supported by AutoML job V2, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     * >Country Codes</a>. Use the country code corresponding to the country of your choice.
     * </p>
     * 
     * @param countryCode
     *        The country code for the holiday calendar.</p>
     *        <p>
     *        For the list of public holiday calendars supported by AutoML job V2, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     *        >Country Codes</a>. Use the country code corresponding to the country of your choice.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The country code for the holiday calendar.
     * </p>
     * <p>
     * For the list of public holiday calendars supported by AutoML job V2, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     * >Country Codes</a>. Use the country code corresponding to the country of your choice.
     * </p>
     * 
     * @return The country code for the holiday calendar.</p>
     *         <p>
     *         For the list of public holiday calendars supported by AutoML job V2, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     *         >Country Codes</a>. Use the country code corresponding to the country of your choice.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The country code for the holiday calendar.
     * </p>
     * <p>
     * For the list of public holiday calendars supported by AutoML job V2, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     * >Country Codes</a>. Use the country code corresponding to the country of your choice.
     * </p>
     * 
     * @param countryCode
     *        The country code for the holiday calendar.</p>
     *        <p>
     *        For the list of public holiday calendars supported by AutoML job V2, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-timeseries-forecasting-holiday-calendars.html#holiday-country-codes"
     *        >Country Codes</a>. Use the country code corresponding to the country of your choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HolidayConfigAttributes withCountryCode(String countryCode) {
        setCountryCode(countryCode);
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
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HolidayConfigAttributes == false)
            return false;
        HolidayConfigAttributes other = (HolidayConfigAttributes) obj;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        return hashCode;
    }

    @Override
    public HolidayConfigAttributes clone() {
        try {
            return (HolidayConfigAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HolidayConfigAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
