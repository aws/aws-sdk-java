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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet during
 * the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
 * traffic routing configuration. Only one update policy should be used in the deployment configuration. If no update
 * policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic shifting by default.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BlueGreenUpdatePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueGreenUpdatePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint
     * deployment.
     * </p>
     */
    private TrafficRoutingConfig trafficRoutingConfiguration;
    /**
     * <p>
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old
     * endpoint fleet. Default is 0.
     * </p>
     */
    private Integer terminationWaitInSeconds;
    /**
     * <p>
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting
     * time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     * </p>
     */
    private Integer maximumExecutionTimeoutInSeconds;

    /**
     * <p>
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint
     * deployment.
     * </p>
     * 
     * @param trafficRoutingConfiguration
     *        Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an
     *        endpoint deployment.
     */

    public void setTrafficRoutingConfiguration(TrafficRoutingConfig trafficRoutingConfiguration) {
        this.trafficRoutingConfiguration = trafficRoutingConfiguration;
    }

    /**
     * <p>
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint
     * deployment.
     * </p>
     * 
     * @return Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an
     *         endpoint deployment.
     */

    public TrafficRoutingConfig getTrafficRoutingConfiguration() {
        return this.trafficRoutingConfiguration;
    }

    /**
     * <p>
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint
     * deployment.
     * </p>
     * 
     * @param trafficRoutingConfiguration
     *        Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an
     *        endpoint deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenUpdatePolicy withTrafficRoutingConfiguration(TrafficRoutingConfig trafficRoutingConfiguration) {
        setTrafficRoutingConfiguration(trafficRoutingConfiguration);
        return this;
    }

    /**
     * <p>
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old
     * endpoint fleet. Default is 0.
     * </p>
     * 
     * @param terminationWaitInSeconds
     *        Additional waiting time in seconds after the completion of an endpoint deployment before terminating the
     *        old endpoint fleet. Default is 0.
     */

    public void setTerminationWaitInSeconds(Integer terminationWaitInSeconds) {
        this.terminationWaitInSeconds = terminationWaitInSeconds;
    }

    /**
     * <p>
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old
     * endpoint fleet. Default is 0.
     * </p>
     * 
     * @return Additional waiting time in seconds after the completion of an endpoint deployment before terminating the
     *         old endpoint fleet. Default is 0.
     */

    public Integer getTerminationWaitInSeconds() {
        return this.terminationWaitInSeconds;
    }

    /**
     * <p>
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old
     * endpoint fleet. Default is 0.
     * </p>
     * 
     * @param terminationWaitInSeconds
     *        Additional waiting time in seconds after the completion of an endpoint deployment before terminating the
     *        old endpoint fleet. Default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenUpdatePolicy withTerminationWaitInSeconds(Integer terminationWaitInSeconds) {
        setTerminationWaitInSeconds(terminationWaitInSeconds);
        return this;
    }

    /**
     * <p>
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting
     * time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     * </p>
     * 
     * @param maximumExecutionTimeoutInSeconds
     *        Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total
     *        waiting time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     */

    public void setMaximumExecutionTimeoutInSeconds(Integer maximumExecutionTimeoutInSeconds) {
        this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p>
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting
     * time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     * </p>
     * 
     * @return Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total
     *         waiting time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     */

    public Integer getMaximumExecutionTimeoutInSeconds() {
        return this.maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p>
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting
     * time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     * </p>
     * 
     * @param maximumExecutionTimeoutInSeconds
     *        Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total
     *        waiting time specified in <code>TerminationWaitInSeconds</code> and <code>WaitIntervalInSeconds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenUpdatePolicy withMaximumExecutionTimeoutInSeconds(Integer maximumExecutionTimeoutInSeconds) {
        setMaximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds);
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
        if (getTrafficRoutingConfiguration() != null)
            sb.append("TrafficRoutingConfiguration: ").append(getTrafficRoutingConfiguration()).append(",");
        if (getTerminationWaitInSeconds() != null)
            sb.append("TerminationWaitInSeconds: ").append(getTerminationWaitInSeconds()).append(",");
        if (getMaximumExecutionTimeoutInSeconds() != null)
            sb.append("MaximumExecutionTimeoutInSeconds: ").append(getMaximumExecutionTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueGreenUpdatePolicy == false)
            return false;
        BlueGreenUpdatePolicy other = (BlueGreenUpdatePolicy) obj;
        if (other.getTrafficRoutingConfiguration() == null ^ this.getTrafficRoutingConfiguration() == null)
            return false;
        if (other.getTrafficRoutingConfiguration() != null && other.getTrafficRoutingConfiguration().equals(this.getTrafficRoutingConfiguration()) == false)
            return false;
        if (other.getTerminationWaitInSeconds() == null ^ this.getTerminationWaitInSeconds() == null)
            return false;
        if (other.getTerminationWaitInSeconds() != null && other.getTerminationWaitInSeconds().equals(this.getTerminationWaitInSeconds()) == false)
            return false;
        if (other.getMaximumExecutionTimeoutInSeconds() == null ^ this.getMaximumExecutionTimeoutInSeconds() == null)
            return false;
        if (other.getMaximumExecutionTimeoutInSeconds() != null
                && other.getMaximumExecutionTimeoutInSeconds().equals(this.getMaximumExecutionTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficRoutingConfiguration() == null) ? 0 : getTrafficRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTerminationWaitInSeconds() == null) ? 0 : getTerminationWaitInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionTimeoutInSeconds() == null) ? 0 : getMaximumExecutionTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public BlueGreenUpdatePolicy clone() {
        try {
            return (BlueGreenUpdatePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.BlueGreenUpdatePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
