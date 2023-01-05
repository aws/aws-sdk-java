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
 * The options that determine the numeric separator configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericSeparatorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericSeparatorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     */
    private String decimalSeparator;
    /**
     * <p>
     * The options that determine the thousands separator configuration.
     * </p>
     */
    private ThousandSeparatorOptions thousandsSeparator;

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     * 
     * @param decimalSeparator
     *        Determines the decimal separator.
     * @see NumericSeparatorSymbol
     */

    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     * 
     * @return Determines the decimal separator.
     * @see NumericSeparatorSymbol
     */

    public String getDecimalSeparator() {
        return this.decimalSeparator;
    }

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     * 
     * @param decimalSeparator
     *        Determines the decimal separator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericSeparatorSymbol
     */

    public NumericSeparatorConfiguration withDecimalSeparator(String decimalSeparator) {
        setDecimalSeparator(decimalSeparator);
        return this;
    }

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     * 
     * @param decimalSeparator
     *        Determines the decimal separator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericSeparatorSymbol
     */

    public NumericSeparatorConfiguration withDecimalSeparator(NumericSeparatorSymbol decimalSeparator) {
        this.decimalSeparator = decimalSeparator.toString();
        return this;
    }

    /**
     * <p>
     * The options that determine the thousands separator configuration.
     * </p>
     * 
     * @param thousandsSeparator
     *        The options that determine the thousands separator configuration.
     */

    public void setThousandsSeparator(ThousandSeparatorOptions thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    /**
     * <p>
     * The options that determine the thousands separator configuration.
     * </p>
     * 
     * @return The options that determine the thousands separator configuration.
     */

    public ThousandSeparatorOptions getThousandsSeparator() {
        return this.thousandsSeparator;
    }

    /**
     * <p>
     * The options that determine the thousands separator configuration.
     * </p>
     * 
     * @param thousandsSeparator
     *        The options that determine the thousands separator configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericSeparatorConfiguration withThousandsSeparator(ThousandSeparatorOptions thousandsSeparator) {
        setThousandsSeparator(thousandsSeparator);
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
        if (getDecimalSeparator() != null)
            sb.append("DecimalSeparator: ").append(getDecimalSeparator()).append(",");
        if (getThousandsSeparator() != null)
            sb.append("ThousandsSeparator: ").append(getThousandsSeparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericSeparatorConfiguration == false)
            return false;
        NumericSeparatorConfiguration other = (NumericSeparatorConfiguration) obj;
        if (other.getDecimalSeparator() == null ^ this.getDecimalSeparator() == null)
            return false;
        if (other.getDecimalSeparator() != null && other.getDecimalSeparator().equals(this.getDecimalSeparator()) == false)
            return false;
        if (other.getThousandsSeparator() == null ^ this.getThousandsSeparator() == null)
            return false;
        if (other.getThousandsSeparator() != null && other.getThousandsSeparator().equals(this.getThousandsSeparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecimalSeparator() == null) ? 0 : getDecimalSeparator().hashCode());
        hashCode = prime * hashCode + ((getThousandsSeparator() == null) ? 0 : getThousandsSeparator().hashCode());
        return hashCode;
    }

    @Override
    public NumericSeparatorConfiguration clone() {
        try {
            return (NumericSeparatorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericSeparatorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
