/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the data for an attribute. You can set one, and only one,
 * of the elements.
 * </p>
 * <p>
 * Each attribute in an item is a name-value pair. An attribute can be
 * single-valued or multi-valued set. For example, a book item can have
 * title and authors attributes. Each book has one title but can have
 * many authors. The multi-valued attribute is a set; duplicate values
 * are not allowed.
 * </p>
 */
public class AttributeValue implements Serializable {

    /**
     * A String data type.
     */
    private String s;

    /**
     * A Number data type.
     */
    private String n;

    /**
     * A Binary data type.
     */
    private java.nio.ByteBuffer b;

    /**
     * A String Set data type.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> sS;

    /**
     * A Number Set data type.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> nS;

    /**
     * A Binary Set data type.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bS;

    /**
     * A Map of attribute values.
     */
    private java.util.Map<String,AttributeValue> m;

    /**
     * A List of attribute values.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> l;

    /**
     * A Null data type.
     */
    private Boolean nULL;

    /**
     * A Boolean data type.
     */
    private Boolean bOOL;

    /**
     * Default constructor for a new AttributeValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttributeValue() {}
    
    /**
     * Constructs a new AttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param s A String data type.
     */
    public AttributeValue(String s) {
        setS(s);
    }

    /**
     * Constructs a new AttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sS A String Set data type.
     */
    public AttributeValue(java.util.List<String> sS) {
        setSS(sS);
    }

    /**
     * A String data type.
     *
     * @return A String data type.
     */
    public String getS() {
        return s;
    }
    
    /**
     * A String data type.
     *
     * @param s A String data type.
     */
    public void setS(String s) {
        this.s = s;
    }
    
    /**
     * A String data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s A String data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withS(String s) {
        this.s = s;
        return this;
    }

    /**
     * A Number data type.
     *
     * @return A Number data type.
     */
    public String getN() {
        return n;
    }
    
    /**
     * A Number data type.
     *
     * @param n A Number data type.
     */
    public void setN(String n) {
        this.n = n;
    }
    
    /**
     * A Number data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param n A Number data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withN(String n) {
        this.n = n;
        return this;
    }

    /**
     * A Binary data type.
     *
     * @return A Binary data type.
     */
    public java.nio.ByteBuffer getB() {
        return b;
    }
    
