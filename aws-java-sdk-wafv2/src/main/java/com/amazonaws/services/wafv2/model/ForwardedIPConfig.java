/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
 * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify
 * any header name.
 * </p>
 * <note>
 * <p>
 * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
 * </p>
 * </note>
 * <p>
 * This configuration is used for <a>GeoMatchStatement</a> and <a>RateBasedStatement</a>. For
 * <a>IPSetReferenceStatement</a>, use <a>IPSetForwardedIPConfig</a> instead.
 * </p>
 * <p>
 * WAF only evaluates the first IP address found in the specified HTTP header.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ForwardedIPConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForwardedIPConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set
     * this to <code>X-Forwarded-For</code>.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     */
    private String headerName;
    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a valid IP address in the specified
     * position.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * You can specify the following fallback behaviors:
     * </p>
     * <ul>
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
    private String fallbackBehavior;

    /**
     * <p>
     * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set
     * this to <code>X-Forwarded-For</code>.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @param headerName
     *        The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF)
     *        header, set this to <code>X-Forwarded-For</code>.</p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     */

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set
     * this to <code>X-Forwarded-For</code>.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @return The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF)
     *         header, set this to <code>X-Forwarded-For</code>.</p> <note>
     *         <p>
     *         If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *         all.
     *         </p>
     */

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * <p>
     * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set
     * this to <code>X-Forwarded-For</code>.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @param headerName
     *        The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF)
     *        header, set this to <code>X-Forwarded-For</code>.</p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardedIPConfig withHeaderName(String headerName) {
        setHeaderName(headerName);
        return this;
    }

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a valid IP address in the specified
     * position.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * You can specify the following fallback behaviors:
     * </p>
     * <ul>
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
     * @param fallbackBehavior
     *        The match status to assign to the web request if the request doesn't have a valid IP address in the
     *        specified position.</p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following fallback behaviors:
     *        </p>
     *        <ul>
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
     * @see FallbackBehavior
     */

    public void setFallbackBehavior(String fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior;
    }

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a valid IP address in the specified
     * position.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * You can specify the following fallback behaviors:
     * </p>
     * <ul>
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
     * @return The match status to assign to the web request if the request doesn't have a valid IP address in the
     *         specified position.</p> <note>
     *         <p>
     *         If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *         all.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify the following fallback behaviors:
     *         </p>
     *         <ul>
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
     * @see FallbackBehavior
     */

    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a valid IP address in the specified
     * position.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * You can specify the following fallback behaviors:
     * </p>
     * <ul>
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
     * @param fallbackBehavior
     *        The match status to assign to the web request if the request doesn't have a valid IP address in the
     *        specified position.</p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following fallback behaviors:
     *        </p>
     *        <ul>
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
     * @see FallbackBehavior
     */

    public ForwardedIPConfig withFallbackBehavior(String fallbackBehavior) {
        setFallbackBehavior(fallbackBehavior);
        return this;
    }

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a valid IP address in the specified
     * position.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * You can specify the following fallback behaviors:
     * </p>
     * <ul>
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
     * @param fallbackBehavior
     *        The match status to assign to the web request if the request doesn't have a valid IP address in the
     *        specified position.</p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following fallback behaviors:
     *        </p>
     *        <ul>
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
     * @see FallbackBehavior
     */

    public ForwardedIPConfig withFallbackBehavior(FallbackBehavior fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior.toString();
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
        if (getHeaderName() != null)
            sb.append("HeaderName: ").append(getHeaderName()).append(",");
        if (getFallbackBehavior() != null)
            sb.append("FallbackBehavior: ").append(getFallbackBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForwardedIPConfig == false)
            return false;
        ForwardedIPConfig other = (ForwardedIPConfig) obj;
        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getFallbackBehavior() == null ^ this.getFallbackBehavior() == null)
            return false;
        if (other.getFallbackBehavior() != null && other.getFallbackBehavior().equals(this.getFallbackBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime * hashCode + ((getFallbackBehavior() == null) ? 0 : getFallbackBehavior().hashCode());
        return hashCode;
    }

    @Override
    public ForwardedIPConfig clone() {
        try {
            return (ForwardedIPConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ForwardedIPConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
