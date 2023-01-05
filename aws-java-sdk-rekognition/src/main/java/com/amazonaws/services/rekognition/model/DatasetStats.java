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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides statistics about a dataset. For more information, see <a>DescribeDataset</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     */
    private Integer labeledEntries;
    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     */
    private Integer totalEntries;
    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     */
    private Integer totalLabels;
    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     */
    private Integer errorEntries;

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * 
     * @param labeledEntries
     *        The total number of images in the dataset that have labels.
     */

    public void setLabeledEntries(Integer labeledEntries) {
        this.labeledEntries = labeledEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * 
     * @return The total number of images in the dataset that have labels.
     */

    public Integer getLabeledEntries() {
        return this.labeledEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * 
     * @param labeledEntries
     *        The total number of images in the dataset that have labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetStats withLabeledEntries(Integer labeledEntries) {
        setLabeledEntries(labeledEntries);
        return this;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @param totalEntries
     *        The total number of images in the dataset.
     */

    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @return The total number of images in the dataset.
     */

    public Integer getTotalEntries() {
        return this.totalEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @param totalEntries
     *        The total number of images in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetStats withTotalEntries(Integer totalEntries) {
        setTotalEntries(totalEntries);
        return this;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * 
     * @param totalLabels
     *        The total number of labels declared in the dataset.
     */

    public void setTotalLabels(Integer totalLabels) {
        this.totalLabels = totalLabels;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * 
     * @return The total number of labels declared in the dataset.
     */

    public Integer getTotalLabels() {
        return this.totalLabels;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * 
     * @param totalLabels
     *        The total number of labels declared in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetStats withTotalLabels(Integer totalLabels) {
        setTotalLabels(totalLabels);
        return this;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * 
     * @param errorEntries
     *        The total number of entries that contain at least one error.
     */

    public void setErrorEntries(Integer errorEntries) {
        this.errorEntries = errorEntries;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * 
     * @return The total number of entries that contain at least one error.
     */

    public Integer getErrorEntries() {
        return this.errorEntries;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * 
     * @param errorEntries
     *        The total number of entries that contain at least one error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetStats withErrorEntries(Integer errorEntries) {
        setErrorEntries(errorEntries);
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
        if (getLabeledEntries() != null)
            sb.append("LabeledEntries: ").append(getLabeledEntries()).append(",");
        if (getTotalEntries() != null)
            sb.append("TotalEntries: ").append(getTotalEntries()).append(",");
        if (getTotalLabels() != null)
            sb.append("TotalLabels: ").append(getTotalLabels()).append(",");
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: ").append(getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetStats == false)
            return false;
        DatasetStats other = (DatasetStats) obj;
        if (other.getLabeledEntries() == null ^ this.getLabeledEntries() == null)
            return false;
        if (other.getLabeledEntries() != null && other.getLabeledEntries().equals(this.getLabeledEntries()) == false)
            return false;
        if (other.getTotalEntries() == null ^ this.getTotalEntries() == null)
            return false;
        if (other.getTotalEntries() != null && other.getTotalEntries().equals(this.getTotalEntries()) == false)
            return false;
        if (other.getTotalLabels() == null ^ this.getTotalLabels() == null)
            return false;
        if (other.getTotalLabels() != null && other.getTotalLabels().equals(this.getTotalLabels()) == false)
            return false;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabeledEntries() == null) ? 0 : getLabeledEntries().hashCode());
        hashCode = prime * hashCode + ((getTotalEntries() == null) ? 0 : getTotalEntries().hashCode());
        hashCode = prime * hashCode + ((getTotalLabels() == null) ? 0 : getTotalLabels().hashCode());
        hashCode = prime * hashCode + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public DatasetStats clone() {
        try {
            return (DatasetStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
