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
 * The options that determine the number display format configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumberDisplayFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberDisplayFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the prefix value of the number format.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * Determines the suffix value of the number format.
     * </p>
     */
    private String suffix;
    /**
     * <p>
     * The options that determine the numeric separator configuration.
     * </p>
     */
    private NumericSeparatorConfiguration separatorConfiguration;
    /**
     * <p>
     * The option that determines the decimal places configuration.
     * </p>
     */
    private DecimalPlacesConfiguration decimalPlacesConfiguration;
    /**
     * <p>
     * Determines the number scale value of the number format.
     * </p>
     */
    private String numberScale;
    /**
     * <p>
     * The options that determine the negative value configuration.
     * </p>
     */
    private NegativeValueConfiguration negativeValueConfiguration;
    /**
     * <p>
     * The options that determine the null value format configuration.
     * </p>
     */
    private NullValueFormatConfiguration nullValueFormatConfiguration;

    /**
     * <p>
     * Determines the prefix value of the number format.
     * </p>
     * 
     * @param prefix
     *        Determines the prefix value of the number format.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Determines the prefix value of the number format.
     * </p>
     * 
     * @return Determines the prefix value of the number format.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Determines the prefix value of the number format.
     * </p>
     * 
     * @param prefix
     *        Determines the prefix value of the number format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberDisplayFormatConfiguration withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * Determines the suffix value of the number format.
     * </p>
     * 
     * @param suffix
     *        Determines the suffix value of the number format.
     */

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * Determines the suffix value of the number format.
     * </p>
     * 
     * @return Determines the suffix value of the number format.
     */

    public String getSuffix() {
        return this.suffix;
    }

    /**
     * <p>
     * Determines the suffix value of the number format.
     * </p>
     * 
     * @param suffix
     *        Determines the suffix value of the number format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberDisplayFormatConfiguration withSuffix(String suffix) {
        setSuffix(suffix);
        return this;
    }

    /**
     * <p>
     * The options that determine the numeric separator configuration.
     * </p>
     * 
     * @param separatorConfiguration
     *        The options that determine the numeric separator configuration.
     */

    public void setSeparatorConfiguration(NumericSeparatorConfiguration separatorConfiguration) {
        this.separatorConfiguration = separatorConfiguration;
    }

    /**
     * <p>
     * The options that determine the numeric separator configuration.
     * </p>
     * 
     * @return The options that determine the numeric separator configuration.
     */

    public NumericSeparatorConfiguration getSeparatorConfiguration() {
        return this.separatorConfiguration;
    }

    /**
     * <p>
     * The options that determine the numeric separator configuration.
     * </p>
     * 
     * @param separatorConfiguration
     *        The options that determine the numeric separator configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberDisplayFormatConfiguration withSeparatorConfiguration(NumericSeparatorConfiguration separatorConfiguration) {
        setSeparatorConfiguration(separatorConfiguration);
        return this;
    }

    /**
     * <p>
     * The option that determines the decimal places configuration.
     * </p>
     * 
     * @param decimalPlacesConfiguration
     *        The option that determines the decimal places configuration.
     */

    public void setDecimalPlacesConfiguration(DecimalPlacesConfiguration decimalPlacesConfiguration) {
        this.decimalPlacesConfiguration = decimalPlacesConfiguration;
    }

    /**
     * <p>
     * The option that determines the decimal places configuration.
     * </p>
     * 
     * @return The option that determines the decimal places configuration.
     */

    public DecimalPlacesConfiguration getDecimalPlacesConfiguration() {
        return this.decimalPlacesConfiguration;
    }

    /**
     * <p>
     * The option that determines the decimal places configuration.
     * </p>
     * 
     * @param decimalPlacesConfiguration
     *        The option that determines the decimal places configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberDisplayFormatConfiguration withDecimalPlacesConfiguration(DecimalPlacesConfiguration decimalPlacesConfiguration) {
        setDecimalPlacesConfiguration(decimalPlacesConfiguration);
        return this;
    }

    /**
     * <p>
     * Determines the number scale value of the number format.
     * </p>
     * 
     * @param numberScale
     *        Determines the number scale value of the number format.
     * @see NumberScale
     */

    public void setNumberScale(String numberScale) {
        this.numberScale = numberScale;
    }

    /**
     * <p>
     * Determines the number scale value of the number format.
     * </p>
     * 
     * @return Determines the number scale value of the number format.
     * @see NumberScale
     */

    public String getNumberScale() {
        return this.numberScale;
    }

    /**
     * <p>
     * Determines the number scale value of the number format.
     * </p>
     * 
     * @param numberScale
     *        Determines the number scale value of the number format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberScale
     */

    public NumberDisplayFormatConfiguration withNumberScale(String numberScale) {
        setNumberScale(numberScale);
        return this;
    }

    /**
     * <p>
     * Determines the number scale value of the number format.
     * </p>
     * 
     * @param numberScale
     *        Determines the number scale value of the number format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberScale
     */

    public NumberDisplayFormatConfiguration withNumberScale(NumberScale numberScale) {
        this.numberScale = numberScale.toString();
        return this;
    }

    /**
     * <p>
     * The options that determine the negative value configuration.
     * </p>
     * 
     * @param negativeValueConfiguration
     *        The options that determine the negative value configuration.
     */

    public void setNegativeValueConfiguration(NegativeValueConfiguration negativeValueConfiguration) {
        this.negativeValueConfiguration = negativeValueConfiguration;
    }

    /**
     * <p>
     * The options that determine the negative value configuration.
     * </p>
     * 
     * @return The options that determine the negative value configuration.
     */

    public NegativeValueConfiguration getNegativeValueConfiguration() {
        return this.negativeValueConfiguration;
    }

    /**
     * <p>
     * The options that determine the negative value configuration.
     * </p>
     * 
     * @param negativeValueConfiguration
     *        The options that determine the negative value configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberDisplayFormatConfiguration withNegativeValueConfiguration(NegativeValueConfiguration negativeValueConfiguration) {
        setNegativeValueConfiguration(negativeValueConfiguration);
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

    public NumberDisplayFormatConfiguration withNullValueFormatConfiguration(NullValueFormatConfiguration nullValueFormatConfiguration) {
        setNullValueFormatConfiguration(nullValueFormatConfiguration);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append("***Sensitive Data Redacted***").append(",");
        if (getSuffix() != null)
            sb.append("Suffix: ").append("***Sensitive Data Redacted***").append(",");
        if (getSeparatorConfiguration() != null)
            sb.append("SeparatorConfiguration: ").append(getSeparatorConfiguration()).append(",");
        if (getDecimalPlacesConfiguration() != null)
            sb.append("DecimalPlacesConfiguration: ").append(getDecimalPlacesConfiguration()).append(",");
        if (getNumberScale() != null)
            sb.append("NumberScale: ").append(getNumberScale()).append(",");
        if (getNegativeValueConfiguration() != null)
            sb.append("NegativeValueConfiguration: ").append(getNegativeValueConfiguration()).append(",");
        if (getNullValueFormatConfiguration() != null)
            sb.append("NullValueFormatConfiguration: ").append(getNullValueFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberDisplayFormatConfiguration == false)
            return false;
        NumberDisplayFormatConfiguration other = (NumberDisplayFormatConfiguration) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        if (other.getSeparatorConfiguration() == null ^ this.getSeparatorConfiguration() == null)
            return false;
        if (other.getSeparatorConfiguration() != null && other.getSeparatorConfiguration().equals(this.getSeparatorConfiguration()) == false)
            return false;
        if (other.getDecimalPlacesConfiguration() == null ^ this.getDecimalPlacesConfiguration() == null)
            return false;
        if (other.getDecimalPlacesConfiguration() != null && other.getDecimalPlacesConfiguration().equals(this.getDecimalPlacesConfiguration()) == false)
            return false;
        if (other.getNumberScale() == null ^ this.getNumberScale() == null)
            return false;
        if (other.getNumberScale() != null && other.getNumberScale().equals(this.getNumberScale()) == false)
            return false;
        if (other.getNegativeValueConfiguration() == null ^ this.getNegativeValueConfiguration() == null)
            return false;
        if (other.getNegativeValueConfiguration() != null && other.getNegativeValueConfiguration().equals(this.getNegativeValueConfiguration()) == false)
            return false;
        if (other.getNullValueFormatConfiguration() == null ^ this.getNullValueFormatConfiguration() == null)
            return false;
        if (other.getNullValueFormatConfiguration() != null && other.getNullValueFormatConfiguration().equals(this.getNullValueFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        hashCode = prime * hashCode + ((getSeparatorConfiguration() == null) ? 0 : getSeparatorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDecimalPlacesConfiguration() == null) ? 0 : getDecimalPlacesConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNumberScale() == null) ? 0 : getNumberScale().hashCode());
        hashCode = prime * hashCode + ((getNegativeValueConfiguration() == null) ? 0 : getNegativeValueConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNullValueFormatConfiguration() == null) ? 0 : getNullValueFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NumberDisplayFormatConfiguration clone() {
        try {
            return (NumberDisplayFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumberDisplayFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
