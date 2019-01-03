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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about whether instances in the original environment are terminated when a blue/green deployment is
 * successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BlueInstanceTerminationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueInstanceTerminationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the
     * original environment. The maximum setting is 2880 minutes (2 days).
     * </p>
     */
    private Integer terminationWaitTimeInMinutes;

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to take on instances in the original environment after a successful blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TERMINATE: Instances are terminated after a specified wait time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from
     *        the deployment group.
     *        </p>
     *        </li>
     * @see InstanceAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action to take on instances in the original environment after a successful blue/green deployment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TERMINATE: Instances are terminated after a specified wait time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed
     *         from the deployment group.
     *         </p>
     *         </li>
     * @see InstanceAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to take on instances in the original environment after a successful blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TERMINATE: Instances are terminated after a specified wait time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from
     *        the deployment group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAction
     */

    public BlueInstanceTerminationOption withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to take on instances in the original environment after a successful blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TERMINATE: Instances are terminated after a specified wait time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from
     *        the deployment group.
     *        </p>
     *        </li>
     * @see InstanceAction
     */

    public void setAction(InstanceAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TERMINATE: Instances are terminated after a specified wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the
     * deployment group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to take on instances in the original environment after a successful blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TERMINATE: Instances are terminated after a specified wait time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from
     *        the deployment group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAction
     */

    public BlueInstanceTerminationOption withAction(InstanceAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the
     * original environment. The maximum setting is 2880 minutes (2 days).
     * </p>
     * 
     * @param terminationWaitTimeInMinutes
     *        The number of minutes to wait after a successful blue/green deployment before terminating instances from
     *        the original environment. The maximum setting is 2880 minutes (2 days).
     */

    public void setTerminationWaitTimeInMinutes(Integer terminationWaitTimeInMinutes) {
        this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the
     * original environment. The maximum setting is 2880 minutes (2 days).
     * </p>
     * 
     * @return The number of minutes to wait after a successful blue/green deployment before terminating instances from
     *         the original environment. The maximum setting is 2880 minutes (2 days).
     */

    public Integer getTerminationWaitTimeInMinutes() {
        return this.terminationWaitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the
     * original environment. The maximum setting is 2880 minutes (2 days).
     * </p>
     * 
     * @param terminationWaitTimeInMinutes
     *        The number of minutes to wait after a successful blue/green deployment before terminating instances from
     *        the original environment. The maximum setting is 2880 minutes (2 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueInstanceTerminationOption withTerminationWaitTimeInMinutes(Integer terminationWaitTimeInMinutes) {
        setTerminationWaitTimeInMinutes(terminationWaitTimeInMinutes);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTerminationWaitTimeInMinutes() != null)
            sb.append("TerminationWaitTimeInMinutes: ").append(getTerminationWaitTimeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueInstanceTerminationOption == false)
            return false;
        BlueInstanceTerminationOption other = (BlueInstanceTerminationOption) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTerminationWaitTimeInMinutes() == null ^ this.getTerminationWaitTimeInMinutes() == null)
            return false;
        if (other.getTerminationWaitTimeInMinutes() != null && other.getTerminationWaitTimeInMinutes().equals(this.getTerminationWaitTimeInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTerminationWaitTimeInMinutes() == null) ? 0 : getTerminationWaitTimeInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public BlueInstanceTerminationOption clone() {
        try {
            return (BlueInstanceTerminationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.BlueInstanceTerminationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
