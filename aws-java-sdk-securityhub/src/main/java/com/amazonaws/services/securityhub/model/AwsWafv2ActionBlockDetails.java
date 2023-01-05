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
 * Specifies that WAF should block the request and optionally defines additional custom handling for the response to the
 * web request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2ActionBlockDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2ActionBlockDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines a custom response for the web request. For information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     */
    private AwsWafv2CustomResponseDetails customResponse;

    /**
     * <p>
     * Defines a custom response for the web request. For information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @param customResponse
     *        Defines a custom response for the web request. For information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     */

    public void setCustomResponse(AwsWafv2CustomResponseDetails customResponse) {
        this.customResponse = customResponse;
    }

    /**
     * <p>
     * Defines a custom response for the web request. For information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @return Defines a custom response for the web request. For information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *         web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     */

    public AwsWafv2CustomResponseDetails getCustomResponse() {
        return this.customResponse;
    }

    /**
     * <p>
     * Defines a custom response for the web request. For information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * </p>
     * 
     * @param customResponse
     *        Defines a custom response for the web request. For information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <i>WAF Developer Guide.</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2ActionBlockDetails withCustomResponse(AwsWafv2CustomResponseDetails customResponse) {
        setCustomResponse(customResponse);
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
        if (getCustomResponse() != null)
            sb.append("CustomResponse: ").append(getCustomResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2ActionBlockDetails == false)
            return false;
        AwsWafv2ActionBlockDetails other = (AwsWafv2ActionBlockDetails) obj;
        if (other.getCustomResponse() == null ^ this.getCustomResponse() == null)
            return false;
        if (other.getCustomResponse() != null && other.getCustomResponse().equals(this.getCustomResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomResponse() == null) ? 0 : getCustomResponse().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2ActionBlockDetails clone() {
        try {
            return (AwsWafv2ActionBlockDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2ActionBlockDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
