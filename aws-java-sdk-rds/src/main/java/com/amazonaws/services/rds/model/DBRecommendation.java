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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The recommendation for your DB instances, DB clusters, and DB parameter groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBRecommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBRecommendation implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * A value that indicates the type of recommendation. This value determines how the description is rendered.
     * </p>
     */
    private String typeId;
    /**
     * <p>
     * The severity level of the recommendation. The severity level can help you decide the urgency with which to
     * address the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     */
    private String severity;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The current status of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time when the recommendation was last updated.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * A short description of the issue identified for this recommendation. The description might contain markdown.
     * </p>
     */
    private String detection;
    /**
     * <p>
     * A short description of the recommendation to resolve an issue. The description might contain markdown.
     * </p>
     */
    private String recommendation;
    /**
     * <p>
     * A detailed description of the recommendation. The description might contain markdown.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The reason why this recommendation was created. The information might contain markdown.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A list of recommended actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecommendedAction> recommendedActions;
    /**
     * <p>
     * The category of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>performance efficiency</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>security</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reliability</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cost optimization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>operational excellence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sustainability</code>
     * </p>
     * </li>
     * </ul>
     */
    private String category;
    /**
     * <p>
     * The Amazon Web Services service that generated the recommendations.
     * </p>
     */
    private String source;
    /**
     * <p>
     * A short description of the recommendation type. The description might contain markdown.
     * </p>
     */
    private String typeDetection;
    /**
     * <p>
     * A short description that summarizes the recommendation to fix all the issues of the recommendation type. The
     * description might contain markdown.
     * </p>
     */
    private String typeRecommendation;
    /**
     * <p>
     * A short description that explains the possible impact of an issue.
     * </p>
     */
    private String impact;
    /**
     * <p>
     * Additional information about the recommendation. The information might contain markdown.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * A link to documentation that provides additional information about the recommendation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocLink> links;
    /**
     * <p>
     * Details of the issue that caused the recommendation.
     * </p>
     */
    private IssueDetails issueDetails;

    /**
     * <p>
     * The unique identifier of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier of the recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The unique identifier of the recommendation.
     * </p>
     * 
     * @return The unique identifier of the recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The unique identifier of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * A value that indicates the type of recommendation. This value determines how the description is rendered.
     * </p>
     * 
     * @param typeId
     *        A value that indicates the type of recommendation. This value determines how the description is rendered.
     */

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * <p>
     * A value that indicates the type of recommendation. This value determines how the description is rendered.
     * </p>
     * 
     * @return A value that indicates the type of recommendation. This value determines how the description is rendered.
     */

    public String getTypeId() {
        return this.typeId;
    }

    /**
     * <p>
     * A value that indicates the type of recommendation. This value determines how the description is rendered.
     * </p>
     * 
     * @param typeId
     *        A value that indicates the type of recommendation. This value determines how the description is rendered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withTypeId(String typeId) {
        setTypeId(typeId);
        return this;
    }

    /**
     * <p>
     * The severity level of the recommendation. The severity level can help you decide the urgency with which to
     * address the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        The severity level of the recommendation. The severity level can help you decide the urgency with which to
     *        address the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>high</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>informational</code>
     *        </p>
     *        </li>
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity level of the recommendation. The severity level can help you decide the urgency with which to
     * address the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The severity level of the recommendation. The severity level can help you decide the urgency with which
     *         to address the recommendation.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>high</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>medium</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>low</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>informational</code>
     *         </p>
     *         </li>
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity level of the recommendation. The severity level can help you decide the urgency with which to
     * address the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        The severity level of the recommendation. The severity level can help you decide the urgency with which to
     *        address the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>high</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>informational</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RDS resource associated with the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The current status of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The recommendations which are ready for you to apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code> - The recommendations which are completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dismissed</code> - The recommendations that you dismissed.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the recommendation.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The recommendations which are ready for you to apply.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resolved</code> - The recommendations which are completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dismissed</code> - The recommendations that you dismissed.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The recommendations which are ready for you to apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code> - The recommendations which are completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dismissed</code> - The recommendations that you dismissed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     * </p>
     * 
     * @param createdTime
     *        The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     * </p>
     * 
     * @return The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     * </p>
     * 
     * @param createdTime
     *        The time when the recommendation was created. For example, <code>2023-09-28T01:13:53.931000+00:00</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time when the recommendation was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the recommendation was last updated.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the recommendation was last updated.
     * </p>
     * 
     * @return The time when the recommendation was last updated.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The time when the recommendation was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the recommendation was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * A short description of the issue identified for this recommendation. The description might contain markdown.
     * </p>
     * 
     * @param detection
     *        A short description of the issue identified for this recommendation. The description might contain
     *        markdown.
     */

    public void setDetection(String detection) {
        this.detection = detection;
    }

    /**
     * <p>
     * A short description of the issue identified for this recommendation. The description might contain markdown.
     * </p>
     * 
     * @return A short description of the issue identified for this recommendation. The description might contain
     *         markdown.
     */

    public String getDetection() {
        return this.detection;
    }

    /**
     * <p>
     * A short description of the issue identified for this recommendation. The description might contain markdown.
     * </p>
     * 
     * @param detection
     *        A short description of the issue identified for this recommendation. The description might contain
     *        markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withDetection(String detection) {
        setDetection(detection);
        return this;
    }

    /**
     * <p>
     * A short description of the recommendation to resolve an issue. The description might contain markdown.
     * </p>
     * 
     * @param recommendation
     *        A short description of the recommendation to resolve an issue. The description might contain markdown.
     */

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * A short description of the recommendation to resolve an issue. The description might contain markdown.
     * </p>
     * 
     * @return A short description of the recommendation to resolve an issue. The description might contain markdown.
     */

    public String getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * A short description of the recommendation to resolve an issue. The description might contain markdown.
     * </p>
     * 
     * @param recommendation
     *        A short description of the recommendation to resolve an issue. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withRecommendation(String recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * A detailed description of the recommendation. The description might contain markdown.
     * </p>
     * 
     * @param description
     *        A detailed description of the recommendation. The description might contain markdown.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A detailed description of the recommendation. The description might contain markdown.
     * </p>
     * 
     * @return A detailed description of the recommendation. The description might contain markdown.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A detailed description of the recommendation. The description might contain markdown.
     * </p>
     * 
     * @param description
     *        A detailed description of the recommendation. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The reason why this recommendation was created. The information might contain markdown.
     * </p>
     * 
     * @param reason
     *        The reason why this recommendation was created. The information might contain markdown.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why this recommendation was created. The information might contain markdown.
     * </p>
     * 
     * @return The reason why this recommendation was created. The information might contain markdown.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why this recommendation was created. The information might contain markdown.
     * </p>
     * 
     * @param reason
     *        The reason why this recommendation was created. The information might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A list of recommended actions.
     * </p>
     * 
     * @return A list of recommended actions.
     */

    public java.util.List<RecommendedAction> getRecommendedActions() {
        if (recommendedActions == null) {
            recommendedActions = new com.amazonaws.internal.SdkInternalList<RecommendedAction>();
        }
        return recommendedActions;
    }

    /**
     * <p>
     * A list of recommended actions.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions.
     */

    public void setRecommendedActions(java.util.Collection<RecommendedAction> recommendedActions) {
        if (recommendedActions == null) {
            this.recommendedActions = null;
            return;
        }

        this.recommendedActions = new com.amazonaws.internal.SdkInternalList<RecommendedAction>(recommendedActions);
    }

    /**
     * <p>
     * A list of recommended actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedActions(java.util.Collection)} or {@link #withRecommendedActions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withRecommendedActions(RecommendedAction... recommendedActions) {
        if (this.recommendedActions == null) {
            setRecommendedActions(new com.amazonaws.internal.SdkInternalList<RecommendedAction>(recommendedActions.length));
        }
        for (RecommendedAction ele : recommendedActions) {
            this.recommendedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommended actions.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withRecommendedActions(java.util.Collection<RecommendedAction> recommendedActions) {
        setRecommendedActions(recommendedActions);
        return this;
    }

    /**
     * <p>
     * The category of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>performance efficiency</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>security</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reliability</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cost optimization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>operational excellence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sustainability</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The category of the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>performance efficiency</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>security</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reliability</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cost optimization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>operational excellence</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sustainability</code>
     *        </p>
     *        </li>
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>performance efficiency</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>security</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reliability</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cost optimization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>operational excellence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sustainability</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The category of the recommendation.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>performance efficiency</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>security</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reliability</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cost optimization</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>operational excellence</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sustainability</code>
     *         </p>
     *         </li>
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the recommendation.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>performance efficiency</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>security</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reliability</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cost optimization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>operational excellence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sustainability</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The category of the recommendation.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>performance efficiency</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>security</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reliability</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cost optimization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>operational excellence</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sustainability</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service that generated the recommendations.
     * </p>
     * 
     * @param source
     *        The Amazon Web Services service that generated the recommendations.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon Web Services service that generated the recommendations.
     * </p>
     * 
     * @return The Amazon Web Services service that generated the recommendations.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon Web Services service that generated the recommendations.
     * </p>
     * 
     * @param source
     *        The Amazon Web Services service that generated the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A short description of the recommendation type. The description might contain markdown.
     * </p>
     * 
     * @param typeDetection
     *        A short description of the recommendation type. The description might contain markdown.
     */

    public void setTypeDetection(String typeDetection) {
        this.typeDetection = typeDetection;
    }

    /**
     * <p>
     * A short description of the recommendation type. The description might contain markdown.
     * </p>
     * 
     * @return A short description of the recommendation type. The description might contain markdown.
     */

    public String getTypeDetection() {
        return this.typeDetection;
    }

    /**
     * <p>
     * A short description of the recommendation type. The description might contain markdown.
     * </p>
     * 
     * @param typeDetection
     *        A short description of the recommendation type. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withTypeDetection(String typeDetection) {
        setTypeDetection(typeDetection);
        return this;
    }

    /**
     * <p>
     * A short description that summarizes the recommendation to fix all the issues of the recommendation type. The
     * description might contain markdown.
     * </p>
     * 
     * @param typeRecommendation
     *        A short description that summarizes the recommendation to fix all the issues of the recommendation type.
     *        The description might contain markdown.
     */

    public void setTypeRecommendation(String typeRecommendation) {
        this.typeRecommendation = typeRecommendation;
    }

    /**
     * <p>
     * A short description that summarizes the recommendation to fix all the issues of the recommendation type. The
     * description might contain markdown.
     * </p>
     * 
     * @return A short description that summarizes the recommendation to fix all the issues of the recommendation type.
     *         The description might contain markdown.
     */

    public String getTypeRecommendation() {
        return this.typeRecommendation;
    }

    /**
     * <p>
     * A short description that summarizes the recommendation to fix all the issues of the recommendation type. The
     * description might contain markdown.
     * </p>
     * 
     * @param typeRecommendation
     *        A short description that summarizes the recommendation to fix all the issues of the recommendation type.
     *        The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withTypeRecommendation(String typeRecommendation) {
        setTypeRecommendation(typeRecommendation);
        return this;
    }

    /**
     * <p>
     * A short description that explains the possible impact of an issue.
     * </p>
     * 
     * @param impact
     *        A short description that explains the possible impact of an issue.
     */

    public void setImpact(String impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * A short description that explains the possible impact of an issue.
     * </p>
     * 
     * @return A short description that explains the possible impact of an issue.
     */

    public String getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * A short description that explains the possible impact of an issue.
     * </p>
     * 
     * @param impact
     *        A short description that explains the possible impact of an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withImpact(String impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * Additional information about the recommendation. The information might contain markdown.
     * </p>
     * 
     * @param additionalInfo
     *        Additional information about the recommendation. The information might contain markdown.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional information about the recommendation. The information might contain markdown.
     * </p>
     * 
     * @return Additional information about the recommendation. The information might contain markdown.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Additional information about the recommendation. The information might contain markdown.
     * </p>
     * 
     * @param additionalInfo
     *        Additional information about the recommendation. The information might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * A link to documentation that provides additional information about the recommendation.
     * </p>
     * 
     * @return A link to documentation that provides additional information about the recommendation.
     */

    public java.util.List<DocLink> getLinks() {
        if (links == null) {
            links = new com.amazonaws.internal.SdkInternalList<DocLink>();
        }
        return links;
    }

    /**
     * <p>
     * A link to documentation that provides additional information about the recommendation.
     * </p>
     * 
     * @param links
     *        A link to documentation that provides additional information about the recommendation.
     */

    public void setLinks(java.util.Collection<DocLink> links) {
        if (links == null) {
            this.links = null;
            return;
        }

        this.links = new com.amazonaws.internal.SdkInternalList<DocLink>(links);
    }

    /**
     * <p>
     * A link to documentation that provides additional information about the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinks(java.util.Collection)} or {@link #withLinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param links
     *        A link to documentation that provides additional information about the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withLinks(DocLink... links) {
        if (this.links == null) {
            setLinks(new com.amazonaws.internal.SdkInternalList<DocLink>(links.length));
        }
        for (DocLink ele : links) {
            this.links.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A link to documentation that provides additional information about the recommendation.
     * </p>
     * 
     * @param links
     *        A link to documentation that provides additional information about the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withLinks(java.util.Collection<DocLink> links) {
        setLinks(links);
        return this;
    }

    /**
     * <p>
     * Details of the issue that caused the recommendation.
     * </p>
     * 
     * @param issueDetails
     *        Details of the issue that caused the recommendation.
     */

    public void setIssueDetails(IssueDetails issueDetails) {
        this.issueDetails = issueDetails;
    }

    /**
     * <p>
     * Details of the issue that caused the recommendation.
     * </p>
     * 
     * @return Details of the issue that caused the recommendation.
     */

    public IssueDetails getIssueDetails() {
        return this.issueDetails;
    }

    /**
     * <p>
     * Details of the issue that caused the recommendation.
     * </p>
     * 
     * @param issueDetails
     *        Details of the issue that caused the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBRecommendation withIssueDetails(IssueDetails issueDetails) {
        setIssueDetails(issueDetails);
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getTypeId() != null)
            sb.append("TypeId: ").append(getTypeId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getDetection() != null)
            sb.append("Detection: ").append(getDetection()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getRecommendedActions() != null)
            sb.append("RecommendedActions: ").append(getRecommendedActions()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTypeDetection() != null)
            sb.append("TypeDetection: ").append(getTypeDetection()).append(",");
        if (getTypeRecommendation() != null)
            sb.append("TypeRecommendation: ").append(getTypeRecommendation()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getLinks() != null)
            sb.append("Links: ").append(getLinks()).append(",");
        if (getIssueDetails() != null)
            sb.append("IssueDetails: ").append(getIssueDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBRecommendation == false)
            return false;
        DBRecommendation other = (DBRecommendation) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getTypeId() == null ^ this.getTypeId() == null)
            return false;
        if (other.getTypeId() != null && other.getTypeId().equals(this.getTypeId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getDetection() == null ^ this.getDetection() == null)
            return false;
        if (other.getDetection() != null && other.getDetection().equals(this.getDetection()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getRecommendedActions() == null ^ this.getRecommendedActions() == null)
            return false;
        if (other.getRecommendedActions() != null && other.getRecommendedActions().equals(this.getRecommendedActions()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTypeDetection() == null ^ this.getTypeDetection() == null)
            return false;
        if (other.getTypeDetection() != null && other.getTypeDetection().equals(this.getTypeDetection()) == false)
            return false;
        if (other.getTypeRecommendation() == null ^ this.getTypeRecommendation() == null)
            return false;
        if (other.getTypeRecommendation() != null && other.getTypeRecommendation().equals(this.getTypeRecommendation()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getLinks() == null ^ this.getLinks() == null)
            return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false)
            return false;
        if (other.getIssueDetails() == null ^ this.getIssueDetails() == null)
            return false;
        if (other.getIssueDetails() != null && other.getIssueDetails().equals(this.getIssueDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDetection() == null) ? 0 : getDetection().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRecommendedActions() == null) ? 0 : getRecommendedActions().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTypeDetection() == null) ? 0 : getTypeDetection().hashCode());
        hashCode = prime * hashCode + ((getTypeRecommendation() == null) ? 0 : getTypeRecommendation().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode());
        hashCode = prime * hashCode + ((getIssueDetails() == null) ? 0 : getIssueDetails().hashCode());
        return hashCode;
    }

    @Override
    public DBRecommendation clone() {
        try {
            return (DBRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
