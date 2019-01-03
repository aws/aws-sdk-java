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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to add an event destination to a configuration set.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSetEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationSetEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to add an event destination to.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * A name that identifies the event destination within the configuration set.
     * </p>
     */
    private String eventDestinationName;
    /**
     * <p>
     * An object that defines the event destination.
     * </p>
     */
    private EventDestinationDefinition eventDestination;

    /**
     * <p>
     * The name of the configuration set that you want to add an event destination to.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to add an event destination to.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to add an event destination to.
     * </p>
     * 
     * @return The name of the configuration set that you want to add an event destination to.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to add an event destination to.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to add an event destination to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * A name that identifies the event destination within the configuration set.
     * </p>
     * 
     * @param eventDestinationName
     *        A name that identifies the event destination within the configuration set.
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * <p>
     * A name that identifies the event destination within the configuration set.
     * </p>
     * 
     * @return A name that identifies the event destination within the configuration set.
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * <p>
     * A name that identifies the event destination within the configuration set.
     * </p>
     * 
     * @param eventDestinationName
     *        A name that identifies the event destination within the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetEventDestinationRequest withEventDestinationName(String eventDestinationName) {
        setEventDestinationName(eventDestinationName);
        return this;
    }

    /**
     * <p>
     * An object that defines the event destination.
     * </p>
     * 
     * @param eventDestination
     *        An object that defines the event destination.
     */

    public void setEventDestination(EventDestinationDefinition eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * <p>
     * An object that defines the event destination.
     * </p>
     * 
     * @return An object that defines the event destination.
     */

    public EventDestinationDefinition getEventDestination() {
        return this.eventDestination;
    }

    /**
     * <p>
     * An object that defines the event destination.
     * </p>
     * 
     * @param eventDestination
     *        An object that defines the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetEventDestinationRequest withEventDestination(EventDestinationDefinition eventDestination) {
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
        if (getEventDestinationName() != null)
            sb.append("EventDestinationName: ").append(getEventDestinationName()).append(",");
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

        if (obj instanceof CreateConfigurationSetEventDestinationRequest == false)
            return false;
        CreateConfigurationSetEventDestinationRequest other = (CreateConfigurationSetEventDestinationRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestinationName() == null ^ this.getEventDestinationName() == null)
            return false;
        if (other.getEventDestinationName() != null && other.getEventDestinationName().equals(this.getEventDestinationName()) == false)
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
        hashCode = prime * hashCode + ((getEventDestinationName() == null) ? 0 : getEventDestinationName().hashCode());
        hashCode = prime * hashCode + ((getEventDestination() == null) ? 0 : getEventDestination().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationSetEventDestinationRequest clone() {
        return (CreateConfigurationSetEventDestinationRequest) super.clone();
    }

}
