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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a value for a time series property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     */
    @Deprecated
    private java.util.Date timestamp;
    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     */
    private DataValue value;
    /**
     * <p>
     * ISO8601 DateTime of a value for a time series property.
     * </p>
     * <p>
     * The time for when the property value was recorded in ISO 8601 format:
     * <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>[YYYY]</i>: year
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[MM]</i>: month
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[DD]</i>: day
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[hh]</i>: hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[mm]</i>: minute
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[ss]</i>: seconds
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal to
     * 573123000 nanoseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Z</i>: default timezone UTC
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     * </p>
     */
    private String time;

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of a value for a time series property.
     */
    @Deprecated
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @return The timestamp of a value for a time series property.
     */
    @Deprecated
    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of a value for a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public PropertyValue withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @param value
     *        An object that specifies a value for a time series property.
     */

    public void setValue(DataValue value) {
        this.value = value;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @return An object that specifies a value for a time series property.
     */

    public DataValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @param value
     *        An object that specifies a value for a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValue withValue(DataValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * ISO8601 DateTime of a value for a time series property.
     * </p>
     * <p>
     * The time for when the property value was recorded in ISO 8601 format:
     * <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>[YYYY]</i>: year
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[MM]</i>: month
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[DD]</i>: day
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[hh]</i>: hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[mm]</i>: minute
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[ss]</i>: seconds
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal to
     * 573123000 nanoseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Z</i>: default timezone UTC
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     * </p>
     * 
     * @param time
     *        ISO8601 DateTime of a value for a time series property.</p>
     *        <p>
     *        The time for when the property value was recorded in ISO 8601 format:
     *        <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>[YYYY]</i>: year
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[MM]</i>: month
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[DD]</i>: day
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[hh]</i>: hour
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[mm]</i>: minute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[ss]</i>: seconds
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal
     *        to 573123000 nanoseconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Z</i>: default timezone UTC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * <p>
     * ISO8601 DateTime of a value for a time series property.
     * </p>
     * <p>
     * The time for when the property value was recorded in ISO 8601 format:
     * <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>[YYYY]</i>: year
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[MM]</i>: month
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[DD]</i>: day
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[hh]</i>: hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[mm]</i>: minute
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[ss]</i>: seconds
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal to
     * 573123000 nanoseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Z</i>: default timezone UTC
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     * </p>
     * 
     * @return ISO8601 DateTime of a value for a time series property.</p>
     *         <p>
     *         The time for when the property value was recorded in ISO 8601 format:
     *         <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>[YYYY]</i>: year
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[MM]</i>: month
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[DD]</i>: day
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[hh]</i>: hour
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[mm]</i>: minute
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[ss]</i>: seconds
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is
     *         equal to 573123000 nanoseconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Z</i>: default timezone UTC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     */

    public String getTime() {
        return this.time;
    }

    /**
     * <p>
     * ISO8601 DateTime of a value for a time series property.
     * </p>
     * <p>
     * The time for when the property value was recorded in ISO 8601 format:
     * <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>[YYYY]</i>: year
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[MM]</i>: month
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[DD]</i>: day
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[hh]</i>: hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[mm]</i>: minute
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[ss]</i>: seconds
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal to
     * 573123000 nanoseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Z</i>: default timezone UTC
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     * </p>
     * 
     * @param time
     *        ISO8601 DateTime of a value for a time series property.</p>
     *        <p>
     *        The time for when the property value was recorded in ISO 8601 format:
     *        <i>YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm]</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>[YYYY]</i>: year
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[MM]</i>: month
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[DD]</i>: day
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[hh]</i>: hour
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[mm]</i>: minute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[ss]</i>: seconds
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>[.SSSSSSSSS]</i>: additional precision, where precedence is maintained. For example: [.573123] is equal
     *        to 573123000 nanoseconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Z</i>: default timezone UTC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>± HH:mm</i>: time zone offset in Hours and Minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Required sub-fields</i>: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValue withTime(String time) {
        setTime(time);
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValue == false)
            return false;
        PropertyValue other = (PropertyValue) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public PropertyValue clone() {
        try {
            return (PropertyValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
