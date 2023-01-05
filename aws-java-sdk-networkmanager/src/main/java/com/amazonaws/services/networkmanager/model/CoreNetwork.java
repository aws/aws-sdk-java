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
 * Describes a core network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetwork implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the global network that your core network is a part of.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN of a core network.
     * </p>
     */
    private String coreNetworkArn;
    /**
     * <p>
     * The description of a core network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp when a core network was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The current state of a core network.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The segments within a core network.
     * </p>
     */
    private java.util.List<CoreNetworkSegment> segments;
    /**
     * <p>
     * The edges within a core network.
     * </p>
     */
    private java.util.List<CoreNetworkEdge> edges;
    /**
     * <p>
     * The list of key-value tags associated with a core network.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the global network that your core network is a part of.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network that your core network is a part of.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network that your core network is a part of.
     * </p>
     * 
     * @return The ID of the global network that your core network is a part of.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network that your core network is a part of.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network that your core network is a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     */

    public void setCoreNetworkArn(String coreNetworkArn) {
        this.coreNetworkArn = coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @return The ARN of a core network.
     */

    public String getCoreNetworkArn() {
        return this.coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withCoreNetworkArn(String coreNetworkArn) {
        setCoreNetworkArn(coreNetworkArn);
        return this;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @return The description of a core network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp when a core network was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when a core network was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when a core network was created.
     * </p>
     * 
     * @return The timestamp when a core network was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when a core network was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when a core network was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The current state of a core network.
     * </p>
     * 
     * @param state
     *        The current state of a core network.
     * @see CoreNetworkState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of a core network.
     * </p>
     * 
     * @return The current state of a core network.
     * @see CoreNetworkState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of a core network.
     * </p>
     * 
     * @param state
     *        The current state of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkState
     */

    public CoreNetwork withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of a core network.
     * </p>
     * 
     * @param state
     *        The current state of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkState
     */

    public CoreNetwork withState(CoreNetworkState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The segments within a core network.
     * </p>
     * 
     * @return The segments within a core network.
     */

    public java.util.List<CoreNetworkSegment> getSegments() {
        return segments;
    }

    /**
     * <p>
     * The segments within a core network.
     * </p>
     * 
     * @param segments
     *        The segments within a core network.
     */

    public void setSegments(java.util.Collection<CoreNetworkSegment> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<CoreNetworkSegment>(segments);
    }

    /**
     * <p>
     * The segments within a core network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegments(java.util.Collection)} or {@link #withSegments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param segments
     *        The segments within a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withSegments(CoreNetworkSegment... segments) {
        if (this.segments == null) {
            setSegments(new java.util.ArrayList<CoreNetworkSegment>(segments.length));
        }
        for (CoreNetworkSegment ele : segments) {
            this.segments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The segments within a core network.
     * </p>
     * 
     * @param segments
     *        The segments within a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withSegments(java.util.Collection<CoreNetworkSegment> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * The edges within a core network.
     * </p>
     * 
     * @return The edges within a core network.
     */

    public java.util.List<CoreNetworkEdge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * The edges within a core network.
     * </p>
     * 
     * @param edges
     *        The edges within a core network.
     */

    public void setEdges(java.util.Collection<CoreNetworkEdge> edges) {
        if (edges == null) {
            this.edges = null;
            return;
        }

        this.edges = new java.util.ArrayList<CoreNetworkEdge>(edges);
    }

    /**
     * <p>
     * The edges within a core network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdges(java.util.Collection)} or {@link #withEdges(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param edges
     *        The edges within a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withEdges(CoreNetworkEdge... edges) {
        if (this.edges == null) {
            setEdges(new java.util.ArrayList<CoreNetworkEdge>(edges.length));
        }
        for (CoreNetworkEdge ele : edges) {
            this.edges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The edges within a core network.
     * </p>
     * 
     * @param edges
     *        The edges within a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withEdges(java.util.Collection<CoreNetworkEdge> edges) {
        setEdges(edges);
        return this;
    }

    /**
     * <p>
     * The list of key-value tags associated with a core network.
     * </p>
     * 
     * @return The list of key-value tags associated with a core network.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value tags associated with a core network.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with a core network.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of key-value tags associated with a core network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of key-value tags associated with a core network.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetwork withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getCoreNetworkArn() != null)
            sb.append("CoreNetworkArn: ").append(getCoreNetworkArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSegments() != null)
            sb.append("Segments: ").append(getSegments()).append(",");
        if (getEdges() != null)
            sb.append("Edges: ").append(getEdges()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetwork == false)
            return false;
        CoreNetwork other = (CoreNetwork) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getCoreNetworkArn() == null ^ this.getCoreNetworkArn() == null)
            return false;
        if (other.getCoreNetworkArn() != null && other.getCoreNetworkArn().equals(this.getCoreNetworkArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkArn() == null) ? 0 : getCoreNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetwork clone() {
        try {
            return (CoreNetwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
