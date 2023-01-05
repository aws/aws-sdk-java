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
 * A structure containing the configuration details of an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Experiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Experiment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the experiment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the experiment is first created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A description of the experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A structure that contains the date and time that the experiment started and ended.
     * </p>
     */
    private ExperimentExecution execution;
    /**
     * <p>
     * The date and time that the experiment was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     */
    private java.util.List<MetricGoal> metricGoals;
    /**
     * <p>
     * The name of the experiment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     */
    private OnlineAbDefinition onlineAbDefinition;
    /**
     * <p>
     * The name or ARN of the project that contains this experiment.
     * </p>
     */
    private String project;
    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     * randomization ID to determine which variation the user session is served. This randomization ID is a combination
     * of the entity ID and <code>randomizationSalt</code>.
     * </p>
     */
    private String randomizationSalt;
    /**
     * <p>
     * In thousandths of a percent, the amount of the available audience that is allocated to this experiment. The
     * available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     * </p>
     */
    private Long samplingRate;
    /**
     * <p>
     * A structure that contains the time and date that Evidently completed the analysis of the experiment.
     * </p>
     */
    private ExperimentSchedule schedule;
    /**
     * <p>
     * The audience segment being used for the experiment, if a segment is being used.
     * </p>
     */
    private String segment;
    /**
     * <p>
     * The current state of the experiment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the experiment was stopped, this is the string that was entered by the person who stopped the experiment, to
     * explain why it was stopped.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The list of tag keys and values associated with this experiment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * An array of structures that describe the configuration of each feature variation used in the experiment.
     * </p>
     */
    private java.util.List<Treatment> treatments;
    /**
     * <p>
     * The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of the experiment.
     * </p>
     * 
     * @param arn
     *        The ARN of the experiment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the experiment.
     * </p>
     * 
     * @return The ARN of the experiment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the experiment.
     * </p>
     * 
     * @param arn
     *        The ARN of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the experiment is first created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the experiment is first created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the experiment is first created.
     * </p>
     * 
     * @return The date and time that the experiment is first created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the experiment is first created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the experiment is first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A description of the experiment.
     * </p>
     * 
     * @param description
     *        A description of the experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the experiment.
     * </p>
     * 
     * @return A description of the experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the experiment.
     * </p>
     * 
     * @param description
     *        A description of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A structure that contains the date and time that the experiment started and ended.
     * </p>
     * 
     * @param execution
     *        A structure that contains the date and time that the experiment started and ended.
     */

    public void setExecution(ExperimentExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * A structure that contains the date and time that the experiment started and ended.
     * </p>
     * 
     * @return A structure that contains the date and time that the experiment started and ended.
     */

    public ExperimentExecution getExecution() {
        return this.execution;
    }

    /**
     * <p>
     * A structure that contains the date and time that the experiment started and ended.
     * </p>
     * 
     * @param execution
     *        A structure that contains the date and time that the experiment started and ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withExecution(ExperimentExecution execution) {
        setExecution(execution);
        return this;
    }

    /**
     * <p>
     * The date and time that the experiment was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the experiment was most recently updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the experiment was most recently updated.
     * </p>
     * 
     * @return The date and time that the experiment was most recently updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the experiment was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the experiment was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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

    public java.util.List<MetricGoal> getMetricGoals() {
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

    public void setMetricGoals(java.util.Collection<MetricGoal> metricGoals) {
        if (metricGoals == null) {
            this.metricGoals = null;
            return;
        }

        this.metricGoals = new java.util.ArrayList<MetricGoal>(metricGoals);
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

    public Experiment withMetricGoals(MetricGoal... metricGoals) {
        if (this.metricGoals == null) {
            setMetricGoals(new java.util.ArrayList<MetricGoal>(metricGoals.length));
        }
        for (MetricGoal ele : metricGoals) {
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

    public Experiment withMetricGoals(java.util.Collection<MetricGoal> metricGoals) {
        setMetricGoals(metricGoals);
        return this;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param name
     *        The name of the experiment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @return The name of the experiment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param name
     *        The name of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbDefinition
     *        A structure that contains the configuration of which variation to use as the "control" version. The
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     */

    public void setOnlineAbDefinition(OnlineAbDefinition onlineAbDefinition) {
        this.onlineAbDefinition = onlineAbDefinition;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @return A structure that contains the configuration of which variation to use as the "control" version. The
     *         "control" version is used for comparison with other variations. This structure also specifies how much
     *         experiment traffic is allocated to each variation.
     */

    public OnlineAbDefinition getOnlineAbDefinition() {
        return this.onlineAbDefinition;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation to use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbDefinition
     *        A structure that contains the configuration of which variation to use as the "control" version. The
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withOnlineAbDefinition(OnlineAbDefinition onlineAbDefinition) {
        setOnlineAbDefinition(onlineAbDefinition);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this experiment.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains this experiment.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this experiment.
     * </p>
     * 
     * @return The name or ARN of the project that contains this experiment.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this experiment.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains this experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     * randomization ID to determine which variation the user session is served. This randomization ID is a combination
     * of the entity ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     *        randomization ID to determine which variation the user session is served. This randomization ID is a
     *        combination of the entity ID and <code>randomizationSalt</code>.
     */

    public void setRandomizationSalt(String randomizationSalt) {
        this.randomizationSalt = randomizationSalt;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     * randomization ID to determine which variation the user session is served. This randomization ID is a combination
     * of the entity ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @return This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     *         randomization ID to determine which variation the user session is served. This randomization ID is a
     *         combination of the entity ID and <code>randomizationSalt</code>.
     */

    public String getRandomizationSalt() {
        return this.randomizationSalt;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     * randomization ID to determine which variation the user session is served. This randomization ID is a combination
     * of the entity ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        This value is used when Evidently assigns a particular user session to the experiment. It helps create a
     *        randomization ID to determine which variation the user session is served. This randomization ID is a
     *        combination of the entity ID and <code>randomizationSalt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withRandomizationSalt(String randomizationSalt) {
        setRandomizationSalt(randomizationSalt);
        return this;
    }

    /**
     * <p>
     * In thousandths of a percent, the amount of the available audience that is allocated to this experiment. The
     * available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     * </p>
     * 
     * @param samplingRate
     *        In thousandths of a percent, the amount of the available audience that is allocated to this experiment.
     *        The available audience is the total audience minus the audience that you have allocated to overrides or
     *        current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     */

    public void setSamplingRate(Long samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     * <p>
     * In thousandths of a percent, the amount of the available audience that is allocated to this experiment. The
     * available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     * </p>
     * 
     * @return In thousandths of a percent, the amount of the available audience that is allocated to this experiment.
     *         The available audience is the total audience minus the audience that you have allocated to overrides or
     *         current launches of this feature.</p>
     *         <p>
     *         This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     */

    public Long getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * <p>
     * In thousandths of a percent, the amount of the available audience that is allocated to this experiment. The
     * available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     * </p>
     * 
     * @param samplingRate
     *        In thousandths of a percent, the amount of the available audience that is allocated to this experiment.
     *        The available audience is the total audience minus the audience that you have allocated to overrides or
     *        current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withSamplingRate(Long samplingRate) {
        setSamplingRate(samplingRate);
        return this;
    }

    /**
     * <p>
     * A structure that contains the time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @param schedule
     *        A structure that contains the time and date that Evidently completed the analysis of the experiment.
     */

    public void setSchedule(ExperimentSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A structure that contains the time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @return A structure that contains the time and date that Evidently completed the analysis of the experiment.
     */

    public ExperimentSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A structure that contains the time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @param schedule
     *        A structure that contains the time and date that Evidently completed the analysis of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withSchedule(ExperimentSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The audience segment being used for the experiment, if a segment is being used.
     * </p>
     * 
     * @param segment
     *        The audience segment being used for the experiment, if a segment is being used.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * The audience segment being used for the experiment, if a segment is being used.
     * </p>
     * 
     * @return The audience segment being used for the experiment, if a segment is being used.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * The audience segment being used for the experiment, if a segment is being used.
     * </p>
     * 
     * @param segment
     *        The audience segment being used for the experiment, if a segment is being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withSegment(String segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * The current state of the experiment.
     * </p>
     * 
     * @param status
     *        The current state of the experiment.
     * @see ExperimentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the experiment.
     * </p>
     * 
     * @return The current state of the experiment.
     * @see ExperimentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the experiment.
     * </p>
     * 
     * @param status
     *        The current state of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentStatus
     */

    public Experiment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the experiment.
     * </p>
     * 
     * @param status
     *        The current state of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentStatus
     */

    public Experiment withStatus(ExperimentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the experiment was stopped, this is the string that was entered by the person who stopped the experiment, to
     * explain why it was stopped.
     * </p>
     * 
     * @param statusReason
     *        If the experiment was stopped, this is the string that was entered by the person who stopped the
     *        experiment, to explain why it was stopped.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * If the experiment was stopped, this is the string that was entered by the person who stopped the experiment, to
     * explain why it was stopped.
     * </p>
     * 
     * @return If the experiment was stopped, this is the string that was entered by the person who stopped the
     *         experiment, to explain why it was stopped.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * If the experiment was stopped, this is the string that was entered by the person who stopped the experiment, to
     * explain why it was stopped.
     * </p>
     * 
     * @param statusReason
     *        If the experiment was stopped, this is the string that was entered by the person who stopped the
     *        experiment, to explain why it was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this experiment.
     * </p>
     * 
     * @return The list of tag keys and values associated with this experiment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this experiment.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this experiment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this experiment.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Experiment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Experiment addTagsEntry(String key, String value) {
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

    public Experiment clearTagsEntries() {
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

    public java.util.List<Treatment> getTreatments() {
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

    public void setTreatments(java.util.Collection<Treatment> treatments) {
        if (treatments == null) {
            this.treatments = null;
            return;
        }

        this.treatments = new java.util.ArrayList<Treatment>(treatments);
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

    public Experiment withTreatments(Treatment... treatments) {
        if (this.treatments == null) {
            setTreatments(new java.util.ArrayList<Treatment>(treatments.length));
        }
        for (Treatment ele : treatments) {
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

    public Experiment withTreatments(java.util.Collection<Treatment> treatments) {
        setTreatments(treatments);
        return this;
    }

    /**
     * <p>
     * The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * </p>
     * 
     * @param type
     *        The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * @see ExperimentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * </p>
     * 
     * @return The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * @see ExperimentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * </p>
     * 
     * @param type
     *        The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentType
     */

    public Experiment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * </p>
     * 
     * @param type
     *        The type of this experiment. Currently, this value must be <code>aws.experiment.onlineab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentType
     */

    public Experiment withType(ExperimentType type) {
        this.type = type.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecution() != null)
            sb.append("Execution: ").append(getExecution()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getMetricGoals() != null)
            sb.append("MetricGoals: ").append(getMetricGoals()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOnlineAbDefinition() != null)
            sb.append("OnlineAbDefinition: ").append(getOnlineAbDefinition()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getSamplingRate() != null)
            sb.append("SamplingRate: ").append(getSamplingRate()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTreatments() != null)
            sb.append("Treatments: ").append(getTreatments()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Experiment == false)
            return false;
        Experiment other = (Experiment) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getMetricGoals() == null ^ this.getMetricGoals() == null)
            return false;
        if (other.getMetricGoals() != null && other.getMetricGoals().equals(this.getMetricGoals()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOnlineAbDefinition() == null ^ this.getOnlineAbDefinition() == null)
            return false;
        if (other.getOnlineAbDefinition() != null && other.getOnlineAbDefinition().equals(this.getOnlineAbDefinition()) == false)
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
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTreatments() == null ^ this.getTreatments() == null)
            return false;
        if (other.getTreatments() != null && other.getTreatments().equals(this.getTreatments()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getMetricGoals() == null) ? 0 : getMetricGoals().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOnlineAbDefinition() == null) ? 0 : getOnlineAbDefinition().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getSamplingRate() == null) ? 0 : getSamplingRate().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTreatments() == null) ? 0 : getTreatments().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Experiment clone() {
        try {
            return (Experiment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ExperimentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
