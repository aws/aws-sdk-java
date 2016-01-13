/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * The metadata about the Inspector application data metrics collected by the
 * agent.
 * </p>
 * <p>
 * This data type is used as the response element in the
 * <a>GetAssessmentTelemetry</a> action.
 * </p>
 */
public class Telemetry implements Serializable, Cloneable {

    /**
     * <p>
     * The category of the individual metrics that together constitute the
     * telemetry that Inspector received from the agent.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Counts of individual metrics received by Inspector from the agent.
     * </p>
     */
    private java.util.List<MessageTypeTelemetry> messageTypeTelemetries;

    /**
     * <p>
     * The category of the individual metrics that together constitute the
     * telemetry that Inspector received from the agent.
     * </p>
     * 
     * @param status
     *        The category of the individual metrics that together constitute
     *        the telemetry that Inspector received from the agent.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The category of the individual metrics that together constitute the
     * telemetry that Inspector received from the agent.
     * </p>
     * 
     * @return The category of the individual metrics that together constitute
     *         the telemetry that Inspector received from the agent.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The category of the individual metrics that together constitute the
     * telemetry that Inspector received from the agent.
     * </p>
     * 
     * @param status
     *        The category of the individual metrics that together constitute
     *        the telemetry that Inspector received from the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Telemetry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Counts of individual metrics received by Inspector from the agent.
     * </p>
     * 
     * @return Counts of individual metrics received by Inspector from the
     *         agent.
     */
    public java.util.List<MessageTypeTelemetry> getMessageTypeTelemetries() {
        return messageTypeTelemetries;
    }

    /**
     * <p>
     * Counts of individual metrics received by Inspector from the agent.
     * </p>
     * 
     * @param messageTypeTelemetries
     *        Counts of individual metrics received by Inspector from the agent.
     */
    public void setMessageTypeTelemetries(
            java.util.Collection<MessageTypeTelemetry> messageTypeTelemetries) {
        if (messageTypeTelemetries == null) {
            this.messageTypeTelemetries = null;
            return;
        }

        this.messageTypeTelemetries = new java.util.ArrayList<MessageTypeTelemetry>(
                messageTypeTelemetries);
    }

    /**
     * <p>
     * Counts of individual metrics received by Inspector from the agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMessageTypeTelemetries(java.util.Collection)} or
     * {@link #withMessageTypeTelemetries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param messageTypeTelemetries
     *        Counts of individual metrics received by Inspector from the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Telemetry withMessageTypeTelemetries(
            MessageTypeTelemetry... messageTypeTelemetries) {
        if (this.messageTypeTelemetries == null) {
            setMessageTypeTelemetries(new java.util.ArrayList<MessageTypeTelemetry>(
                    messageTypeTelemetries.length));
        }
        for (MessageTypeTelemetry ele : messageTypeTelemetries) {
            this.messageTypeTelemetries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Counts of individual metrics received by Inspector from the agent.
     * </p>
     * 
     * @param messageTypeTelemetries
     *        Counts of individual metrics received by Inspector from the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Telemetry withMessageTypeTelemetries(
            java.util.Collection<MessageTypeTelemetry> messageTypeTelemetries) {
        setMessageTypeTelemetries(messageTypeTelemetries);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessageTypeTelemetries() != null)
            sb.append("MessageTypeTelemetries: " + getMessageTypeTelemetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Telemetry == false)
            return false;
        Telemetry other = (Telemetry) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessageTypeTelemetries() == null
                ^ this.getMessageTypeTelemetries() == null)
            return false;
        if (other.getMessageTypeTelemetries() != null
                && other.getMessageTypeTelemetries().equals(
                        this.getMessageTypeTelemetries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getMessageTypeTelemetries() == null) ? 0
                        : getMessageTypeTelemetries().hashCode());
        return hashCode;
    }

    @Override
    public Telemetry clone() {
        try {
            return (Telemetry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}