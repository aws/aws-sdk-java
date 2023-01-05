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
 * The options that determine the numeric format configuration.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the number display format configuration.
     * </p>
     */
    private NumberDisplayFormatConfiguration numberDisplayFormatConfiguration;
    /**
     * <p>
     * The options that determine the currency display format configuration.
     * </p>
     */
    private CurrencyDisplayFormatConfiguration currencyDisplayFormatConfiguration;
    /**
     * <p>
     * The options that determine the percentage display format configuration.
     * </p>
     */
    private PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration;

    /**
     * <p>
     * The options that determine the number display format configuration.
     * </p>
     * 
     * @param numberDisplayFormatConfiguration
     *        The options that determine the number display format configuration.
     */

    public void setNumberDisplayFormatConfiguration(NumberDisplayFormatConfiguration numberDisplayFormatConfiguration) {
        this.numberDisplayFormatConfiguration = numberDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the number display format configuration.
     * </p>
     * 
     * @return The options that determine the number display format configuration.
     */

    public NumberDisplayFormatConfiguration getNumberDisplayFormatConfiguration() {
        return this.numberDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the number display format configuration.
     * </p>
     * 
     * @param numberDisplayFormatConfiguration
     *        The options that determine the number display format configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericFormatConfiguration withNumberDisplayFormatConfiguration(NumberDisplayFormatConfiguration numberDisplayFormatConfiguration) {
        setNumberDisplayFormatConfiguration(numberDisplayFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the currency display format configuration.
     * </p>
     * 
     * @param currencyDisplayFormatConfiguration
     *        The options that determine the currency display format configuration.
     */

    public void setCurrencyDisplayFormatConfiguration(CurrencyDisplayFormatConfiguration currencyDisplayFormatConfiguration) {
        this.currencyDisplayFormatConfiguration = currencyDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the currency display format configuration.
     * </p>
     * 
     * @return The options that determine the currency display format configuration.
     */

    public CurrencyDisplayFormatConfiguration getCurrencyDisplayFormatConfiguration() {
        return this.currencyDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the currency display format configuration.
     * </p>
     * 
     * @param currencyDisplayFormatConfiguration
     *        The options that determine the currency display format configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericFormatConfiguration withCurrencyDisplayFormatConfiguration(CurrencyDisplayFormatConfiguration currencyDisplayFormatConfiguration) {
        setCurrencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the percentage display format configuration.
     * </p>
     * 
     * @param percentageDisplayFormatConfiguration
     *        The options that determine the percentage display format configuration.
     */

    public void setPercentageDisplayFormatConfiguration(PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration) {
        this.percentageDisplayFormatConfiguration = percentageDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the percentage display format configuration.
     * </p>
     * 
     * @return The options that determine the percentage display format configuration.
     */

    public PercentageDisplayFormatConfiguration getPercentageDisplayFormatConfiguration() {
        return this.percentageDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The options that determine the percentage display format configuration.
     * </p>
     * 
     * @param percentageDisplayFormatConfiguration
     *        The options that determine the percentage display format configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericFormatConfiguration withPercentageDisplayFormatConfiguration(PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration) {
        setPercentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration);
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
        if (getNumberDisplayFormatConfiguration() != null)
            sb.append("NumberDisplayFormatConfiguration: ").append(getNumberDisplayFormatConfiguration()).append(",");
        if (getCurrencyDisplayFormatConfiguration() != null)
            sb.append("CurrencyDisplayFormatConfiguration: ").append(getCurrencyDisplayFormatConfiguration()).append(",");
        if (getPercentageDisplayFormatConfiguration() != null)
            sb.append("PercentageDisplayFormatConfiguration: ").append(getPercentageDisplayFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericFormatConfiguration == false)
            return false;
        NumericFormatConfiguration other = (NumericFormatConfiguration) obj;
        if (other.getNumberDisplayFormatConfiguration() == null ^ this.getNumberDisplayFormatConfiguration() == null)
            return false;
        if (other.getNumberDisplayFormatConfiguration() != null
                && other.getNumberDisplayFormatConfiguration().equals(this.getNumberDisplayFormatConfiguration()) == false)
            return false;
        if (other.getCurrencyDisplayFormatConfiguration() == null ^ this.getCurrencyDisplayFormatConfiguration() == null)
            return false;
        if (other.getCurrencyDisplayFormatConfiguration() != null
                && other.getCurrencyDisplayFormatConfiguration().equals(this.getCurrencyDisplayFormatConfiguration()) == false)
            return false;
        if (other.getPercentageDisplayFormatConfiguration() == null ^ this.getPercentageDisplayFormatConfiguration() == null)
            return false;
        if (other.getPercentageDisplayFormatConfiguration() != null
                && other.getPercentageDisplayFormatConfiguration().equals(this.getPercentageDisplayFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberDisplayFormatConfiguration() == null) ? 0 : getNumberDisplayFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCurrencyDisplayFormatConfiguration() == null) ? 0 : getCurrencyDisplayFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPercentageDisplayFormatConfiguration() == null) ? 0 : getPercentageDisplayFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NumericFormatConfiguration clone() {
        try {
            return (NumericFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
