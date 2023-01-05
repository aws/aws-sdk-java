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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteConfigurationSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfigurationSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted configuration set.
     * </p>
     */
    private String configurationSetArn;
    /**
     * <p>
     * The name of the deleted configuration set.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * An array of any EventDestination objects that were associated with the deleted configuration set.
     * </p>
     */
    private java.util.List<EventDestination> eventDestinations;
    /**
     * <p>
     * The default message type of the configuration set that was deleted.
     * </p>
     */
    private String defaultMessageType;
    /**
     * <p>
     * The default Sender ID of the configuration set that was deleted.
     * </p>
     */
    private String defaultSenderId;
    /**
     * <p>
     * The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the deleted configuration set.
     */

    public void setConfigurationSetArn(String configurationSetArn) {
        this.configurationSetArn = configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted configuration set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deleted configuration set.
     */

    public String getConfigurationSetArn() {
        return this.configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the deleted configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withConfigurationSetArn(String configurationSetArn) {
        setConfigurationSetArn(configurationSetArn);
        return this;
    }

    /**
     * <p>
     * The name of the deleted configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the deleted configuration set.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the deleted configuration set.
     * </p>
     * 
     * @return The name of the deleted configuration set.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the deleted configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the deleted configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * An array of any EventDestination objects that were associated with the deleted configuration set.
     * </p>
     * 
     * @return An array of any EventDestination objects that were associated with the deleted configuration set.
     */

    public java.util.List<EventDestination> getEventDestinations() {
        return eventDestinations;
    }

    /**
     * <p>
     * An array of any EventDestination objects that were associated with the deleted configuration set.
     * </p>
     * 
     * @param eventDestinations
     *        An array of any EventDestination objects that were associated with the deleted configuration set.
     */

    public void setEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        if (eventDestinations == null) {
            this.eventDestinations = null;
            return;
        }

        this.eventDestinations = new java.util.ArrayList<EventDestination>(eventDestinations);
    }

    /**
     * <p>
     * An array of any EventDestination objects that were associated with the deleted configuration set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventDestinations(java.util.Collection)} or {@link #withEventDestinations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventDestinations
     *        An array of any EventDestination objects that were associated with the deleted configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withEventDestinations(EventDestination... eventDestinations) {
        if (this.eventDestinations == null) {
            setEventDestinations(new java.util.ArrayList<EventDestination>(eventDestinations.length));
        }
        for (EventDestination ele : eventDestinations) {
            this.eventDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of any EventDestination objects that were associated with the deleted configuration set.
     * </p>
     * 
     * @param eventDestinations
     *        An array of any EventDestination objects that were associated with the deleted configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        setEventDestinations(eventDestinations);
        return this;
    }

    /**
     * <p>
     * The default message type of the configuration set that was deleted.
     * </p>
     * 
     * @param defaultMessageType
     *        The default message type of the configuration set that was deleted.
     * @see MessageType
     */

    public void setDefaultMessageType(String defaultMessageType) {
        this.defaultMessageType = defaultMessageType;
    }

    /**
     * <p>
     * The default message type of the configuration set that was deleted.
     * </p>
     * 
     * @return The default message type of the configuration set that was deleted.
     * @see MessageType
     */

    public String getDefaultMessageType() {
        return this.defaultMessageType;
    }

    /**
     * <p>
     * The default message type of the configuration set that was deleted.
     * </p>
     * 
     * @param defaultMessageType
     *        The default message type of the configuration set that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public DeleteConfigurationSetResult withDefaultMessageType(String defaultMessageType) {
        setDefaultMessageType(defaultMessageType);
        return this;
    }

    /**
     * <p>
     * The default message type of the configuration set that was deleted.
     * </p>
     * 
     * @param defaultMessageType
     *        The default message type of the configuration set that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public DeleteConfigurationSetResult withDefaultMessageType(MessageType defaultMessageType) {
        this.defaultMessageType = defaultMessageType.toString();
        return this;
    }

    /**
     * <p>
     * The default Sender ID of the configuration set that was deleted.
     * </p>
     * 
     * @param defaultSenderId
     *        The default Sender ID of the configuration set that was deleted.
     */

    public void setDefaultSenderId(String defaultSenderId) {
        this.defaultSenderId = defaultSenderId;
    }

    /**
     * <p>
     * The default Sender ID of the configuration set that was deleted.
     * </p>
     * 
     * @return The default Sender ID of the configuration set that was deleted.
     */

    public String getDefaultSenderId() {
        return this.defaultSenderId;
    }

    /**
     * <p>
     * The default Sender ID of the configuration set that was deleted.
     * </p>
     * 
     * @param defaultSenderId
     *        The default Sender ID of the configuration set that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withDefaultSenderId(String defaultSenderId) {
        setDefaultSenderId(defaultSenderId);
        return this;
    }

    /**
     * <p>
     * The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time that the deleted configuration set was created in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationSetResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getEventDestinations() != null)
            sb.append("EventDestinations: ").append(getEventDestinations()).append(",");
        if (getDefaultMessageType() != null)
            sb.append("DefaultMessageType: ").append(getDefaultMessageType()).append(",");
        if (getDefaultSenderId() != null)
            sb.append("DefaultSenderId: ").append(getDefaultSenderId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationSetResult == false)
            return false;
        DeleteConfigurationSetResult other = (DeleteConfigurationSetResult) obj;
        if (other.getConfigurationSetArn() == null ^ this.getConfigurationSetArn() == null)
            return false;
        if (other.getConfigurationSetArn() != null && other.getConfigurationSetArn().equals(this.getConfigurationSetArn()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestinations() == null ^ this.getEventDestinations() == null)
            return false;
        if (other.getEventDestinations() != null && other.getEventDestinations().equals(this.getEventDestinations()) == false)
            return false;
        if (other.getDefaultMessageType() == null ^ this.getDefaultMessageType() == null)
            return false;
        if (other.getDefaultMessageType() != null && other.getDefaultMessageType().equals(this.getDefaultMessageType()) == false)
            return false;
        if (other.getDefaultSenderId() == null ^ this.getDefaultSenderId() == null)
            return false;
        if (other.getDefaultSenderId() != null && other.getDefaultSenderId().equals(this.getDefaultSenderId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetArn() == null) ? 0 : getConfigurationSetArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEventDestinations() == null) ? 0 : getEventDestinations().hashCode());
        hashCode = prime * hashCode + ((getDefaultMessageType() == null) ? 0 : getDefaultMessageType().hashCode());
        hashCode = prime * hashCode + ((getDefaultSenderId() == null) ? 0 : getDefaultSenderId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfigurationSetResult clone() {
        try {
            return (DeleteConfigurationSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
