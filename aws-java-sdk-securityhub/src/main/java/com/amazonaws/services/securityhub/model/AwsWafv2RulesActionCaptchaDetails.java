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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies that WAF should run a CAPTCHA check against the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2RulesActionCaptchaDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2RulesActionCaptchaDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines custom handling for the web request, used when the CAPTCHA inspection determines that the request's token
     * is valid and unexpired. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     */
    private AwsWafv2CustomRequestHandlingDetails customRequestHandling;

    /**
     * <p>
     * Defines custom handling for the web request, used when the CAPTCHA inspection determines that the request's token
     * is valid and unexpired. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @param customRequestHandling
     *        Defines custom handling for the web request, used when the CAPTCHA inspection determines that the
     *        request's token is valid and unexpired. For more information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     */

    public void setCustomRequestHandling(AwsWafv2CustomRequestHandlingDetails customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    /**
     * <p>
     * Defines custom handling for the web request, used when the CAPTCHA inspection determines that the request's token
     * is valid and unexpired. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @return Defines custom handling for the web request, used when the CAPTCHA inspection determines that the
     *         request's token is valid and unexpired. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *         web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     */

    public AwsWafv2CustomRequestHandlingDetails getCustomRequestHandling() {
        return this.customRequestHandling;
    }

    /**
     * <p>
     * Defines custom handling for the web request, used when the CAPTCHA inspection determines that the request's token
     * is valid and unexpired. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @param customRequestHandling
     *        Defines custom handling for the web request, used when the CAPTCHA inspection determines that the
     *        request's token is valid and unexpired. For more information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesActionCaptchaDetails withCustomRequestHandling(AwsWafv2CustomRequestHandlingDetails customRequestHandling) {
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

        if (obj instanceof AwsWafv2RulesActionCaptchaDetails == false)
            return false;
        AwsWafv2RulesActionCaptchaDetails other = (AwsWafv2RulesActionCaptchaDetails) obj;
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
    public AwsWafv2RulesActionCaptchaDetails clone() {
        try {
            return (AwsWafv2RulesActionCaptchaDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2RulesActionCaptchaDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
