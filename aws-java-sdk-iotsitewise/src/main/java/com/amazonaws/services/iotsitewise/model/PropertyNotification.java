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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains asset property value notification information. When the notification state is enabled, IoT SiteWise
 * publishes property value updates to a unique MQTT topic. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting with
 * other services</a> in the <i>IoT SiteWise User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PropertyNotification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyNotification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MQTT topic to which IoT SiteWise publishes property value update notifications.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The current notification state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The MQTT topic to which IoT SiteWise publishes property value update notifications.
     * </p>
     * 
     * @param topic
     *        The MQTT topic to which IoT SiteWise publishes property value update notifications.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The MQTT topic to which IoT SiteWise publishes property value update notifications.
     * </p>
     * 
     * @return The MQTT topic to which IoT SiteWise publishes property value update notifications.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The MQTT topic to which IoT SiteWise publishes property value update notifications.
     * </p>
     * 
     * @param topic
     *        The MQTT topic to which IoT SiteWise publishes property value update notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyNotification withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * 
     * @param state
     *        The current notification state.
     * @see PropertyNotificationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * 
     * @return The current notification state.
     * @see PropertyNotificationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * 
     * @param state
     *        The current notification state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyNotificationState
     */

    public PropertyNotification withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * 
     * @param state
     *        The current notification state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyNotificationState
     */

    public PropertyNotification withState(PropertyNotificationState state) {
        this.state = state.toString();
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
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
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

        if (obj instanceof PropertyNotification == false)
            return false;
        PropertyNotification other = (PropertyNotification) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public PropertyNotification clone() {
        try {
            return (PropertyNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PropertyNotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
