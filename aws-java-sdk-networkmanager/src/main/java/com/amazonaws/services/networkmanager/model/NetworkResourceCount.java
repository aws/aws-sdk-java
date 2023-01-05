/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resource count.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkResourceCount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResourceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource count.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceCount withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource count.
     * </p>
     * 
     * @param count
     *        The resource count.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The resource count.
     * </p>
     * 
     * @return The resource count.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The resource count.
     * </p>
     * 
     * @param count
     *        The resource count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceCount withCount(Integer count) {
        setCount(count);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResourceCount == false)
            return false;
        NetworkResourceCount other = (NetworkResourceCount) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResourceCount clone() {
        try {
            return (NetworkResourceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkResourceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
