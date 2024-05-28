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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetChatControlsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChatControlsConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response scope configured for a Amazon Q Business application. This determines whether your application uses
     * its retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also uses
     * the large language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     */
    private String responseScope;
    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     */
    private BlockedPhrasesConfiguration blockedPhrases;
    /**
     * <p>
     * The topic specific controls configured for a Amazon Q Business application.
     * </p>
     */
    private java.util.List<TopicConfiguration> topicConfigurations;
    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     */
    private AppliedCreatorModeConfiguration creatorModeConfiguration;
    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     * Q Business chat controls configured.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The response scope configured for a Amazon Q Business application. This determines whether your application uses
     * its retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also uses
     * the large language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for a Amazon Q Business application. This determines whether your
     *        application uses its retrieval augmented generation (RAG) system to generate answers only from your
     *        enterprise data, or also uses the large language models (LLM) knowledge to respons to end user questions
     *        in chat.
     * @see ResponseScope
     */

    public void setResponseScope(String responseScope) {
        this.responseScope = responseScope;
    }

    /**
     * <p>
     * The response scope configured for a Amazon Q Business application. This determines whether your application uses
     * its retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also uses
     * the large language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @return The response scope configured for a Amazon Q Business application. This determines whether your
     *         application uses its retrieval augmented generation (RAG) system to generate answers only from your
     *         enterprise data, or also uses the large language models (LLM) knowledge to respons to end user questions
     *         in chat.
     * @see ResponseScope
     */

    public String getResponseScope() {
        return this.responseScope;
    }

    /**
     * <p>
     * The response scope configured for a Amazon Q Business application. This determines whether your application uses
     * its retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also uses
     * the large language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for a Amazon Q Business application. This determines whether your
     *        application uses its retrieval augmented generation (RAG) system to generate answers only from your
     *        enterprise data, or also uses the large language models (LLM) knowledge to respons to end user questions
     *        in chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseScope
     */

    public GetChatControlsConfigurationResult withResponseScope(String responseScope) {
        setResponseScope(responseScope);
        return this;
    }

    /**
     * <p>
     * The response scope configured for a Amazon Q Business application. This determines whether your application uses
     * its retrieval augmented generation (RAG) system to generate answers only from your enterprise data, or also uses
     * the large language models (LLM) knowledge to respons to end user questions in chat.
     * </p>
     * 
     * @param responseScope
     *        The response scope configured for a Amazon Q Business application. This determines whether your
     *        application uses its retrieval augmented generation (RAG) system to generate answers only from your
     *        enterprise data, or also uses the large language models (LLM) knowledge to respons to end user questions
     *        in chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseScope
     */

    public GetChatControlsConfigurationResult withResponseScope(ResponseScope responseScope) {
        this.responseScope = responseScope.toString();
        return this;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @param blockedPhrases
     *        The phrases blocked from chat by your chat control configuration.
     */

    public void setBlockedPhrases(BlockedPhrasesConfiguration blockedPhrases) {
        this.blockedPhrases = blockedPhrases;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @return The phrases blocked from chat by your chat control configuration.
     */

    public BlockedPhrasesConfiguration getBlockedPhrases() {
        return this.blockedPhrases;
    }

    /**
     * <p>
     * The phrases blocked from chat by your chat control configuration.
     * </p>
     * 
     * @param blockedPhrases
     *        The phrases blocked from chat by your chat control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChatControlsConfigurationResult withBlockedPhrases(BlockedPhrasesConfiguration blockedPhrases) {
        setBlockedPhrases(blockedPhrases);
        return this;
    }

    /**
     * <p>
     * The topic specific controls configured for a Amazon Q Business application.
     * </p>
     * 
     * @return The topic specific controls configured for a Amazon Q Business application.
     */

    public java.util.List<TopicConfiguration> getTopicConfigurations() {
        return topicConfigurations;
    }

    /**
     * <p>
     * The topic specific controls configured for a Amazon Q Business application.
     * </p>
     * 
     * @param topicConfigurations
     *        The topic specific controls configured for a Amazon Q Business application.
     */

    public void setTopicConfigurations(java.util.Collection<TopicConfiguration> topicConfigurations) {
        if (topicConfigurations == null) {
            this.topicConfigurations = null;
            return;
        }

        this.topicConfigurations = new java.util.ArrayList<TopicConfiguration>(topicConfigurations);
    }

    /**
     * <p>
     * The topic specific controls configured for a Amazon Q Business application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicConfigurations(java.util.Collection)} or {@link #withTopicConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param topicConfigurations
     *        The topic specific controls configured for a Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChatControlsConfigurationResult withTopicConfigurations(TopicConfiguration... topicConfigurations) {
        if (this.topicConfigurations == null) {
            setTopicConfigurations(new java.util.ArrayList<TopicConfiguration>(topicConfigurations.length));
        }
        for (TopicConfiguration ele : topicConfigurations) {
            this.topicConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The topic specific controls configured for a Amazon Q Business application.
     * </p>
     * 
     * @param topicConfigurations
     *        The topic specific controls configured for a Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChatControlsConfigurationResult withTopicConfigurations(java.util.Collection<TopicConfiguration> topicConfigurations) {
        setTopicConfigurations(topicConfigurations);
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

    public void setCreatorModeConfiguration(AppliedCreatorModeConfiguration creatorModeConfiguration) {
        this.creatorModeConfiguration = creatorModeConfiguration;
    }

    /**
     * <p>
     * The configuration details for <code>CREATOR_MODE</code>.
     * </p>
     * 
     * @return The configuration details for <code>CREATOR_MODE</code>.
     */

    public AppliedCreatorModeConfiguration getCreatorModeConfiguration() {
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

    public GetChatControlsConfigurationResult withCreatorModeConfiguration(AppliedCreatorModeConfiguration creatorModeConfiguration) {
        setCreatorModeConfiguration(creatorModeConfiguration);
        return this;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     * Q Business chat controls configured.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of Amazon Q Business chat controls configured.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     * Q Business chat controls configured.
     * </p>
     * 
     * @return If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *         Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *         next set of Amazon Q Business chat controls configured.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     * Q Business chat controls configured.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of Amazon Q Business chat controls configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChatControlsConfigurationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getResponseScope() != null)
            sb.append("ResponseScope: ").append(getResponseScope()).append(",");
        if (getBlockedPhrases() != null)
            sb.append("BlockedPhrases: ").append(getBlockedPhrases()).append(",");
        if (getTopicConfigurations() != null)
            sb.append("TopicConfigurations: ").append(getTopicConfigurations()).append(",");
        if (getCreatorModeConfiguration() != null)
            sb.append("CreatorModeConfiguration: ").append(getCreatorModeConfiguration()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChatControlsConfigurationResult == false)
            return false;
        GetChatControlsConfigurationResult other = (GetChatControlsConfigurationResult) obj;
        if (other.getResponseScope() == null ^ this.getResponseScope() == null)
            return false;
        if (other.getResponseScope() != null && other.getResponseScope().equals(this.getResponseScope()) == false)
            return false;
        if (other.getBlockedPhrases() == null ^ this.getBlockedPhrases() == null)
            return false;
        if (other.getBlockedPhrases() != null && other.getBlockedPhrases().equals(this.getBlockedPhrases()) == false)
            return false;
        if (other.getTopicConfigurations() == null ^ this.getTopicConfigurations() == null)
            return false;
        if (other.getTopicConfigurations() != null && other.getTopicConfigurations().equals(this.getTopicConfigurations()) == false)
            return false;
        if (other.getCreatorModeConfiguration() == null ^ this.getCreatorModeConfiguration() == null)
            return false;
        if (other.getCreatorModeConfiguration() != null && other.getCreatorModeConfiguration().equals(this.getCreatorModeConfiguration()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseScope() == null) ? 0 : getResponseScope().hashCode());
        hashCode = prime * hashCode + ((getBlockedPhrases() == null) ? 0 : getBlockedPhrases().hashCode());
        hashCode = prime * hashCode + ((getTopicConfigurations() == null) ? 0 : getTopicConfigurations().hashCode());
        hashCode = prime * hashCode + ((getCreatorModeConfiguration() == null) ? 0 : getCreatorModeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetChatControlsConfigurationResult clone() {
        try {
            return (GetChatControlsConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
