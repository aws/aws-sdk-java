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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * An array of structures that define the metrics that will be used to monitor the launch performance.
     * </p>
     */
    private java.util.List<MetricMonitorConfig> metricMonitors;
    /**
     * <p>
     * The name for the new launch.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name or ARN of the project that you want to create the launch in.
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
     * Assigns one or more tags (key-value pairs) to the launch.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.Map<String, String> tags;

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

    public CreateLaunchRequest withDescription(String description) {
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

    public CreateLaunchRequest withGroups(LaunchGroupConfig... groups) {
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

    public CreateLaunchRequest withGroups(java.util.Collection<LaunchGroupConfig> groups) {
        setGroups(groups);
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

    public CreateLaunchRequest withMetricMonitors(MetricMonitorConfig... metricMonitors) {
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

    public CreateLaunchRequest withMetricMonitors(java.util.Collection<MetricMonitorConfig> metricMonitors) {
        setMetricMonitors(metricMonitors);
        return this;
    }

    /**
     * <p>
     * The name for the new launch.
     * </p>
     * 
     * @param name
     *        The name for the new launch.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new launch.
     * </p>
     * 
     * @return The name for the new launch.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new launch.
     * </p>
     * 
     * @param name
     *        The name for the new launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the launch in.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to create the launch in.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the launch in.
     * </p>
     * 
     * @return The name or ARN of the project that you want to create the launch in.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to create the launch in.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to create the launch in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchRequest withProject(String project) {
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

    public CreateLaunchRequest withRandomizationSalt(String randomizationSalt) {
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

    public CreateLaunchRequest withScheduledSplitsConfig(ScheduledSplitsLaunchConfig scheduledSplitsConfig) {
        setScheduledSplitsConfig(scheduledSplitsConfig);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the launch.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return Assigns one or more tags (key-value pairs) to the launch.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *         characters.
     *         </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the launch.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the launch.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the launch.
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the launch.</p>
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
     * <code> &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLaunchRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchRequest addTagsEntry(String key, String value) {
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

    public CreateLaunchRequest clearTagsEntries() {
        this.tags = null;
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
        if (getMetricMonitors() != null)
            sb.append("MetricMonitors: ").append(getMetricMonitors()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRandomizationSalt() != null)
            sb.append("RandomizationSalt: ").append(getRandomizationSalt()).append(",");
        if (getScheduledSplitsConfig() != null)
            sb.append("ScheduledSplitsConfig: ").append(getScheduledSplitsConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchRequest == false)
            return false;
        CreateLaunchRequest other = (CreateLaunchRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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
        if (other.getScheduledSplitsConfig() == null ^ this.getScheduledSplitsConfig() == null)
            return false;
        if (other.getScheduledSplitsConfig() != null && other.getScheduledSplitsConfig().equals(this.getScheduledSplitsConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getMetricMonitors() == null) ? 0 : getMetricMonitors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRandomizationSalt() == null) ? 0 : getRandomizationSalt().hashCode());
        hashCode = prime * hashCode + ((getScheduledSplitsConfig() == null) ? 0 : getScheduledSplitsConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchRequest clone() {
        return (CreateLaunchRequest) super.clone();
    }

}
