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
 * Describes a core network change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkChangeValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names of the segments in a core network.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * The Regions where edges are located in a core network.
     * </p>
     */
    private java.util.List<String> edgeLocations;
    /**
     * <p>
     * The ASN of a core network.
     * </p>
     */
    private Long asn;
    /**
     * <p>
     * The IP addresses used for a core network.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of the destination.
     * </p>
     */
    private String destinationIdentifier;
    /**
     * <p>
     * The inside IP addresses used for core network change values.
     * </p>
     */
    private java.util.List<String> insideCidrBlocks;
    /**
     * <p>
     * The shared segments for a core network change value.
     * </p>
     */
    private java.util.List<String> sharedSegments;

    /**
     * <p>
     * The names of the segments in a core network.
     * </p>
     * 
     * @param segmentName
     *        The names of the segments in a core network.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The names of the segments in a core network.
     * </p>
     * 
     * @return The names of the segments in a core network.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The names of the segments in a core network.
     * </p>
     * 
     * @param segmentName
     *        The names of the segments in a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * The Regions where edges are located in a core network.
     * </p>
     * 
     * @return The Regions where edges are located in a core network.
     */

    public java.util.List<String> getEdgeLocations() {
        return edgeLocations;
    }

    /**
     * <p>
     * The Regions where edges are located in a core network.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where edges are located in a core network.
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
     * The Regions where edges are located in a core network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeLocations(java.util.Collection)} or {@link #withEdgeLocations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where edges are located in a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withEdgeLocations(String... edgeLocations) {
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
     * The Regions where edges are located in a core network.
     * </p>
     * 
     * @param edgeLocations
     *        The Regions where edges are located in a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withEdgeLocations(java.util.Collection<String> edgeLocations) {
        setEdgeLocations(edgeLocations);
        return this;
    }

    /**
     * <p>
     * The ASN of a core network.
     * </p>
     * 
     * @param asn
     *        The ASN of a core network.
     */

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The ASN of a core network.
     * </p>
     * 
     * @return The ASN of a core network.
     */

    public Long getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The ASN of a core network.
     * </p>
     * 
     * @param asn
     *        The ASN of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withAsn(Long asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The IP addresses used for a core network.
     * </p>
     * 
     * @param cidr
     *        The IP addresses used for a core network.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The IP addresses used for a core network.
     * </p>
     * 
     * @return The IP addresses used for a core network.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The IP addresses used for a core network.
     * </p>
     * 
     * @param cidr
     *        The IP addresses used for a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @param destinationIdentifier
     *        The ID of the destination.
     */

    public void setDestinationIdentifier(String destinationIdentifier) {
        this.destinationIdentifier = destinationIdentifier;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @return The ID of the destination.
     */

    public String getDestinationIdentifier() {
        return this.destinationIdentifier;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @param destinationIdentifier
     *        The ID of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withDestinationIdentifier(String destinationIdentifier) {
        setDestinationIdentifier(destinationIdentifier);
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for core network change values.
     * </p>
     * 
     * @return The inside IP addresses used for core network change values.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The inside IP addresses used for core network change values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network change values.
     */

    public void setInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        if (insideCidrBlocks == null) {
            this.insideCidrBlocks = null;
            return;
        }

        this.insideCidrBlocks = new java.util.ArrayList<String>(insideCidrBlocks);
    }

    /**
     * <p>
     * The inside IP addresses used for core network change values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network change values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withInsideCidrBlocks(String... insideCidrBlocks) {
        if (this.insideCidrBlocks == null) {
            setInsideCidrBlocks(new java.util.ArrayList<String>(insideCidrBlocks.length));
        }
        for (String ele : insideCidrBlocks) {
            this.insideCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for core network change values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network change values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The shared segments for a core network change value.
     * </p>
     * 
     * @return The shared segments for a core network change value.
     */

    public java.util.List<String> getSharedSegments() {
        return sharedSegments;
    }

    /**
     * <p>
     * The shared segments for a core network change value.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments for a core network change value.
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
     * The shared segments for a core network change value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedSegments(java.util.Collection)} or {@link #withSharedSegments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments for a core network change value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withSharedSegments(String... sharedSegments) {
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
     * The shared segments for a core network change value.
     * </p>
     * 
     * @param sharedSegments
     *        The shared segments for a core network change value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeValues withSharedSegments(java.util.Collection<String> sharedSegments) {
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
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getEdgeLocations() != null)
            sb.append("EdgeLocations: ").append(getEdgeLocations()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getDestinationIdentifier() != null)
            sb.append("DestinationIdentifier: ").append(getDestinationIdentifier()).append(",");
        if (getInsideCidrBlocks() != null)
            sb.append("InsideCidrBlocks: ").append(getInsideCidrBlocks()).append(",");
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

        if (obj instanceof CoreNetworkChangeValues == false)
            return false;
        CoreNetworkChangeValues other = (CoreNetworkChangeValues) obj;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getEdgeLocations() == null ^ this.getEdgeLocations() == null)
            return false;
        if (other.getEdgeLocations() != null && other.getEdgeLocations().equals(this.getEdgeLocations()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDestinationIdentifier() == null ^ this.getDestinationIdentifier() == null)
            return false;
        if (other.getDestinationIdentifier() != null && other.getDestinationIdentifier().equals(this.getDestinationIdentifier()) == false)
            return false;
        if (other.getInsideCidrBlocks() == null ^ this.getInsideCidrBlocks() == null)
            return false;
        if (other.getInsideCidrBlocks() != null && other.getInsideCidrBlocks().equals(this.getInsideCidrBlocks()) == false)
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

        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocations() == null) ? 0 : getEdgeLocations().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getDestinationIdentifier() == null) ? 0 : getDestinationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getSharedSegments() == null) ? 0 : getSharedSegments().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkChangeValues clone() {
        try {
            return (CoreNetworkChangeValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkChangeValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
