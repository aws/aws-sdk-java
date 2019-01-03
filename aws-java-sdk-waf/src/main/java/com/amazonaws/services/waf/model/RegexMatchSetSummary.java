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
 * Returned by <a>ListRegexMatchSets</a>. Each <code>RegexMatchSetSummary</code> object includes the <code>Name</code>
 * and <code>RegexMatchSetId</code> for one <a>RegexMatchSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RegexMatchSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexMatchSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     */
    private String regexMatchSetId;
    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>RegexMatchSet</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to
     *        get information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     *        <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS
     *        WAF.</p>
     *        <p>
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @return The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code>
     *         to get information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     *         <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS
     *         WAF.</p>
     *         <p>
     *         <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public String getRegexMatchSetId() {
        return this.regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to
     *        get information about a <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     *        <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a <code>RegexMatchSet</code> from AWS
     *        WAF.</p>
     *        <p>
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSetSummary withRegexMatchSetId(String regexMatchSetId) {
        setRegexMatchSetId(regexMatchSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>RegexMatchSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you
     *        create a <code>RegexMatchSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>RegexMatchSet</code>.
     * </p>
     * 
     * @return A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you
     *         create a <code>RegexMatchSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>RegexMatchSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RegexMatchSet</a>. You can't change <code>Name</code> after you
     *        create a <code>RegexMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSetSummary withName(String name) {
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
        if (getRegexMatchSetId() != null)
            sb.append("RegexMatchSetId: ").append(getRegexMatchSetId()).append(",");
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

        if (obj instanceof RegexMatchSetSummary == false)
            return false;
        RegexMatchSetSummary other = (RegexMatchSetSummary) obj;
        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
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

        hashCode = prime * hashCode + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public RegexMatchSetSummary clone() {
        try {
            return (RegexMatchSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RegexMatchSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
