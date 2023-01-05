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
 * Describes a path component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PathComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sequence number in the path. The destination is 0.
     * </p>
     */
    private Integer sequence;
    /**
     * <p>
     * The resource.
     * </p>
     */
    private NetworkResourceSummary resource;
    /**
     * <p>
     * The destination CIDR block in the route table.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The sequence number in the path. The destination is 0.
     * </p>
     * 
     * @param sequence
     *        The sequence number in the path. The destination is 0.
     */

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * <p>
     * The sequence number in the path. The destination is 0.
     * </p>
     * 
     * @return The sequence number in the path. The destination is 0.
     */

    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * <p>
     * The sequence number in the path. The destination is 0.
     * </p>
     * 
     * @param sequence
     *        The sequence number in the path. The destination is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withSequence(Integer sequence) {
        setSequence(sequence);
        return this;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @param resource
     *        The resource.
     */

    public void setResource(NetworkResourceSummary resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @return The resource.
     */

    public NetworkResourceSummary getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @param resource
     *        The resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withResource(NetworkResourceSummary resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The destination CIDR block in the route table.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block in the route table.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block in the route table.
     * </p>
     * 
     * @return The destination CIDR block in the route table.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block in the route table.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block in the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
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
        if (getSequence() != null)
            sb.append("Sequence: ").append(getSequence()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathComponent == false)
            return false;
        PathComponent other = (PathComponent) obj;
        if (other.getSequence() == null ^ this.getSequence() == null)
            return false;
        if (other.getSequence() != null && other.getSequence().equals(this.getSequence()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequence() == null) ? 0 : getSequence().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public PathComponent clone() {
        try {
            return (PathComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.PathComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
