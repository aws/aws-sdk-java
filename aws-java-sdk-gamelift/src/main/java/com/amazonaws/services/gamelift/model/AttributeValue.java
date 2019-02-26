/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Values for use in <a>Player</a> attribute key:value pairs. This object lets you specify an attribute value using any
 * of the valid data types: string, number, string array or data map. Each <code>AttributeValue</code> object can use
 * only one of the available properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For single string values. Maximum string length is 100 characters.
     * </p>
     */
    private String s;
    /**
     * <p>
     * For number values, expressed as double.
     * </p>
     */
    private Double n;
    /**
     * <p>
     * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     * recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * </p>
     */
    private java.util.List<String> sL;
    /**
     * <p>
     * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     * </p>
     */
    private java.util.Map<String, Double> sDM;

    /**
     * <p>
     * For single string values. Maximum string length is 100 characters.
     * </p>
     * 
     * @param s
     *        For single string values. Maximum string length is 100 characters.
     */

    public void setS(String s) {
        this.s = s;
    }

    /**
     * <p>
     * For single string values. Maximum string length is 100 characters.
     * </p>
     * 
     * @return For single string values. Maximum string length is 100 characters.
     */

    public String getS() {
        return this.s;
    }

    /**
     * <p>
     * For single string values. Maximum string length is 100 characters.
     * </p>
     * 
     * @param s
     *        For single string values. Maximum string length is 100 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withS(String s) {
        setS(s);
        return this;
    }

    /**
     * <p>
     * For number values, expressed as double.
     * </p>
     * 
     * @param n
     *        For number values, expressed as double.
     */

    public void setN(Double n) {
        this.n = n;
    }

    /**
     * <p>
     * For number values, expressed as double.
     * </p>
     * 
     * @return For number values, expressed as double.
     */

    public Double getN() {
        return this.n;
    }

    /**
     * <p>
     * For number values, expressed as double.
     * </p>
     * 
     * @param n
     *        For number values, expressed as double.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withN(Double n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     * recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * </p>
     * 
     * @return For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are
     *         not recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     */

    public java.util.List<String> getSL() {
        return sL;
    }

    /**
     * <p>
     * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     * recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * </p>
     * 
     * @param sL
     *        For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     *        recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     */

    public void setSL(java.util.Collection<String> sL) {
        if (sL == null) {
            this.sL = null;
            return;
        }

        this.sL = new java.util.ArrayList<String>(sL);
    }

    /**
     * <p>
     * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     * recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSL(java.util.Collection)} or {@link #withSL(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sL
     *        For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     *        recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSL(String... sL) {
        if (this.sL == null) {
            setSL(new java.util.ArrayList<String>(sL.length));
        }
        for (String ele : sL) {
            this.sL.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     * recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * </p>
     * 
     * @param sL
     *        For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not
     *        recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSL(java.util.Collection<String> sL) {
        setSL(sL);
        return this;
    }

    /**
     * <p>
     * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     * </p>
     * 
     * @return For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     */

    public java.util.Map<String, Double> getSDM() {
        return sDM;
    }

    /**
     * <p>
     * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     * </p>
     * 
     * @param sDM
     *        For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     */

    public void setSDM(java.util.Map<String, Double> sDM) {
        this.sDM = sDM;
    }

    /**
     * <p>
     * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     * </p>
     * 
     * @param sDM
     *        For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSDM(java.util.Map<String, Double> sDM) {
        setSDM(sDM);
        return this;
    }

    public AttributeValue addSDMEntry(String key, Double value) {
        if (null == this.sDM) {
            this.sDM = new java.util.HashMap<String, Double>();
        }
        if (this.sDM.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sDM.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SDM.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue clearSDMEntries() {
        this.sDM = null;
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
        if (getS() != null)
            sb.append("S: ").append(getS()).append(",");
        if (getN() != null)
            sb.append("N: ").append(getN()).append(",");
        if (getSL() != null)
            sb.append("SL: ").append(getSL()).append(",");
        if (getSDM() != null)
            sb.append("SDM: ").append(getSDM());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValue == false)
            return false;
        AttributeValue other = (AttributeValue) obj;
        if (other.getS() == null ^ this.getS() == null)
            return false;
        if (other.getS() != null && other.getS().equals(this.getS()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getSL() == null ^ this.getSL() == null)
            return false;
        if (other.getSL() != null && other.getSL().equals(this.getSL()) == false)
            return false;
        if (other.getSDM() == null ^ this.getSDM() == null)
            return false;
        if (other.getSDM() != null && other.getSDM().equals(this.getSDM()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS() == null) ? 0 : getS().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getSL() == null) ? 0 : getSL().hashCode());
        hashCode = prime * hashCode + ((getSDM() == null) ? 0 : getSDM().hashCode());
        return hashCode;
    }

    @Override
    public AttributeValue clone() {
        try {
            return (AttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.AttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
