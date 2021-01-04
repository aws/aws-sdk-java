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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListContainerRecipes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainerRecipesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The list of container recipes returned for the request.
     * </p>
     */
    private java.util.List<ContainerRecipeSummary> containerRecipeSummaryList;
    /**
     * <p>
     * The next token field is used for paginated responses. When this is not empty, there are additional container
     * recipes that the service has not included in this response. Use this token with the next request to retrieve
     * additional list items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The list of container recipes returned for the request.
     * </p>
     * 
     * @return The list of container recipes returned for the request.
     */

    public java.util.List<ContainerRecipeSummary> getContainerRecipeSummaryList() {
        return containerRecipeSummaryList;
    }

    /**
     * <p>
     * The list of container recipes returned for the request.
     * </p>
     * 
     * @param containerRecipeSummaryList
     *        The list of container recipes returned for the request.
     */

    public void setContainerRecipeSummaryList(java.util.Collection<ContainerRecipeSummary> containerRecipeSummaryList) {
        if (containerRecipeSummaryList == null) {
            this.containerRecipeSummaryList = null;
            return;
        }

        this.containerRecipeSummaryList = new java.util.ArrayList<ContainerRecipeSummary>(containerRecipeSummaryList);
    }

    /**
     * <p>
     * The list of container recipes returned for the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerRecipeSummaryList(java.util.Collection)} or
     * {@link #withContainerRecipeSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerRecipeSummaryList
     *        The list of container recipes returned for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesResult withContainerRecipeSummaryList(ContainerRecipeSummary... containerRecipeSummaryList) {
        if (this.containerRecipeSummaryList == null) {
            setContainerRecipeSummaryList(new java.util.ArrayList<ContainerRecipeSummary>(containerRecipeSummaryList.length));
        }
        for (ContainerRecipeSummary ele : containerRecipeSummaryList) {
            this.containerRecipeSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of container recipes returned for the request.
     * </p>
     * 
     * @param containerRecipeSummaryList
     *        The list of container recipes returned for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesResult withContainerRecipeSummaryList(java.util.Collection<ContainerRecipeSummary> containerRecipeSummaryList) {
        setContainerRecipeSummaryList(containerRecipeSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token field is used for paginated responses. When this is not empty, there are additional container
     * recipes that the service has not included in this response. Use this token with the next request to retrieve
     * additional list items.
     * </p>
     * 
     * @param nextToken
     *        The next token field is used for paginated responses. When this is not empty, there are additional
     *        container recipes that the service has not included in this response. Use this token with the next request
     *        to retrieve additional list items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token field is used for paginated responses. When this is not empty, there are additional container
     * recipes that the service has not included in this response. Use this token with the next request to retrieve
     * additional list items.
     * </p>
     * 
     * @return The next token field is used for paginated responses. When this is not empty, there are additional
     *         container recipes that the service has not included in this response. Use this token with the next
     *         request to retrieve additional list items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token field is used for paginated responses. When this is not empty, there are additional container
     * recipes that the service has not included in this response. Use this token with the next request to retrieve
     * additional list items.
     * </p>
     * 
     * @param nextToken
     *        The next token field is used for paginated responses. When this is not empty, there are additional
     *        container recipes that the service has not included in this response. Use this token with the next request
     *        to retrieve additional list items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesResult withNextToken(String nextToken) {
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getContainerRecipeSummaryList() != null)
            sb.append("ContainerRecipeSummaryList: ").append(getContainerRecipeSummaryList()).append(",");
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

        if (obj instanceof ListContainerRecipesResult == false)
            return false;
        ListContainerRecipesResult other = (ListContainerRecipesResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getContainerRecipeSummaryList() == null ^ this.getContainerRecipeSummaryList() == null)
            return false;
        if (other.getContainerRecipeSummaryList() != null && other.getContainerRecipeSummaryList().equals(this.getContainerRecipeSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getContainerRecipeSummaryList() == null) ? 0 : getContainerRecipeSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContainerRecipesResult clone() {
        try {
            return (ListContainerRecipesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
