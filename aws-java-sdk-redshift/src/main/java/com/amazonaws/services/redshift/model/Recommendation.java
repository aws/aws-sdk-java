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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An Amazon Redshift Advisor recommended action on the Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the Advisor recommendation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifier of the cluster for which the recommendation is returned.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The date and time (UTC) that the recommendation was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The type of Advisor recommendation.
     * </p>
     */
    private String recommendationType;
    /**
     * <p>
     * The title of the recommendation.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the recommendation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The description of what was observed about your cluster.
     * </p>
     */
    private String observation;
    /**
     * <p>
     * The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * </p>
     */
    private String impactRanking;
    /**
     * <p>
     * The description of the recommendation.
     * </p>
     */
    private String recommendationText;
    /**
     * <p>
     * List of Amazon Redshift recommended actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecommendedAction> recommendedActions;
    /**
     * <p>
     * List of helpful links for more information about the Advisor recommendation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReferenceLink> referenceLinks;

    /**
     * <p>
     * A unique identifier of the Advisor recommendation.
     * </p>
     * 
     * @param id
     *        A unique identifier of the Advisor recommendation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier of the Advisor recommendation.
     * </p>
     * 
     * @return A unique identifier of the Advisor recommendation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier of the Advisor recommendation.
     * </p>
     * 
     * @param id
     *        A unique identifier of the Advisor recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which the recommendation is returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which the recommendation is returned.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which the recommendation is returned.
     * </p>
     * 
     * @return The unique identifier of the cluster for which the recommendation is returned.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which the recommendation is returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which the recommendation is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     * </p>
     * 
     * @return The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Redshift cluster namespace ARN for which the recommendations is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The date and time (UTC) that the recommendation was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time (UTC) that the recommendation was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time (UTC) that the recommendation was created.
     * </p>
     * 
     * @return The date and time (UTC) that the recommendation was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time (UTC) that the recommendation was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time (UTC) that the recommendation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The type of Advisor recommendation.
     * </p>
     * 
     * @param recommendationType
     *        The type of Advisor recommendation.
     */

    public void setRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    /**
     * <p>
     * The type of Advisor recommendation.
     * </p>
     * 
     * @return The type of Advisor recommendation.
     */

    public String getRecommendationType() {
        return this.recommendationType;
    }

    /**
     * <p>
     * The type of Advisor recommendation.
     * </p>
     * 
     * @param recommendationType
     *        The type of Advisor recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationType(String recommendationType) {
        setRecommendationType(recommendationType);
        return this;
    }

    /**
     * <p>
     * The title of the recommendation.
     * </p>
     * 
     * @param title
     *        The title of the recommendation.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the recommendation.
     * </p>
     * 
     * @return The title of the recommendation.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the recommendation.
     * </p>
     * 
     * @param title
     *        The title of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param description
     *        The description of the recommendation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @return The description of the recommendation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param description
     *        The description of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The description of what was observed about your cluster.
     * </p>
     * 
     * @param observation
     *        The description of what was observed about your cluster.
     */

    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * <p>
     * The description of what was observed about your cluster.
     * </p>
     * 
     * @return The description of what was observed about your cluster.
     */

    public String getObservation() {
        return this.observation;
    }

    /**
     * <p>
     * The description of what was observed about your cluster.
     * </p>
     * 
     * @param observation
     *        The description of what was observed about your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withObservation(String observation) {
        setObservation(observation);
        return this;
    }

    /**
     * <p>
     * The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * </p>
     * 
     * @param impactRanking
     *        The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * @see ImpactRankingType
     */

    public void setImpactRanking(String impactRanking) {
        this.impactRanking = impactRanking;
    }

    /**
     * <p>
     * The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * </p>
     * 
     * @return The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * @see ImpactRankingType
     */

    public String getImpactRanking() {
        return this.impactRanking;
    }

    /**
     * <p>
     * The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * </p>
     * 
     * @param impactRanking
     *        The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpactRankingType
     */

    public Recommendation withImpactRanking(String impactRanking) {
        setImpactRanking(impactRanking);
        return this;
    }

    /**
     * <p>
     * The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * </p>
     * 
     * @param impactRanking
     *        The scale of the impact that the Advisor recommendation has to the performance and cost of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpactRankingType
     */

    public Recommendation withImpactRanking(ImpactRankingType impactRanking) {
        this.impactRanking = impactRanking.toString();
        return this;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param recommendationText
     *        The description of the recommendation.
     */

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @return The description of the recommendation.
     */

    public String getRecommendationText() {
        return this.recommendationText;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param recommendationText
     *        The description of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationText(String recommendationText) {
        setRecommendationText(recommendationText);
        return this;
    }

    /**
     * <p>
     * List of Amazon Redshift recommended actions.
     * </p>
     * 
     * @return List of Amazon Redshift recommended actions.
     */

    public java.util.List<RecommendedAction> getRecommendedActions() {
        if (recommendedActions == null) {
            recommendedActions = new com.amazonaws.internal.SdkInternalList<RecommendedAction>();
        }
        return recommendedActions;
    }

    /**
     * <p>
     * List of Amazon Redshift recommended actions.
     * </p>
     * 
     * @param recommendedActions
     *        List of Amazon Redshift recommended actions.
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
     * List of Amazon Redshift recommended actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedActions(java.util.Collection)} or {@link #withRecommendedActions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendedActions
     *        List of Amazon Redshift recommended actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendedActions(RecommendedAction... recommendedActions) {
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
     * List of Amazon Redshift recommended actions.
     * </p>
     * 
     * @param recommendedActions
     *        List of Amazon Redshift recommended actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendedActions(java.util.Collection<RecommendedAction> recommendedActions) {
        setRecommendedActions(recommendedActions);
        return this;
    }

    /**
     * <p>
     * List of helpful links for more information about the Advisor recommendation.
     * </p>
     * 
     * @return List of helpful links for more information about the Advisor recommendation.
     */

    public java.util.List<ReferenceLink> getReferenceLinks() {
        if (referenceLinks == null) {
            referenceLinks = new com.amazonaws.internal.SdkInternalList<ReferenceLink>();
        }
        return referenceLinks;
    }

    /**
     * <p>
     * List of helpful links for more information about the Advisor recommendation.
     * </p>
     * 
     * @param referenceLinks
     *        List of helpful links for more information about the Advisor recommendation.
     */

    public void setReferenceLinks(java.util.Collection<ReferenceLink> referenceLinks) {
        if (referenceLinks == null) {
            this.referenceLinks = null;
            return;
        }

        this.referenceLinks = new com.amazonaws.internal.SdkInternalList<ReferenceLink>(referenceLinks);
    }

    /**
     * <p>
     * List of helpful links for more information about the Advisor recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceLinks(java.util.Collection)} or {@link #withReferenceLinks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceLinks
     *        List of helpful links for more information about the Advisor recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withReferenceLinks(ReferenceLink... referenceLinks) {
        if (this.referenceLinks == null) {
            setReferenceLinks(new com.amazonaws.internal.SdkInternalList<ReferenceLink>(referenceLinks.length));
        }
        for (ReferenceLink ele : referenceLinks) {
            this.referenceLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of helpful links for more information about the Advisor recommendation.
     * </p>
     * 
     * @param referenceLinks
     *        List of helpful links for more information about the Advisor recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withReferenceLinks(java.util.Collection<ReferenceLink> referenceLinks) {
        setReferenceLinks(referenceLinks);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getRecommendationType() != null)
            sb.append("RecommendationType: ").append(getRecommendationType()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getObservation() != null)
            sb.append("Observation: ").append(getObservation()).append(",");
        if (getImpactRanking() != null)
            sb.append("ImpactRanking: ").append(getImpactRanking()).append(",");
        if (getRecommendationText() != null)
            sb.append("RecommendationText: ").append(getRecommendationText()).append(",");
        if (getRecommendedActions() != null)
            sb.append("RecommendedActions: ").append(getRecommendedActions()).append(",");
        if (getReferenceLinks() != null)
            sb.append("ReferenceLinks: ").append(getReferenceLinks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getRecommendationType() == null ^ this.getRecommendationType() == null)
            return false;
        if (other.getRecommendationType() != null && other.getRecommendationType().equals(this.getRecommendationType()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getObservation() == null ^ this.getObservation() == null)
            return false;
        if (other.getObservation() != null && other.getObservation().equals(this.getObservation()) == false)
            return false;
        if (other.getImpactRanking() == null ^ this.getImpactRanking() == null)
            return false;
        if (other.getImpactRanking() != null && other.getImpactRanking().equals(this.getImpactRanking()) == false)
            return false;
        if (other.getRecommendationText() == null ^ this.getRecommendationText() == null)
            return false;
        if (other.getRecommendationText() != null && other.getRecommendationText().equals(this.getRecommendationText()) == false)
            return false;
        if (other.getRecommendedActions() == null ^ this.getRecommendedActions() == null)
            return false;
        if (other.getRecommendedActions() != null && other.getRecommendedActions().equals(this.getRecommendedActions()) == false)
            return false;
        if (other.getReferenceLinks() == null ^ this.getReferenceLinks() == null)
            return false;
        if (other.getReferenceLinks() != null && other.getReferenceLinks().equals(this.getReferenceLinks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getRecommendationType() == null) ? 0 : getRecommendationType().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getObservation() == null) ? 0 : getObservation().hashCode());
        hashCode = prime * hashCode + ((getImpactRanking() == null) ? 0 : getImpactRanking().hashCode());
        hashCode = prime * hashCode + ((getRecommendationText() == null) ? 0 : getRecommendationText().hashCode());
        hashCode = prime * hashCode + ((getRecommendedActions() == null) ? 0 : getRecommendedActions().hashCode());
        hashCode = prime * hashCode + ((getReferenceLinks() == null) ? 0 : getReferenceLinks().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
