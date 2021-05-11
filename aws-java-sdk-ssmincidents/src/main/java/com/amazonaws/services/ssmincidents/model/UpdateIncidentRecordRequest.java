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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateIncidentRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIncidentRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS Chatbot chat channel for responders to collaborate in.
     * </p>
     */
    private ChatChannel chatChannel;
    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Defines the impact to customers and applications. Providing an impact overwrites the impact provided by the
     * response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     */
    private Integer impact;
    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * <p>
     * Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * </p>
     */
    private java.util.List<NotificationTargetItem> notificationTargets;
    /**
     * <p>
     * The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The summary describes what has happened during the incident.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The title of the incident is a brief and easily recognizable.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident record you are updating.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident record you are updating.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident record you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel for responders to collaborate in.
     * </p>
     * 
     * @param chatChannel
     *        The AWS Chatbot chat channel for responders to collaborate in.
     */

    public void setChatChannel(ChatChannel chatChannel) {
        this.chatChannel = chatChannel;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel for responders to collaborate in.
     * </p>
     * 
     * @return The AWS Chatbot chat channel for responders to collaborate in.
     */

    public ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel for responders to collaborate in.
     * </p>
     * 
     * @param chatChannel
     *        The AWS Chatbot chat channel for responders to collaborate in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withChatChannel(ChatChannel chatChannel) {
        setChatChannel(chatChannel);
        return this;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Defines the impact to customers and applications. Providing an impact overwrites the impact provided by the
     * response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param impact
     *        Defines the impact to customers and applications. Providing an impact overwrites the impact provided by
     *        the response plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *        all customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - High impact, partial application failure with impact to many customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *        impact.
     *        </p>
     *        </li>
     */

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * Defines the impact to customers and applications. Providing an impact overwrites the impact provided by the
     * response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the impact to customers and applications. Providing an impact overwrites the impact provided by
     *         the response plan.</p>
     *         <p class="title">
     *         <b>Possible impacts:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *         all customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2</code> - High impact, partial application failure with impact to many customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *         impact.
     *         </p>
     *         </li>
     */

    public Integer getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * Defines the impact to customers and applications. Providing an impact overwrites the impact provided by the
     * response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param impact
     *        Defines the impact to customers and applications. Providing an impact overwrites the impact provided by
     *        the response plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *        all customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - High impact, partial application failure with impact to many customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *        impact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withImpact(Integer impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * <p>
     * Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * </p>
     * 
     * @return The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *         make updates to the incident through the chat channel using the SNS topics. </p>
     *         <p>
     *         Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     */

    public java.util.List<NotificationTargetItem> getNotificationTargets() {
        return notificationTargets;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel using the SNS topics.
     * </p>
     * <p>
     * Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics. </p>
     *        <p>
     *        Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
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
     * Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationTargets(java.util.Collection)} or {@link #withNotificationTargets(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics. </p>
     *        <p>
     *        Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withNotificationTargets(NotificationTargetItem... notificationTargets) {
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
     * <p>
     * Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel using the SNS topics. </p>
     *        <p>
     *        Using multiple SNS topics creates redundancy in the case that a Region is down during the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withNotificationTargets(java.util.Collection<NotificationTargetItem> notificationTargets) {
        setNotificationTargets(notificationTargets);
        return this;
    }

    /**
     * <p>
     * The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * @see IncidentRecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * </p>
     * 
     * @return The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * @see IncidentRecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public UpdateIncidentRecordRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The status of the incident. An incident can be <code>Open</code> or <code>Resolved</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public UpdateIncidentRecordRequest withStatus(IncidentRecordStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The summary describes what has happened during the incident.
     * </p>
     * 
     * @param summary
     *        The summary describes what has happened during the incident.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary describes what has happened during the incident.
     * </p>
     * 
     * @return The summary describes what has happened during the incident.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary describes what has happened during the incident.
     * </p>
     * 
     * @param summary
     *        The summary describes what has happened during the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The title of the incident is a brief and easily recognizable.
     * </p>
     * 
     * @param title
     *        The title of the incident is a brief and easily recognizable.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the incident is a brief and easily recognizable.
     * </p>
     * 
     * @return The title of the incident is a brief and easily recognizable.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the incident is a brief and easily recognizable.
     * </p>
     * 
     * @param title
     *        The title of the incident is a brief and easily recognizable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIncidentRecordRequest withTitle(String title) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChatChannel() != null)
            sb.append("ChatChannel: ").append(getChatChannel()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getNotificationTargets() != null)
            sb.append("NotificationTargets: ").append(getNotificationTargets()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof UpdateIncidentRecordRequest == false)
            return false;
        UpdateIncidentRecordRequest other = (UpdateIncidentRecordRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChatChannel() == null ^ this.getChatChannel() == null)
            return false;
        if (other.getChatChannel() != null && other.getChatChannel().equals(this.getChatChannel()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getNotificationTargets() == null ^ this.getNotificationTargets() == null)
            return false;
        if (other.getNotificationTargets() != null && other.getNotificationTargets().equals(this.getNotificationTargets()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChatChannel() == null) ? 0 : getChatChannel().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getNotificationTargets() == null) ? 0 : getNotificationTargets().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIncidentRecordRequest clone() {
        return (UpdateIncidentRecordRequest) super.clone();
    }

}
