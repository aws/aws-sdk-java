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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateChatControlsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChatControlsConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application for which the chat controls are configured.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A token that you provide to identify the request to update a Amazon Q Business application chat configuration.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The response scope configured for your application. This determines whether your application uses its retrieval
     * augmented generation (RAG) system to generate answers only from your enterprise data, or also uses the large
     * language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     */
    private String responseScope;
    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     */
    private BlockedPhrasesConfigurationUpdate blockedPhrasesConfigurationUpdate;
    /**
     * <p>
     * The configured topic specific chat controls you want to update.
     * </p>
     */
    private java.util.List<TopicConfiguration> topicConfigurationsToCreateOrUpdate;
    /**
     * <p>
     * The configured topic specific chat controls you want to delete.
     * </p>
     */
    private java.util.List<TopicConfiguration> topicConfigurationsToDelete;
    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     */
    private CreatorModeConfiguration creatorModeConfiguration;

    /**
     * <p>
     * The identifier of the application for which the chat controls are configured.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for which the chat controls are configured.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application for which the chat controls are configured.
     * </p>
     * 
     * @return The identifier of the application for which the chat controls are configured.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application for which the chat controls are configured.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for which the chat controls are configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to update a Amazon Q Business application chat configuration.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to update a Amazon Q Business application chat
     *        configuration.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to update a Amazon Q Business application chat configuration.
     * </p>
     * 
     * @return A token that you provide to identify the request to update a Amazon Q Business application chat
     *         configuration.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to update a Amazon Q Business application chat configuration.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to update a Amazon Q Business application chat
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The response scope configured for your application. This determines whether your application uses its retrieval
     * augmented generation (RAG) system to generate answers only from your enterprise data, or also uses the large
     * language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for your application. This determines whether your application uses its
     *        retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also
     *        uses the large language models (LLM) knowledge to respons to end user questions in chat.
     * @see ResponseScope
     */

    public void setResponseScope(String responseScope) {
        this.responseScope = responseScope;
    }

    /**
     * <p>
     * The response scope configured for your application. This determines whether your application uses its retrieval
     * augmented generation (RAG) system to generate answers only from your enterprise data, or also uses the large
     * language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @return The response scope configured for your application. This determines whether your application uses its
     *         retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also
     *         uses the large language models (LLM) knowledge to respons to end user questions in chat.
     * @see ResponseScope
     */

    public String getResponseScope() {
        return this.responseScope;
    }

    /**
     * <p>
     * The response scope configured for your application. This determines whether your application uses its retrieval
     * augmented generation (RAG) system to generate answers only from your enterprise data, or also uses the large
     * language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for your application. This determines whether your application uses its
     *        retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also
     *        uses the large language models (LLM) knowledge to respons to end user questions in chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseScope
     */

    public UpdateChatControlsConfigurationRequest withResponseScope(String responseScope) {
        setResponseScope(responseScope);
        return this;
    }

    /**
     * <p>
     * The response scope configured for your application. This determines whether your application uses its retrieval
     * augmented generation (RAG) system to generate answers only from your enterprise data, or also uses the large
     * language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for your application. This determines whether your application uses its
     *        retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also
     *        uses the large language models (LLM) knowledge to respons to end user questions in chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseScope
     */

    public UpdateChatControlsConfigurationRequest withResponseScope(ResponseScope responseScope) {
        this.responseScope = responseScope.toString();
        return this;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @param blockedPhrasesConfigurationUpdate
     *        The phrases blocked from chat by your chat control configuration.
     */

    public void setBlockedPhrasesConfigurationUpdate(BlockedPhrasesConfigurationUpdate blockedPhrasesConfigurationUpdate) {
        this.blockedPhrasesConfigurationUpdate = blockedPhrasesConfigurationUpdate;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @return The phrases blocked from chat by your chat control configuration.
     */

    public BlockedPhrasesConfigurationUpdate getBlockedPhrasesConfigurationUpdate() {
        return this.blockedPhrasesConfigurationUpdate;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @param blockedPhrasesConfigurationUpdate
     *        The phrases blocked from chat by your chat control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withBlockedPhrasesConfigurationUpdate(BlockedPhrasesConfigurationUpdate blockedPhrasesConfigurationUpdate) {
        setBlockedPhrasesConfigurationUpdate(blockedPhrasesConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to update.
     * </p>
     * 
     * @return The configured topic specific chat controls you want to update.
     */

    public java.util.List<TopicConfiguration> getTopicConfigurationsToCreateOrUpdate() {
        return topicConfigurationsToCreateOrUpdate;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to update.
     * </p>
     * 
     * @param topicConfigurationsToCreateOrUpdate
     *        The configured topic specific chat controls you want to update.
     */

    public void setTopicConfigurationsToCreateOrUpdate(java.util.Collection<TopicConfiguration> topicConfigurationsToCreateOrUpdate) {
        if (topicConfigurationsToCreateOrUpdate == null) {
            this.topicConfigurationsToCreateOrUpdate = null;
            return;
        }

        this.topicConfigurationsToCreateOrUpdate = new java.util.ArrayList<TopicConfiguration>(topicConfigurationsToCreateOrUpdate);
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicConfigurationsToCreateOrUpdate(java.util.Collection)} or
     * {@link #withTopicConfigurationsToCreateOrUpdate(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param topicConfigurationsToCreateOrUpdate
     *        The configured topic specific chat controls you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withTopicConfigurationsToCreateOrUpdate(TopicConfiguration... topicConfigurationsToCreateOrUpdate) {
        if (this.topicConfigurationsToCreateOrUpdate == null) {
            setTopicConfigurationsToCreateOrUpdate(new java.util.ArrayList<TopicConfiguration>(topicConfigurationsToCreateOrUpdate.length));
        }
        for (TopicConfiguration ele : topicConfigurationsToCreateOrUpdate) {
            this.topicConfigurationsToCreateOrUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to update.
     * </p>
     * 
     * @param topicConfigurationsToCreateOrUpdate
     *        The configured topic specific chat controls you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withTopicConfigurationsToCreateOrUpdate(
            java.util.Collection<TopicConfiguration> topicConfigurationsToCreateOrUpdate) {
        setTopicConfigurationsToCreateOrUpdate(topicConfigurationsToCreateOrUpdate);
        return this;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to delete.
     * </p>
     * 
     * @return The configured topic specific chat controls you want to delete.
     */

    public java.util.List<TopicConfiguration> getTopicConfigurationsToDelete() {
        return topicConfigurationsToDelete;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to delete.
     * </p>
     * 
     * @param topicConfigurationsToDelete
     *        The configured topic specific chat controls you want to delete.
     */

    public void setTopicConfigurationsToDelete(java.util.Collection<TopicConfiguration> topicConfigurationsToDelete) {
        if (topicConfigurationsToDelete == null) {
            this.topicConfigurationsToDelete = null;
            return;
        }

        this.topicConfigurationsToDelete = new java.util.ArrayList<TopicConfiguration>(topicConfigurationsToDelete);
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicConfigurationsToDelete(java.util.Collection)} or
     * {@link #withTopicConfigurationsToDelete(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param topicConfigurationsToDelete
     *        The configured topic specific chat controls you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withTopicConfigurationsToDelete(TopicConfiguration... topicConfigurationsToDelete) {
        if (this.topicConfigurationsToDelete == null) {
            setTopicConfigurationsToDelete(new java.util.ArrayList<TopicConfiguration>(topicConfigurationsToDelete.length));
        }
        for (TopicConfiguration ele : topicConfigurationsToDelete) {
            this.topicConfigurationsToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configured topic specific chat controls you want to delete.
     * </p>
     * 
     * @param topicConfigurationsToDelete
     *        The configured topic specific chat controls you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withTopicConfigurationsToDelete(java.util.Collection<TopicConfiguration> topicConfigurationsToDelete) {
        setTopicConfigurationsToDelete(topicConfigurationsToDelete);
        return this;
    }

    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     * 
     * @param creatorModeConfiguration
     *        The configuration details for <code>CREATOR_MODE</code>.
     */

    public void setCreatorModeConfiguration(CreatorModeConfiguration creatorModeConfiguration) {
        this.creatorModeConfiguration = creatorModeConfiguration;
    }

    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     * 
     * @return The configuration details for <code>CREATOR_MODE</code>.
     */

    public CreatorModeConfiguration getCreatorModeConfiguration() {
        return this.creatorModeConfiguration;
    }

    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     * 
     * @param creatorModeConfiguration
     *        The configuration details for <code>CREATOR_MODE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChatControlsConfigurationRequest withCreatorModeConfiguration(CreatorModeConfiguration creatorModeConfiguration) {
        setCreatorModeConfiguration(creatorModeConfiguration);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getResponseScope() != null)
            sb.append("ResponseScope: ").append(getResponseScope()).append(",");
        if (getBlockedPhrasesConfigurationUpdate() != null)
            sb.append("BlockedPhrasesConfigurationUpdate: ").append(getBlockedPhrasesConfigurationUpdate()).append(",");
        if (getTopicConfigurationsToCreateOrUpdate() != null)
            sb.append("TopicConfigurationsToCreateOrUpdate: ").append(getTopicConfigurationsToCreateOrUpdate()).append(",");
        if (getTopicConfigurationsToDelete() != null)
            sb.append("TopicConfigurationsToDelete: ").append(getTopicConfigurationsToDelete()).append(",");
        if (getCreatorModeConfiguration() != null)
            sb.append("CreatorModeConfiguration: ").append(getCreatorModeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChatControlsConfigurationRequest == false)
            return false;
        UpdateChatControlsConfigurationRequest other = (UpdateChatControlsConfigurationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getResponseScope() == null ^ this.getResponseScope() == null)
            return false;
        if (other.getResponseScope() != null && other.getResponseScope().equals(this.getResponseScope()) == false)
            return false;
        if (other.getBlockedPhrasesConfigurationUpdate() == null ^ this.getBlockedPhrasesConfigurationUpdate() == null)
            return false;
        if (other.getBlockedPhrasesConfigurationUpdate() != null
                && other.getBlockedPhrasesConfigurationUpdate().equals(this.getBlockedPhrasesConfigurationUpdate()) == false)
            return false;
        if (other.getTopicConfigurationsToCreateOrUpdate() == null ^ this.getTopicConfigurationsToCreateOrUpdate() == null)
            return false;
        if (other.getTopicConfigurationsToCreateOrUpdate() != null
                && other.getTopicConfigurationsToCreateOrUpdate().equals(this.getTopicConfigurationsToCreateOrUpdate()) == false)
            return false;
        if (other.getTopicConfigurationsToDelete() == null ^ this.getTopicConfigurationsToDelete() == null)
            return false;
        if (other.getTopicConfigurationsToDelete() != null && other.getTopicConfigurationsToDelete().equals(this.getTopicConfigurationsToDelete()) == false)
            return false;
        if (other.getCreatorModeConfiguration() == null ^ this.getCreatorModeConfiguration() == null)
            return false;
        if (other.getCreatorModeConfiguration() != null && other.getCreatorModeConfiguration().equals(this.getCreatorModeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getResponseScope() == null) ? 0 : getResponseScope().hashCode());
        hashCode = prime * hashCode + ((getBlockedPhrasesConfigurationUpdate() == null) ? 0 : getBlockedPhrasesConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getTopicConfigurationsToCreateOrUpdate() == null) ? 0 : getTopicConfigurationsToCreateOrUpdate().hashCode());
        hashCode = prime * hashCode + ((getTopicConfigurationsToDelete() == null) ? 0 : getTopicConfigurationsToDelete().hashCode());
        hashCode = prime * hashCode + ((getCreatorModeConfiguration() == null) ? 0 : getCreatorModeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChatControlsConfigurationRequest clone() {
        return (UpdateChatControlsConfigurationRequest) super.clone();
    }

}
