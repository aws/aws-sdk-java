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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Currently, the <code>BlueGreenUpdatePolicy</code> API is not supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BlueGreenUpdatePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueGreenUpdatePolicy implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private TrafficRoutingConfig trafficRoutingConfiguration;
    /** <p/> */
    private Integer terminationWaitInSeconds;
    /** <p/> */
    private Integer maximumExecutionTimeoutInSeconds;

    /**
     * <p/>
     * 
     * @param trafficRoutingConfiguration
     */

    public void setTrafficRoutingConfiguration(TrafficRoutingConfig trafficRoutingConfiguration) {
        this.trafficRoutingConfiguration = trafficRoutingConfiguration;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public TrafficRoutingConfig getTrafficRoutingConfiguration() {
        return this.trafficRoutingConfiguration;
    }

    /**
     * <p/>
     * 
     * @param trafficRoutingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenUpdatePolicy withTrafficRoutingConfiguration(TrafficRoutingConfig trafficRoutingConfiguration) {
        setTrafficRoutingConfiguration(trafficRoutingConfiguration);
        return this;
    }

    /**
     * <p/>
     * 
     * @param terminationWaitInSeconds
     */

    public void setTerminationWaitInSeconds(Integer terminationWaitInSeconds) {
        this.terminationWaitInSeconds = terminationWaitInSeconds;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getTerminationWaitInSeconds() {
        return this.terminationWaitInSeconds;
    }

    /**
     * <p/>
     * 
     * @param terminationWaitInSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenUpdatePolicy withTerminationWaitInSeconds(Integer terminationWaitInSeconds) {
        setTerminationWaitInSeconds(terminationWaitInSeconds);
        return this;
    }

    /**
     * <p/>
     * 
     * @param maximumExecutionTimeoutInSeconds
     */

    public void setMaximumExecutionTimeoutInSeconds(Integer maximumExecutionTimeoutInSeconds) {
        this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getMaximumExecutionTimeoutInSeconds() {
        return this.maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p/>
     * 
     * @param maximumExecutionTimeoutInSeconds
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
