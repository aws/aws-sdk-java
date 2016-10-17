/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the data for an attribute. You can set one, and only one, of the elements.
 * </p>
 * <p>
 * Each attribute in an item is a name-value pair. An attribute can be single-valued or multi-valued set. For example, a
 * book item can have title and authors attributes. Each book has one title but can have many authors. The multi-valued
 * attribute is a set; duplicate values are not allowed.
 * </p>
 */
public class AttributeValue implements Serializable, Cloneable {

    /**
     * <p>
     * A String data type.
     * </p>
     */
    private String s;
    /**
     * <p>
     * A Number data type.
     * </p>
     */
    private String n;
    /**
     * <p>
     * A Binary data type.
     * </p>
     */
    private java.nio.ByteBuffer b;
    /**
     * <p>
     * A String Set data type.
     * </p>
     */
    private java.util.List<String> sS;
    /**
     * <p>
     * A Number Set data type.
     * </p>
     */
    private java.util.List<String> nS;
    /**
     * <p>
     * A Binary Set data type.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> bS;
    /**
     * <p>
     * A Map of attribute values.
     * </p>
     */
    private java.util.Map<String, AttributeValue> m;
    /**
     * <p>
     * A List of attribute values.
     * </p>
     */
    private java.util.List<AttributeValue> l;
    /**
     * <p>
     * A Null data type.
     * </p>
     */
    private Boolean nULLValue;
    /**
     * <p>
     * A Boolean data type.
     * </p>
     */
    private Boolean bOOL;

