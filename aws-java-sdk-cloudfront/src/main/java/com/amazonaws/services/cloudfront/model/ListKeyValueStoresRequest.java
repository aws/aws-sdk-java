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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyValueStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeyValueStoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The marker associated with the key value stores list.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of items in the key value stores list.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * The status of the request for the key value stores list.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The marker associated with the key value stores list.
     * </p>
     * 
     * @param marker
     *        The marker associated with the key value stores list.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker associated with the key value stores list.
     * </p>
     * 
     * @return The marker associated with the key value stores list.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker associated with the key value stores list.
     * </p>
     * 
     * @param marker
     *        The marker associated with the key value stores list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyValueStoresRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of items in the key value stores list.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items in the key value stores list.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items in the key value stores list.
     * </p>
     * 
     * @return The maximum number of items in the key value stores list.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items in the key value stores list.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items in the key value stores list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyValueStoresRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The status of the request for the key value stores list.
     * </p>
     * 
     * @param status
     *        The status of the request for the key value stores list.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request for the key value stores list.
     * </p>
     * 
     * @return The status of the request for the key value stores list.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the request for the key value stores list.
     * </p>
     * 
     * @param status
     *        The status of the request for the key value stores list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyValueStoresRequest withStatus(String status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyValueStoresRequest == false)
            return false;
        ListKeyValueStoresRequest other = (ListKeyValueStoresRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListKeyValueStoresRequest clone() {
        return (ListKeyValueStoresRequest) super.clone();
    }

}
