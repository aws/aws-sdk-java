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
 * Custom request handling behavior that inserts custom headers into a web request. WAF uses custom request handling
 * when the rule action doesn't block the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2CustomRequestHandlingDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2CustomRequestHandlingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP headers to insert into the request.
     * </p>
     */
    private java.util.List<AwsWafv2CustomHttpHeader> insertHeaders;

    /**
     * <p>
     * The HTTP headers to insert into the request.
     * </p>
     * 
     * @return The HTTP headers to insert into the request.
     */

    public java.util.List<AwsWafv2CustomHttpHeader> getInsertHeaders() {
        return insertHeaders;
    }

    /**
     * <p>
     * The HTTP headers to insert into the request.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request.
     */

    public void setInsertHeaders(java.util.Collection<AwsWafv2CustomHttpHeader> insertHeaders) {
        if (insertHeaders == null) {
            this.insertHeaders = null;
            return;
        }

        this.insertHeaders = new java.util.ArrayList<AwsWafv2CustomHttpHeader>(insertHeaders);
    }

    /**
     * <p>
     * The HTTP headers to insert into the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsertHeaders(java.util.Collection)} or {@link #withInsertHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomRequestHandlingDetails withInsertHeaders(AwsWafv2CustomHttpHeader... insertHeaders) {
        if (this.insertHeaders == null) {
            setInsertHeaders(new java.util.ArrayList<AwsWafv2CustomHttpHeader>(insertHeaders.length));
        }
        for (AwsWafv2CustomHttpHeader ele : insertHeaders) {
            this.insertHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to insert into the request.
     * </p>
     * 
     * @param insertHeaders
     *        The HTTP headers to insert into the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2CustomRequestHandlingDetails withInsertHeaders(java.util.Collection<AwsWafv2CustomHttpHeader> insertHeaders) {
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

        if (obj instanceof AwsWafv2CustomRequestHandlingDetails == false)
            return false;
        AwsWafv2CustomRequestHandlingDetails other = (AwsWafv2CustomRequestHandlingDetails) obj;
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
    public AwsWafv2CustomRequestHandlingDetails clone() {
        try {
            return (AwsWafv2CustomRequestHandlingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2CustomRequestHandlingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
