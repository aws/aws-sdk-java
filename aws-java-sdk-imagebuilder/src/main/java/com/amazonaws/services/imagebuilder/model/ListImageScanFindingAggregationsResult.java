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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageScanFindingAggregations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImageScanFindingAggregationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The aggregation type specifies what type of key is used to group the image scan findings. Image Builder returns
     * results based on the request filter. If you didn't specify a filter in the request, the type defaults to
     * <code>accountId</code>.
     * </p>
     * <p class="title">
     * <b>Aggregation types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * imageBuildVersionArn
     * </p>
     * </li>
     * <li>
     * <p>
     * imagePipelineArn
     * </p>
     * </li>
     * <li>
     * <p>
     * vulnerabilityId
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each aggregation includes counts by severity level for medium severity and higher level findings, plus a total
     * for all of the findings for each key value.
     * </p>
     */
    private String aggregationType;
    /**
     * <p>
     * An array of image scan finding aggregations that match the filter criteria.
     * </p>
     */
    private java.util.List<ImageScanFindingAggregation> responses;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
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

    public ListImageScanFindingAggregationsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The aggregation type specifies what type of key is used to group the image scan findings. Image Builder returns
     * results based on the request filter. If you didn't specify a filter in the request, the type defaults to
     * <code>accountId</code>.
     * </p>
     * <p class="title">
     * <b>Aggregation types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * imageBuildVersionArn
     * </p>
     * </li>
     * <li>
     * <p>
     * imagePipelineArn
     * </p>
     * </li>
     * <li>
     * <p>
     * vulnerabilityId
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each aggregation includes counts by severity level for medium severity and higher level findings, plus a total
     * for all of the findings for each key value.
     * </p>
     * 
     * @param aggregationType
     *        The aggregation type specifies what type of key is used to group the image scan findings. Image Builder
     *        returns results based on the request filter. If you didn't specify a filter in the request, the type
     *        defaults to <code>accountId</code>.</p>
     *        <p class="title">
     *        <b>Aggregation types</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        imageBuildVersionArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        imagePipelineArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        vulnerabilityId
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each aggregation includes counts by severity level for medium severity and higher level findings, plus a
     *        total for all of the findings for each key value.
     */

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * The aggregation type specifies what type of key is used to group the image scan findings. Image Builder returns
     * results based on the request filter. If you didn't specify a filter in the request, the type defaults to
     * <code>accountId</code>.
     * </p>
     * <p class="title">
     * <b>Aggregation types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * imageBuildVersionArn
     * </p>
     * </li>
     * <li>
     * <p>
     * imagePipelineArn
     * </p>
     * </li>
     * <li>
     * <p>
     * vulnerabilityId
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each aggregation includes counts by severity level for medium severity and higher level findings, plus a total
     * for all of the findings for each key value.
     * </p>
     * 
     * @return The aggregation type specifies what type of key is used to group the image scan findings. Image Builder
     *         returns results based on the request filter. If you didn't specify a filter in the request, the type
     *         defaults to <code>accountId</code>.</p>
     *         <p class="title">
     *         <b>Aggregation types</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         accountId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         imageBuildVersionArn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         imagePipelineArn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         vulnerabilityId
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Each aggregation includes counts by severity level for medium severity and higher level findings, plus a
     *         total for all of the findings for each key value.
     */

    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * <p>
     * The aggregation type specifies what type of key is used to group the image scan findings. Image Builder returns
     * results based on the request filter. If you didn't specify a filter in the request, the type defaults to
     * <code>accountId</code>.
     * </p>
     * <p class="title">
     * <b>Aggregation types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * imageBuildVersionArn
     * </p>
     * </li>
     * <li>
     * <p>
     * imagePipelineArn
     * </p>
     * </li>
     * <li>
     * <p>
     * vulnerabilityId
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each aggregation includes counts by severity level for medium severity and higher level findings, plus a total
     * for all of the findings for each key value.
     * </p>
     * 
     * @param aggregationType
     *        The aggregation type specifies what type of key is used to group the image scan findings. Image Builder
     *        returns results based on the request filter. If you didn't specify a filter in the request, the type
     *        defaults to <code>accountId</code>.</p>
     *        <p class="title">
     *        <b>Aggregation types</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        imageBuildVersionArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        imagePipelineArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        vulnerabilityId
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each aggregation includes counts by severity level for medium severity and higher level findings, plus a
     *        total for all of the findings for each key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingAggregationsResult withAggregationType(String aggregationType) {
        setAggregationType(aggregationType);
        return this;
    }

    /**
     * <p>
     * An array of image scan finding aggregations that match the filter criteria.
     * </p>
     * 
     * @return An array of image scan finding aggregations that match the filter criteria.
     */

    public java.util.List<ImageScanFindingAggregation> getResponses() {
        return responses;
    }

    /**
     * <p>
     * An array of image scan finding aggregations that match the filter criteria.
     * </p>
     * 
     * @param responses
     *        An array of image scan finding aggregations that match the filter criteria.
     */

    public void setResponses(java.util.Collection<ImageScanFindingAggregation> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<ImageScanFindingAggregation>(responses);
    }

    /**
     * <p>
     * An array of image scan finding aggregations that match the filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponses(java.util.Collection)} or {@link #withResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param responses
     *        An array of image scan finding aggregations that match the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingAggregationsResult withResponses(ImageScanFindingAggregation... responses) {
        if (this.responses == null) {
            setResponses(new java.util.ArrayList<ImageScanFindingAggregation>(responses.length));
        }
        for (ImageScanFindingAggregation ele : responses) {
            this.responses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of image scan finding aggregations that match the filter criteria.
     * </p>
     * 
     * @param responses
     *        An array of image scan finding aggregations that match the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageScanFindingAggregationsResult withResponses(java.util.Collection<ImageScanFindingAggregation> responses) {
        setResponses(responses);
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

    public ListImageScanFindingAggregationsResult withNextToken(String nextToken) {
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
        if (getAggregationType() != null)
            sb.append("AggregationType: ").append(getAggregationType()).append(",");
        if (getResponses() != null)
            sb.append("Responses: ").append(getResponses()).append(",");
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

        if (obj instanceof ListImageScanFindingAggregationsResult == false)
            return false;
        ListImageScanFindingAggregationsResult other = (ListImageScanFindingAggregationsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false)
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
        hashCode = prime * hashCode + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImageScanFindingAggregationsResult clone() {
        try {
            return (ListImageScanFindingAggregationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
