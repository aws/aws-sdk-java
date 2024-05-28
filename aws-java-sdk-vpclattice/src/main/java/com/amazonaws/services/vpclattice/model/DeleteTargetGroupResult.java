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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTargetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the target group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry it
     * while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @return The ID of the target group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry it
     * while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry
     *        it while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * @see TargetGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry it
     * while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * </p>
     * 
     * @return The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you
     *         retry it while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * @see TargetGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry it
     * while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry
     *        it while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public DeleteTargetGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry it
     * while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>DELETE_FAILED</code>. However, if you retry
     *        it while the status is <code>DELETE_IN_PROGRESS</code>, the status doesn't change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public DeleteTargetGroupResult withStatus(TargetGroupStatus status) {
        this.status = status.toString();
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTargetGroupResult == false)
            return false;
        DeleteTargetGroupResult other = (DeleteTargetGroupResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTargetGroupResult clone() {
        try {
            return (DeleteTargetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
