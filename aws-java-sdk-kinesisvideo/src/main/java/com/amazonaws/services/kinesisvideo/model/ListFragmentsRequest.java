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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFragmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     * <code>StreamARN</code> parameter.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     * parameter or the <code>StreamName</code> parameter.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments available is more than the value
     * specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the output that
     * you can use to resume pagination.
     * </p>
     */
    private Long maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a previously
     * truncated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Describes the timestamp range and timestamp origin for the range of fragments to return.
     * </p>
     */
    private FragmentSelector fragmentSelector;

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     * <code>StreamARN</code> parameter.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     *        <code>StreamARN</code> parameter.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     * <code>StreamARN</code> parameter.
     * </p>
     * 
     * @return The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     *         <code>StreamARN</code> parameter.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     * <code>StreamARN</code> parameter.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve a fragment list. Specify either this parameter or the
     *        <code>StreamARN</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     * parameter or the <code>StreamName</code> parameter.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     *        parameter or the <code>StreamName</code> parameter.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     * parameter or the <code>StreamName</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     *         parameter or the <code>StreamName</code> parameter.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     * parameter or the <code>StreamName</code> parameter.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this
     *        parameter or the <code>StreamName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments available is more than the value
     * specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the output that
     * you can use to resume pagination.
     * </p>
     * 
     * @param maxResults
     *        The total number of fragments to return. If the total number of fragments available is more than the value
     *        specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the
     *        output that you can use to resume pagination.
     */

    public void setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments available is more than the value
     * specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the output that
     * you can use to resume pagination.
     * </p>
     * 
     * @return The total number of fragments to return. If the total number of fragments available is more than the
     *         value specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in
     *         the output that you can use to resume pagination.
     */

    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments available is more than the value
     * specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the output that
     * you can use to resume pagination.
     * </p>
     * 
     * @param maxResults
     *        The total number of fragments to return. If the total number of fragments available is more than the value
     *        specified in <code>max-results</code>, then a <a>ListFragmentsOutput$NextToken</a> is provided in the
     *        output that you can use to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsRequest withMaxResults(Long maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a previously
     * truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a
     *        previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a previously
     * truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a
     *         previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a previously
     * truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the <a>ListFragmentsOutput$NextToken</a> from a
     *        previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin for the range of fragments to return.
     * </p>
     * 
     * @param fragmentSelector
     *        Describes the timestamp range and timestamp origin for the range of fragments to return.
     */

    public void setFragmentSelector(FragmentSelector fragmentSelector) {
        this.fragmentSelector = fragmentSelector;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin for the range of fragments to return.
     * </p>
     * 
     * @return Describes the timestamp range and timestamp origin for the range of fragments to return.
     */

    public FragmentSelector getFragmentSelector() {
        return this.fragmentSelector;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin for the range of fragments to return.
     * </p>
     * 
     * @param fragmentSelector
     *        Describes the timestamp range and timestamp origin for the range of fragments to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsRequest withFragmentSelector(FragmentSelector fragmentSelector) {
        setFragmentSelector(fragmentSelector);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFragmentSelector() != null)
            sb.append("FragmentSelector: ").append(getFragmentSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFragmentsRequest == false)
            return false;
        ListFragmentsRequest other = (ListFragmentsRequest) obj;
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
        if (other.getFragmentSelector() == null ^ this.getFragmentSelector() == null)
            return false;
        if (other.getFragmentSelector() != null && other.getFragmentSelector().equals(this.getFragmentSelector()) == false)
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
        hashCode = prime * hashCode + ((getFragmentSelector() == null) ? 0 : getFragmentSelector().hashCode());
        return hashCode;
    }

    @Override
    public ListFragmentsRequest clone() {
        return (ListFragmentsRequest) super.clone();
    }

}
