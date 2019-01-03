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
 * Represents a request to create a configuration set event destination. A configuration set event destination, which
 * can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes
 * the email sending events associated with a configuration set. For information about using configuration sets, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationSetEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that the event destination should be associated with.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * An object that describes the AWS service that email sending event information will be published to.
     * </p>
     */
    private EventDestination eventDestination;

    /**
     * <p>
     * The name of the configuration set that the event destination should be associated with.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that the event destination should be associated with.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that the event destination should be associated with.
     * </p>
     * 
     * @return The name of the configuration set that the event destination should be associated with.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that the event destination should be associated with.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that the event destination should be associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * An object that describes the AWS service that email sending event information will be published to.
     * </p>
     * 
     * @param eventDestination
     *        An object that describes the AWS service that email sending event information will be published to.
     */

    public void setEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * <p>
     * An object that describes the AWS service that email sending event information will be published to.
     * </p>
     * 
     * @return An object that describes the AWS service that email sending event information will be published to.
     */

    public EventDestination getEventDestination() {
        return this.eventDestination;
    }

    /**
     * <p>
     * An object that describes the AWS service that email sending event information will be published to.
     * </p>
     * 
     * @param eventDestination
     *        An object that describes the AWS service that email sending event information will be published to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetEventDestinationRequest withEventDestination(EventDestination eventDestination) {
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

        if (obj instanceof CreateConfigurationSetEventDestinationRequest == false)
            return false;
        CreateConfigurationSetEventDestinationRequest other = (CreateConfigurationSetEventDestinationRequest) obj;
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
    public CreateConfigurationSetEventDestinationRequest clone() {
        return (CreateConfigurationSetEventDestinationRequest) super.clone();
    }

}
