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
package com.amazonaws.services.cloudtraildata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/PutAuditEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAuditEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
     * </p>
     */
    private java.util.List<AuditEvent> auditEvents;
    /**
     * <p>
     * The ARN or ID (the ARN suffix) of a channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * A unique identifier that is conditionally required when the channel's resource policy includes an external ID.
     * This value can be any string, such as a passphrase or account number.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
     * </p>
     * 
     * @return The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a
     *         file.
     */

    public java.util.List<AuditEvent> getAuditEvents() {
        return auditEvents;
    }

    /**
     * <p>
     * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
     * </p>
     * 
     * @param auditEvents
     *        The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a
     *        file.
     */

    public void setAuditEvents(java.util.Collection<AuditEvent> auditEvents) {
        if (auditEvents == null) {
            this.auditEvents = null;
            return;
        }

        this.auditEvents = new java.util.ArrayList<AuditEvent>(auditEvents);
    }

    /**
     * <p>
     * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuditEvents(java.util.Collection)} or {@link #withAuditEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param auditEvents
     *        The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a
     *        file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsRequest withAuditEvents(AuditEvent... auditEvents) {
        if (this.auditEvents == null) {
            setAuditEvents(new java.util.ArrayList<AuditEvent>(auditEvents.length));
        }
        for (AuditEvent ele : auditEvents) {
            this.auditEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
     * </p>
     * 
     * @param auditEvents
     *        The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a
     *        file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsRequest withAuditEvents(java.util.Collection<AuditEvent> auditEvents) {
        setAuditEvents(auditEvents);
        return this;
    }

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of a channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN or ID (the ARN suffix) of a channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of a channel.
     * </p>
     * 
     * @return The ARN or ID (the ARN suffix) of a channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of a channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN or ID (the ARN suffix) of a channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier that is conditionally required when the channel's resource policy includes an external ID.
     * This value can be any string, such as a passphrase or account number.
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is conditionally required when the channel's resource policy includes an external
     *        ID. This value can be any string, such as a passphrase or account number.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that is conditionally required when the channel's resource policy includes an external ID.
     * This value can be any string, such as a passphrase or account number.
     * </p>
     * 
     * @return A unique identifier that is conditionally required when the channel's resource policy includes an
     *         external ID. This value can be any string, such as a passphrase or account number.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that is conditionally required when the channel's resource policy includes an external ID.
     * This value can be any string, such as a passphrase or account number.
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is conditionally required when the channel's resource policy includes an external
     *        ID. This value can be any string, such as a passphrase or account number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsRequest withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getAuditEvents() != null)
            sb.append("AuditEvents: ").append(getAuditEvents()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAuditEventsRequest == false)
            return false;
        PutAuditEventsRequest other = (PutAuditEventsRequest) obj;
        if (other.getAuditEvents() == null ^ this.getAuditEvents() == null)
            return false;
        if (other.getAuditEvents() != null && other.getAuditEvents().equals(this.getAuditEvents()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditEvents() == null) ? 0 : getAuditEvents().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public PutAuditEventsRequest clone() {
        return (PutAuditEventsRequest) super.clone();
    }

}
