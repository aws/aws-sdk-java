/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the data for an attribute. You can set one, and only one, of the elements.
 * </p>
 */
public class AttributeValue implements Serializable {

    /**
     * Represents a String data type
     */
    private String s;

    /**
     * Represents a Number data type
     */
    private String n;

    /**
     * Represents a Binary data type
     */
    private java.nio.ByteBuffer b;

    /**
     * Represents a String set data type
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> sS;

    /**
     * Represents a Number set data type
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> nS;

    /**
     * Represents a Binary set data type
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bS;

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
     * @param s Represents a String data type
     */
    public AttributeValue(String s) {
        setS(s);
    }

    /**
     * Constructs a new AttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sS Represents a String set data type
     */
    public AttributeValue(java.util.List<String> sS) {
        setSS(sS);
    }

    /**
     * Represents a String data type
     *
     * @return Represents a String data type
     */
    public String getS() {
        return s;
    }
    
    /**
     * Represents a String data type
     *
     * @param s Represents a String data type
     */
    public void setS(String s) {
        this.s = s;
    }
    
    /**
     * Represents a String data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s Represents a String data type
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttributeValue withS(String s) {
        this.s = s;
        return this;
    }

    /**
     * Represents a Number data type
     *
     * @return Represents a Number data type
     */
    public String getN() {
        return n;
    }
    
    /**
     * Represents a Number data type
     *
     * @param n Represents a Number data type
     */
    public void setN(String n) {
        this.n = n;
    }
    
    /**
     * Represents a Number data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param n Represents a Number data type
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttributeValue withN(String n) {
        this.n = n;
        return this;
    }

    /**
     * Represents a Binary data type
     *
     * @return Represents a Binary data type
     */
    public java.nio.ByteBuffer getB() {
        return b;
    }
    
    /**
     * Represents a Binary data type
     *
     * @param b Represents a Binary data type
     */
    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }
    
    /**
     * Represents a Binary data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param b Represents a Binary data type
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttributeValue withB(java.nio.ByteBuffer b) {
        this.b = b;
        return this;
    }

    /**
     * Represents a String set data type
     *
     * @return Represents a String set data type
     */
    public java.util.List<String> getSS() {
        return sS;
    }
    
    /**
     * Represents a String set data type
     *
     * @param sS Represents a String set data type
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
     * Represents a String set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS Represents a String set data type
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
     * Represents a String set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sS Represents a String set data type
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
     * Represents a Number set data type
     *
     * @return Represents a Number set data type
     */
    public java.util.List<String> getNS() {
        return nS;
    }
    
    /**
     * Represents a Number set data type
     *
     * @param nS Represents a Number set data type
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
     * Represents a Number set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS Represents a Number set data type
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
     * Represents a Number set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nS Represents a Number set data type
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
     * Represents a Binary set data type
     *
     * @return Represents a Binary set data type
     */
    public java.util.List<java.nio.ByteBuffer> getBS() {
        return bS;
    }
    
    /**
     * Represents a Binary set data type
     *
     * @param bS Represents a Binary set data type
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
     * Represents a Binary set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS Represents a Binary set data type
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
     * Represents a Binary set data type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bS Represents a Binary set data type
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
        if (getBS() != null) sb.append("BS: " + getBS() );
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
    