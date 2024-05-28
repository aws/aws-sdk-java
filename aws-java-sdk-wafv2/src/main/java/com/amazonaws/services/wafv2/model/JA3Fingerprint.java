/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Available for use with Amazon CloudFront distributions and Application Load Balancers. Match against the request's
 * JA3 fingerprint. The JA3 fingerprint is a 32-character hash derived from the TLS Client Hello of an incoming request.
 * This fingerprint serves as a unique identifier for the client's TLS configuration. WAF calculates and logs this
 * fingerprint for each request that has enough TLS Client Hello information for the calculation. Almost all web
 * requests include this information.
 * </p>
 * <note>
 * <p>
 * You can use this choice only with a string match <code>ByteMatchStatement</code> with the
 * <code>PositionalConstraint</code> set to <code>EXACTLY</code>.
 * </p>
 * </note>
 * <p>
 * You can obtain the JA3 fingerprint for client requests from the web ACL logs. If WAF is able to calculate the
 * fingerprint, it includes it in the logs. For information about the logging fields, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging-fields.html">Log fields</a> in the <i>WAF
 * Developer Guide</i>.
 * </p>
 * <p>
 * Provide the JA3 fingerprint string from the logs in your string match statement specification, to match with any
 * future requests that have the same TLS configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/JA3Fingerprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JA3Fingerprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a JA3 fingerprint.
     * </p>
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
     * The match status to assign to the web request if the request doesn't have a JA3 fingerprint.
     * </p>
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
     *        The match status to assign to the web request if the request doesn't have a JA3 fingerprint. </p>
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
     * The match status to assign to the web request if the request doesn't have a JA3 fingerprint.
     * </p>
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
     * @return The match status to assign to the web request if the request doesn't have a JA3 fingerprint. </p>
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
     * The match status to assign to the web request if the request doesn't have a JA3 fingerprint.
     * </p>
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
     *        The match status to assign to the web request if the request doesn't have a JA3 fingerprint. </p>
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

    public JA3Fingerprint withFallbackBehavior(String fallbackBehavior) {
        setFallbackBehavior(fallbackBehavior);
        return this;
    }

    /**
     * <p>
     * The match status to assign to the web request if the request doesn't have a JA3 fingerprint.
     * </p>
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
     *        The match status to assign to the web request if the request doesn't have a JA3 fingerprint. </p>
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

    public JA3Fingerprint withFallbackBehavior(FallbackBehavior fallbackBehavior) {
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

        if (obj instanceof JA3Fingerprint == false)
            return false;
        JA3Fingerprint other = (JA3Fingerprint) obj;
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

        hashCode = prime * hashCode + ((getFallbackBehavior() == null) ? 0 : getFallbackBehavior().hashCode());
        return hashCode;
    }

    @Override
    public JA3Fingerprint clone() {
        try {
            return (JA3Fingerprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.JA3FingerprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
