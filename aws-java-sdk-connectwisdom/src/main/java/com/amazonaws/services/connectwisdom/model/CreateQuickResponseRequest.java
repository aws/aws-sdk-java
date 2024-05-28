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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateQuickResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQuickResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Connect channels this quick response applies to.
     * </p>
     */
    private java.util.List<String> channels;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The content of the quick response.
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
     * Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * The description of the quick response.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The configuration information of the user groups that the quick response is accessible to.
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
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     */
    private String shortcutKey;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Connect channels this quick response applies to.
     * </p>
     * 
     * @return The Amazon Connect channels this quick response applies to.
     */

    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The Amazon Connect channels this quick response applies to.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect channels this quick response applies to.
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
     * The Amazon Connect channels this quick response applies to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect channels this quick response applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withChannels(String... channels) {
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
     * The Amazon Connect channels this quick response applies to.
     * </p>
     * 
     * @param channels
     *        The Amazon Connect channels this quick response applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The content of the quick response.
     * </p>
     * 
     * @param content
     *        The content of the quick response.
     */

    public void setContent(QuickResponseDataProvider content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the quick response.
     * </p>
     * 
     * @return The content of the quick response.
     */

    public QuickResponseDataProvider getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the quick response.
     * </p>
     * 
     * @param content
     *        The content of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withContent(QuickResponseDataProvider content) {
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
     * Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The media type of the quick response content.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
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
     * Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The media type of the quick response content.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
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
     * Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The media type of the quick response content.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=plain</code> for a quick response written in plain text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>application/x.quickresponse;format=markdown</code> for a quick response written in richtext.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The description of the quick response.
     * </p>
     * 
     * @param description
     *        The description of the quick response.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the quick response.
     * </p>
     * 
     * @return The description of the quick response.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the quick response.
     * </p>
     * 
     * @param description
     *        The description of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The configuration information of the user groups that the quick response is accessible to.
     * </p>
     * 
     * @param groupingConfiguration
     *        The configuration information of the user groups that the quick response is accessible to.
     */

    public void setGroupingConfiguration(GroupingConfiguration groupingConfiguration) {
        this.groupingConfiguration = groupingConfiguration;
    }

    /**
     * <p>
     * The configuration information of the user groups that the quick response is accessible to.
     * </p>
     * 
     * @return The configuration information of the user groups that the quick response is accessible to.
     */

    public GroupingConfiguration getGroupingConfiguration() {
        return this.groupingConfiguration;
    }

    /**
     * <p>
     * The configuration information of the user groups that the quick response is accessible to.
     * </p>
     * 
     * @param groupingConfiguration
     *        The configuration information of the user groups that the quick response is accessible to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withGroupingConfiguration(GroupingConfiguration groupingConfiguration) {
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

    public CreateQuickResponseRequest withIsActive(Boolean isActive) {
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

    public CreateQuickResponseRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

    public CreateQuickResponseRequest withLanguage(String language) {
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

    public CreateQuickResponseRequest withName(String name) {
        setName(name);
        return this;
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

    public CreateQuickResponseRequest withShortcutKey(String shortcutKey) {
        setShortcutKey(shortcutKey);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateQuickResponseRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuickResponseRequest addTagsEntry(String key, String value) {
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

    public CreateQuickResponseRequest clearTagsEntries() {
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
        if (getChannels() != null)
            sb.append("Channels: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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
        if (getShortcutKey() != null)
            sb.append("ShortcutKey: ").append(getShortcutKey()).append(",");
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

        if (obj instanceof CreateQuickResponseRequest == false)
            return false;
        CreateQuickResponseRequest other = (CreateQuickResponseRequest) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getShortcutKey() == null ^ this.getShortcutKey() == null)
            return false;
        if (other.getShortcutKey() != null && other.getShortcutKey().equals(this.getShortcutKey()) == false)
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

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupingConfiguration() == null) ? 0 : getGroupingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortcutKey() == null) ? 0 : getShortcutKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQuickResponseRequest clone() {
        return (CreateQuickResponseRequest) super.clone();
    }

}
