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
 * Describes a core network segment, which are dedicated routes. Only attachments within this segment can communicate
 * with each other.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkSegment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkSegment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a core network segment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Regions where the edges are located.
     * </p>
     */
    private java.util.List<String> edgeLocations;
    /**
     * <p>
     * The shared segments of a core network.
     * </p>
     */
    private java.util.List<String> sharedSegments;

    /**
     * <p>
     * The name of a core network segment.
     * </p>
     * 
     * @param name
     *        The name of a core network segment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a core network segment.
     * </p>
     * 
     * @return The name of a core network segment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a core network segment.
     * </p>
     * 
     * @param name
     *        The name of a core network segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Regions where the edges are located.
     * </p>
     * 
     * @return The Regions where the edges are located.
     */

    public java.util.List<String> getEdgeLocations() {
        return edgeLocations;
    }

    /**
     * <p>
     * The Regions where the edges are located.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where the edges are located.
     */

    public void setEdgeLocations(java.util.Collection<String> edgeLocations) {
        if (edgeLocations == null) {
            this.edgeLocations = null;
            return;
        }

        this.edgeLocations = new java.util.ArrayList<String>(edgeLocations);
    }

    /**
     * <p>
     * The Regions where the edges are located.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeLocations(java.util.Collection)} or {@link #withEdgeLocations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where the edges are located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegment withEdgeLocations(String... edgeLocations) {
        if (this.edgeLocations == null) {
            setEdgeLocations(new java.util.ArrayList<String>(edgeLocations.length));
        }
        for (String ele : edgeLocations) {
            this.edgeLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions where the edges are located.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where the edges are located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegment withEdgeLocations(java.util.Collection<String> edgeLocations) {
        setEdgeLocations(edgeLocations);
        return this;
    }

    /**
     * <p>
     * The shared segments of a core network.
     * </p>
     * 
     * @return The shared segments of a core network.
     */

    public java.util.List<String> getSharedSegments() {
        return sharedSegments;
    }

    /**
     * <p>
     * The shared segments of a core network.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments of a core network.
     */

    public void setSharedSegments(java.util.Collection<String> sharedSegments) {
        if (sharedSegments == null) {
            this.sharedSegments = null;
            return;
        }

        this.sharedSegments = new java.util.ArrayList<String>(sharedSegments);
    }

    /**
     * <p>
     * The shared segments of a core network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedSegments(java.util.Collection)} or {@link #withSharedSegments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegment withSharedSegments(String... sharedSegments) {
        if (this.sharedSegments == null) {
            setSharedSegments(new java.util.ArrayList<String>(sharedSegments.length));
        }
        for (String ele : sharedSegments) {
            this.sharedSegments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The shared segments of a core network.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegment withSharedSegments(java.util.Collection<String> sharedSegments) {
        setSharedSegments(sharedSegments);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEdgeLocations() != null)
            sb.append("EdgeLocations: ").append(getEdgeLocations()).append(",");
        if (getSharedSegments() != null)
            sb.append("SharedSegments: ").append(getSharedSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkSegment == false)
            return false;
        CoreNetworkSegment other = (CoreNetworkSegment) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEdgeLocations() == null ^ this.getEdgeLocations() == null)
            return false;
        if (other.getEdgeLocations() != null && other.getEdgeLocations().equals(this.getEdgeLocations()) == false)
            return false;
        if (other.getSharedSegments() == null ^ this.getSharedSegments() == null)
            return false;
        if (other.getSharedSegments() != null && other.getSharedSegments().equals(this.getSharedSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocations() == null) ? 0 : getEdgeLocations().hashCode());
        hashCode = prime * hashCode + ((getSharedSegments() == null) ? 0 : getSharedSegments().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkSegment clone() {
        try {
            return (CoreNetworkSegment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkSegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
