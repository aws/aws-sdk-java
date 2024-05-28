/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for CreateCloudWatchAlarmTemplateResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateCloudWatchAlarmTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudWatchAlarmTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** A cloudwatch alarm template's ARN (Amazon Resource Name) */
    private String arn;

    private String comparisonOperator;

    private java.util.Date createdAt;
    /** The number of datapoints within the evaluation period that must be breaching to trigger the alarm. */
    private Integer datapointsToAlarm;
    /** A resource's optional description. */
    private String description;
    /** The number of periods over which data is compared to the specified threshold. */
    private Integer evaluationPeriods;
    /** A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-` */
    private String groupId;
    /** A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-` */
    private String id;
    /** The name of the metric associated with the alarm. Must be compatible with targetResourceType. */
    private String metricName;

    private java.util.Date modifiedAt;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;
    /** The period, in seconds, over which the specified statistic is applied. */
    private Integer period;

    private String statistic;

    private java.util.Map<String, String> tags;

    private String targetResourceType;
    /** The threshold value to compare with the specified statistic. */
    private Double threshold;

    private String treatMissingData;

    /**
     * A cloudwatch alarm template's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A cloudwatch alarm template's ARN (Amazon Resource Name)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * A cloudwatch alarm template's ARN (Amazon Resource Name)
     * 
     * @return A cloudwatch alarm template's ARN (Amazon Resource Name)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * A cloudwatch alarm template's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A cloudwatch alarm template's ARN (Amazon Resource Name)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param comparisonOperator
     * @see CloudWatchAlarmTemplateComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * @return
     * @see CloudWatchAlarmTemplateComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateComparisonOperator
     */

    public CreateCloudWatchAlarmTemplateResult withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateComparisonOperator
     */

    public CreateCloudWatchAlarmTemplateResult withComparisonOperator(CloudWatchAlarmTemplateComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     * 
     * @param datapointsToAlarm
     *        The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     */

    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     * 
     * @return The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     */

    public Integer getDatapointsToAlarm() {
        return this.datapointsToAlarm;
    }

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     * 
     * @param datapointsToAlarm
     *        The number of datapoints within the evaluation period that must be breaching to trigger the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withDatapointsToAlarm(Integer datapointsToAlarm) {
        setDatapointsToAlarm(datapointsToAlarm);
        return this;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A resource's optional description.
     * 
     * @return A resource's optional description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     * @return The number of periods over which data is compared to the specified threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param groupId
     *        A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @return A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param groupId
     *        A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     * 
     * @param id
     *        A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     * 
     * @return A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     */

    public String getId() {
        return this.id;
    }

    /**
     * A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     * 
     * @param id
     *        A cloudwatch alarm template's id. AWS provided templates have ids that start with `aws-`
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     * 
     * @param metricName
     *        The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     * 
     * @return The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     * 
     * @param metricName
     *        The name of the metric associated with the alarm. Must be compatible with targetResourceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * @param modifiedAt
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * @return
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @param modifiedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @return A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The period, in seconds, over which the specified statistic is applied.
     * 
     * @param period
     *        The period, in seconds, over which the specified statistic is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * The period, in seconds, over which the specified statistic is applied.
     * 
     * @return The period, in seconds, over which the specified statistic is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * The period, in seconds, over which the specified statistic is applied.
     * 
     * @param period
     *        The period, in seconds, over which the specified statistic is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * @param statistic
     * @see CloudWatchAlarmTemplateStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * @return
     * @see CloudWatchAlarmTemplateStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * @param statistic
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateStatistic
     */

    public CreateCloudWatchAlarmTemplateResult withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * @param statistic
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateStatistic
     */

    public CreateCloudWatchAlarmTemplateResult withStatistic(CloudWatchAlarmTemplateStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCloudWatchAlarmTemplateResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult addTagsEntry(String key, String value) {
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

    public CreateCloudWatchAlarmTemplateResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * @param targetResourceType
     * @see CloudWatchAlarmTemplateTargetResourceType
     */

    public void setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
    }

    /**
     * @return
     * @see CloudWatchAlarmTemplateTargetResourceType
     */

    public String getTargetResourceType() {
        return this.targetResourceType;
    }

    /**
     * @param targetResourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateTargetResourceType
     */

    public CreateCloudWatchAlarmTemplateResult withTargetResourceType(String targetResourceType) {
        setTargetResourceType(targetResourceType);
        return this;
    }

    /**
     * @param targetResourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateTargetResourceType
     */

    public CreateCloudWatchAlarmTemplateResult withTargetResourceType(CloudWatchAlarmTemplateTargetResourceType targetResourceType) {
        this.targetResourceType = targetResourceType.toString();
        return this;
    }

    /**
     * The threshold value to compare with the specified statistic.
     * 
     * @param threshold
     *        The threshold value to compare with the specified statistic.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * The threshold value to compare with the specified statistic.
     * 
     * @return The threshold value to compare with the specified statistic.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * The threshold value to compare with the specified statistic.
     * 
     * @param threshold
     *        The threshold value to compare with the specified statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateResult withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * @param treatMissingData
     * @see CloudWatchAlarmTemplateTreatMissingData
     */

    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * @return
     * @see CloudWatchAlarmTemplateTreatMissingData
     */

    public String getTreatMissingData() {
        return this.treatMissingData;
    }

    /**
     * @param treatMissingData
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateTreatMissingData
     */

    public CreateCloudWatchAlarmTemplateResult withTreatMissingData(String treatMissingData) {
        setTreatMissingData(treatMissingData);
        return this;
    }

    /**
     * @param treatMissingData
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchAlarmTemplateTreatMissingData
     */

    public CreateCloudWatchAlarmTemplateResult withTreatMissingData(CloudWatchAlarmTemplateTreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDatapointsToAlarm() != null)
            sb.append("DatapointsToAlarm: ").append(getDatapointsToAlarm()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetResourceType() != null)
            sb.append("TargetResourceType: ").append(getTargetResourceType()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getTreatMissingData() != null)
            sb.append("TreatMissingData: ").append(getTreatMissingData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudWatchAlarmTemplateResult == false)
            return false;
        CreateCloudWatchAlarmTemplateResult other = (CreateCloudWatchAlarmTemplateResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDatapointsToAlarm() == null ^ this.getDatapointsToAlarm() == null)
            return false;
        if (other.getDatapointsToAlarm() != null && other.getDatapointsToAlarm().equals(this.getDatapointsToAlarm()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetResourceType() == null ^ this.getTargetResourceType() == null)
            return false;
        if (other.getTargetResourceType() != null && other.getTargetResourceType().equals(this.getTargetResourceType()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getTreatMissingData() == null ^ this.getTreatMissingData() == null)
            return false;
        if (other.getTreatMissingData() != null && other.getTreatMissingData().equals(this.getTreatMissingData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceType() == null) ? 0 : getTargetResourceType().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudWatchAlarmTemplateResult clone() {
        try {
            return (CreateCloudWatchAlarmTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
