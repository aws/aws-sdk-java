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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of quick response search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QuickResponseSearchResultData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseSearchResultData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user defined contact attributes that are resolved when the search result is returned.
     * </p>
     */
    private java.util.List<String> attributesInterpolated;
    /**
     * <p>
     * The user defined contact attributes that are not resolved when the search result is returned.
     * </p>
     */
    private java.util.List<String> attributesNotInterpolated;
    /**
     * <p>
     * The Amazon Connect contact channels this quick response applies to. The supported contact channel types include
     * <code>Chat</code>.
     * </p>
     */
    private java.util.List<String> channels;
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
     * The contents of the quick response.
     * </p>
     */
    private QuickResponseContents contents;
    /**
     * <p>
     * The timestamp when the quick response was created.
     * </p>
     */
    private java.util.Date createdTime;
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
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The language code value for the language in which the quick response is written.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The timestamp when the quick response search result data was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the quick response.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick response.
     * </p>
     */
    private String quickResponseArn;
    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     */
    private String quickResponseId;
    /**
     * <p>
     * The shortcut key of the quick response. The value should be unique across the knowledge base.
     * </p>
     */
    private String shortcutKey;
    /**
     * <p>
     * The resource status of the quick response.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The user defined contact attributes that are resolved when the search result is returned.
     * </p>
     * 
     * @return The user defined contact attributes that are resolved when the search result is returned.
     */

    public java.util.List<String> getAttributesInterpolated() {
        return attributesInterpolated;
    }

    /**
     * <p>
     * The user defined contact attributes that are resolved when the search result is returned.
     * </p>
     * 
     * @param attributesInterpolated
     *        The user defined contact attributes that are resolved when the search result is returned.
     */

    public void setAttributesInterpolated(java.util.Collection<String> attributesInterpolated) {
        if (attributesInterpolated == null) {
            this.attributesInterpolated = null;
            return;
        }

        this.attributesInterpolated = new java.util.ArrayList<String>(attributesInterpolated);
    }

    /**
     * <p>
     * The user defined contact attributes that are resolved when the search result is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesInterpolated(java.util.Collection)} or
     * {@link #withAttributesInterpolated(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attributesInterpolated
     *        The user defined contact attributes that are resolved when the search result is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withAttributesInterpolated(String... attributesInterpolated) {
        if (this.attributesInterpolated == null) {
            setAttributesInterpolated(new java.util.ArrayList<String>(attributesInterpolated.length));
        }
        for (String ele : attributesInterpolated) {
            this.attributesInterpolated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user defined contact attributes that are resolved when the search result is returned.
     * </p>
     * 
     * @param attributesInterpolated
     *        The user defined contact attributes that are resolved when the search result is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withAttributesInterpolated(java.util.Collection<String> attributesInterpolated) {
        setAttributesInterpolated(attributesInterpolated);
        return this;
    }

    /**
     * <p>
     * The user defined contact attributes that are not resolved when the search result is returned.
     * </p>
     * 
     * @return The user defined contact attributes that are not resolved when the search result is returned.
     */

    public java.util.List<String> getAttributesNotInterpolated() {
        return attributesNotInterpolated;
    }

    /**
     * <p>
     * The user defined contact attributes that are not resolved when the search result is returned.
     * </p>
     * 
     * @param attributesNotInterpolated
     *        The user defined contact attributes that are not resolved when the search result is returned.
     */

    public void setAttributesNotInterpolated(java.util.Collection<String> attributesNotInterpolated) {
        if (attributesNotInterpolated == null) {
            this.attributesNotInterpolated = null;
            return;
        }

        this.attributesNotInterpolated = new java.util.ArrayList<String>(attributesNotInterpolated);
    }

    /**
     * <p>
     * The user defined contact attributes that are not resolved when the search result is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesNotInterpolated(java.util.Collection)} or
     * {@link #withAttributesNotInterpolated(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attributesNotInterpolated
     *        The user defined contact attributes that are not resolved when the search result is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withAttributesNotInterpolated(String... attributesNotInterpolated) {
        if (this.attributesNotInterpolated == null) {
            setAttributesNotInterpolated(new java.util.ArrayList<String>(attributesNotInterpolated.length));
        }
        for (String ele : attributesNotInterpolated) {
            this.attributesNotInterpolated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user defined contact attributes that are not resolved when the search result is returned.
     * </p>
     * 
     * @param attributesNotInterpolated
     *        The user defined contact attributes that are not resolved when the search result is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withAttributesNotInterpolated(java.util.Collection<String> attributesNotInterpolated) {
        setAttributesNotInterpolated(attributesNotInterpolated);
        return this;
    }

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

    public QuickResponseSearchResultData withChannels(String... channels) {
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

    public QuickResponseSearchResultData withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
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

    public QuickResponseSearchResultData withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The contents of the quick response.
     * </p>
     * 
     * @param contents
     *        The contents of the quick response.
     */

    public void setContents(QuickResponseContents contents) {
        this.contents = contents;
    }

    /**
     * <p>
     * The contents of the quick response.
     * </p>
     * 
     * @return The contents of the quick response.
     */

    public QuickResponseContents getContents() {
        return this.contents;
    }

    /**
     * <p>
     * The contents of the quick response.
     * </p>
     * 
     * @param contents
     *        The contents of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withContents(QuickResponseContents contents) {
        setContents(contents);
        return this;
    }

    /**
     * <p>
     * The timestamp when the quick response was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the quick response was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the quick response was created.
     * </p>
     * 
     * @return The timestamp when the quick response was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the quick response was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the quick response was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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

    public QuickResponseSearchResultData withDescription(String description) {
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

    public QuickResponseSearchResultData withGroupingConfiguration(GroupingConfiguration groupingConfiguration) {
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

    public QuickResponseSearchResultData withIsActive(Boolean isActive) {
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
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     */

    public void setKnowledgeBaseArn(String knowledgeBaseArn) {
        this.knowledgeBaseArn = knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the knowledge base.
     */

    public String getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
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

    public QuickResponseSearchResultData withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written.
     * </p>
     * 
     * @param language
     *        The language code value for the language in which the quick response is written.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written.
     * </p>
     * 
     * @return The language code value for the language in which the quick response is written.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language code value for the language in which the quick response is written.
     * </p>
     * 
     * @param language
     *        The language code value for the language in which the quick response is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the quick response search result data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The timestamp when the quick response search result data was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the quick response search result data was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the quick response search result data was last modified.
     * </p>
     * 
     * @return The timestamp when the quick response search result data was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the quick response search result data was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the quick response search result data was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public QuickResponseSearchResultData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick response.
     * </p>
     * 
     * @param quickResponseArn
     *        The Amazon Resource Name (ARN) of the quick response.
     */

    public void setQuickResponseArn(String quickResponseArn) {
        this.quickResponseArn = quickResponseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick response.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the quick response.
     */

    public String getQuickResponseArn() {
        return this.quickResponseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick response.
     * </p>
     * 
     * @param quickResponseArn
     *        The Amazon Resource Name (ARN) of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData withQuickResponseArn(String quickResponseArn) {
        setQuickResponseArn(quickResponseArn);
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

    public QuickResponseSearchResultData withQuickResponseId(String quickResponseId) {
        setQuickResponseId(quickResponseId);
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

    public QuickResponseSearchResultData withShortcutKey(String shortcutKey) {
        setShortcutKey(shortcutKey);
        return this;
    }

    /**
     * <p>
     * The resource status of the quick response.
     * </p>
     * 
     * @param status
     *        The resource status of the quick response.
     * @see QuickResponseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The resource status of the quick response.
     * </p>
     * 
     * @return The resource status of the quick response.
     * @see QuickResponseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The resource status of the quick response.
     * </p>
     * 
     * @param status
     *        The resource status of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseStatus
     */

    public QuickResponseSearchResultData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The resource status of the quick response.
     * </p>
     * 
     * @param status
     *        The resource status of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseStatus
     */

    public QuickResponseSearchResultData withStatus(QuickResponseStatus status) {
        this.status = status.toString();
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

    public QuickResponseSearchResultData withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see QuickResponseSearchResultData#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchResultData addTagsEntry(String key, String value) {
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

    public QuickResponseSearchResultData clearTagsEntries() {
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
        if (getAttributesInterpolated() != null)
            sb.append("AttributesInterpolated: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributesNotInterpolated() != null)
            sb.append("AttributesNotInterpolated: ").append("***Sensitive Data Redacted***").append(",");
        if (getChannels() != null)
            sb.append("Channels: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContents() != null)
            sb.append("Contents: ").append(getContents()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupingConfiguration() != null)
            sb.append("GroupingConfiguration: ").append(getGroupingConfiguration()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQuickResponseArn() != null)
            sb.append("QuickResponseArn: ").append(getQuickResponseArn()).append(",");
        if (getQuickResponseId() != null)
            sb.append("QuickResponseId: ").append(getQuickResponseId()).append(",");
        if (getShortcutKey() != null)
            sb.append("ShortcutKey: ").append(getShortcutKey()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof QuickResponseSearchResultData == false)
            return false;
        QuickResponseSearchResultData other = (QuickResponseSearchResultData) obj;
        if (other.getAttributesInterpolated() == null ^ this.getAttributesInterpolated() == null)
            return false;
        if (other.getAttributesInterpolated() != null && other.getAttributesInterpolated().equals(this.getAttributesInterpolated()) == false)
            return false;
        if (other.getAttributesNotInterpolated() == null ^ this.getAttributesNotInterpolated() == null)
            return false;
        if (other.getAttributesNotInterpolated() != null && other.getAttributesNotInterpolated().equals(this.getAttributesNotInterpolated()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContents() == null ^ this.getContents() == null)
            return false;
        if (other.getContents() != null && other.getContents().equals(this.getContents()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
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
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQuickResponseArn() == null ^ this.getQuickResponseArn() == null)
            return false;
        if (other.getQuickResponseArn() != null && other.getQuickResponseArn().equals(this.getQuickResponseArn()) == false)
            return false;
        if (other.getQuickResponseId() == null ^ this.getQuickResponseId() == null)
            return false;
        if (other.getQuickResponseId() != null && other.getQuickResponseId().equals(this.getQuickResponseId()) == false)
            return false;
        if (other.getShortcutKey() == null ^ this.getShortcutKey() == null)
            return false;
        if (other.getShortcutKey() != null && other.getShortcutKey().equals(this.getShortcutKey()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getAttributesInterpolated() == null) ? 0 : getAttributesInterpolated().hashCode());
        hashCode = prime * hashCode + ((getAttributesNotInterpolated() == null) ? 0 : getAttributesNotInterpolated().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContents() == null) ? 0 : getContents().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupingConfiguration() == null) ? 0 : getGroupingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQuickResponseArn() == null) ? 0 : getQuickResponseArn().hashCode());
        hashCode = prime * hashCode + ((getQuickResponseId() == null) ? 0 : getQuickResponseId().hashCode());
        hashCode = prime * hashCode + ((getShortcutKey() == null) ? 0 : getShortcutKey().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseSearchResultData clone() {
        try {
            return (QuickResponseSearchResultData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.QuickResponseSearchResultDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
