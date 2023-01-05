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
 * This structure contains the configuration details of one Evidently launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Launch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Launch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the launch.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the launch is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The description of the launch.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A structure that contains information about the start and end times of the launch.
     * </p>
     */
    private LaunchExecution execution;
    /**
     * <p>
     * An array of structures that define the feature variations that are being used in the launch.
     * </p>
     */
    private java.util.List<LaunchGroup> groups;
    /**
     * <p>
     * The date and time that the launch was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * An array of structures that define the metrics that are being used to monitor the launch performance.
     * </p>
     */
    private java.util.List<MetricMonitor> metricMonitors;
    /**
     * <p>
     * The name of the launch.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name or ARN of the project that contains the launch.
     * </p>
     */
    private String project;
    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the launch, to help create a randomization
     * ID to determine which variation the user session is served. This randomization ID is a combination of the entity
     * ID and <code>randomizationSalt</code>.
     * </p>
     */
    private String randomizationSalt;
    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     */
    private ScheduledSplitsLaunchDefinition scheduledSplitsDefinition;
    /**
     * <p>
     * The current state of the launch.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain
     * why it was stopped.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The list of tag keys and values associated with this launch.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of launch.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of the launch.
     * </p>
     * 
     * @param arn
     *        The ARN of the launch.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the launch.
     * </p>
     * 
     * @return The ARN of the launch.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the launch.
     * </p>
     * 
     * @param arn
     *        The ARN of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the launch is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the launch is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the launch is created.
     * </p>
     * 
     * @return The date and time that the launch is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the launch is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the launch is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The description of the launch.
     * </p>
     * 
     * @param description
     *        The description of the launch.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the launch.
     * </p>
     * 
     * @return The description of the launch.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the launch.
     * </p>
     * 
     * @param description
     *        The description of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the start and end times of the launch.
     * </p>
     * 
     * @param execution
     *        A structure that contains information about the start and end times of the launch.
     */

    public void setExecution(LaunchExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * A structure that contains information about the start and end times of the launch.
     * </p>
     * 
     * @return A structure that contains information about the start and end times of the launch.
     */

    public LaunchExecution getExecution() {
        return this.execution;
    }

    /**
     * <p>
     * A structure that contains information about the start and end times of the launch.
     * </p>
     * 
     * @param execution
     *        A structure that contains information about the start and end times of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withExecution(LaunchExecution execution) {
        setExecution(execution);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the feature variations that are being used in the launch.
     * </p>
     * 
     * @return An array of structures that define the feature variations that are being used in the launch.
     */

    public java.util.List<LaunchGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * An array of structures that define the feature variations that are being used in the launch.
     * </p>
     * 
     * @param groups
     *        An array of structures that define the feature variations that are being used in the launch.
     */

    public void setGroups(java.util.Collection<LaunchGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<LaunchGroup>(groups);
    }

    /**
     * <p>
     * An array of structures that define the feature variations that are being used in the launch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        An array of structures that define the feature variations that are being used in the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withGroups(LaunchGroup... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<LaunchGroup>(groups.length));
        }
        for (LaunchGroup ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the feature variations that are being used in the launch.
     * </p>
     * 
     * @param groups
     *        An array of structures that define the feature variations that are being used in the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withGroups(java.util.Collection<LaunchGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The date and time that the launch was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the launch was most recently updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the launch was most recently updated.
     * </p>
     * 
     * @return The date and time that the launch was most recently updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the launch was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the launch was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the metrics that are being used to monitor the launch performance.
     * </p>
     * 
     * @return An array of structures that define the metrics that are being used to monitor the launch performance.
     */

    public java.util.List<MetricMonitor> getMetricMonitors() {
        return metricMonitors;
    }

    /**
     * <p>
     * An array of structures that define the metrics that are being used to monitor the launch performance.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that are being used to monitor the launch performance.
     */

    public void setMetricMonitors(java.util.Collection<MetricMonitor> metricMonitors) {
        if (metricMonitors == null) {
            this.metricMonitors = null;
            return;
        }

        this.metricMonitors = new java.util.ArrayList<MetricMonitor>(metricMonitors);
    }

    /**
     * <p>
     * An array of structures that define the metrics that are being used to monitor the launch performance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricMonitors(java.util.Collection)} or {@link #withMetricMonitors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that are being used to monitor the launch performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withMetricMonitors(MetricMonitor... metricMonitors) {
        if (this.metricMonitors == null) {
            setMetricMonitors(new java.util.ArrayList<MetricMonitor>(metricMonitors.length));
        }
        for (MetricMonitor ele : metricMonitors) {
            this.metricMonitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the metrics that are being used to monitor the launch performance.
     * </p>
     * 
     * @param metricMonitors
     *        An array of structures that define the metrics that are being used to monitor the launch performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withMetricMonitors(java.util.Collection<MetricMonitor> metricMonitors) {
        setMetricMonitors(metricMonitors);
        return this;
    }

    /**
     * <p>
     * The name of the launch.
     * </p>
     * 
     * @param name
     *        The name of the launch.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the launch.
     * </p>
     * 
     * @return The name of the launch.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the launch.
     * </p>
     * 
     * @param name
     *        The name of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch.
     * </p>
     * 
     * @return The name or ARN of the project that contains the launch.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the launch, to help create a randomization
     * ID to determine which variation the user session is served. This randomization ID is a combination of the entity
     * ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        This value is used when Evidently assigns a particular user session to the launch, to help create a
     *        randomization ID to determine which variation the user session is served. This randomization ID is a
     *        combination of the entity ID and <code>randomizationSalt</code>.
     */

    public void setRandomizationSalt(String randomizationSalt) {
        this.randomizationSalt = randomizationSalt;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the launch, to help create a randomization
     * ID to determine which variation the user session is served. This randomization ID is a combination of the entity
     * ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @return This value is used when Evidently assigns a particular user session to the launch, to help create a
     *         randomization ID to determine which variation the user session is served. This randomization ID is a
     *         combination of the entity ID and <code>randomizationSalt</code>.
     */

    public String getRandomizationSalt() {
        return this.randomizationSalt;
    }

    /**
     * <p>
     * This value is used when Evidently assigns a particular user session to the launch, to help create a randomization
     * ID to determine which variation the user session is served. This randomization ID is a combination of the entity
     * ID and <code>randomizationSalt</code>.
     * </p>
     * 
     * @param randomizationSalt
     *        This value is used when Evidently assigns a particular user session to the launch, to help create a
     *        randomization ID to determine which variation the user session is served. This randomization ID is a
     *        combination of the entity ID and <code>randomizationSalt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withRandomizationSalt(String randomizationSalt) {
        setRandomizationSalt(randomizationSalt);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     * 
     * @param scheduledSplitsDefinition
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch.
     */

    public void setScheduledSplitsDefinition(ScheduledSplitsLaunchDefinition scheduledSplitsDefinition) {
        this.scheduledSplitsDefinition = scheduledSplitsDefinition;
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

    public ScheduledSplitsLaunchDefinition getScheduledSplitsDefinition() {
        return this.scheduledSplitsDefinition;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch.
     * </p>
     * 
     * @param scheduledSplitsDefinition
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withScheduledSplitsDefinition(ScheduledSplitsLaunchDefinition scheduledSplitsDefinition) {
        setScheduledSplitsDefinition(scheduledSplitsDefinition);
        return this;
    }

    /**
     * <p>
     * The current state of the launch.
     * </p>
     * 
     * @param status
     *        The current state of the launch.
     * @see LaunchStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the launch.
     * </p>
     * 
     * @return The current state of the launch.
     * @see LaunchStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the launch.
     * </p>
     * 
     * @param status
     *        The current state of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public Launch withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the launch.
     * </p>
     * 
     * @param status
     *        The current state of the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public Launch withStatus(LaunchStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain
     * why it was stopped.
     * </p>
     * 
     * @param statusReason
     *        If the launch was stopped, this is the string that was entered by the person who stopped the launch, to
     *        explain why it was stopped.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain
     * why it was stopped.
     * </p>
     * 
     * @return If the launch was stopped, this is the string that was entered by the person who stopped the launch, to
     *         explain why it was stopped.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain
     * why it was stopped.
     * </p>
     * 
     * @param statusReason
     *        If the launch was stopped, this is the string that was entered by the person who stopped the launch, to
     *        explain why it was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this launch.
     * </p>
     * 
     * @return The list of tag keys and values associated with this launch.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this launch.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this launch.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this launch.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Launch withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Launch#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Launch addTagsEntry(String key, String value) {
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

    public Launch clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of launch.
     * </p>
     * 
     * @param type
     *        The type of launch.
     * @see LaunchType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of launch.
     * </p>
     * 
     * @return The type of launch.
     * @see LaunchType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of launch.
     * </p>
     * 
     * @param type
     *        The type of launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Launch withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of launch.
     * </p>
     * 
     * @param type
     *        The type of launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Launch withType(LaunchType type) {
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getMetricMonitors() != null)
            sb.append("MetricMonitors: ").append(getMetricMonitors()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getScheduledSplitsDefinition() != null)
            sb.append("ScheduledSplitsDefinition: ").append(getScheduledSplitsDefinition()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof Launch == false)
            return false;
        Launch other = (Launch) obj;
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
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getMetricMonitors() == null ^ this.getMetricMonitors() == null)
            return false;
        if (other.getMetricMonitors() != null && other.getMetricMonitors().equals(this.getMetricMonitors()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getRandomizationSalt() == null ^ this.getRandomizationSalt() == null)
            return false;
        if (other.getRandomizationSalt() != null && other.getRandomizationSalt().equals(this.getRandomizationSalt()) == false)
            return false;
        if (other.getScheduledSplitsDefinition() == null ^ this.getScheduledSplitsDefinition() == null)
            return false;
        if (other.getScheduledSplitsDefinition() != null && other.getScheduledSplitsDefinition().equals(this.getScheduledSplitsDefinition()) == false)
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
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getMetricMonitors() == null) ? 0 : getMetricMonitors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getScheduledSplitsDefinition() == null) ? 0 : getScheduledSplitsDefinition().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Launch clone() {
        try {
            return (Launch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.LaunchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
