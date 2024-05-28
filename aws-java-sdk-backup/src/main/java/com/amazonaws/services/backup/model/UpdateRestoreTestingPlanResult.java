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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRestoreTestingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRestoreTestingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This is the time the resource testing plan was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Unique ARN (Amazon Resource Name) of the restore testing plan.
     * </p>
     */
    private String restoreTestingPlanArn;
    /**
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * This is the time the update completed for the restore testing plan.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * This is the time the resource testing plan was created.
     * </p>
     * 
     * @param creationTime
     *        This is the time the resource testing plan was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * This is the time the resource testing plan was created.
     * </p>
     * 
     * @return This is the time the resource testing plan was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * This is the time the resource testing plan was created.
     * </p>
     * 
     * @param creationTime
     *        This is the time the resource testing plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Unique ARN (Amazon Resource Name) of the restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        Unique ARN (Amazon Resource Name) of the restore testing plan.
     */

    public void setRestoreTestingPlanArn(String restoreTestingPlanArn) {
        this.restoreTestingPlanArn = restoreTestingPlanArn;
    }

    /**
     * <p>
     * Unique ARN (Amazon Resource Name) of the restore testing plan.
     * </p>
     * 
     * @return Unique ARN (Amazon Resource Name) of the restore testing plan.
     */

    public String getRestoreTestingPlanArn() {
        return this.restoreTestingPlanArn;
    }

    /**
     * <p>
     * Unique ARN (Amazon Resource Name) of the restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        Unique ARN (Amazon Resource Name) of the restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanResult withRestoreTestingPlanArn(String restoreTestingPlanArn) {
        setRestoreTestingPlanArn(restoreTestingPlanArn);
        return this;
    }

    /**
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @return The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *         underscores. Maximum length is 50.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanResult withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * This is the time the update completed for the restore testing plan.
     * </p>
     * 
     * @param updateTime
     *        This is the time the update completed for the restore testing plan.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * This is the time the update completed for the restore testing plan.
     * </p>
     * 
     * @return This is the time the update completed for the restore testing plan.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * This is the time the update completed for the restore testing plan.
     * </p>
     * 
     * @param updateTime
     *        This is the time the update completed for the restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getRestoreTestingPlanArn() != null)
            sb.append("RestoreTestingPlanArn: ").append(getRestoreTestingPlanArn()).append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRestoreTestingPlanResult == false)
            return false;
        UpdateRestoreTestingPlanResult other = (UpdateRestoreTestingPlanResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRestoreTestingPlanArn() == null ^ this.getRestoreTestingPlanArn() == null)
            return false;
        if (other.getRestoreTestingPlanArn() != null && other.getRestoreTestingPlanArn().equals(this.getRestoreTestingPlanArn()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanArn() == null) ? 0 : getRestoreTestingPlanArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRestoreTestingPlanResult clone() {
        try {
            return (UpdateRestoreTestingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
