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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A signal to a camera node to start or stop processing video.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NodeSignal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeSignal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The camera node's name, from the application manifest.
     * </p>
     */
    private String nodeInstanceId;
    /**
     * <p>
     * The signal value.
     * </p>
     */
    private String signal;

    /**
     * <p>
     * The camera node's name, from the application manifest.
     * </p>
     * 
     * @param nodeInstanceId
     *        The camera node's name, from the application manifest.
     */

    public void setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
    }

    /**
     * <p>
     * The camera node's name, from the application manifest.
     * </p>
     * 
     * @return The camera node's name, from the application manifest.
     */

    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * <p>
     * The camera node's name, from the application manifest.
     * </p>
     * 
     * @param nodeInstanceId
     *        The camera node's name, from the application manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSignal withNodeInstanceId(String nodeInstanceId) {
        setNodeInstanceId(nodeInstanceId);
        return this;
    }

    /**
     * <p>
     * The signal value.
     * </p>
     * 
     * @param signal
     *        The signal value.
     * @see NodeSignalValue
     */

    public void setSignal(String signal) {
        this.signal = signal;
    }

    /**
     * <p>
     * The signal value.
     * </p>
     * 
     * @return The signal value.
     * @see NodeSignalValue
     */

    public String getSignal() {
        return this.signal;
    }

    /**
     * <p>
     * The signal value.
     * </p>
     * 
     * @param signal
     *        The signal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeSignalValue
     */

    public NodeSignal withSignal(String signal) {
        setSignal(signal);
        return this;
    }

    /**
     * <p>
     * The signal value.
     * </p>
     * 
     * @param signal
     *        The signal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeSignalValue
     */

    public NodeSignal withSignal(NodeSignalValue signal) {
        this.signal = signal.toString();
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
        if (getNodeInstanceId() != null)
            sb.append("NodeInstanceId: ").append(getNodeInstanceId()).append(",");
        if (getSignal() != null)
            sb.append("Signal: ").append(getSignal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeSignal == false)
            return false;
        NodeSignal other = (NodeSignal) obj;
        if (other.getNodeInstanceId() == null ^ this.getNodeInstanceId() == null)
            return false;
        if (other.getNodeInstanceId() != null && other.getNodeInstanceId().equals(this.getNodeInstanceId()) == false)
            return false;
        if (other.getSignal() == null ^ this.getSignal() == null)
            return false;
        if (other.getSignal() != null && other.getSignal().equals(this.getSignal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeInstanceId() == null) ? 0 : getNodeInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSignal() == null) ? 0 : getSignal().hashCode());
        return hashCode;
    }

    @Override
    public NodeSignal clone() {
        try {
            return (NodeSignal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NodeSignalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
