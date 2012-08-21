/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * <p>
 * AttributeValue can be <code>String</code> ,
 * <code>Number</code> ,
 * <code>Binary</code> ,
 * <code>StringSet</code> ,
 * <code>NumberSet</code> ,
 * <code>BinarySet</code> .
 * </p>
 */
public class AttributeValue {

    /**
     * Strings are Unicode with UTF-8 binary encoding. The maximum size is
     * limited by the size of the primary key (1024 bytes as a range part of
     * a key or 2048 bytes as a single part hash key) or the item size (64k).
     */
    private String s;

    /**
     * Numbers are positive or negative exact-value decimals and integers. A
     * number can have up to 38 digits precision and can be between 10^-128
     * to 10^+126.
     */
    private String n;

    /**
     * Binary attributes are sequences of unsigned bytes.
     */
    private java.nio.ByteBuffer b;

    /**
     * A set of strings.
     */
    private java.util.List<String> sS;

    /**
     * A set of numbers.
     */
    private java.util.List<String> nS;

    /**
     * A set of binary attributes.
     */
    private java.util.List<java.nio.ByteBuffer> bS;

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
     * @param s Strings are Unicode with UTF-8 binary encoding. The maximum
     * size is limited by the size of the primary key (1024 bytes as a range
     * part of a key or 2048 bytes as a single part hash key) or the item
     * size (64k).
     */
    public AttributeValue(String s) {
        this.s = s;
    }

    
    
    /**
     * Constructs a new AttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sS A set of strings.
     */
    public AttributeValue(java.util.List<String> sS) {
        this.sS = sS;
    }

    
    
    /**
     * Strings are Unicode with UTF-8 binary encoding. The maximum size is
     * limited by the size of the primary key (1024 bytes as a range part of
     * a key or 2048 bytes as a single part hash key) or the item size (64k).
     *
     * @return Strings are Unicode with UTF-8 binary encoding. The maximum size is
     *         limited by the size of the primary key (1024 bytes as a range part of
     *         a key or 2048 bytes as a single part hash key) or the item size (64k).
     */
    public String getS() {
        return s;
    }
    
    /**
     * Strings are Unicode with UTF-8 binary encoding. The maximum size is
     * limited by the size of the primary key (1024 bytes as a range part of
     * a key or 2048 bytes as a single part hash key) or the item size (64k).
     *
     * @param s Strings are Unicode with UTF-8 binary encoding. The maximum size is
     *         limited by the size of the primary key (1024 bytes as a range part of
     *         a key or 2048 bytes as a single part hash key) or the item size (64k).
     */
    public void setS(String s) {
        this.s = s;
    }
    
    /**
     * Strings are Unicode with UTF-8 binary encoding. The maximum size is
     * limited by the size of the primary key (1024 bytes as a range part of
     * a key or 2048 bytes as a single part hash key) or the item size (64k).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s Strings are Unicode with UTF-8 binary encoding. The maximum size is
     *         limited by the size of the primary key (1024 bytes as a range part of
     *         a key or 2048 bytes as a single part hash key) or the item size (64k).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withS(String s) {
        this.s = s;
        return this;
    }
    
    
    /**
     * Numbers are positive or negative exact-value decimals and integers. A
     * number can have up to 38 digits precision and can be between 10^-128
     * to 10^+126.
     *
     * @return Numbers are positive or negative exact-value decimals and integers. A
     *         number can have up to 38 digits precision and can be between 10^-128
     *         to 10^+126.
     */
    public String getN() {
        return n;
    }
    
    /**
     * Numbers are positive or negative exact-value decimals and integers. A
     * number can have up to 38 digits precision and can be between 10^-128
     * to 10^+126.
     *
     * @param n Numbers are positive or negative exact-value decimals and integers. A
     *         number can have up to 38 digits precision and can be between 10^-128
     *         to 10^+126.
     */
    public void setN(String n) {
        this.n = n;
    }
    
    /**
     * Numbers are positive or negative exact-value decimals and integers. A
     * number can have up to 38 digits precision and can be between 10^-128
     * to 10^+126.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param n Numbers are positive or negative exact-value decimals and integers. A
     *         number can have up to 38 digits precision and can be between 10^-128
     *         to 10^+126.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withN(String n) {
        this.n = n;
        return this;
    }
    
    
    /**
     * Binary attributes are sequences of unsigned bytes.
     *
     * @return Binary attributes are sequences of unsigned bytes.
     */
    public java.nio.ByteBuffer getB() {
        return b;
    }
    
    /**
     * Binary attributes are sequences of unsigned bytes.
     *
     * @param b Binary attributes are sequences of unsigned bytes.
     */
    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }
    
    /**
     * Binary attributes are sequences of unsigned bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param b Binary attributes are sequences of unsigned bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withB(java.nio.ByteBuffer b) {
        this.b = b;
        return this;
    }
    
    
    /**
     * A set of strings.
     *
     * @return A set of strings.
     */
    public java.util.List<String> getSS() {
        
        return sS;
    }
    
    /**
     * A set of strings.
     *
     * @param sS A set of strings.
     */
    public void setSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
            return;
        }

        java.util.List<String> sSCopy = new java.util.ArrayList<String>(sS.size());
        sSCopy.addAll(sS);
        this.sS = sSCopy;
    }
    
    /**
     * A set of strings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS A set of strings.
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
     * A set of strings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS A set of strings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
        } else {
            java.util.List<String> sSCopy = new java.util.ArrayList<String>(sS.size());
            sSCopy.addAll(sS);
            this.sS = sSCopy;
        }

        return this;
    }
    
    /**
     * A set of numbers.
     *
     * @return A set of numbers.
     */
    public java.util.List<String> getNS() {
        
        return nS;
    }
    
    /**
     * A set of numbers.
     *
     * @param nS A set of numbers.
     */
    public void setNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
            return;
        }

        java.util.List<String> nSCopy = new java.util.ArrayList<String>(nS.size());
        nSCopy.addAll(nS);
        this.nS = nSCopy;
    }
    
    /**
     * A set of numbers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS A set of numbers.
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
     * A set of numbers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS A set of numbers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
        } else {
            java.util.List<String> nSCopy = new java.util.ArrayList<String>(nS.size());
            nSCopy.addAll(nS);
            this.nS = nSCopy;
        }

        return this;
    }
    
    /**
     * A set of binary attributes.
     *
     * @return A set of binary attributes.
     */
    public java.util.List<java.nio.ByteBuffer> getBS() {
        
        return bS;
    }
    
    /**
     * A set of binary attributes.
     *
     * @param bS A set of binary attributes.
     */
    public void setBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }

        java.util.List<java.nio.ByteBuffer> bSCopy = new java.util.ArrayList<java.nio.ByteBuffer>(bS.size());
        bSCopy.addAll(bS);
        this.bS = bSCopy;
    }
    
    /**
     * A set of binary attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS A set of binary attributes.
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
     * A set of binary attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS A set of binary attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValue withBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
        } else {
            java.util.List<java.nio.ByteBuffer> bSCopy = new java.util.ArrayList<java.nio.ByteBuffer>(bS.size());
            bSCopy.addAll(bS);
            this.bS = bSCopy;
        }

        return this;
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
        if (s != null) sb.append("S: " + s + ", ");
        if (n != null) sb.append("N: " + n + ", ");
        if (b != null) sb.append("B: " + b + ", ");
        if (sS != null) sb.append("SS: " + sS + ", ");
        if (nS != null) sb.append("NS: " + nS + ", ");
        if (bS != null) sb.append("BS: " + bS + ", ");
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
        return true;
    }
    
}
    