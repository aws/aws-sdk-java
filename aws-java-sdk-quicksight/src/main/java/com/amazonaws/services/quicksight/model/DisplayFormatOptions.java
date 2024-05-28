/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that represents additional options for display formatting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DisplayFormatOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisplayFormatOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether to use blank cell format.
     * </p>
     */
    private Boolean useBlankCellFormat;
    /**
     * <p>
     * Determines the blank cell format.
     * </p>
     */
    private String blankCellFormat;
    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     */
    private String dateFormat;
    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     */
    private String decimalSeparator;
    /**
     * <p>
     * Determines the grouping separator.
     * </p>
     */
    private String groupingSeparator;
    /**
     * <p>
     * A Boolean value that indicates whether to use grouping.
     * </p>
     */
    private Boolean useGrouping;
    /**
     * <p>
     * Determines the number of fraction digits.
     * </p>
     */
    private Integer fractionDigits;
    /**
     * <p>
     * The prefix value for a display format.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The suffix value for a display format.
     * </p>
     */
    private String suffix;
    /**
     * <p>
     * The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     * <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * </p>
     */
    private String unitScaler;
    /**
     * <p>
     * The negative format.
     * </p>
     */
    private NegativeFormat negativeFormat;
    /**
     * <p>
     * The currency symbol, such as <code>USD</code>.
     * </p>
     */
    private String currencySymbol;

    /**
     * <p>
     * A Boolean value that indicates whether to use blank cell format.
     * </p>
     * 
     * @param useBlankCellFormat
     *        A Boolean value that indicates whether to use blank cell format.
     */

    public void setUseBlankCellFormat(Boolean useBlankCellFormat) {
        this.useBlankCellFormat = useBlankCellFormat;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use blank cell format.
     * </p>
     * 
     * @return A Boolean value that indicates whether to use blank cell format.
     */

    public Boolean getUseBlankCellFormat() {
        return this.useBlankCellFormat;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use blank cell format.
     * </p>
     * 
     * @param useBlankCellFormat
     *        A Boolean value that indicates whether to use blank cell format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withUseBlankCellFormat(Boolean useBlankCellFormat) {
        setUseBlankCellFormat(useBlankCellFormat);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use blank cell format.
     * </p>
     * 
     * @return A Boolean value that indicates whether to use blank cell format.
     */

    public Boolean isUseBlankCellFormat() {
        return this.useBlankCellFormat;
    }

    /**
     * <p>
     * Determines the blank cell format.
     * </p>
     * 
     * @param blankCellFormat
     *        Determines the blank cell format.
     */

    public void setBlankCellFormat(String blankCellFormat) {
        this.blankCellFormat = blankCellFormat;
    }

    /**
     * <p>
     * Determines the blank cell format.
     * </p>
     * 
     * @return Determines the blank cell format.
     */

    public String getBlankCellFormat() {
        return this.blankCellFormat;
    }

    /**
     * <p>
     * Determines the blank cell format.
     * </p>
     * 
     * @param blankCellFormat
     *        Determines the blank cell format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withBlankCellFormat(String blankCellFormat) {
        setBlankCellFormat(blankCellFormat);
        return this;
    }

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @param dateFormat
     *        Determines the <code>DateTime</code> format.
     */

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @return Determines the <code>DateTime</code> format.
     */

    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * <p>
     * Determines the <code>DateTime</code> format.
     * </p>
     * 
     * @param dateFormat
     *        Determines the <code>DateTime</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withDateFormat(String dateFormat) {
        setDateFormat(dateFormat);
        return this;
    }

    /**
     * <p>
     * Determines the decimal separator.
     * </p>
     * 
     * @param decimalSeparator
     *        Determines the decimal separator.
     * @see TopicNumericSeparatorSymbol
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
     * @see TopicNumericSeparatorSymbol
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
     * @see TopicNumericSeparatorSymbol
     */

    public DisplayFormatOptions withDecimalSeparator(String decimalSeparator) {
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
     * @see TopicNumericSeparatorSymbol
     */

    public DisplayFormatOptions withDecimalSeparator(TopicNumericSeparatorSymbol decimalSeparator) {
        this.decimalSeparator = decimalSeparator.toString();
        return this;
    }

    /**
     * <p>
     * Determines the grouping separator.
     * </p>
     * 
     * @param groupingSeparator
     *        Determines the grouping separator.
     */

    public void setGroupingSeparator(String groupingSeparator) {
        this.groupingSeparator = groupingSeparator;
    }

    /**
     * <p>
     * Determines the grouping separator.
     * </p>
     * 
     * @return Determines the grouping separator.
     */

    public String getGroupingSeparator() {
        return this.groupingSeparator;
    }

    /**
     * <p>
     * Determines the grouping separator.
     * </p>
     * 
     * @param groupingSeparator
     *        Determines the grouping separator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withGroupingSeparator(String groupingSeparator) {
        setGroupingSeparator(groupingSeparator);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use grouping.
     * </p>
     * 
     * @param useGrouping
     *        A Boolean value that indicates whether to use grouping.
     */

    public void setUseGrouping(Boolean useGrouping) {
        this.useGrouping = useGrouping;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use grouping.
     * </p>
     * 
     * @return A Boolean value that indicates whether to use grouping.
     */

    public Boolean getUseGrouping() {
        return this.useGrouping;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use grouping.
     * </p>
     * 
     * @param useGrouping
     *        A Boolean value that indicates whether to use grouping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withUseGrouping(Boolean useGrouping) {
        setUseGrouping(useGrouping);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to use grouping.
     * </p>
     * 
     * @return A Boolean value that indicates whether to use grouping.
     */

    public Boolean isUseGrouping() {
        return this.useGrouping;
    }

    /**
     * <p>
     * Determines the number of fraction digits.
     * </p>
     * 
     * @param fractionDigits
     *        Determines the number of fraction digits.
     */

    public void setFractionDigits(Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
    }

    /**
     * <p>
     * Determines the number of fraction digits.
     * </p>
     * 
     * @return Determines the number of fraction digits.
     */

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     * <p>
     * Determines the number of fraction digits.
     * </p>
     * 
     * @param fractionDigits
     *        Determines the number of fraction digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withFractionDigits(Integer fractionDigits) {
        setFractionDigits(fractionDigits);
        return this;
    }

    /**
     * <p>
     * The prefix value for a display format.
     * </p>
     * 
     * @param prefix
     *        The prefix value for a display format.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix value for a display format.
     * </p>
     * 
     * @return The prefix value for a display format.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix value for a display format.
     * </p>
     * 
     * @param prefix
     *        The prefix value for a display format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The suffix value for a display format.
     * </p>
     * 
     * @param suffix
     *        The suffix value for a display format.
     */

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * The suffix value for a display format.
     * </p>
     * 
     * @return The suffix value for a display format.
     */

    public String getSuffix() {
        return this.suffix;
    }

    /**
     * <p>
     * The suffix value for a display format.
     * </p>
     * 
     * @param suffix
     *        The suffix value for a display format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withSuffix(String suffix) {
        setSuffix(suffix);
        return this;
    }

    /**
     * <p>
     * The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     * <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * </p>
     * 
     * @param unitScaler
     *        The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     *        <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * @see NumberScale
     */

    public void setUnitScaler(String unitScaler) {
        this.unitScaler = unitScaler;
    }

    /**
     * <p>
     * The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     * <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * </p>
     * 
     * @return The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     *         <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * @see NumberScale
     */

    public String getUnitScaler() {
        return this.unitScaler;
    }

    /**
     * <p>
     * The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     * <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * </p>
     * 
     * @param unitScaler
     *        The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     *        <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberScale
     */

    public DisplayFormatOptions withUnitScaler(String unitScaler) {
        setUnitScaler(unitScaler);
        return this;
    }

    /**
     * <p>
     * The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     * <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * </p>
     * 
     * @param unitScaler
     *        The unit scaler. Valid values for this structure are: <code>NONE</code>, <code>AUTO</code>,
     *        <code>THOUSANDS</code>, <code>MILLIONS</code>, <code>BILLIONS</code>, and <code>TRILLIONS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberScale
     */

    public DisplayFormatOptions withUnitScaler(NumberScale unitScaler) {
        this.unitScaler = unitScaler.toString();
        return this;
    }

    /**
     * <p>
     * The negative format.
     * </p>
     * 
     * @param negativeFormat
     *        The negative format.
     */

    public void setNegativeFormat(NegativeFormat negativeFormat) {
        this.negativeFormat = negativeFormat;
    }

    /**
     * <p>
     * The negative format.
     * </p>
     * 
     * @return The negative format.
     */

    public NegativeFormat getNegativeFormat() {
        return this.negativeFormat;
    }

    /**
     * <p>
     * The negative format.
     * </p>
     * 
     * @param negativeFormat
     *        The negative format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withNegativeFormat(NegativeFormat negativeFormat) {
        setNegativeFormat(negativeFormat);
        return this;
    }

    /**
     * <p>
     * The currency symbol, such as <code>USD</code>.
     * </p>
     * 
     * @param currencySymbol
     *        The currency symbol, such as <code>USD</code>.
     */

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * <p>
     * The currency symbol, such as <code>USD</code>.
     * </p>
     * 
     * @return The currency symbol, such as <code>USD</code>.
     */

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /**
     * <p>
     * The currency symbol, such as <code>USD</code>.
     * </p>
     * 
     * @param currencySymbol
     *        The currency symbol, such as <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayFormatOptions withCurrencySymbol(String currencySymbol) {
        setCurrencySymbol(currencySymbol);
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
        if (getUseBlankCellFormat() != null)
            sb.append("UseBlankCellFormat: ").append(getUseBlankCellFormat()).append(",");
        if (getBlankCellFormat() != null)
            sb.append("BlankCellFormat: ").append(getBlankCellFormat()).append(",");
        if (getDateFormat() != null)
            sb.append("DateFormat: ").append(getDateFormat()).append(",");
        if (getDecimalSeparator() != null)
            sb.append("DecimalSeparator: ").append(getDecimalSeparator()).append(",");
        if (getGroupingSeparator() != null)
            sb.append("GroupingSeparator: ").append(getGroupingSeparator()).append(",");
        if (getUseGrouping() != null)
            sb.append("UseGrouping: ").append(getUseGrouping()).append(",");
        if (getFractionDigits() != null)
            sb.append("FractionDigits: ").append(getFractionDigits()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getSuffix() != null)
            sb.append("Suffix: ").append(getSuffix()).append(",");
        if (getUnitScaler() != null)
            sb.append("UnitScaler: ").append(getUnitScaler()).append(",");
        if (getNegativeFormat() != null)
            sb.append("NegativeFormat: ").append(getNegativeFormat()).append(",");
        if (getCurrencySymbol() != null)
            sb.append("CurrencySymbol: ").append(getCurrencySymbol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisplayFormatOptions == false)
            return false;
        DisplayFormatOptions other = (DisplayFormatOptions) obj;
        if (other.getUseBlankCellFormat() == null ^ this.getUseBlankCellFormat() == null)
            return false;
        if (other.getUseBlankCellFormat() != null && other.getUseBlankCellFormat().equals(this.getUseBlankCellFormat()) == false)
            return false;
        if (other.getBlankCellFormat() == null ^ this.getBlankCellFormat() == null)
            return false;
        if (other.getBlankCellFormat() != null && other.getBlankCellFormat().equals(this.getBlankCellFormat()) == false)
            return false;
        if (other.getDateFormat() == null ^ this.getDateFormat() == null)
            return false;
        if (other.getDateFormat() != null && other.getDateFormat().equals(this.getDateFormat()) == false)
            return false;
        if (other.getDecimalSeparator() == null ^ this.getDecimalSeparator() == null)
            return false;
        if (other.getDecimalSeparator() != null && other.getDecimalSeparator().equals(this.getDecimalSeparator()) == false)
            return false;
        if (other.getGroupingSeparator() == null ^ this.getGroupingSeparator() == null)
            return false;
        if (other.getGroupingSeparator() != null && other.getGroupingSeparator().equals(this.getGroupingSeparator()) == false)
            return false;
        if (other.getUseGrouping() == null ^ this.getUseGrouping() == null)
            return false;
        if (other.getUseGrouping() != null && other.getUseGrouping().equals(this.getUseGrouping()) == false)
            return false;
        if (other.getFractionDigits() == null ^ this.getFractionDigits() == null)
            return false;
        if (other.getFractionDigits() != null && other.getFractionDigits().equals(this.getFractionDigits()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        if (other.getUnitScaler() == null ^ this.getUnitScaler() == null)
            return false;
        if (other.getUnitScaler() != null && other.getUnitScaler().equals(this.getUnitScaler()) == false)
            return false;
        if (other.getNegativeFormat() == null ^ this.getNegativeFormat() == null)
            return false;
        if (other.getNegativeFormat() != null && other.getNegativeFormat().equals(this.getNegativeFormat()) == false)
            return false;
        if (other.getCurrencySymbol() == null ^ this.getCurrencySymbol() == null)
            return false;
        if (other.getCurrencySymbol() != null && other.getCurrencySymbol().equals(this.getCurrencySymbol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseBlankCellFormat() == null) ? 0 : getUseBlankCellFormat().hashCode());
        hashCode = prime * hashCode + ((getBlankCellFormat() == null) ? 0 : getBlankCellFormat().hashCode());
        hashCode = prime * hashCode + ((getDateFormat() == null) ? 0 : getDateFormat().hashCode());
        hashCode = prime * hashCode + ((getDecimalSeparator() == null) ? 0 : getDecimalSeparator().hashCode());
        hashCode = prime * hashCode + ((getGroupingSeparator() == null) ? 0 : getGroupingSeparator().hashCode());
        hashCode = prime * hashCode + ((getUseGrouping() == null) ? 0 : getUseGrouping().hashCode());
        hashCode = prime * hashCode + ((getFractionDigits() == null) ? 0 : getFractionDigits().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        hashCode = prime * hashCode + ((getUnitScaler() == null) ? 0 : getUnitScaler().hashCode());
        hashCode = prime * hashCode + ((getNegativeFormat() == null) ? 0 : getNegativeFormat().hashCode());
        hashCode = prime * hashCode + ((getCurrencySymbol() == null) ? 0 : getCurrencySymbol().hashCode());
        return hashCode;
    }

    @Override
    public DisplayFormatOptions clone() {
        try {
            return (DisplayFormatOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DisplayFormatOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
