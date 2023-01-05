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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string.
     * </p>
     */
    private String s;
    /**
     * <p>
     * A number.
     * </p>
     */
    private String n;
    /**
     * <p>
     * A binary value.
     * </p>
     */
    private String b;
    /**
     * <p>
     * A list of strings.
     * </p>
     */
    private java.util.List<String> sS;
    /**
     * <p>
     * A list of numbers.
     * </p>
     */
    private java.util.List<String> nS;
    /**
     * <p>
     * A list of binary values.
     * </p>
     */
    private java.util.List<String> bS;

    /**
     * <p>
     * A string.
     * </p>
     * 
     * @param s
     *        A string.
     */

    public void setS(String s) {
        this.s = s;
    }

    /**
     * <p>
     * A string.
     * </p>
     * 
     * @return A string.
     */

    public String getS() {
        return this.s;
    }

    /**
     * <p>
     * A string.
     * </p>
     * 
     * @param s
     *        A string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withS(String s) {
        setS(s);
        return this;
    }

    /**
     * <p>
     * A number.
     * </p>
     * 
     * @param n
     *        A number.
     */

    public void setN(String n) {
        this.n = n;
    }

    /**
     * <p>
     * A number.
     * </p>
     * 
     * @return A number.
     */

    public String getN() {
        return this.n;
    }

    /**
     * <p>
     * A number.
     * </p>
     * 
     * @param n
     *        A number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withN(String n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * A binary value.
     * </p>
     * 
     * @param b
     *        A binary value.
     */

    public void setB(String b) {
        this.b = b;
    }

    /**
     * <p>
     * A binary value.
     * </p>
     * 
     * @return A binary value.
     */

    public String getB() {
        return this.b;
    }

    /**
     * <p>
     * A binary value.
     * </p>
     * 
     * @param b
     *        A binary value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withB(String b) {
        setB(b);
        return this;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * 
     * @return A list of strings.
     */

    public java.util.List<String> getSS() {
        return sS;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * 
     * @param sS
     *        A list of strings.
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
     * A list of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSS(java.util.Collection)} or {@link #withSS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sS
     *        A list of strings.
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
     * A list of strings.
     * </p>
     * 
     * @param sS
     *        A list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSS(java.util.Collection<String> sS) {
        setSS(sS);
        return this;
    }

    /**
     * <p>
     * A list of numbers.
     * </p>
     * 
     * @return A list of numbers.
     */

    public java.util.List<String> getNS() {
        return nS;
    }

    /**
     * <p>
     * A list of numbers.
     * </p>
     * 
     * @param nS
     *        A list of numbers.
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
     * A list of numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNS(java.util.Collection)} or {@link #withNS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nS
     *        A list of numbers.
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
     * A list of numbers.
     * </p>
     * 
     * @param nS
     *        A list of numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNS(java.util.Collection<String> nS) {
        setNS(nS);
        return this;
    }

    /**
     * <p>
     * A list of binary values.
     * </p>
     * 
     * @return A list of binary values.
     */

    public java.util.List<String> getBS() {
        return bS;
    }

    /**
     * <p>
     * A list of binary values.
     * </p>
     * 
     * @param bS
     *        A list of binary values.
     */

    public void setBS(java.util.Collection<String> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }

        this.bS = new java.util.ArrayList<String>(bS);
    }

    /**
     * <p>
     * A list of binary values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBS(java.util.Collection)} or {@link #withBS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param bS
     *        A list of binary values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(String... bS) {
        if (this.bS == null) {
            setBS(new java.util.ArrayList<String>(bS.length));
        }
        for (String ele : bS) {
            this.bS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of binary values.
     * </p>
     * 
     * @param bS
     *        A list of binary values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(java.util.Collection<String> bS) {
        setBS(bS);
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
        if (getB() != null)
            sb.append("B: ").append(getB()).append(",");
        if (getSS() != null)
            sb.append("SS: ").append(getSS()).append(",");
        if (getNS() != null)
            sb.append("NS: ").append(getNS()).append(",");
        if (getBS() != null)
            sb.append("BS: ").append(getBS());
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
        com.amazonaws.services.lookoutmetrics.model.transform.AttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
