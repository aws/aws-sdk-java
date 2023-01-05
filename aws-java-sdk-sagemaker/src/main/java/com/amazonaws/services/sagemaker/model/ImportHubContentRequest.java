/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ImportHubContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportHubContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub content to import.
     * </p>
     */
    private String hubContentName;
    /**
     * <p>
     * The version of the hub content to import.
     * </p>
     */
    private String hubContentVersion;
    /**
     * <p>
     * The type of hub content to import.
     * </p>
     */
    private String hubContentType;
    /**
     * <p>
     * The version of the hub content schema to import.
     * </p>
     */
    private String documentSchemaVersion;
    /**
     * <p>
     * The name of the hub to import content into.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The display name of the hub content to import.
     * </p>
     */
    private String hubContentDisplayName;
    /**
     * <p>
     * A description of the hub content to import.
     * </p>
     */
    private String hubContentDescription;
    /**
     * <p>
     * Markdown files associated with the hub content to import.
     * </p>
     */
    private String hubContentMarkdown;
    /**
     * <p>
     * The hub content document that describes information about the hub content such as type, associated containers,
     * scripts, and more.
     * </p>
     */
    private String hubContentDocument;
    /**
     * <p>
     * The searchable keywords of the hub content.
     * </p>
     */
    private java.util.List<String> hubContentSearchKeywords;
    /**
     * <p>
     * Any tags associated with the hub content.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the hub content to import.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content to import.
     */

    public void setHubContentName(String hubContentName) {
        this.hubContentName = hubContentName;
    }

    /**
     * <p>
     * The name of the hub content to import.
     * </p>
     * 
     * @return The name of the hub content to import.
     */

    public String getHubContentName() {
        return this.hubContentName;
    }

    /**
     * <p>
     * The name of the hub content to import.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentName(String hubContentName) {
        setHubContentName(hubContentName);
        return this;
    }

    /**
     * <p>
     * The version of the hub content to import.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the hub content to import.
     */

    public void setHubContentVersion(String hubContentVersion) {
        this.hubContentVersion = hubContentVersion;
    }

    /**
     * <p>
     * The version of the hub content to import.
     * </p>
     * 
     * @return The version of the hub content to import.
     */

    public String getHubContentVersion() {
        return this.hubContentVersion;
    }

    /**
     * <p>
     * The version of the hub content to import.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentVersion(String hubContentVersion) {
        setHubContentVersion(hubContentVersion);
        return this;
    }

    /**
     * <p>
     * The type of hub content to import.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to import.
     * @see HubContentType
     */

    public void setHubContentType(String hubContentType) {
        this.hubContentType = hubContentType;
    }

    /**
     * <p>
     * The type of hub content to import.
     * </p>
     * 
     * @return The type of hub content to import.
     * @see HubContentType
     */

    public String getHubContentType() {
        return this.hubContentType;
    }

    /**
     * <p>
     * The type of hub content to import.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ImportHubContentRequest withHubContentType(String hubContentType) {
        setHubContentType(hubContentType);
        return this;
    }

    /**
     * <p>
     * The type of hub content to import.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ImportHubContentRequest withHubContentType(HubContentType hubContentType) {
        this.hubContentType = hubContentType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the hub content schema to import.
     * </p>
     * 
     * @param documentSchemaVersion
     *        The version of the hub content schema to import.
     */

    public void setDocumentSchemaVersion(String documentSchemaVersion) {
        this.documentSchemaVersion = documentSchemaVersion;
    }

    /**
     * <p>
     * The version of the hub content schema to import.
     * </p>
     * 
     * @return The version of the hub content schema to import.
     */

    public String getDocumentSchemaVersion() {
        return this.documentSchemaVersion;
    }

    /**
     * <p>
     * The version of the hub content schema to import.
     * </p>
     * 
     * @param documentSchemaVersion
     *        The version of the hub content schema to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withDocumentSchemaVersion(String documentSchemaVersion) {
        setDocumentSchemaVersion(documentSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The name of the hub to import content into.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to import content into.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub to import content into.
     * </p>
     * 
     * @return The name of the hub to import content into.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub to import content into.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to import content into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The display name of the hub content to import.
     * </p>
     * 
     * @param hubContentDisplayName
     *        The display name of the hub content to import.
     */

    public void setHubContentDisplayName(String hubContentDisplayName) {
        this.hubContentDisplayName = hubContentDisplayName;
    }

    /**
     * <p>
     * The display name of the hub content to import.
     * </p>
     * 
     * @return The display name of the hub content to import.
     */

    public String getHubContentDisplayName() {
        return this.hubContentDisplayName;
    }

    /**
     * <p>
     * The display name of the hub content to import.
     * </p>
     * 
     * @param hubContentDisplayName
     *        The display name of the hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentDisplayName(String hubContentDisplayName) {
        setHubContentDisplayName(hubContentDisplayName);
        return this;
    }

    /**
     * <p>
     * A description of the hub content to import.
     * </p>
     * 
     * @param hubContentDescription
     *        A description of the hub content to import.
     */

    public void setHubContentDescription(String hubContentDescription) {
        this.hubContentDescription = hubContentDescription;
    }

    /**
     * <p>
     * A description of the hub content to import.
     * </p>
     * 
     * @return A description of the hub content to import.
     */

    public String getHubContentDescription() {
        return this.hubContentDescription;
    }

    /**
     * <p>
     * A description of the hub content to import.
     * </p>
     * 
     * @param hubContentDescription
     *        A description of the hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentDescription(String hubContentDescription) {
        setHubContentDescription(hubContentDescription);
        return this;
    }

    /**
     * <p>
     * Markdown files associated with the hub content to import.
     * </p>
     * 
     * @param hubContentMarkdown
     *        Markdown files associated with the hub content to import.
     */

    public void setHubContentMarkdown(String hubContentMarkdown) {
        this.hubContentMarkdown = hubContentMarkdown;
    }

    /**
     * <p>
     * Markdown files associated with the hub content to import.
     * </p>
     * 
     * @return Markdown files associated with the hub content to import.
     */

    public String getHubContentMarkdown() {
        return this.hubContentMarkdown;
    }

    /**
     * <p>
     * Markdown files associated with the hub content to import.
     * </p>
     * 
     * @param hubContentMarkdown
     *        Markdown files associated with the hub content to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentMarkdown(String hubContentMarkdown) {
        setHubContentMarkdown(hubContentMarkdown);
        return this;
    }

    /**
     * <p>
     * The hub content document that describes information about the hub content such as type, associated containers,
     * scripts, and more.
     * </p>
     * 
     * @param hubContentDocument
     *        The hub content document that describes information about the hub content such as type, associated
     *        containers, scripts, and more.
     */

    public void setHubContentDocument(String hubContentDocument) {
        this.hubContentDocument = hubContentDocument;
    }

    /**
     * <p>
     * The hub content document that describes information about the hub content such as type, associated containers,
     * scripts, and more.
     * </p>
     * 
     * @return The hub content document that describes information about the hub content such as type, associated
     *         containers, scripts, and more.
     */

    public String getHubContentDocument() {
        return this.hubContentDocument;
    }

    /**
     * <p>
     * The hub content document that describes information about the hub content such as type, associated containers,
     * scripts, and more.
     * </p>
     * 
     * @param hubContentDocument
     *        The hub content document that describes information about the hub content such as type, associated
     *        containers, scripts, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentDocument(String hubContentDocument) {
        setHubContentDocument(hubContentDocument);
        return this;
    }

    /**
     * <p>
     * The searchable keywords of the hub content.
     * </p>
     * 
     * @return The searchable keywords of the hub content.
     */

    public java.util.List<String> getHubContentSearchKeywords() {
        return hubContentSearchKeywords;
    }

    /**
     * <p>
     * The searchable keywords of the hub content.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords of the hub content.
     */

    public void setHubContentSearchKeywords(java.util.Collection<String> hubContentSearchKeywords) {
        if (hubContentSearchKeywords == null) {
            this.hubContentSearchKeywords = null;
            return;
        }

        this.hubContentSearchKeywords = new java.util.ArrayList<String>(hubContentSearchKeywords);
    }

    /**
     * <p>
     * The searchable keywords of the hub content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubContentSearchKeywords(java.util.Collection)} or
     * {@link #withHubContentSearchKeywords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentSearchKeywords(String... hubContentSearchKeywords) {
        if (this.hubContentSearchKeywords == null) {
            setHubContentSearchKeywords(new java.util.ArrayList<String>(hubContentSearchKeywords.length));
        }
        for (String ele : hubContentSearchKeywords) {
            this.hubContentSearchKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The searchable keywords of the hub content.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withHubContentSearchKeywords(java.util.Collection<String> hubContentSearchKeywords) {
        setHubContentSearchKeywords(hubContentSearchKeywords);
        return this;
    }

    /**
     * <p>
     * Any tags associated with the hub content.
     * </p>
     * 
     * @return Any tags associated with the hub content.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags associated with the hub content.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the hub content.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags associated with the hub content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags associated with the hub content.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHubContentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getHubContentName() != null)
            sb.append("HubContentName: ").append(getHubContentName()).append(",");
        if (getHubContentVersion() != null)
            sb.append("HubContentVersion: ").append(getHubContentVersion()).append(",");
        if (getHubContentType() != null)
            sb.append("HubContentType: ").append(getHubContentType()).append(",");
        if (getDocumentSchemaVersion() != null)
            sb.append("DocumentSchemaVersion: ").append(getDocumentSchemaVersion()).append(",");
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubContentDisplayName() != null)
            sb.append("HubContentDisplayName: ").append(getHubContentDisplayName()).append(",");
        if (getHubContentDescription() != null)
            sb.append("HubContentDescription: ").append(getHubContentDescription()).append(",");
        if (getHubContentMarkdown() != null)
            sb.append("HubContentMarkdown: ").append(getHubContentMarkdown()).append(",");
        if (getHubContentDocument() != null)
            sb.append("HubContentDocument: ").append(getHubContentDocument()).append(",");
        if (getHubContentSearchKeywords() != null)
            sb.append("HubContentSearchKeywords: ").append(getHubContentSearchKeywords()).append(",");
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

        if (obj instanceof ImportHubContentRequest == false)
            return false;
        ImportHubContentRequest other = (ImportHubContentRequest) obj;
        if (other.getHubContentName() == null ^ this.getHubContentName() == null)
            return false;
        if (other.getHubContentName() != null && other.getHubContentName().equals(this.getHubContentName()) == false)
            return false;
        if (other.getHubContentVersion() == null ^ this.getHubContentVersion() == null)
            return false;
        if (other.getHubContentVersion() != null && other.getHubContentVersion().equals(this.getHubContentVersion()) == false)
            return false;
        if (other.getHubContentType() == null ^ this.getHubContentType() == null)
            return false;
        if (other.getHubContentType() != null && other.getHubContentType().equals(this.getHubContentType()) == false)
            return false;
        if (other.getDocumentSchemaVersion() == null ^ this.getDocumentSchemaVersion() == null)
            return false;
        if (other.getDocumentSchemaVersion() != null && other.getDocumentSchemaVersion().equals(this.getDocumentSchemaVersion()) == false)
            return false;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubContentDisplayName() == null ^ this.getHubContentDisplayName() == null)
            return false;
        if (other.getHubContentDisplayName() != null && other.getHubContentDisplayName().equals(this.getHubContentDisplayName()) == false)
            return false;
        if (other.getHubContentDescription() == null ^ this.getHubContentDescription() == null)
            return false;
        if (other.getHubContentDescription() != null && other.getHubContentDescription().equals(this.getHubContentDescription()) == false)
            return false;
        if (other.getHubContentMarkdown() == null ^ this.getHubContentMarkdown() == null)
            return false;
        if (other.getHubContentMarkdown() != null && other.getHubContentMarkdown().equals(this.getHubContentMarkdown()) == false)
            return false;
        if (other.getHubContentDocument() == null ^ this.getHubContentDocument() == null)
            return false;
        if (other.getHubContentDocument() != null && other.getHubContentDocument().equals(this.getHubContentDocument()) == false)
            return false;
        if (other.getHubContentSearchKeywords() == null ^ this.getHubContentSearchKeywords() == null)
            return false;
        if (other.getHubContentSearchKeywords() != null && other.getHubContentSearchKeywords().equals(this.getHubContentSearchKeywords()) == false)
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

        hashCode = prime * hashCode + ((getHubContentName() == null) ? 0 : getHubContentName().hashCode());
        hashCode = prime * hashCode + ((getHubContentVersion() == null) ? 0 : getHubContentVersion().hashCode());
        hashCode = prime * hashCode + ((getHubContentType() == null) ? 0 : getHubContentType().hashCode());
        hashCode = prime * hashCode + ((getDocumentSchemaVersion() == null) ? 0 : getDocumentSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubContentDisplayName() == null) ? 0 : getHubContentDisplayName().hashCode());
        hashCode = prime * hashCode + ((getHubContentDescription() == null) ? 0 : getHubContentDescription().hashCode());
        hashCode = prime * hashCode + ((getHubContentMarkdown() == null) ? 0 : getHubContentMarkdown().hashCode());
        hashCode = prime * hashCode + ((getHubContentDocument() == null) ? 0 : getHubContentDocument().hashCode());
        hashCode = prime * hashCode + ((getHubContentSearchKeywords() == null) ? 0 : getHubContentSearchKeywords().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportHubContentRequest clone() {
        return (ImportHubContentRequest) super.clone();
    }

}
