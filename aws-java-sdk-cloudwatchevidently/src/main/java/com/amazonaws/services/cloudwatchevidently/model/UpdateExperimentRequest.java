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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description of the experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     */
    private String experiment;
    /**
     * <p>
     * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for
     * each metric is the goal.
     * </p>
     */
    private java.util.List<MetricGoalConfig> metricGoals;
    /**
     * <p>
     * A structure that contains the configuration of which variation o use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     */
    private OnlineAbConfig onlineAbConfig;
    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to update.
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
     * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently
     * running.
     * </p>
     */
    private Boolean removeSegment;
    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the available
     * audience.
     * </p>
     */
    private Long samplingRate;
    /**
     * <p>
     * Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user sessions
     * that match the segment pattern are used in the experiment. You can't use this parameter if the experiment is
     * currently running.
     * </p>
     */
    private String segment;
    /**
     * <p>
     * An array of structures that define the variations being tested in the experiment.
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

    public UpdateExperimentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to update.
     */

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @return The name of the experiment to update.
     */

    public String getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withExperiment(String experiment) {
        setExperiment(experiment);
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

    public UpdateExperimentRequest withMetricGoals(MetricGoalConfig... metricGoals) {
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

    public UpdateExperimentRequest withMetricGoals(java.util.Collection<MetricGoalConfig> metricGoals) {
        setMetricGoals(metricGoals);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation o use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbConfig
     *        A structure that contains the configuration of which variation o use as the "control" version. The
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     */

    public void setOnlineAbConfig(OnlineAbConfig onlineAbConfig) {
        this.onlineAbConfig = onlineAbConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation o use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @return A structure that contains the configuration of which variation o use as the "control" version. The
     *         "control" version is used for comparison with other variations. This structure also specifies how much
     *         experiment traffic is allocated to each variation.
     */

    public OnlineAbConfig getOnlineAbConfig() {
        return this.onlineAbConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration of which variation o use as the "control" version. The "control"
     * version is used for comparison with other variations. This structure also specifies how much experiment traffic
     * is allocated to each variation.
     * </p>
     * 
     * @param onlineAbConfig
     *        A structure that contains the configuration of which variation o use as the "control" version. The
     *        "control" version is used for comparison with other variations. This structure also specifies how much
     *        experiment traffic is allocated to each variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withOnlineAbConfig(OnlineAbConfig onlineAbConfig) {
        setOnlineAbConfig(onlineAbConfig);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment that you want to update.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to update.
     * </p>
     * 
     * @return The name or ARN of the project that contains the experiment that you want to update.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withProject(String project) {
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

    public UpdateExperimentRequest withRandomizationSalt(String randomizationSalt) {
        setRandomizationSalt(randomizationSalt);
        return this;
    }

    /**
     * <p>
     * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently
     * running.
     * </p>
     * 
     * @param removeSegment
     *        Removes a segment from being used in an experiment. You can't use this parameter if the experiment is
     *        currently running.
     */

    public void setRemoveSegment(Boolean removeSegment) {
        this.removeSegment = removeSegment;
    }

    /**
     * <p>
     * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently
     * running.
     * </p>
     * 
     * @return Removes a segment from being used in an experiment. You can't use this parameter if the experiment is
     *         currently running.
     */

    public Boolean getRemoveSegment() {
        return this.removeSegment;
    }

    /**
     * <p>
     * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently
     * running.
     * </p>
     * 
     * @param removeSegment
     *        Removes a segment from being used in an experiment. You can't use this parameter if the experiment is
     *        currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withRemoveSegment(Boolean removeSegment) {
        setRemoveSegment(removeSegment);
        return this;
    }

    /**
     * <p>
     * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently
     * running.
     * </p>
     * 
     * @return Removes a segment from being used in an experiment. You can't use this parameter if the experiment is
     *         currently running.
     */

    public Boolean isRemoveSegment() {
        return this.removeSegment;
    }

    /**
     * <p>
     * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to overrides or current
     * launches of this feature.
     * </p>
     * <p>
     * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the available
     * audience.
     * </p>
     * 
     * @param samplingRate
     *        The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *        percent. The available audience is the total audience minus the audience that you have allocated to
     *        overrides or current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the
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
     * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the available
     * audience.
     * </p>
     * 
     * @return The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *         percent. The available audience is the total audience minus the audience that you have allocated to
     *         overrides or current launches of this feature.</p>
     *         <p>
     *         This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the
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
     * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the available
     * audience.
     * </p>
     * 
     * @param samplingRate
     *        The portion of the available audience that you want to allocate to this experiment, in thousandths of a
     *        percent. The available audience is the total audience minus the audience that you have allocated to
     *        overrides or current launches of this feature.</p>
     *        <p>
     *        This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the
     *        available audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withSamplingRate(Long samplingRate) {
        setSamplingRate(samplingRate);
        return this;
    }

    /**
     * <p>
     * Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user sessions
     * that match the segment pattern are used in the experiment. You can't use this parameter if the experiment is
     * currently running.
     * </p>
     * 
     * @param segment
     *        Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user
     *        sessions that match the segment pattern are used in the experiment. You can't use this parameter if the
     *        experiment is currently running.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user sessions
     * that match the segment pattern are used in the experiment. You can't use this parameter if the experiment is
     * currently running.
     * </p>
     * 
     * @return Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user
     *         sessions that match the segment pattern are used in the experiment. You can't use this parameter if the
     *         experiment is currently running.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user sessions
     * that match the segment pattern are used in the experiment. You can't use this parameter if the experiment is
     * currently running.
     * </p>
     * 
     * @param segment
     *        Adds an audience <i>segment</i> to an experiment. When a segment is used in an experiment, only user
     *        sessions that match the segment pattern are used in the experiment. You can't use this parameter if the
     *        experiment is currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withSegment(String segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the variations being tested in the experiment.
     * </p>
     * 
     * @return An array of structures that define the variations being tested in the experiment.
     */

    public java.util.List<TreatmentConfig> getTreatments() {
        return treatments;
    }

    /**
     * <p>
     * An array of structures that define the variations being tested in the experiment.
     * </p>
     * 
     * @param treatments
     *        An array of structures that define the variations being tested in the experiment.
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
     * An array of structures that define the variations being tested in the experiment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTreatments(java.util.Collection)} or {@link #withTreatments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param treatments
     *        An array of structures that define the variations being tested in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withTreatments(TreatmentConfig... treatments) {
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
     * An array of structures that define the variations being tested in the experiment.
     * </p>
     * 
     * @param treatments
     *        An array of structures that define the variations being tested in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withTreatments(java.util.Collection<TreatmentConfig> treatments) {
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
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment()).append(",");
        if (getMetricGoals() != null)
            sb.append("MetricGoals: ").append(getMetricGoals()).append(",");
        if (getOnlineAbConfig() != null)
            sb.append("OnlineAbConfig: ").append(getOnlineAbConfig()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getRemoveSegment() != null)
            sb.append("RemoveSegment: ").append(getRemoveSegment()).append(",");
        if (getSamplingRate() != null)
            sb.append("SamplingRate: ").append(getSamplingRate()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
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

        if (obj instanceof UpdateExperimentRequest == false)
            return false;
        UpdateExperimentRequest other = (UpdateExperimentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getMetricGoals() == null ^ this.getMetricGoals() == null)
            return false;
        if (other.getMetricGoals() != null && other.getMetricGoals().equals(this.getMetricGoals()) == false)
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
        if (other.getRemoveSegment() == null ^ this.getRemoveSegment() == null)
            return false;
        if (other.getRemoveSegment() != null && other.getRemoveSegment().equals(this.getRemoveSegment()) == false)
            return false;
        if (other.getSamplingRate() == null ^ this.getSamplingRate() == null)
            return false;
        if (other.getSamplingRate() != null && other.getSamplingRate().equals(this.getSamplingRate()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
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
        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getMetricGoals() == null) ? 0 : getMetricGoals().hashCode());
        hashCode = prime * hashCode + ((getOnlineAbConfig() == null) ? 0 : getOnlineAbConfig().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getRemoveSegment() == null) ? 0 : getRemoveSegment().hashCode());
        hashCode = prime * hashCode + ((getSamplingRate() == null) ? 0 : getSamplingRate().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getTreatments() == null) ? 0 : getTreatments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExperimentRequest clone() {
        return (UpdateExperimentRequest) super.clone();
    }

}
