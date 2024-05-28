/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SendCisSessionTelemetry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCisSessionTelemetryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The CIS session telemetry messages.
     * </p>
     */
    private java.util.List<CisSessionMessage> messages;
    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     */
    private String scanJobId;
    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * The CIS session telemetry messages.
     * </p>
     * 
     * @return The CIS session telemetry messages.
     */

    public java.util.List<CisSessionMessage> getMessages() {
        return messages;
    }

    /**
     * <p>
     * The CIS session telemetry messages.
     * </p>
     * 
     * @param messages
     *        The CIS session telemetry messages.
     */

    public void setMessages(java.util.Collection<CisSessionMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<CisSessionMessage>(messages);
    }

    /**
     * <p>
     * The CIS session telemetry messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        The CIS session telemetry messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCisSessionTelemetryRequest withMessages(CisSessionMessage... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<CisSessionMessage>(messages.length));
        }
        for (CisSessionMessage ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CIS session telemetry messages.
     * </p>
     * 
     * @param messages
     *        The CIS session telemetry messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCisSessionTelemetryRequest withMessages(java.util.Collection<CisSessionMessage> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @param scanJobId
     *        A unique identifier for the scan job.
     */

    public void setScanJobId(String scanJobId) {
        this.scanJobId = scanJobId;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @return A unique identifier for the scan job.
     */

    public String getScanJobId() {
        return this.scanJobId;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @param scanJobId
     *        A unique identifier for the scan job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCisSessionTelemetryRequest withScanJobId(String scanJobId) {
        setScanJobId(scanJobId);
        return this;
    }

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @param sessionToken
     *        The unique token that identifies the CIS session.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @return The unique token that identifies the CIS session.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The unique token that identifies the CIS session.
     * </p>
     * 
     * @param sessionToken
     *        The unique token that identifies the CIS session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCisSessionTelemetryRequest withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getScanJobId() != null)
            sb.append("ScanJobId: ").append(getScanJobId()).append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCisSessionTelemetryRequest == false)
            return false;
        SendCisSessionTelemetryRequest other = (SendCisSessionTelemetryRequest) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getScanJobId() == null ^ this.getScanJobId() == null)
            return false;
        if (other.getScanJobId() != null && other.getScanJobId().equals(this.getScanJobId()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getScanJobId() == null) ? 0 : getScanJobId().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public SendCisSessionTelemetryRequest clone() {
        return (SendCisSessionTelemetryRequest) super.clone();
    }

}
