/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * UpdateConfigurationSetEventDestinationRequest
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/UpdateConfigurationSetEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ConfigurationSetName */
    private String configurationSetName;

    private EventDestinationDefinition eventDestination;
    /** EventDestinationName */
    private String eventDestinationName;

    /**
     * ConfigurationSetName
     * 
     * @param configurationSetName
     *        ConfigurationSetName
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * ConfigurationSetName
     * 
     * @return ConfigurationSetName
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * ConfigurationSetName
     * 
     * @param configurationSetName
     *        ConfigurationSetName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * @param eventDestination
     */

    public void setEventDestination(EventDestinationDefinition eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * @return
     */

    public EventDestinationDefinition getEventDestination() {
        return this.eventDestination;
    }

    /**
     * @param eventDestination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetEventDestinationRequest withEventDestination(EventDestinationDefinition eventDestination) {
        setEventDestination(eventDestination);
        return this;
    }

    /**
     * EventDestinationName
     * 
     * @param eventDestinationName
     *        EventDestinationName
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * EventDestinationName
     * 
     * @return EventDestinationName
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * EventDestinationName
     * 
     * @param eventDestinationName
     *        EventDestinationName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetEventDestinationRequest withEventDestinationName(String eventDestinationName) {
        setEventDestinationName(eventDestinationName);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getEventDestination() != null)
            sb.append("EventDestination: ").append(getEventDestination()).append(",");
        if (getEventDestinationName() != null)
            sb.append("EventDestinationName: ").append(getEventDestinationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationSetEventDestinationRequest == false)
            return false;
        UpdateConfigurationSetEventDestinationRequest other = (UpdateConfigurationSetEventDestinationRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestination() == null ^ this.getEventDestination() == null)
            return false;
        if (other.getEventDestination() != null && other.getEventDestination().equals(this.getEventDestination()) == false)
            return false;
        if (other.getEventDestinationName() == null ^ this.getEventDestinationName() == null)
            return false;
        if (other.getEventDestinationName() != null && other.getEventDestinationName().equals(this.getEventDestinationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEventDestination() == null) ? 0 : getEventDestination().hashCode());
        hashCode = prime * hashCode + ((getEventDestinationName() == null) ? 0 : getEventDestinationName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationSetEventDestinationRequest clone() {
        return (UpdateConfigurationSetEventDestinationRequest) super.clone();
    }

}
