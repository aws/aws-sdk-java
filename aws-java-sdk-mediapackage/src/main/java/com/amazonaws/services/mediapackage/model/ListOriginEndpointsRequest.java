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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOriginEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** When specified, the request will return only OriginEndpoints associated with the given Channel ID. */
    private String channelId;
    /** The upper bound on the number of records to return. */
    private Integer maxResults;
    /** A token used to resume pagination from the end of a previous request. */
    private String nextToken;

    /**
     * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     * 
     * @param channelId
     *        When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     * 
     * @return When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     * 
     * @param channelId
     *        When specified, the request will return only OriginEndpoints associated with the given Channel ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @param maxResults
     *        The upper bound on the number of records to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @return The upper bound on the number of records to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @param maxResults
     *        The upper bound on the number of records to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @return A token used to resume pagination from the end of a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsRequest withNextToken(String nextToken) {
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListOriginEndpointsRequest == false)
            return false;
        ListOriginEndpointsRequest other = (ListOriginEndpointsRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOriginEndpointsRequest clone() {
        return (ListOriginEndpointsRequest) super.clone();
    }

}
