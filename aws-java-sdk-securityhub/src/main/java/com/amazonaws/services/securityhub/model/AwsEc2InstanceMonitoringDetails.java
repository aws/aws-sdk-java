/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type of monitoring that’s turned on for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2InstanceMonitoringDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceMonitoringDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     * </p>
     * 
     * @param state
     *        Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     * </p>
     * 
     * @return Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     * </p>
     * 
     * @param state
     *        Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMonitoringDetails withState(String state) {
        setState(state);
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceMonitoringDetails == false)
            return false;
        AwsEc2InstanceMonitoringDetails other = (AwsEc2InstanceMonitoringDetails) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2InstanceMonitoringDetails clone() {
        try {
            return (AwsEc2InstanceMonitoringDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2InstanceMonitoringDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
