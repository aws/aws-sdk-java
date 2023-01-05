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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateResponseHeadersPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResponseHeadersPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A response headers policy configuration.
     * </p>
     */
    private ResponseHeadersPolicyConfig responseHeadersPolicyConfig;
    /**
     * <p>
     * The identifier for the response headers policy that you are updating.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version of the response headers policy that you are updating.
     * </p>
     * <p>
     * The version is returned in the cache policy's <code>ETag</code> field in the response to
     * <code>GetResponseHeadersPolicyConfig</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * A response headers policy configuration.
     * </p>
     * 
     * @param responseHeadersPolicyConfig
     *        A response headers policy configuration.
     */

    public void setResponseHeadersPolicyConfig(ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
        this.responseHeadersPolicyConfig = responseHeadersPolicyConfig;
    }

    /**
     * <p>
     * A response headers policy configuration.
     * </p>
     * 
     * @return A response headers policy configuration.
     */

    public ResponseHeadersPolicyConfig getResponseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    /**
     * <p>
     * A response headers policy configuration.
     * </p>
     * 
     * @param responseHeadersPolicyConfig
     *        A response headers policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponseHeadersPolicyRequest withResponseHeadersPolicyConfig(ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
        setResponseHeadersPolicyConfig(responseHeadersPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The identifier for the response headers policy that you are updating.
     * </p>
     * 
     * @param id
     *        The identifier for the response headers policy that you are updating.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the response headers policy that you are updating.
     * </p>
     * 
     * @return The identifier for the response headers policy that you are updating.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the response headers policy that you are updating.
     * </p>
     * 
     * @param id
     *        The identifier for the response headers policy that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponseHeadersPolicyRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version of the response headers policy that you are updating.
     * </p>
     * <p>
     * The version is returned in the cache policy's <code>ETag</code> field in the response to
     * <code>GetResponseHeadersPolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the response headers policy that you are updating.</p>
     *        <p>
     *        The version is returned in the cache policy's <code>ETag</code> field in the response to
     *        <code>GetResponseHeadersPolicyConfig</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The version of the response headers policy that you are updating.
     * </p>
     * <p>
     * The version is returned in the cache policy's <code>ETag</code> field in the response to
     * <code>GetResponseHeadersPolicyConfig</code>.
     * </p>
     * 
     * @return The version of the response headers policy that you are updating.</p>
     *         <p>
     *         The version is returned in the cache policy's <code>ETag</code> field in the response to
     *         <code>GetResponseHeadersPolicyConfig</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The version of the response headers policy that you are updating.
     * </p>
     * <p>
     * The version is returned in the cache policy's <code>ETag</code> field in the response to
     * <code>GetResponseHeadersPolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the response headers policy that you are updating.</p>
     *        <p>
     *        The version is returned in the cache policy's <code>ETag</code> field in the response to
     *        <code>GetResponseHeadersPolicyConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponseHeadersPolicyRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getResponseHeadersPolicyConfig() != null)
            sb.append("ResponseHeadersPolicyConfig: ").append(getResponseHeadersPolicyConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResponseHeadersPolicyRequest == false)
            return false;
        UpdateResponseHeadersPolicyRequest other = (UpdateResponseHeadersPolicyRequest) obj;
        if (other.getResponseHeadersPolicyConfig() == null ^ this.getResponseHeadersPolicyConfig() == null)
            return false;
        if (other.getResponseHeadersPolicyConfig() != null && other.getResponseHeadersPolicyConfig().equals(this.getResponseHeadersPolicyConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseHeadersPolicyConfig() == null) ? 0 : getResponseHeadersPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResponseHeadersPolicyRequest clone() {
        return (UpdateResponseHeadersPolicyRequest) super.clone();
    }

}
