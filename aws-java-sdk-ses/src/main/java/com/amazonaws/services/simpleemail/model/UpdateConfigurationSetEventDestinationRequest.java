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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish
 * email sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that contains the event destination that you want to update.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The event destination object that you want to apply to the specified configuration set.
     * </p>
     */
    private EventDestination eventDestination;

    /**
     * <p>
     * The name of the configuration set that contains the event destination that you want to update.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that contains the event destination that you want to update.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that contains the event destination that you want to update.
     * </p>
     * 
     * @return The name of the configuration set that contains the event destination that you want to update.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that contains the event destination that you want to update.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that contains the event destination that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified configuration set.
     * </p>
     * 
     * @param eventDestination
     *        The event destination object that you want to apply to the specified configuration set.
     */

    public void setEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified configuration set.
     * </p>
     * 
     * @return The event destination object that you want to apply to the specified configuration set.
     */

    public EventDestination getEventDestination() {
        return this.eventDestination;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified configuration set.
     * </p>
     * 
     * @param eventDestination
     *        The event destination object that you want to apply to the specified configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetEventDestinationRequest withEventDestination(EventDestination eventDestination) {
        setEventDestination(eventDestination);
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
            sb.append("EventDestination: ").append(getEventDestination());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEventDestination() == null) ? 0 : getEventDestination().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationSetEventDestinationRequest clone() {
        return (UpdateConfigurationSetEventDestinationRequest) super.clone();
    }

}
