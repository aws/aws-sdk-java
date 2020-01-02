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
 * Changes the status of a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyStateRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyStateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the journey. Currently, the only supported value is CANCELLED.
     * </p>
     * <p>
     * If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until
     * those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those
     * activities, until they are complete, and any activities that were complete when you cancelled the journey.
     * </p>
     * <p>
     * After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon
     * Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The status of the journey. Currently, the only supported value is CANCELLED.
     * </p>
     * <p>
     * If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until
     * those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those
     * activities, until they are complete, and any activities that were complete when you cancelled the journey.
     * </p>
     * <p>
     * After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon
     * Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * </p>
     * 
     * @param state
     *        The status of the journey. Currently, the only supported value is CANCELLED.</p>
     *        <p>
     *        If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress,
     *        until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics
     *        data for those activities, until they are complete, and any activities that were complete when you
     *        cancelled the journey.
     *        </p>
     *        <p>
     *        After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition,
     *        Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the journey. Currently, the only supported value is CANCELLED.
     * </p>
     * <p>
     * If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until
     * those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those
     * activities, until they are complete, and any activities that were complete when you cancelled the journey.
     * </p>
     * <p>
     * After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon
     * Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * </p>
     * 
     * @return The status of the journey. Currently, the only supported value is CANCELLED.</p>
     *         <p>
     *         If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress,
     *         until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics
     *         data for those activities, until they are complete, and any activities that were complete when you
     *         cancelled the journey.
     *         </p>
     *         <p>
     *         After you cancel a journey, you can't add, change, or remove any activities from the journey. In
     *         addition, Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't
     *         started.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the journey. Currently, the only supported value is CANCELLED.
     * </p>
     * <p>
     * If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until
     * those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those
     * activities, until they are complete, and any activities that were complete when you cancelled the journey.
     * </p>
     * <p>
     * After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon
     * Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * </p>
     * 
     * @param state
     *        The status of the journey. Currently, the only supported value is CANCELLED.</p>
     *        <p>
     *        If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress,
     *        until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics
     *        data for those activities, until they are complete, and any activities that were complete when you
     *        cancelled the journey.
     *        </p>
     *        <p>
     *        After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition,
     *        Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JourneyStateRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the journey. Currently, the only supported value is CANCELLED.
     * </p>
     * <p>
     * If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until
     * those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those
     * activities, until they are complete, and any activities that were complete when you cancelled the journey.
     * </p>
     * <p>
     * After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon
     * Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * </p>
     * 
     * @param state
     *        The status of the journey. Currently, the only supported value is CANCELLED.</p>
     *        <p>
     *        If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress,
     *        until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics
     *        data for those activities, until they are complete, and any activities that were complete when you
     *        cancelled the journey.
     *        </p>
     *        <p>
     *        After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition,
     *        Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JourneyStateRequest withState(State state) {
        this.state = state.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyStateRequest == false)
            return false;
        JourneyStateRequest other = (JourneyStateRequest) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public JourneyStateRequest clone() {
        try {
            return (JourneyStateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyStateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
