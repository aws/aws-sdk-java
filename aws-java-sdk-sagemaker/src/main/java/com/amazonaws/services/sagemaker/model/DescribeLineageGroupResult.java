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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLineageGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLineageGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lineage group.
     * </p>
     */
    private String lineageGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     */
    private String lineageGroupArn;
    /**
     * <p>
     * The display name of the lineage group.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the lineage group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The creation time of lineage group.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * The last modified time of the lineage group.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;

    /**
     * <p>
     * The name of the lineage group.
     * </p>
     * 
     * @param lineageGroupName
     *        The name of the lineage group.
     */

    public void setLineageGroupName(String lineageGroupName) {
        this.lineageGroupName = lineageGroupName;
    }

    /**
     * <p>
     * The name of the lineage group.
     * </p>
     * 
     * @return The name of the lineage group.
     */

    public String getLineageGroupName() {
        return this.lineageGroupName;
    }

    /**
     * <p>
     * The name of the lineage group.
     * </p>
     * 
     * @param lineageGroupName
     *        The name of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withLineageGroupName(String lineageGroupName) {
        setLineageGroupName(lineageGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group.
     */

    public void setLineageGroupArn(String lineageGroupArn) {
        this.lineageGroupArn = lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lineage group.
     */

    public String getLineageGroupArn() {
        return this.lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withLineageGroupArn(String lineageGroupArn) {
        setLineageGroupArn(lineageGroupArn);
        return this;
    }

    /**
     * <p>
     * The display name of the lineage group.
     * </p>
     * 
     * @param displayName
     *        The display name of the lineage group.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the lineage group.
     * </p>
     * 
     * @return The display name of the lineage group.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the lineage group.
     * </p>
     * 
     * @param displayName
     *        The display name of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the lineage group.
     * </p>
     * 
     * @param description
     *        The description of the lineage group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the lineage group.
     * </p>
     * 
     * @return The description of the lineage group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the lineage group.
     * </p>
     * 
     * @param description
     *        The description of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The creation time of lineage group.
     * </p>
     * 
     * @param creationTime
     *        The creation time of lineage group.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of lineage group.
     * </p>
     * 
     * @return The creation time of lineage group.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of lineage group.
     * </p>
     * 
     * @param creationTime
     *        The creation time of lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeLineageGroupResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The last modified time of the lineage group.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the lineage group.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the lineage group.
     * </p>
     * 
     * @return The last modified time of the lineage group.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the lineage group.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLineageGroupResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getLineageGroupName() != null)
            sb.append("LineageGroupName: ").append(getLineageGroupName()).append(",");
        if (getLineageGroupArn() != null)
            sb.append("LineageGroupArn: ").append(getLineageGroupArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLineageGroupResult == false)
            return false;
        DescribeLineageGroupResult other = (DescribeLineageGroupResult) obj;
        if (other.getLineageGroupName() == null ^ this.getLineageGroupName() == null)
            return false;
        if (other.getLineageGroupName() != null && other.getLineageGroupName().equals(this.getLineageGroupName()) == false)
            return false;
        if (other.getLineageGroupArn() == null ^ this.getLineageGroupArn() == null)
            return false;
        if (other.getLineageGroupArn() != null && other.getLineageGroupArn().equals(this.getLineageGroupArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineageGroupName() == null) ? 0 : getLineageGroupName().hashCode());
        hashCode = prime * hashCode + ((getLineageGroupArn() == null) ? 0 : getLineageGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLineageGroupResult clone() {
        try {
            return (DescribeLineageGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
