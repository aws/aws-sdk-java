/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the dataset group properties used in the <a>ListDatasetGroups</a> operation. To get the
 * complete set of properties, call the <a>DescribeDatasetGroup</a> operation, and provide the
 * <code>DatasetGroupArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DatasetGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The name of the dataset group.
     * </p>
     */
    private String datasetGroupName;
    /**
     * <p>
     * When the dataset group was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasetGroups</code> call.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetGroupSummary withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        The name of the dataset group.
     */

    public void setDatasetGroupName(String datasetGroupName) {
        this.datasetGroupName = datasetGroupName;
    }

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @return The name of the dataset group.
     */

    public String getDatasetGroupName() {
        return this.datasetGroupName;
    }

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        The name of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetGroupSummary withDatasetGroupName(String datasetGroupName) {
        setDatasetGroupName(datasetGroupName);
        return this;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @return When the dataset group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetGroupSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasetGroups</code> call.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation.
     *        While the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     *        <code>ListDatasetGroups</code> call.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasetGroups</code> call.
     * </p>
     * 
     * @return When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a>
     *         operation. While the dataset group is being updated, <code>LastModificationTime</code> is the current
     *         time of the <code>ListDatasetGroups</code> call.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasetGroups</code> call.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation.
     *        While the dataset group is being updated, <code>LastModificationTime</code> is the current time of the
     *        <code>ListDatasetGroups</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetGroupSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDatasetGroupName() != null)
            sb.append("DatasetGroupName: ").append(getDatasetGroupName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetGroupSummary == false)
            return false;
        DatasetGroupSummary other = (DatasetGroupSummary) obj;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDatasetGroupName() == null ^ this.getDatasetGroupName() == null)
            return false;
        if (other.getDatasetGroupName() != null && other.getDatasetGroupName().equals(this.getDatasetGroupName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupName() == null) ? 0 : getDatasetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetGroupSummary clone() {
        try {
            return (DatasetGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.DatasetGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
