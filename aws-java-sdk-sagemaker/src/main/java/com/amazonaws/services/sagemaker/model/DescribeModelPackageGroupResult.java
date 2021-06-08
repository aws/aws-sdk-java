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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackageGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackageGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model group.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model group.
     * </p>
     */
    private String modelPackageGroupArn;
    /**
     * <p>
     * A description of the model group.
     * </p>
     */
    private String modelPackageGroupDescription;
    /**
     * <p>
     * The time that the model group was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * The status of the model group.
     * </p>
     */
    private String modelPackageGroupStatus;

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @return The name of the model group.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageGroupResult withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model group.
     * </p>
     * 
     * @param modelPackageGroupArn
     *        The Amazon Resource Name (ARN) of the model group.
     */

    public void setModelPackageGroupArn(String modelPackageGroupArn) {
        this.modelPackageGroupArn = modelPackageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model group.
     */

    public String getModelPackageGroupArn() {
        return this.modelPackageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model group.
     * </p>
     * 
     * @param modelPackageGroupArn
     *        The Amazon Resource Name (ARN) of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageGroupResult withModelPackageGroupArn(String modelPackageGroupArn) {
        setModelPackageGroupArn(modelPackageGroupArn);
        return this;
    }

    /**
     * <p>
     * A description of the model group.
     * </p>
     * 
     * @param modelPackageGroupDescription
     *        A description of the model group.
     */

    public void setModelPackageGroupDescription(String modelPackageGroupDescription) {
        this.modelPackageGroupDescription = modelPackageGroupDescription;
    }

    /**
     * <p>
     * A description of the model group.
     * </p>
     * 
     * @return A description of the model group.
     */

    public String getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription;
    }

    /**
     * <p>
     * A description of the model group.
     * </p>
     * 
     * @param modelPackageGroupDescription
     *        A description of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageGroupResult withModelPackageGroupDescription(String modelPackageGroupDescription) {
        setModelPackageGroupDescription(modelPackageGroupDescription);
        return this;
    }

    /**
     * <p>
     * The time that the model group was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the model group was created.
     * </p>
     * 
     * @return The time that the model group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the model group was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageGroupResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The status of the model group.
     * </p>
     * 
     * @param modelPackageGroupStatus
     *        The status of the model group.
     * @see ModelPackageGroupStatus
     */

    public void setModelPackageGroupStatus(String modelPackageGroupStatus) {
        this.modelPackageGroupStatus = modelPackageGroupStatus;
    }

    /**
     * <p>
     * The status of the model group.
     * </p>
     * 
     * @return The status of the model group.
     * @see ModelPackageGroupStatus
     */

    public String getModelPackageGroupStatus() {
        return this.modelPackageGroupStatus;
    }

    /**
     * <p>
     * The status of the model group.
     * </p>
     * 
     * @param modelPackageGroupStatus
     *        The status of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageGroupStatus
     */

    public DescribeModelPackageGroupResult withModelPackageGroupStatus(String modelPackageGroupStatus) {
        setModelPackageGroupStatus(modelPackageGroupStatus);
        return this;
    }

    /**
     * <p>
     * The status of the model group.
     * </p>
     * 
     * @param modelPackageGroupStatus
     *        The status of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageGroupStatus
     */

    public DescribeModelPackageGroupResult withModelPackageGroupStatus(ModelPackageGroupStatus modelPackageGroupStatus) {
        this.modelPackageGroupStatus = modelPackageGroupStatus.toString();
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
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageGroupArn() != null)
            sb.append("ModelPackageGroupArn: ").append(getModelPackageGroupArn()).append(",");
        if (getModelPackageGroupDescription() != null)
            sb.append("ModelPackageGroupDescription: ").append(getModelPackageGroupDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getModelPackageGroupStatus() != null)
            sb.append("ModelPackageGroupStatus: ").append(getModelPackageGroupStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelPackageGroupResult == false)
            return false;
        DescribeModelPackageGroupResult other = (DescribeModelPackageGroupResult) obj;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageGroupArn() == null ^ this.getModelPackageGroupArn() == null)
            return false;
        if (other.getModelPackageGroupArn() != null && other.getModelPackageGroupArn().equals(this.getModelPackageGroupArn()) == false)
            return false;
        if (other.getModelPackageGroupDescription() == null ^ this.getModelPackageGroupDescription() == null)
            return false;
        if (other.getModelPackageGroupDescription() != null && other.getModelPackageGroupDescription().equals(this.getModelPackageGroupDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getModelPackageGroupStatus() == null ^ this.getModelPackageGroupStatus() == null)
            return false;
        if (other.getModelPackageGroupStatus() != null && other.getModelPackageGroupStatus().equals(this.getModelPackageGroupStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupArn() == null) ? 0 : getModelPackageGroupArn().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupDescription() == null) ? 0 : getModelPackageGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupStatus() == null) ? 0 : getModelPackageGroupStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelPackageGroupResult clone() {
        try {
            return (DescribeModelPackageGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
