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
 * Statistics about a label used in a dataset. For more information, see <a>DatasetLabelDescription</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetLabelStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     */
    private Integer entryCount;
    /**
     * <p>
     * The total number of images that have the label assigned to a bounding box.
     * </p>
     */
    private Integer boundingBoxCount;

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * 
     * @param entryCount
     *        The total number of images that use the label.
     */

    public void setEntryCount(Integer entryCount) {
        this.entryCount = entryCount;
    }

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * 
     * @return The total number of images that use the label.
     */

    public Integer getEntryCount() {
        return this.entryCount;
    }

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * 
     * @param entryCount
     *        The total number of images that use the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetLabelStats withEntryCount(Integer entryCount) {
        setEntryCount(entryCount);
        return this;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding box.
     * </p>
     * 
     * @param boundingBoxCount
     *        The total number of images that have the label assigned to a bounding box.
     */

    public void setBoundingBoxCount(Integer boundingBoxCount) {
        this.boundingBoxCount = boundingBoxCount;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding box.
     * </p>
     * 
     * @return The total number of images that have the label assigned to a bounding box.
     */

    public Integer getBoundingBoxCount() {
        return this.boundingBoxCount;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding box.
     * </p>
     * 
     * @param boundingBoxCount
     *        The total number of images that have the label assigned to a bounding box.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetLabelStats withBoundingBoxCount(Integer boundingBoxCount) {
        setBoundingBoxCount(boundingBoxCount);
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
        if (getEntryCount() != null)
            sb.append("EntryCount: ").append(getEntryCount()).append(",");
        if (getBoundingBoxCount() != null)
            sb.append("BoundingBoxCount: ").append(getBoundingBoxCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetLabelStats == false)
            return false;
        DatasetLabelStats other = (DatasetLabelStats) obj;
        if (other.getEntryCount() == null ^ this.getEntryCount() == null)
            return false;
        if (other.getEntryCount() != null && other.getEntryCount().equals(this.getEntryCount()) == false)
            return false;
        if (other.getBoundingBoxCount() == null ^ this.getBoundingBoxCount() == null)
            return false;
        if (other.getBoundingBoxCount() != null && other.getBoundingBoxCount().equals(this.getBoundingBoxCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryCount() == null) ? 0 : getEntryCount().hashCode());
        hashCode = prime * hashCode + ((getBoundingBoxCount() == null) ? 0 : getBoundingBoxCount().hashCode());
        return hashCode;
    }

    @Override
    public DatasetLabelStats clone() {
        try {
            return (DatasetLabelStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetLabelStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
