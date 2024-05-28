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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateRestoreTestingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreTestingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     * </p>
     */
    private String restoreTestingPlanArn;
    /**
     * <p>
     * This unique string is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     */
    private String restoreTestingPlanName;

    /**
     * <p>
     * The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087AM.
     * </p>
     * 
     * @return The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time
     *         (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     */

    public void setRestoreTestingPlanArn(String restoreTestingPlanArn) {
        this.restoreTestingPlanArn = restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     */

    public String getRestoreTestingPlanArn() {
        return this.restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the created restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanResult withRestoreTestingPlanArn(String restoreTestingPlanArn) {
        setRestoreTestingPlanArn(restoreTestingPlanArn);
        return this;
    }

    /**
     * <p>
     * This unique string is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This unique string is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * This unique string is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @return This unique string is the name of the restore testing plan.</p>
     *         <p>
     *         The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *         underscores. Maximum length is 50.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * This unique string is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name consists of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This unique string is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name consists of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanResult withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
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
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestoreTestingPlanResult == false)
            return false;
        CreateRestoreTestingPlanResult other = (CreateRestoreTestingPlanResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanArn() == null) ? 0 : getRestoreTestingPlanArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestoreTestingPlanResult clone() {
        try {
            return (CreateRestoreTestingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
