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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the set of time series that are used to create the forecasts in a <code>TimeSeriesIdentifiers</code> object.
 * </p>
 * <p>
 * The <code>TimeSeriesIdentifiers</code> object needs the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DataSource</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Format</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Schema</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeSeriesSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the import file that contains the time series for which you want to create forecasts.
     * </p>
     */
    private TimeSeriesIdentifiers timeSeriesIdentifiers;

    /**
     * <p>
     * Details about the import file that contains the time series for which you want to create forecasts.
     * </p>
     * 
     * @param timeSeriesIdentifiers
     *        Details about the import file that contains the time series for which you want to create forecasts.
     */

    public void setTimeSeriesIdentifiers(TimeSeriesIdentifiers timeSeriesIdentifiers) {
        this.timeSeriesIdentifiers = timeSeriesIdentifiers;
    }

    /**
     * <p>
     * Details about the import file that contains the time series for which you want to create forecasts.
     * </p>
     * 
     * @return Details about the import file that contains the time series for which you want to create forecasts.
     */

    public TimeSeriesIdentifiers getTimeSeriesIdentifiers() {
        return this.timeSeriesIdentifiers;
    }

    /**
     * <p>
     * Details about the import file that contains the time series for which you want to create forecasts.
     * </p>
     * 
     * @param timeSeriesIdentifiers
     *        Details about the import file that contains the time series for which you want to create forecasts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesSelector withTimeSeriesIdentifiers(TimeSeriesIdentifiers timeSeriesIdentifiers) {
        setTimeSeriesIdentifiers(timeSeriesIdentifiers);
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
        if (getTimeSeriesIdentifiers() != null)
            sb.append("TimeSeriesIdentifiers: ").append(getTimeSeriesIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesSelector == false)
            return false;
        TimeSeriesSelector other = (TimeSeriesSelector) obj;
        if (other.getTimeSeriesIdentifiers() == null ^ this.getTimeSeriesIdentifiers() == null)
            return false;
        if (other.getTimeSeriesIdentifiers() != null && other.getTimeSeriesIdentifiers().equals(this.getTimeSeriesIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeSeriesIdentifiers() == null) ? 0 : getTimeSeriesIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesSelector clone() {
        try {
            return (TimeSeriesSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeSeriesSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
