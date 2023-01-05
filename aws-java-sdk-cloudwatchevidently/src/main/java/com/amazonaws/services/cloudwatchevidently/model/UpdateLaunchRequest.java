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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description for the launch.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of structures that contains the feature and variations that are to be used for the launch.
     * </p>
     */
    private java.util.List<LaunchGroupConfig> groups;
    /**
     * <p>
     * The name of the launch that is to be updated.
     * </p>
     */
    private String launch;
    /**
     * <p>
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     */
    private java.util.List<MetricMonitorConfig> metricMonitors;
    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to update.
     * </p>
     */
    private String project;
    /**
     * <p>
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which
     * variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name as the
     * <code>randomizationSalt</code>.
     * </p>
     */
    private String randomizationSalt;
    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     */
    private ScheduledSplitsLaunchConfig scheduledSplitsConfig;

    /**
     * <p>
     * An optional description for the launch.
     * </p>
     * 
     * @param description
     *        An optional description for the launch.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the launch.
     * </p>
     * 
     * @return An optional description for the launch.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the launch.
     * </p>
     * 
     * @param description
     *        An optional description for the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of structures that contains the feature and variations that are to be used for the launch.
     * </p>
     * 
     * @return An array of structures that contains the feature and variations that are to be used for the launch.
     */

    public java.util.List<LaunchGroupConfig> getGroups() {
        return groups;
    }

    /**
     * <p>
     * An array of structures that contains the feature and variations that are to be used for the launch.
     * </p>
     * 
     * @param groups
     *        An array of structures that contains the feature and variations that are to be used for the launch.
     */

    public void setGroups(java.util.Collection<LaunchGroupConfig> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<LaunchGroupConfig>(groups);
    }

    /**
     * <p>
     * An array of structures that contains the feature and variations that are to be used for the launch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        An array of structures that contains the feature and variations that are to be used for the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withGroups(LaunchGroupConfig... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<LaunchGroupConfig>(groups.length));
        }
        for (LaunchGroupConfig ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contains the feature and variations that are to be used for the launch.
     * </p>
     * 
     * @param groups
     *        An array of structures that contains the feature and variations that are to be used for the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withGroups(java.util.Collection<LaunchGroupConfig> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The name of the launch that is to be updated.
     * </p>
     * 
     * @param launch
     *        The name of the launch that is to be updated.
     */

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    /**
     * <p>
     * The name of the launch that is to be updated.
     * </p>
     * 
     * @return The name of the launch that is to be updated.
     */

    public String getLaunch() {
        return this.launch;
    }

    /**
     * <p>
     * The name of the launch that is to be updated.
     * </p>
     * 
     * @param launch
     *        The name of the launch that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withLaunch(String launch) {
        setLaunch(launch);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     * 
     * @return An array of structures that define the metrics that will be used to monitor the launch performance.
     */

    public java.util.List<MetricMonitorConfig> getMetricMonitors() {
        return metricMonitors;
    }

    /**
     * <p>
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that will be used to monitor the launch performance.
     */

    public void setMetricMonitors(java.util.Collection<MetricMonitorConfig> metricMonitors) {
        if (metricMonitors == null) {
            this.metricMonitors = null;
            return;
        }

        this.metricMonitors = new java.util.ArrayList<MetricMonitorConfig>(metricMonitors);
    }

    /**
     * <p>
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricMonitors(java.util.Collection)} or {@link #withMetricMonitors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that will be used to monitor the launch performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withMetricMonitors(MetricMonitorConfig... metricMonitors) {
        if (this.metricMonitors == null) {
            setMetricMonitors(new java.util.ArrayList<MetricMonitorConfig>(metricMonitors.length));
        }
        for (MetricMonitorConfig ele : metricMonitors) {
            this.metricMonitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that will be used to monitor the launch performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withMetricMonitors(java.util.Collection<MetricMonitorConfig> metricMonitors) {
        setMetricMonitors(metricMonitors);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch that you want to update.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to update.
     * </p>
     * 
     * @return The name or ARN of the project that contains the launch that you want to update.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which
     * variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name as the
     * <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine
     *        which variation the user session is served. This randomization ID is a combination of the entity ID and
     *        <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name
     *        as the <code>randomizationSalt</code>.
     */

    public void setRandomizationSalt(String randomizationSalt) {
        this.randomizationSalt = randomizationSalt;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which
     * variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name as the
     * <code>randomizationSalt</code>.
     * </p>
     * 
     * @return When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine
     *         which variation the user session is served. This randomization ID is a combination of the entity ID and
     *         <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch
     *         name as the <code>randomizationSalt</code>.
     */

    public String getRandomizationSalt() {
        return this.randomizationSalt;
    }

    /**
     * <p>
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which
     * variation the user session is served. This randomization ID is a combination of the entity ID and
     * <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name as the
     * <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine
     *        which variation the user session is served. This randomization ID is a combination of the entity ID and
     *        <code>randomizationSalt</code>. If you omit <code>randomizationSalt</code>, Evidently uses the launch name
     *        as the <code>randomizationSalt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withRandomizationSalt(String randomizationSalt) {
        setRandomizationSalt(randomizationSalt);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     * 
     * @param scheduledSplitsConfig
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch.
     */

    public void setScheduledSplitsConfig(ScheduledSplitsLaunchConfig scheduledSplitsConfig) {
        this.scheduledSplitsConfig = scheduledSplitsConfig;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     * 
     * @return An array of structures that define the traffic allocation percentages among the feature variations during
     *         each step of the launch.
     */

    public ScheduledSplitsLaunchConfig getScheduledSplitsConfig() {
        return this.scheduledSplitsConfig;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     * 
     * @param scheduledSplitsConfig
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchRequest withScheduledSplitsConfig(ScheduledSplitsLaunchConfig scheduledSplitsConfig) {
        setScheduledSplitsConfig(scheduledSplitsConfig);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getLaunch() != null)
            sb.append("Launch: ").append(getLaunch()).append(",");
        if (getMetricMonitors() != null)
            sb.append("MetricMonitors: ").append(getMetricMonitors()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getScheduledSplitsConfig() != null)
            sb.append("ScheduledSplitsConfig: ").append(getScheduledSplitsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLaunchRequest == false)
            return false;
        UpdateLaunchRequest other = (UpdateLaunchRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getLaunch() == null ^ this.getLaunch() == null)
            return false;
        if (other.getLaunch() != null && other.getLaunch().equals(this.getLaunch()) == false)
            return false;
        if (other.getMetricMonitors() == null ^ this.getMetricMonitors() == null)
            return false;
        if (other.getMetricMonitors() != null && other.getMetricMonitors().equals(this.getMetricMonitors()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getRandomizationSalt() == null ^ this.getRandomizationSalt() == null)
            return false;
        if (other.getRandomizationSalt() != null && other.getRandomizationSalt().equals(this.getRandomizationSalt()) == false)
            return false;
        if (other.getScheduledSplitsConfig() == null ^ this.getScheduledSplitsConfig() == null)
            return false;
        if (other.getScheduledSplitsConfig() != null && other.getScheduledSplitsConfig().equals(this.getScheduledSplitsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getLaunch() == null) ? 0 : getLaunch().hashCode());
        hashCode = prime * hashCode + ((getMetricMonitors() == null) ? 0 : getMetricMonitors().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getScheduledSplitsConfig() == null) ? 0 : getScheduledSplitsConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchRequest clone() {
        return (UpdateLaunchRequest) super.clone();
    }

}
