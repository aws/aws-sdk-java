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
 * The response body to use in a custom response to a web request. This is referenced by key from <a>CustomResponse</a>
 * <code>CustomResponseBodyKey</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CustomResponseBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomResponseBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of content in the payload that you are defining in the <code>Content</code> string.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The payload of the custom response.
     * </p>
     * <p>
     * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     * <code>ContentType</code> setting.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The type of content in the payload that you are defining in the <code>Content</code> string.
     * </p>
     * 
     * @param contentType
     *        The type of content in the payload that you are defining in the <code>Content</code> string.
     * @see ResponseContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content in the payload that you are defining in the <code>Content</code> string.
     * </p>
     * 
     * @return The type of content in the payload that you are defining in the <code>Content</code> string.
     * @see ResponseContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of content in the payload that you are defining in the <code>Content</code> string.
     * </p>
     * 
     * @param contentType
     *        The type of content in the payload that you are defining in the <code>Content</code> string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseContentType
     */

    public CustomResponseBody withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The type of content in the payload that you are defining in the <code>Content</code> string.
     * </p>
     * 
     * @param contentType
     *        The type of content in the payload that you are defining in the <code>Content</code> string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseContentType
     */

    public CustomResponseBody withContentType(ResponseContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The payload of the custom response.
     * </p>
     * <p>
     * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     * <code>ContentType</code> setting.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param content
     *        The payload of the custom response. </p>
     *        <p>
     *        You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     *        <code>ContentType</code> setting.
     *        </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The payload of the custom response.
     * </p>
     * <p>
     * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     * <code>ContentType</code> setting.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return The payload of the custom response. </p>
     *         <p>
     *         You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     *         <code>ContentType</code> setting.
     *         </p>
     *         <p>
     *         For information about the limits on count and size for custom request and response settings, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The payload of the custom response.
     * </p>
     * <p>
     * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     * <code>ContentType</code> setting.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param content
     *        The payload of the custom response. </p>
     *        <p>
     *        You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the
     *        <code>ContentType</code> setting.
     *        </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomResponseBody withContent(String content) {
        setContent(content);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomResponseBody == false)
            return false;
        CustomResponseBody other = (CustomResponseBody) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public CustomResponseBody clone() {
        try {
            return (CustomResponseBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CustomResponseBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
