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
package com.amazonaws.services.route53recoverycluster.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A routing control state entry.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStateEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingControlStateEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a routing control state entry.
     * </p>
     */
    private String routingControlArn;
    /**
     * <p>
     * The routing control state in a set of routing control state entries.
     * </p>
     */
    private String routingControlState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a routing control state entry.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) for a routing control state entry.
     */

    public void setRoutingControlArn(String routingControlArn) {
        this.routingControlArn = routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a routing control state entry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a routing control state entry.
     */

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a routing control state entry.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) for a routing control state entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStateEntry withRoutingControlArn(String routingControlArn) {
        setRoutingControlArn(routingControlArn);
        return this;
    }

    /**
     * <p>
     * The routing control state in a set of routing control state entries.
     * </p>
     * 
     * @param routingControlState
     *        The routing control state in a set of routing control state entries.
     * @see RoutingControlState
     */

    public void setRoutingControlState(String routingControlState) {
        this.routingControlState = routingControlState;
    }

    /**
     * <p>
     * The routing control state in a set of routing control state entries.
     * </p>
     * 
     * @return The routing control state in a set of routing control state entries.
     * @see RoutingControlState
     */

    public String getRoutingControlState() {
        return this.routingControlState;
    }

    /**
     * <p>
     * The routing control state in a set of routing control state entries.
     * </p>
     * 
     * @param routingControlState
     *        The routing control state in a set of routing control state entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public UpdateRoutingControlStateEntry withRoutingControlState(String routingControlState) {
        setRoutingControlState(routingControlState);
        return this;
    }

    /**
     * <p>
     * The routing control state in a set of routing control state entries.
     * </p>
     * 
     * @param routingControlState
     *        The routing control state in a set of routing control state entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public UpdateRoutingControlStateEntry withRoutingControlState(RoutingControlState routingControlState) {
        this.routingControlState = routingControlState.toString();
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
        if (getRoutingControlArn() != null)
            sb.append("RoutingControlArn: ").append(getRoutingControlArn()).append(",");
        if (getRoutingControlState() != null)
            sb.append("RoutingControlState: ").append(getRoutingControlState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingControlStateEntry == false)
            return false;
        UpdateRoutingControlStateEntry other = (UpdateRoutingControlStateEntry) obj;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        if (other.getRoutingControlState() == null ^ this.getRoutingControlState() == null)
            return false;
        if (other.getRoutingControlState() != null && other.getRoutingControlState().equals(this.getRoutingControlState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlState() == null) ? 0 : getRoutingControlState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingControlStateEntry clone() {
        try {
            return (UpdateRoutingControlStateEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycluster.model.transform.UpdateRoutingControlStateEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
