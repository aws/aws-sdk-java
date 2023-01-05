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
 * Formatting configuration for number fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumberFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the numeric format configuration.
     * </p>
     */
    private NumericFormatConfiguration formatConfiguration;

    /**
     * <p>
     * The options that determine the numeric format configuration.
     * </p>
     * 
     * @param formatConfiguration
     *        The options that determine the numeric format configuration.
     */

    public void setFormatConfiguration(NumericFormatConfiguration formatConfiguration) {
        this.formatConfiguration = formatConfiguration;
    }

    /**
     * <p>
     * The options that determine the numeric format configuration.
     * </p>
     * 
     * @return The options that determine the numeric format configuration.
     */

    public NumericFormatConfiguration getFormatConfiguration() {
        return this.formatConfiguration;
    }

    /**
     * <p>
     * The options that determine the numeric format configuration.
     * </p>
     * 
     * @param formatConfiguration
     *        The options that determine the numeric format configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFormatConfiguration withFormatConfiguration(NumericFormatConfiguration formatConfiguration) {
        setFormatConfiguration(formatConfiguration);
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
        if (getFormatConfiguration() != null)
            sb.append("FormatConfiguration: ").append(getFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberFormatConfiguration == false)
            return false;
        NumberFormatConfiguration other = (NumberFormatConfiguration) obj;
        if (other.getFormatConfiguration() == null ^ this.getFormatConfiguration() == null)
            return false;
        if (other.getFormatConfiguration() != null && other.getFormatConfiguration().equals(this.getFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormatConfiguration() == null) ? 0 : getFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NumberFormatConfiguration clone() {
        try {
            return (NumberFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumberFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
