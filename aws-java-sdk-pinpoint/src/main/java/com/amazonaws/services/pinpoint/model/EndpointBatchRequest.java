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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Endpoint batch update request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointBatchRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointBatchRequest implements Serializable, Cloneable, StructuredPojo {

    /** List of items to update. Maximum 100 items */
    private java.util.List<EndpointBatchItem> item;

    /**
     * List of items to update. Maximum 100 items
     * 
     * @return List of items to update. Maximum 100 items
     */

    public java.util.List<EndpointBatchItem> getItem() {
        return item;
    }

    /**
     * List of items to update. Maximum 100 items
     * 
     * @param item
     *        List of items to update. Maximum 100 items
     */

    public void setItem(java.util.Collection<EndpointBatchItem> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<EndpointBatchItem>(item);
    }

    /**
     * List of items to update. Maximum 100 items
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        List of items to update. Maximum 100 items
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchRequest withItem(EndpointBatchItem... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<EndpointBatchItem>(item.length));
        }
        for (EndpointBatchItem ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * List of items to update. Maximum 100 items
     * 
     * @param item
     *        List of items to update. Maximum 100 items
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchRequest withItem(java.util.Collection<EndpointBatchItem> item) {
        setItem(item);
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointBatchRequest == false)
            return false;
        EndpointBatchRequest other = (EndpointBatchRequest) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public EndpointBatchRequest clone() {
        try {
            return (EndpointBatchRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointBatchRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
