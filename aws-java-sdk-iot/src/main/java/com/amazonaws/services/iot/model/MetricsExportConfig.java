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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set configurations for metrics export.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsExportConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     * </p>
     */
    private String mqttTopic;
    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the role and
     * publish messages on your behalf.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     * </p>
     * 
     * @param mqttTopic
     *        The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     */

    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     * </p>
     * 
     * @return The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     */

    public String getMqttTopic() {
        return this.mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     * </p>
     * 
     * @param mqttTopic
     *        The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsExportConfig withMqttTopic(String mqttTopic) {
        setMqttTopic(mqttTopic);
        return this;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the role and
     * publish messages on your behalf.
     * </p>
     * 
     * @param roleArn
     *        This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the
     *        role and publish messages on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the role and
     * publish messages on your behalf.
     * </p>
     * 
     * @return This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the
     *         role and publish messages on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the role and
     * publish messages on your behalf.
     * </p>
     * 
     * @param roleArn
     *        This role ARN has permission to publish MQTT messages, after which Device Defender Detect can assume the
     *        role and publish messages on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsExportConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getMqttTopic() != null)
            sb.append("MqttTopic: ").append(getMqttTopic()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsExportConfig == false)
            return false;
        MetricsExportConfig other = (MetricsExportConfig) obj;
        if (other.getMqttTopic() == null ^ this.getMqttTopic() == null)
            return false;
        if (other.getMqttTopic() != null && other.getMqttTopic().equals(this.getMqttTopic()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMqttTopic() == null) ? 0 : getMqttTopic().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public MetricsExportConfig clone() {
        try {
            return (MetricsExportConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MetricsExportConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
