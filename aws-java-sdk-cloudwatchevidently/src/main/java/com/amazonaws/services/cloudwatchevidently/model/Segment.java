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
 * This structure contains information about one audience <i>segment</i>. You can use segments in your experiments and
 * launches to narrow the user sessions used for experiment or launch to only the user sessions that match one or more
 * criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Segment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Segment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the segment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that this segment was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The customer-created description for this segment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of experiments that this segment is used in. This count includes all current experiments, not just
     * those that are currently running.
     * </p>
     */
    private Long experimentCount;
    /**
     * <p>
     * The date and time that this segment was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The number of launches that this segment is used in. This count includes all current launches, not just those
     * that are currently running.
     * </p>
     */
    private Long launchCount;
    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The pattern that defines the attributes to use to evalute whether a user session will be in the segment. For more
     * information about the pattern syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Segment
     * rule pattern syntax</a>.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * The list of tag keys and values associated with this launch.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the segment.
     * </p>
     * 
     * @param arn
     *        The ARN of the segment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the segment.
     * </p>
     * 
     * @return The ARN of the segment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the segment.
     * </p>
     * 
     * @param arn
     *        The ARN of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that this segment was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this segment was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that this segment was created.
     * </p>
     * 
     * @return The date and time that this segment was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that this segment was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this segment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The customer-created description for this segment.
     * </p>
     * 
     * @param description
     *        The customer-created description for this segment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The customer-created description for this segment.
     * </p>
     * 
     * @return The customer-created description for this segment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The customer-created description for this segment.
     * </p>
     * 
     * @param description
     *        The customer-created description for this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of experiments that this segment is used in. This count includes all current experiments, not just
     * those that are currently running.
     * </p>
     * 
     * @param experimentCount
     *        The number of experiments that this segment is used in. This count includes all current experiments, not
     *        just those that are currently running.
     */

    public void setExperimentCount(Long experimentCount) {
        this.experimentCount = experimentCount;
    }

    /**
     * <p>
     * The number of experiments that this segment is used in. This count includes all current experiments, not just
     * those that are currently running.
     * </p>
     * 
     * @return The number of experiments that this segment is used in. This count includes all current experiments, not
     *         just those that are currently running.
     */

    public Long getExperimentCount() {
        return this.experimentCount;
    }

    /**
     * <p>
     * The number of experiments that this segment is used in. This count includes all current experiments, not just
     * those that are currently running.
     * </p>
     * 
     * @param experimentCount
     *        The number of experiments that this segment is used in. This count includes all current experiments, not
     *        just those that are currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withExperimentCount(Long experimentCount) {
        setExperimentCount(experimentCount);
        return this;
    }

    /**
     * <p>
     * The date and time that this segment was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this segment was most recently updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this segment was most recently updated.
     * </p>
     * 
     * @return The date and time that this segment was most recently updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this segment was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this segment was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The number of launches that this segment is used in. This count includes all current launches, not just those
     * that are currently running.
     * </p>
     * 
     * @param launchCount
     *        The number of launches that this segment is used in. This count includes all current launches, not just
     *        those that are currently running.
     */

    public void setLaunchCount(Long launchCount) {
        this.launchCount = launchCount;
    }

    /**
     * <p>
     * The number of launches that this segment is used in. This count includes all current launches, not just those
     * that are currently running.
     * </p>
     * 
     * @return The number of launches that this segment is used in. This count includes all current launches, not just
     *         those that are currently running.
     */

    public Long getLaunchCount() {
        return this.launchCount;
    }

    /**
     * <p>
     * The number of launches that this segment is used in. This count includes all current launches, not just those
     * that are currently running.
     * </p>
     * 
     * @param launchCount
     *        The number of launches that this segment is used in. This count includes all current launches, not just
     *        those that are currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withLaunchCount(Long launchCount) {
        setLaunchCount(launchCount);
        return this;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param name
     *        The name of the segment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @return The name of the segment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param name
     *        The name of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The pattern that defines the attributes to use to evalute whether a user session will be in the segment. For more
     * information about the pattern syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Segment
     * rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern that defines the attributes to use to evalute whether a user session will be in the segment.
     *        For more information about the pattern syntax, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html"
     *        >Segment rule pattern syntax</a>.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern that defines the attributes to use to evalute whether a user session will be in the segment. For more
     * information about the pattern syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Segment
     * rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The pattern that defines the attributes to use to evalute whether a user session will be in the segment.
     *         For more information about the pattern syntax, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html"
     *         >Segment rule pattern syntax</a>.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern that defines the attributes to use to evalute whether a user session will be in the segment. For more
     * information about the pattern syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Segment
     * rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern that defines the attributes to use to evalute whether a user session will be in the segment.
     *        For more information about the pattern syntax, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html"
     *        >Segment rule pattern syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withPattern(String pattern) {
        setPattern(pattern);
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

    public Segment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Segment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Segment addTagsEntry(String key, String value) {
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

    public Segment clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExperimentCount() != null)
            sb.append("ExperimentCount: ").append(getExperimentCount()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLaunchCount() != null)
            sb.append("LaunchCount: ").append(getLaunchCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
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

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;
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
        if (other.getExperimentCount() == null ^ this.getExperimentCount() == null)
            return false;
        if (other.getExperimentCount() != null && other.getExperimentCount().equals(this.getExperimentCount()) == false)
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
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExperimentCount() == null) ? 0 : getExperimentCount().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLaunchCount() == null) ? 0 : getLaunchCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Segment clone() {
        try {
            return (Segment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.SegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
