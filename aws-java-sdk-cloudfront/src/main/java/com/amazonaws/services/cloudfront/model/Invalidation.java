/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class Invalidation implements Serializable, Cloneable {

    private String id;

    private String status;

    private java.util.Date createTime;

    private InvalidationBatch invalidationBatch;

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Invalidation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Invalidation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return
     */
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Invalidation withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * @param invalidationBatch
     */
    public void setInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
    }

    /**
     * @return
     */
    public InvalidationBatch getInvalidationBatch() {
        return this.invalidationBatch;
    }

    /**
     * @param invalidationBatch
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Invalidation withInvalidationBatch(
            InvalidationBatch invalidationBatch) {
        setInvalidationBatch(invalidationBatch);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getInvalidationBatch() != null)
            sb.append("InvalidationBatch: " + getInvalidationBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invalidation == false)
            return false;
        Invalidation other = (Invalidation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getInvalidationBatch() == null
                ^ this.getInvalidationBatch() == null)
            return false;
        if (other.getInvalidationBatch() != null
                && other.getInvalidationBatch().equals(
                        this.getInvalidationBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getInvalidationBatch() == null) ? 0
                        : getInvalidationBatch().hashCode());
        return hashCode;
    }

    @Override
    public Invalidation clone() {
        try {
            return (Invalidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}