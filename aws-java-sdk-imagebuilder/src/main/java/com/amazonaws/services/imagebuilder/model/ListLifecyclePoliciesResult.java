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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecyclePolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLifecyclePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the request.
     * </p>
     */
    private java.util.List<LifecyclePolicySummary> lifecyclePolicySummaryList;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the request.
     * </p>
     * 
     * @return A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the
     *         request.
     */

    public java.util.List<LifecyclePolicySummary> getLifecyclePolicySummaryList() {
        return lifecyclePolicySummaryList;
    }

    /**
     * <p>
     * A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the request.
     * </p>
     * 
     * @param lifecyclePolicySummaryList
     *        A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the
     *        request.
     */

    public void setLifecyclePolicySummaryList(java.util.Collection<LifecyclePolicySummary> lifecyclePolicySummaryList) {
        if (lifecyclePolicySummaryList == null) {
            this.lifecyclePolicySummaryList = null;
            return;
        }

        this.lifecyclePolicySummaryList = new java.util.ArrayList<LifecyclePolicySummary>(lifecyclePolicySummaryList);
    }

    /**
     * <p>
     * A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecyclePolicySummaryList(java.util.Collection)} or
     * {@link #withLifecyclePolicySummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifecyclePolicySummaryList
     *        A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecyclePoliciesResult withLifecyclePolicySummaryList(LifecyclePolicySummary... lifecyclePolicySummaryList) {
        if (this.lifecyclePolicySummaryList == null) {
            setLifecyclePolicySummaryList(new java.util.ArrayList<LifecyclePolicySummary>(lifecyclePolicySummaryList.length));
        }
        for (LifecyclePolicySummary ele : lifecyclePolicySummaryList) {
            this.lifecyclePolicySummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the request.
     * </p>
     * 
     * @param lifecyclePolicySummaryList
     *        A list of lifecycle policies in your Amazon Web Services account that meet the criteria specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecyclePoliciesResult withLifecyclePolicySummaryList(java.util.Collection<LifecyclePolicySummary> lifecyclePolicySummaryList) {
        setLifecyclePolicySummaryList(lifecyclePolicySummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this field isn't empty, there are additional elements
     *         that the service hasn't included in this request. Use this token with the next request to retrieve
     *         additional objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecyclePoliciesResult withNextToken(String nextToken) {
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
        if (getLifecyclePolicySummaryList() != null)
            sb.append("LifecyclePolicySummaryList: ").append(getLifecyclePolicySummaryList()).append(",");
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

        if (obj instanceof ListLifecyclePoliciesResult == false)
            return false;
        ListLifecyclePoliciesResult other = (ListLifecyclePoliciesResult) obj;
        if (other.getLifecyclePolicySummaryList() == null ^ this.getLifecyclePolicySummaryList() == null)
            return false;
        if (other.getLifecyclePolicySummaryList() != null && other.getLifecyclePolicySummaryList().equals(this.getLifecyclePolicySummaryList()) == false)
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

        hashCode = prime * hashCode + ((getLifecyclePolicySummaryList() == null) ? 0 : getLifecyclePolicySummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLifecyclePoliciesResult clone() {
        try {
            return (ListLifecyclePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
