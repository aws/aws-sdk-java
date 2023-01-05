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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFeatureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
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
     * An optional description of the feature.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specify users that should always be served a specific variation of a feature. Each user is specified by a
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
     * The name for the new feature.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name or ARN of the project that is to contain the new feature.
     * </p>
     */
    private String project;
    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the feature.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     */
    private java.util.List<VariationConfig> variations;

    /**
     * <p>
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
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
     *        The name of the variation to use as the default variation. The default variation is served to users who
     *        are not allocated to any ongoing launches or experiments of this feature.</p>
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
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
     * </p>
     * <p>
     * This variation must also be listed in the <code>variations</code> structure.
     * </p>
     * <p>
     * If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code> structure is
     * used as the default variation.
     * </p>
     * 
     * @return The name of the variation to use as the default variation. The default variation is served to users who
     *         are not allocated to any ongoing launches or experiments of this feature.</p>
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
     * The name of the variation to use as the default variation. The default variation is served to users who are not
     * allocated to any ongoing launches or experiments of this feature.
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
     *        The name of the variation to use as the default variation. The default variation is served to users who
     *        are not allocated to any ongoing launches or experiments of this feature.</p>
     *        <p>
     *        This variation must also be listed in the <code>variations</code> structure.
     *        </p>
     *        <p>
     *        If you omit <code>defaultVariation</code>, the first variation listed in the <code>variations</code>
     *        structure is used as the default variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest withDefaultVariation(String defaultVariation) {
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

    public CreateFeatureRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specify users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @return Specify users that should always be served a specific variation of a feature. Each user is specified by a
     *         key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *         identifier. For the value, specify the name of the variation that they are to be served.
     */

    public java.util.Map<String, String> getEntityOverrides() {
        return entityOverrides;
    }

    /**
     * <p>
     * Specify users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @param entityOverrides
     *        Specify users that should always be served a specific variation of a feature. Each user is specified by a
     *        key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *        identifier. For the value, specify the name of the variation that they are to be served.
     */

    public void setEntityOverrides(java.util.Map<String, String> entityOverrides) {
        this.entityOverrides = entityOverrides;
    }

    /**
     * <p>
     * Specify users that should always be served a specific variation of a feature. Each user is specified by a
     * key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier.
     * For the value, specify the name of the variation that they are to be served.
     * </p>
     * 
     * @param entityOverrides
     *        Specify users that should always be served a specific variation of a feature. Each user is specified by a
     *        key-value pair . For each key, specify a user by entering their user ID, account ID, or some other
     *        identifier. For the value, specify the name of the variation that they are to be served.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest withEntityOverrides(java.util.Map<String, String> entityOverrides) {
        setEntityOverrides(entityOverrides);
        return this;
    }

    /**
     * Add a single EntityOverrides entry
     *
     * @see CreateFeatureRequest#withEntityOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest addEntityOverridesEntry(String key, String value) {
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

    public CreateFeatureRequest clearEntityOverridesEntries() {
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

    public CreateFeatureRequest withEvaluationStrategy(String evaluationStrategy) {
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

    public CreateFeatureRequest withEvaluationStrategy(FeatureEvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The name for the new feature.
     * </p>
     * 
     * @param name
     *        The name for the new feature.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new feature.
     * </p>
     * 
     * @return The name for the new feature.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new feature.
     * </p>
     * 
     * @param name
     *        The name for the new feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that is to contain the new feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that is to contain the new feature.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that is to contain the new feature.
     * </p>
     * 
     * @return The name or ARN of the project that is to contain the new feature.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that is to contain the new feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that is to contain the new feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the feature.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return Assigns one or more tags (key-value pairs) to the feature.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *         characters.
     *         </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the feature.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the feature.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the feature.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the feature.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     *        <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFeatureRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureRequest addTagsEntry(String key, String value) {
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

    public CreateFeatureRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration of the feature's different variations.
     * </p>
     * 
     * @return An array of structures that contain the configuration of the feature's different variations.
     */

    public java.util.List<VariationConfig> getVariations() {
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

    public void setVariations(java.util.Collection<VariationConfig> variations) {
        if (variations == null) {
            this.variations = null;
            return;
        }

        this.variations = new java.util.ArrayList<VariationConfig>(variations);
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

    public CreateFeatureRequest withVariations(VariationConfig... variations) {
        if (this.variations == null) {
            setVariations(new java.util.ArrayList<VariationConfig>(variations.length));
        }
        for (VariationConfig ele : variations) {
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

    public CreateFeatureRequest withVariations(java.util.Collection<VariationConfig> variations) {
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
        if (getDefaultVariation() != null)
            sb.append("DefaultVariation: ").append(getDefaultVariation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEntityOverrides() != null)
            sb.append("EntityOverrides: ").append(getEntityOverrides()).append(",");
        if (getEvaluationStrategy() != null)
            sb.append("EvaluationStrategy: ").append(getEvaluationStrategy()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateFeatureRequest == false)
            return false;
        CreateFeatureRequest other = (CreateFeatureRequest) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getDefaultVariation() == null) ? 0 : getDefaultVariation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntityOverrides() == null) ? 0 : getEntityOverrides().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStrategy() == null) ? 0 : getEvaluationStrategy().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVariations() == null) ? 0 : getVariations().hashCode());
        return hashCode;
    }

    @Override
    public CreateFeatureRequest clone() {
        return (CreateFeatureRequest) super.clone();
    }

}
