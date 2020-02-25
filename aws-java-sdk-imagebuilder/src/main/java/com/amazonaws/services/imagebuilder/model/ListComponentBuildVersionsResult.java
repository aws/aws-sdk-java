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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentBuildVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     */
    private java.util.List<ComponentSummary> componentSummaryList;
    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
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

    public ListComponentBuildVersionsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * 
     * @return The list of component summaries for the specified semantic version.
     */

    public java.util.List<ComponentSummary> getComponentSummaryList() {
        return componentSummaryList;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * 
     * @param componentSummaryList
     *        The list of component summaries for the specified semantic version.
     */

    public void setComponentSummaryList(java.util.Collection<ComponentSummary> componentSummaryList) {
        if (componentSummaryList == null) {
            this.componentSummaryList = null;
            return;
        }

        this.componentSummaryList = new java.util.ArrayList<ComponentSummary>(componentSummaryList);
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentSummaryList(java.util.Collection)} or {@link #withComponentSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param componentSummaryList
     *        The list of component summaries for the specified semantic version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentBuildVersionsResult withComponentSummaryList(ComponentSummary... componentSummaryList) {
        if (this.componentSummaryList == null) {
            setComponentSummaryList(new java.util.ArrayList<ComponentSummary>(componentSummaryList.length));
        }
        for (ComponentSummary ele : componentSummaryList) {
            this.componentSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * 
     * @param componentSummaryList
     *        The list of component summaries for the specified semantic version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentBuildVersionsResult withComponentSummaryList(java.util.Collection<ComponentSummary> componentSummaryList) {
        setComponentSummaryList(componentSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty, there are additional elements that
     *        the service has not included in this request. Use this token with the next request to retrieve additional
     *        objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this is not empty, there are additional elements that
     *         the service has not included in this request. Use this token with the next request to retrieve additional
     *         objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty, there are additional elements that
     *        the service has not included in this request. Use this token with the next request to retrieve additional
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentBuildVersionsResult withNextToken(String nextToken) {
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
        if (getComponentSummaryList() != null)
            sb.append("ComponentSummaryList: ").append(getComponentSummaryList()).append(",");
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

        if (obj instanceof ListComponentBuildVersionsResult == false)
            return false;
        ListComponentBuildVersionsResult other = (ListComponentBuildVersionsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getComponentSummaryList() == null ^ this.getComponentSummaryList() == null)
            return false;
        if (other.getComponentSummaryList() != null && other.getComponentSummaryList().equals(this.getComponentSummaryList()) == false)
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
        hashCode = prime * hashCode + ((getComponentSummaryList() == null) ? 0 : getComponentSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentBuildVersionsResult clone() {
        try {
            return (ListComponentBuildVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
