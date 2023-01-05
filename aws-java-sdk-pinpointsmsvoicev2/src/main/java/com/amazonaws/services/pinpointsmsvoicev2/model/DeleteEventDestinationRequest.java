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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the event
     * destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     * <a>DescribeConfigurationSets</a> action.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     */
    private String eventDestinationName;

    /**
     * <p>
     * The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the event
     * destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     * <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the
     *        event destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     *        <a>DescribeConfigurationSets</a> action.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the event
     * destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     * <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @return The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the
     *         event destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     *         <a>DescribeConfigurationSets</a> action.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the event
     * destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     * <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the
     *        event destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the
     *        <a>DescribeConfigurationSets</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     * 
     * @param eventDestinationName
     *        The name of the event destination to delete.
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     * 
     * @return The name of the event destination to delete.
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     * 
     * @param eventDestinationName
     *        The name of the event destination to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventDestinationRequest withEventDestinationName(String eventDestinationName) {
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

        if (obj instanceof DeleteEventDestinationRequest == false)
            return false;
        DeleteEventDestinationRequest other = (DeleteEventDestinationRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
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
        hashCode = prime * hashCode + ((getEventDestinationName() == null) ? 0 : getEventDestinationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventDestinationRequest clone() {
        return (DeleteEventDestinationRequest) super.clone();
    }

}
