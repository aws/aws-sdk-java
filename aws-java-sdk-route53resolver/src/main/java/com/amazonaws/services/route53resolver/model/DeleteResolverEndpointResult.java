/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResolverEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     * </p>
     */
    private ResolverEndpoint resolverEndpoint;

    /**
     * <p>
     * Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverEndpoint
     *        Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     */

    public void setResolverEndpoint(ResolverEndpoint resolverEndpoint) {
        this.resolverEndpoint = resolverEndpoint;
    }

    /**
     * <p>
     * Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     * </p>
     * 
     * @return Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     */

    public ResolverEndpoint getResolverEndpoint() {
        return this.resolverEndpoint;
    }

    /**
     * <p>
     * Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverEndpoint
     *        Information about the <code>DeleteResolverEndpoint</code> request, including the status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResolverEndpointResult withResolverEndpoint(ResolverEndpoint resolverEndpoint) {
        setResolverEndpoint(resolverEndpoint);
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
        if (getResolverEndpoint() != null)
            sb.append("ResolverEndpoint: ").append(getResolverEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResolverEndpointResult == false)
            return false;
        DeleteResolverEndpointResult other = (DeleteResolverEndpointResult) obj;
        if (other.getResolverEndpoint() == null ^ this.getResolverEndpoint() == null)
            return false;
        if (other.getResolverEndpoint() != null && other.getResolverEndpoint().equals(this.getResolverEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverEndpoint() == null) ? 0 : getResolverEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResolverEndpointResult clone() {
        try {
            return (DeleteResolverEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
