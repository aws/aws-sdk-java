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
 * A control panel represents a group of routing controls that can be changed together in a single transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ControlPanel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlPanel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel
     * for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control
     * panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to
     * false.
     * </p>
     */
    private Boolean defaultControlPanel;
    /**
     * <p>
     * The name of the control panel. You can use any non-white space character in the name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of routing controls in the control panel.
     * </p>
     */
    private Integer routingControlCount;
    /**
     * <p>
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that includes the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPanel withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the control panel.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPanel withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel
     * for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control
     * panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to
     * false.
     * </p>
     * 
     * @param defaultControlPanel
     *        A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control
     *        panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a
     *        control panel, and sets this flag for that control panel. If you create a control panel yourself, this
     *        flag is set to false.
     */

    public void setDefaultControlPanel(Boolean defaultControlPanel) {
        this.defaultControlPanel = defaultControlPanel;
    }

    /**
     * <p>
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel
     * for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control
     * panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to
     * false.
     * </p>
     * 
     * @return A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control
     *         panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a
     *         control panel, and sets this flag for that control panel. If you create a control panel yourself, this
     *         flag is set to false.
     */

    public Boolean getDefaultControlPanel() {
        return this.defaultControlPanel;
    }

    /**
     * <p>
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel
     * for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control
     * panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to
     * false.
     * </p>
     * 
     * @param defaultControlPanel
     *        A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control
     *        panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a
     *        control panel, and sets this flag for that control panel. If you create a control panel yourself, this
     *        flag is set to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPanel withDefaultControlPanel(Boolean defaultControlPanel) {
        setDefaultControlPanel(defaultControlPanel);
        return this;
    }

    /**
     * <p>
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel
     * for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control
     * panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to
     * false.
     * </p>
     * 
     * @return A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control
     *         panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a
     *         control panel, and sets this flag for that control panel. If you create a control panel yourself, this
     *         flag is set to false.
     */

    public Boolean isDefaultControlPanel() {
        return this.defaultControlPanel;
    }

    /**
     * <p>
     * The name of the control panel. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name of the control panel. You can use any non-white space character in the name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the control panel. You can use any non-white space character in the name.
     * </p>
     * 
     * @return The name of the control panel. You can use any non-white space character in the name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the control panel. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name of the control panel. You can use any non-white space character in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPanel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of routing controls in the control panel.
     * </p>
     * 
     * @param routingControlCount
     *        The number of routing controls in the control panel.
     */

    public void setRoutingControlCount(Integer routingControlCount) {
        this.routingControlCount = routingControlCount;
    }

    /**
     * <p>
     * The number of routing controls in the control panel.
     * </p>
     * 
     * @return The number of routing controls in the control panel.
     */

    public Integer getRoutingControlCount() {
        return this.routingControlCount;
    }

    /**
     * <p>
     * The number of routing controls in the control panel.
     * </p>
     * 
     * @param routingControlCount
     *        The number of routing controls in the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPanel withRoutingControlCount(Integer routingControlCount) {
        setRoutingControlCount(routingControlCount);
        return this;
    }

    /**
     * <p>
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @return The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED,
     *         PENDING_DELETION.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ControlPanel withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ControlPanel withStatus(Status status) {
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getDefaultControlPanel() != null)
            sb.append("DefaultControlPanel: ").append(getDefaultControlPanel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoutingControlCount() != null)
            sb.append("RoutingControlCount: ").append(getRoutingControlCount()).append(",");
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

        if (obj instanceof ControlPanel == false)
            return false;
        ControlPanel other = (ControlPanel) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getDefaultControlPanel() == null ^ this.getDefaultControlPanel() == null)
            return false;
        if (other.getDefaultControlPanel() != null && other.getDefaultControlPanel().equals(this.getDefaultControlPanel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoutingControlCount() == null ^ this.getRoutingControlCount() == null)
            return false;
        if (other.getRoutingControlCount() != null && other.getRoutingControlCount().equals(this.getRoutingControlCount()) == false)
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

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultControlPanel() == null) ? 0 : getDefaultControlPanel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlCount() == null) ? 0 : getRoutingControlCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ControlPanel clone() {
        try {
            return (ControlPanel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.ControlPanelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
