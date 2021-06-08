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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverQueryLogConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the request.
     * </p>
     */
    private ResolverQueryLogConfig resolverQueryLogConfig;

    /**
     * <p>
     * Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverQueryLogConfig
     *        Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the
     *        request.
     */

    public void setResolverQueryLogConfig(ResolverQueryLogConfig resolverQueryLogConfig) {
        this.resolverQueryLogConfig = resolverQueryLogConfig;
    }

    /**
     * <p>
     * Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the request.
     * </p>
     * 
     * @return Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the
     *         request.
     */

    public ResolverQueryLogConfig getResolverQueryLogConfig() {
        return this.resolverQueryLogConfig;
    }

    /**
     * <p>
     * Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverQueryLogConfig
     *        Information about the <code>CreateResolverQueryLogConfig</code> request, including the status of the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigResult withResolverQueryLogConfig(ResolverQueryLogConfig resolverQueryLogConfig) {
        setResolverQueryLogConfig(resolverQueryLogConfig);
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
        if (getResolverQueryLogConfig() != null)
            sb.append("ResolverQueryLogConfig: ").append(getResolverQueryLogConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverQueryLogConfigResult == false)
            return false;
        CreateResolverQueryLogConfigResult other = (CreateResolverQueryLogConfigResult) obj;
        if (other.getResolverQueryLogConfig() == null ^ this.getResolverQueryLogConfig() == null)
            return false;
        if (other.getResolverQueryLogConfig() != null && other.getResolverQueryLogConfig().equals(this.getResolverQueryLogConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverQueryLogConfig() == null) ? 0 : getResolverQueryLogConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverQueryLogConfigResult clone() {
        try {
            return (CreateResolverQueryLogConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
