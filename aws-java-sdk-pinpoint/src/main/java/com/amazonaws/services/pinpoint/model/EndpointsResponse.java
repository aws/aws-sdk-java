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
 * List of endpoints
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointsResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointsResponse implements Serializable, Cloneable, StructuredPojo {

    /** The list of endpoints. */
    private java.util.List<EndpointResponse> item;

    /**
     * The list of endpoints.
     * 
     * @return The list of endpoints.
     */

    public java.util.List<EndpointResponse> getItem() {
        return item;
    }

    /**
     * The list of endpoints.
     * 
     * @param item
     *        The list of endpoints.
     */

    public void setItem(java.util.Collection<EndpointResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<EndpointResponse>(item);
    }

    /**
     * The list of endpoints.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        The list of endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointsResponse withItem(EndpointResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<EndpointResponse>(item.length));
        }
        for (EndpointResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * The list of endpoints.
     * 
     * @param item
     *        The list of endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointsResponse withItem(java.util.Collection<EndpointResponse> item) {
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

        if (obj instanceof EndpointsResponse == false)
            return false;
        EndpointsResponse other = (EndpointsResponse) obj;
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
    public EndpointsResponse clone() {
        try {
            return (EndpointsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
