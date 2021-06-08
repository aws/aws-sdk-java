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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/TriggerConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TriggerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     */
    private String triggerType;
    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     * settings only apply to the <code>Scheduled</code> trigger type.
     * </p>
     */
    private TriggerProperties triggerProperties;

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @see TriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @return Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *         <code>Event</code>.
     * @see TriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public TriggerConfig withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public TriggerConfig withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     * settings only apply to the <code>Scheduled</code> trigger type.
     * </p>
     * 
     * @param triggerProperties
     *        Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     *        settings only apply to the <code>Scheduled</code> trigger type.
     */

    public void setTriggerProperties(TriggerProperties triggerProperties) {
        this.triggerProperties = triggerProperties;
    }

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     * settings only apply to the <code>Scheduled</code> trigger type.
     * </p>
     * 
     * @return Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     *         settings only apply to the <code>Scheduled</code> trigger type.
     */

    public TriggerProperties getTriggerProperties() {
        return this.triggerProperties;
    }

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     * settings only apply to the <code>Scheduled</code> trigger type.
     * </p>
     * 
     * @param triggerProperties
     *        Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these
     *        settings only apply to the <code>Scheduled</code> trigger type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerConfig withTriggerProperties(TriggerProperties triggerProperties) {
        setTriggerProperties(triggerProperties);
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
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType()).append(",");
        if (getTriggerProperties() != null)
            sb.append("TriggerProperties: ").append(getTriggerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TriggerConfig == false)
            return false;
        TriggerConfig other = (TriggerConfig) obj;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
            return false;
        if (other.getTriggerProperties() == null ^ this.getTriggerProperties() == null)
            return false;
        if (other.getTriggerProperties() != null && other.getTriggerProperties().equals(this.getTriggerProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        hashCode = prime * hashCode + ((getTriggerProperties() == null) ? 0 : getTriggerProperties().hashCode());
        return hashCode;
    }

    @Override
    public TriggerConfig clone() {
        try {
            return (TriggerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.TriggerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
