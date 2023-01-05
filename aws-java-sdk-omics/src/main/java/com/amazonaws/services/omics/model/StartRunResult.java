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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The run's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The run's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The run's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @return The run's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @see RunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @return The run's status.
     * @see RunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public StartRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public StartRunResult withStatus(RunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @return The run's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @param tags
     *        The run's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @param tags
     *        The run's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartRunResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartRunResult addTagsEntry(String key, String value) {
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

    public StartRunResult clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof StartRunResult == false)
            return false;
        StartRunResult other = (StartRunResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartRunResult clone() {
        try {
            return (StartRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
