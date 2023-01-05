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
 * A routing control, which is a simple on/off switch that you can use to route traffic to cells. When a routing control
 * state is On, traffic flows to a cell. When the state is Off, traffic does not flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/RoutingControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * The name of the control panel where the routing control is located.
     * </p>
     */
    private String controlPanelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     */
    private String routingControlArn;
    /**
     * <p>
     * The name of the routing control.
     * </p>
     */
    private String routingControlName;
    /**
     * <p>
     * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the
     * state is Off, traffic does not flow.
     * </p>
     */
    private String routingControlState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel where the routing control is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * The name of the control panel where the routing control is located.
     * </p>
     * 
     * @param controlPanelName
     *        The name of the control panel where the routing control is located.
     */

    public void setControlPanelName(String controlPanelName) {
        this.controlPanelName = controlPanelName;
    }

    /**
     * <p>
     * The name of the control panel where the routing control is located.
     * </p>
     * 
     * @return The name of the control panel where the routing control is located.
     */

    public String getControlPanelName() {
        return this.controlPanelName;
    }

    /**
     * <p>
     * The name of the control panel where the routing control is located.
     * </p>
     * 
     * @param controlPanelName
     *        The name of the control panel where the routing control is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withControlPanelName(String controlPanelName) {
        setControlPanelName(controlPanelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) of the routing control.
     */

    public void setRoutingControlArn(String routingControlArn) {
        this.routingControlArn = routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the routing control.
     */

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) of the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withRoutingControlArn(String routingControlArn) {
        setRoutingControlArn(routingControlArn);
        return this;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param routingControlName
     *        The name of the routing control.
     */

    public void setRoutingControlName(String routingControlName) {
        this.routingControlName = routingControlName;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @return The name of the routing control.
     */

    public String getRoutingControlName() {
        return this.routingControlName;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param routingControlName
     *        The name of the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withRoutingControlName(String routingControlName) {
        setRoutingControlName(routingControlName);
        return this;
    }

    /**
     * <p>
     * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the
     * state is Off, traffic does not flow.
     * </p>
     * 
     * @param routingControlState
     *        The current state of the routing control. When a routing control state is On, traffic flows to a cell.
     *        When the state is Off, traffic does not flow.
     * @see RoutingControlState
     */

    public void setRoutingControlState(String routingControlState) {
        this.routingControlState = routingControlState;
    }

    /**
     * <p>
     * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the
     * state is Off, traffic does not flow.
     * </p>
     * 
     * @return The current state of the routing control. When a routing control state is On, traffic flows to a cell.
     *         When the state is Off, traffic does not flow.
     * @see RoutingControlState
     */

    public String getRoutingControlState() {
        return this.routingControlState;
    }

    /**
     * <p>
     * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the
     * state is Off, traffic does not flow.
     * </p>
     * 
     * @param routingControlState
     *        The current state of the routing control. When a routing control state is On, traffic flows to a cell.
     *        When the state is Off, traffic does not flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public RoutingControl withRoutingControlState(String routingControlState) {
        setRoutingControlState(routingControlState);
        return this;
    }

    /**
     * <p>
     * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the
     * state is Off, traffic does not flow.
     * </p>
     * 
     * @param routingControlState
     *        The current state of the routing control. When a routing control state is On, traffic flows to a cell.
     *        When the state is Off, traffic does not flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public RoutingControl withRoutingControlState(RoutingControlState routingControlState) {
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
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getControlPanelName() != null)
            sb.append("ControlPanelName: ").append(getControlPanelName()).append(",");
        if (getRoutingControlArn() != null)
            sb.append("RoutingControlArn: ").append(getRoutingControlArn()).append(",");
        if (getRoutingControlName() != null)
            sb.append("RoutingControlName: ").append(getRoutingControlName()).append(",");
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

        if (obj instanceof RoutingControl == false)
            return false;
        RoutingControl other = (RoutingControl) obj;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getControlPanelName() == null ^ this.getControlPanelName() == null)
            return false;
        if (other.getControlPanelName() != null && other.getControlPanelName().equals(this.getControlPanelName()) == false)
            return false;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        if (other.getRoutingControlName() == null ^ this.getRoutingControlName() == null)
            return false;
        if (other.getRoutingControlName() != null && other.getRoutingControlName().equals(this.getRoutingControlName()) == false)
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

        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getControlPanelName() == null) ? 0 : getControlPanelName().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlName() == null) ? 0 : getRoutingControlName().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlState() == null) ? 0 : getRoutingControlState().hashCode());
        return hashCode;
    }

    @Override
    public RoutingControl clone() {
        try {
            return (RoutingControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycluster.model.transform.RoutingControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
