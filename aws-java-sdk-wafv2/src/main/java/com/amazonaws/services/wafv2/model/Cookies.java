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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Inspect the cookies in the web request. You can specify the parts of the cookies to inspect and you can narrow the
 * set of cookies to inspect by including or excluding specific keys.
 * </p>
 * <p>
 * This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification.
 * </p>
 * <p>
 * Example JSON:
 * <code>"Cookies": { "MatchPattern": { "All": {} }, "MatchScope": "KEY", "OversizeHandling": "MATCH" }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Cookies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cookies implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter to use to identify the subset of cookies to inspect in a web request.
     * </p>
     * <p>
     * You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     * <code>ExcludedCookies</code>.
     * </p>
     * <p>
     * Example JSON:
     * <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     * </p>
     */
    private CookieMatchPattern matchPattern;
    /**
     * <p>
     * The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>, WAF
     * inspects both keys and values.
     * </p>
     */
    private String matchScope;
    /**
     * <p>
     * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting
     * the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying
     * host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     */
    private String oversizeHandling;

    /**
     * <p>
     * The filter to use to identify the subset of cookies to inspect in a web request.
     * </p>
     * <p>
     * You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     * <code>ExcludedCookies</code>.
     * </p>
     * <p>
     * Example JSON:
     * <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     * </p>
     * 
     * @param matchPattern
     *        The filter to use to identify the subset of cookies to inspect in a web request. </p>
     *        <p>
     *        You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     *        <code>ExcludedCookies</code>.
     *        </p>
     *        <p>
     *        Example JSON:
     *        <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     */

    public void setMatchPattern(CookieMatchPattern matchPattern) {
        this.matchPattern = matchPattern;
    }

    /**
     * <p>
     * The filter to use to identify the subset of cookies to inspect in a web request.
     * </p>
     * <p>
     * You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     * <code>ExcludedCookies</code>.
     * </p>
     * <p>
     * Example JSON:
     * <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     * </p>
     * 
     * @return The filter to use to identify the subset of cookies to inspect in a web request. </p>
     *         <p>
     *         You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     *         <code>ExcludedCookies</code>.
     *         </p>
     *         <p>
     *         Example JSON:
     *         <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     */

    public CookieMatchPattern getMatchPattern() {
        return this.matchPattern;
    }

    /**
     * <p>
     * The filter to use to identify the subset of cookies to inspect in a web request.
     * </p>
     * <p>
     * You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     * <code>ExcludedCookies</code>.
     * </p>
     * <p>
     * Example JSON:
     * <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     * </p>
     * 
     * @param matchPattern
     *        The filter to use to identify the subset of cookies to inspect in a web request. </p>
     *        <p>
     *        You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
     *        <code>ExcludedCookies</code>.
     *        </p>
     *        <p>
     *        Example JSON:
     *        <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cookies withMatchPattern(CookieMatchPattern matchPattern) {
        setMatchPattern(matchPattern);
        return this;
    }

    /**
     * <p>
     * The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>, WAF
     * inspects both keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>,
     *        WAF inspects both keys and values.
     * @see MapMatchScope
     */

    public void setMatchScope(String matchScope) {
        this.matchScope = matchScope;
    }

    /**
     * <p>
     * The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>, WAF
     * inspects both keys and values.
     * </p>
     * 
     * @return The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>,
     *         WAF inspects both keys and values.
     * @see MapMatchScope
     */

    public String getMatchScope() {
        return this.matchScope;
    }

    /**
     * <p>
     * The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>, WAF
     * inspects both keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>,
     *        WAF inspects both keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapMatchScope
     */

    public Cookies withMatchScope(String matchScope) {
        setMatchScope(matchScope);
        return this;
    }

    /**
     * <p>
     * The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>, WAF
     * inspects both keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the cookies to inspect with the rule inspection criteria. If you specify <code>All</code>,
     *        WAF inspects both keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapMatchScope
     */

    public Cookies withMatchScope(MapMatchScope matchScope) {
        this.matchScope = matchScope.toString();
        return this;
    }

    /**
     * <p>
     * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting
     * the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying
     * host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support
     *        inspecting the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies.
     *        The underlying host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     *        </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @see OversizeHandling
     */

    public void setOversizeHandling(String oversizeHandling) {
        this.oversizeHandling = oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting
     * the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying
     * host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @return What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support
     *         inspecting the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total
     *         cookies. The underlying host service forwards a maximum of 200 cookies and at most 8 KB of cookie
     *         contents to WAF. </p>
     *         <p>
     *         The options for oversize handling are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *         the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *         </p>
     *         </li>
     * @see OversizeHandling
     */

    public String getOversizeHandling() {
        return this.oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting
     * the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying
     * host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support
     *        inspecting the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies.
     *        The underlying host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     *        </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public Cookies withOversizeHandling(String oversizeHandling) {
        setOversizeHandling(oversizeHandling);
        return this;
    }

    /**
     * <p>
     * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting
     * the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying
     * host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support
     *        inspecting the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies.
     *        The underlying host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.
     *        </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the cookies normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public Cookies withOversizeHandling(OversizeHandling oversizeHandling) {
        this.oversizeHandling = oversizeHandling.toString();
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
        if (getMatchPattern() != null)
            sb.append("MatchPattern: ").append(getMatchPattern()).append(",");
        if (getMatchScope() != null)
            sb.append("MatchScope: ").append(getMatchScope()).append(",");
        if (getOversizeHandling() != null)
            sb.append("OversizeHandling: ").append(getOversizeHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cookies == false)
            return false;
        Cookies other = (Cookies) obj;
        if (other.getMatchPattern() == null ^ this.getMatchPattern() == null)
            return false;
        if (other.getMatchPattern() != null && other.getMatchPattern().equals(this.getMatchPattern()) == false)
            return false;
        if (other.getMatchScope() == null ^ this.getMatchScope() == null)
            return false;
        if (other.getMatchScope() != null && other.getMatchScope().equals(this.getMatchScope()) == false)
            return false;
        if (other.getOversizeHandling() == null ^ this.getOversizeHandling() == null)
            return false;
        if (other.getOversizeHandling() != null && other.getOversizeHandling().equals(this.getOversizeHandling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchPattern() == null) ? 0 : getMatchPattern().hashCode());
        hashCode = prime * hashCode + ((getMatchScope() == null) ? 0 : getMatchScope().hashCode());
        hashCode = prime * hashCode + ((getOversizeHandling() == null) ? 0 : getOversizeHandling().hashCode());
        return hashCode;
    }

    @Override
    public Cookies clone() {
        try {
            return (Cookies) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CookiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
