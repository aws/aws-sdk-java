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
 * Custom request handling behavior that inserts custom headers into a web request. You can add custom request handling
 * for the rule actions allow and count.
 * </p>
 * <p>
 * For information about customizing web requests and responses, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
 * requests and responses in WAF</a> in the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CustomRequestHandling" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRequestHandling implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private java.util.List<CustomHTTPHeader> insertHeaders;

    /**
     * <p>
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return The HTTP headers to insert into the request. Duplicate header names are not allowed. </p>
     *         <p>
     *         For information about the limits on count and size for custom request and response settings, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public java.util.List<CustomHTTPHeader> getInsertHeaders() {
        return insertHeaders;
    }

    /**
     * <p>
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setInsertHeaders(java.util.Collection<CustomHTTPHeader> insertHeaders) {
        if (insertHeaders == null) {
            this.insertHeaders = null;
            return;
        }

        this.insertHeaders = new java.util.ArrayList<CustomHTTPHeader>(insertHeaders);
    }

    /**
     * <p>
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsertHeaders(java.util.Collection)} or {@link #withInsertHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRequestHandling withInsertHeaders(CustomHTTPHeader... insertHeaders) {
        if (this.insertHeaders == null) {
            setInsertHeaders(new java.util.ArrayList<CustomHTTPHeader>(insertHeaders.length));
        }
        for (CustomHTTPHeader ele : insertHeaders) {
            this.insertHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request. Duplicate header names are not allowed. </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRequestHandling withInsertHeaders(java.util.Collection<CustomHTTPHeader> insertHeaders) {
        setInsertHeaders(insertHeaders);
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
        if (getInsertHeaders() != null)
            sb.append("InsertHeaders: ").append(getInsertHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRequestHandling == false)
            return false;
        CustomRequestHandling other = (CustomRequestHandling) obj;
        if (other.getInsertHeaders() == null ^ this.getInsertHeaders() == null)
            return false;
        if (other.getInsertHeaders() != null && other.getInsertHeaders().equals(this.getInsertHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsertHeaders() == null) ? 0 : getInsertHeaders().hashCode());
        return hashCode;
    }

    @Override
    public CustomRequestHandling clone() {
        try {
            return (CustomRequestHandling) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CustomRequestHandlingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
