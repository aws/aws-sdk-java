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
 * The <code>Id</code> and <code>Name</code> of an <code>XssMatchSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/XssMatchSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XssMatchSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
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
     * The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get information about
     * a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
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
     *        about a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
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
     * a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     * <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     * <a>DeleteXssMatchSet</a>).
     * </p>
     * <p>
     * <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @return A unique identifier for an <code>XssMatchSet</code>. You use <code>XssMatchSetId</code> to get
     *         information about a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an
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
     * a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
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
     *        about a <code>XssMatchSet</code> (see <a>GetXssMatchSet</a>), update an <code>XssMatchSet</code> (see
     *        <a>UpdateXssMatchSet</a>), insert an <code>XssMatchSet</code> into a <code>Rule</code> or delete one from
     *        a <code>Rule</code> (see <a>UpdateRule</a>), and delete an <code>XssMatchSet</code> from AWS WAF (see
     *        <a>DeleteXssMatchSet</a>).</p>
     *        <p>
     *        <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSetSummary withXssMatchSetId(String xssMatchSetId) {
        setXssMatchSetId(xssMatchSetId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     * </p>
     * 
     * @return The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>XssMatchSet</code>, if any, specified by <code>Id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchSetSummary withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XssMatchSetSummary == false)
            return false;
        XssMatchSetSummary other = (XssMatchSetSummary) obj;
        if (other.getXssMatchSetId() == null ^ this.getXssMatchSetId() == null)
            return false;
        if (other.getXssMatchSetId() != null && other.getXssMatchSetId().equals(this.getXssMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXssMatchSetId() == null) ? 0 : getXssMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public XssMatchSetSummary clone() {
        try {
            return (XssMatchSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.XssMatchSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
