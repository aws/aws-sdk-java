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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHubs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHubsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries of the listed hubs.
     * </p>
     */
    private java.util.List<HubInfo> hubSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in the
     * subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summaries of the listed hubs.
     * </p>
     * 
     * @return The summaries of the listed hubs.
     */

    public java.util.List<HubInfo> getHubSummaries() {
        return hubSummaries;
    }

    /**
     * <p>
     * The summaries of the listed hubs.
     * </p>
     * 
     * @param hubSummaries
     *        The summaries of the listed hubs.
     */

    public void setHubSummaries(java.util.Collection<HubInfo> hubSummaries) {
        if (hubSummaries == null) {
            this.hubSummaries = null;
            return;
        }

        this.hubSummaries = new java.util.ArrayList<HubInfo>(hubSummaries);
    }

    /**
     * <p>
     * The summaries of the listed hubs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubSummaries(java.util.Collection)} or {@link #withHubSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hubSummaries
     *        The summaries of the listed hubs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsResult withHubSummaries(HubInfo... hubSummaries) {
        if (this.hubSummaries == null) {
            setHubSummaries(new java.util.ArrayList<HubInfo>(hubSummaries.length));
        }
        for (HubInfo ele : hubSummaries) {
            this.hubSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries of the listed hubs.
     * </p>
     * 
     * @param hubSummaries
     *        The summaries of the listed hubs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsResult withHubSummaries(java.util.Collection<HubInfo> hubSummaries) {
        setHubSummaries(hubSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in
     *        the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in the
     * subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in
     *         the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in
     *        the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsResult withNextToken(String nextToken) {
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
        if (getHubSummaries() != null)
            sb.append("HubSummaries: ").append(getHubSummaries()).append(",");
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

        if (obj instanceof ListHubsResult == false)
            return false;
        ListHubsResult other = (ListHubsResult) obj;
        if (other.getHubSummaries() == null ^ this.getHubSummaries() == null)
            return false;
        if (other.getHubSummaries() != null && other.getHubSummaries().equals(this.getHubSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHubSummaries() == null) ? 0 : getHubSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHubsResult clone() {
        try {
            return (ListHubsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
