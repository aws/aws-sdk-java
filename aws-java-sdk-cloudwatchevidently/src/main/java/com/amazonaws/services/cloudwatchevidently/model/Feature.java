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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about one Evidently feature in your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Feature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Feature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the feature.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the feature is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The name of the variation that is used as the default variation. The default variation is served to users who are
     * not allocated to any ongoing launches or experiments of this feature.
     * </p>
     * <p>
     * This variation must also be listed in the <code>variations</code> structure.
     * </p>
     * <p>
     * If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code> structure is
     * used as the default variation.
     * </p>
     */
    private String defaultVariation;
    /**
     * <p>
     * The description of the feature.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A set of key-value pairs that specify users who should always be served a specific variation of a feature. Each
     * key specifies a user using their user ID, account ID, or some other identifier. The value specifies the name of
     * the variation that the user is to be served.
     * </p>
     * <p>
     * For the override to be successful, the value of the key must match the <code>entityId</code> used in the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation.
     * </p>
     */
    private java.util.Map<String, String> entityOverrides;
    /**
     * <p>
     * An array of structures that define the evaluation rules for the feature.
     * </p>
     */
    private java.util.List<EvaluationRule> evaluationRules;
    /**
     * <p>
     * If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or experiments
     * is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being served to all users.
     * </p>
     */
    private String evaluationStrategy;
    /**
     * <p>
     * The date and time that the feature was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the feature.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name or ARN of the project that contains the feature.
     * </p>
     */
    private String project;
    /**
     * <p>
     * The current state of the feature.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of tag keys and values associated with this feature.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Defines the type of value used to define the different feature variations. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     * >Variation types</a>
     * </p>
     */
    private String valueType;
    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     */
    private java.util.List<Variation> variations;

    /**
     * <p>
     * The ARN of the feature.
     * </p>
     * 
     * @param arn
     *        The ARN of the feature.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the feature.
     * </p>
     * 
     * @return The ARN of the feature.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the feature.
     * </p>
     * 
     * @param arn
     *        The ARN of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the feature is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the feature is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the feature is created.
     * </p>
     * 
     * @return The date and time that the feature is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the feature is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the feature is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The name of the variation that is used as the default variation. The default variation is served to users who are
     * not allocated to any ongoing launches or experiments of this feature.
     * </p>
     * <p>
     * This variation must also be listed in the <code>variations</code> structure.
     * </p>
     * <p>
     * If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code> structure is
     * used as the default variation.
     * </p>
     * 
     * @param defaultVariation
     *        The name of the variation that is used as the default variation. The default variation is served to users
     *        who are not allocated to any ongoing launches or experiments of this feature.</p>
     *        <p>
     *        This variation must also be listed in the <code>variations</code> structure.
     *        </p>
     *        <p>
     *        If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code>
     *        structure is used as the default variation.
     */

    public void setDefaultVariation(String defaultVariation) {
        this.defaultVariation = defaultVariation;
    }

    /**
     * <p>
     * The name of the variation that is used as the default variation. The default variation is served to users who are
     * not allocated to any ongoing launches or experiments of this feature.
     * </p>
     * <p>
     * This variation must also be listed in the <code>variations</code> structure.
     * </p>
     * <p>
     * If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code> structure is
     * used as the default variation.
     * </p>
     * 
     * @return The name of the variation that is used as the default variation. The default variation is served to users
     *         who are not allocated to any ongoing launches or experiments of this feature.</p>
     *         <p>
     *         This variation must also be listed in the <code>variations</code> structure.
     *         </p>
     *         <p>
     *         If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code>
     *         structure is used as the default variation.
     */

    public String getDefaultVariation() {
        return this.defaultVariation;
    }

    /**
     * <p>
     * The name of the variation that is used as the default variation. The default variation is served to users who are
     * not allocated to any ongoing launches or experiments of this feature.
     * </p>
     * <p>
     * This variation must also be listed in the <code>variations</code> structure.
     * </p>
     * <p>
     * If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code> structure is
     * used as the default variation.
     * </p>
     * 
     * @param defaultVariation
     *        The name of the variation that is used as the default variation. The default variation is served to users
     *        who are not allocated to any ongoing launches or experiments of this feature.</p>
     *        <p>
     *        This variation must also be listed in the <code>variations</code> structure.
     *        </p>
     *        <p>
     *        If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code>
     *        structure is used as the default variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withDefaultVariation(String defaultVariation) {
        setDefaultVariation(defaultVariation);
        return this;
    }

    /**
     * <p>
     * The description of the feature.
     * </p>
     * 
     * @param description
     *        The description of the feature.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the feature.
     * </p>
     * 
     * @return The description of the feature.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the feature.
     * </p>
     * 
     * @param description
     *        The description of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs that specify users who should always be served a specific variation of a feature. Each
     * key specifies a user using their user ID, account ID, or some other identifier. The value specifies the name of
     * the variation that the user is to be served.
     * </p>
     * <p>
     * For the override to be successful, the value of the key must match the <code>entityId</code> used in the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation.
     * </p>
     * 
     * @return A set of key-value pairs that specify users who should always be served a specific variation of a
     *         feature. Each key specifies a user using their user ID, account ID, or some other identifier. The value
     *         specifies the name of the variation that the user is to be served.</p>
     *         <p>
     *         For the override to be successful, the value of the key must match the <code>entityId</code> used in the
     *         <a href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html">
     *         EvaluateFeature</a> operation.
     */

    public java.util.Map<String, String> getEntityOverrides() {
        return entityOverrides;
    }

    /**
     * <p>
     * A set of key-value pairs that specify users who should always be served a specific variation of a feature. Each
     * key specifies a user using their user ID, account ID, or some other identifier. The value specifies the name of
     * the variation that the user is to be served.
     * </p>
     * <p>
     * For the override to be successful, the value of the key must match the <code>entityId</code> used in the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation.
     * </p>
     * 
     * @param entityOverrides
     *        A set of key-value pairs that specify users who should always be served a specific variation of a feature.
     *        Each key specifies a user using their user ID, account ID, or some other identifier. The value specifies
     *        the name of the variation that the user is to be served.</p>
     *        <p>
     *        For the override to be successful, the value of the key must match the <code>entityId</code> used in the
     *        <a href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html">
     *        EvaluateFeature</a> operation.
     */

    public void setEntityOverrides(java.util.Map<String, String> entityOverrides) {
        this.entityOverrides = entityOverrides;
    }

    /**
     * <p>
     * A set of key-value pairs that specify users who should always be served a specific variation of a feature. Each
     * key specifies a user using their user ID, account ID, or some other identifier. The value specifies the name of
     * the variation that the user is to be served.
     * </p>
     * <p>
     * For the override to be successful, the value of the key must match the <code>entityId</code> used in the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation.
     * </p>
     * 
     * @param entityOverrides
     *        A set of key-value pairs that specify users who should always be served a specific variation of a feature.
     *        Each key specifies a user using their user ID, account ID, or some other identifier. The value specifies
     *        the name of the variation that the user is to be served.</p>
     *        <p>
     *        For the override to be successful, the value of the key must match the <code>entityId</code> used in the
     *        <a href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html">
     *        EvaluateFeature</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withEntityOverrides(java.util.Map<String, String> entityOverrides) {
        setEntityOverrides(entityOverrides);
        return this;
    }

    /**
     * Add a single EntityOverrides entry
     *
     * @see Feature#withEntityOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Feature addEntityOverridesEntry(String key, String value) {
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

    public Feature clearEntityOverridesEntries() {
        this.entityOverrides = null;
        return this;
    }

    /**
     * <p>
     * An array of structures that define the evaluation rules for the feature.
     * </p>
     * 
     * @return An array of structures that define the evaluation rules for the feature.
     */

    public java.util.List<EvaluationRule> getEvaluationRules() {
        return evaluationRules;
    }

    /**
     * <p>
     * An array of structures that define the evaluation rules for the feature.
     * </p>
     * 
     * @param evaluationRules
     *        An array of structures that define the evaluation rules for the feature.
     */

    public void setEvaluationRules(java.util.Collection<EvaluationRule> evaluationRules) {
        if (evaluationRules == null) {
            this.evaluationRules = null;
            return;
        }

        this.evaluationRules = new java.util.ArrayList<EvaluationRule>(evaluationRules);
    }

    /**
     * <p>
     * An array of structures that define the evaluation rules for the feature.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationRules(java.util.Collection)} or {@link #withEvaluationRules(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param evaluationRules
     *        An array of structures that define the evaluation rules for the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withEvaluationRules(EvaluationRule... evaluationRules) {
        if (this.evaluationRules == null) {
            setEvaluationRules(new java.util.ArrayList<EvaluationRule>(evaluationRules.length));
        }
        for (EvaluationRule ele : evaluationRules) {
            this.evaluationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the evaluation rules for the feature.
     * </p>
     * 
     * @param evaluationRules
     *        An array of structures that define the evaluation rules for the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withEvaluationRules(java.util.Collection<EvaluationRule> evaluationRules) {
        setEvaluationRules(evaluationRules);
        return this;
    }

    /**
     * <p>
     * If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or experiments
     * is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being served to all users.
     * </p>
     * 
     * @param evaluationStrategy
     *        If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or
     *        experiments is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being
     *        served to all users.
     * @see FeatureEvaluationStrategy
     */

    public void setEvaluationStrategy(String evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy;
    }

    /**
     * <p>
     * If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or experiments
     * is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being served to all users.
     * </p>
     * 
     * @return If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or
     *         experiments is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being
     *         served to all users.
     * @see FeatureEvaluationStrategy
     */

    public String getEvaluationStrategy() {
        return this.evaluationStrategy;
    }

    /**
     * <p>
     * If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or experiments
     * is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being served to all users.
     * </p>
     * 
     * @param evaluationStrategy
     *        If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or
     *        experiments is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being
     *        served to all users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureEvaluationStrategy
     */

    public Feature withEvaluationStrategy(String evaluationStrategy) {
        setEvaluationStrategy(evaluationStrategy);
        return this;
    }

    /**
     * <p>
     * If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or experiments
     * is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being served to all users.
     * </p>
     * 
     * @param evaluationStrategy
     *        If this value is <code>ALL_RULES</code>, the traffic allocation specified by any ongoing launches or
     *        experiments is being used. If this is <code>DEFAULT_VARIATION</code>, the default variation is being
     *        served to all users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureEvaluationStrategy
     */

    public Feature withEvaluationStrategy(FeatureEvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the feature was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the feature was most recently updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the feature was most recently updated.
     * </p>
     * 
     * @return The date and time that the feature was most recently updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the feature was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the feature was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @param name
     *        The name of the feature.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @return The name of the feature.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @param name
     *        The name of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature.
     * </p>
     * 
     * @return The name or ARN of the project that contains the feature.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * The current state of the feature.
     * </p>
     * 
     * @param status
     *        The current state of the feature.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the feature.
     * </p>
     * 
     * @return The current state of the feature.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the feature.
     * </p>
     * 
     * @param status
     *        The current state of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public Feature withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the feature.
     * </p>
     * 
     * @param status
     *        The current state of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public Feature withStatus(FeatureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this feature.
     * </p>
     * 
     * @return The list of tag keys and values associated with this feature.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this feature.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this feature.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this feature.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Feature#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Feature addTagsEntry(String key, String value) {
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

    public Feature clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Defines the type of value used to define the different feature variations. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     * >Variation types</a>
     * </p>
     * 
     * @param valueType
     *        Defines the type of value used to define the different feature variations. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     *        >Variation types</a>
     * @see VariationValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * Defines the type of value used to define the different feature variations. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     * >Variation types</a>
     * </p>
     * 
     * @return Defines the type of value used to define the different feature variations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     *         >Variation types</a>
     * @see VariationValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * Defines the type of value used to define the different feature variations. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     * >Variation types</a>
     * </p>
     * 
     * @param valueType
     *        Defines the type of value used to define the different feature variations. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     *        >Variation types</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariationValueType
     */

    public Feature withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * Defines the type of value used to define the different feature variations. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     * >Variation types</a>
     * </p>
     * 
     * @param valueType
     *        Defines the type of value used to define the different feature variations. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-variationtypes.html"
     *        >Variation types</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariationValueType
     */

    public Feature withValueType(VariationValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     * 
     * @return An array of structures that contain the configuration of the feature's different variations.
     */

    public java.util.List<Variation> getVariations() {
        return variations;
    }

    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     * 
     * @param variations
     *        An array of structures that contain the configuration of the feature's different variations.
     */

    public void setVariations(java.util.Collection<Variation> variations) {
        if (variations == null) {
            this.variations = null;
            return;
        }

        this.variations = new java.util.ArrayList<Variation>(variations);
    }

    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariations(java.util.Collection)} or {@link #withVariations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variations
     *        An array of structures that contain the configuration of the feature's different variations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withVariations(Variation... variations) {
        if (this.variations == null) {
            setVariations(new java.util.ArrayList<Variation>(variations.length));
        }
        for (Variation ele : variations) {
            this.variations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     * 
     * @param variations
     *        An array of structures that contain the configuration of the feature's different variations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Feature withVariations(java.util.Collection<Variation> variations) {
        setVariations(variations);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDefaultVariation() != null)
            sb.append("DefaultVariation: ").append(getDefaultVariation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEntityOverrides() != null)
            sb.append("EntityOverrides: ").append(getEntityOverrides()).append(",");
        if (getEvaluationRules() != null)
            sb.append("EvaluationRules: ").append(getEvaluationRules()).append(",");
        if (getEvaluationStrategy() != null)
            sb.append("EvaluationStrategy: ").append(getEvaluationStrategy()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
        if (getVariations() != null)
            sb.append("Variations: ").append(getVariations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Feature == false)
            return false;
        Feature other = (Feature) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
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
        if (other.getEvaluationRules() == null ^ this.getEvaluationRules() == null)
            return false;
        if (other.getEvaluationRules() != null && other.getEvaluationRules().equals(this.getEvaluationRules()) == false)
            return false;
        if (other.getEvaluationStrategy() == null ^ this.getEvaluationStrategy() == null)
            return false;
        if (other.getEvaluationStrategy() != null && other.getEvaluationStrategy().equals(this.getEvaluationStrategy()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getVariations() == null ^ this.getVariations() == null)
            return false;
        if (other.getVariations() != null && other.getVariations().equals(this.getVariations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDefaultVariation() == null) ? 0 : getDefaultVariation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntityOverrides() == null) ? 0 : getEntityOverrides().hashCode());
        hashCode = prime * hashCode + ((getEvaluationRules() == null) ? 0 : getEvaluationRules().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStrategy() == null) ? 0 : getEvaluationStrategy().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getVariations() == null) ? 0 : getVariations().hashCode());
        return hashCode;
    }

    @Override
    public Feature clone() {
        try {
            return (Feature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.FeatureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
