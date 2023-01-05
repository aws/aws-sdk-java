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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information about the output file.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListEarthObservationJobOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEarthObservationJobOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The names of the Earth Observation jobs in the list.
     * </p>
     */
    private String name;
    /** <p/> */
    private String operationType;
    /**
     * <p>
     * The status of the list of the Earth Observation jobs.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the list of the Earth Observation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @return The duration of the session, in seconds.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The names of the Earth Observation jobs in the list.
     * </p>
     * 
     * @param name
     *        The names of the Earth Observation jobs in the list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The names of the Earth Observation jobs in the list.
     * </p>
     * 
     * @return The names of the Earth Observation jobs in the list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The names of the Earth Observation jobs in the list.
     * </p>
     * 
     * @param name
     *        The names of the Earth Observation jobs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p/>
     * 
     * @param operationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p/>
     * 
     * @param operationType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The status of the list of the Earth Observation jobs.
     * </p>
     * 
     * @param status
     *        The status of the list of the Earth Observation jobs.
     * @see EarthObservationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the list of the Earth Observation jobs.
     * </p>
     * 
     * @return The status of the list of the Earth Observation jobs.
     * @see EarthObservationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the list of the Earth Observation jobs.
     * </p>
     * 
     * @param status
     *        The status of the list of the Earth Observation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EarthObservationJobStatus
     */

    public ListEarthObservationJobOutputConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the list of the Earth Observation jobs.
     * </p>
     * 
     * @param status
     *        The status of the list of the Earth Observation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EarthObservationJobStatus
     */

    public ListEarthObservationJobOutputConfig withStatus(EarthObservationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @return Each tag consists of a key and a value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListEarthObservationJobOutputConfig#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListEarthObservationJobOutputConfig addTagsEntry(String key, String value) {
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

    public ListEarthObservationJobOutputConfig clearTagsEntries() {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
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

        if (obj instanceof ListEarthObservationJobOutputConfig == false)
            return false;
        ListEarthObservationJobOutputConfig other = (ListEarthObservationJobOutputConfig) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListEarthObservationJobOutputConfig clone() {
        try {
            return (ListEarthObservationJobOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ListEarthObservationJobOutputConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
