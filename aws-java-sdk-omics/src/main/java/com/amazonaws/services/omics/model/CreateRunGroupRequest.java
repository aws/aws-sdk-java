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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateRunGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRunGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum number of CPUs to use in the group.
     * </p>
     */
    private Integer maxCpus;
    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     */
    private Integer maxRuns;
    /**
     * <p>
     * A maximum run time for the group in minutes.
     * </p>
     */
    private Integer maxDuration;
    /**
     * <p>
     * Tags for the group.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The maximum GPUs that can be used by a run group.
     * </p>
     */
    private Integer maxGpus;

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @param name
     *        A name for the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @return A name for the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @param name
     *        A name for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum number of CPUs to use in the group.
     * </p>
     * 
     * @param maxCpus
     *        The maximum number of CPUs to use in the group.
     */

    public void setMaxCpus(Integer maxCpus) {
        this.maxCpus = maxCpus;
    }

    /**
     * <p>
     * The maximum number of CPUs to use in the group.
     * </p>
     * 
     * @return The maximum number of CPUs to use in the group.
     */

    public Integer getMaxCpus() {
        return this.maxCpus;
    }

    /**
     * <p>
     * The maximum number of CPUs to use in the group.
     * </p>
     * 
     * @param maxCpus
     *        The maximum number of CPUs to use in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withMaxCpus(Integer maxCpus) {
        setMaxCpus(maxCpus);
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

    public CreateRunGroupRequest withMaxRuns(Integer maxRuns) {
        setMaxRuns(maxRuns);
        return this;
    }

    /**
     * <p>
     * A maximum run time for the group in minutes.
     * </p>
     * 
     * @param maxDuration
     *        A maximum run time for the group in minutes.
     */

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * A maximum run time for the group in minutes.
     * </p>
     * 
     * @return A maximum run time for the group in minutes.
     */

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * <p>
     * A maximum run time for the group in minutes.
     * </p>
     * 
     * @param maxDuration
     *        A maximum run time for the group in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withMaxDuration(Integer maxDuration) {
        setMaxDuration(maxDuration);
        return this;
    }

    /**
     * <p>
     * Tags for the group.
     * </p>
     * 
     * @return Tags for the group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the group.
     * </p>
     * 
     * @param tags
     *        Tags for the group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the group.
     * </p>
     * 
     * @param tags
     *        Tags for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRunGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest addTagsEntry(String key, String value) {
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

    public CreateRunGroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @return To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The maximum GPUs that can be used by a run group.
     * </p>
     * 
     * @param maxGpus
     *        The maximum GPUs that can be used by a run group.
     */

    public void setMaxGpus(Integer maxGpus) {
        this.maxGpus = maxGpus;
    }

    /**
     * <p>
     * The maximum GPUs that can be used by a run group.
     * </p>
     * 
     * @return The maximum GPUs that can be used by a run group.
     */

    public Integer getMaxGpus() {
        return this.maxGpus;
    }

    /**
     * <p>
     * The maximum GPUs that can be used by a run group.
     * </p>
     * 
     * @param maxGpus
     *        The maximum GPUs that can be used by a run group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRunGroupRequest withMaxGpus(Integer maxGpus) {
        setMaxGpus(maxGpus);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMaxCpus() != null)
            sb.append("MaxCpus: ").append(getMaxCpus()).append(",");
        if (getMaxRuns() != null)
            sb.append("MaxRuns: ").append(getMaxRuns()).append(",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: ").append(getMaxDuration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getMaxGpus() != null)
            sb.append("MaxGpus: ").append(getMaxGpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRunGroupRequest == false)
            return false;
        CreateRunGroupRequest other = (CreateRunGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaxCpus() == null ^ this.getMaxCpus() == null)
            return false;
        if (other.getMaxCpus() != null && other.getMaxCpus().equals(this.getMaxCpus()) == false)
            return false;
        if (other.getMaxRuns() == null ^ this.getMaxRuns() == null)
            return false;
        if (other.getMaxRuns() != null && other.getMaxRuns().equals(this.getMaxRuns()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getMaxGpus() == null ^ this.getMaxGpus() == null)
            return false;
        if (other.getMaxGpus() != null && other.getMaxGpus().equals(this.getMaxGpus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaxCpus() == null) ? 0 : getMaxCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxRuns() == null) ? 0 : getMaxRuns().hashCode());
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getMaxGpus() == null) ? 0 : getMaxGpus().hashCode());
        return hashCode;
    }

    @Override
    public CreateRunGroupRequest clone() {
        return (CreateRunGroupRequest) super.clone();
    }

}
