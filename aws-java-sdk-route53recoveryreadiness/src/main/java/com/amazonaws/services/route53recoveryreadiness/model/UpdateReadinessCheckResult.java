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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReadinessCheckResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a readiness check.
     * </p>
     */
    private String readinessCheckArn;
    /**
     * <p>
     * Name of a readiness check.
     * </p>
     */
    private String readinessCheckName;
    /**
     * <p>
     * Name of the resource set to be checked.
     * </p>
     */
    private String resourceSet;

    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a readiness check.
     * </p>
     * 
     * @param readinessCheckArn
     *        The Amazon Resource Name (ARN) associated with a readiness check.
     */

    public void setReadinessCheckArn(String readinessCheckArn) {
        this.readinessCheckArn = readinessCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a readiness check.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with a readiness check.
     */

    public String getReadinessCheckArn() {
        return this.readinessCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a readiness check.
     * </p>
     * 
     * @param readinessCheckArn
     *        The Amazon Resource Name (ARN) associated with a readiness check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckResult withReadinessCheckArn(String readinessCheckArn) {
        setReadinessCheckArn(readinessCheckArn);
        return this;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @param readinessCheckName
     *        Name of a readiness check.
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @return Name of a readiness check.
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @param readinessCheckName
     *        Name of a readiness check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckResult withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
        return this;
    }

    /**
     * <p>
     * Name of the resource set to be checked.
     * </p>
     * 
     * @param resourceSet
     *        Name of the resource set to be checked.
     */

    public void setResourceSet(String resourceSet) {
        this.resourceSet = resourceSet;
    }

    /**
     * <p>
     * Name of the resource set to be checked.
     * </p>
     * 
     * @return Name of the resource set to be checked.
     */

    public String getResourceSet() {
        return this.resourceSet;
    }

    /**
     * <p>
     * Name of the resource set to be checked.
     * </p>
     * 
     * @param resourceSet
     *        Name of the resource set to be checked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckResult withResourceSet(String resourceSet) {
        setResourceSet(resourceSet);
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

    public UpdateReadinessCheckResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateReadinessCheckResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckResult addTagsEntry(String key, String value) {
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

    public UpdateReadinessCheckResult clearTagsEntries() {
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
        if (getReadinessCheckArn() != null)
            sb.append("ReadinessCheckArn: ").append(getReadinessCheckArn()).append(",");
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName()).append(",");
        if (getResourceSet() != null)
            sb.append("ResourceSet: ").append(getResourceSet()).append(",");
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

        if (obj instanceof UpdateReadinessCheckResult == false)
            return false;
        UpdateReadinessCheckResult other = (UpdateReadinessCheckResult) obj;
        if (other.getReadinessCheckArn() == null ^ this.getReadinessCheckArn() == null)
            return false;
        if (other.getReadinessCheckArn() != null && other.getReadinessCheckArn().equals(this.getReadinessCheckArn()) == false)
            return false;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        if (other.getResourceSet() == null ^ this.getResourceSet() == null)
            return false;
        if (other.getResourceSet() != null && other.getResourceSet().equals(this.getResourceSet()) == false)
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

        hashCode = prime * hashCode + ((getReadinessCheckArn() == null) ? 0 : getReadinessCheckArn().hashCode());
        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceSet() == null) ? 0 : getResourceSet().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReadinessCheckResult clone() {
        try {
            return (UpdateReadinessCheckResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
