/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The ListOperations request includes the following elements.
 * </p>
 */
public class ListOperationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Constraints: A value between 1 and 100.
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of operations, omit this element. If the number of operations that are
     *        not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return For an initial request for a list of operations, omit this element. If the number of operations that are
     *         not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *         <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from
     *         the previous response, and submit another request that includes the value of <code>NextPageMarker</code>
     *         in the <code>Marker</code> element.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of operations, omit this element. If the number of operations that are
     *        not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Constraints: A value between 1 and 100.
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 20
     *        </p>
     *        <p>
     *        Constraints: A value between 1 and 100.
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Constraints: A value between 1 and 100.
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Number of domains to be returned.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Default: 20
     *         </p>
     *         <p>
     *         Constraints: A value between 1 and 100.
     *         </p>
     *         <p>
     *         Required: No
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Constraints: A value between 1 and 100.
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 20
     *        </p>
     *        <p>
     *        Constraints: A value between 1 and 100.
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOperationsRequest == false)
            return false;
        ListOperationsRequest other = (ListOperationsRequest) obj;
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
    public ListOperationsRequest clone() {
        return (ListOperationsRequest) super.clone();
    }
}
