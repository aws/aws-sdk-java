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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A check that provides recommendations to remedy potential upgrade-impacting issues.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Insight" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Insight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the insight.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the insight.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The category of the insight.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The Kubernetes minor version associated with an insight if applicable.
     * </p>
     */
    private String kubernetesVersion;
    /**
     * <p>
     * The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     * </p>
     */
    private java.util.Date lastRefreshTime;
    /**
     * <p>
     * The time the status of the insight last changed.
     * </p>
     */
    private java.util.Date lastTransitionTime;
    /**
     * <p>
     * The description of the insight which includes alert criteria, remediation recommendation, and additional
     * resources (contains Markdown).
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     */
    private InsightStatus insightStatus;
    /**
     * <p>
     * A summary of how to remediate the finding of this insight if applicable.
     * </p>
     */
    private String recommendation;
    /**
     * <p>
     * Links to sources that provide additional context on the insight.
     * </p>
     */
    private java.util.Map<String, String> additionalInfo;
    /**
     * <p>
     * The details about each resource listed in the insight check result.
     * </p>
     */
    private java.util.List<InsightResourceDetail> resources;
    /**
     * <p>
     * Summary information that relates to the category of the insight. Currently only returned with certain insights
     * having category <code>UPGRADE_READINESS</code>.
     * </p>
     */
    private InsightCategorySpecificSummary categorySpecificSummary;

    /**
     * <p>
     * The ID of the insight.
     * </p>
     * 
     * @param id
     *        The ID of the insight.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the insight.
     * </p>
     * 
     * @return The ID of the insight.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the insight.
     * </p>
     * 
     * @param id
     *        The ID of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the insight.
     * </p>
     * 
     * @param name
     *        The name of the insight.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the insight.
     * </p>
     * 
     * @return The name of the insight.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the insight.
     * </p>
     * 
     * @param name
     *        The name of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The category of the insight.
     * </p>
     * 
     * @param category
     *        The category of the insight.
     * @see Category
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the insight.
     * </p>
     * 
     * @return The category of the insight.
     * @see Category
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the insight.
     * </p>
     * 
     * @param category
     *        The category of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public Insight withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the insight.
     * </p>
     * 
     * @param category
     *        The category of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public Insight withCategory(Category category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The Kubernetes minor version associated with an insight if applicable.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes minor version associated with an insight if applicable.
     */

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes minor version associated with an insight if applicable.
     * </p>
     * 
     * @return The Kubernetes minor version associated with an insight if applicable.
     */

    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes minor version associated with an insight if applicable.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes minor version associated with an insight if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withKubernetesVersion(String kubernetesVersion) {
        setKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * <p>
     * The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     * </p>
     * 
     * @param lastRefreshTime
     *        The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     */

    public void setLastRefreshTime(java.util.Date lastRefreshTime) {
        this.lastRefreshTime = lastRefreshTime;
    }

    /**
     * <p>
     * The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     * </p>
     * 
     * @return The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     */

    public java.util.Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    /**
     * <p>
     * The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     * </p>
     * 
     * @param lastRefreshTime
     *        The time Amazon EKS last successfully completed a refresh of this insight check on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withLastRefreshTime(java.util.Date lastRefreshTime) {
        setLastRefreshTime(lastRefreshTime);
        return this;
    }

    /**
     * <p>
     * The time the status of the insight last changed.
     * </p>
     * 
     * @param lastTransitionTime
     *        The time the status of the insight last changed.
     */

    public void setLastTransitionTime(java.util.Date lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    /**
     * <p>
     * The time the status of the insight last changed.
     * </p>
     * 
     * @return The time the status of the insight last changed.
     */

    public java.util.Date getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * <p>
     * The time the status of the insight last changed.
     * </p>
     * 
     * @param lastTransitionTime
     *        The time the status of the insight last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withLastTransitionTime(java.util.Date lastTransitionTime) {
        setLastTransitionTime(lastTransitionTime);
        return this;
    }

    /**
     * <p>
     * The description of the insight which includes alert criteria, remediation recommendation, and additional
     * resources (contains Markdown).
     * </p>
     * 
     * @param description
     *        The description of the insight which includes alert criteria, remediation recommendation, and additional
     *        resources (contains Markdown).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the insight which includes alert criteria, remediation recommendation, and additional
     * resources (contains Markdown).
     * </p>
     * 
     * @return The description of the insight which includes alert criteria, remediation recommendation, and additional
     *         resources (contains Markdown).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the insight which includes alert criteria, remediation recommendation, and additional
     * resources (contains Markdown).
     * </p>
     * 
     * @param description
     *        The description of the insight which includes alert criteria, remediation recommendation, and additional
     *        resources (contains Markdown).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @param insightStatus
     *        An object containing more detail on the status of the insight resource.
     */

    public void setInsightStatus(InsightStatus insightStatus) {
        this.insightStatus = insightStatus;
    }

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @return An object containing more detail on the status of the insight resource.
     */

    public InsightStatus getInsightStatus() {
        return this.insightStatus;
    }

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @param insightStatus
     *        An object containing more detail on the status of the insight resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightStatus(InsightStatus insightStatus) {
        setInsightStatus(insightStatus);
        return this;
    }

    /**
     * <p>
     * A summary of how to remediate the finding of this insight if applicable.
     * </p>
     * 
     * @param recommendation
     *        A summary of how to remediate the finding of this insight if applicable.
     */

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * A summary of how to remediate the finding of this insight if applicable.
     * </p>
     * 
     * @return A summary of how to remediate the finding of this insight if applicable.
     */

    public String getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * A summary of how to remediate the finding of this insight if applicable.
     * </p>
     * 
     * @param recommendation
     *        A summary of how to remediate the finding of this insight if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withRecommendation(String recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * Links to sources that provide additional context on the insight.
     * </p>
     * 
     * @return Links to sources that provide additional context on the insight.
     */

    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Links to sources that provide additional context on the insight.
     * </p>
     * 
     * @param additionalInfo
     *        Links to sources that provide additional context on the insight.
     */

    public void setAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Links to sources that provide additional context on the insight.
     * </p>
     * 
     * @param additionalInfo
     *        Links to sources that provide additional context on the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * Add a single AdditionalInfo entry
     *
     * @see Insight#withAdditionalInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Insight addAdditionalInfoEntry(String key, String value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, String>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight clearAdditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    /**
     * <p>
     * The details about each resource listed in the insight check result.
     * </p>
     * 
     * @return The details about each resource listed in the insight check result.
     */

    public java.util.List<InsightResourceDetail> getResources() {
        return resources;
    }

    /**
     * <p>
     * The details about each resource listed in the insight check result.
     * </p>
     * 
     * @param resources
     *        The details about each resource listed in the insight check result.
     */

    public void setResources(java.util.Collection<InsightResourceDetail> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<InsightResourceDetail>(resources);
    }

    /**
     * <p>
     * The details about each resource listed in the insight check result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The details about each resource listed in the insight check result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withResources(InsightResourceDetail... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<InsightResourceDetail>(resources.length));
        }
        for (InsightResourceDetail ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about each resource listed in the insight check result.
     * </p>
     * 
     * @param resources
     *        The details about each resource listed in the insight check result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withResources(java.util.Collection<InsightResourceDetail> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * Summary information that relates to the category of the insight. Currently only returned with certain insights
     * having category <code>UPGRADE_READINESS</code>.
     * </p>
     * 
     * @param categorySpecificSummary
     *        Summary information that relates to the category of the insight. Currently only returned with certain
     *        insights having category <code>UPGRADE_READINESS</code>.
     */

    public void setCategorySpecificSummary(InsightCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the insight. Currently only returned with certain insights
     * having category <code>UPGRADE_READINESS</code>.
     * </p>
     * 
     * @return Summary information that relates to the category of the insight. Currently only returned with certain
     *         insights having category <code>UPGRADE_READINESS</code>.
     */

    public InsightCategorySpecificSummary getCategorySpecificSummary() {
        return this.categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the insight. Currently only returned with certain insights
     * having category <code>UPGRADE_READINESS</code>.
     * </p>
     * 
     * @param categorySpecificSummary
     *        Summary information that relates to the category of the insight. Currently only returned with certain
     *        insights having category <code>UPGRADE_READINESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withCategorySpecificSummary(InsightCategorySpecificSummary categorySpecificSummary) {
        setCategorySpecificSummary(categorySpecificSummary);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getKubernetesVersion() != null)
            sb.append("KubernetesVersion: ").append(getKubernetesVersion()).append(",");
        if (getLastRefreshTime() != null)
            sb.append("LastRefreshTime: ").append(getLastRefreshTime()).append(",");
        if (getLastTransitionTime() != null)
            sb.append("LastTransitionTime: ").append(getLastTransitionTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInsightStatus() != null)
            sb.append("InsightStatus: ").append(getInsightStatus()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getCategorySpecificSummary() != null)
            sb.append("CategorySpecificSummary: ").append(getCategorySpecificSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Insight == false)
            return false;
        Insight other = (Insight) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getKubernetesVersion() == null ^ this.getKubernetesVersion() == null)
            return false;
        if (other.getKubernetesVersion() != null && other.getKubernetesVersion().equals(this.getKubernetesVersion()) == false)
            return false;
        if (other.getLastRefreshTime() == null ^ this.getLastRefreshTime() == null)
            return false;
        if (other.getLastRefreshTime() != null && other.getLastRefreshTime().equals(this.getLastRefreshTime()) == false)
            return false;
        if (other.getLastTransitionTime() == null ^ this.getLastTransitionTime() == null)
            return false;
        if (other.getLastTransitionTime() != null && other.getLastTransitionTime().equals(this.getLastTransitionTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInsightStatus() == null ^ this.getInsightStatus() == null)
            return false;
        if (other.getInsightStatus() != null && other.getInsightStatus().equals(this.getInsightStatus()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getCategorySpecificSummary() == null ^ this.getCategorySpecificSummary() == null)
            return false;
        if (other.getCategorySpecificSummary() != null && other.getCategorySpecificSummary().equals(this.getCategorySpecificSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getKubernetesVersion() == null) ? 0 : getKubernetesVersion().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTime() == null) ? 0 : getLastRefreshTime().hashCode());
        hashCode = prime * hashCode + ((getLastTransitionTime() == null) ? 0 : getLastTransitionTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInsightStatus() == null) ? 0 : getInsightStatus().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getCategorySpecificSummary() == null) ? 0 : getCategorySpecificSummary().hashCode());
        return hashCode;
    }

    @Override
    public Insight clone() {
        try {
            return (Insight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.InsightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
