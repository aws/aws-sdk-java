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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The details of the routing control that you're creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoutingControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     * </p>
     */
    private String clusterArn;
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
    private String routingControlName;

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *        action, specify a client token in the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @return A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *         action, specify a client token in the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *        action, specify a client token in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingControlRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that includes the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingControlRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

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

    public CreateRoutingControlRequest withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
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

    public CreateRoutingControlRequest withRoutingControlName(String routingControlName) {
        setRoutingControlName(routingControlName);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getRoutingControlName() != null)
            sb.append("RoutingControlName: ").append(getRoutingControlName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoutingControlRequest == false)
            return false;
        CreateRoutingControlRequest other = (CreateRoutingControlRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getRoutingControlName() == null ^ this.getRoutingControlName() == null)
            return false;
        if (other.getRoutingControlName() != null && other.getRoutingControlName().equals(this.getRoutingControlName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlName() == null) ? 0 : getRoutingControlName().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoutingControlRequest clone() {
        return (CreateRoutingControlRequest) super.clone();
    }

}
