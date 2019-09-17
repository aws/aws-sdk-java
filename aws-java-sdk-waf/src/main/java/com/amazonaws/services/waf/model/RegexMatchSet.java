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
 * In a <a>GetRegexMatchSet</a> request, <code>RegexMatchSet</code> is a complex type that contains the
 * <code>RegexMatchSetId</code> and <code>Name</code> of a <code>RegexMatchSet</code>, and the values that you specified
 * when you updated the <code>RegexMatchSet</code>.
 * </p>
 * <p>
 * The values are contained in a <code>RegexMatchTuple</code> object, which specify the parts of web requests that you
 * want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>RegexMatchSet</code> contains
 * more than one <code>RegexMatchTuple</code> object, a request needs to match the settings in only one
 * <code>ByteMatchTuple</code> to be considered a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RegexMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexMatchSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a <code>RegexMatchSet</code>
     * (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>RegexMatchSet</code> from AWS WAF (see
     * <a>DeleteRegexMatchSet</a>).
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
     * Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<RegexMatchTuple> regexMatchTuples;

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a <code>RegexMatchSet</code>
     * (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>RegexMatchSet</code> from AWS WAF (see
     * <a>DeleteRegexMatchSet</a>).
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to
     *        get information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a
     *        <code>RegexMatchSet</code> (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a
     *        <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *        <code>RegexMatchSet</code> from AWS WAF (see <a>DeleteRegexMatchSet</a>).</p>
     *        <p>
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a <code>RegexMatchSet</code>
     * (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>RegexMatchSet</code> from AWS WAF (see
     * <a>DeleteRegexMatchSet</a>).
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @return The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code>
     *         to get information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a
     *         <code>RegexMatchSet</code> (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a
     *         <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *         <code>RegexMatchSet</code> from AWS WAF (see <a>DeleteRegexMatchSet</a>).</p>
     *         <p>
     *         <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public String getRegexMatchSetId() {
        return this.regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to get
     * information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a <code>RegexMatchSet</code>
     * (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>RegexMatchSet</code> from AWS WAF (see
     * <a>DeleteRegexMatchSet</a>).
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You use <code>RegexMatchSetId</code> to
     *        get information about a <code>RegexMatchSet</code> (see <a>GetRegexMatchSet</a>), update a
     *        <code>RegexMatchSet</code> (see <a>UpdateRegexMatchSet</a>), insert a <code>RegexMatchSet</code> into a
     *        <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *        <code>RegexMatchSet</code> from AWS WAF (see <a>DeleteRegexMatchSet</a>).</p>
     *        <p>
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSet withRegexMatchSetId(String regexMatchSetId) {
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

    public RegexMatchSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     *         <code>User-Agent</code> header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more
     *         information, see <a>RegexPatternSet</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting
     *         it for the specified string.
     *         </p>
     *         </li>
     */

    public java.util.List<RegexMatchTuple> getRegexMatchTuples() {
        return regexMatchTuples;
    }

    /**
     * <p>
     * Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * 
     * @param regexMatchTuples
     *        Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     *        <code>User-Agent</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more
     *        information, see <a>RegexPatternSet</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting
     *        it for the specified string.
     *        </p>
     *        </li>
     */

    public void setRegexMatchTuples(java.util.Collection<RegexMatchTuple> regexMatchTuples) {
        if (regexMatchTuples == null) {
            this.regexMatchTuples = null;
            return;
        }

        this.regexMatchTuples = new java.util.ArrayList<RegexMatchTuple>(regexMatchTuples);
    }

    /**
     * <p>
     * Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegexMatchTuples(java.util.Collection)} or {@link #withRegexMatchTuples(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param regexMatchTuples
     *        Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     *        <code>User-Agent</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more
     *        information, see <a>RegexPatternSet</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting
     *        it for the specified string.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSet withRegexMatchTuples(RegexMatchTuple... regexMatchTuples) {
        if (this.regexMatchTuples == null) {
            setRegexMatchTuples(new java.util.ArrayList<RegexMatchTuple>(regexMatchTuples.length));
        }
        for (RegexMatchTuple ele : regexMatchTuples) {
            this.regexMatchTuples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * 
     * @param regexMatchTuples
     *        Contains an array of <a>RegexMatchTuple</a> objects. Each <code>RegexMatchTuple</code> object contains:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     *        <code>User-Agent</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more
     *        information, see <a>RegexPatternSet</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting
     *        it for the specified string.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSet withRegexMatchTuples(java.util.Collection<RegexMatchTuple> regexMatchTuples) {
        setRegexMatchTuples(regexMatchTuples);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getRegexMatchTuples() != null)
            sb.append("RegexMatchTuples: ").append(getRegexMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexMatchSet == false)
            return false;
        RegexMatchSet other = (RegexMatchSet) obj;
        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegexMatchTuples() == null ^ this.getRegexMatchTuples() == null)
            return false;
        if (other.getRegexMatchTuples() != null && other.getRegexMatchTuples().equals(this.getRegexMatchTuples()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegexMatchTuples() == null) ? 0 : getRegexMatchTuples().hashCode());
        return hashCode;
    }

    @Override
    public RegexMatchSet clone() {
        try {
            return (RegexMatchSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RegexMatchSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
