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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a configuration recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ConfigRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application component name.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * The current compliance against the resiliency policy before applying the configuration change.
     * </p>
     */
    private java.util.Map<String, DisruptionCompliance> compliance;
    /**
     * <p>
     * The cost for the application.
     * </p>
     */
    private Cost cost;
    /**
     * <p>
     * The optional description for an app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The architecture type.
     * </p>
     */
    private String haArchitecture;
    /**
     * <p>
     * The name of the recommendation configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of optimization.
     * </p>
     */
    private String optimizationType;
    /**
     * <p>
     * The expected compliance against the resiliency policy after applying the configuration change.
     * </p>
     */
    private java.util.Map<String, RecommendationDisruptionCompliance> recommendationCompliance;
    /**
     * <p>
     * The reference identifier for the recommendation configuration.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * List of the suggested configuration changes.
     * </p>
     */
    private java.util.List<String> suggestedChanges;

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @param appComponentName
     *        The application component name.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @return The application component name.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @param appComponentName
     *        The application component name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * The current compliance against the resiliency policy before applying the configuration change.
     * </p>
     * 
     * @return The current compliance against the resiliency policy before applying the configuration change.
     */

    public java.util.Map<String, DisruptionCompliance> getCompliance() {
        return compliance;
    }

    /**
     * <p>
     * The current compliance against the resiliency policy before applying the configuration change.
     * </p>
     * 
     * @param compliance
     *        The current compliance against the resiliency policy before applying the configuration change.
     */

    public void setCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * The current compliance against the resiliency policy before applying the configuration change.
     * </p>
     * 
     * @param compliance
     *        The current compliance against the resiliency policy before applying the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        setCompliance(compliance);
        return this;
    }

    /**
     * Add a single Compliance entry
     *
     * @see ConfigRecommendation#withCompliance
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation addComplianceEntry(String key, DisruptionCompliance value) {
        if (null == this.compliance) {
            this.compliance = new java.util.HashMap<String, DisruptionCompliance>();
        }
        if (this.compliance.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.compliance.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Compliance.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation clearComplianceEntries() {
        this.compliance = null;
        return this;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     */

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @return The cost for the application.
     */

    public Cost getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withCost(Cost cost) {
        setCost(cost);
        return this;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @return The optional description for an app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param haArchitecture
     *        The architecture type.
     * @see HaArchitecture
     */

    public void setHaArchitecture(String haArchitecture) {
        this.haArchitecture = haArchitecture;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @return The architecture type.
     * @see HaArchitecture
     */

    public String getHaArchitecture() {
        return this.haArchitecture;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param haArchitecture
     *        The architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HaArchitecture
     */

    public ConfigRecommendation withHaArchitecture(String haArchitecture) {
        setHaArchitecture(haArchitecture);
        return this;
    }

    /**
     * <p>
     * The architecture type.
     * </p>
     * 
     * @param haArchitecture
     *        The architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HaArchitecture
     */

    public ConfigRecommendation withHaArchitecture(HaArchitecture haArchitecture) {
        this.haArchitecture = haArchitecture.toString();
        return this;
    }

    /**
     * <p>
     * The name of the recommendation configuration.
     * </p>
     * 
     * @param name
     *        The name of the recommendation configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recommendation configuration.
     * </p>
     * 
     * @return The name of the recommendation configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recommendation configuration.
     * </p>
     * 
     * @param name
     *        The name of the recommendation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of optimization.
     * </p>
     * 
     * @param optimizationType
     *        The type of optimization.
     * @see ConfigRecommendationOptimizationType
     */

    public void setOptimizationType(String optimizationType) {
        this.optimizationType = optimizationType;
    }

    /**
     * <p>
     * The type of optimization.
     * </p>
     * 
     * @return The type of optimization.
     * @see ConfigRecommendationOptimizationType
     */

    public String getOptimizationType() {
        return this.optimizationType;
    }

    /**
     * <p>
     * The type of optimization.
     * </p>
     * 
     * @param optimizationType
     *        The type of optimization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigRecommendationOptimizationType
     */

    public ConfigRecommendation withOptimizationType(String optimizationType) {
        setOptimizationType(optimizationType);
        return this;
    }

    /**
     * <p>
     * The type of optimization.
     * </p>
     * 
     * @param optimizationType
     *        The type of optimization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigRecommendationOptimizationType
     */

    public ConfigRecommendation withOptimizationType(ConfigRecommendationOptimizationType optimizationType) {
        this.optimizationType = optimizationType.toString();
        return this;
    }

    /**
     * <p>
     * The expected compliance against the resiliency policy after applying the configuration change.
     * </p>
     * 
     * @return The expected compliance against the resiliency policy after applying the configuration change.
     */

    public java.util.Map<String, RecommendationDisruptionCompliance> getRecommendationCompliance() {
        return recommendationCompliance;
    }

    /**
     * <p>
     * The expected compliance against the resiliency policy after applying the configuration change.
     * </p>
     * 
     * @param recommendationCompliance
     *        The expected compliance against the resiliency policy after applying the configuration change.
     */

    public void setRecommendationCompliance(java.util.Map<String, RecommendationDisruptionCompliance> recommendationCompliance) {
        this.recommendationCompliance = recommendationCompliance;
    }

    /**
     * <p>
     * The expected compliance against the resiliency policy after applying the configuration change.
     * </p>
     * 
     * @param recommendationCompliance
     *        The expected compliance against the resiliency policy after applying the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withRecommendationCompliance(java.util.Map<String, RecommendationDisruptionCompliance> recommendationCompliance) {
        setRecommendationCompliance(recommendationCompliance);
        return this;
    }

    /**
     * Add a single RecommendationCompliance entry
     *
     * @see ConfigRecommendation#withRecommendationCompliance
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation addRecommendationComplianceEntry(String key, RecommendationDisruptionCompliance value) {
        if (null == this.recommendationCompliance) {
            this.recommendationCompliance = new java.util.HashMap<String, RecommendationDisruptionCompliance>();
        }
        if (this.recommendationCompliance.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.recommendationCompliance.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RecommendationCompliance.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation clearRecommendationComplianceEntries() {
        this.recommendationCompliance = null;
        return this;
    }

    /**
     * <p>
     * The reference identifier for the recommendation configuration.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the recommendation configuration.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference identifier for the recommendation configuration.
     * </p>
     * 
     * @return The reference identifier for the recommendation configuration.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference identifier for the recommendation configuration.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the recommendation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * List of the suggested configuration changes.
     * </p>
     * 
     * @return List of the suggested configuration changes.
     */

    public java.util.List<String> getSuggestedChanges() {
        return suggestedChanges;
    }

    /**
     * <p>
     * List of the suggested configuration changes.
     * </p>
     * 
     * @param suggestedChanges
     *        List of the suggested configuration changes.
     */

    public void setSuggestedChanges(java.util.Collection<String> suggestedChanges) {
        if (suggestedChanges == null) {
            this.suggestedChanges = null;
            return;
        }

        this.suggestedChanges = new java.util.ArrayList<String>(suggestedChanges);
    }

    /**
     * <p>
     * List of the suggested configuration changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestedChanges(java.util.Collection)} or {@link #withSuggestedChanges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param suggestedChanges
     *        List of the suggested configuration changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withSuggestedChanges(String... suggestedChanges) {
        if (this.suggestedChanges == null) {
            setSuggestedChanges(new java.util.ArrayList<String>(suggestedChanges.length));
        }
        for (String ele : suggestedChanges) {
            this.suggestedChanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the suggested configuration changes.
     * </p>
     * 
     * @param suggestedChanges
     *        List of the suggested configuration changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRecommendation withSuggestedChanges(java.util.Collection<String> suggestedChanges) {
        setSuggestedChanges(suggestedChanges);
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
        if (getAppComponentName() != null)
            sb.append("AppComponentName: ").append(getAppComponentName()).append(",");
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHaArchitecture() != null)
            sb.append("HaArchitecture: ").append(getHaArchitecture()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOptimizationType() != null)
            sb.append("OptimizationType: ").append(getOptimizationType()).append(",");
        if (getRecommendationCompliance() != null)
            sb.append("RecommendationCompliance: ").append(getRecommendationCompliance()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getSuggestedChanges() != null)
            sb.append("SuggestedChanges: ").append(getSuggestedChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigRecommendation == false)
            return false;
        ConfigRecommendation other = (ConfigRecommendation) obj;
        if (other.getAppComponentName() == null ^ this.getAppComponentName() == null)
            return false;
        if (other.getAppComponentName() != null && other.getAppComponentName().equals(this.getAppComponentName()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHaArchitecture() == null ^ this.getHaArchitecture() == null)
            return false;
        if (other.getHaArchitecture() != null && other.getHaArchitecture().equals(this.getHaArchitecture()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOptimizationType() == null ^ this.getOptimizationType() == null)
            return false;
        if (other.getOptimizationType() != null && other.getOptimizationType().equals(this.getOptimizationType()) == false)
            return false;
        if (other.getRecommendationCompliance() == null ^ this.getRecommendationCompliance() == null)
            return false;
        if (other.getRecommendationCompliance() != null && other.getRecommendationCompliance().equals(this.getRecommendationCompliance()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getSuggestedChanges() == null ^ this.getSuggestedChanges() == null)
            return false;
        if (other.getSuggestedChanges() != null && other.getSuggestedChanges().equals(this.getSuggestedChanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppComponentName() == null) ? 0 : getAppComponentName().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHaArchitecture() == null) ? 0 : getHaArchitecture().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOptimizationType() == null) ? 0 : getOptimizationType().hashCode());
        hashCode = prime * hashCode + ((getRecommendationCompliance() == null) ? 0 : getRecommendationCompliance().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getSuggestedChanges() == null) ? 0 : getSuggestedChanges().hashCode());
        return hashCode;
    }

    @Override
    public ConfigRecommendation clone() {
        try {
            return (ConfigRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ConfigRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
