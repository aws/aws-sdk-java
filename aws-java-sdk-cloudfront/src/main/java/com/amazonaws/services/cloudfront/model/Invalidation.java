/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An invalidation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Invalidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Invalidation implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is finished, the status is
     * <code>Completed</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     */
    private InvalidationBatch invalidationBatch;

    /**
     * <p>
     * The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @return The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the invalidation request. For example: <code>IDFDVBD632BHDS5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invalidation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is finished, the status is
     * <code>Completed</code>.
     * </p>
     * 
     * @param status
     *        The status of the invalidation request. When the invalidation batch is finished, the status is
     *        <code>Completed</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is finished, the status is
     * <code>Completed</code>.
     * </p>
     * 
     * @return The status of the invalidation request. When the invalidation batch is finished, the status is
     *         <code>Completed</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is finished, the status is
     * <code>Completed</code>.
     * </p>
     * 
     * @param status
     *        The status of the invalidation request. When the invalidation batch is finished, the status is
     *        <code>Completed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invalidation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     * 
     * @param createTime
     *        The date and time the invalidation request was first made.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     * 
     * @return The date and time the invalidation request was first made.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     * 
     * @param createTime
     *        The date and time the invalidation request was first made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invalidation withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     * 
     * @param invalidationBatch
     *        The current invalidation information for the batch request.
     */

    public void setInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     * 
     * @return The current invalidation information for the batch request.
     */

    public InvalidationBatch getInvalidationBatch() {
        return this.invalidationBatch;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     * 
     * @param invalidationBatch
     *        The current invalidation information for the batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invalidation withInvalidationBatch(InvalidationBatch invalidationBatch) {
        setInvalidationBatch(invalidationBatch);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getInvalidationBatch() != null)
            sb.append("InvalidationBatch: ").append(getInvalidationBatch());
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
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getInvalidationBatch() == null ^ this.getInvalidationBatch() == null)
            return false;
        if (other.getInvalidationBatch() != null && other.getInvalidationBatch().equals(this.getInvalidationBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getInvalidationBatch() == null) ? 0 : getInvalidationBatch().hashCode());
        return hashCode;
    }

    @Override
    public Invalidation clone() {
        try {
            return (Invalidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
