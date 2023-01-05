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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHubContents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHubContentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries of the listed hub content.
     * </p>
     */
    private java.util.List<HubContentInfo> hubContentSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use it in
     * the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summaries of the listed hub content.
     * </p>
     * 
     * @return The summaries of the listed hub content.
     */

    public java.util.List<HubContentInfo> getHubContentSummaries() {
        return hubContentSummaries;
    }

    /**
     * <p>
     * The summaries of the listed hub content.
     * </p>
     * 
     * @param hubContentSummaries
     *        The summaries of the listed hub content.
     */

    public void setHubContentSummaries(java.util.Collection<HubContentInfo> hubContentSummaries) {
        if (hubContentSummaries == null) {
            this.hubContentSummaries = null;
            return;
        }

        this.hubContentSummaries = new java.util.ArrayList<HubContentInfo>(hubContentSummaries);
    }

    /**
     * <p>
     * The summaries of the listed hub content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubContentSummaries(java.util.Collection)} or {@link #withHubContentSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hubContentSummaries
     *        The summaries of the listed hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsResult withHubContentSummaries(HubContentInfo... hubContentSummaries) {
        if (this.hubContentSummaries == null) {
            setHubContentSummaries(new java.util.ArrayList<HubContentInfo>(hubContentSummaries.length));
        }
        for (HubContentInfo ele : hubContentSummaries) {
            this.hubContentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries of the listed hub content.
     * </p>
     * 
     * @param hubContentSummaries
     *        The summaries of the listed hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsResult withHubContentSummaries(java.util.Collection<HubContentInfo> hubContentSummaries) {
        setHubContentSummaries(hubContentSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use
     *        it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use it in
     * the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content, use
     *        it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsResult withNextToken(String nextToken) {
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
        if (getHubContentSummaries() != null)
            sb.append("HubContentSummaries: ").append(getHubContentSummaries()).append(",");
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

        if (obj instanceof ListHubContentsResult == false)
            return false;
        ListHubContentsResult other = (ListHubContentsResult) obj;
        if (other.getHubContentSummaries() == null ^ this.getHubContentSummaries() == null)
            return false;
        if (other.getHubContentSummaries() != null && other.getHubContentSummaries().equals(this.getHubContentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHubContentSummaries() == null) ? 0 : getHubContentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHubContentsResult clone() {
        try {
            return (ListHubContentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
