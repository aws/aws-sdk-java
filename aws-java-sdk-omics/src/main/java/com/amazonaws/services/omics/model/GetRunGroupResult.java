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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRunGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The group's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the group was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The group's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The group's maximum number of CPUs to use.
     * </p>
     */
    private Integer maxCpus;
    /**
     * <p>
     * The group's maximum run duration.
     * </p>
     */
    private Integer maxDuration;
    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     */
    private Integer maxRuns;
    /**
     * <p>
     * The group's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The group's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The group's ARN.
     * </p>
     * 
     * @param arn
     *        The group's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The group's ARN.
     * </p>
     * 
     * @return The group's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The group's ARN.
     * </p>
     * 
     * @param arn
     *        The group's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the group was created.
     * </p>
     * 
     * @param creationTime
     *        When the group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the group was created.
     * </p>
     * 
     * @return When the group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the group was created.
     * </p>
     * 
     * @param creationTime
     *        When the group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @param id
     *        The group's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @return The group's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @param id
     *        The group's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The group's maximum number of CPUs to use.
     * </p>
     * 
     * @param maxCpus
     *        The group's maximum number of CPUs to use.
     */

    public void setMaxCpus(Integer maxCpus) {
        this.maxCpus = maxCpus;
    }

    /**
     * <p>
     * The group's maximum number of CPUs to use.
     * </p>
     * 
     * @return The group's maximum number of CPUs to use.
     */

    public Integer getMaxCpus() {
        return this.maxCpus;
    }

    /**
     * <p>
     * The group's maximum number of CPUs to use.
     * </p>
     * 
     * @param maxCpus
     *        The group's maximum number of CPUs to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withMaxCpus(Integer maxCpus) {
        setMaxCpus(maxCpus);
        return this;
    }

    /**
     * <p>
     * The group's maximum run duration.
     * </p>
     * 
     * @param maxDuration
     *        The group's maximum run duration.
     */

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * The group's maximum run duration.
     * </p>
     * 
     * @return The group's maximum run duration.
     */

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * <p>
     * The group's maximum run duration.
     * </p>
     * 
     * @param maxDuration
     *        The group's maximum run duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withMaxDuration(Integer maxDuration) {
        setMaxDuration(maxDuration);
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @param maxRuns
     *        The maximum number of concurrent runs for the group.
     */

    public void setMaxRuns(Integer maxRuns) {
        this.maxRuns = maxRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @return The maximum number of concurrent runs for the group.
     */

    public Integer getMaxRuns() {
        return this.maxRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @param maxRuns
     *        The maximum number of concurrent runs for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withMaxRuns(Integer maxRuns) {
        setMaxRuns(maxRuns);
        return this;
    }

    /**
     * <p>
     * The group's name.
     * </p>
     * 
     * @param name
     *        The group's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The group's name.
     * </p>
     * 
     * @return The group's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The group's name.
     * </p>
     * 
     * @param name
     *        The group's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The group's tags.
     * </p>
     * 
     * @return The group's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The group's tags.
     * </p>
     * 
     * @param tags
     *        The group's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The group's tags.
     * </p>
     * 
     * @param tags
     *        The group's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetRunGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRunGroupResult addTagsEntry(String key, String value) {
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

    public GetRunGroupResult clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMaxCpus() != null)
            sb.append("MaxCpus: ").append(getMaxCpus()).append(",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: ").append(getMaxDuration()).append(",");
        if (getMaxRuns() != null)
            sb.append("MaxRuns: ").append(getMaxRuns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetRunGroupResult == false)
            return false;
        GetRunGroupResult other = (GetRunGroupResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMaxCpus() == null ^ this.getMaxCpus() == null)
            return false;
        if (other.getMaxCpus() != null && other.getMaxCpus().equals(this.getMaxCpus()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxRuns() == null ^ this.getMaxRuns() == null)
            return false;
        if (other.getMaxRuns() != null && other.getMaxRuns().equals(this.getMaxRuns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMaxCpus() == null) ? 0 : getMaxCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxRuns() == null) ? 0 : getMaxRuns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetRunGroupResult clone() {
        try {
            return (GetRunGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
