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
 * The request to list your streaming distributions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListStreamingDistributions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamingDistributionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @param marker
     *        The value that you provided for the <code>Marker</code> request parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @return The value that you provided for the <code>Marker</code> request parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @param marker
     *        The value that you provided for the <code>Marker</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingDistributionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @param maxItems
     *        The value that you provided for the <code>MaxItems</code> request parameter.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @return The value that you provided for the <code>MaxItems</code> request parameter.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @param maxItems
     *        The value that you provided for the <code>MaxItems</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingDistributionsRequest withMaxItems(String maxItems) {
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

        if (obj instanceof ListStreamingDistributionsRequest == false)
            return false;
        ListStreamingDistributionsRequest other = (ListStreamingDistributionsRequest) obj;
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
    public ListStreamingDistributionsRequest clone() {
        return (ListStreamingDistributionsRequest) super.clone();
    }

}
