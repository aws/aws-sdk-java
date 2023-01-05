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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     * </p>
     */
    private String configurationSetArn;
    /**
     * <p>
     * The name of the configuration set.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * An EventDestination object containing the details of where events will be logged.
     * </p>
     */
    private EventDestination eventDestination;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     */

    public void setConfigurationSetArn(String configurationSetArn) {
        this.configurationSetArn = configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     */

    public String getConfigurationSetArn() {
        return this.configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDestinationResult withConfigurationSetArn(String configurationSetArn) {
        setConfigurationSetArn(configurationSetArn);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @return The name of the configuration set.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDestinationResult withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * An EventDestination object containing the details of where events will be logged.
     * </p>
     * 
     * @param eventDestination
     *        An EventDestination object containing the details of where events will be logged.
     */

    public void setEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * <p>
     * An EventDestination object containing the details of where events will be logged.
     * </p>
     * 
     * @return An EventDestination object containing the details of where events will be logged.
     */

    public EventDestination getEventDestination() {
        return this.eventDestination;
    }

    /**
     * <p>
     * An EventDestination object containing the details of where events will be logged.
     * </p>
     * 
     * @param eventDestination
     *        An EventDestination object containing the details of where events will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDestinationResult withEventDestination(EventDestination eventDestination) {
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
        if (getConfigurationSetArn() != null)
            sb.append("ConfigurationSetArn: ").append(getConfigurationSetArn()).append(",");
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

        if (obj instanceof UpdateEventDestinationResult == false)
            return false;
        UpdateEventDestinationResult other = (UpdateEventDestinationResult) obj;
        if (other.getConfigurationSetArn() == null ^ this.getConfigurationSetArn() == null)
            return false;
        if (other.getConfigurationSetArn() != null && other.getConfigurationSetArn().equals(this.getConfigurationSetArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getConfigurationSetArn() == null) ? 0 : getConfigurationSetArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEventDestination() == null) ? 0 : getEventDestination().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventDestinationResult clone() {
        try {
            return (UpdateEventDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
