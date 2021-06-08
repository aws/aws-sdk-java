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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data in a particular data cell defined on the screen.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DataItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row of data has a different format for the
     * data than the default format defined on the screen or the table.
     * </p>
     */
    private String overrideFormat;
    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     */
    private String rawValue;
    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     */
    private String formattedValue;

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row of data has a different format for the
     * data than the default format defined on the screen or the table.
     * </p>
     * 
     * @param overrideFormat
     *        The overrideFormat is optional and is specified only if a particular row of data has a different format
     *        for the data than the default format defined on the screen or the table.
     * @see Format
     */

    public void setOverrideFormat(String overrideFormat) {
        this.overrideFormat = overrideFormat;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row of data has a different format for the
     * data than the default format defined on the screen or the table.
     * </p>
     * 
     * @return The overrideFormat is optional and is specified only if a particular row of data has a different format
     *         for the data than the default format defined on the screen or the table.
     * @see Format
     */

    public String getOverrideFormat() {
        return this.overrideFormat;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row of data has a different format for the
     * data than the default format defined on the screen or the table.
     * </p>
     * 
     * @param overrideFormat
     *        The overrideFormat is optional and is specified only if a particular row of data has a different format
     *        for the data than the default format defined on the screen or the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public DataItem withOverrideFormat(String overrideFormat) {
        setOverrideFormat(overrideFormat);
        return this;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row of data has a different format for the
     * data than the default format defined on the screen or the table.
     * </p>
     * 
     * @param overrideFormat
     *        The overrideFormat is optional and is specified only if a particular row of data has a different format
     *        for the data than the default format defined on the screen or the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public DataItem withOverrideFormat(Format overrideFormat) {
        this.overrideFormat = overrideFormat.toString();
        return this;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     * 
     * @param rawValue
     *        The raw value of the data. e.g. jsmith@example.com
     */

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     * 
     * @return The raw value of the data. e.g. jsmith@example.com
     */

    public String getRawValue() {
        return this.rawValue;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     * 
     * @param rawValue
     *        The raw value of the data. e.g. jsmith@example.com
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataItem withRawValue(String rawValue) {
        setRawValue(rawValue);
        return this;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     * 
     * @param formattedValue
     *        The formatted value of the data. e.g. John Smith.
     */

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     * 
     * @return The formatted value of the data. e.g. John Smith.
     */

    public String getFormattedValue() {
        return this.formattedValue;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     * 
     * @param formattedValue
     *        The formatted value of the data. e.g. John Smith.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataItem withFormattedValue(String formattedValue) {
        setFormattedValue(formattedValue);
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
        if (getOverrideFormat() != null)
            sb.append("OverrideFormat: ").append(getOverrideFormat()).append(",");
        if (getRawValue() != null)
            sb.append("RawValue: ").append(getRawValue()).append(",");
        if (getFormattedValue() != null)
            sb.append("FormattedValue: ").append(getFormattedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataItem == false)
            return false;
        DataItem other = (DataItem) obj;
        if (other.getOverrideFormat() == null ^ this.getOverrideFormat() == null)
            return false;
        if (other.getOverrideFormat() != null && other.getOverrideFormat().equals(this.getOverrideFormat()) == false)
            return false;
        if (other.getRawValue() == null ^ this.getRawValue() == null)
            return false;
        if (other.getRawValue() != null && other.getRawValue().equals(this.getRawValue()) == false)
            return false;
        if (other.getFormattedValue() == null ^ this.getFormattedValue() == null)
            return false;
        if (other.getFormattedValue() != null && other.getFormattedValue().equals(this.getFormattedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverrideFormat() == null) ? 0 : getOverrideFormat().hashCode());
        hashCode = prime * hashCode + ((getRawValue() == null) ? 0 : getRawValue().hashCode());
        hashCode = prime * hashCode + ((getFormattedValue() == null) ? 0 : getFormattedValue().hashCode());
        return hashCode;
    }

    @Override
    public DataItem clone() {
        try {
            return (DataItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.DataItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
