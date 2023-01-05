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
 * Describes a dataset label. For more information, see <a>ListDatasetLabels</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetLabelDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the label.
     * </p>
     */
    private String labelName;
    /**
     * <p>
     * Statistics about the label.
     * </p>
     */
    private DatasetLabelStats labelStats;

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @param labelName
     *        The name of the label.
     */

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @return The name of the label.
     */

    public String getLabelName() {
        return this.labelName;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @param labelName
     *        The name of the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetLabelDescription withLabelName(String labelName) {
        setLabelName(labelName);
        return this;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     * 
     * @param labelStats
     *        Statistics about the label.
     */

    public void setLabelStats(DatasetLabelStats labelStats) {
        this.labelStats = labelStats;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     * 
     * @return Statistics about the label.
     */

    public DatasetLabelStats getLabelStats() {
        return this.labelStats;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     * 
     * @param labelStats
     *        Statistics about the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetLabelDescription withLabelStats(DatasetLabelStats labelStats) {
        setLabelStats(labelStats);
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
        if (getLabelName() != null)
            sb.append("LabelName: ").append(getLabelName()).append(",");
        if (getLabelStats() != null)
            sb.append("LabelStats: ").append(getLabelStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetLabelDescription == false)
            return false;
        DatasetLabelDescription other = (DatasetLabelDescription) obj;
        if (other.getLabelName() == null ^ this.getLabelName() == null)
            return false;
        if (other.getLabelName() != null && other.getLabelName().equals(this.getLabelName()) == false)
            return false;
        if (other.getLabelStats() == null ^ this.getLabelStats() == null)
            return false;
        if (other.getLabelStats() != null && other.getLabelStats().equals(this.getLabelStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        hashCode = prime * hashCode + ((getLabelStats() == null) ? 0 : getLabelStats().hashCode());
        return hashCode;
    }

    @Override
    public DatasetLabelDescription clone() {
        try {
            return (DatasetLabelDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetLabelDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
