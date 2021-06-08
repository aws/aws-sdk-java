/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Basic details used in creating a response plan. The response plan is then used to create an incident record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/IncidentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncidentTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to stop Incident Manager from creating multiple incident records for the same incident.
     * </p>
     */
    private String dedupeString;
    /**
     * <p>
     * The impact of the incident on your customers and applications.
     * </p>
     */
    private Integer impact;
    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     */
    private java.util.List<NotificationTargetItem> notificationTargets;
    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and
     * context.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The title of the incident.
     * </p>
     */
    private String title;

    /**
     * <p>
     * Used to stop Incident Manager from creating multiple incident records for the same incident.
     * </p>
     * 
     * @param dedupeString
     *        Used to stop Incident Manager from creating multiple incident records for the same incident.
     */

    public void setDedupeString(String dedupeString) {
        this.dedupeString = dedupeString;
    }

    /**
     * <p>
     * Used to stop Incident Manager from creating multiple incident records for the same incident.
     * </p>
     * 
     * @return Used to stop Incident Manager from creating multiple incident records for the same incident.
     */

    public String getDedupeString() {
        return this.dedupeString;
    }

    /**
     * <p>
     * Used to stop Incident Manager from creating multiple incident records for the same incident.
     * </p>
     * 
     * @param dedupeString
     *        Used to stop Incident Manager from creating multiple incident records for the same incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withDedupeString(String dedupeString) {
        setDedupeString(dedupeString);
        return this;
    }

    /**
     * <p>
     * The impact of the incident on your customers and applications.
     * </p>
     * 
     * @param impact
     *        The impact of the incident on your customers and applications.
     */

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * The impact of the incident on your customers and applications.
     * </p>
     * 
     * @return The impact of the incident on your customers and applications.
     */

    public Integer getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * The impact of the incident on your customers and applications.
     * </p>
     * 
     * @param impact
     *        The impact of the incident on your customers and applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withImpact(Integer impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * 
     * @return The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *         make updates to the incident through the chat channel using the SNS topics.
     */

    public java.util.List<NotificationTargetItem> getNotificationTargets() {
        return notificationTargets;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics.
     */

    public void setNotificationTargets(java.util.Collection<NotificationTargetItem> notificationTargets) {
        if (notificationTargets == null) {
            this.notificationTargets = null;
            return;
        }

        this.notificationTargets = new java.util.ArrayList<NotificationTargetItem>(notificationTargets);
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationTargets(java.util.Collection)} or {@link #withNotificationTargets(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withNotificationTargets(NotificationTargetItem... notificationTargets) {
        if (this.notificationTargets == null) {
            setNotificationTargets(new java.util.ArrayList<NotificationTargetItem>(notificationTargets.length));
        }
        for (NotificationTargetItem ele : notificationTargets) {
            this.notificationTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withNotificationTargets(java.util.Collection<NotificationTargetItem> notificationTargets) {
        setNotificationTargets(notificationTargets);
        return this;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and
     * context.
     * </p>
     * 
     * @param summary
     *        The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening,
     *        and context.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and
     * context.
     * </p>
     * 
     * @return The summary of the incident. The summary is a brief synopsis of what occurred, what's currently
     *         happening, and context.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and
     * context.
     * </p>
     * 
     * @param summary
     *        The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening,
     *        and context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @param title
     *        The title of the incident.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @return The title of the incident.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @param title
     *        The title of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentTemplate withTitle(String title) {
        setTitle(title);
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
        if (getDedupeString() != null)
            sb.append("DedupeString: ").append(getDedupeString()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getNotificationTargets() != null)
            sb.append("NotificationTargets: ").append(getNotificationTargets()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncidentTemplate == false)
            return false;
        IncidentTemplate other = (IncidentTemplate) obj;
        if (other.getDedupeString() == null ^ this.getDedupeString() == null)
            return false;
        if (other.getDedupeString() != null && other.getDedupeString().equals(this.getDedupeString()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getNotificationTargets() == null ^ this.getNotificationTargets() == null)
            return false;
        if (other.getNotificationTargets() != null && other.getNotificationTargets().equals(this.getNotificationTargets()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDedupeString() == null) ? 0 : getDedupeString().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getNotificationTargets() == null) ? 0 : getNotificationTargets().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public IncidentTemplate clone() {
        try {
            return (IncidentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.IncidentTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
