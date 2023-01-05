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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Formatting configuration for <code>DateTime</code> fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DateTimeFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     */
    private String dateTimeFormat;
    /**
     * <p>
     * The options that determine the null value format configuration.
     * </p>
     */
    private NullValueFormatConfiguration nullValueFormatConfiguration;
    /**
     * <p>
     * The formatting configuration for numeric <code>DateTime</code> fields.
     * </p>
     */
    private NumericFormatConfiguration numericFormatConfiguration;

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @param dateTimeFormat
     *        Determines the <code>DateTime</code> format.
     */

    public void setDateTimeFormat(String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @return Determines the <code>DateTime</code> format.
     */

    public String getDateTimeFormat() {
        return this.dateTimeFormat;
    }

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @param dateTimeFormat
     *        Determines the <code>DateTime</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeFormatConfiguration withDateTimeFormat(String dateTimeFormat) {
        setDateTimeFormat(dateTimeFormat);
        return this;
    }

    /**
     * <p>
     * The options that determine the null value format configuration.
     * </p>
     * 
     * @param nullValueFormatConfiguration
     *        The options that determine the null value format configuration.
     */

    public void setNullValueFormatConfiguration(NullValueFormatConfiguration nullValueFormatConfiguration) {
        this.nullValueFormatConfiguration = nullValueFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the null value format configuration.
     * </p>
     * 
     * @return The options that determine the null value format configuration.
     */

    public NullValueFormatConfiguration getNullValueFormatConfiguration() {
        return this.nullValueFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the null value format configuration.
     * </p>
     * 
     * @param nullValueFormatConfiguration
     *        The options that determine the null value format configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeFormatConfiguration withNullValueFormatConfiguration(NullValueFormatConfiguration nullValueFormatConfiguration) {
        setNullValueFormatConfiguration(nullValueFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * The formatting configuration for numeric <code>DateTime</code> fields.
     * </p>
     * 
     * @param numericFormatConfiguration
     *        The formatting configuration for numeric <code>DateTime</code> fields.
     */

    public void setNumericFormatConfiguration(NumericFormatConfiguration numericFormatConfiguration) {
        this.numericFormatConfiguration = numericFormatConfiguration;
    }

    /**
     * <p>
     * The formatting configuration for numeric <code>DateTime</code> fields.
     * </p>
     * 
     * @return The formatting configuration for numeric <code>DateTime</code> fields.
     */

    public NumericFormatConfiguration getNumericFormatConfiguration() {
        return this.numericFormatConfiguration;
    }

    /**
     * <p>
     * The formatting configuration for numeric <code>DateTime</code> fields.
     * </p>
     * 
     * @param numericFormatConfiguration
     *        The formatting configuration for numeric <code>DateTime</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeFormatConfiguration withNumericFormatConfiguration(NumericFormatConfiguration numericFormatConfiguration) {
        setNumericFormatConfiguration(numericFormatConfiguration);
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
        if (getDateTimeFormat() != null)
            sb.append("DateTimeFormat: ").append(getDateTimeFormat()).append(",");
        if (getNullValueFormatConfiguration() != null)
            sb.append("NullValueFormatConfiguration: ").append(getNullValueFormatConfiguration()).append(",");
        if (getNumericFormatConfiguration() != null)
            sb.append("NumericFormatConfiguration: ").append(getNumericFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeFormatConfiguration == false)
            return false;
        DateTimeFormatConfiguration other = (DateTimeFormatConfiguration) obj;
        if (other.getDateTimeFormat() == null ^ this.getDateTimeFormat() == null)
            return false;
        if (other.getDateTimeFormat() != null && other.getDateTimeFormat().equals(this.getDateTimeFormat()) == false)
            return false;
        if (other.getNullValueFormatConfiguration() == null ^ this.getNullValueFormatConfiguration() == null)
            return false;
        if (other.getNullValueFormatConfiguration() != null && other.getNullValueFormatConfiguration().equals(this.getNullValueFormatConfiguration()) == false)
            return false;
        if (other.getNumericFormatConfiguration() == null ^ this.getNumericFormatConfiguration() == null)
            return false;
        if (other.getNumericFormatConfiguration() != null && other.getNumericFormatConfiguration().equals(this.getNumericFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateTimeFormat() == null) ? 0 : getDateTimeFormat().hashCode());
        hashCode = prime * hashCode + ((getNullValueFormatConfiguration() == null) ? 0 : getNullValueFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNumericFormatConfiguration() == null) ? 0 : getNumericFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeFormatConfiguration clone() {
        try {
            return (DateTimeFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DateTimeFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
