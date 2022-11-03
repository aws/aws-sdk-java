/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. You can choose to specify
 * which events or message types to receive notifications for. You can also choose to specify which severity levels to
 * receive notifications for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/NotificationFilterConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationFilterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     */
    private java.util.List<String> severities;
    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     */
    private java.util.List<String> messageTypes;

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     * 
     * @return The severity levels that you want to receive notifications for. For example, you can choose to receive
     *         notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *         >Understanding insight severities</a>.
     * @see InsightSeverity
     */

    public java.util.List<String> getSeverities() {
        return severities;
    }

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     * 
     * @param severities
     *        The severity levels that you want to receive notifications for. For example, you can choose to receive
     *        notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a>.
     * @see InsightSeverity
     */

    public void setSeverities(java.util.Collection<String> severities) {
        if (severities == null) {
            this.severities = null;
            return;
        }

        this.severities = new java.util.ArrayList<String>(severities);
    }

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeverities(java.util.Collection)} or {@link #withSeverities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param severities
     *        The severity levels that you want to receive notifications for. For example, you can choose to receive
     *        notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public NotificationFilterConfig withSeverities(String... severities) {
        if (this.severities == null) {
            setSeverities(new java.util.ArrayList<String>(severities.length));
        }
        for (String ele : severities) {
            this.severities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     * 
     * @param severities
     *        The severity levels that you want to receive notifications for. For example, you can choose to receive
     *        notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public NotificationFilterConfig withSeverities(java.util.Collection<String> severities) {
        setSeverities(severities);
        return this;
    }

    /**
     * <p>
     * The severity levels that you want to receive notifications for. For example, you can choose to receive
     * notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a>.
     * </p>
     * 
     * @param severities
     *        The severity levels that you want to receive notifications for. For example, you can choose to receive
     *        notifications only for insights with <code>HIGH</code> and <code>MEDIUM</code> severity levels. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public NotificationFilterConfig withSeverities(InsightSeverity... severities) {
        java.util.ArrayList<String> severitiesCopy = new java.util.ArrayList<String>(severities.length);
        for (InsightSeverity value : severities) {
            severitiesCopy.add(value.toString());
        }
        if (getSeverities() == null) {
            setSeverities(severitiesCopy);
        } else {
            getSeverities().addAll(severitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     * 
     * @return The events that you want to receive notifications for. For example, you can choose to receive
     *         notifications only when the severity level is upgraded or a new insight is created.
     * @see NotificationMessageType
     */

    public java.util.List<String> getMessageTypes() {
        return messageTypes;
    }

    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     * 
     * @param messageTypes
     *        The events that you want to receive notifications for. For example, you can choose to receive
     *        notifications only when the severity level is upgraded or a new insight is created.
     * @see NotificationMessageType
     */

    public void setMessageTypes(java.util.Collection<String> messageTypes) {
        if (messageTypes == null) {
            this.messageTypes = null;
            return;
        }

        this.messageTypes = new java.util.ArrayList<String>(messageTypes);
    }

    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageTypes(java.util.Collection)} or {@link #withMessageTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param messageTypes
     *        The events that you want to receive notifications for. For example, you can choose to receive
     *        notifications only when the severity level is upgraded or a new insight is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationMessageType
     */

    public NotificationFilterConfig withMessageTypes(String... messageTypes) {
        if (this.messageTypes == null) {
            setMessageTypes(new java.util.ArrayList<String>(messageTypes.length));
        }
        for (String ele : messageTypes) {
            this.messageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     * 
     * @param messageTypes
     *        The events that you want to receive notifications for. For example, you can choose to receive
     *        notifications only when the severity level is upgraded or a new insight is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationMessageType
     */

    public NotificationFilterConfig withMessageTypes(java.util.Collection<String> messageTypes) {
        setMessageTypes(messageTypes);
        return this;
    }

    /**
     * <p>
     * The events that you want to receive notifications for. For example, you can choose to receive notifications only
     * when the severity level is upgraded or a new insight is created.
     * </p>
     * 
     * @param messageTypes
     *        The events that you want to receive notifications for. For example, you can choose to receive
     *        notifications only when the severity level is upgraded or a new insight is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationMessageType
     */

    public NotificationFilterConfig withMessageTypes(NotificationMessageType... messageTypes) {
        java.util.ArrayList<String> messageTypesCopy = new java.util.ArrayList<String>(messageTypes.length);
        for (NotificationMessageType value : messageTypes) {
            messageTypesCopy.add(value.toString());
        }
        if (getMessageTypes() == null) {
            setMessageTypes(messageTypesCopy);
        } else {
            getMessageTypes().addAll(messageTypesCopy);
        }
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
        if (getSeverities() != null)
            sb.append("Severities: ").append(getSeverities()).append(",");
        if (getMessageTypes() != null)
            sb.append("MessageTypes: ").append(getMessageTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationFilterConfig == false)
            return false;
        NotificationFilterConfig other = (NotificationFilterConfig) obj;
        if (other.getSeverities() == null ^ this.getSeverities() == null)
            return false;
        if (other.getSeverities() != null && other.getSeverities().equals(this.getSeverities()) == false)
            return false;
        if (other.getMessageTypes() == null ^ this.getMessageTypes() == null)
            return false;
        if (other.getMessageTypes() != null && other.getMessageTypes().equals(this.getMessageTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverities() == null) ? 0 : getSeverities().hashCode());
        hashCode = prime * hashCode + ((getMessageTypes() == null) ? 0 : getMessageTypes().hashCode());
        return hashCode;
    }

    @Override
    public NotificationFilterConfig clone() {
        try {
            return (NotificationFilterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.NotificationFilterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
