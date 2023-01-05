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
 * Describes a core network change event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkChangeEventValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeEventValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The edge location for the core network change event.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The segment name if the change event is associated with a segment.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * The ID of the attachment if the change event is associated with an attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * For a <code>STATIC_ROUTE</code> event, this is the IP address.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The edge location for the core network change event.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the core network change event.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The edge location for the core network change event.
     * </p>
     * 
     * @return The edge location for the core network change event.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The edge location for the core network change event.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the core network change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEventValues withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The segment name if the change event is associated with a segment.
     * </p>
     * 
     * @param segmentName
     *        The segment name if the change event is associated with a segment.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The segment name if the change event is associated with a segment.
     * </p>
     * 
     * @return The segment name if the change event is associated with a segment.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The segment name if the change event is associated with a segment.
     * </p>
     * 
     * @param segmentName
     *        The segment name if the change event is associated with a segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEventValues withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment if the change event is associated with an attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment if the change event is associated with an attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment if the change event is associated with an attachment.
     * </p>
     * 
     * @return The ID of the attachment if the change event is associated with an attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment if the change event is associated with an attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment if the change event is associated with an attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEventValues withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * For a <code>STATIC_ROUTE</code> event, this is the IP address.
     * </p>
     * 
     * @param cidr
     *        For a <code>STATIC_ROUTE</code> event, this is the IP address.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * For a <code>STATIC_ROUTE</code> event, this is the IP address.
     * </p>
     * 
     * @return For a <code>STATIC_ROUTE</code> event, this is the IP address.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * For a <code>STATIC_ROUTE</code> event, this is the IP address.
     * </p>
     * 
     * @param cidr
     *        For a <code>STATIC_ROUTE</code> event, this is the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEventValues withCidr(String cidr) {
        setCidr(cidr);
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
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkChangeEventValues == false)
            return false;
        CoreNetworkChangeEventValues other = (CoreNetworkChangeEventValues) obj;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkChangeEventValues clone() {
        try {
            return (CoreNetworkChangeEventValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkChangeEventValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
