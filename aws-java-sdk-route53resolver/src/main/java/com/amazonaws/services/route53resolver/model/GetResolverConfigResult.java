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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResolverConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in the
     * <code>GetResolverConfig</code> request.
     * </p>
     */
    private ResolverConfig resolverConfig;

    /**
     * <p>
     * Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in the
     * <code>GetResolverConfig</code> request.
     * </p>
     * 
     * @param resolverConfig
     *        Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in
     *        the <code>GetResolverConfig</code> request.
     */

    public void setResolverConfig(ResolverConfig resolverConfig) {
        this.resolverConfig = resolverConfig;
    }

    /**
     * <p>
     * Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in the
     * <code>GetResolverConfig</code> request.
     * </p>
     * 
     * @return Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in
     *         the <code>GetResolverConfig</code> request.
     */

    public ResolverConfig getResolverConfig() {
        return this.resolverConfig;
    }

    /**
     * <p>
     * Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in the
     * <code>GetResolverConfig</code> request.
     * </p>
     * 
     * @param resolverConfig
     *        Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in
     *        the <code>GetResolverConfig</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResolverConfigResult withResolverConfig(ResolverConfig resolverConfig) {
        setResolverConfig(resolverConfig);
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
        if (getResolverConfig() != null)
            sb.append("ResolverConfig: ").append(getResolverConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResolverConfigResult == false)
            return false;
        GetResolverConfigResult other = (GetResolverConfigResult) obj;
        if (other.getResolverConfig() == null ^ this.getResolverConfig() == null)
            return false;
        if (other.getResolverConfig() != null && other.getResolverConfig().equals(this.getResolverConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverConfig() == null) ? 0 : getResolverConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetResolverConfigResult clone() {
        try {
            return (GetResolverConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
