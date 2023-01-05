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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMappedResourceConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to provide in your next request, to get another batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @return The name of the stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to provide in your next request, to get another batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token to provide in your next request, to get another batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to provide in your next request, to get another batch of results.
     * </p>
     * 
     * @return The token to provide in your next request, to get another batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to provide in your next request, to get another batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token to provide in your next request, to get another batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationRequest withNextToken(String nextToken) {
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
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

        if (obj instanceof DescribeMappedResourceConfigurationRequest == false)
            return false;
        DescribeMappedResourceConfigurationRequest other = (DescribeMappedResourceConfigurationRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
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

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMappedResourceConfigurationRequest clone() {
        return (DescribeMappedResourceConfigurationRequest) super.clone();
    }

}
