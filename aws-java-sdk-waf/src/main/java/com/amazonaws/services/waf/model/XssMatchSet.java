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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains <code>XssMatchTuple</code> objects, which specify the parts of web requests that you
 * want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of
 * the header. If a <code>XssMatchSet</code> contains more than one <code>XssMatchTuple</code> object, a request needs
 * to include cross-site scripting attacks in only one of the specified parts of the request to be considered a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/XssMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XssMatchSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     * <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     * <a>DeleteXssMatchSet</a>).
     * </p>
     * <p>
     * <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     */
    private String xssMatchSetId;
    /**
     * <p>
     * The name, if any, of the <code>XssMatchSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * </p>
     */
    private java.util.List<XssMatchTuple> xssMatchTuples;

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     * <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     * <a>DeleteXssMatchSet</a>).
     * </p>
     * <p>
     * <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @param xssMatchSetId
     *        A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information
     *        about an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     *        <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from
     *        a <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     *        <a>DeleteXssMatchSet</a>).</p>
     *        <p>
     *        <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     */

    public void setXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     * <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     * <a>DeleteXssMatchSet</a>).
     * </p>
     * <p>
     * <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @return A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get
     *         information about an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an
     *         <code>XssMatchSet</code> (see <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a
     *         <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *         <code>XssMatchSet</code> from AWS WAF (see <a>DeleteXssMatchSet</a>).</p>
     *         <p>
     *         <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     */

    public String getXssMatchSetId() {
        return this.xssMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     * <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     * <a>DeleteXssMatchSet</a>).
     * </p>
     * <p>
     * <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @param xssMatchSetId
     *        A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information
     *        about an <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     *        <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from
     *        a <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     *        <a>DeleteXssMatchSet</a>).</p>
     *        <p>
     *        <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSet withXssMatchSetId(String xssMatchSetId) {
        setXssMatchSetId(xssMatchSetId);
        return this;
    }

    /**
     * <p>
     * The name, if any, of the <code>XssMatchSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>XssMatchSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, if any, of the <code>XssMatchSet</code>.
     * </p>
     * 
     * @return The name, if any, of the <code>XssMatchSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name, if any, of the <code>XssMatchSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>XssMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * </p>
     * 
     * @return Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     */

    public java.util.List<XssMatchTuple> getXssMatchTuples() {
        return xssMatchTuples;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * </p>
     * 
     * @param xssMatchTuples
     *        Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     */

    public void setXssMatchTuples(java.util.Collection<XssMatchTuple> xssMatchTuples) {
        if (xssMatchTuples == null) {
            this.xssMatchTuples = null;
            return;
        }

        this.xssMatchTuples = new java.util.ArrayList<XssMatchTuple>(xssMatchTuples);
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setXssMatchTuples(java.util.Collection)} or {@link #withXssMatchTuples(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param xssMatchTuples
     *        Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSet withXssMatchTuples(XssMatchTuple... xssMatchTuples) {
        if (this.xssMatchTuples == null) {
            setXssMatchTuples(new java.util.ArrayList<XssMatchTuple>(xssMatchTuples.length));
        }
        for (XssMatchTuple ele : xssMatchTuples) {
            this.xssMatchTuples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * </p>
     * 
     * @param xssMatchTuples
     *        Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSet withXssMatchTuples(java.util.Collection<XssMatchTuple> xssMatchTuples) {
        setXssMatchTuples(xssMatchTuples);
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
        if (getXssMatchSetId() != null)
            sb.append("XssMatchSetId: ").append(getXssMatchSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getXssMatchTuples() != null)
            sb.append("XssMatchTuples: ").append(getXssMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XssMatchSet == false)
            return false;
        XssMatchSet other = (XssMatchSet) obj;
        if (other.getXssMatchSetId() == null ^ this.getXssMatchSetId() == null)
            return false;
        if (other.getXssMatchSetId() != null && other.getXssMatchSetId().equals(this.getXssMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getXssMatchTuples() == null ^ this.getXssMatchTuples() == null)
            return false;
        if (other.getXssMatchTuples() != null && other.getXssMatchTuples().equals(this.getXssMatchTuples()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXssMatchSetId() == null) ? 0 : getXssMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getXssMatchTuples() == null) ? 0 : getXssMatchTuples().hashCode());
        return hashCode;
    }

    @Override
    public XssMatchSet clone() {
        try {
            return (XssMatchSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.XssMatchSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
