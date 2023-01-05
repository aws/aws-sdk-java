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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description of the experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     */
    private java.util.List<MetricGoalConfig> metricGoals;
    /**
     * <p>
     * A name for the new experiment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. tThe "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     */
    private OnlineAbConfig onlineAbConfig;
    /**
     * <p>
     * The name or ARN of the project that you want to create the new experiment in.
     * </p>
     */
    private String project;
    /**
     * <p>
     * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine
     * which variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the experiment name as
     * the <code>randomizationSalt</code>.
     * </p>
     */
    private String randomizationSalt;
    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the available
     * audience.
     * </p>
     */
    private Long samplingRate;
    /**
     * <p>
     * Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment, only user
     * sessions that match the segment pattern are used in the experiment.
     * </p>
     */
    private String segment;
    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the experiment.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     */
    private java.util.List<TreatmentConfig> treatments;

    /**
     * <p>
     * An optional description of the experiment.
     * </p>
     * 
     * @param description
     *        An optional description of the experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the experiment.
     * </p>
     * 
     * @return An optional description of the experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the experiment.
     * </p>
     * 
     * @param description
     *        An optional description of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     * 
     * @return An array of structures that defines the metrics used for the experiment, and whether a higher or lower
     *         value for each metric is the goal.
     */

    public java.util.List<MetricGoalConfig> getMetricGoals() {
        return metricGoals;
    }

    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     * 
     * @param metricGoals
     *        An array of structures that defines the metrics used for the experiment, and whether a higher or lower
     *        value for each metric is the goal.
     */

    public void setMetricGoals(java.util.Collection<MetricGoalConfig> metricGoals) {
        if (metricGoals == null) {
            this.metricGoals = null;
            return;
        }

        this.metricGoals = new java.util.ArrayList<MetricGoalConfig>(metricGoals);
    }

    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGoals(java.util.Collection)} or {@link #withMetricGoals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGoals
     *        An array of structures that defines the metrics used for the experiment, and whether a higher or lower
     *        value for each metric is the goal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withMetricGoals(MetricGoalConfig... metricGoals) {
        if (this.metricGoals == null) {
            setMetricGoals(new java.util.ArrayList<MetricGoalConfig>(metricGoals.length));
        }
        for (MetricGoalConfig ele : metricGoals) {
            this.metricGoals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     * 
     * @param metricGoals
     *        An array of structures that defines the metrics used for the experiment, and whether a higher or lower
     *        value for each metric is the goal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withMetricGoals(java.util.Collection<MetricGoalConfig> metricGoals) {
        setMetricGoals(metricGoals);
        return this;
    }

    /**
     * <p>
     * A name for the new experiment.
     * </p>
     * 
     * @param name
     *        A name for the new experiment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the new experiment.
     * </p>
     * 
     * @return A name for the new experiment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the new experiment.
     * </p>
     * 
     * @param name
     *        A name for the new experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. tThe "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbConfig
     *        A structure that contains the configuration of which variation to use as the "control" version. tThe
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     */

    public void setOnlineAbConfig(OnlineAbConfig onlineAbConfig) {
        this.onlineAbConfig = onlineAbConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. tThe "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @return A structure that contains the configuration of which variation to use as the "control" version. tThe
     *         "control" version is used for comparison with other variations. This structure also specifies how much
     *         experiment traffic is allocated to each variation.
     */

    public OnlineAbConfig getOnlineAbConfig() {
        return this.onlineAbConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. tThe "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbConfig
     *        A structure that contains the configuration of which variation to use as the "control" version. tThe
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withOnlineAbConfig(OnlineAbConfig onlineAbConfig) {
        setOnlineAbConfig(onlineAbConfig);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the new experiment in.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to create the new experiment in.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the new experiment in.
     * </p>
     * 
     * @return The name or ARN of the project that you want to create the new experiment in.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the new experiment in.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to create the new experiment in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine
     * which variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the experiment name as
     * the <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        When Evidently assigns a particular user session to an experiment, it must use a randomization ID to
     *        determine which variation the user session is served. This randomization ID is a combination of the entity
     *        ID and <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the
     *        experiment name as the <code>randomizationSalt</code>.
     */

    public void setRandomizationSalt(String randomizationSalt) {
        this.randomizationSalt = randomizationSalt;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine
     * which variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the experiment name as
     * the <code>randomizationSalt</code>.
     * </p>
     * 
     * @return When Evidently assigns a particular user session to an experiment, it must use a randomization ID to
     *         determine which variation the user session is served. This randomization ID is a combination of the
     *         entity ID and <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses
     *         the experiment name as the <code>randomizationSalt</code>.
     */

    public String getRandomizationSalt() {
        return this.randomizationSalt;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine
     * which variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the experiment name as
     * the <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        When Evidently assigns a particular user session to an experiment, it must use a randomization ID to
     *        determine which variation the user session is served. This randomization ID is a combination of the entity
     *        ID and <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the
     *        experiment name as the <code>randomizationSalt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withRandomizationSalt(String randomizationSalt) {
        setRandomizationSalt(randomizationSalt);
        return this;
    }

    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the available
     * audience.
     * </p>
     * 
     * @param samplingRate
     *        The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *        percent. The available audience is the total audience minus the audience that you have allocated to
     *        overrides or current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the
     *        available audience.
     */

    public void setSamplingRate(Long samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the available
     * audience.
     * </p>
     * 
     * @return The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *         percent. The available audience is the total audience minus the audience that you have allocated to
     *         overrides or current launches of this feature.</p>
     *         <p>
     *         This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the
     *         available audience.
     */

    public Long getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the available
     * audience.
     * </p>
     * 
     * @param samplingRate
     *        The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *        percent. The available audience is the total audience minus the audience that you have allocated to
     *        overrides or current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the
     *        available audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withSamplingRate(Long samplingRate) {
        setSamplingRate(samplingRate);
        return this;
    }

    /**
     * <p>
     * Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment, only user
     * sessions that match the segment pattern are used in the experiment.
     * </p>
     * 
     * @param segment
     *        Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment,
     *        only user sessions that match the segment pattern are used in the experiment.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment, only user
     * sessions that match the segment pattern are used in the experiment.
     * </p>
     * 
     * @return Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment,
     *         only user sessions that match the segment pattern are used in the experiment.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment, only user
     * sessions that match the segment pattern are used in the experiment.
     * </p>
     * 
     * @param segment
     *        Specifies an audience <i>segment</i> to use in the experiment. When a segment is used in an experiment,
     *        only user sessions that match the segment pattern are used in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withSegment(String segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the experiment.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return Assigns one or more tags (key-value pairs) to the experiment.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *         characters.
     *         </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the experiment.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the experiment.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the experiment.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the experiment.</p>
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateExperimentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest addTagsEntry(String key, String value) {
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

    public CreateExperimentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     * 
     * @return An array of structures that describe the configuration of each feature variation used in the experiment.
     */

    public java.util.List<TreatmentConfig> getTreatments() {
        return treatments;
    }

    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     * 
     * @param treatments
     *        An array of structures that describe the configuration of each feature variation used in the experiment.
     */

    public void setTreatments(java.util.Collection<TreatmentConfig> treatments) {
        if (treatments == null) {
            this.treatments = null;
            return;
        }

        this.treatments = new java.util.ArrayList<TreatmentConfig>(treatments);
    }

    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTreatments(java.util.Collection)} or {@link #withTreatments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param treatments
     *        An array of structures that describe the configuration of each feature variation used in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withTreatments(TreatmentConfig... treatments) {
        if (this.treatments == null) {
            setTreatments(new java.util.ArrayList<TreatmentConfig>(treatments.length));
        }
        for (TreatmentConfig ele : treatments) {
            this.treatments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     * 
     * @param treatments
     *        An array of structures that describe the configuration of each feature variation used in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withTreatments(java.util.Collection<TreatmentConfig> treatments) {
        setTreatments(treatments);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMetricGoals() != null)
            sb.append("MetricGoals: ").append(getMetricGoals()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOnlineAbConfig() != null)
            sb.append("OnlineAbConfig: ").append(getOnlineAbConfig()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getSamplingRate() != null)
            sb.append("SamplingRate: ").append(getSamplingRate()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTreatments() != null)
            sb.append("Treatments: ").append(getTreatments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentRequest == false)
            return false;
        CreateExperimentRequest other = (CreateExperimentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMetricGoals() == null ^ this.getMetricGoals() == null)
            return false;
        if (other.getMetricGoals() != null && other.getMetricGoals().equals(this.getMetricGoals()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOnlineAbConfig() == null ^ this.getOnlineAbConfig() == null)
            return false;
        if (other.getOnlineAbConfig() != null && other.getOnlineAbConfig().equals(this.getOnlineAbConfig()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getRandomizationSalt() == null ^ this.getRandomizationSalt() == null)
            return false;
        if (other.getRandomizationSalt() != null && other.getRandomizationSalt().equals(this.getRandomizationSalt()) == false)
            return false;
        if (other.getSamplingRate() == null ^ this.getSamplingRate() == null)
            return false;
        if (other.getSamplingRate() != null && other.getSamplingRate().equals(this.getSamplingRate()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTreatments() == null ^ this.getTreatments() == null)
            return false;
        if (other.getTreatments() != null && other.getTreatments().equals(this.getTreatments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMetricGoals() == null) ? 0 : getMetricGoals().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOnlineAbConfig() == null) ? 0 : getOnlineAbConfig().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getSamplingRate() == null) ? 0 : getSamplingRate().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTreatments() == null) ? 0 : getTreatments().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentRequest clone() {
        return (CreateExperimentRequest) super.clone();
    }

}
