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
 * A custom response to send to the client. You can define a custom response for rule actions and default web ACL
 * actions that are set to block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2CustomResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2CustomResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block.
     * </p>
     */
    private String customResponseBodyKey;
    /**
     * <p>
     * The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     * responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     * </p>
     */
    private Integer responseCode;
    /**
     * <p>
     * The HTTP headers to use in the response.
     * </p>
     */
    private java.util.List<AwsWafv2CustomHttpHeader> responseHeaders;

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block.
     * </p>
     * 
     * @param customResponseBodyKey
     *        References the response body that you want WAF to return to the web request client. You can define a
     *        custom response for a rule action or a default web ACL action that is set to block.
     */

    public void setCustomResponseBodyKey(String customResponseBodyKey) {
        this.customResponseBodyKey = customResponseBodyKey;
    }

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block.
     * </p>
     * 
     * @return References the response body that you want WAF to return to the web request client. You can define a
     *         custom response for a rule action or a default web ACL action that is set to block.
     */

    public String getCustomResponseBodyKey() {
        return this.customResponseBodyKey;
    }

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block.
     * </p>
     * 
     * @param customResponseBodyKey
     *        References the response body that you want WAF to return to the web request client. You can define a
     *        custom response for a rule action or a default web ACL action that is set to block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomResponseDetails withCustomResponseBodyKey(String customResponseBodyKey) {
        setCustomResponseBodyKey(customResponseBodyKey);
        return this;
    }

    /**
     * <p>
     * The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     * responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     *        responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *        >Supported status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     */

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     * responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     * </p>
     * 
     * @return The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     *         responses, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *         >Supported status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     */

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     * responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code to return to the client. For a list of status codes that you can use in your custom
     *        responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *        >Supported status codes for custom response</a> in the <i>WAF Developer Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomResponseDetails withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The HTTP headers to use in the response.
     * </p>
     * 
     * @return The HTTP headers to use in the response.
     */

    public java.util.List<AwsWafv2CustomHttpHeader> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * <p>
     * The HTTP headers to use in the response.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response.
     */

    public void setResponseHeaders(java.util.Collection<AwsWafv2CustomHttpHeader> responseHeaders) {
        if (responseHeaders == null) {
            this.responseHeaders = null;
            return;
        }

        this.responseHeaders = new java.util.ArrayList<AwsWafv2CustomHttpHeader>(responseHeaders);
    }

    /**
     * <p>
     * The HTTP headers to use in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponseHeaders(java.util.Collection)} or {@link #withResponseHeaders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomResponseDetails withResponseHeaders(AwsWafv2CustomHttpHeader... responseHeaders) {
        if (this.responseHeaders == null) {
            setResponseHeaders(new java.util.ArrayList<AwsWafv2CustomHttpHeader>(responseHeaders.length));
        }
        for (AwsWafv2CustomHttpHeader ele : responseHeaders) {
            this.responseHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to use in the response.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomResponseDetails withResponseHeaders(java.util.Collection<AwsWafv2CustomHttpHeader> responseHeaders) {
        setResponseHeaders(responseHeaders);
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
        if (getCustomResponseBodyKey() != null)
            sb.append("CustomResponseBodyKey: ").append(getCustomResponseBodyKey()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getResponseHeaders() != null)
            sb.append("ResponseHeaders: ").append(getResponseHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2CustomResponseDetails == false)
            return false;
        AwsWafv2CustomResponseDetails other = (AwsWafv2CustomResponseDetails) obj;
        if (other.getCustomResponseBodyKey() == null ^ this.getCustomResponseBodyKey() == null)
            return false;
        if (other.getCustomResponseBodyKey() != null && other.getCustomResponseBodyKey().equals(this.getCustomResponseBodyKey()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getResponseHeaders() == null ^ this.getResponseHeaders() == null)
            return false;
        if (other.getResponseHeaders() != null && other.getResponseHeaders().equals(this.getResponseHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomResponseBodyKey() == null) ? 0 : getCustomResponseBodyKey().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getResponseHeaders() == null) ? 0 : getResponseHeaders().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2CustomResponseDetails clone() {
        try {
            return (AwsWafv2CustomResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2CustomResponseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
