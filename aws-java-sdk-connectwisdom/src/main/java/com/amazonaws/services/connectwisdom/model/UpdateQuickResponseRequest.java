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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateQuickResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQuickResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     */
    private java.util.List<String> channels;
    /**
     * <p>
     * The updated content of the quick response.
     * </p>
     */
    private QuickResponseDataProvider content;
    /**
     * <p>
     * The media type of the quick response content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * The updated description of the quick response.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated grouping configuration of the quick response.
     * </p>
     */
    private GroupingConfiguration groupingConfiguration;
    /**
     * <p>
     * Whether the quick response is active.
     * </p>
     */
    private Boolean isActive;
    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The language code value for the language in which the quick response is written. The supported language codes
     * include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>, <code>id_ID</code>,
     * <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>, <code>zh_CN</code>,
     * <code>zh_TW</code>
     * </p>
     */
    private String language;
    /**
     * <p>
     * The name of the quick response.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     */
    private String quickResponseId;
    /**
     * <p>
     * Whether to remove the description from the quick response.
     * </p>
     */
    private Boolean removeDescription;
    /**
     * <p>
     * Whether to remove the grouping configuration of the quick response.
     * </p>
     */
    private Boolean removeGroupingConfiguration;
    /**
     * <p>
     * Whether to remove the shortcut key of the quick response.
     * </p>
     */
    private Boolean removeShortcutKey;
    /**
     * <p>
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     */
    private String shortcutKey;

    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     * 
     * @return The Amazon Connect contact channels this quick response applies to. The supported contact channel types
     *         include <code>Chat</code>.
     */

    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect contact channels this quick response applies to. The supported contact channel types
     *        include <code>Chat</code>.
     */

    public void setChannels(java.util.Collection<String> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<String>(channels);
    }

    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect contact channels this quick response applies to. The supported contact channel types
     *        include <code>Chat</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withChannels(String... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<String>(channels.length));
        }
        for (String ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect contact channels this quick response applies to. The supported contact channel types
     *        include <code>Chat</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The updated content of the quick response.
     * </p>
     * 
     * @param content
     *        The updated content of the quick response.
     */

    public void setContent(QuickResponseDataProvider content) {
        this.content = content;
    }

    /**
     * <p>
     * The updated content of the quick response.
     * </p>
     * 
     * @return The updated content of the quick response.
     */

    public QuickResponseDataProvider getContent() {
        return this.content;
    }

    /**
     * <p>
     * The updated content of the quick response.
     * </p>
     * 
     * @param content
     *        The updated content of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withContent(QuickResponseDataProvider content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The media type of the quick response content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The media type of the quick response content.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     *        </p>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The media type of the quick response content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The media type of the quick response content.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     *         </p>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The media type of the quick response content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The media type of the quick response content.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=plain</code> for quick response written in plain text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=markdown</code> for quick response written in richtext.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The updated description of the quick response.
     * </p>
     * 
     * @param description
     *        The updated description of the quick response.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the quick response.
     * </p>
     * 
     * @return The updated description of the quick response.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the quick response.
     * </p>
     * 
     * @param description
     *        The updated description of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated grouping configuration of the quick response.
     * </p>
     * 
     * @param groupingConfiguration
     *        The updated grouping configuration of the quick response.
     */

    public void setGroupingConfiguration(GroupingConfiguration groupingConfiguration) {
        this.groupingConfiguration = groupingConfiguration;
    }

    /**
     * <p>
     * The updated grouping configuration of the quick response.
     * </p>
     * 
     * @return The updated grouping configuration of the quick response.
     */

    public GroupingConfiguration getGroupingConfiguration() {
        return this.groupingConfiguration;
    }

    /**
     * <p>
     * The updated grouping configuration of the quick response.
     * </p>
     * 
     * @param groupingConfiguration
     *        The updated grouping configuration of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withGroupingConfiguration(GroupingConfiguration groupingConfiguration) {
        setGroupingConfiguration(groupingConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether the quick response is active.
     * </p>
     * 
     * @param isActive
     *        Whether the quick response is active.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * Whether the quick response is active.
     * </p>
     * 
     * @return Whether the quick response is active.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * Whether the quick response is active.
     * </p>
     * 
     * @param isActive
     *        Whether the quick response is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * Whether the quick response is active.
     * </p>
     * 
     * @return Whether the quick response is active.
     */

    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *         storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written. The supported language codes
     * include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>, <code>id_ID</code>,
     * <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>, <code>zh_CN</code>,
     * <code>zh_TW</code>
     * </p>
     * 
     * @param language
     *        The language code value for the language in which the quick response is written. The supported language
     *        codes include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>,
     *        <code>id_ID</code>, <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>,
     *        <code>zh_CN</code>, <code>zh_TW</code>
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written. The supported language codes
     * include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>, <code>id_ID</code>,
     * <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>, <code>zh_CN</code>,
     * <code>zh_TW</code>
     * </p>
     * 
     * @return The language code value for the language in which the quick response is written. The supported language
     *         codes include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>,
     *         <code>id_ID</code>, <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>,
     *         <code>zh_CN</code>, <code>zh_TW</code>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written. The supported language codes
     * include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>, <code>id_ID</code>,
     * <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>, <code>zh_CN</code>,
     * <code>zh_TW</code>
     * </p>
     * 
     * @param language
     *        The language code value for the language in which the quick response is written. The supported language
     *        codes include <code>de_DE</code>, <code>en_US</code>, <code>es_ES</code>, <code>fr_FR</code>,
     *        <code>id_ID</code>, <code>it_IT</code>, <code>ja_JP</code>, <code>ko_KR</code>, <code>pt_BR</code>,
     *        <code>zh_CN</code>, <code>zh_TW</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The name of the quick response.
     * </p>
     * 
     * @param name
     *        The name of the quick response.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the quick response.
     * </p>
     * 
     * @return The name of the quick response.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the quick response.
     * </p>
     * 
     * @param name
     *        The name of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @param quickResponseId
     *        The identifier of the quick response.
     */

    public void setQuickResponseId(String quickResponseId) {
        this.quickResponseId = quickResponseId;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @return The identifier of the quick response.
     */

    public String getQuickResponseId() {
        return this.quickResponseId;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @param quickResponseId
     *        The identifier of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withQuickResponseId(String quickResponseId) {
        setQuickResponseId(quickResponseId);
        return this;
    }

    /**
     * <p>
     * Whether to remove the description from the quick response.
     * </p>
     * 
     * @param removeDescription
     *        Whether to remove the description from the quick response.
     */

    public void setRemoveDescription(Boolean removeDescription) {
        this.removeDescription = removeDescription;
    }

    /**
     * <p>
     * Whether to remove the description from the quick response.
     * </p>
     * 
     * @return Whether to remove the description from the quick response.
     */

    public Boolean getRemoveDescription() {
        return this.removeDescription;
    }

    /**
     * <p>
     * Whether to remove the description from the quick response.
     * </p>
     * 
     * @param removeDescription
     *        Whether to remove the description from the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withRemoveDescription(Boolean removeDescription) {
        setRemoveDescription(removeDescription);
        return this;
    }

    /**
     * <p>
     * Whether to remove the description from the quick response.
     * </p>
     * 
     * @return Whether to remove the description from the quick response.
     */

    public Boolean isRemoveDescription() {
        return this.removeDescription;
    }

    /**
     * <p>
     * Whether to remove the grouping configuration of the quick response.
     * </p>
     * 
     * @param removeGroupingConfiguration
     *        Whether to remove the grouping configuration of the quick response.
     */

    public void setRemoveGroupingConfiguration(Boolean removeGroupingConfiguration) {
        this.removeGroupingConfiguration = removeGroupingConfiguration;
    }

    /**
     * <p>
     * Whether to remove the grouping configuration of the quick response.
     * </p>
     * 
     * @return Whether to remove the grouping configuration of the quick response.
     */

    public Boolean getRemoveGroupingConfiguration() {
        return this.removeGroupingConfiguration;
    }

    /**
     * <p>
     * Whether to remove the grouping configuration of the quick response.
     * </p>
     * 
     * @param removeGroupingConfiguration
     *        Whether to remove the grouping configuration of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withRemoveGroupingConfiguration(Boolean removeGroupingConfiguration) {
        setRemoveGroupingConfiguration(removeGroupingConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether to remove the grouping configuration of the quick response.
     * </p>
     * 
     * @return Whether to remove the grouping configuration of the quick response.
     */

    public Boolean isRemoveGroupingConfiguration() {
        return this.removeGroupingConfiguration;
    }

    /**
     * <p>
     * Whether to remove the shortcut key of the quick response.
     * </p>
     * 
     * @param removeShortcutKey
     *        Whether to remove the shortcut key of the quick response.
     */

    public void setRemoveShortcutKey(Boolean removeShortcutKey) {
        this.removeShortcutKey = removeShortcutKey;
    }

    /**
     * <p>
     * Whether to remove the shortcut key of the quick response.
     * </p>
     * 
     * @return Whether to remove the shortcut key of the quick response.
     */

    public Boolean getRemoveShortcutKey() {
        return this.removeShortcutKey;
    }

    /**
     * <p>
     * Whether to remove the shortcut key of the quick response.
     * </p>
     * 
     * @param removeShortcutKey
     *        Whether to remove the shortcut key of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withRemoveShortcutKey(Boolean removeShortcutKey) {
        setRemoveShortcutKey(removeShortcutKey);
        return this;
    }

    /**
     * <p>
     * Whether to remove the shortcut key of the quick response.
     * </p>
     * 
     * @return Whether to remove the shortcut key of the quick response.
     */

    public Boolean isRemoveShortcutKey() {
        return this.removeShortcutKey;
    }

    /**
     * <p>
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     * 
     * @param shortcutKey
     *        The shortcut key of the quick response. The value should be unique across the knowledge base.
     */

    public void setShortcutKey(String shortcutKey) {
        this.shortcutKey = shortcutKey;
    }

    /**
     * <p>
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     * 
     * @return The shortcut key of the quick response. The value should be unique across the knowledge base.
     */

    public String getShortcutKey() {
        return this.shortcutKey;
    }

    /**
     * <p>
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     * 
     * @param shortcutKey
     *        The shortcut key of the quick response. The value should be unique across the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseRequest withShortcutKey(String shortcutKey) {
        setShortcutKey(shortcutKey);
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
        if (getChannels() != null)
            sb.append("Channels: ").append("***Sensitive Data Redacted***").append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupingConfiguration() != null)
            sb.append("GroupingConfiguration: ").append(getGroupingConfiguration()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQuickResponseId() != null)
            sb.append("QuickResponseId: ").append(getQuickResponseId()).append(",");
        if (getRemoveDescription() != null)
            sb.append("RemoveDescription: ").append(getRemoveDescription()).append(",");
        if (getRemoveGroupingConfiguration() != null)
            sb.append("RemoveGroupingConfiguration: ").append(getRemoveGroupingConfiguration()).append(",");
        if (getRemoveShortcutKey() != null)
            sb.append("RemoveShortcutKey: ").append(getRemoveShortcutKey()).append(",");
        if (getShortcutKey() != null)
            sb.append("ShortcutKey: ").append(getShortcutKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuickResponseRequest == false)
            return false;
        UpdateQuickResponseRequest other = (UpdateQuickResponseRequest) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupingConfiguration() == null ^ this.getGroupingConfiguration() == null)
            return false;
        if (other.getGroupingConfiguration() != null && other.getGroupingConfiguration().equals(this.getGroupingConfiguration()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQuickResponseId() == null ^ this.getQuickResponseId() == null)
            return false;
        if (other.getQuickResponseId() != null && other.getQuickResponseId().equals(this.getQuickResponseId()) == false)
            return false;
        if (other.getRemoveDescription() == null ^ this.getRemoveDescription() == null)
            return false;
        if (other.getRemoveDescription() != null && other.getRemoveDescription().equals(this.getRemoveDescription()) == false)
            return false;
        if (other.getRemoveGroupingConfiguration() == null ^ this.getRemoveGroupingConfiguration() == null)
            return false;
        if (other.getRemoveGroupingConfiguration() != null && other.getRemoveGroupingConfiguration().equals(this.getRemoveGroupingConfiguration()) == false)
            return false;
        if (other.getRemoveShortcutKey() == null ^ this.getRemoveShortcutKey() == null)
            return false;
        if (other.getRemoveShortcutKey() != null && other.getRemoveShortcutKey().equals(this.getRemoveShortcutKey()) == false)
            return false;
        if (other.getShortcutKey() == null ^ this.getShortcutKey() == null)
            return false;
        if (other.getShortcutKey() != null && other.getShortcutKey().equals(this.getShortcutKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupingConfiguration() == null) ? 0 : getGroupingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQuickResponseId() == null) ? 0 : getQuickResponseId().hashCode());
        hashCode = prime * hashCode + ((getRemoveDescription() == null) ? 0 : getRemoveDescription().hashCode());
        hashCode = prime * hashCode + ((getRemoveGroupingConfiguration() == null) ? 0 : getRemoveGroupingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRemoveShortcutKey() == null) ? 0 : getRemoveShortcutKey().hashCode());
        hashCode = prime * hashCode + ((getShortcutKey() == null) ? 0 : getShortcutKey().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQuickResponseRequest clone() {
        return (UpdateQuickResponseRequest) super.clone();
    }

}
