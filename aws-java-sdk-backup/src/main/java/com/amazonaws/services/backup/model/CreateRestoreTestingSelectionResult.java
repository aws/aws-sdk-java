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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateRestoreTestingSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreTestingSelectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * This is the time the resource testing selection was created successfully.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * This is the ARN of the restore testing plan with which the restore testing selection is associated.
     * </p>
     */
    private String restoreTestingPlanArn;
    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     */
    private String restoreTestingSelectionName;

    /**
     * <p>
     * This is the time the resource testing selection was created successfully.
     * </p>
     * 
     * @param creationTime
     *        This is the time the resource testing selection was created successfully.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * This is the time the resource testing selection was created successfully.
     * </p>
     * 
     * @return This is the time the resource testing selection was created successfully.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * This is the time the resource testing selection was created successfully.
     * </p>
     * 
     * @param creationTime
     *        This is the time the resource testing selection was created successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * This is the ARN of the restore testing plan with which the restore testing selection is associated.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        This is the ARN of the restore testing plan with which the restore testing selection is associated.
     */

    public void setRestoreTestingPlanArn(String restoreTestingPlanArn) {
        this.restoreTestingPlanArn = restoreTestingPlanArn;
    }

    /**
     * <p>
     * This is the ARN of the restore testing plan with which the restore testing selection is associated.
     * </p>
     * 
     * @return This is the ARN of the restore testing plan with which the restore testing selection is associated.
     */

    public String getRestoreTestingPlanArn() {
        return this.restoreTestingPlanArn;
    }

    /**
     * <p>
     * This is the ARN of the restore testing plan with which the restore testing selection is associated.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        This is the ARN of the restore testing plan with which the restore testing selection is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionResult withRestoreTestingPlanArn(String restoreTestingPlanArn) {
        setRestoreTestingPlanArn(restoreTestingPlanArn);
        return this;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Unique string that is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @return Unique string that is the name of the restore testing plan.</p>
     *         <p>
     *         The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *         underscores. Maximum length is 50.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Unique string that is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionResult withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     */

    public void setRestoreTestingSelectionName(String restoreTestingSelectionName) {
        this.restoreTestingSelectionName = restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @return This is the unique name of the restore testing selection that belongs to the related restore testing
     *         plan.
     */

    public String getRestoreTestingSelectionName() {
        return this.restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionResult withRestoreTestingSelectionName(String restoreTestingSelectionName) {
        setRestoreTestingSelectionName(restoreTestingSelectionName);
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
        if (getRestoreTestingSelectionName() != null)
            sb.append("RestoreTestingSelectionName: ").append(getRestoreTestingSelectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestoreTestingSelectionResult == false)
            return false;
        CreateRestoreTestingSelectionResult other = (CreateRestoreTestingSelectionResult) obj;
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
        if (other.getRestoreTestingSelectionName() == null ^ this.getRestoreTestingSelectionName() == null)
            return false;
        if (other.getRestoreTestingSelectionName() != null && other.getRestoreTestingSelectionName().equals(this.getRestoreTestingSelectionName()) == false)
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
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestoreTestingSelectionResult clone() {
        try {
            return (CreateRestoreTestingSelectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
