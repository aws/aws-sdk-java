/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The output of the bridge. A flow output is delivered to the AWS cloud.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/BridgeFlowOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BridgeFlowOutput implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Number (ARN) of the cloud flow. */
    private String flowArn;
    /** The Amazon Resource Number (ARN) of the flow source. */
    private String flowSourceArn;
    /** The name of the bridge's output. */
    private String name;

    /**
     * The Amazon Resource Number (ARN) of the cloud flow.
     * 
     * @param flowArn
     *        The Amazon Resource Number (ARN) of the cloud flow.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the cloud flow.
     * 
     * @return The Amazon Resource Number (ARN) of the cloud flow.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the cloud flow.
     * 
     * @param flowArn
     *        The Amazon Resource Number (ARN) of the cloud flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowOutput withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The Amazon Resource Number (ARN) of the flow source.
     * 
     * @param flowSourceArn
     *        The Amazon Resource Number (ARN) of the flow source.
     */

    public void setFlowSourceArn(String flowSourceArn) {
        this.flowSourceArn = flowSourceArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the flow source.
     * 
     * @return The Amazon Resource Number (ARN) of the flow source.
     */

    public String getFlowSourceArn() {
        return this.flowSourceArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the flow source.
     * 
     * @param flowSourceArn
     *        The Amazon Resource Number (ARN) of the flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowOutput withFlowSourceArn(String flowSourceArn) {
        setFlowSourceArn(flowSourceArn);
        return this;
    }

    /**
     * The name of the bridge's output.
     * 
     * @param name
     *        The name of the bridge's output.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the bridge's output.
     * 
     * @return The name of the bridge's output.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the bridge's output.
     * 
     * @param name
     *        The name of the bridge's output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowOutput withName(String name) {
        setName(name);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getFlowSourceArn() != null)
            sb.append("FlowSourceArn: ").append(getFlowSourceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BridgeFlowOutput == false)
            return false;
        BridgeFlowOutput other = (BridgeFlowOutput) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getFlowSourceArn() == null ^ this.getFlowSourceArn() == null)
            return false;
        if (other.getFlowSourceArn() != null && other.getFlowSourceArn().equals(this.getFlowSourceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getFlowSourceArn() == null) ? 0 : getFlowSourceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public BridgeFlowOutput clone() {
        try {
            return (BridgeFlowOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.BridgeFlowOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
