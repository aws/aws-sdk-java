/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes criteria that can be applied to incoming requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/HttpMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The header matches. Matches incoming requests with rule based on request header value before applying rule
     * action.
     * </p>
     */
    private java.util.List<HeaderMatch> headerMatches;
    /**
     * <p>
     * The HTTP method type.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The path match.
     * </p>
     */
    private PathMatch pathMatch;

    /**
     * <p>
     * The header matches. Matches incoming requests with rule based on request header value before applying rule
     * action.
     * </p>
     * 
     * @return The header matches. Matches incoming requests with rule based on request header value before applying
     *         rule action.
     */

    public java.util.List<HeaderMatch> getHeaderMatches() {
        return headerMatches;
    }

    /**
     * <p>
     * The header matches. Matches incoming requests with rule based on request header value before applying rule
     * action.
     * </p>
     * 
     * @param headerMatches
     *        The header matches. Matches incoming requests with rule based on request header value before applying rule
     *        action.
     */

    public void setHeaderMatches(java.util.Collection<HeaderMatch> headerMatches) {
        if (headerMatches == null) {
            this.headerMatches = null;
            return;
        }

        this.headerMatches = new java.util.ArrayList<HeaderMatch>(headerMatches);
    }

    /**
     * <p>
     * The header matches. Matches incoming requests with rule based on request header value before applying rule
     * action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderMatches(java.util.Collection)} or {@link #withHeaderMatches(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param headerMatches
     *        The header matches. Matches incoming requests with rule based on request header value before applying rule
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpMatch withHeaderMatches(HeaderMatch... headerMatches) {
        if (this.headerMatches == null) {
            setHeaderMatches(new java.util.ArrayList<HeaderMatch>(headerMatches.length));
        }
        for (HeaderMatch ele : headerMatches) {
            this.headerMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The header matches. Matches incoming requests with rule based on request header value before applying rule
     * action.
     * </p>
     * 
     * @param headerMatches
     *        The header matches. Matches incoming requests with rule based on request header value before applying rule
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpMatch withHeaderMatches(java.util.Collection<HeaderMatch> headerMatches) {
        setHeaderMatches(headerMatches);
        return this;
    }

    /**
     * <p>
     * The HTTP method type.
     * </p>
     * 
     * @param method
     *        The HTTP method type.
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP method type.
     * </p>
     * 
     * @return The HTTP method type.
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The HTTP method type.
     * </p>
     * 
     * @param method
     *        The HTTP method type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpMatch withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The path match.
     * </p>
     * 
     * @param pathMatch
     *        The path match.
     */

    public void setPathMatch(PathMatch pathMatch) {
        this.pathMatch = pathMatch;
    }

    /**
     * <p>
     * The path match.
     * </p>
     * 
     * @return The path match.
     */

    public PathMatch getPathMatch() {
        return this.pathMatch;
    }

    /**
     * <p>
     * The path match.
     * </p>
     * 
     * @param pathMatch
     *        The path match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpMatch withPathMatch(PathMatch pathMatch) {
        setPathMatch(pathMatch);
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
        if (getHeaderMatches() != null)
            sb.append("HeaderMatches: ").append(getHeaderMatches()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getPathMatch() != null)
            sb.append("PathMatch: ").append(getPathMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpMatch == false)
            return false;
        HttpMatch other = (HttpMatch) obj;
        if (other.getHeaderMatches() == null ^ this.getHeaderMatches() == null)
            return false;
        if (other.getHeaderMatches() != null && other.getHeaderMatches().equals(this.getHeaderMatches()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getPathMatch() == null ^ this.getPathMatch() == null)
            return false;
        if (other.getPathMatch() != null && other.getPathMatch().equals(this.getPathMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderMatches() == null) ? 0 : getHeaderMatches().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getPathMatch() == null) ? 0 : getPathMatch().hashCode());
        return hashCode;
    }

    @Override
    public HttpMatch clone() {
        try {
            return (HttpMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.HttpMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
