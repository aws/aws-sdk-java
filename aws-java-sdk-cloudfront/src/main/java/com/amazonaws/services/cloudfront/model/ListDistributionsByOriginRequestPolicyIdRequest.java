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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByOriginRequestPolicyId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByOriginRequestPolicyIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response
     * includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this
     * field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of distribution IDs that you want in the response.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * The ID of the origin request policy whose associated distribution IDs you want to list.
     * </p>
     */
    private String originRequestPolicyId;

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response
     * includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this
     * field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in your list of distribution IDs. The
     *        response includes distribution IDs in the list that occur after the marker. To get the next page of the
     *        list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response
     * includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this
     * field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @return Use this field when paginating results to indicate where to begin in your list of distribution IDs. The
     *         response includes distribution IDs in the list that occur after the marker. To get the next page of the
     *         list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response
     * includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this
     * field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in your list of distribution IDs. The
     *        response includes distribution IDs in the list that occur after the marker. To get the next page of the
     *        list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByOriginRequestPolicyIdRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of distribution IDs that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distribution IDs that you want in the response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of distribution IDs that you want in the response.
     * </p>
     * 
     * @return The maximum number of distribution IDs that you want in the response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of distribution IDs that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distribution IDs that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByOriginRequestPolicyIdRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The ID of the origin request policy whose associated distribution IDs you want to list.
     * </p>
     * 
     * @param originRequestPolicyId
     *        The ID of the origin request policy whose associated distribution IDs you want to list.
     */

    public void setOriginRequestPolicyId(String originRequestPolicyId) {
        this.originRequestPolicyId = originRequestPolicyId;
    }

    /**
     * <p>
     * The ID of the origin request policy whose associated distribution IDs you want to list.
     * </p>
     * 
     * @return The ID of the origin request policy whose associated distribution IDs you want to list.
     */

    public String getOriginRequestPolicyId() {
        return this.originRequestPolicyId;
    }

    /**
     * <p>
     * The ID of the origin request policy whose associated distribution IDs you want to list.
     * </p>
     * 
     * @param originRequestPolicyId
     *        The ID of the origin request policy whose associated distribution IDs you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByOriginRequestPolicyIdRequest withOriginRequestPolicyId(String originRequestPolicyId) {
        setOriginRequestPolicyId(originRequestPolicyId);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getOriginRequestPolicyId() != null)
            sb.append("OriginRequestPolicyId: ").append(getOriginRequestPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByOriginRequestPolicyIdRequest == false)
            return false;
        ListDistributionsByOriginRequestPolicyIdRequest other = (ListDistributionsByOriginRequestPolicyIdRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getOriginRequestPolicyId() == null ^ this.getOriginRequestPolicyId() == null)
            return false;
        if (other.getOriginRequestPolicyId() != null && other.getOriginRequestPolicyId().equals(this.getOriginRequestPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getOriginRequestPolicyId() == null) ? 0 : getOriginRequestPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByOriginRequestPolicyIdRequest clone() {
        return (ListDistributionsByOriginRequestPolicyIdRequest) super.clone();
    }

}
