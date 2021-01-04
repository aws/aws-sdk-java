/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a header. Reflects any changes made by a component as traffic passes through. The fields of an inbound
 * header are null except for the first component of a path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisPacketHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisPacketHeader implements Serializable, Cloneable {

    /**
     * <p>
     * The destination addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinationAddresses;
    /**
     * <p>
     * The destination port ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> destinationPortRanges;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The source addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceAddresses;
    /**
     * <p>
     * The source port ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> sourcePortRanges;

    /**
     * <p>
     * The destination addresses.
     * </p>
     * 
     * @return The destination addresses.
     */

    public java.util.List<String> getDestinationAddresses() {
        if (destinationAddresses == null) {
            destinationAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinationAddresses;
    }

    /**
     * <p>
     * The destination addresses.
     * </p>
     * 
     * @param destinationAddresses
     *        The destination addresses.
     */

    public void setDestinationAddresses(java.util.Collection<String> destinationAddresses) {
        if (destinationAddresses == null) {
            this.destinationAddresses = null;
            return;
        }

        this.destinationAddresses = new com.amazonaws.internal.SdkInternalList<String>(destinationAddresses);
    }

    /**
     * <p>
     * The destination addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationAddresses(java.util.Collection)} or {@link #withDestinationAddresses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param destinationAddresses
     *        The destination addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withDestinationAddresses(String... destinationAddresses) {
        if (this.destinationAddresses == null) {
            setDestinationAddresses(new com.amazonaws.internal.SdkInternalList<String>(destinationAddresses.length));
        }
        for (String ele : destinationAddresses) {
            this.destinationAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination addresses.
     * </p>
     * 
     * @param destinationAddresses
     *        The destination addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withDestinationAddresses(java.util.Collection<String> destinationAddresses) {
        setDestinationAddresses(destinationAddresses);
        return this;
    }

    /**
     * <p>
     * The destination port ranges.
     * </p>
     * 
     * @return The destination port ranges.
     */

    public java.util.List<PortRange> getDestinationPortRanges() {
        if (destinationPortRanges == null) {
            destinationPortRanges = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return destinationPortRanges;
    }

    /**
     * <p>
     * The destination port ranges.
     * </p>
     * 
     * @param destinationPortRanges
     *        The destination port ranges.
     */

    public void setDestinationPortRanges(java.util.Collection<PortRange> destinationPortRanges) {
        if (destinationPortRanges == null) {
            this.destinationPortRanges = null;
            return;
        }

        this.destinationPortRanges = new com.amazonaws.internal.SdkInternalList<PortRange>(destinationPortRanges);
    }

    /**
     * <p>
     * The destination port ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPortRanges(java.util.Collection)} or
     * {@link #withDestinationPortRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationPortRanges
     *        The destination port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withDestinationPortRanges(PortRange... destinationPortRanges) {
        if (this.destinationPortRanges == null) {
            setDestinationPortRanges(new com.amazonaws.internal.SdkInternalList<PortRange>(destinationPortRanges.length));
        }
        for (PortRange ele : destinationPortRanges) {
            this.destinationPortRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination port ranges.
     * </p>
     * 
     * @param destinationPortRanges
     *        The destination port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withDestinationPortRanges(java.util.Collection<PortRange> destinationPortRanges) {
        setDestinationPortRanges(destinationPortRanges);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The source addresses.
     * </p>
     * 
     * @return The source addresses.
     */

    public java.util.List<String> getSourceAddresses() {
        if (sourceAddresses == null) {
            sourceAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceAddresses;
    }

    /**
     * <p>
     * The source addresses.
     * </p>
     * 
     * @param sourceAddresses
     *        The source addresses.
     */

    public void setSourceAddresses(java.util.Collection<String> sourceAddresses) {
        if (sourceAddresses == null) {
            this.sourceAddresses = null;
            return;
        }

        this.sourceAddresses = new com.amazonaws.internal.SdkInternalList<String>(sourceAddresses);
    }

    /**
     * <p>
     * The source addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceAddresses(java.util.Collection)} or {@link #withSourceAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceAddresses
     *        The source addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withSourceAddresses(String... sourceAddresses) {
        if (this.sourceAddresses == null) {
            setSourceAddresses(new com.amazonaws.internal.SdkInternalList<String>(sourceAddresses.length));
        }
        for (String ele : sourceAddresses) {
            this.sourceAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source addresses.
     * </p>
     * 
     * @param sourceAddresses
     *        The source addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withSourceAddresses(java.util.Collection<String> sourceAddresses) {
        setSourceAddresses(sourceAddresses);
        return this;
    }

    /**
     * <p>
     * The source port ranges.
     * </p>
     * 
     * @return The source port ranges.
     */

    public java.util.List<PortRange> getSourcePortRanges() {
        if (sourcePortRanges == null) {
            sourcePortRanges = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return sourcePortRanges;
    }

    /**
     * <p>
     * The source port ranges.
     * </p>
     * 
     * @param sourcePortRanges
     *        The source port ranges.
     */

    public void setSourcePortRanges(java.util.Collection<PortRange> sourcePortRanges) {
        if (sourcePortRanges == null) {
            this.sourcePortRanges = null;
            return;
        }

        this.sourcePortRanges = new com.amazonaws.internal.SdkInternalList<PortRange>(sourcePortRanges);
    }

    /**
     * <p>
     * The source port ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePortRanges(java.util.Collection)} or {@link #withSourcePortRanges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourcePortRanges
     *        The source port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withSourcePortRanges(PortRange... sourcePortRanges) {
        if (this.sourcePortRanges == null) {
            setSourcePortRanges(new com.amazonaws.internal.SdkInternalList<PortRange>(sourcePortRanges.length));
        }
        for (PortRange ele : sourcePortRanges) {
            this.sourcePortRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source port ranges.
     * </p>
     * 
     * @param sourcePortRanges
     *        The source port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisPacketHeader withSourcePortRanges(java.util.Collection<PortRange> sourcePortRanges) {
        setSourcePortRanges(sourcePortRanges);
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
        if (getDestinationAddresses() != null)
            sb.append("DestinationAddresses: ").append(getDestinationAddresses()).append(",");
        if (getDestinationPortRanges() != null)
            sb.append("DestinationPortRanges: ").append(getDestinationPortRanges()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSourceAddresses() != null)
            sb.append("SourceAddresses: ").append(getSourceAddresses()).append(",");
        if (getSourcePortRanges() != null)
            sb.append("SourcePortRanges: ").append(getSourcePortRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisPacketHeader == false)
            return false;
        AnalysisPacketHeader other = (AnalysisPacketHeader) obj;
        if (other.getDestinationAddresses() == null ^ this.getDestinationAddresses() == null)
            return false;
        if (other.getDestinationAddresses() != null && other.getDestinationAddresses().equals(this.getDestinationAddresses()) == false)
            return false;
        if (other.getDestinationPortRanges() == null ^ this.getDestinationPortRanges() == null)
            return false;
        if (other.getDestinationPortRanges() != null && other.getDestinationPortRanges().equals(this.getDestinationPortRanges()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSourceAddresses() == null ^ this.getSourceAddresses() == null)
            return false;
        if (other.getSourceAddresses() != null && other.getSourceAddresses().equals(this.getSourceAddresses()) == false)
            return false;
        if (other.getSourcePortRanges() == null ^ this.getSourcePortRanges() == null)
            return false;
        if (other.getSourcePortRanges() != null && other.getSourcePortRanges().equals(this.getSourcePortRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationAddresses() == null) ? 0 : getDestinationAddresses().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRanges() == null) ? 0 : getDestinationPortRanges().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceAddresses() == null) ? 0 : getSourceAddresses().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRanges() == null) ? 0 : getSourcePortRanges().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisPacketHeader clone() {
        try {
            return (AnalysisPacketHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
