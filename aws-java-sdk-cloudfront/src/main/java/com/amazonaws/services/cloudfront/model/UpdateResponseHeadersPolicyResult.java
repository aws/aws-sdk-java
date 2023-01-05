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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateResponseHeadersPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResponseHeadersPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A response headers policy.
     * </p>
     */
    private ResponseHeadersPolicy responseHeadersPolicy;
    /**
     * <p>
     * The current version of the response headers policy.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * A response headers policy.
     * </p>
     * 
     * @param responseHeadersPolicy
     *        A response headers policy.
     */

    public void setResponseHeadersPolicy(ResponseHeadersPolicy responseHeadersPolicy) {
        this.responseHeadersPolicy = responseHeadersPolicy;
    }

    /**
     * <p>
     * A response headers policy.
     * </p>
     * 
     * @return A response headers policy.
     */

    public ResponseHeadersPolicy getResponseHeadersPolicy() {
        return this.responseHeadersPolicy;
    }

    /**
     * <p>
     * A response headers policy.
     * </p>
     * 
     * @param responseHeadersPolicy
     *        A response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponseHeadersPolicyResult withResponseHeadersPolicy(ResponseHeadersPolicy responseHeadersPolicy) {
        setResponseHeadersPolicy(responseHeadersPolicy);
        return this;
    }

    /**
     * <p>
     * The current version of the response headers policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the response headers policy.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the response headers policy.
     * </p>
     * 
     * @return The current version of the response headers policy.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the response headers policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponseHeadersPolicyResult withETag(String eTag) {
        setETag(eTag);
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
        if (getResponseHeadersPolicy() != null)
            sb.append("ResponseHeadersPolicy: ").append(getResponseHeadersPolicy()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResponseHeadersPolicyResult == false)
            return false;
        UpdateResponseHeadersPolicyResult other = (UpdateResponseHeadersPolicyResult) obj;
        if (other.getResponseHeadersPolicy() == null ^ this.getResponseHeadersPolicy() == null)
            return false;
        if (other.getResponseHeadersPolicy() != null && other.getResponseHeadersPolicy().equals(this.getResponseHeadersPolicy()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseHeadersPolicy() == null) ? 0 : getResponseHeadersPolicy().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResponseHeadersPolicyResult clone() {
        try {
            return (UpdateResponseHeadersPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
