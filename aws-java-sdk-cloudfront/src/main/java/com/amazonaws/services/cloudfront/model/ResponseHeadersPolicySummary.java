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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a response headers policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     * <code>custom</code> (created in this Amazon Web Services account).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The response headers policy.
     * </p>
     */
    private ResponseHeadersPolicy responseHeadersPolicy;

    /**
     * <p>
     * The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     * <code>custom</code> (created in this Amazon Web Services account).
     * </p>
     * 
     * @param type
     *        The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     *        <code>custom</code> (created in this Amazon Web Services account).
     * @see ResponseHeadersPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     * <code>custom</code> (created in this Amazon Web Services account).
     * </p>
     * 
     * @return The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     *         <code>custom</code> (created in this Amazon Web Services account).
     * @see ResponseHeadersPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     * <code>custom</code> (created in this Amazon Web Services account).
     * </p>
     * 
     * @param type
     *        The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     *        <code>custom</code> (created in this Amazon Web Services account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseHeadersPolicyType
     */

    public ResponseHeadersPolicySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     * <code>custom</code> (created in this Amazon Web Services account).
     * </p>
     * 
     * @param type
     *        The type of response headers policy, either <code>managed</code> (created by Amazon Web Services) or
     *        <code>custom</code> (created in this Amazon Web Services account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseHeadersPolicyType
     */

    public ResponseHeadersPolicySummary withType(ResponseHeadersPolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The response headers policy.
     * </p>
     * 
     * @param responseHeadersPolicy
     *        The response headers policy.
     */

    public void setResponseHeadersPolicy(ResponseHeadersPolicy responseHeadersPolicy) {
        this.responseHeadersPolicy = responseHeadersPolicy;
    }

    /**
     * <p>
     * The response headers policy.
     * </p>
     * 
     * @return The response headers policy.
     */

    public ResponseHeadersPolicy getResponseHeadersPolicy() {
        return this.responseHeadersPolicy;
    }

    /**
     * <p>
     * The response headers policy.
     * </p>
     * 
     * @param responseHeadersPolicy
     *        The response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySummary withResponseHeadersPolicy(ResponseHeadersPolicy responseHeadersPolicy) {
        setResponseHeadersPolicy(responseHeadersPolicy);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResponseHeadersPolicy() != null)
            sb.append("ResponseHeadersPolicy: ").append(getResponseHeadersPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicySummary == false)
            return false;
        ResponseHeadersPolicySummary other = (ResponseHeadersPolicySummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResponseHeadersPolicy() == null ^ this.getResponseHeadersPolicy() == null)
            return false;
        if (other.getResponseHeadersPolicy() != null && other.getResponseHeadersPolicy().equals(this.getResponseHeadersPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResponseHeadersPolicy() == null) ? 0 : getResponseHeadersPolicy().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicySummary clone() {
        try {
            return (ResponseHeadersPolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
