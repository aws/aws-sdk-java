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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReadinessCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the readiness check to create.
     * </p>
     */
    private String readinessCheckName;
    /**
     * <p>
     * The name of the resource set to check.
     * </p>
     */
    private String resourceSetName;

    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the readiness check to create.
     * </p>
     * 
     * @param readinessCheckName
     *        The name of the readiness check to create.
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * <p>
     * The name of the readiness check to create.
     * </p>
     * 
     * @return The name of the readiness check to create.
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * <p>
     * The name of the readiness check to create.
     * </p>
     * 
     * @param readinessCheckName
     *        The name of the readiness check to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReadinessCheckRequest withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
        return this;
    }

    /**
     * <p>
     * The name of the resource set to check.
     * </p>
     * 
     * @param resourceSetName
     *        The name of the resource set to check.
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * <p>
     * The name of the resource set to check.
     * </p>
     * 
     * @return The name of the resource set to check.
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * <p>
     * The name of the resource set to check.
     * </p>
     * 
     * @param resourceSetName
     *        The name of the resource set to check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReadinessCheckRequest withResourceSetName(String resourceSetName) {
        setResourceSetName(resourceSetName);
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

    public CreateReadinessCheckRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateReadinessCheckRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReadinessCheckRequest addTagsEntry(String key, String value) {
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

    public CreateReadinessCheckRequest clearTagsEntries() {
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
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName()).append(",");
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName()).append(",");
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

        if (obj instanceof CreateReadinessCheckRequest == false)
            return false;
        CreateReadinessCheckRequest other = (CreateReadinessCheckRequest) obj;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        if (other.getResourceSetName() == null ^ this.getResourceSetName() == null)
            return false;
        if (other.getResourceSetName() != null && other.getResourceSetName().equals(this.getResourceSetName()) == false)
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

        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateReadinessCheckRequest clone() {
        return (CreateReadinessCheckRequest) super.clone();
    }

}
