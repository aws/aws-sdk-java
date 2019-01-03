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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetCorsPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCorsPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The CORS policy assigned to the container.
     * </p>
     */
    private java.util.List<CorsRule> corsPolicy;

    /**
     * <p>
     * The CORS policy assigned to the container.
     * </p>
     * 
     * @return The CORS policy assigned to the container.
     */

    public java.util.List<CorsRule> getCorsPolicy() {
        return corsPolicy;
    }

    /**
     * <p>
     * The CORS policy assigned to the container.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy assigned to the container.
     */

    public void setCorsPolicy(java.util.Collection<CorsRule> corsPolicy) {
        if (corsPolicy == null) {
            this.corsPolicy = null;
            return;
        }

        this.corsPolicy = new java.util.ArrayList<CorsRule>(corsPolicy);
    }

    /**
     * <p>
     * The CORS policy assigned to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCorsPolicy(java.util.Collection)} or {@link #withCorsPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy assigned to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCorsPolicyResult withCorsPolicy(CorsRule... corsPolicy) {
        if (this.corsPolicy == null) {
            setCorsPolicy(new java.util.ArrayList<CorsRule>(corsPolicy.length));
        }
        for (CorsRule ele : corsPolicy) {
            this.corsPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CORS policy assigned to the container.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy assigned to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCorsPolicyResult withCorsPolicy(java.util.Collection<CorsRule> corsPolicy) {
        setCorsPolicy(corsPolicy);
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
        if (getCorsPolicy() != null)
            sb.append("CorsPolicy: ").append(getCorsPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCorsPolicyResult == false)
            return false;
        GetCorsPolicyResult other = (GetCorsPolicyResult) obj;
        if (other.getCorsPolicy() == null ^ this.getCorsPolicy() == null)
            return false;
        if (other.getCorsPolicy() != null && other.getCorsPolicy().equals(this.getCorsPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCorsPolicy() == null) ? 0 : getCorsPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetCorsPolicyResult clone() {
        try {
            return (GetCorsPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
