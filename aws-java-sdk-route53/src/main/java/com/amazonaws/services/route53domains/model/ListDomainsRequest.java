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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The ListDomains request includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For an initial request for a list of domains, omit this element. If the number of domains that are associated
     * with the current AWS account is greater than the value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional domains. Get the value of <code>NextPageMarker</code> from the previous
     * response, and submit another request that includes the value of <code>NextPageMarker</code> in the
     * <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value specified in the previous request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * For an initial request for a list of domains, omit this element. If the number of domains that are associated
     * with the current AWS account is greater than the value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional domains. Get the value of <code>NextPageMarker</code> from the previous
     * response, and submit another request that includes the value of <code>NextPageMarker</code> in the
     * <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value specified in the previous request.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of domains, omit this element. If the number of domains that are
     *        associated with the current AWS account is greater than the value that you specified for
     *        <code>MaxItems</code>, you can use <code>Marker</code> to return additional domains. Get the value of
     *        <code>NextPageMarker</code> from the previous response, and submit another request that includes the value
     *        of <code>NextPageMarker</code> in the <code>Marker</code> element.</p>
     *        <p>
     *        Constraints: The marker must match the value specified in the previous request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of domains, omit this element. If the number of domains that are associated
     * with the current AWS account is greater than the value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional domains. Get the value of <code>NextPageMarker</code> from the previous
     * response, and submit another request that includes the value of <code>NextPageMarker</code> in the
     * <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value specified in the previous request.
     * </p>
     * 
     * @return For an initial request for a list of domains, omit this element. If the number of domains that are
     *         associated with the current AWS account is greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return additional domains. Get the value of
     *         <code>NextPageMarker</code> from the previous response, and submit another request that includes the
     *         value of <code>NextPageMarker</code> in the <code>Marker</code> element.</p>
     *         <p>
     *         Constraints: The marker must match the value specified in the previous request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For an initial request for a list of domains, omit this element. If the number of domains that are associated
     * with the current AWS account is greater than the value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional domains. Get the value of <code>NextPageMarker</code> from the previous
     * response, and submit another request that includes the value of <code>NextPageMarker</code> in the
     * <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value specified in the previous request.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of domains, omit this element. If the number of domains that are
     *        associated with the current AWS account is greater than the value that you specified for
     *        <code>MaxItems</code>, you can use <code>Marker</code> to return additional domains. Get the value of
     *        <code>NextPageMarker</code> from the previous response, and submit another request that includes the value
     *        of <code>NextPageMarker</code> in the <code>Marker</code> element.</p>
     *        <p>
     *        Constraints: The marker must match the value specified in the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Default: 20
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @return Number of domains to be returned.</p>
     *         <p>
     *         Default: 20
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Default: 20
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsRequest withMaxItems(Integer maxItems) {
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

        if (obj instanceof ListDomainsRequest == false)
            return false;
        ListDomainsRequest other = (ListDomainsRequest) obj;
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainsRequest clone() {
        return (ListDomainsRequest) super.clone();
    }

}
