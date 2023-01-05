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
 * A response headers policy.
 * </p>
 * <p>
 * A response headers policy contains information about a set of HTTP response headers.
 * </p>
 * <p>
 * After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a
 * CloudFront distribution. When it's attached to a cache behavior, the response headers policy affects the HTTP headers
 * that CloudFront includes in HTTP responses to requests that match the cache behavior. CloudFront adds or removes
 * response headers according to the configuration of the response headers policy.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html">Adding or
 * removing HTTP headers in CloudFront responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the response headers policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time when the response headers policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A response headers policy configuration.
     * </p>
     */
    private ResponseHeadersPolicyConfig responseHeadersPolicyConfig;

    /**
     * <p>
     * The identifier for the response headers policy.
     * </p>
     * 
     * @param id
     *        The identifier for the response headers policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the response headers policy.
     * </p>
     * 
     * @return The identifier for the response headers policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the response headers policy.
     * </p>
     * 
     * @param id
     *        The identifier for the response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time when the response headers policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the response headers policy was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the response headers policy was last modified.
     * </p>
     * 
     * @return The date and time when the response headers policy was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the response headers policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the response headers policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicy withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

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

    public ResponseHeadersPolicy withResponseHeadersPolicyConfig(ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
        setResponseHeadersPolicyConfig(responseHeadersPolicyConfig);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getResponseHeadersPolicyConfig() != null)
            sb.append("ResponseHeadersPolicyConfig: ").append(getResponseHeadersPolicyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicy == false)
            return false;
        ResponseHeadersPolicy other = (ResponseHeadersPolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getResponseHeadersPolicyConfig() == null ^ this.getResponseHeadersPolicyConfig() == null)
            return false;
        if (other.getResponseHeadersPolicyConfig() != null && other.getResponseHeadersPolicyConfig().equals(this.getResponseHeadersPolicyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getResponseHeadersPolicyConfig() == null) ? 0 : getResponseHeadersPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicy clone() {
        try {
            return (ResponseHeadersPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
