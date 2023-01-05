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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a packet header statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PacketHeaderStatementRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PacketHeaderStatementRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The source addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceAddresses;
    /**
     * <p>
     * The destination addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinationAddresses;
    /**
     * <p>
     * The source ports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourcePorts;
    /**
     * <p>
     * The destination ports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinationPorts;
    /**
     * <p>
     * The source prefix lists.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourcePrefixLists;
    /**
     * <p>
     * The destination prefix lists.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinationPrefixLists;
    /**
     * <p>
     * The protocols.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> protocols;

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

    public PacketHeaderStatementRequest withSourceAddresses(String... sourceAddresses) {
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

    public PacketHeaderStatementRequest withSourceAddresses(java.util.Collection<String> sourceAddresses) {
        setSourceAddresses(sourceAddresses);
        return this;
    }

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

    public PacketHeaderStatementRequest withDestinationAddresses(String... destinationAddresses) {
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

    public PacketHeaderStatementRequest withDestinationAddresses(java.util.Collection<String> destinationAddresses) {
        setDestinationAddresses(destinationAddresses);
        return this;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @return The source ports.
     */

    public java.util.List<String> getSourcePorts() {
        if (sourcePorts == null) {
            sourcePorts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourcePorts;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     */

    public void setSourcePorts(java.util.Collection<String> sourcePorts) {
        if (sourcePorts == null) {
            this.sourcePorts = null;
            return;
        }

        this.sourcePorts = new com.amazonaws.internal.SdkInternalList<String>(sourcePorts);
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePorts(java.util.Collection)} or {@link #withSourcePorts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withSourcePorts(String... sourcePorts) {
        if (this.sourcePorts == null) {
            setSourcePorts(new com.amazonaws.internal.SdkInternalList<String>(sourcePorts.length));
        }
        for (String ele : sourcePorts) {
            this.sourcePorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withSourcePorts(java.util.Collection<String> sourcePorts) {
        setSourcePorts(sourcePorts);
        return this;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @return The destination ports.
     */

    public java.util.List<String> getDestinationPorts() {
        if (destinationPorts == null) {
            destinationPorts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinationPorts;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     */

    public void setDestinationPorts(java.util.Collection<String> destinationPorts) {
        if (destinationPorts == null) {
            this.destinationPorts = null;
            return;
        }

        this.destinationPorts = new com.amazonaws.internal.SdkInternalList<String>(destinationPorts);
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPorts(java.util.Collection)} or {@link #withDestinationPorts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withDestinationPorts(String... destinationPorts) {
        if (this.destinationPorts == null) {
            setDestinationPorts(new com.amazonaws.internal.SdkInternalList<String>(destinationPorts.length));
        }
        for (String ele : destinationPorts) {
            this.destinationPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withDestinationPorts(java.util.Collection<String> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * The source prefix lists.
     * </p>
     * 
     * @return The source prefix lists.
     */

    public java.util.List<String> getSourcePrefixLists() {
        if (sourcePrefixLists == null) {
            sourcePrefixLists = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourcePrefixLists;
    }

    /**
     * <p>
     * The source prefix lists.
     * </p>
     * 
     * @param sourcePrefixLists
     *        The source prefix lists.
     */

    public void setSourcePrefixLists(java.util.Collection<String> sourcePrefixLists) {
        if (sourcePrefixLists == null) {
            this.sourcePrefixLists = null;
            return;
        }

        this.sourcePrefixLists = new com.amazonaws.internal.SdkInternalList<String>(sourcePrefixLists);
    }

    /**
     * <p>
     * The source prefix lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePrefixLists(java.util.Collection)} or {@link #withSourcePrefixLists(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sourcePrefixLists
     *        The source prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withSourcePrefixLists(String... sourcePrefixLists) {
        if (this.sourcePrefixLists == null) {
            setSourcePrefixLists(new com.amazonaws.internal.SdkInternalList<String>(sourcePrefixLists.length));
        }
        for (String ele : sourcePrefixLists) {
            this.sourcePrefixLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source prefix lists.
     * </p>
     * 
     * @param sourcePrefixLists
     *        The source prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withSourcePrefixLists(java.util.Collection<String> sourcePrefixLists) {
        setSourcePrefixLists(sourcePrefixLists);
        return this;
    }

    /**
     * <p>
     * The destination prefix lists.
     * </p>
     * 
     * @return The destination prefix lists.
     */

    public java.util.List<String> getDestinationPrefixLists() {
        if (destinationPrefixLists == null) {
            destinationPrefixLists = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinationPrefixLists;
    }

    /**
     * <p>
     * The destination prefix lists.
     * </p>
     * 
     * @param destinationPrefixLists
     *        The destination prefix lists.
     */

    public void setDestinationPrefixLists(java.util.Collection<String> destinationPrefixLists) {
        if (destinationPrefixLists == null) {
            this.destinationPrefixLists = null;
            return;
        }

        this.destinationPrefixLists = new com.amazonaws.internal.SdkInternalList<String>(destinationPrefixLists);
    }

    /**
     * <p>
     * The destination prefix lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPrefixLists(java.util.Collection)} or
     * {@link #withDestinationPrefixLists(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationPrefixLists
     *        The destination prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withDestinationPrefixLists(String... destinationPrefixLists) {
        if (this.destinationPrefixLists == null) {
            setDestinationPrefixLists(new com.amazonaws.internal.SdkInternalList<String>(destinationPrefixLists.length));
        }
        for (String ele : destinationPrefixLists) {
            this.destinationPrefixLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination prefix lists.
     * </p>
     * 
     * @param destinationPrefixLists
     *        The destination prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PacketHeaderStatementRequest withDestinationPrefixLists(java.util.Collection<String> destinationPrefixLists) {
        setDestinationPrefixLists(destinationPrefixLists);
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @return The protocols.
     * @see Protocol
     */

    public java.util.List<String> getProtocols() {
        if (protocols == null) {
            protocols = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return protocols;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @see Protocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new com.amazonaws.internal.SdkInternalList<String>(protocols);
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public PacketHeaderStatementRequest withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new com.amazonaws.internal.SdkInternalList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public PacketHeaderStatementRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public PacketHeaderStatementRequest withProtocols(Protocol... protocols) {
        com.amazonaws.internal.SdkInternalList<String> protocolsCopy = new com.amazonaws.internal.SdkInternalList<String>(protocols.length);
        for (Protocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getSourceAddresses() != null)
            sb.append("SourceAddresses: ").append(getSourceAddresses()).append(",");
        if (getDestinationAddresses() != null)
            sb.append("DestinationAddresses: ").append(getDestinationAddresses()).append(",");
        if (getSourcePorts() != null)
            sb.append("SourcePorts: ").append(getSourcePorts()).append(",");
        if (getDestinationPorts() != null)
            sb.append("DestinationPorts: ").append(getDestinationPorts()).append(",");
        if (getSourcePrefixLists() != null)
            sb.append("SourcePrefixLists: ").append(getSourcePrefixLists()).append(",");
        if (getDestinationPrefixLists() != null)
            sb.append("DestinationPrefixLists: ").append(getDestinationPrefixLists()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PacketHeaderStatementRequest == false)
            return false;
        PacketHeaderStatementRequest other = (PacketHeaderStatementRequest) obj;
        if (other.getSourceAddresses() == null ^ this.getSourceAddresses() == null)
            return false;
        if (other.getSourceAddresses() != null && other.getSourceAddresses().equals(this.getSourceAddresses()) == false)
            return false;
        if (other.getDestinationAddresses() == null ^ this.getDestinationAddresses() == null)
            return false;
        if (other.getDestinationAddresses() != null && other.getDestinationAddresses().equals(this.getDestinationAddresses()) == false)
            return false;
        if (other.getSourcePorts() == null ^ this.getSourcePorts() == null)
            return false;
        if (other.getSourcePorts() != null && other.getSourcePorts().equals(this.getSourcePorts()) == false)
            return false;
        if (other.getDestinationPorts() == null ^ this.getDestinationPorts() == null)
            return false;
        if (other.getDestinationPorts() != null && other.getDestinationPorts().equals(this.getDestinationPorts()) == false)
            return false;
        if (other.getSourcePrefixLists() == null ^ this.getSourcePrefixLists() == null)
            return false;
        if (other.getSourcePrefixLists() != null && other.getSourcePrefixLists().equals(this.getSourcePrefixLists()) == false)
            return false;
        if (other.getDestinationPrefixLists() == null ^ this.getDestinationPrefixLists() == null)
            return false;
        if (other.getDestinationPrefixLists() != null && other.getDestinationPrefixLists().equals(this.getDestinationPrefixLists()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAddresses() == null) ? 0 : getSourceAddresses().hashCode());
        hashCode = prime * hashCode + ((getDestinationAddresses() == null) ? 0 : getDestinationAddresses().hashCode());
        hashCode = prime * hashCode + ((getSourcePorts() == null) ? 0 : getSourcePorts().hashCode());
        hashCode = prime * hashCode + ((getDestinationPorts() == null) ? 0 : getDestinationPorts().hashCode());
        hashCode = prime * hashCode + ((getSourcePrefixLists() == null) ? 0 : getSourcePrefixLists().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixLists() == null) ? 0 : getDestinationPrefixLists().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public PacketHeaderStatementRequest clone() {
        try {
            return (PacketHeaderStatementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
