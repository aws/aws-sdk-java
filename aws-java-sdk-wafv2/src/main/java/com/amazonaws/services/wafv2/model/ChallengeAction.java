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
 * Specifies that WAF should run a <code>Challenge</code> check against the request to verify that the request is coming
 * from a legitimate client session:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the request includes a valid, unexpired challenge token, WAF applies any custom request handling and labels that
 * you've configured and then allows the web request inspection to proceed to the next rule, similar to a
 * <code>CountAction</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the request doesn't include a valid, unexpired challenge token, WAF discontinues the web ACL evaluation of the
 * request and blocks it from going to its intended destination.
 * </p>
 * <p>
 * WAF then generates a challenge response that it sends back to the client, which includes the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The header <code>x-amzn-waf-action</code> with a value of <code>challenge</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The HTTP status code <code>202 Request Accepted</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the request contains an <code>Accept</code> header with a value of <code>text/html</code>, the response includes a
 * JavaScript page interstitial with a challenge script.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Challenges run silent browser interrogations in the background, and don't generally affect the end user experience.
 * </p>
 * <p>
 * A challenge enforces token acquisition using an interstitial JavaScript challenge that inspects the client session
 * for legitimate behavior. The challenge blocks bots or at least increases the cost of operating sophisticated bots.
 * </p>
 * <p>
 * After the client session successfully responds to the challenge, it receives a new token from WAF, which the
 * challenge script uses to resubmit the original request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can configure the expiration time in the <code>ChallengeConfig</code> <code>ImmunityTimeProperty</code> setting
 * at the rule and web ACL level. The rule setting overrides the web ACL setting.
 * </p>
 * <p>
 * This action option is available for rules. It isn't available for web ACL default actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ChallengeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChallengeAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines custom handling for the web request, used when the challenge inspection determines that the request's
     * token is valid and unexpired.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private CustomRequestHandling customRequestHandling;

    /**
     * <p>
     * Defines custom handling for the web request, used when the challenge inspection determines that the request's
     * token is valid and unexpired.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param customRequestHandling
     *        Defines custom handling for the web request, used when the challenge inspection determines that the
     *        request's token is valid and unexpired.</p>
     *        <p>
     *        For information about customizing web requests and responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setCustomRequestHandling(CustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    /**
     * <p>
     * Defines custom handling for the web request, used when the challenge inspection determines that the request's
     * token is valid and unexpired.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return Defines custom handling for the web request, used when the challenge inspection determines that the
     *         request's token is valid and unexpired.</p>
     *         <p>
     *         For information about customizing web requests and responses, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *         web requests and responses in WAF</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public CustomRequestHandling getCustomRequestHandling() {
        return this.customRequestHandling;
    }

    /**
     * <p>
     * Defines custom handling for the web request, used when the challenge inspection determines that the request's
     * token is valid and unexpired.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param customRequestHandling
     *        Defines custom handling for the web request, used when the challenge inspection determines that the
     *        request's token is valid and unexpired.</p>
     *        <p>
     *        For information about customizing web requests and responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChallengeAction withCustomRequestHandling(CustomRequestHandling customRequestHandling) {
        setCustomRequestHandling(customRequestHandling);
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
        if (getCustomRequestHandling() != null)
            sb.append("CustomRequestHandling: ").append(getCustomRequestHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChallengeAction == false)
            return false;
        ChallengeAction other = (ChallengeAction) obj;
        if (other.getCustomRequestHandling() == null ^ this.getCustomRequestHandling() == null)
            return false;
        if (other.getCustomRequestHandling() != null && other.getCustomRequestHandling().equals(this.getCustomRequestHandling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomRequestHandling() == null) ? 0 : getCustomRequestHandling().hashCode());
        return hashCode;
    }

    @Override
    public ChallengeAction clone() {
        try {
            return (ChallengeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ChallengeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