    /**
     * Default constructor for AttributeValue object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public AttributeValue() {
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param s
     *        A String data type.
     */
    public AttributeValue(String s) {
        setS(s);
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sS
     *        A String Set data type.
     */
    public AttributeValue(java.util.List<String> sS) {
        setSS(sS);
    }

    /**
     * <p>
     * A String data type.
     * </p>
     * 
     * @param s
     *        A String data type.
     */

    public void setS(String s) {
        this.s = s;
    }

    /**
     * <p>
     * A String data type.
     * </p>
     * 
     * @return A String data type.
     */

    public String getS() {
        return this.s;
    }

    /**
     * <p>
     * A String data type.
     * </p>
     * 
     * @param s
     *        A String data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withS(String s) {
        setS(s);
        return this;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     * 
     * @param n
     *        A Number data type.
     */

    public void setN(String n) {
        this.n = n;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     * 
     * @return A Number data type.
     */

    public String getN() {
        return this.n;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     * 
     * @param n
     *        A Number data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withN(String n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param b
     *        A Binary data type.
     */

    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A Binary data type.
     */

    public java.nio.ByteBuffer getB() {
        return this.b;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     * 
     * @param b
     *        A Binary data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withB(java.nio.ByteBuffer b) {
        setB(b);
        return this;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * 
     * @return A String Set data type.
     */

    public java.util.List<String> getSS() {
        return sS;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * 
     * @param sS
     *        A String Set data type.
     */

    public void setSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
            return;
        }

        this.sS = new java.util.ArrayList<String>(sS);
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSS(java.util.Collection)} or {@link #withSS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sS
     *        A String Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSS(String... sS) {
        if (this.sS == null) {
            setSS(new java.util.ArrayList<String>(sS.length));
        }
        for (String ele : sS) {
            this.sS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * 
     * @param sS
     *        A String Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSS(java.util.Collection<String> sS) {
        setSS(sS);
        return this;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * 
     * @return A Number Set data type.
     */

    public java.util.List<String> getNS() {
        return nS;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * 
     * @param nS
     *        A Number Set data type.
     */

    public void setNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
            return;
        }

        this.nS = new java.util.ArrayList<String>(nS);
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNS(java.util.Collection)} or {@link #withNS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nS
     *        A Number Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNS(String... nS) {
        if (this.nS == null) {
            setNS(new java.util.ArrayList<String>(nS.length));
        }
        for (String ele : nS) {
            this.nS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * 
     * @param nS
     *        A Number Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNS(java.util.Collection<String> nS) {
        setNS(nS);
        return this;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * 
     * @return A Binary Set data type.
     */

    public java.util.List<java.nio.ByteBuffer> getBS() {
        return bS;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * 
     * @param bS
     *        A Binary Set data type.
     */

    public void setBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }

        this.bS = new java.util.ArrayList<java.nio.ByteBuffer>(bS);
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBS(java.util.Collection)} or {@link #withBS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param bS
     *        A Binary Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(java.nio.ByteBuffer... bS) {
        if (this.bS == null) {
            setBS(new java.util.ArrayList<java.nio.ByteBuffer>(bS.length));
        }
        for (java.nio.ByteBuffer ele : bS) {
            this.bS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * 
     * @param bS
     *        A Binary Set data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        setBS(bS);
        return this;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     * 
     * @return A Map of attribute values.
     */

    public java.util.Map<String, AttributeValue> getM() {
        return m;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     * 
     * @param m
     *        A Map of attribute values.
     */

    public void setM(java.util.Map<String, AttributeValue> m) {
        this.m = m;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     * 
     * @param m
     *        A Map of attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withM(java.util.Map<String, AttributeValue> m) {
        setM(m);
        return this;
    }

    public AttributeValue addMEntry(String key, AttributeValue value) {
        if (null == this.m) {
            this.m = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.m.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.m.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into M.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue clearMEntries() {
        this.m = null;
        return this;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * 
     * @return A List of attribute values.
     */

    public java.util.List<AttributeValue> getL() {
        return l;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * 
     * @param l
     *        A List of attribute values.
     */

    public void setL(java.util.Collection<AttributeValue> l) {
        if (l == null) {
            this.l = null;
            return;
        }

        this.l = new java.util.ArrayList<AttributeValue>(l);
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL(java.util.Collection)} or {@link #withL(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param l
     *        A List of attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withL(AttributeValue... l) {
        if (this.l == null) {
            setL(new java.util.ArrayList<AttributeValue>(l.length));
        }
        for (AttributeValue ele : l) {
            this.l.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * 
     * @param l
     *        A List of attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withL(java.util.Collection<AttributeValue> l) {
        setL(l);
        return this;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     * 
     * @param nULLValue
     *        A Null data type.
     */

    public void setNULL(Boolean nULLValue) {
        this.nULLValue = nULLValue;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     * 
     * @return A Null data type.
     */

    public Boolean getNULL() {
        return this.nULLValue;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     * 
     * @param nULLValue
     *        A Null data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNULL(Boolean nULLValue) {
        setNULL(nULLValue);
        return this;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     * 
     * @return A Null data type.
     */

    public Boolean isNULL() {
        return this.nULLValue;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     * 
     * @param bOOL
     *        A Boolean data type.
     */

    public void setBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     * 
     * @return A Boolean data type.
     */

    public Boolean getBOOL() {
        return this.bOOL;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     * 
     * @param bOOL
     *        A Boolean data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBOOL(Boolean bOOL) {
        setBOOL(bOOL);
        return this;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     * 
     * @return A Boolean data type.
     */

    public Boolean isBOOL() {
        return this.bOOL;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("S: " + getS() + ",");
        if (getN() != null)
            sb.append("N: " + getN() + ",");
        if (getB() != null)
            sb.append("B: " + getB() + ",");
        if (getSS() != null)
            sb.append("SS: " + getSS() + ",");
        if (getNS() != null)
            sb.append("NS: " + getNS() + ",");
        if (getBS() != null)
            sb.append("BS: " + getBS() + ",");
        if (getM() != null)
            sb.append("M: " + getM() + ",");
        if (getL() != null)
            sb.append("L: " + getL() + ",");
        if (getNULL() != null)
            sb.append("NULL: " + getNULL() + ",");
        if (getBOOL() != null)
            sb.append("BOOL: " + getBOOL());
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
        if (other.getB() == null ^ this.getB() == null)
            return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false)
            return false;
        if (other.getSS() == null ^ this.getSS() == null)
            return false;
        if (other.getSS() != null && other.getSS().equals(this.getSS()) == false)
            return false;
        if (other.getNS() == null ^ this.getNS() == null)
            return false;
        if (other.getNS() != null && other.getNS().equals(this.getNS()) == false)
            return false;
        if (other.getBS() == null ^ this.getBS() == null)
            return false;
        if (other.getBS() != null && other.getBS().equals(this.getBS()) == false)
            return false;
        if (other.getM() == null ^ this.getM() == null)
            return false;
        if (other.getM() != null && other.getM().equals(this.getM()) == false)
            return false;
        if (other.getL() == null ^ this.getL() == null)
            return false;
        if (other.getL() != null && other.getL().equals(this.getL()) == false)
            return false;
        if (other.getNULL() == null ^ this.getNULL() == null)
            return false;
        if (other.getNULL() != null && other.getNULL().equals(this.getNULL()) == false)
            return false;
        if (other.getBOOL() == null ^ this.getBOOL() == null)
            return false;
        if (other.getBOOL() != null && other.getBOOL().equals(this.getBOOL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS() == null) ? 0 : getS().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getB() == null) ? 0 : getB().hashCode());
        hashCode = prime * hashCode + ((getSS() == null) ? 0 : getSS().hashCode());
        hashCode = prime * hashCode + ((getNS() == null) ? 0 : getNS().hashCode());
        hashCode = prime * hashCode + ((getBS() == null) ? 0 : getBS().hashCode());
        hashCode = prime * hashCode + ((getM() == null) ? 0 : getM().hashCode());
        hashCode = prime * hashCode + ((getL() == null) ? 0 : getL().hashCode());
        hashCode = prime * hashCode + ((getNULL() == null) ? 0 : getNULL().hashCode());
        hashCode = prime * hashCode + ((getBOOL() == null) ? 0 : getBOOL().hashCode());
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
}
