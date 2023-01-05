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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHubContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHubContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub content.
     * </p>
     */
    private String hubContentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub content.
     * </p>
     */
    private String hubContentArn;
    /**
     * <p>
     * The version of the hub content.
     * </p>
     */
    private String hubContentVersion;
    /**
     * <p>
     * The type of hub content.
     * </p>
     */
    private String hubContentType;
    /**
     * <p>
     * The document schema version for the hub content.
     * </p>
     */
    private String documentSchemaVersion;
    /**
     * <p>
     * The name of the hub that contains the content.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub that contains the content.
     * </p>
     */
    private String hubArn;
    /**
     * <p>
     * The display name of the hub content.
     * </p>
     */
    private String hubContentDisplayName;
    /**
     * <p>
     * A description of the hub content.
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
     * The searchable keywords for the hub content.
     * </p>
     */
    private java.util.List<String> hubContentSearchKeywords;
    /**
     * <p>
     * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     * notebooks.
     * </p>
     */
    private java.util.List<HubContentDependency> hubContentDependencies;
    /**
     * <p>
     * The status of the hub content.
     * </p>
     */
    private String hubContentStatus;
    /**
     * <p>
     * The failure reason if importing hub content failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The date and time that hub content was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content.
     */

    public void setHubContentName(String hubContentName) {
        this.hubContentName = hubContentName;
    }

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @return The name of the hub content.
     */

    public String getHubContentName() {
        return this.hubContentName;
    }

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentName(String hubContentName) {
        setHubContentName(hubContentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub content.
     * </p>
     * 
     * @param hubContentArn
     *        The Amazon Resource Name (ARN) of the hub content.
     */

    public void setHubContentArn(String hubContentArn) {
        this.hubContentArn = hubContentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hub content.
     */

    public String getHubContentArn() {
        return this.hubContentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub content.
     * </p>
     * 
     * @param hubContentArn
     *        The Amazon Resource Name (ARN) of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentArn(String hubContentArn) {
        setHubContentArn(hubContentArn);
        return this;
    }

    /**
     * <p>
     * The version of the hub content.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the hub content.
     */

    public void setHubContentVersion(String hubContentVersion) {
        this.hubContentVersion = hubContentVersion;
    }

    /**
     * <p>
     * The version of the hub content.
     * </p>
     * 
     * @return The version of the hub content.
     */

    public String getHubContentVersion() {
        return this.hubContentVersion;
    }

    /**
     * <p>
     * The version of the hub content.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentVersion(String hubContentVersion) {
        setHubContentVersion(hubContentVersion);
        return this;
    }

    /**
     * <p>
     * The type of hub content.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content.
     * @see HubContentType
     */

    public void setHubContentType(String hubContentType) {
        this.hubContentType = hubContentType;
    }

    /**
     * <p>
     * The type of hub content.
     * </p>
     * 
     * @return The type of hub content.
     * @see HubContentType
     */

    public String getHubContentType() {
        return this.hubContentType;
    }

    /**
     * <p>
     * The type of hub content.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public DescribeHubContentResult withHubContentType(String hubContentType) {
        setHubContentType(hubContentType);
        return this;
    }

    /**
     * <p>
     * The type of hub content.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public DescribeHubContentResult withHubContentType(HubContentType hubContentType) {
        this.hubContentType = hubContentType.toString();
        return this;
    }

    /**
     * <p>
     * The document schema version for the hub content.
     * </p>
     * 
     * @param documentSchemaVersion
     *        The document schema version for the hub content.
     */

    public void setDocumentSchemaVersion(String documentSchemaVersion) {
        this.documentSchemaVersion = documentSchemaVersion;
    }

    /**
     * <p>
     * The document schema version for the hub content.
     * </p>
     * 
     * @return The document schema version for the hub content.
     */

    public String getDocumentSchemaVersion() {
        return this.documentSchemaVersion;
    }

    /**
     * <p>
     * The document schema version for the hub content.
     * </p>
     * 
     * @param documentSchemaVersion
     *        The document schema version for the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withDocumentSchemaVersion(String documentSchemaVersion) {
        setDocumentSchemaVersion(documentSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The name of the hub that contains the content.
     * </p>
     * 
     * @param hubName
     *        The name of the hub that contains the content.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub that contains the content.
     * </p>
     * 
     * @return The name of the hub that contains the content.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub that contains the content.
     * </p>
     * 
     * @param hubName
     *        The name of the hub that contains the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub that contains the content.
     * </p>
     * 
     * @param hubArn
     *        The Amazon Resource Name (ARN) of the hub that contains the content.
     */

    public void setHubArn(String hubArn) {
        this.hubArn = hubArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub that contains the content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hub that contains the content.
     */

    public String getHubArn() {
        return this.hubArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub that contains the content.
     * </p>
     * 
     * @param hubArn
     *        The Amazon Resource Name (ARN) of the hub that contains the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubArn(String hubArn) {
        setHubArn(hubArn);
        return this;
    }

    /**
     * <p>
     * The display name of the hub content.
     * </p>
     * 
     * @param hubContentDisplayName
     *        The display name of the hub content.
     */

    public void setHubContentDisplayName(String hubContentDisplayName) {
        this.hubContentDisplayName = hubContentDisplayName;
    }

    /**
     * <p>
     * The display name of the hub content.
     * </p>
     * 
     * @return The display name of the hub content.
     */

    public String getHubContentDisplayName() {
        return this.hubContentDisplayName;
    }

    /**
     * <p>
     * The display name of the hub content.
     * </p>
     * 
     * @param hubContentDisplayName
     *        The display name of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentDisplayName(String hubContentDisplayName) {
        setHubContentDisplayName(hubContentDisplayName);
        return this;
    }

    /**
     * <p>
     * A description of the hub content.
     * </p>
     * 
     * @param hubContentDescription
     *        A description of the hub content.
     */

    public void setHubContentDescription(String hubContentDescription) {
        this.hubContentDescription = hubContentDescription;
    }

    /**
     * <p>
     * A description of the hub content.
     * </p>
     * 
     * @return A description of the hub content.
     */

    public String getHubContentDescription() {
        return this.hubContentDescription;
    }

    /**
     * <p>
     * A description of the hub content.
     * </p>
     * 
     * @param hubContentDescription
     *        A description of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentDescription(String hubContentDescription) {
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

    public DescribeHubContentResult withHubContentMarkdown(String hubContentMarkdown) {
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

    public DescribeHubContentResult withHubContentDocument(String hubContentDocument) {
        setHubContentDocument(hubContentDocument);
        return this;
    }

    /**
     * <p>
     * The searchable keywords for the hub content.
     * </p>
     * 
     * @return The searchable keywords for the hub content.
     */

    public java.util.List<String> getHubContentSearchKeywords() {
        return hubContentSearchKeywords;
    }

    /**
     * <p>
     * The searchable keywords for the hub content.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords for the hub content.
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
     * The searchable keywords for the hub content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubContentSearchKeywords(java.util.Collection)} or
     * {@link #withHubContentSearchKeywords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords for the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentSearchKeywords(String... hubContentSearchKeywords) {
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
     * The searchable keywords for the hub content.
     * </p>
     * 
     * @param hubContentSearchKeywords
     *        The searchable keywords for the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentSearchKeywords(java.util.Collection<String> hubContentSearchKeywords) {
        setHubContentSearchKeywords(hubContentSearchKeywords);
        return this;
    }

    /**
     * <p>
     * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     * notebooks.
     * </p>
     * 
     * @return The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     *         notebooks.
     */

    public java.util.List<HubContentDependency> getHubContentDependencies() {
        return hubContentDependencies;
    }

    /**
     * <p>
     * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     * notebooks.
     * </p>
     * 
     * @param hubContentDependencies
     *        The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     *        notebooks.
     */

    public void setHubContentDependencies(java.util.Collection<HubContentDependency> hubContentDependencies) {
        if (hubContentDependencies == null) {
            this.hubContentDependencies = null;
            return;
        }

        this.hubContentDependencies = new java.util.ArrayList<HubContentDependency>(hubContentDependencies);
    }

    /**
     * <p>
     * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     * notebooks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubContentDependencies(java.util.Collection)} or
     * {@link #withHubContentDependencies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hubContentDependencies
     *        The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     *        notebooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentDependencies(HubContentDependency... hubContentDependencies) {
        if (this.hubContentDependencies == null) {
            setHubContentDependencies(new java.util.ArrayList<HubContentDependency>(hubContentDependencies.length));
        }
        for (HubContentDependency ele : hubContentDependencies) {
            this.hubContentDependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     * notebooks.
     * </p>
     * 
     * @param hubContentDependencies
     *        The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or
     *        notebooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withHubContentDependencies(java.util.Collection<HubContentDependency> hubContentDependencies) {
        setHubContentDependencies(hubContentDependencies);
        return this;
    }

    /**
     * <p>
     * The status of the hub content.
     * </p>
     * 
     * @param hubContentStatus
     *        The status of the hub content.
     * @see HubContentStatus
     */

    public void setHubContentStatus(String hubContentStatus) {
        this.hubContentStatus = hubContentStatus;
    }

    /**
     * <p>
     * The status of the hub content.
     * </p>
     * 
     * @return The status of the hub content.
     * @see HubContentStatus
     */

    public String getHubContentStatus() {
        return this.hubContentStatus;
    }

    /**
     * <p>
     * The status of the hub content.
     * </p>
     * 
     * @param hubContentStatus
     *        The status of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentStatus
     */

    public DescribeHubContentResult withHubContentStatus(String hubContentStatus) {
        setHubContentStatus(hubContentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the hub content.
     * </p>
     * 
     * @param hubContentStatus
     *        The status of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentStatus
     */

    public DescribeHubContentResult withHubContentStatus(HubContentStatus hubContentStatus) {
        this.hubContentStatus = hubContentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The failure reason if importing hub content failed.
     * </p>
     * 
     * @param failureReason
     *        The failure reason if importing hub content failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason if importing hub content failed.
     * </p>
     * 
     * @return The failure reason if importing hub content failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason if importing hub content failed.
     * </p>
     * 
     * @param failureReason
     *        The failure reason if importing hub content failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date and time that hub content was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that hub content was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that hub content was created.
     * </p>
     * 
     * @return The date and time that hub content was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that hub content was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that hub content was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getHubContentArn() != null)
            sb.append("HubContentArn: ").append(getHubContentArn()).append(",");
        if (getHubContentVersion() != null)
            sb.append("HubContentVersion: ").append(getHubContentVersion()).append(",");
        if (getHubContentType() != null)
            sb.append("HubContentType: ").append(getHubContentType()).append(",");
        if (getDocumentSchemaVersion() != null)
            sb.append("DocumentSchemaVersion: ").append(getDocumentSchemaVersion()).append(",");
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubArn() != null)
            sb.append("HubArn: ").append(getHubArn()).append(",");
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
        if (getHubContentDependencies() != null)
            sb.append("HubContentDependencies: ").append(getHubContentDependencies()).append(",");
        if (getHubContentStatus() != null)
            sb.append("HubContentStatus: ").append(getHubContentStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHubContentResult == false)
            return false;
        DescribeHubContentResult other = (DescribeHubContentResult) obj;
        if (other.getHubContentName() == null ^ this.getHubContentName() == null)
            return false;
        if (other.getHubContentName() != null && other.getHubContentName().equals(this.getHubContentName()) == false)
            return false;
        if (other.getHubContentArn() == null ^ this.getHubContentArn() == null)
            return false;
        if (other.getHubContentArn() != null && other.getHubContentArn().equals(this.getHubContentArn()) == false)
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
        if (other.getHubArn() == null ^ this.getHubArn() == null)
            return false;
        if (other.getHubArn() != null && other.getHubArn().equals(this.getHubArn()) == false)
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
        if (other.getHubContentDependencies() == null ^ this.getHubContentDependencies() == null)
            return false;
        if (other.getHubContentDependencies() != null && other.getHubContentDependencies().equals(this.getHubContentDependencies()) == false)
            return false;
        if (other.getHubContentStatus() == null ^ this.getHubContentStatus() == null)
            return false;
        if (other.getHubContentStatus() != null && other.getHubContentStatus().equals(this.getHubContentStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubContentName() == null) ? 0 : getHubContentName().hashCode());
        hashCode = prime * hashCode + ((getHubContentArn() == null) ? 0 : getHubContentArn().hashCode());
        hashCode = prime * hashCode + ((getHubContentVersion() == null) ? 0 : getHubContentVersion().hashCode());
        hashCode = prime * hashCode + ((getHubContentType() == null) ? 0 : getHubContentType().hashCode());
        hashCode = prime * hashCode + ((getDocumentSchemaVersion() == null) ? 0 : getDocumentSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubArn() == null) ? 0 : getHubArn().hashCode());
        hashCode = prime * hashCode + ((getHubContentDisplayName() == null) ? 0 : getHubContentDisplayName().hashCode());
        hashCode = prime * hashCode + ((getHubContentDescription() == null) ? 0 : getHubContentDescription().hashCode());
        hashCode = prime * hashCode + ((getHubContentMarkdown() == null) ? 0 : getHubContentMarkdown().hashCode());
        hashCode = prime * hashCode + ((getHubContentDocument() == null) ? 0 : getHubContentDocument().hashCode());
        hashCode = prime * hashCode + ((getHubContentSearchKeywords() == null) ? 0 : getHubContentSearchKeywords().hashCode());
        hashCode = prime * hashCode + ((getHubContentDependencies() == null) ? 0 : getHubContentDependencies().hashCode());
        hashCode = prime * hashCode + ((getHubContentStatus() == null) ? 0 : getHubContentStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHubContentResult clone() {
        try {
            return (DescribeHubContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
