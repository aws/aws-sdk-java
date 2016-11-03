/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the details of a configuration set. Configuration sets enable you to publish email sending events. For
 * information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 */
public class DescribeConfigurationSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration set object associated with the specified configuration set.
     * </p>
     */
    private ConfigurationSet configurationSet;
    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventDestination> eventDestinations;

    /**
     * <p>
     * The configuration set object associated with the specified configuration set.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set object associated with the specified configuration set.
     */

    public void setConfigurationSet(ConfigurationSet configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set object associated with the specified configuration set.
     * </p>
     * 
     * @return The configuration set object associated with the specified configuration set.
     */

    public ConfigurationSet getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * <p>
     * The configuration set object associated with the specified configuration set.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set object associated with the specified configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSetResult withConfigurationSet(ConfigurationSet configurationSet) {
        setConfigurationSet(configurationSet);
        return this;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * 
     * @return A list of event destinations associated with the configuration set.
     */

    public java.util.List<EventDestination> getEventDestinations() {
        if (eventDestinations == null) {
            eventDestinations = new com.amazonaws.internal.SdkInternalList<EventDestination>();
        }
        return eventDestinations;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * 
     * @param eventDestinations
     *        A list of event destinations associated with the configuration set.
     */

    public void setEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        if (eventDestinations == null) {
            this.eventDestinations = null;
            return;
        }

        this.eventDestinations = new com.amazonaws.internal.SdkInternalList<EventDestination>(eventDestinations);
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventDestinations(java.util.Collection)} or {@link #withEventDestinations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventDestinations
     *        A list of event destinations associated with the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSetResult withEventDestinations(EventDestination... eventDestinations) {
        if (this.eventDestinations == null) {
            setEventDestinations(new com.amazonaws.internal.SdkInternalList<EventDestination>(eventDestinations.length));
        }
        for (EventDestination ele : eventDestinations) {
            this.eventDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * 
     * @param eventDestinations
     *        A list of event destinations associated with the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSetResult withEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        setEventDestinations(eventDestinations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: " + getConfigurationSet() + ",");
        if (getEventDestinations() != null)
            sb.append("EventDestinations: " + getEventDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSetResult == false)
            return false;
        DescribeConfigurationSetResult other = (DescribeConfigurationSetResult) obj;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getEventDestinations() == null ^ this.getEventDestinations() == null)
            return false;
        if (other.getEventDestinations() != null && other.getEventDestinations().equals(this.getEventDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode + ((getEventDestinations() == null) ? 0 : getEventDestinations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationSetResult clone() {
        try {
            return (DescribeConfigurationSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
