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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResolverQueryLogConfigPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the query logging policy for the query logging configuration that you specified in a
     * <code>GetResolverQueryLogConfigPolicy</code> request.
     * </p>
     */
    private String resolverQueryLogConfigPolicy;

    /**
     * <p>
     * Information about the query logging policy for the query logging configuration that you specified in a
     * <code>GetResolverQueryLogConfigPolicy</code> request.
     * </p>
     * 
     * @param resolverQueryLogConfigPolicy
     *        Information about the query logging policy for the query logging configuration that you specified in a
     *        <code>GetResolverQueryLogConfigPolicy</code> request.
     */

    public void setResolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
        this.resolverQueryLogConfigPolicy = resolverQueryLogConfigPolicy;
    }

    /**
     * <p>
     * Information about the query logging policy for the query logging configuration that you specified in a
     * <code>GetResolverQueryLogConfigPolicy</code> request.
     * </p>
     * 
     * @return Information about the query logging policy for the query logging configuration that you specified in a
     *         <code>GetResolverQueryLogConfigPolicy</code> request.
     */

    public String getResolverQueryLogConfigPolicy() {
        return this.resolverQueryLogConfigPolicy;
    }

    /**
     * <p>
     * Information about the query logging policy for the query logging configuration that you specified in a
     * <code>GetResolverQueryLogConfigPolicy</code> request.
     * </p>
     * 
     * @param resolverQueryLogConfigPolicy
     *        Information about the query logging policy for the query logging configuration that you specified in a
     *        <code>GetResolverQueryLogConfigPolicy</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResolverQueryLogConfigPolicyResult withResolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
        setResolverQueryLogConfigPolicy(resolverQueryLogConfigPolicy);
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
        if (getResolverQueryLogConfigPolicy() != null)
            sb.append("ResolverQueryLogConfigPolicy: ").append(getResolverQueryLogConfigPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResolverQueryLogConfigPolicyResult == false)
            return false;
        GetResolverQueryLogConfigPolicyResult other = (GetResolverQueryLogConfigPolicyResult) obj;
        if (other.getResolverQueryLogConfigPolicy() == null ^ this.getResolverQueryLogConfigPolicy() == null)
            return false;
        if (other.getResolverQueryLogConfigPolicy() != null && other.getResolverQueryLogConfigPolicy().equals(this.getResolverQueryLogConfigPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverQueryLogConfigPolicy() == null) ? 0 : getResolverQueryLogConfigPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetResolverQueryLogConfigPolicyResult clone() {
        try {
            return (GetResolverQueryLogConfigPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
