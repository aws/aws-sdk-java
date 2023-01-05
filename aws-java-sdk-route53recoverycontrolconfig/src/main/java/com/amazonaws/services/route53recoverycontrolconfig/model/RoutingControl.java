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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon
 * Route 53 health check, which can be used to control traffic routing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/RoutingControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * The name of the routing control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     */
    private String routingControlArn;
    /**
     * <p>
     * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param name
     *        The name of the routing control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @return The name of the routing control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param name
     *        The name of the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingControl withName(String name) {
        setName(name);
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
     * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @return The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     *         PENDING_DELETION.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public RoutingControl withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public RoutingControl withStatus(Status status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoutingControlArn() != null)
            sb.append("RoutingControlArn: ").append(getRoutingControlArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.RoutingControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
