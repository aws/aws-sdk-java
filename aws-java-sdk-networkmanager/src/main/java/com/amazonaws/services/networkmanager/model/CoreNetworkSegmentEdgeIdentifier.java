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
 * Returns details about a core network edge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkSegmentEdgeIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkSegmentEdgeIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The name of the segment edge.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * The Region where the segment edge is located.
     * </p>
     */
    private String edgeLocation;

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

    public CoreNetworkSegmentEdgeIdentifier withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The name of the segment edge.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment edge.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The name of the segment edge.
     * </p>
     * 
     * @return The name of the segment edge.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The name of the segment edge.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegmentEdgeIdentifier withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * The Region where the segment edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the segment edge is located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Region where the segment edge is located.
     * </p>
     * 
     * @return The Region where the segment edge is located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Region where the segment edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the segment edge is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSegmentEdgeIdentifier withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkSegmentEdgeIdentifier == false)
            return false;
        CoreNetworkSegmentEdgeIdentifier other = (CoreNetworkSegmentEdgeIdentifier) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkSegmentEdgeIdentifier clone() {
        try {
            return (CoreNetworkSegmentEdgeIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkSegmentEdgeIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
