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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendAutomationSignal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendAutomationSignalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for an existing Automation execution that you want to send the signal to.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * The type of signal. Valid signal types include the following: Approve and Reject
     * </p>
     */
    private String signalType;
    /**
     * <p>
     * The data sent with the signal. The data schema depends on the type of signal used in the request.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> payload;

    /**
     * <p>
     * The unique identifier for an existing Automation execution that you want to send the signal to.
     * </p>
     * 
     * @param automationExecutionId
     *        The unique identifier for an existing Automation execution that you want to send the signal to.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The unique identifier for an existing Automation execution that you want to send the signal to.
     * </p>
     * 
     * @return The unique identifier for an existing Automation execution that you want to send the signal to.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The unique identifier for an existing Automation execution that you want to send the signal to.
     * </p>
     * 
     * @param automationExecutionId
     *        The unique identifier for an existing Automation execution that you want to send the signal to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAutomationSignalRequest withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * The type of signal. Valid signal types include the following: Approve and Reject
     * </p>
     * 
     * @param signalType
     *        The type of signal. Valid signal types include the following: Approve and Reject
     * @see SignalType
     */

    public void setSignalType(String signalType) {
        this.signalType = signalType;
    }

    /**
     * <p>
     * The type of signal. Valid signal types include the following: Approve and Reject
     * </p>
     * 
     * @return The type of signal. Valid signal types include the following: Approve and Reject
     * @see SignalType
     */

    public String getSignalType() {
        return this.signalType;
    }

    /**
     * <p>
     * The type of signal. Valid signal types include the following: Approve and Reject
     * </p>
     * 
     * @param signalType
     *        The type of signal. Valid signal types include the following: Approve and Reject
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalType
     */

    public SendAutomationSignalRequest withSignalType(String signalType) {
        setSignalType(signalType);
        return this;
    }

    /**
     * <p>
     * The type of signal. Valid signal types include the following: Approve and Reject
     * </p>
     * 
     * @param signalType
     *        The type of signal. Valid signal types include the following: Approve and Reject
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalType
     */

    public SendAutomationSignalRequest withSignalType(SignalType signalType) {
        this.signalType = signalType.toString();
        return this;
    }

    /**
     * <p>
     * The data sent with the signal. The data schema depends on the type of signal used in the request.
     * </p>
     * 
     * @return The data sent with the signal. The data schema depends on the type of signal used in the request.
     */

    public java.util.Map<String, java.util.List<String>> getPayload() {
        return payload;
    }

    /**
     * <p>
     * The data sent with the signal. The data schema depends on the type of signal used in the request.
     * </p>
     * 
     * @param payload
     *        The data sent with the signal. The data schema depends on the type of signal used in the request.
     */

    public void setPayload(java.util.Map<String, java.util.List<String>> payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The data sent with the signal. The data schema depends on the type of signal used in the request.
     * </p>
     * 
     * @param payload
     *        The data sent with the signal. The data schema depends on the type of signal used in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAutomationSignalRequest withPayload(java.util.Map<String, java.util.List<String>> payload) {
        setPayload(payload);
        return this;
    }

    public SendAutomationSignalRequest addPayloadEntry(String key, java.util.List<String> value) {
        if (null == this.payload) {
            this.payload = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.payload.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.payload.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Payload.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAutomationSignalRequest clearPayloadEntries() {
        this.payload = null;
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId()).append(",");
        if (getSignalType() != null)
            sb.append("SignalType: ").append(getSignalType()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAutomationSignalRequest == false)
            return false;
        SendAutomationSignalRequest other = (SendAutomationSignalRequest) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getSignalType() == null ^ this.getSignalType() == null)
            return false;
        if (other.getSignalType() != null && other.getSignalType().equals(this.getSignalType()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getSignalType() == null) ? 0 : getSignalType().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public SendAutomationSignalRequest clone() {
        return (SendAutomationSignalRequest) super.clone();
    }

}
