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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFeatureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To update variation configurations for this feature, or add new ones, specify this structure. In this array,
     * include any variations that you want to add or update. If the array includes a variation name that already exists
     * for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
     * </p>
     */
    private java.util.List<VariationConfig> addOrUpdateVariations;
    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
     * </p>
     */
    private String defaultVariation;
    /**
     * <p>
     * An optional description of the feature.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specified users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     */
    private java.util.Map<String, String> entityOverrides;
    /**
     * <p>
     * Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     * experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * </p>
     */
    private String evaluationStrategy;
    /**
     * <p>
     * The name of the feature to be updated.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * The name or ARN of the project that contains the feature to be updated.
     * </p>
     */
    private String project;
    /**
     * <p>
     * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and
     * does not report an error.
     * </p>
     * <p>
     * This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * </p>
     */
    private java.util.List<String> removeVariations;

    /**
     * <p>
     * To update variation configurations for this feature, or add new ones, specify this structure. In this array,
     * include any variations that you want to add or update. If the array includes a variation name that already exists
     * for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
     * </p>
     * 
     * @return To update variation configurations for this feature, or add new ones, specify this structure. In this
     *         array, include any variations that you want to add or update. If the array includes a variation name that
     *         already exists for this feature, it is updated. If it includes a new variation name, it is added as a new
     *         variation.
     */

    public java.util.List<VariationConfig> getAddOrUpdateVariations() {
        return addOrUpdateVariations;
    }

    /**
     * <p>
     * To update variation configurations for this feature, or add new ones, specify this structure. In this array,
     * include any variations that you want to add or update. If the array includes a variation name that already exists
     * for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
     * </p>
     * 
     * @param addOrUpdateVariations
     *        To update variation configurations for this feature, or add new ones, specify this structure. In this
     *        array, include any variations that you want to add or update. If the array includes a variation name that
     *        already exists for this feature, it is updated. If it includes a new variation name, it is added as a new
     *        variation.
     */

    public void setAddOrUpdateVariations(java.util.Collection<VariationConfig> addOrUpdateVariations) {
        if (addOrUpdateVariations == null) {
            this.addOrUpdateVariations = null;
            return;
        }

        this.addOrUpdateVariations = new java.util.ArrayList<VariationConfig>(addOrUpdateVariations);
    }

    /**
     * <p>
     * To update variation configurations for this feature, or add new ones, specify this structure. In this array,
     * include any variations that you want to add or update. If the array includes a variation name that already exists
     * for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOrUpdateVariations(java.util.Collection)} or
     * {@link #withAddOrUpdateVariations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addOrUpdateVariations
     *        To update variation configurations for this feature, or add new ones, specify this structure. In this
     *        array, include any variations that you want to add or update. If the array includes a variation name that
     *        already exists for this feature, it is updated. If it includes a new variation name, it is added as a new
     *        variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withAddOrUpdateVariations(VariationConfig... addOrUpdateVariations) {
        if (this.addOrUpdateVariations == null) {
            setAddOrUpdateVariations(new java.util.ArrayList<VariationConfig>(addOrUpdateVariations.length));
        }
        for (VariationConfig ele : addOrUpdateVariations) {
            this.addOrUpdateVariations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * To update variation configurations for this feature, or add new ones, specify this structure. In this array,
     * include any variations that you want to add or update. If the array includes a variation name that already exists
     * for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
     * </p>
     * 
     * @param addOrUpdateVariations
     *        To update variation configurations for this feature, or add new ones, specify this structure. In this
     *        array, include any variations that you want to add or update. If the array includes a variation name that
     *        already exists for this feature, it is updated. If it includes a new variation name, it is added as a new
     *        variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withAddOrUpdateVariations(java.util.Collection<VariationConfig> addOrUpdateVariations) {
        setAddOrUpdateVariations(addOrUpdateVariations);
        return this;
    }

    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
     * </p>
     * 
     * @param defaultVariation
     *        The name of the variation to use as the default variation. The default variation is served to users who
     *        are not allocated to any ongoing launches or experiments of this feature.
     */

    public void setDefaultVariation(String defaultVariation) {
        this.defaultVariation = defaultVariation;
    }

    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
     * </p>
     * 
     * @return The name of the variation to use as the default variation. The default variation is served to users who
     *         are not allocated to any ongoing launches or experiments of this feature.
     */

    public String getDefaultVariation() {
        return this.defaultVariation;
    }

    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
     * </p>
     * 
     * @param defaultVariation
     *        The name of the variation to use as the default variation. The default variation is served to users who
     *        are not allocated to any ongoing launches or experiments of this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withDefaultVariation(String defaultVariation) {
        setDefaultVariation(defaultVariation);
        return this;
    }

    /**
     * <p>
     * An optional description of the feature.
     * </p>
     * 
     * @param description
     *        An optional description of the feature.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the feature.
     * </p>
     * 
     * @return An optional description of the feature.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the feature.
     * </p>
     * 
     * @param description
     *        An optional description of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specified users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @return Specified users that should always be served a specific variation of a feature. Each user is specified by
     *         a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *         identifier. For the value, specify the name of the variation that they are to be served.
     */

    public java.util.Map<String, String> getEntityOverrides() {
        return entityOverrides;
    }

    /**
     * <p>
     * Specified users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @param entityOverrides
     *        Specified users that should always be served a specific variation of a feature. Each user is specified by
     *        a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *        identifier. For the value, specify the name of the variation that they are to be served.
     */

    public void setEntityOverrides(java.util.Map<String, String> entityOverrides) {
        this.entityOverrides = entityOverrides;
    }

    /**
     * <p>
     * Specified users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @param entityOverrides
     *        Specified users that should always be served a specific variation of a feature. Each user is specified by
     *        a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *        identifier. For the value, specify the name of the variation that they are to be served.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withEntityOverrides(java.util.Map<String, String> entityOverrides) {
        setEntityOverrides(entityOverrides);
        return this;
    }

    /**
     * Add a single EntityOverrides entry
     *
     * @see UpdateFeatureRequest#withEntityOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest addEntityOverridesEntry(String key, String value) {
        if (null == this.entityOverrides) {
            this.entityOverrides = new java.util.HashMap<String, String>();
        }
        if (this.entityOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.entityOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EntityOverrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest clearEntityOverridesEntries() {
        this.entityOverrides = null;
        return this;
    }

    /**
     * <p>
     * Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     * experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * </p>
     * 
     * @param evaluationStrategy
     *        Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     *        experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * @see FeatureEvaluationStrategy
     */

    public void setEvaluationStrategy(String evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy;
    }

    /**
     * <p>
     * Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     * experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * </p>
     * 
     * @return Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     *         experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * @see FeatureEvaluationStrategy
     */

    public String getEvaluationStrategy() {
        return this.evaluationStrategy;
    }

    /**
     * <p>
     * Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     * experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * </p>
     * 
     * @param evaluationStrategy
     *        Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     *        experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureEvaluationStrategy
     */

    public UpdateFeatureRequest withEvaluationStrategy(String evaluationStrategy) {
        setEvaluationStrategy(evaluationStrategy);
        return this;
    }

    /**
     * <p>
     * Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     * experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * </p>
     * 
     * @param evaluationStrategy
     *        Specify <code>ALL_RULES</code> to activate the traffic allocation specified by any ongoing launches or
     *        experiments. Specify <code>DEFAULT_VARIATION</code> to serve the default variation to all users instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureEvaluationStrategy
     */

    public UpdateFeatureRequest withEvaluationStrategy(FeatureEvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the feature to be updated.
     * </p>
     * 
     * @param feature
     *        The name of the feature to be updated.
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The name of the feature to be updated.
     * </p>
     * 
     * @return The name of the feature to be updated.
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The name of the feature to be updated.
     * </p>
     * 
     * @param feature
     *        The name of the feature to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature to be updated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature to be updated.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature to be updated.
     * </p>
     * 
     * @return The name or ARN of the project that contains the feature to be updated.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature to be updated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and
     * does not report an error.
     * </p>
     * <p>
     * This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * </p>
     * 
     * @return Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no
     *         change and does not report an error.</p>
     *         <p>
     *         This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     */

    public java.util.List<String> getRemoveVariations() {
        return removeVariations;
    }

    /**
     * <p>
     * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and
     * does not report an error.
     * </p>
     * <p>
     * This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * </p>
     * 
     * @param removeVariations
     *        Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no
     *        change and does not report an error.</p>
     *        <p>
     *        This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     */

    public void setRemoveVariations(java.util.Collection<String> removeVariations) {
        if (removeVariations == null) {
            this.removeVariations = null;
            return;
        }

        this.removeVariations = new java.util.ArrayList<String>(removeVariations);
    }

    /**
     * <p>
     * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and
     * does not report an error.
     * </p>
     * <p>
     * This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveVariations(java.util.Collection)} or {@link #withRemoveVariations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeVariations
     *        Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no
     *        change and does not report an error.</p>
     *        <p>
     *        This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withRemoveVariations(String... removeVariations) {
        if (this.removeVariations == null) {
            setRemoveVariations(new java.util.ArrayList<String>(removeVariations.length));
        }
        for (String ele : removeVariations) {
            this.removeVariations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and
     * does not report an error.
     * </p>
     * <p>
     * This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * </p>
     * 
     * @param removeVariations
     *        Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no
     *        change and does not report an error.</p>
     *        <p>
     *        This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureRequest withRemoveVariations(java.util.Collection<String> removeVariations) {
        setRemoveVariations(removeVariations);
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
        if (getAddOrUpdateVariations() != null)
            sb.append("AddOrUpdateVariations: ").append(getAddOrUpdateVariations()).append(",");
        if (getDefaultVariation() != null)
            sb.append("DefaultVariation: ").append(getDefaultVariation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEntityOverrides() != null)
            sb.append("EntityOverrides: ").append(getEntityOverrides()).append(",");
        if (getEvaluationStrategy() != null)
            sb.append("EvaluationStrategy: ").append(getEvaluationStrategy()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRemoveVariations() != null)
            sb.append("RemoveVariations: ").append(getRemoveVariations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFeatureRequest == false)
            return false;
        UpdateFeatureRequest other = (UpdateFeatureRequest) obj;
        if (other.getAddOrUpdateVariations() == null ^ this.getAddOrUpdateVariations() == null)
            return false;
        if (other.getAddOrUpdateVariations() != null && other.getAddOrUpdateVariations().equals(this.getAddOrUpdateVariations()) == false)
            return false;
        if (other.getDefaultVariation() == null ^ this.getDefaultVariation() == null)
            return false;
        if (other.getDefaultVariation() != null && other.getDefaultVariation().equals(this.getDefaultVariation()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEntityOverrides() == null ^ this.getEntityOverrides() == null)
            return false;
        if (other.getEntityOverrides() != null && other.getEntityOverrides().equals(this.getEntityOverrides()) == false)
            return false;
        if (other.getEvaluationStrategy() == null ^ this.getEvaluationStrategy() == null)
            return false;
        if (other.getEvaluationStrategy() != null && other.getEvaluationStrategy().equals(this.getEvaluationStrategy()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getRemoveVariations() == null ^ this.getRemoveVariations() == null)
            return false;
        if (other.getRemoveVariations() != null && other.getRemoveVariations().equals(this.getRemoveVariations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOrUpdateVariations() == null) ? 0 : getAddOrUpdateVariations().hashCode());
        hashCode = prime * hashCode + ((getDefaultVariation() == null) ? 0 : getDefaultVariation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntityOverrides() == null) ? 0 : getEntityOverrides().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStrategy() == null) ? 0 : getEvaluationStrategy().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRemoveVariations() == null) ? 0 : getRemoveVariations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFeatureRequest clone() {
        return (UpdateFeatureRequest) super.clone();
    }

}
