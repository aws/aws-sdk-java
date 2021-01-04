/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about how long a component on a core device can validate its configuration updates before it
 * times out. Components can use the <a href=
 * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetovalidateconfigurationupdates"
 * >SubscribeToValidateConfigurationUpdates</a> IPC operation to receive notifications when a deployment specifies a
 * configuration update. Then, components can respond with the <a href=
 * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-sendconfigurationvalidityreport"
 * >SendConfigurationValidityReport</a> IPC operation. For more information, see the <a
 * href="https://docs.aws.amazon.com/greengrass/v2/latest/developerguide/create-deployments.html">Create deployments</a>
 * in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeploymentConfigurationValidationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfigurationValidationPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time in seconds that a component can validate its configuration updates. If the validation time
     * exceeds this timeout, then the deployment proceeds for the device.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     */
    private Integer timeoutInSeconds;

    /**
     * <p>
     * The amount of time in seconds that a component can validate its configuration updates. If the validation time
     * exceeds this timeout, then the deployment proceeds for the device.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time in seconds that a component can validate its configuration updates. If the validation
     *        time exceeds this timeout, then the deployment proceeds for the device.</p>
     *        <p>
     *        Default: <code>30</code>
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds that a component can validate its configuration updates. If the validation time
     * exceeds this timeout, then the deployment proceeds for the device.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @return The amount of time in seconds that a component can validate its configuration updates. If the validation
     *         time exceeds this timeout, then the deployment proceeds for the device.</p>
     *         <p>
     *         Default: <code>30</code>
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds that a component can validate its configuration updates. If the validation time
     * exceeds this timeout, then the deployment proceeds for the device.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time in seconds that a component can validate its configuration updates. If the validation
     *        time exceeds this timeout, then the deployment proceeds for the device.</p>
     *        <p>
     *        Default: <code>30</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfigurationValidationPolicy withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfigurationValidationPolicy == false)
            return false;
        DeploymentConfigurationValidationPolicy other = (DeploymentConfigurationValidationPolicy) obj;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfigurationValidationPolicy clone() {
        try {
            return (DeploymentConfigurationValidationPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.DeploymentConfigurationValidationPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
