/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateWorldTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorldTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the world template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (arn) of the world template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (arn) of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @param name
     *        The name of the world template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @return The name of the world template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @param name
     *        The name of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the world template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the world template was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the world template was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world template was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the world template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorldTemplateResult == false)
            return false;
        UpdateWorldTemplateResult other = (UpdateWorldTemplateResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorldTemplateResult clone() {
        try {
            return (UpdateWorldTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
