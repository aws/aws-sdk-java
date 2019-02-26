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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to list invalidations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListInvalidations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvalidationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's ID.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches.
     * Because the results are returned in decreasing order from most recent to oldest, the most recent results are on
     * the first page, the second page will contain earlier results, and so on. To get the next page of results, set
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the current page's response. This value is
     * the same as the ID of the last invalidation batch on that page.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of invalidation batches that you want in the response body.
     * </p>
     */
    private String maxItems;

    /**
     * Default constructor for ListInvalidationsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ListInvalidationsRequest() {
    }

    /**
     * Constructs a new ListInvalidationsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param distributionId
     *        The distribution's ID.
     */
    public ListInvalidationsRequest(String distributionId) {
        setDistributionId(distributionId);
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @param distributionId
     *        The distribution's ID.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @return The distribution's ID.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @param distributionId
     *        The distribution's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvalidationsRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches.
     * Because the results are returned in decreasing order from most recent to oldest, the most recent results are on
     * the first page, the second page will contain earlier results, and so on. To get the next page of results, set
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the current page's response. This value is
     * the same as the ID of the last invalidation batch on that page.
     * </p>
     * 
     * @param marker
     *        Use this parameter when paginating results to indicate where to begin in your list of invalidation
     *        batches. Because the results are returned in decreasing order from most recent to oldest, the most recent
     *        results are on the first page, the second page will contain earlier results, and so on. To get the next
     *        page of results, set <code>Marker</code> to the value of the <code>NextMarker</code> from the current
     *        page's response. This value is the same as the ID of the last invalidation batch on that page.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches.
     * Because the results are returned in decreasing order from most recent to oldest, the most recent results are on
     * the first page, the second page will contain earlier results, and so on. To get the next page of results, set
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the current page's response. This value is
     * the same as the ID of the last invalidation batch on that page.
     * </p>
     * 
     * @return Use this parameter when paginating results to indicate where to begin in your list of invalidation
     *         batches. Because the results are returned in decreasing order from most recent to oldest, the most recent
     *         results are on the first page, the second page will contain earlier results, and so on. To get the next
     *         page of results, set <code>Marker</code> to the value of the <code>NextMarker</code> from the current
     *         page's response. This value is the same as the ID of the last invalidation batch on that page.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches.
     * Because the results are returned in decreasing order from most recent to oldest, the most recent results are on
     * the first page, the second page will contain earlier results, and so on. To get the next page of results, set
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the current page's response. This value is
     * the same as the ID of the last invalidation batch on that page.
     * </p>
     * 
     * @param marker
     *        Use this parameter when paginating results to indicate where to begin in your list of invalidation
     *        batches. Because the results are returned in decreasing order from most recent to oldest, the most recent
     *        results are on the first page, the second page will contain earlier results, and so on. To get the next
     *        page of results, set <code>Marker</code> to the value of the <code>NextMarker</code> from the current
     *        page's response. This value is the same as the ID of the last invalidation batch on that page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvalidationsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of invalidation batches that you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of invalidation batches that you want in the response body.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of invalidation batches that you want in the response body.
     * </p>
     * 
     * @return The maximum number of invalidation batches that you want in the response body.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of invalidation batches that you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of invalidation batches that you want in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvalidationsRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvalidationsRequest == false)
            return false;
        ListInvalidationsRequest other = (ListInvalidationsRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
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
    public ListInvalidationsRequest clone() {
        return (ListInvalidationsRequest) super.clone();
    }

}
