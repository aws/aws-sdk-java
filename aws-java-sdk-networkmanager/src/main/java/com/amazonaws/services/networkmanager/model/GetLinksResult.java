/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLinksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The links.
     * </p>
     */
    private java.util.List<Link> links;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The links.
     * </p>
     * 
     * @return The links.
     */

    public java.util.List<Link> getLinks() {
        return links;
    }

    /**
     * <p>
     * The links.
     * </p>
     * 
     * @param links
     *        The links.
     */

    public void setLinks(java.util.Collection<Link> links) {
        if (links == null) {
            this.links = null;
            return;
        }

        this.links = new java.util.ArrayList<Link>(links);
    }

    /**
     * <p>
     * The links.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinks(java.util.Collection)} or {@link #withLinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param links
     *        The links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinksResult withLinks(Link... links) {
        if (this.links == null) {
            setLinks(new java.util.ArrayList<Link>(links.length));
        }
        for (Link ele : links) {
            this.links.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The links.
     * </p>
     * 
     * @param links
     *        The links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinksResult withLinks(java.util.Collection<Link> links) {
        setLinks(links);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLinks() != null)
            sb.append("Links: ").append(getLinks()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLinksResult == false)
            return false;
        GetLinksResult other = (GetLinksResult) obj;
        if (other.getLinks() == null ^ this.getLinks() == null)
            return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLinksResult clone() {
        try {
            return (GetLinksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
