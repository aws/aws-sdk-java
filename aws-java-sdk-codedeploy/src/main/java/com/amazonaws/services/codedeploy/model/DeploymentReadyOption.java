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
 * Information about how traffic is rerouted to instances in a replacement environment in a blue/green deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeploymentReadyOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentReadyOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     */
    private String actionOnTimeout;
    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is
     * not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     * </p>
     */
    private Integer waitTimeInMinutes;

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionOnTimeout
     *        Information about when to reroute traffic from an original environment to a replacement environment in a
     *        blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application
     *        revision is installed on the instances in the replacement environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started
     *        using <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait
     *        period, the deployment status is changed to Stopped.
     *        </p>
     *        </li>
     * @see DeploymentReadyAction
     */

    public void setActionOnTimeout(String actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about when to reroute traffic from an original environment to a replacement environment in a
     *         blue/green deployment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application
     *         revision is installed on the instances in the replacement environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started
     *         using <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait
     *         period, the deployment status is changed to Stopped.
     *         </p>
     *         </li>
     * @see DeploymentReadyAction
     */

    public String getActionOnTimeout() {
        return this.actionOnTimeout;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionOnTimeout
     *        Information about when to reroute traffic from an original environment to a replacement environment in a
     *        blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application
     *        revision is installed on the instances in the replacement environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started
     *        using <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait
     *        period, the deployment status is changed to Stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentReadyAction
     */

    public DeploymentReadyOption withActionOnTimeout(String actionOnTimeout) {
        setActionOnTimeout(actionOnTimeout);
        return this;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionOnTimeout
     *        Information about when to reroute traffic from an original environment to a replacement environment in a
     *        blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application
     *        revision is installed on the instances in the replacement environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started
     *        using <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait
     *        period, the deployment status is changed to Stopped.
     *        </p>
     *        </li>
     * @see DeploymentReadyAction
     */

    public void setActionOnTimeout(DeploymentReadyAction actionOnTimeout) {
        withActionOnTimeout(actionOnTimeout);
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to a replacement environment in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision
     * is installed on the instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using
     * <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionOnTimeout
     *        Information about when to reroute traffic from an original environment to a replacement environment in a
     *        blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application
     *        revision is installed on the instances in the replacement environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started
     *        using <a>ContinueDeployment</a>. If traffic rerouting is not started before the end of the specified wait
     *        period, the deployment status is changed to Stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentReadyAction
     */

    public DeploymentReadyOption withActionOnTimeout(DeploymentReadyAction actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout.toString();
        return this;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is
     * not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     * </p>
     * 
     * @param waitTimeInMinutes
     *        The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if
     *        rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     */

    public void setWaitTimeInMinutes(Integer waitTimeInMinutes) {
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is
     * not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     * </p>
     * 
     * @return The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if
     *         rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     */

    public Integer getWaitTimeInMinutes() {
        return this.waitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is
     * not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     * </p>
     * 
     * @param waitTimeInMinutes
     *        The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if
     *        rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentReadyOption withWaitTimeInMinutes(Integer waitTimeInMinutes) {
        setWaitTimeInMinutes(waitTimeInMinutes);
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
        if (getActionOnTimeout() != null)
            sb.append("ActionOnTimeout: ").append(getActionOnTimeout()).append(",");
        if (getWaitTimeInMinutes() != null)
            sb.append("WaitTimeInMinutes: ").append(getWaitTimeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentReadyOption == false)
            return false;
        DeploymentReadyOption other = (DeploymentReadyOption) obj;
        if (other.getActionOnTimeout() == null ^ this.getActionOnTimeout() == null)
            return false;
        if (other.getActionOnTimeout() != null && other.getActionOnTimeout().equals(this.getActionOnTimeout()) == false)
            return false;
        if (other.getWaitTimeInMinutes() == null ^ this.getWaitTimeInMinutes() == null)
            return false;
        if (other.getWaitTimeInMinutes() != null && other.getWaitTimeInMinutes().equals(this.getWaitTimeInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionOnTimeout() == null) ? 0 : getActionOnTimeout().hashCode());
        hashCode = prime * hashCode + ((getWaitTimeInMinutes() == null) ? 0 : getWaitTimeInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentReadyOption clone() {
        try {
            return (DeploymentReadyOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DeploymentReadyOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
