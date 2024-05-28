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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the baseline to be enabled.
     * </p>
     */
    private String baselineIdentifier;
    /**
     * <p>
     * The specific version to be enabled of the specified baseline.
     * </p>
     */
    private String baselineVersion;
    /**
     * <p>
     * Tags associated with input to <code>EnableBaseline</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * The ARN of the baseline to be enabled.
     * </p>
     * 
     * @param baselineIdentifier
     *        The ARN of the baseline to be enabled.
     */

    public void setBaselineIdentifier(String baselineIdentifier) {
        this.baselineIdentifier = baselineIdentifier;
    }

    /**
     * <p>
     * The ARN of the baseline to be enabled.
     * </p>
     * 
     * @return The ARN of the baseline to be enabled.
     */

    public String getBaselineIdentifier() {
        return this.baselineIdentifier;
    }

    /**
     * <p>
     * The ARN of the baseline to be enabled.
     * </p>
     * 
     * @param baselineIdentifier
     *        The ARN of the baseline to be enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineRequest withBaselineIdentifier(String baselineIdentifier) {
        setBaselineIdentifier(baselineIdentifier);
        return this;
    }

    /**
     * <p>
     * The specific version to be enabled of the specified baseline.
     * </p>
     * 
     * @param baselineVersion
     *        The specific version to be enabled of the specified baseline.
     */

    public void setBaselineVersion(String baselineVersion) {
        this.baselineVersion = baselineVersion;
    }

    /**
     * <p>
     * The specific version to be enabled of the specified baseline.
     * </p>
     * 
     * @return The specific version to be enabled of the specified baseline.
     */

    public String getBaselineVersion() {
        return this.baselineVersion;
    }

    /**
     * <p>
     * The specific version to be enabled of the specified baseline.
     * </p>
     * 
     * @param baselineVersion
     *        The specific version to be enabled of the specified baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineRequest withBaselineVersion(String baselineVersion) {
        setBaselineVersion(baselineVersion);
        return this;
    }

    /**
     * <p>
     * Tags associated with input to <code>EnableBaseline</code>.
     * </p>
     * 
     * @return Tags associated with input to <code>EnableBaseline</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with input to <code>EnableBaseline</code>.
     * </p>
     * 
     * @param tags
     *        Tags associated with input to <code>EnableBaseline</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with input to <code>EnableBaseline</code>.
     * </p>
     * 
     * @param tags
     *        Tags associated with input to <code>EnableBaseline</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EnableBaselineRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineRequest addTagsEntry(String key, String value) {
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

    public EnableBaselineRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     * </p>
     * 
     * @return The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the target on which the baseline will be enabled. Only OUs are supported as targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineRequest withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getBaselineIdentifier() != null)
            sb.append("BaselineIdentifier: ").append(getBaselineIdentifier()).append(",");
        if (getBaselineVersion() != null)
            sb.append("BaselineVersion: ").append(getBaselineVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableBaselineRequest == false)
            return false;
        EnableBaselineRequest other = (EnableBaselineRequest) obj;
        if (other.getBaselineIdentifier() == null ^ this.getBaselineIdentifier() == null)
            return false;
        if (other.getBaselineIdentifier() != null && other.getBaselineIdentifier().equals(this.getBaselineIdentifier()) == false)
            return false;
        if (other.getBaselineVersion() == null ^ this.getBaselineVersion() == null)
            return false;
        if (other.getBaselineVersion() != null && other.getBaselineVersion().equals(this.getBaselineVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineIdentifier() == null) ? 0 : getBaselineIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBaselineVersion() == null) ? 0 : getBaselineVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnableBaselineRequest clone() {
        return (EnableBaselineRequest) super.clone();
    }

}
