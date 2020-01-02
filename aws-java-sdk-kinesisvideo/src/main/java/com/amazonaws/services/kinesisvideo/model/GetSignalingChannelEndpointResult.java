/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSignalingChannelEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     */
    private java.util.List<ResourceEndpointListItem> resourceEndpointList;

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * 
     * @return A list of endpoints for the specified signaling channel.
     */

    public java.util.List<ResourceEndpointListItem> getResourceEndpointList() {
        return resourceEndpointList;
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * 
     * @param resourceEndpointList
     *        A list of endpoints for the specified signaling channel.
     */

    public void setResourceEndpointList(java.util.Collection<ResourceEndpointListItem> resourceEndpointList) {
        if (resourceEndpointList == null) {
            this.resourceEndpointList = null;
            return;
        }

        this.resourceEndpointList = new java.util.ArrayList<ResourceEndpointListItem>(resourceEndpointList);
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceEndpointList(java.util.Collection)} or {@link #withResourceEndpointList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceEndpointList
     *        A list of endpoints for the specified signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSignalingChannelEndpointResult withResourceEndpointList(ResourceEndpointListItem... resourceEndpointList) {
        if (this.resourceEndpointList == null) {
            setResourceEndpointList(new java.util.ArrayList<ResourceEndpointListItem>(resourceEndpointList.length));
        }
        for (ResourceEndpointListItem ele : resourceEndpointList) {
            this.resourceEndpointList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * 
     * @param resourceEndpointList
     *        A list of endpoints for the specified signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSignalingChannelEndpointResult withResourceEndpointList(java.util.Collection<ResourceEndpointListItem> resourceEndpointList) {
        setResourceEndpointList(resourceEndpointList);
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
        if (getResourceEndpointList() != null)
            sb.append("ResourceEndpointList: ").append(getResourceEndpointList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSignalingChannelEndpointResult == false)
            return false;
        GetSignalingChannelEndpointResult other = (GetSignalingChannelEndpointResult) obj;
        if (other.getResourceEndpointList() == null ^ this.getResourceEndpointList() == null)
            return false;
        if (other.getResourceEndpointList() != null && other.getResourceEndpointList().equals(this.getResourceEndpointList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceEndpointList() == null) ? 0 : getResourceEndpointList().hashCode());
        return hashCode;
    }

    @Override
    public GetSignalingChannelEndpointResult clone() {
        try {
            return (GetSignalingChannelEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
