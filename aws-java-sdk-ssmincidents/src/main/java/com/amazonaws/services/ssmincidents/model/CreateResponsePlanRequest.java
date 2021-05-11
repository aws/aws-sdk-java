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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateResponsePlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResponsePlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The actions that the response plan starts at the beginning of an incident.
     * </p>
     */
    private java.util.List<Action> actions;
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
     * The long format of the response plan name. This field can contain spaces.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The contacts and escalation plans that the response plan engages during an incident.
     * </p>
     */
    private java.util.List<String> engagements;
    /**
     * <p>
     * Details used to create an incident when using this response plan.
     * </p>
     */
    private IncidentTemplate incidentTemplate;
    /**
     * <p>
     * The short format name of the response plan. Can't include spaces.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of tags that you are adding to the response plan.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The actions that the response plan starts at the beginning of an incident.
     * </p>
     * 
     * @return The actions that the response plan starts at the beginning of an incident.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions that the response plan starts at the beginning of an incident.
     * </p>
     * 
     * @param actions
     *        The actions that the response plan starts at the beginning of an incident.
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
     * The actions that the response plan starts at the beginning of an incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions that the response plan starts at the beginning of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withActions(Action... actions) {
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
     * The actions that the response plan starts at the beginning of an incident.
     * </p>
     * 
     * @param actions
     *        The actions that the response plan starts at the beginning of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
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

    public CreateResponsePlanRequest withChatChannel(ChatChannel chatChannel) {
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

    public CreateResponsePlanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The long format of the response plan name. This field can contain spaces.
     * </p>
     * 
     * @param displayName
     *        The long format of the response plan name. This field can contain spaces.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The long format of the response plan name. This field can contain spaces.
     * </p>
     * 
     * @return The long format of the response plan name. This field can contain spaces.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The long format of the response plan name. This field can contain spaces.
     * </p>
     * 
     * @param displayName
     *        The long format of the response plan name. This field can contain spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The contacts and escalation plans that the response plan engages during an incident.
     * </p>
     * 
     * @return The contacts and escalation plans that the response plan engages during an incident.
     */

    public java.util.List<String> getEngagements() {
        return engagements;
    }

    /**
     * <p>
     * The contacts and escalation plans that the response plan engages during an incident.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that the response plan engages during an incident.
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
     * The contacts and escalation plans that the response plan engages during an incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngagements(java.util.Collection)} or {@link #withEngagements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that the response plan engages during an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withEngagements(String... engagements) {
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
     * The contacts and escalation plans that the response plan engages during an incident.
     * </p>
     * 
     * @param engagements
     *        The contacts and escalation plans that the response plan engages during an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withEngagements(java.util.Collection<String> engagements) {
        setEngagements(engagements);
        return this;
    }

    /**
     * <p>
     * Details used to create an incident when using this response plan.
     * </p>
     * 
     * @param incidentTemplate
     *        Details used to create an incident when using this response plan.
     */

    public void setIncidentTemplate(IncidentTemplate incidentTemplate) {
        this.incidentTemplate = incidentTemplate;
    }

    /**
     * <p>
     * Details used to create an incident when using this response plan.
     * </p>
     * 
     * @return Details used to create an incident when using this response plan.
     */

    public IncidentTemplate getIncidentTemplate() {
        return this.incidentTemplate;
    }

    /**
     * <p>
     * Details used to create an incident when using this response plan.
     * </p>
     * 
     * @param incidentTemplate
     *        Details used to create an incident when using this response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withIncidentTemplate(IncidentTemplate incidentTemplate) {
        setIncidentTemplate(incidentTemplate);
        return this;
    }

    /**
     * <p>
     * The short format name of the response plan. Can't include spaces.
     * </p>
     * 
     * @param name
     *        The short format name of the response plan. Can't include spaces.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The short format name of the response plan. Can't include spaces.
     * </p>
     * 
     * @return The short format name of the response plan. Can't include spaces.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The short format name of the response plan. Can't include spaces.
     * </p>
     * 
     * @param name
     *        The short format name of the response plan. Can't include spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of tags that you are adding to the response plan.
     * </p>
     * 
     * @return A list of tags that you are adding to the response plan.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that you are adding to the response plan.
     * </p>
     * 
     * @param tags
     *        A list of tags that you are adding to the response plan.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags that you are adding to the response plan.
     * </p>
     * 
     * @param tags
     *        A list of tags that you are adding to the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateResponsePlanRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResponsePlanRequest clearTagsEntries() {
        this.tags = null;
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
        if (getChatChannel() != null)
            sb.append("ChatChannel: ").append(getChatChannel()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEngagements() != null)
            sb.append("Engagements: ").append(getEngagements()).append(",");
        if (getIncidentTemplate() != null)
            sb.append("IncidentTemplate: ").append(getIncidentTemplate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResponsePlanRequest == false)
            return false;
        CreateResponsePlanRequest other = (CreateResponsePlanRequest) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
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
        if (other.getIncidentTemplate() == null ^ this.getIncidentTemplate() == null)
            return false;
        if (other.getIncidentTemplate() != null && other.getIncidentTemplate().equals(this.getIncidentTemplate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getChatChannel() == null) ? 0 : getChatChannel().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEngagements() == null) ? 0 : getEngagements().hashCode());
        hashCode = prime * hashCode + ((getIncidentTemplate() == null) ? 0 : getIncidentTemplate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResponsePlanRequest clone() {
        return (CreateResponsePlanRequest) super.clone();
    }

}
