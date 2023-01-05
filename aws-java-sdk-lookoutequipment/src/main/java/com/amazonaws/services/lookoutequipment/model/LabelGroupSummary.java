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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the label group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/LabelGroupSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the label group.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * The ARN of the label group.
     * </p>
     */
    private String labelGroupArn;
    /**
     * <p>
     * The time at which the label group was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the label group was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The name of the label group.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * The name of the label group.
     * </p>
     * 
     * @return The name of the label group.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * The name of the label group.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelGroupSummary withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * The ARN of the label group.
     * </p>
     * 
     * @param labelGroupArn
     *        The ARN of the label group.
     */

    public void setLabelGroupArn(String labelGroupArn) {
        this.labelGroupArn = labelGroupArn;
    }

    /**
     * <p>
     * The ARN of the label group.
     * </p>
     * 
     * @return The ARN of the label group.
     */

    public String getLabelGroupArn() {
        return this.labelGroupArn;
    }

    /**
     * <p>
     * The ARN of the label group.
     * </p>
     * 
     * @param labelGroupArn
     *        The ARN of the label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelGroupSummary withLabelGroupArn(String labelGroupArn) {
        setLabelGroupArn(labelGroupArn);
        return this;
    }

    /**
     * <p>
     * The time at which the label group was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the label group was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the label group was created.
     * </p>
     * 
     * @return The time at which the label group was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the label group was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the label group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelGroupSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the label group was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the label group was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the label group was updated.
     * </p>
     * 
     * @return The time at which the label group was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the label group was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the label group was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelGroupSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getLabelGroupName() != null)
            sb.append("LabelGroupName: ").append(getLabelGroupName()).append(",");
        if (getLabelGroupArn() != null)
            sb.append("LabelGroupArn: ").append(getLabelGroupArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelGroupSummary == false)
            return false;
        LabelGroupSummary other = (LabelGroupSummary) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getLabelGroupArn() == null ^ this.getLabelGroupArn() == null)
            return false;
        if (other.getLabelGroupArn() != null && other.getLabelGroupArn().equals(this.getLabelGroupArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getLabelGroupArn() == null) ? 0 : getLabelGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public LabelGroupSummary clone() {
        try {
            return (LabelGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.LabelGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
