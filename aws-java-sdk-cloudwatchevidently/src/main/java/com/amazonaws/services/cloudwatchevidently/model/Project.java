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
 * This structure defines a project, which is the logical object in Evidently that can contain features, launches, and
 * experiments. Use projects to group similar features together.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Project" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Project implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of ongoing experiments currently in the project.
     * </p>
     */
    private Long activeExperimentCount;
    /**
     * <p>
     * The number of ongoing launches currently in the project.
     * </p>
     */
    private Long activeLaunchCount;
    /**
     * <p>
     * This structure defines the configuration of how your application integrates with AppConfig to run client-side
     * evaluation.
     * </p>
     */
    private ProjectAppConfigResource appConfigResource;
    /**
     * <p>
     * The name or ARN of the project.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the project is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A structure that contains information about where Evidently is to store evaluation events for longer term
     * storage.
     * </p>
     */
    private ProjectDataDelivery dataDelivery;
    /**
     * <p>
     * The user-entered description of the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of experiments currently in the project. This includes all experiments that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     */
    private Long experimentCount;
    /**
     * <p>
     * The number of features currently in the project.
     * </p>
     */
    private Long featureCount;
    /**
     * <p>
     * The date and time that the project was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The number of launches currently in the project. This includes all launches that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     */
    private Long launchCount;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current state of the project.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of tag keys and values associated with this project.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The number of ongoing experiments currently in the project.
     * </p>
     * 
     * @param activeExperimentCount
     *        The number of ongoing experiments currently in the project.
     */

    public void setActiveExperimentCount(Long activeExperimentCount) {
        this.activeExperimentCount = activeExperimentCount;
    }

    /**
     * <p>
     * The number of ongoing experiments currently in the project.
     * </p>
     * 
     * @return The number of ongoing experiments currently in the project.
     */

    public Long getActiveExperimentCount() {
        return this.activeExperimentCount;
    }

    /**
     * <p>
     * The number of ongoing experiments currently in the project.
     * </p>
     * 
     * @param activeExperimentCount
     *        The number of ongoing experiments currently in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withActiveExperimentCount(Long activeExperimentCount) {
        setActiveExperimentCount(activeExperimentCount);
        return this;
    }

    /**
     * <p>
     * The number of ongoing launches currently in the project.
     * </p>
     * 
     * @param activeLaunchCount
     *        The number of ongoing launches currently in the project.
     */

    public void setActiveLaunchCount(Long activeLaunchCount) {
        this.activeLaunchCount = activeLaunchCount;
    }

    /**
     * <p>
     * The number of ongoing launches currently in the project.
     * </p>
     * 
     * @return The number of ongoing launches currently in the project.
     */

    public Long getActiveLaunchCount() {
        return this.activeLaunchCount;
    }

    /**
     * <p>
     * The number of ongoing launches currently in the project.
     * </p>
     * 
     * @param activeLaunchCount
     *        The number of ongoing launches currently in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withActiveLaunchCount(Long activeLaunchCount) {
        setActiveLaunchCount(activeLaunchCount);
        return this;
    }

    /**
     * <p>
     * This structure defines the configuration of how your application integrates with AppConfig to run client-side
     * evaluation.
     * </p>
     * 
     * @param appConfigResource
     *        This structure defines the configuration of how your application integrates with AppConfig to run
     *        client-side evaluation.
     */

    public void setAppConfigResource(ProjectAppConfigResource appConfigResource) {
        this.appConfigResource = appConfigResource;
    }

    /**
     * <p>
     * This structure defines the configuration of how your application integrates with AppConfig to run client-side
     * evaluation.
     * </p>
     * 
     * @return This structure defines the configuration of how your application integrates with AppConfig to run
     *         client-side evaluation.
     */

    public ProjectAppConfigResource getAppConfigResource() {
        return this.appConfigResource;
    }

    /**
     * <p>
     * This structure defines the configuration of how your application integrates with AppConfig to run client-side
     * evaluation.
     * </p>
     * 
     * @param appConfigResource
     *        This structure defines the configuration of how your application integrates with AppConfig to run
     *        client-side evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withAppConfigResource(ProjectAppConfigResource appConfigResource) {
        setAppConfigResource(appConfigResource);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project.
     * </p>
     * 
     * @param arn
     *        The name or ARN of the project.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The name or ARN of the project.
     * </p>
     * 
     * @return The name or ARN of the project.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The name or ARN of the project.
     * </p>
     * 
     * @param arn
     *        The name or ARN of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the project is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the project is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the project is created.
     * </p>
     * 
     * @return The date and time that the project is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the project is created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the project is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about where Evidently is to store evaluation events for longer term
     * storage.
     * </p>
     * 
     * @param dataDelivery
     *        A structure that contains information about where Evidently is to store evaluation events for longer term
     *        storage.
     */

    public void setDataDelivery(ProjectDataDelivery dataDelivery) {
        this.dataDelivery = dataDelivery;
    }

    /**
     * <p>
     * A structure that contains information about where Evidently is to store evaluation events for longer term
     * storage.
     * </p>
     * 
     * @return A structure that contains information about where Evidently is to store evaluation events for longer term
     *         storage.
     */

    public ProjectDataDelivery getDataDelivery() {
        return this.dataDelivery;
    }

    /**
     * <p>
     * A structure that contains information about where Evidently is to store evaluation events for longer term
     * storage.
     * </p>
     * 
     * @param dataDelivery
     *        A structure that contains information about where Evidently is to store evaluation events for longer term
     *        storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withDataDelivery(ProjectDataDelivery dataDelivery) {
        setDataDelivery(dataDelivery);
        return this;
    }

    /**
     * <p>
     * The user-entered description of the project.
     * </p>
     * 
     * @param description
     *        The user-entered description of the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-entered description of the project.
     * </p>
     * 
     * @return The user-entered description of the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-entered description of the project.
     * </p>
     * 
     * @param description
     *        The user-entered description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of experiments currently in the project. This includes all experiments that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @param experimentCount
     *        The number of experiments currently in the project. This includes all experiments that have been created
     *        and not deleted, whether they are ongoing or not.
     */

    public void setExperimentCount(Long experimentCount) {
        this.experimentCount = experimentCount;
    }

    /**
     * <p>
     * The number of experiments currently in the project. This includes all experiments that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @return The number of experiments currently in the project. This includes all experiments that have been created
     *         and not deleted, whether they are ongoing or not.
     */

    public Long getExperimentCount() {
        return this.experimentCount;
    }

    /**
     * <p>
     * The number of experiments currently in the project. This includes all experiments that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @param experimentCount
     *        The number of experiments currently in the project. This includes all experiments that have been created
     *        and not deleted, whether they are ongoing or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withExperimentCount(Long experimentCount) {
        setExperimentCount(experimentCount);
        return this;
    }

    /**
     * <p>
     * The number of features currently in the project.
     * </p>
     * 
     * @param featureCount
     *        The number of features currently in the project.
     */

    public void setFeatureCount(Long featureCount) {
        this.featureCount = featureCount;
    }

    /**
     * <p>
     * The number of features currently in the project.
     * </p>
     * 
     * @return The number of features currently in the project.
     */

    public Long getFeatureCount() {
        return this.featureCount;
    }

    /**
     * <p>
     * The number of features currently in the project.
     * </p>
     * 
     * @param featureCount
     *        The number of features currently in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withFeatureCount(Long featureCount) {
        setFeatureCount(featureCount);
        return this;
    }

    /**
     * <p>
     * The date and time that the project was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the project was most recently updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the project was most recently updated.
     * </p>
     * 
     * @return The date and time that the project was most recently updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the project was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the project was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The number of launches currently in the project. This includes all launches that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @param launchCount
     *        The number of launches currently in the project. This includes all launches that have been created and not
     *        deleted, whether they are ongoing or not.
     */

    public void setLaunchCount(Long launchCount) {
        this.launchCount = launchCount;
    }

    /**
     * <p>
     * The number of launches currently in the project. This includes all launches that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @return The number of launches currently in the project. This includes all launches that have been created and
     *         not deleted, whether they are ongoing or not.
     */

    public Long getLaunchCount() {
        return this.launchCount;
    }

    /**
     * <p>
     * The number of launches currently in the project. This includes all launches that have been created and not
     * deleted, whether they are ongoing or not.
     * </p>
     * 
     * @param launchCount
     *        The number of launches currently in the project. This includes all launches that have been created and not
     *        deleted, whether they are ongoing or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLaunchCount(Long launchCount) {
        setLaunchCount(launchCount);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state of the project.
     * </p>
     * 
     * @param status
     *        The current state of the project.
     * @see ProjectStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the project.
     * </p>
     * 
     * @return The current state of the project.
     * @see ProjectStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the project.
     * </p>
     * 
     * @param status
     *        The current state of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public Project withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the project.
     * </p>
     * 
     * @param status
     *        The current state of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public Project withStatus(ProjectStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this project.
     * </p>
     * 
     * @return The list of tag keys and values associated with this project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this project.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this project.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Project#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Project addTagsEntry(String key, String value) {
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

    public Project clearTagsEntries() {
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
        if (getActiveExperimentCount() != null)
            sb.append("ActiveExperimentCount: ").append(getActiveExperimentCount()).append(",");
        if (getActiveLaunchCount() != null)
            sb.append("ActiveLaunchCount: ").append(getActiveLaunchCount()).append(",");
        if (getAppConfigResource() != null)
            sb.append("AppConfigResource: ").append(getAppConfigResource()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDataDelivery() != null)
            sb.append("DataDelivery: ").append(getDataDelivery()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExperimentCount() != null)
            sb.append("ExperimentCount: ").append(getExperimentCount()).append(",");
        if (getFeatureCount() != null)
            sb.append("FeatureCount: ").append(getFeatureCount()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLaunchCount() != null)
            sb.append("LaunchCount: ").append(getLaunchCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof Project == false)
            return false;
        Project other = (Project) obj;
        if (other.getActiveExperimentCount() == null ^ this.getActiveExperimentCount() == null)
            return false;
        if (other.getActiveExperimentCount() != null && other.getActiveExperimentCount().equals(this.getActiveExperimentCount()) == false)
            return false;
        if (other.getActiveLaunchCount() == null ^ this.getActiveLaunchCount() == null)
            return false;
        if (other.getActiveLaunchCount() != null && other.getActiveLaunchCount().equals(this.getActiveLaunchCount()) == false)
            return false;
        if (other.getAppConfigResource() == null ^ this.getAppConfigResource() == null)
            return false;
        if (other.getAppConfigResource() != null && other.getAppConfigResource().equals(this.getAppConfigResource()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDataDelivery() == null ^ this.getDataDelivery() == null)
            return false;
        if (other.getDataDelivery() != null && other.getDataDelivery().equals(this.getDataDelivery()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExperimentCount() == null ^ this.getExperimentCount() == null)
            return false;
        if (other.getExperimentCount() != null && other.getExperimentCount().equals(this.getExperimentCount()) == false)
            return false;
        if (other.getFeatureCount() == null ^ this.getFeatureCount() == null)
            return false;
        if (other.getFeatureCount() != null && other.getFeatureCount().equals(this.getFeatureCount()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLaunchCount() == null ^ this.getLaunchCount() == null)
            return false;
        if (other.getLaunchCount() != null && other.getLaunchCount().equals(this.getLaunchCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getActiveExperimentCount() == null) ? 0 : getActiveExperimentCount().hashCode());
        hashCode = prime * hashCode + ((getActiveLaunchCount() == null) ? 0 : getActiveLaunchCount().hashCode());
        hashCode = prime * hashCode + ((getAppConfigResource() == null) ? 0 : getAppConfigResource().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDataDelivery() == null) ? 0 : getDataDelivery().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExperimentCount() == null) ? 0 : getExperimentCount().hashCode());
        hashCode = prime * hashCode + ((getFeatureCount() == null) ? 0 : getFeatureCount().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLaunchCount() == null) ? 0 : getLaunchCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Project clone() {
        try {
            return (Project) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ProjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
