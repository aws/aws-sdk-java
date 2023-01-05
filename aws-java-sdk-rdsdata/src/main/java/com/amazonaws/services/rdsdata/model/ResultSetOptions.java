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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options that control how the result set is returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ResultSetOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultSetOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value of
     * <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     * <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a Double
     * value otherwise.
     * </p>
     * <note>
     * <p>
     * Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to
     * String, especially when working with currency values.
     * </p>
     * </note>
     */
    private String decimalReturnType;
    /**
     * <p>
     * A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are <code>LONG</code>
     * and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code> if the length or precision
     * of numeric values might cause truncation or rounding errors.
     * </p>
     */
    private String longReturnType;

    /**
     * <p>
     * A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value of
     * <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     * <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a Double
     * value otherwise.
     * </p>
     * <note>
     * <p>
     * Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to
     * String, especially when working with currency values.
     * </p>
     * </note>
     * 
     * @param decimalReturnType
     *        A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value
     *        of <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     *        <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a
     *        Double value otherwise.</p> <note>
     *        <p>
     *        Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting
     *        to String, especially when working with currency values.
     *        </p>
     * @see DecimalReturnType
     */

    public void setDecimalReturnType(String decimalReturnType) {
        this.decimalReturnType = decimalReturnType;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value of
     * <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     * <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a Double
     * value otherwise.
     * </p>
     * <note>
     * <p>
     * Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to
     * String, especially when working with currency values.
     * </p>
     * </note>
     * 
     * @return A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value
     *         of <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     *         <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a
     *         Double value otherwise.</p> <note>
     *         <p>
     *         Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting
     *         to String, especially when working with currency values.
     *         </p>
     * @see DecimalReturnType
     */

    public String getDecimalReturnType() {
        return this.decimalReturnType;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value of
     * <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     * <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a Double
     * value otherwise.
     * </p>
     * <note>
     * <p>
     * Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to
     * String, especially when working with currency values.
     * </p>
     * </note>
     * 
     * @param decimalReturnType
     *        A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value
     *        of <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     *        <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a
     *        Double value otherwise.</p> <note>
     *        <p>
     *        Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting
     *        to String, especially when working with currency values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecimalReturnType
     */

    public ResultSetOptions withDecimalReturnType(String decimalReturnType) {
        setDecimalReturnType(decimalReturnType);
        return this;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value of
     * <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     * <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a Double
     * value otherwise.
     * </p>
     * <note>
     * <p>
     * Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to
     * String, especially when working with currency values.
     * </p>
     * </note>
     * 
     * @param decimalReturnType
     *        A value that indicates how a field of <code>DECIMAL</code> type is represented in the response. The value
     *        of <code>STRING</code>, the default, specifies that it is converted to a String value. The value of
     *        <code>DOUBLE_OR_LONG</code> specifies that it is converted to a Long value if its scale is 0, or to a
     *        Double value otherwise.</p> <note>
     *        <p>
     *        Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting
     *        to String, especially when working with currency values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecimalReturnType
     */

    public ResultSetOptions withDecimalReturnType(DecimalReturnType decimalReturnType) {
        this.decimalReturnType = decimalReturnType.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are <code>LONG</code>
     * and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code> if the length or precision
     * of numeric values might cause truncation or rounding errors.
     * </p>
     * 
     * @param longReturnType
     *        A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are
     *        <code>LONG</code> and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code>
     *        if the length or precision of numeric values might cause truncation or rounding errors.
     * @see LongReturnType
     */

    public void setLongReturnType(String longReturnType) {
        this.longReturnType = longReturnType;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are <code>LONG</code>
     * and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code> if the length or precision
     * of numeric values might cause truncation or rounding errors.
     * </p>
     * 
     * @return A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are
     *         <code>LONG</code> and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code>
     *         if the length or precision of numeric values might cause truncation or rounding errors.
     * @see LongReturnType
     */

    public String getLongReturnType() {
        return this.longReturnType;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are <code>LONG</code>
     * and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code> if the length or precision
     * of numeric values might cause truncation or rounding errors.
     * </p>
     * 
     * @param longReturnType
     *        A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are
     *        <code>LONG</code> and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code>
     *        if the length or precision of numeric values might cause truncation or rounding errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongReturnType
     */

    public ResultSetOptions withLongReturnType(String longReturnType) {
        setLongReturnType(longReturnType);
        return this;
    }

    /**
     * <p>
     * A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are <code>LONG</code>
     * and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code> if the length or precision
     * of numeric values might cause truncation or rounding errors.
     * </p>
     * 
     * @param longReturnType
     *        A value that indicates how a field of <code>LONG</code> type is represented. Allowed values are
     *        <code>LONG</code> and <code>STRING</code>. The default is <code>LONG</code>. Specify <code>STRING</code>
     *        if the length or precision of numeric values might cause truncation or rounding errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongReturnType
     */

    public ResultSetOptions withLongReturnType(LongReturnType longReturnType) {
        this.longReturnType = longReturnType.toString();
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
        if (getDecimalReturnType() != null)
            sb.append("DecimalReturnType: ").append(getDecimalReturnType()).append(",");
        if (getLongReturnType() != null)
            sb.append("LongReturnType: ").append(getLongReturnType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSetOptions == false)
            return false;
        ResultSetOptions other = (ResultSetOptions) obj;
        if (other.getDecimalReturnType() == null ^ this.getDecimalReturnType() == null)
            return false;
        if (other.getDecimalReturnType() != null && other.getDecimalReturnType().equals(this.getDecimalReturnType()) == false)
            return false;
        if (other.getLongReturnType() == null ^ this.getLongReturnType() == null)
            return false;
        if (other.getLongReturnType() != null && other.getLongReturnType().equals(this.getLongReturnType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecimalReturnType() == null) ? 0 : getDecimalReturnType().hashCode());
        hashCode = prime * hashCode + ((getLongReturnType() == null) ? 0 : getLongReturnType().hashCode());
        return hashCode;
    }

    @Override
    public ResultSetOptions clone() {
        try {
            return (ResultSetOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ResultSetOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
