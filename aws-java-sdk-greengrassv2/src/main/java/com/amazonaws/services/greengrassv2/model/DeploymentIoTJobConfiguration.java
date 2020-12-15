/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about an AWS IoT job configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeploymentIoTJobConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentIoTJobConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rollout configuration for the job. This configuration defines the rate at which the job rolls out to the
     * fleet of target devices.
     * </p>
     */
    private IoTJobExecutionsRolloutConfig jobExecutionsRolloutConfig;
    /**
     * <p>
     * The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     * </p>
     */
    private IoTJobAbortConfig abortConfig;
    /**
     * <p>
     * The timeout configuration for the job. This configuration defines the amount of time each device has to complete
     * the job.
     * </p>
     */
    private IoTJobTimeoutConfig timeoutConfig;

    /**
     * <p>
     * The rollout configuration for the job. This configuration defines the rate at which the job rolls out to the
     * fleet of target devices.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        The rollout configuration for the job. This configuration defines the rate at which the job rolls out to
     *        the fleet of target devices.
     */

    public void setJobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * The rollout configuration for the job. This configuration defines the rate at which the job rolls out to the
     * fleet of target devices.
     * </p>
     * 
     * @return The rollout configuration for the job. This configuration defines the rate at which the job rolls out to
     *         the fleet of target devices.
     */

    public IoTJobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * The rollout configuration for the job. This configuration defines the rate at which the job rolls out to the
     * fleet of target devices.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        The rollout configuration for the job. This configuration defines the rate at which the job rolls out to
     *        the fleet of target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentIoTJobConfiguration withJobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        setJobExecutionsRolloutConfig(jobExecutionsRolloutConfig);
        return this;
    }

    /**
     * <p>
     * The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     * </p>
     * 
     * @param abortConfig
     *        The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     */

    public void setAbortConfig(IoTJobAbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     * </p>
     * 
     * @return The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     */

    public IoTJobAbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * <p>
     * The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     * </p>
     * 
     * @param abortConfig
     *        The stop configuration for the job. This configuration defines when and how to stop a job rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentIoTJobConfiguration withAbortConfig(IoTJobAbortConfig abortConfig) {
        setAbortConfig(abortConfig);
        return this;
    }

    /**
     * <p>
     * The timeout configuration for the job. This configuration defines the amount of time each device has to complete
     * the job.
     * </p>
     * 
     * @param timeoutConfig
     *        The timeout configuration for the job. This configuration defines the amount of time each device has to
     *        complete the job.
     */

    public void setTimeoutConfig(IoTJobTimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * The timeout configuration for the job. This configuration defines the amount of time each device has to complete
     * the job.
     * </p>
     * 
     * @return The timeout configuration for the job. This configuration defines the amount of time each device has to
     *         complete the job.
     */

    public IoTJobTimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * <p>
     * The timeout configuration for the job. This configuration defines the amount of time each device has to complete
     * the job.
     * </p>
     * 
     * @param timeoutConfig
     *        The timeout configuration for the job. This configuration defines the amount of time each device has to
     *        complete the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentIoTJobConfiguration withTimeoutConfig(IoTJobTimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
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
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("JobExecutionsRolloutConfig: ").append(getJobExecutionsRolloutConfig()).append(",");
        if (getAbortConfig() != null)
            sb.append("AbortConfig: ").append(getAbortConfig()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentIoTJobConfiguration == false)
            return false;
        DeploymentIoTJobConfiguration other = (DeploymentIoTJobConfiguration) obj;
        if (other.getJobExecutionsRolloutConfig() == null ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null && other.getJobExecutionsRolloutConfig().equals(this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentIoTJobConfiguration clone() {
        try {
            return (DeploymentIoTJobConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.DeploymentIoTJobConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
