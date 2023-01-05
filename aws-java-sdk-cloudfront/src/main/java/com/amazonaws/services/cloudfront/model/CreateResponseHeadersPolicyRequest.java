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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateResponseHeadersPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResponseHeadersPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains metadata about the response headers policy, and a set of configurations that specify the HTTP headers.
     * </p>
     */
    private ResponseHeadersPolicyConfig responseHeadersPolicyConfig;

    /**
     * <p>
     * Contains metadata about the response headers policy, and a set of configurations that specify the HTTP headers.
     * </p>
     * 
     * @param responseHeadersPolicyConfig
     *        Contains metadata about the response headers policy, and a set of configurations that specify the HTTP
     *        headers.
     */

    public void setResponseHeadersPolicyConfig(ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
        this.responseHeadersPolicyConfig = responseHeadersPolicyConfig;
    }

    /**
     * <p>
     * Contains metadata about the response headers policy, and a set of configurations that specify the HTTP headers.
     * </p>
     * 
     * @return Contains metadata about the response headers policy, and a set of configurations that specify the HTTP
     *         headers.
     */

    public ResponseHeadersPolicyConfig getResponseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    /**
     * <p>
     * Contains metadata about the response headers policy, and a set of configurations that specify the HTTP headers.
     * </p>
     * 
     * @param responseHeadersPolicyConfig
     *        Contains metadata about the response headers policy, and a set of configurations that specify the HTTP
     *        headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponseHeadersPolicyRequest withResponseHeadersPolicyConfig(ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
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

        if (obj instanceof CreateResponseHeadersPolicyRequest == false)
            return false;
        CreateResponseHeadersPolicyRequest other = (CreateResponseHeadersPolicyRequest) obj;
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

        hashCode = prime * hashCode + ((getResponseHeadersPolicyConfig() == null) ? 0 : getResponseHeadersPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateResponseHeadersPolicyRequest clone() {
        return (CreateResponseHeadersPolicyRequest) super.clone();
    }

}
