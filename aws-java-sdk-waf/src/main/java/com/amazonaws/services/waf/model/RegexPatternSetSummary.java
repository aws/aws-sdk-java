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
 * Returned by <a>ListRegexPatternSets</a>. Each <code>RegexPatternSetSummary</code> object includes the
 * <code>Name</code> and <code>RegexPatternSetId</code> for one <a>RegexPatternSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RegexPatternSetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexPatternSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use <code>RegexPatternSetId</code> to
     * get information about a <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>, remove a
     * <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and delete a <code>RegexPatternSet</code> from
     * AWS WAF.
     * </p>
     * <p>
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     */
    private String regexPatternSetId;
    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you create
     * a <code>RegexPatternSet</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use <code>RegexPatternSetId</code> to
     * get information about a <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>, remove a
     * <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and delete a <code>RegexPatternSet</code> from
     * AWS WAF.
     * </p>
     * <p>
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use
     *        <code>RegexPatternSetId</code> to get information about a <code>RegexPatternSet</code>, update a
     *        <code>RegexPatternSet</code>, remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and
     *        delete a <code>RegexPatternSet</code> from AWS WAF.</p>
     *        <p>
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     */

    public void setRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use <code>RegexPatternSetId</code> to
     * get information about a <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>, remove a
     * <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and delete a <code>RegexPatternSet</code> from
     * AWS WAF.
     * </p>
     * <p>
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @return The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use
     *         <code>RegexPatternSetId</code> to get information about a <code>RegexPatternSet</code>, update a
     *         <code>RegexPatternSet</code>, remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     *         and delete a <code>RegexPatternSet</code> from AWS WAF.</p>
     *         <p>
     *         <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *         <a>ListRegexPatternSets</a>.
     */

    public String getRegexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use <code>RegexPatternSetId</code> to
     * get information about a <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>, remove a
     * <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and delete a <code>RegexPatternSet</code> from
     * AWS WAF.
     * </p>
     * <p>
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> for a <code>RegexPatternSet</code>. You use
     *        <code>RegexPatternSetId</code> to get information about a <code>RegexPatternSet</code>, update a
     *        <code>RegexPatternSet</code>, remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>, and
     *        delete a <code>RegexPatternSet</code> from AWS WAF.</p>
     *        <p>
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSetSummary withRegexPatternSetId(String regexPatternSetId) {
        setRegexPatternSetId(regexPatternSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you create
     * a <code>RegexPatternSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you
     *        create a <code>RegexPatternSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you create
     * a <code>RegexPatternSet</code>.
     * </p>
     * 
     * @return A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after
     *         you create a <code>RegexPatternSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you create
     * a <code>RegexPatternSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RegexPatternSet</a>. You can't change <code>Name</code> after you
     *        create a <code>RegexPatternSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSetSummary withName(String name) {
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
        if (getRegexPatternSetId() != null)
            sb.append("RegexPatternSetId: ").append(getRegexPatternSetId()).append(",");
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

        if (obj instanceof RegexPatternSetSummary == false)
            return false;
        RegexPatternSetSummary other = (RegexPatternSetSummary) obj;
        if (other.getRegexPatternSetId() == null ^ this.getRegexPatternSetId() == null)
            return false;
        if (other.getRegexPatternSetId() != null && other.getRegexPatternSetId().equals(this.getRegexPatternSetId()) == false)
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

        hashCode = prime * hashCode + ((getRegexPatternSetId() == null) ? 0 : getRegexPatternSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public RegexPatternSetSummary clone() {
        try {
            return (RegexPatternSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RegexPatternSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
