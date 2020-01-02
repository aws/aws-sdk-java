/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutEventsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventsConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private EventsConfiguration eventsConfiguration;

    /**
     * @param eventsConfiguration
     */

    public void setEventsConfiguration(EventsConfiguration eventsConfiguration) {
        this.eventsConfiguration = eventsConfiguration;
    }

    /**
     * @return
     */

    public EventsConfiguration getEventsConfiguration() {
        return this.eventsConfiguration;
    }

    /**
     * @param eventsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsConfigurationResult withEventsConfiguration(EventsConfiguration eventsConfiguration) {
        setEventsConfiguration(eventsConfiguration);
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
        if (getEventsConfiguration() != null)
            sb.append("EventsConfiguration: ").append(getEventsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsConfigurationResult == false)
            return false;
        PutEventsConfigurationResult other = (PutEventsConfigurationResult) obj;
        if (other.getEventsConfiguration() == null ^ this.getEventsConfiguration() == null)
            return false;
        if (other.getEventsConfiguration() != null && other.getEventsConfiguration().equals(this.getEventsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventsConfiguration() == null) ? 0 : getEventsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutEventsConfigurationResult clone() {
        try {
            return (PutEventsConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
