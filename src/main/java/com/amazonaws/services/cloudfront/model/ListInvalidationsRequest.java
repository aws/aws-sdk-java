/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#listInvalidations(ListInvalidationsRequest) ListInvalidations operation}.
 * <p>
 * List invalidation batches.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#listInvalidations(ListInvalidationsRequest)
 */
public class ListInvalidationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The distribution's id.
     */
    private String distributionId;

    /**
     * Use this parameter when paginating results to indicate where to begin
     * in your list of invalidation batches. Because the results are returned
     * in decreasing order from most recent to oldest, the most recent
     * results are on the first page, the second page will contain earlier
     * results, and so on. To get the next page of results, set the Marker to
     * the value of the NextMarker from the current page's response. This
     * value is the same as the ID of the last invalidation batch on that
     * page.
     */
    private String marker;

    /**
     * The maximum number of invalidation batches you want in the response
     * body.
     */
    private String maxItems;

    /**
     * Default constructor for a new ListInvalidationsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListInvalidationsRequest() {}
    
    /**
     * Constructs a new ListInvalidationsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param distributionId The distribution's id.
     */
    public ListInvalidationsRequest(String distributionId) {
        setDistributionId(distributionId);
    }

    /**
     * The distribution's id.
     *
     * @return The distribution's id.
     */
    public String getDistributionId() {
        return distributionId;
    }
    
    /**
     * The distribution's id.
     *
     * @param distributionId The distribution's id.
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }
    
    /**
     * The distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionId The distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInvalidationsRequest withDistributionId(String distributionId) {
        this.distributionId = distributionId;
        return this;
    }

    /**
     * Use this parameter when paginating results to indicate where to begin
     * in your list of invalidation batches. Because the results are returned
     * in decreasing order from most recent to oldest, the most recent
     * results are on the first page, the second page will contain earlier
     * results, and so on. To get the next page of results, set the Marker to
     * the value of the NextMarker from the current page's response. This
     * value is the same as the ID of the last invalidation batch on that
     * page.
     *
     * @return Use this parameter when paginating results to indicate where to begin
     *         in your list of invalidation batches. Because the results are returned
     *         in decreasing order from most recent to oldest, the most recent
     *         results are on the first page, the second page will contain earlier
     *         results, and so on. To get the next page of results, set the Marker to
     *         the value of the NextMarker from the current page's response. This
     *         value is the same as the ID of the last invalidation batch on that
     *         page.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter when paginating results to indicate where to begin
     * in your list of invalidation batches. Because the results are returned
     * in decreasing order from most recent to oldest, the most recent
     * results are on the first page, the second page will contain earlier
     * results, and so on. To get the next page of results, set the Marker to
     * the value of the NextMarker from the current page's response. This
     * value is the same as the ID of the last invalidation batch on that
     * page.
     *
     * @param marker Use this parameter when paginating results to indicate where to begin
     *         in your list of invalidation batches. Because the results are returned
     *         in decreasing order from most recent to oldest, the most recent
     *         results are on the first page, the second page will contain earlier
     *         results, and so on. To get the next page of results, set the Marker to
     *         the value of the NextMarker from the current page's response. This
     *         value is the same as the ID of the last invalidation batch on that
     *         page.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter when paginating results to indicate where to begin
     * in your list of invalidation batches. Because the results are returned
     * in decreasing order from most recent to oldest, the most recent
     * results are on the first page, the second page will contain earlier
     * results, and so on. To get the next page of results, set the Marker to
     * the value of the NextMarker from the current page's response. This
     * value is the same as the ID of the last invalidation batch on that
     * page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Use this parameter when paginating results to indicate where to begin
     *         in your list of invalidation batches. Because the results are returned
     *         in decreasing order from most recent to oldest, the most recent
     *         results are on the first page, the second page will contain earlier
     *         results, and so on. To get the next page of results, set the Marker to
     *         the value of the NextMarker from the current page's response. This
     *         value is the same as the ID of the last invalidation batch on that
     *         page.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInvalidationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The maximum number of invalidation batches you want in the response
     * body.
     *
     * @return The maximum number of invalidation batches you want in the response
     *         body.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of invalidation batches you want in the response
     * body.
     *
     * @param maxItems The maximum number of invalidation batches you want in the response
     *         body.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of invalidation batches you want in the response
     * body.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of invalidation batches you want in the response
     *         body.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInvalidationsRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDistributionId() != null) sb.append("DistributionId: " + getDistributionId() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListInvalidationsRequest == false) return false;
        ListInvalidationsRequest other = (ListInvalidationsRequest)obj;
        
        if (other.getDistributionId() == null ^ this.getDistributionId() == null) return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    