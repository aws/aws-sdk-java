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
 * A custom response to send to the client. You can define a custom response for rule actions and default web ACL
 * actions that are set to <a>BlockAction</a>.
 * </p>
 * <p>
 * For information about customizing web requests and responses, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
 * requests and responses in WAF</a> in the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CustomResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP status code to return to the client.
     * </p>
     * <p>
     * For a list of status codes that you can use in your custom reqponses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private Integer responseCode;
    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block. To do this, you first define the
     * response body key and value in the <code>CustomResponseBodies</code> setting for the <a>WebACL</a> or
     * <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default action
     * <code>BlockAction</code> setting, you reference the response body using this key.
     * </p>
     */
    private String customResponseBodyKey;
    /**
     * <p>
     * The HTTP headers to use in the response. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private java.util.List<CustomHTTPHeader> responseHeaders;

    /**
     * <p>
     * The HTTP status code to return to the client.
     * </p>
     * <p>
     * For a list of status codes that you can use in your custom reqponses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code to return to the client. </p>
     *        <p>
     *        For a list of status codes that you can use in your custom reqponses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *        >Supported status codes for custom response</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The HTTP status code to return to the client.
     * </p>
     * <p>
     * For a list of status codes that you can use in your custom reqponses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return The HTTP status code to return to the client. </p>
     *         <p>
     *         For a list of status codes that you can use in your custom reqponses, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *         >Supported status codes for custom response</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The HTTP status code to return to the client.
     * </p>
     * <p>
     * For a list of status codes that you can use in your custom reqponses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html">Supported
     * status codes for custom response</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code to return to the client. </p>
     *        <p>
     *        For a list of status codes that you can use in your custom reqponses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html"
     *        >Supported status codes for custom response</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomResponse withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block. To do this, you first define the
     * response body key and value in the <code>CustomResponseBodies</code> setting for the <a>WebACL</a> or
     * <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default action
     * <code>BlockAction</code> setting, you reference the response body using this key.
     * </p>
     * 
     * @param customResponseBodyKey
     *        References the response body that you want WAF to return to the web request client. You can define a
     *        custom response for a rule action or a default web ACL action that is set to block. To do this, you first
     *        define the response body key and value in the <code>CustomResponseBodies</code> setting for the
     *        <a>WebACL</a> or <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default
     *        action <code>BlockAction</code> setting, you reference the response body using this key.
     */

    public void setCustomResponseBodyKey(String customResponseBodyKey) {
        this.customResponseBodyKey = customResponseBodyKey;
    }

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block. To do this, you first define the
     * response body key and value in the <code>CustomResponseBodies</code> setting for the <a>WebACL</a> or
     * <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default action
     * <code>BlockAction</code> setting, you reference the response body using this key.
     * </p>
     * 
     * @return References the response body that you want WAF to return to the web request client. You can define a
     *         custom response for a rule action or a default web ACL action that is set to block. To do this, you first
     *         define the response body key and value in the <code>CustomResponseBodies</code> setting for the
     *         <a>WebACL</a> or <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default
     *         action <code>BlockAction</code> setting, you reference the response body using this key.
     */

    public String getCustomResponseBodyKey() {
        return this.customResponseBodyKey;
    }

    /**
     * <p>
     * References the response body that you want WAF to return to the web request client. You can define a custom
     * response for a rule action or a default web ACL action that is set to block. To do this, you first define the
     * response body key and value in the <code>CustomResponseBodies</code> setting for the <a>WebACL</a> or
     * <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default action
     * <code>BlockAction</code> setting, you reference the response body using this key.
     * </p>
     * 
     * @param customResponseBodyKey
     *        References the response body that you want WAF to return to the web request client. You can define a
     *        custom response for a rule action or a default web ACL action that is set to block. To do this, you first
     *        define the response body key and value in the <code>CustomResponseBodies</code> setting for the
     *        <a>WebACL</a> or <a>RuleGroup</a> where you want to use it. Then, in the rule action or web ACL default
     *        action <code>BlockAction</code> setting, you reference the response body using this key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomResponse withCustomResponseBodyKey(String customResponseBodyKey) {
        setCustomResponseBodyKey(customResponseBodyKey);
        return this;
    }

    /**
     * <p>
     * The HTTP headers to use in the response. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return The HTTP headers to use in the response. Duplicate header names are not allowed. </p>
     *         <p>
     *         For information about the limits on count and size for custom request and response settings, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public java.util.List<CustomHTTPHeader> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * <p>
     * The HTTP headers to use in the response. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setResponseHeaders(java.util.Collection<CustomHTTPHeader> responseHeaders) {
        if (responseHeaders == null) {
            this.responseHeaders = null;
            return;
        }

        this.responseHeaders = new java.util.ArrayList<CustomHTTPHeader>(responseHeaders);
    }

    /**
     * <p>
     * The HTTP headers to use in the response. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponseHeaders(java.util.Collection)} or {@link #withResponseHeaders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomResponse withResponseHeaders(CustomHTTPHeader... responseHeaders) {
        if (this.responseHeaders == null) {
            setResponseHeaders(new java.util.ArrayList<CustomHTTPHeader>(responseHeaders.length));
        }
        for (CustomHTTPHeader ele : responseHeaders) {
            this.responseHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to use in the response. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param responseHeaders
     *        The HTTP headers to use in the response. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomResponse withResponseHeaders(java.util.Collection<CustomHTTPHeader> responseHeaders) {
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
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getCustomResponseBodyKey() != null)
            sb.append("CustomResponseBodyKey: ").append(getCustomResponseBodyKey()).append(",");
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

        if (obj instanceof CustomResponse == false)
            return false;
        CustomResponse other = (CustomResponse) obj;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getCustomResponseBodyKey() == null ^ this.getCustomResponseBodyKey() == null)
            return false;
        if (other.getCustomResponseBodyKey() != null && other.getCustomResponseBodyKey().equals(this.getCustomResponseBodyKey()) == false)
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

        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getCustomResponseBodyKey() == null) ? 0 : getCustomResponseBodyKey().hashCode());
        hashCode = prime * hashCode + ((getResponseHeaders() == null) ? 0 : getResponseHeaders().hashCode());
        return hashCode;
    }

    @Override
    public CustomResponse clone() {
        try {
            return (CustomResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CustomResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
