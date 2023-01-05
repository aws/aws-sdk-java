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
 * Describes a core network edge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkEdge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkEdge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where a core network edge is located.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The ASN of a core network edge.
     * </p>
     */
    private Long asn;
    /**
     * <p>
     * The inside IP addresses used for core network edges.
     * </p>
     */
    private java.util.List<String> insideCidrBlocks;

    /**
     * <p>
     * The Region where a core network edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where a core network edge is located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Region where a core network edge is located.
     * </p>
     * 
     * @return The Region where a core network edge is located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Region where a core network edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where a core network edge is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkEdge withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The ASN of a core network edge.
     * </p>
     * 
     * @param asn
     *        The ASN of a core network edge.
     */

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The ASN of a core network edge.
     * </p>
     * 
     * @return The ASN of a core network edge.
     */

    public Long getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The ASN of a core network edge.
     * </p>
     * 
     * @param asn
     *        The ASN of a core network edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkEdge withAsn(Long asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for core network edges.
     * </p>
     * 
     * @return The inside IP addresses used for core network edges.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The inside IP addresses used for core network edges.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network edges.
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
     * The inside IP addresses used for core network edges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network edges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkEdge withInsideCidrBlocks(String... insideCidrBlocks) {
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
     * The inside IP addresses used for core network edges.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for core network edges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkEdge withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getInsideCidrBlocks() != null)
            sb.append("InsideCidrBlocks: ").append(getInsideCidrBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkEdge == false)
            return false;
        CoreNetworkEdge other = (CoreNetworkEdge) obj;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getInsideCidrBlocks() == null ^ this.getInsideCidrBlocks() == null)
            return false;
        if (other.getInsideCidrBlocks() != null && other.getInsideCidrBlocks().equals(this.getInsideCidrBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkEdge clone() {
        try {
            return (CoreNetworkEdge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkEdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
