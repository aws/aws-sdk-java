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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code><a>DeleteOutboundCrossClusterSearchConnection</a></code> operation. Contains details of deleted
 * outbound connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteOutboundCrossClusterSearchConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     * </p>
     */
    private OutboundCrossClusterSearchConnection crossClusterSearchConnection;

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     * </p>
     * 
     * @param crossClusterSearchConnection
     *        Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     */

    public void setCrossClusterSearchConnection(OutboundCrossClusterSearchConnection crossClusterSearchConnection) {
        this.crossClusterSearchConnection = crossClusterSearchConnection;
    }

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     * </p>
     * 
     * @return Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     */

    public OutboundCrossClusterSearchConnection getCrossClusterSearchConnection() {
        return this.crossClusterSearchConnection;
    }

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     * </p>
     * 
     * @param crossClusterSearchConnection
     *        Specifies the <code><a>OutboundCrossClusterSearchConnection</a></code> of deleted outbound connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOutboundCrossClusterSearchConnectionResult withCrossClusterSearchConnection(OutboundCrossClusterSearchConnection crossClusterSearchConnection) {
        setCrossClusterSearchConnection(crossClusterSearchConnection);
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
        if (getCrossClusterSearchConnection() != null)
            sb.append("CrossClusterSearchConnection: ").append(getCrossClusterSearchConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOutboundCrossClusterSearchConnectionResult == false)
            return false;
        DeleteOutboundCrossClusterSearchConnectionResult other = (DeleteOutboundCrossClusterSearchConnectionResult) obj;
        if (other.getCrossClusterSearchConnection() == null ^ this.getCrossClusterSearchConnection() == null)
            return false;
        if (other.getCrossClusterSearchConnection() != null && other.getCrossClusterSearchConnection().equals(this.getCrossClusterSearchConnection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossClusterSearchConnection() == null) ? 0 : getCrossClusterSearchConnection().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOutboundCrossClusterSearchConnectionResult clone() {
        try {
            return (DeleteOutboundCrossClusterSearchConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
