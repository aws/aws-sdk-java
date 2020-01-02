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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies limits on the messages that a journey can send and the number of times participants can enter a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The
     * maximum value is 100.
     * </p>
     */
    private Integer dailyCap;
    /**
     * <p>
     * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     * participants to enter the journey an unlimited number of times, set this value to 0.
     * </p>
     */
    private Integer endpointReentryCap;
    /**
     * <p>
     * The maximum number of messages that the journey can send each second.
     * </p>
     */
    private Integer messagesPerSecond;

    /**
     * <p>
     * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The
     * maximum value is 100.
     * </p>
     * 
     * @param dailyCap
     *        The maximum number of messages that the journey can send to a single participant during a 24-hour period.
     *        The maximum value is 100.
     */

    public void setDailyCap(Integer dailyCap) {
        this.dailyCap = dailyCap;
    }

    /**
     * <p>
     * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The
     * maximum value is 100.
     * </p>
     * 
     * @return The maximum number of messages that the journey can send to a single participant during a 24-hour period.
     *         The maximum value is 100.
     */

    public Integer getDailyCap() {
        return this.dailyCap;
    }

    /**
     * <p>
     * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The
     * maximum value is 100.
     * </p>
     * 
     * @param dailyCap
     *        The maximum number of messages that the journey can send to a single participant during a 24-hour period.
     *        The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyLimits withDailyCap(Integer dailyCap) {
        setDailyCap(dailyCap);
        return this;
    }

    /**
     * <p>
     * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     * participants to enter the journey an unlimited number of times, set this value to 0.
     * </p>
     * 
     * @param endpointReentryCap
     *        The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     *        participants to enter the journey an unlimited number of times, set this value to 0.
     */

    public void setEndpointReentryCap(Integer endpointReentryCap) {
        this.endpointReentryCap = endpointReentryCap;
    }

    /**
     * <p>
     * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     * participants to enter the journey an unlimited number of times, set this value to 0.
     * </p>
     * 
     * @return The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     *         participants to enter the journey an unlimited number of times, set this value to 0.
     */

    public Integer getEndpointReentryCap() {
        return this.endpointReentryCap;
    }

    /**
     * <p>
     * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     * participants to enter the journey an unlimited number of times, set this value to 0.
     * </p>
     * 
     * @param endpointReentryCap
     *        The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow
     *        participants to enter the journey an unlimited number of times, set this value to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyLimits withEndpointReentryCap(Integer endpointReentryCap) {
        setEndpointReentryCap(endpointReentryCap);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that the journey can send each second.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of messages that the journey can send each second.
     */

    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that the journey can send each second.
     * </p>
     * 
     * @return The maximum number of messages that the journey can send each second.
     */

    public Integer getMessagesPerSecond() {
        return this.messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that the journey can send each second.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of messages that the journey can send each second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyLimits withMessagesPerSecond(Integer messagesPerSecond) {
        setMessagesPerSecond(messagesPerSecond);
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
        if (getDailyCap() != null)
            sb.append("DailyCap: ").append(getDailyCap()).append(",");
        if (getEndpointReentryCap() != null)
            sb.append("EndpointReentryCap: ").append(getEndpointReentryCap()).append(",");
        if (getMessagesPerSecond() != null)
            sb.append("MessagesPerSecond: ").append(getMessagesPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyLimits == false)
            return false;
        JourneyLimits other = (JourneyLimits) obj;
        if (other.getDailyCap() == null ^ this.getDailyCap() == null)
            return false;
        if (other.getDailyCap() != null && other.getDailyCap().equals(this.getDailyCap()) == false)
            return false;
        if (other.getEndpointReentryCap() == null ^ this.getEndpointReentryCap() == null)
            return false;
        if (other.getEndpointReentryCap() != null && other.getEndpointReentryCap().equals(this.getEndpointReentryCap()) == false)
            return false;
        if (other.getMessagesPerSecond() == null ^ this.getMessagesPerSecond() == null)
            return false;
        if (other.getMessagesPerSecond() != null && other.getMessagesPerSecond().equals(this.getMessagesPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDailyCap() == null) ? 0 : getDailyCap().hashCode());
        hashCode = prime * hashCode + ((getEndpointReentryCap() == null) ? 0 : getEndpointReentryCap().hashCode());
        hashCode = prime * hashCode + ((getMessagesPerSecond() == null) ? 0 : getMessagesPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public JourneyLimits clone() {
        try {
            return (JourneyLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
