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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListExtensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExtensionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The extension name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @param name
     *        The extension name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @return The extension name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @param name
     *        The extension name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionsRequest withName(String name) {
        setName(name);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExtensionsRequest == false)
            return false;
        ListExtensionsRequest other = (ListExtensionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ListExtensionsRequest clone() {
        return (ListExtensionsRequest) super.clone();
    }

}
