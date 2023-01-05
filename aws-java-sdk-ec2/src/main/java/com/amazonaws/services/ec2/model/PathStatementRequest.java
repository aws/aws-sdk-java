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
 * Describes a path statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PathStatementRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathStatementRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The packet header statement.
     * </p>
     */
    private PacketHeaderStatementRequest packetHeaderStatement;
    /**
     * <p>
     * The resource statement.
     * </p>
     */
    private ResourceStatementRequest resourceStatement;

    /**
     * <p>
     * The packet header statement.
     * </p>
     * 
     * @param packetHeaderStatement
     *        The packet header statement.
     */

    public void setPacketHeaderStatement(PacketHeaderStatementRequest packetHeaderStatement) {
        this.packetHeaderStatement = packetHeaderStatement;
    }

    /**
     * <p>
     * The packet header statement.
     * </p>
     * 
     * @return The packet header statement.
     */

    public PacketHeaderStatementRequest getPacketHeaderStatement() {
        return this.packetHeaderStatement;
    }

    /**
     * <p>
     * The packet header statement.
     * </p>
     * 
     * @param packetHeaderStatement
     *        The packet header statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathStatementRequest withPacketHeaderStatement(PacketHeaderStatementRequest packetHeaderStatement) {
        setPacketHeaderStatement(packetHeaderStatement);
        return this;
    }

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @param resourceStatement
     *        The resource statement.
     */

    public void setResourceStatement(ResourceStatementRequest resourceStatement) {
        this.resourceStatement = resourceStatement;
    }

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @return The resource statement.
     */

    public ResourceStatementRequest getResourceStatement() {
        return this.resourceStatement;
    }

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @param resourceStatement
     *        The resource statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathStatementRequest withResourceStatement(ResourceStatementRequest resourceStatement) {
        setResourceStatement(resourceStatement);
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
        if (getPacketHeaderStatement() != null)
            sb.append("PacketHeaderStatement: ").append(getPacketHeaderStatement()).append(",");
        if (getResourceStatement() != null)
            sb.append("ResourceStatement: ").append(getResourceStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathStatementRequest == false)
            return false;
        PathStatementRequest other = (PathStatementRequest) obj;
        if (other.getPacketHeaderStatement() == null ^ this.getPacketHeaderStatement() == null)
            return false;
        if (other.getPacketHeaderStatement() != null && other.getPacketHeaderStatement().equals(this.getPacketHeaderStatement()) == false)
            return false;
        if (other.getResourceStatement() == null ^ this.getResourceStatement() == null)
            return false;
        if (other.getResourceStatement() != null && other.getResourceStatement().equals(this.getResourceStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPacketHeaderStatement() == null) ? 0 : getPacketHeaderStatement().hashCode());
        hashCode = prime * hashCode + ((getResourceStatement() == null) ? 0 : getResourceStatement().hashCode());
        return hashCode;
    }

    @Override
    public PathStatementRequest clone() {
        try {
            return (PathStatementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
