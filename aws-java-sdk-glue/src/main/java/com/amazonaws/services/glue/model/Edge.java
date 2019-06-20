/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An edge represents a directed connection between two AWS Glue components which are part of the workflow the edge
 * belongs to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Edge" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Edge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     */
    private String destinationId;

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * 
     * @param sourceId
     *        The unique of the node within the workflow where the edge starts.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * 
     * @return The unique of the node within the workflow where the edge starts.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * 
     * @param sourceId
     *        The unique of the node within the workflow where the edge starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * 
     * @param destinationId
     *        The unique of the node within the workflow where the edge ends.
     */

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * 
     * @return The unique of the node within the workflow where the edge ends.
     */

    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * 
     * @param destinationId
     *        The unique of the node within the workflow where the edge ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withDestinationId(String destinationId) {
        setDestinationId(destinationId);
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
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getDestinationId() != null)
            sb.append("DestinationId: ").append(getDestinationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Edge == false)
            return false;
        Edge other = (Edge) obj;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        return hashCode;
    }

    @Override
    public Edge clone() {
        try {
            return (Edge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
