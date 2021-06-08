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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of alarm state changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmCapabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm
     * model.
     * </p>
     */
    private InitializationConfiguration initializationConfiguration;
    /**
     * <p>
     * Specifies whether to get notified for alarm state changes.
     * </p>
     */
    private AcknowledgeFlow acknowledgeFlow;

    /**
     * <p>
     * Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm
     * model.
     * </p>
     * 
     * @param initializationConfiguration
     *        Specifies the default alarm state. The configuration applies to all alarms that were created based on this
     *        alarm model.
     */

    public void setInitializationConfiguration(InitializationConfiguration initializationConfiguration) {
        this.initializationConfiguration = initializationConfiguration;
    }

    /**
     * <p>
     * Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm
     * model.
     * </p>
     * 
     * @return Specifies the default alarm state. The configuration applies to all alarms that were created based on
     *         this alarm model.
     */

    public InitializationConfiguration getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    /**
     * <p>
     * Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm
     * model.
     * </p>
     * 
     * @param initializationConfiguration
     *        Specifies the default alarm state. The configuration applies to all alarms that were created based on this
     *        alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmCapabilities withInitializationConfiguration(InitializationConfiguration initializationConfiguration) {
        setInitializationConfiguration(initializationConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies whether to get notified for alarm state changes.
     * </p>
     * 
     * @param acknowledgeFlow
     *        Specifies whether to get notified for alarm state changes.
     */

    public void setAcknowledgeFlow(AcknowledgeFlow acknowledgeFlow) {
        this.acknowledgeFlow = acknowledgeFlow;
    }

    /**
     * <p>
     * Specifies whether to get notified for alarm state changes.
     * </p>
     * 
     * @return Specifies whether to get notified for alarm state changes.
     */

    public AcknowledgeFlow getAcknowledgeFlow() {
        return this.acknowledgeFlow;
    }

    /**
     * <p>
     * Specifies whether to get notified for alarm state changes.
     * </p>
     * 
     * @param acknowledgeFlow
     *        Specifies whether to get notified for alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmCapabilities withAcknowledgeFlow(AcknowledgeFlow acknowledgeFlow) {
        setAcknowledgeFlow(acknowledgeFlow);
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
        if (getInitializationConfiguration() != null)
            sb.append("InitializationConfiguration: ").append(getInitializationConfiguration()).append(",");
        if (getAcknowledgeFlow() != null)
            sb.append("AcknowledgeFlow: ").append(getAcknowledgeFlow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmCapabilities == false)
            return false;
        AlarmCapabilities other = (AlarmCapabilities) obj;
        if (other.getInitializationConfiguration() == null ^ this.getInitializationConfiguration() == null)
            return false;
        if (other.getInitializationConfiguration() != null && other.getInitializationConfiguration().equals(this.getInitializationConfiguration()) == false)
            return false;
        if (other.getAcknowledgeFlow() == null ^ this.getAcknowledgeFlow() == null)
            return false;
        if (other.getAcknowledgeFlow() != null && other.getAcknowledgeFlow().equals(this.getAcknowledgeFlow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitializationConfiguration() == null) ? 0 : getInitializationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAcknowledgeFlow() == null) ? 0 : getAcknowledgeFlow().hashCode());
        return hashCode;
    }

    @Override
    public AlarmCapabilities clone() {
        try {
            return (AlarmCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
