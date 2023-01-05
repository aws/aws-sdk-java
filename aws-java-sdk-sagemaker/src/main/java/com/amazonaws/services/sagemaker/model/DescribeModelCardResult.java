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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelCard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelCardResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     */
    private String modelCardArn;
    /**
     * <p>
     * The name of the model card.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The version of the model card.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * The content of the model card.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     */
    private String modelCardStatus;
    /**
     * <p>
     * The security configuration used to protect model card content.
     * </p>
     */
    private ModelCardSecurityConfig securityConfig;
    /**
     * <p>
     * The date and time the model card was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * The date and time the model card was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates throughout the
     * different deletion steps.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeletePending</code>: Model card deletion request received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code>: Model card deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentDeleted</code>: Deleted model card content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteCompleted</code>: Successfully deleted the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteFailed</code>: The model card failed to delete.
     * </p>
     * </li>
     * </ul>
     */
    private String modelCardProcessingStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) of the model card.
     */

    public void setModelCardArn(String modelCardArn) {
        this.modelCardArn = modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model card.
     */

    public String getModelCardArn() {
        return this.modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withModelCardArn(String modelCardArn) {
        setModelCardArn(modelCardArn);
        return this;
    }

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @return The name of the model card.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The version of the model card.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card.
     * </p>
     * 
     * @return The version of the model card.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * The content of the model card.
     * </p>
     * 
     * @param content
     *        The content of the model card.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the model card.
     * </p>
     * 
     * @return The content of the model card.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the model card.
     * </p>
     * 
     * @param content
     *        The content of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @see ModelCardStatus
     */

    public void setModelCardStatus(String modelCardStatus) {
        this.modelCardStatus = modelCardStatus;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The approval status of the model card within your organization. Different organizations might have
     *         different criteria for model card review and approval.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Draft</code>: The model card is a work in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PendingReview</code>: The model card is pending review.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Approved</code>: The model card is approved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *         it can still be exported.
     *         </p>
     *         </li>
     * @see ModelCardStatus
     */

    public String getModelCardStatus() {
        return this.modelCardStatus;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public DescribeModelCardResult withModelCardStatus(String modelCardStatus) {
        setModelCardStatus(modelCardStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public DescribeModelCardResult withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
        return this;
    }

    /**
     * <p>
     * The security configuration used to protect model card content.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration used to protect model card content.
     */

    public void setSecurityConfig(ModelCardSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * The security configuration used to protect model card content.
     * </p>
     * 
     * @return The security configuration used to protect model card content.
     */

    public ModelCardSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * The security configuration used to protect model card content.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration used to protect model card content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withSecurityConfig(ModelCardSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * The date and time the model card was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the model card was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the model card was created.
     * </p>
     * 
     * @return The date and time the model card was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the model card was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the model card was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time the model card was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the model card was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the model card was last modified.
     * </p>
     * 
     * @return The date and time the model card was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the model card was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the model card was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelCardResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates throughout the
     * different deletion steps.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeletePending</code>: Model card deletion request received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code>: Model card deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentDeleted</code>: Deleted model card content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteCompleted</code>: Successfully deleted the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteFailed</code>: The model card failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardProcessingStatus
     *        The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates
     *        throughout the different deletion steps.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeletePending</code>: Model card deletion request received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code>: Model card deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentDeleted</code>: Deleted model card content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteCompleted</code>: Successfully deleted the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteFailed</code>: The model card failed to delete.
     *        </p>
     *        </li>
     * @see ModelCardProcessingStatus
     */

    public void setModelCardProcessingStatus(String modelCardProcessingStatus) {
        this.modelCardProcessingStatus = modelCardProcessingStatus;
    }

    /**
     * <p>
     * The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates throughout the
     * different deletion steps.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeletePending</code>: Model card deletion request received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code>: Model card deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentDeleted</code>: Deleted model card content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteCompleted</code>: Successfully deleted the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteFailed</code>: The model card failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates
     *         throughout the different deletion steps.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeletePending</code>: Model card deletion request received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeleteInProgress</code>: Model card deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentDeleted</code>: Deleted model card content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeleteCompleted</code>: Successfully deleted the model card.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeleteFailed</code>: The model card failed to delete.
     *         </p>
     *         </li>
     * @see ModelCardProcessingStatus
     */

    public String getModelCardProcessingStatus() {
        return this.modelCardProcessingStatus;
    }

    /**
     * <p>
     * The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates throughout the
     * different deletion steps.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeletePending</code>: Model card deletion request received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code>: Model card deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentDeleted</code>: Deleted model card content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteCompleted</code>: Successfully deleted the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteFailed</code>: The model card failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardProcessingStatus
     *        The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates
     *        throughout the different deletion steps.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeletePending</code>: Model card deletion request received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code>: Model card deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentDeleted</code>: Deleted model card content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteCompleted</code>: Successfully deleted the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteFailed</code>: The model card failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardProcessingStatus
     */

    public DescribeModelCardResult withModelCardProcessingStatus(String modelCardProcessingStatus) {
        setModelCardProcessingStatus(modelCardProcessingStatus);
        return this;
    }

    /**
     * <p>
     * The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates throughout the
     * different deletion steps.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeletePending</code>: Model card deletion request received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code>: Model card deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentDeleted</code>: Deleted model card content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteCompleted</code>: Successfully deleted the model card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteFailed</code>: The model card failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardProcessingStatus
     *        The processing status of model card deletion. The <code>ModelCardProcessingStatus</code> updates
     *        throughout the different deletion steps.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeletePending</code>: Model card deletion request received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code>: Model card deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentDeleted</code>: Deleted model card content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExportJobsDeleted</code>: Deleted all export jobs associated with the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteCompleted</code>: Successfully deleted the model card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteFailed</code>: The model card failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardProcessingStatus
     */

    public DescribeModelCardResult withModelCardProcessingStatus(ModelCardProcessingStatus modelCardProcessingStatus) {
        this.modelCardProcessingStatus = modelCardProcessingStatus.toString();
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
        if (getModelCardArn() != null)
            sb.append("ModelCardArn: ").append(getModelCardArn()).append(",");
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getModelCardProcessingStatus() != null)
            sb.append("ModelCardProcessingStatus: ").append(getModelCardProcessingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelCardResult == false)
            return false;
        DescribeModelCardResult other = (DescribeModelCardResult) obj;
        if (other.getModelCardArn() == null ^ this.getModelCardArn() == null)
            return false;
        if (other.getModelCardArn() != null && other.getModelCardArn().equals(this.getModelCardArn()) == false)
            return false;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getModelCardProcessingStatus() == null ^ this.getModelCardProcessingStatus() == null)
            return false;
        if (other.getModelCardProcessingStatus() != null && other.getModelCardProcessingStatus().equals(this.getModelCardProcessingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardArn() == null) ? 0 : getModelCardArn().hashCode());
        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getModelCardProcessingStatus() == null) ? 0 : getModelCardProcessingStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelCardResult clone() {
        try {
            return (DescribeModelCardResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
