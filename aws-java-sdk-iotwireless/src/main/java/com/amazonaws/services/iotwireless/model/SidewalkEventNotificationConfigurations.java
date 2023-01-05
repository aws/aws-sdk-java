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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <code>SidewalkEventNotificationConfigurations</code> object, which is the event configuration object for
 * Sidewalk-related event topics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkEventNotificationConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkEventNotificationConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes whether the Amazon ID event topic is enabled or disabled.
     * </p>
     */
    private String amazonIdEventTopic;

    /**
     * <p>
     * Denotes whether the Amazon ID event topic is enabled or disabled.
     * </p>
     * 
     * @param amazonIdEventTopic
     *        Denotes whether the Amazon ID event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public void setAmazonIdEventTopic(String amazonIdEventTopic) {
        this.amazonIdEventTopic = amazonIdEventTopic;
    }

    /**
     * <p>
     * Denotes whether the Amazon ID event topic is enabled or disabled.
     * </p>
     * 
     * @return Denotes whether the Amazon ID event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public String getAmazonIdEventTopic() {
        return this.amazonIdEventTopic;
    }

    /**
     * <p>
     * Denotes whether the Amazon ID event topic is enabled or disabled.
     * </p>
     * 
     * @param amazonIdEventTopic
     *        Denotes whether the Amazon ID event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public SidewalkEventNotificationConfigurations withAmazonIdEventTopic(String amazonIdEventTopic) {
        setAmazonIdEventTopic(amazonIdEventTopic);
        return this;
    }

    /**
     * <p>
     * Denotes whether the Amazon ID event topic is enabled or disabled.
     * </p>
     * 
     * @param amazonIdEventTopic
     *        Denotes whether the Amazon ID event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public SidewalkEventNotificationConfigurations withAmazonIdEventTopic(EventNotificationTopicStatus amazonIdEventTopic) {
        this.amazonIdEventTopic = amazonIdEventTopic.toString();
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
        if (getAmazonIdEventTopic() != null)
            sb.append("AmazonIdEventTopic: ").append(getAmazonIdEventTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkEventNotificationConfigurations == false)
            return false;
        SidewalkEventNotificationConfigurations other = (SidewalkEventNotificationConfigurations) obj;
        if (other.getAmazonIdEventTopic() == null ^ this.getAmazonIdEventTopic() == null)
            return false;
        if (other.getAmazonIdEventTopic() != null && other.getAmazonIdEventTopic().equals(this.getAmazonIdEventTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonIdEventTopic() == null) ? 0 : getAmazonIdEventTopic().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkEventNotificationConfigurations clone() {
        try {
            return (SidewalkEventNotificationConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkEventNotificationConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
