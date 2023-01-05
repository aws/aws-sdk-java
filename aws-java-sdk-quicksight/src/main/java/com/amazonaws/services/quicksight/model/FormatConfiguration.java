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
 * The formatting configuration for all types of field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FormatConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Formatting configuration for string fields.
     * </p>
     */
    private StringFormatConfiguration stringFormatConfiguration;
    /**
     * <p>
     * Formatting configuration for number fields.
     * </p>
     */
    private NumberFormatConfiguration numberFormatConfiguration;
    /**
     * <p>
     * Formatting configuration for <code>DateTime</code> fields.
     * </p>
     */
    private DateTimeFormatConfiguration dateTimeFormatConfiguration;

    /**
     * <p>
     * Formatting configuration for string fields.
     * </p>
     * 
     * @param stringFormatConfiguration
     *        Formatting configuration for string fields.
     */

    public void setStringFormatConfiguration(StringFormatConfiguration stringFormatConfiguration) {
        this.stringFormatConfiguration = stringFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for string fields.
     * </p>
     * 
     * @return Formatting configuration for string fields.
     */

    public StringFormatConfiguration getStringFormatConfiguration() {
        return this.stringFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for string fields.
     * </p>
     * 
     * @param stringFormatConfiguration
     *        Formatting configuration for string fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatConfiguration withStringFormatConfiguration(StringFormatConfiguration stringFormatConfiguration) {
        setStringFormatConfiguration(stringFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * Formatting configuration for number fields.
     * </p>
     * 
     * @param numberFormatConfiguration
     *        Formatting configuration for number fields.
     */

    public void setNumberFormatConfiguration(NumberFormatConfiguration numberFormatConfiguration) {
        this.numberFormatConfiguration = numberFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for number fields.
     * </p>
     * 
     * @return Formatting configuration for number fields.
     */

    public NumberFormatConfiguration getNumberFormatConfiguration() {
        return this.numberFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for number fields.
     * </p>
     * 
     * @param numberFormatConfiguration
     *        Formatting configuration for number fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatConfiguration withNumberFormatConfiguration(NumberFormatConfiguration numberFormatConfiguration) {
        setNumberFormatConfiguration(numberFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * Formatting configuration for <code>DateTime</code> fields.
     * </p>
     * 
     * @param dateTimeFormatConfiguration
     *        Formatting configuration for <code>DateTime</code> fields.
     */

    public void setDateTimeFormatConfiguration(DateTimeFormatConfiguration dateTimeFormatConfiguration) {
        this.dateTimeFormatConfiguration = dateTimeFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for <code>DateTime</code> fields.
     * </p>
     * 
     * @return Formatting configuration for <code>DateTime</code> fields.
     */

    public DateTimeFormatConfiguration getDateTimeFormatConfiguration() {
        return this.dateTimeFormatConfiguration;
    }

    /**
     * <p>
     * Formatting configuration for <code>DateTime</code> fields.
     * </p>
     * 
     * @param dateTimeFormatConfiguration
     *        Formatting configuration for <code>DateTime</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatConfiguration withDateTimeFormatConfiguration(DateTimeFormatConfiguration dateTimeFormatConfiguration) {
        setDateTimeFormatConfiguration(dateTimeFormatConfiguration);
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
        if (getStringFormatConfiguration() != null)
            sb.append("StringFormatConfiguration: ").append(getStringFormatConfiguration()).append(",");
        if (getNumberFormatConfiguration() != null)
            sb.append("NumberFormatConfiguration: ").append(getNumberFormatConfiguration()).append(",");
        if (getDateTimeFormatConfiguration() != null)
            sb.append("DateTimeFormatConfiguration: ").append(getDateTimeFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormatConfiguration == false)
            return false;
        FormatConfiguration other = (FormatConfiguration) obj;
        if (other.getStringFormatConfiguration() == null ^ this.getStringFormatConfiguration() == null)
            return false;
        if (other.getStringFormatConfiguration() != null && other.getStringFormatConfiguration().equals(this.getStringFormatConfiguration()) == false)
            return false;
        if (other.getNumberFormatConfiguration() == null ^ this.getNumberFormatConfiguration() == null)
            return false;
        if (other.getNumberFormatConfiguration() != null && other.getNumberFormatConfiguration().equals(this.getNumberFormatConfiguration()) == false)
            return false;
        if (other.getDateTimeFormatConfiguration() == null ^ this.getDateTimeFormatConfiguration() == null)
            return false;
        if (other.getDateTimeFormatConfiguration() != null && other.getDateTimeFormatConfiguration().equals(this.getDateTimeFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringFormatConfiguration() == null) ? 0 : getStringFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNumberFormatConfiguration() == null) ? 0 : getNumberFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDateTimeFormatConfiguration() == null) ? 0 : getDateTimeFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FormatConfiguration clone() {
        try {
            return (FormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
