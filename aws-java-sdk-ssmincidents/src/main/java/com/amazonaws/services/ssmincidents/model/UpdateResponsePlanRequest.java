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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateResponsePlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResponsePlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The actions that this response plan takes at the beginning of an incident.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS Chatbot chat channel used for collaboration during an incident.
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
     * The long format name of the response plan. Can't contain spaces.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * </p>
     */
    private java.util.List<String> engagements;
    /**
     * <p>
     * Used to create only one incident record for an incident.
     * </p>
     */
    private String incidentTemplateDedupeString;
    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5</code> - Severe impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - High impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - Low impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> - No impact
     * </p>
     * </li>
     * </ul>
     */
    private Integer incidentTemplateImpact;
    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     */
    private java.util.List<NotificationTargetItem> incidentTemplateNotificationTargets;
    /**
     * <p>
     * A brief summary of the incident. This typically contains what has happened, what's currently happening, and next
     * steps.
     * </p>
     */
    private String incidentTemplateSummary;
    /**
     * <p>
     * The short format name of the incident. Can't contain spaces.
     * </p>
     */
    private String incidentTemplateTitle;

    /**
     * <p>
     * The actions that this response plan takes at the beginning of an incident.
     * </p>
     * 
     * @return The actions that this response plan takes at the beginning of an incident.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions that this response plan takes at the beginning of an incident.
     * </p>
     * 
     * @param actions
     *        The actions that this response plan takes at the beginning of an incident.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions that this response plan takes at the beginning of an incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions that this response plan takes at the beginning of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions that this response plan takes at the beginning of an incident.
     * </p>
     * 
     * @param actions
     *        The actions that this response plan takes at the beginning of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the response plan.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the response plan.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel used for collaboration during an incident.
     * </p>
     * 
     * @param chatChannel
     *        The AWS Chatbot chat channel used for collaboration during an incident.
     */

    public void setChatChannel(ChatChannel chatChannel) {
        this.chatChannel = chatChannel;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel used for collaboration during an incident.
     * </p>
     * 
     * @return The AWS Chatbot chat channel used for collaboration during an incident.
     */

    public ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    /**
     * <p>
     * The AWS Chatbot chat channel used for collaboration during an incident.
     * </p>
     * 
     * @param chatChannel
     *        The AWS Chatbot chat channel used for collaboration during an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withChatChannel(ChatChannel chatChannel) {
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

    public UpdateResponsePlanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The long format name of the response plan. Can't contain spaces.
     * </p>
     * 
     * @param displayName
     *        The long format name of the response plan. Can't contain spaces.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The long format name of the response plan. Can't contain spaces.
     * </p>
     * 
     * @return The long format name of the response plan. Can't contain spaces.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The long format name of the response plan. Can't contain spaces.
     * </p>
     * 
     * @param displayName
     *        The long format name of the response plan. Can't contain spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * </p>
     * 
     * @return The contacts and escalation plans that Incident Manager engages at the start of the incident.
     */

    public java.util.List<String> getEngagements() {
        return engagements;
    }

    /**
     * <p>
     * The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that Incident Manager engages at the start of the incident.
     */

    public void setEngagements(java.util.Collection<String> engagements) {
        if (engagements == null) {
            this.engagements = null;
            return;
        }

        this.engagements = new java.util.ArrayList<String>(engagements);
    }

    /**
     * <p>
     * The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngagements(java.util.Collection)} or {@link #withEngagements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withEngagements(String... engagements) {
        if (this.engagements == null) {
            setEngagements(new java.util.ArrayList<String>(engagements.length));
        }
        for (String ele : engagements) {
            this.engagements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that Incident Manager engages at the start of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withEngagements(java.util.Collection<String> engagements) {
        setEngagements(engagements);
        return this;
    }

    /**
     * <p>
     * Used to create only one incident record for an incident.
     * </p>
     * 
     * @param incidentTemplateDedupeString
     *        Used to create only one incident record for an incident.
     */

    public void setIncidentTemplateDedupeString(String incidentTemplateDedupeString) {
        this.incidentTemplateDedupeString = incidentTemplateDedupeString;
    }

    /**
     * <p>
     * Used to create only one incident record for an incident.
     * </p>
     * 
     * @return Used to create only one incident record for an incident.
     */

    public String getIncidentTemplateDedupeString() {
        return this.incidentTemplateDedupeString;
    }

    /**
     * <p>
     * Used to create only one incident record for an incident.
     * </p>
     * 
     * @param incidentTemplateDedupeString
     *        Used to create only one incident record for an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateDedupeString(String incidentTemplateDedupeString) {
        setIncidentTemplateDedupeString(incidentTemplateDedupeString);
        return this;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5</code> - Severe impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - High impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - Low impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> - No impact
     * </p>
     * </li>
     * </ul>
     * 
     * @param incidentTemplateImpact
     *        Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *        plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5</code> - Severe impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - High impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - Low impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1</code> - No impact
     *        </p>
     *        </li>
     */

    public void setIncidentTemplateImpact(Integer incidentTemplateImpact) {
        this.incidentTemplateImpact = incidentTemplateImpact;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5</code> - Severe impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - High impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - Low impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> - No impact
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *         plan.</p>
     *         <p class="title">
     *         <b>Possible impacts:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5</code> - Severe impact
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>4</code> - High impact
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>3</code> - Medium impact
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2</code> - Low impact
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1</code> - No impact
     *         </p>
     *         </li>
     */

    public Integer getIncidentTemplateImpact() {
        return this.incidentTemplateImpact;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5</code> - Severe impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - High impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - Low impact
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> - No impact
     * </p>
     * </li>
     * </ul>
     * 
     * @param incidentTemplateImpact
     *        Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *        plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5</code> - Severe impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - High impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - Low impact
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1</code> - No impact
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateImpact(Integer incidentTemplateImpact) {
        setIncidentTemplateImpact(incidentTemplateImpact);
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @return The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *         record.
     */

    public java.util.List<NotificationTargetItem> getIncidentTemplateNotificationTargets() {
        return incidentTemplateNotificationTargets;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @param incidentTemplateNotificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     */

    public void setIncidentTemplateNotificationTargets(java.util.Collection<NotificationTargetItem> incidentTemplateNotificationTargets) {
        if (incidentTemplateNotificationTargets == null) {
            this.incidentTemplateNotificationTargets = null;
            return;
        }

        this.incidentTemplateNotificationTargets = new java.util.ArrayList<NotificationTargetItem>(incidentTemplateNotificationTargets);
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncidentTemplateNotificationTargets(java.util.Collection)} or
     * {@link #withIncidentTemplateNotificationTargets(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param incidentTemplateNotificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateNotificationTargets(NotificationTargetItem... incidentTemplateNotificationTargets) {
        if (this.incidentTemplateNotificationTargets == null) {
            setIncidentTemplateNotificationTargets(new java.util.ArrayList<NotificationTargetItem>(incidentTemplateNotificationTargets.length));
        }
        for (NotificationTargetItem ele : incidentTemplateNotificationTargets) {
            this.incidentTemplateNotificationTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @param incidentTemplateNotificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateNotificationTargets(java.util.Collection<NotificationTargetItem> incidentTemplateNotificationTargets) {
        setIncidentTemplateNotificationTargets(incidentTemplateNotificationTargets);
        return this;
    }

    /**
     * <p>
     * A brief summary of the incident. This typically contains what has happened, what's currently happening, and next
     * steps.
     * </p>
     * 
     * @param incidentTemplateSummary
     *        A brief summary of the incident. This typically contains what has happened, what's currently happening,
     *        and next steps.
     */

    public void setIncidentTemplateSummary(String incidentTemplateSummary) {
        this.incidentTemplateSummary = incidentTemplateSummary;
    }

    /**
     * <p>
     * A brief summary of the incident. This typically contains what has happened, what's currently happening, and next
     * steps.
     * </p>
     * 
     * @return A brief summary of the incident. This typically contains what has happened, what's currently happening,
     *         and next steps.
     */

    public String getIncidentTemplateSummary() {
        return this.incidentTemplateSummary;
    }

    /**
     * <p>
     * A brief summary of the incident. This typically contains what has happened, what's currently happening, and next
     * steps.
     * </p>
     * 
     * @param incidentTemplateSummary
     *        A brief summary of the incident. This typically contains what has happened, what's currently happening,
     *        and next steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateSummary(String incidentTemplateSummary) {
        setIncidentTemplateSummary(incidentTemplateSummary);
        return this;
    }

    /**
     * <p>
     * The short format name of the incident. Can't contain spaces.
     * </p>
     * 
     * @param incidentTemplateTitle
     *        The short format name of the incident. Can't contain spaces.
     */

    public void setIncidentTemplateTitle(String incidentTemplateTitle) {
        this.incidentTemplateTitle = incidentTemplateTitle;
    }

    /**
     * <p>
     * The short format name of the incident. Can't contain spaces.
     * </p>
     * 
     * @return The short format name of the incident. Can't contain spaces.
     */

    public String getIncidentTemplateTitle() {
        return this.incidentTemplateTitle;
    }

    /**
     * <p>
     * The short format name of the incident. Can't contain spaces.
     * </p>
     * 
     * @param incidentTemplateTitle
     *        The short format name of the incident. Can't contain spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResponsePlanRequest withIncidentTemplateTitle(String incidentTemplateTitle) {
        setIncidentTemplateTitle(incidentTemplateTitle);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChatChannel() != null)
            sb.append("ChatChannel: ").append(getChatChannel()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEngagements() != null)
            sb.append("Engagements: ").append(getEngagements()).append(",");
        if (getIncidentTemplateDedupeString() != null)
            sb.append("IncidentTemplateDedupeString: ").append(getIncidentTemplateDedupeString()).append(",");
        if (getIncidentTemplateImpact() != null)
            sb.append("IncidentTemplateImpact: ").append(getIncidentTemplateImpact()).append(",");
        if (getIncidentTemplateNotificationTargets() != null)
            sb.append("IncidentTemplateNotificationTargets: ").append(getIncidentTemplateNotificationTargets()).append(",");
        if (getIncidentTemplateSummary() != null)
            sb.append("IncidentTemplateSummary: ").append(getIncidentTemplateSummary()).append(",");
        if (getIncidentTemplateTitle() != null)
            sb.append("IncidentTemplateTitle: ").append(getIncidentTemplateTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResponsePlanRequest == false)
            return false;
        UpdateResponsePlanRequest other = (UpdateResponsePlanRequest) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
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
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEngagements() == null ^ this.getEngagements() == null)
            return false;
        if (other.getEngagements() != null && other.getEngagements().equals(this.getEngagements()) == false)
            return false;
        if (other.getIncidentTemplateDedupeString() == null ^ this.getIncidentTemplateDedupeString() == null)
            return false;
        if (other.getIncidentTemplateDedupeString() != null && other.getIncidentTemplateDedupeString().equals(this.getIncidentTemplateDedupeString()) == false)
            return false;
        if (other.getIncidentTemplateImpact() == null ^ this.getIncidentTemplateImpact() == null)
            return false;
        if (other.getIncidentTemplateImpact() != null && other.getIncidentTemplateImpact().equals(this.getIncidentTemplateImpact()) == false)
            return false;
        if (other.getIncidentTemplateNotificationTargets() == null ^ this.getIncidentTemplateNotificationTargets() == null)
            return false;
        if (other.getIncidentTemplateNotificationTargets() != null
                && other.getIncidentTemplateNotificationTargets().equals(this.getIncidentTemplateNotificationTargets()) == false)
            return false;
        if (other.getIncidentTemplateSummary() == null ^ this.getIncidentTemplateSummary() == null)
            return false;
        if (other.getIncidentTemplateSummary() != null && other.getIncidentTemplateSummary().equals(this.getIncidentTemplateSummary()) == false)
            return false;
        if (other.getIncidentTemplateTitle() == null ^ this.getIncidentTemplateTitle() == null)
            return false;
        if (other.getIncidentTemplateTitle() != null && other.getIncidentTemplateTitle().equals(this.getIncidentTemplateTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChatChannel() == null) ? 0 : getChatChannel().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEngagements() == null) ? 0 : getEngagements().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplateDedupeString() == null) ? 0 : getIncidentTemplateDedupeString().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplateImpact() == null) ? 0 : getIncidentTemplateImpact().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplateNotificationTargets() == null) ? 0 : getIncidentTemplateNotificationTargets().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplateSummary() == null) ? 0 : getIncidentTemplateSummary().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplateTitle() == null) ? 0 : getIncidentTemplateTitle().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResponsePlanRequest clone() {
        return (UpdateResponsePlanRequest) super.clone();
    }

}
