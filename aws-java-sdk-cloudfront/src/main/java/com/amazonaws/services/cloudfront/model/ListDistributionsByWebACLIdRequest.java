/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * The request to list distributions that are associated with a specified AWS
 * WAF web ACL.
 */
public class ListDistributionsByWebACLIdRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * Use Marker and MaxItems to control pagination of results. If you have
     * more than MaxItems distributions that satisfy the request, the response
     * includes a NextMarker element. To get the next page of results, submit
     * another request. For the value of Marker, specify the value of NextMarker
     * from the last response. (For the first request, omit Marker.)
     */
    private String marker;
    /**
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     */
    private String maxItems;
    /**
     * The Id of the AWS WAF web ACL for which you want to list the associated
     * distributions. If you specify "null" for the Id, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     */
    private String webACLId;

    /**
     * Use Marker and MaxItems to control pagination of results. If you have
     * more than MaxItems distributions that satisfy the request, the response
     * includes a NextMarker element. To get the next page of results, submit
     * another request. For the value of Marker, specify the value of NextMarker
     * from the last response. (For the first request, omit Marker.)
     * 
     * @param marker
     *        Use Marker and MaxItems to control pagination of results. If you
     *        have more than MaxItems distributions that satisfy the request,
     *        the response includes a NextMarker element. To get the next page
     *        of results, submit another request. For the value of Marker,
     *        specify the value of NextMarker from the last response. (For the
     *        first request, omit Marker.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Use Marker and MaxItems to control pagination of results. If you have
     * more than MaxItems distributions that satisfy the request, the response
     * includes a NextMarker element. To get the next page of results, submit
     * another request. For the value of Marker, specify the value of NextMarker
     * from the last response. (For the first request, omit Marker.)
     * 
     * @return Use Marker and MaxItems to control pagination of results. If you
     *         have more than MaxItems distributions that satisfy the request,
     *         the response includes a NextMarker element. To get the next page
     *         of results, submit another request. For the value of Marker,
     *         specify the value of NextMarker from the last response. (For the
     *         first request, omit Marker.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * Use Marker and MaxItems to control pagination of results. If you have
     * more than MaxItems distributions that satisfy the request, the response
     * includes a NextMarker element. To get the next page of results, submit
     * another request. For the value of Marker, specify the value of NextMarker
     * from the last response. (For the first request, omit Marker.)
     * 
     * @param marker
     *        Use Marker and MaxItems to control pagination of results. If you
     *        have more than MaxItems distributions that satisfy the request,
     *        the response includes a NextMarker element. To get the next page
     *        of results, submit another request. For the value of Marker,
     *        specify the value of NextMarker from the last response. (For the
     *        first request, omit Marker.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDistributionsByWebACLIdRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * 
     * @param maxItems
     *        The maximum number of distributions that you want CloudFront to
     *        return in the response body. The maximum and default values are
     *        both 100.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * 
     * @return The maximum number of distributions that you want CloudFront to
     *         return in the response body. The maximum and default values are
     *         both 100.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * 
     * @param maxItems
     *        The maximum number of distributions that you want CloudFront to
     *        return in the response body. The maximum and default values are
     *        both 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDistributionsByWebACLIdRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * The Id of the AWS WAF web ACL for which you want to list the associated
     * distributions. If you specify "null" for the Id, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * 
     * @param webACLId
     *        The Id of the AWS WAF web ACL for which you want to list the
     *        associated distributions. If you specify "null" for the Id, the
     *        request returns a list of the distributions that aren't associated
     *        with a web ACL.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * The Id of the AWS WAF web ACL for which you want to list the associated
     * distributions. If you specify "null" for the Id, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * 
     * @return The Id of the AWS WAF web ACL for which you want to list the
     *         associated distributions. If you specify "null" for the Id, the
     *         request returns a list of the distributions that aren't
     *         associated with a web ACL.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * The Id of the AWS WAF web ACL for which you want to list the associated
     * distributions. If you specify "null" for the Id, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * 
     * @param webACLId
     *        The Id of the AWS WAF web ACL for which you want to list the
     *        associated distributions. If you specify "null" for the Id, the
     *        request returns a list of the distributions that aren't associated
     *        with a web ACL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDistributionsByWebACLIdRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByWebACLIdRequest == false)
            return false;
        ListDistributionsByWebACLIdRequest other = (ListDistributionsByWebACLIdRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null
                && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode
                + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByWebACLIdRequest clone() {
        return (ListDistributionsByWebACLIdRequest) super.clone();
    }
}