    /**
     * A Binary data type.
     *
     * @param b A Binary data type.
     */
    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }
    
    /**
     * A Binary data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param b A Binary data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withB(java.nio.ByteBuffer b) {
        this.b = b;
        return this;
    }

    /**
     * A String Set data type.
     *
     * @return A String Set data type.
     */
    public java.util.List<String> getSS() {
        return sS;
    }
    
    /**
     * A String Set data type.
     *
     * @param sS A String Set data type.
     */
    public void setSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> sSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sS.size());
        sSCopy.addAll(sS);
        this.sS = sSCopy;
    }
    
    /**
     * A String Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS A String Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withSS(String... sS) {
        if (getSS() == null) setSS(new java.util.ArrayList<String>(sS.length));
        for (String value : sS) {
            getSS().add(value);
        }
        return this;
    }
    
    /**
     * A String Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS A String Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> sSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sS.size());
            sSCopy.addAll(sS);
            this.sS = sSCopy;
        }

        return this;
    }

    /**
     * A Number Set data type.
     *
     * @return A Number Set data type.
     */
    public java.util.List<String> getNS() {
        return nS;
    }
    
    /**
     * A Number Set data type.
     *
     * @param nS A Number Set data type.
     */
    public void setNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> nSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nS.size());
        nSCopy.addAll(nS);
        this.nS = nSCopy;
    }
    
    /**
     * A Number Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS A Number Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withNS(String... nS) {
        if (getNS() == null) setNS(new java.util.ArrayList<String>(nS.length));
        for (String value : nS) {
            getNS().add(value);
        }
        return this;
    }
    
    /**
     * A Number Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS A Number Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> nSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nS.size());
            nSCopy.addAll(nS);
            this.nS = nSCopy;
        }

        return this;
    }

    /**
     * A Binary Set data type.
     *
     * @return A Binary Set data type.
     */
    public java.util.List<java.nio.ByteBuffer> getBS() {
        return bS;
    }
    
    /**
     * A Binary Set data type.
     *
     * @param bS A Binary Set data type.
     */
    public void setBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer>(bS.size());
        bSCopy.addAll(bS);
        this.bS = bSCopy;
    }
    
    /**
     * A Binary Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS A Binary Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withBS(java.nio.ByteBuffer... bS) {
        if (getBS() == null) setBS(new java.util.ArrayList<java.nio.ByteBuffer>(bS.length));
        for (java.nio.ByteBuffer value : bS) {
            getBS().add(value);
        }
        return this;
    }
    
    /**
     * A Binary Set data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS A Binary Set data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bSCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer>(bS.size());
            bSCopy.addAll(bS);
            this.bS = bSCopy;
        }

        return this;
    }

    /**
     * A Map of attribute values.
     *
     * @return A Map of attribute values.
     */
    public java.util.Map<String,AttributeValue> getM() {
        
        return m;
    }
    
    /**
     * A Map of attribute values.
     *
     * @param m A Map of attribute values.
     */
    public void setM(java.util.Map<String,AttributeValue> m) {
        this.m = m;
    }
    
    /**
     * A Map of attribute values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param m A Map of attribute values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withM(java.util.Map<String,AttributeValue> m) {
        setM(m);
        return this;
    }

    /**
     * A Map of attribute values.
     * <p>
     * The method adds a new key-value pair into M parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into M.
     * @param value The corresponding value of the entry to be added into M.
     */
    public AttributeValue addMEntry(String key, AttributeValue value) {
        if (null == this.m) {
            this.m = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.m.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.m.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into M.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public AttributeValue clearMEntries() {
        this.m = null;
        return this;
    }
    
    /**
     * A List of attribute values.
     *
     * @return A List of attribute values.
     */
    public java.util.List<AttributeValue> getL() {
        return l;
    }
    
    /**
     * A List of attribute values.
     *
     * @param l A List of attribute values.
     */
    public void setL(java.util.Collection<AttributeValue> l) {
        if (l == null) {
            this.l = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> lCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(l.size());
        lCopy.addAll(l);
        this.l = lCopy;
    }
    
    /**
     * A List of attribute values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param l A List of attribute values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withL(AttributeValue... l) {
        if (getL() == null) setL(new java.util.ArrayList<AttributeValue>(l.length));
        for (AttributeValue value : l) {
            getL().add(value);
        }
        return this;
    }
    
    /**
     * A List of attribute values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param l A List of attribute values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withL(java.util.Collection<AttributeValue> l) {
        if (l == null) {
            this.l = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> lCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(l.size());
            lCopy.addAll(l);
            this.l = lCopy;
        }

        return this;
    }

    /**
     * A Null data type.
     *
     * @return A Null data type.
     */
    public Boolean isNULL() {
        return nULL;
    }
    
    /**
     * A Null data type.
     *
     * @param nULL A Null data type.
     */
    public void setNULL(Boolean nULL) {
        this.nULL = nULL;
    }
    
    /**
     * A Null data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nULL A Null data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withNULL(Boolean nULL) {
        this.nULL = nULL;
        return this;
    }

    /**
     * A Null data type.
     *
     * @return A Null data type.
     */
    public Boolean getNULL() {
        return nULL;
    }

    /**
     * A Boolean data type.
     *
     * @return A Boolean data type.
     */
    public Boolean isBOOL() {
        return bOOL;
    }
    
    /**
     * A Boolean data type.
     *
     * @param bOOL A Boolean data type.
     */
    public void setBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
    }
    
    /**
     * A Boolean data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bOOL A Boolean data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttributeValue withBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
        return this;
    }

    /**
     * A Boolean data type.
     *
     * @return A Boolean data type.
     */
    public Boolean getBOOL() {
        return bOOL;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS() != null) sb.append("S: " + getS() + ",");
        if (getN() != null) sb.append("N: " + getN() + ",");
        if (getB() != null) sb.append("B: " + getB() + ",");
        if (getSS() != null) sb.append("SS: " + getSS() + ",");
        if (getNS() != null) sb.append("NS: " + getNS() + ",");
        if (getBS() != null) sb.append("BS: " + getBS() + ",");
        if (getM() != null) sb.append("M: " + getM() + ",");
        if (getL() != null) sb.append("L: " + getL() + ",");
        if (isNULL() != null) sb.append("NULL: " + isNULL() + ",");
        if (isBOOL() != null) sb.append("BOOL: " + isBOOL() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isNULL() == null) ? 0 : isNULL().hashCode()); 
        hashCode = prime * hashCode + ((isBOOL() == null) ? 0 : isBOOL().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttributeValue == false) return false;
        AttributeValue other = (AttributeValue)obj;
        
        if (other.getS() == null ^ this.getS() == null) return false;
        if (other.getS() != null && other.getS().equals(this.getS()) == false) return false; 
        if (other.getN() == null ^ this.getN() == null) return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false) return false; 
        if (other.getB() == null ^ this.getB() == null) return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false) return false; 
        if (other.getSS() == null ^ this.getSS() == null) return false;
        if (other.getSS() != null && other.getSS().equals(this.getSS()) == false) return false; 
        if (other.getNS() == null ^ this.getNS() == null) return false;
        if (other.getNS() != null && other.getNS().equals(this.getNS()) == false) return false; 
        if (other.getBS() == null ^ this.getBS() == null) return false;
        if (other.getBS() != null && other.getBS().equals(this.getBS()) == false) return false; 
        if (other.getM() == null ^ this.getM() == null) return false;
        if (other.getM() != null && other.getM().equals(this.getM()) == false) return false; 
        if (other.getL() == null ^ this.getL() == null) return false;
        if (other.getL() != null && other.getL().equals(this.getL()) == false) return false; 
        if (other.isNULL() == null ^ this.isNULL() == null) return false;
        if (other.isNULL() != null && other.isNULL().equals(this.isNULL()) == false) return false; 
        if (other.isBOOL() == null ^ this.isBOOL() == null) return false;
        if (other.isBOOL() != null && other.isBOOL().equals(this.isBOOL()) == false) return false; 
        return true;
    }
    
}
    