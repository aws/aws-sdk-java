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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListAllowedRepositoriesForGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAllowedRepositoriesForGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of allowed repositories for the package group and origin configuration restriction type.
     * </p>
     */
    private java.util.List<String> allowedRepositories;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of allowed repositories for the package group and origin configuration restriction type.
     * </p>
     * 
     * @return The list of allowed repositories for the package group and origin configuration restriction type.
     */

    public java.util.List<String> getAllowedRepositories() {
        return allowedRepositories;
    }

    /**
     * <p>
     * The list of allowed repositories for the package group and origin configuration restriction type.
     * </p>
     * 
     * @param allowedRepositories
     *        The list of allowed repositories for the package group and origin configuration restriction type.
     */

    public void setAllowedRepositories(java.util.Collection<String> allowedRepositories) {
        if (allowedRepositories == null) {
            this.allowedRepositories = null;
            return;
        }

        this.allowedRepositories = new java.util.ArrayList<String>(allowedRepositories);
    }

    /**
     * <p>
     * The list of allowed repositories for the package group and origin configuration restriction type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedRepositories(java.util.Collection)} or {@link #withAllowedRepositories(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedRepositories
     *        The list of allowed repositories for the package group and origin configuration restriction type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedRepositoriesForGroupResult withAllowedRepositories(String... allowedRepositories) {
        if (this.allowedRepositories == null) {
            setAllowedRepositories(new java.util.ArrayList<String>(allowedRepositories.length));
        }
        for (String ele : allowedRepositories) {
            this.allowedRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of allowed repositories for the package group and origin configuration restriction type.
     * </p>
     * 
     * @param allowedRepositories
     *        The list of allowed repositories for the package group and origin configuration restriction type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedRepositoriesForGroupResult withAllowedRepositories(java.util.Collection<String> allowedRepositories) {
        setAllowedRepositories(allowedRepositories);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedRepositoriesForGroupResult withNextToken(String nextToken) {
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
        if (getAllowedRepositories() != null)
            sb.append("AllowedRepositories: ").append(getAllowedRepositories()).append(",");
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

        if (obj instanceof ListAllowedRepositoriesForGroupResult == false)
            return false;
        ListAllowedRepositoriesForGroupResult other = (ListAllowedRepositoriesForGroupResult) obj;
        if (other.getAllowedRepositories() == null ^ this.getAllowedRepositories() == null)
            return false;
        if (other.getAllowedRepositories() != null && other.getAllowedRepositories().equals(this.getAllowedRepositories()) == false)
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

        hashCode = prime * hashCode + ((getAllowedRepositories() == null) ? 0 : getAllowedRepositories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAllowedRepositoriesForGroupResult clone() {
        try {
            return (ListAllowedRepositoriesForGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
