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
package com.amazonaws.services.forecastquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The forecast value for a specific date. Part of the <a>Forecast</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/DataPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of the specific forecast.
     * </p>
     */
    private String timestamp;
    /**
     * <p>
     * The forecast value.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The timestamp of the specific forecast.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the specific forecast.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the specific forecast.
     * </p>
     * 
     * @return The timestamp of the specific forecast.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the specific forecast.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the specific forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPoint withTimestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The forecast value.
     * </p>
     * 
     * @param value
     *        The forecast value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The forecast value.
     * </p>
     * 
     * @return The forecast value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The forecast value.
     * </p>
     * 
     * @param value
     *        The forecast value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPoint withValue(Double value) {
        setValue(value);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPoint == false)
            return false;
        DataPoint other = (DataPoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DataPoint clone() {
        try {
            return (DataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecastquery.model.transform.DataPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
