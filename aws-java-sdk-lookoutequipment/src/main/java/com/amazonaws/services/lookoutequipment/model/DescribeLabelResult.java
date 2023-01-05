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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeLabel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLabelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the requested label group.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * The ARN of the requested label group.
     * </p>
     */
    private String labelGroupArn;
    /**
     * <p>
     * The ID of the requested label.
     * </p>
     */
    private String labelId;
    /**
     * <p>
     * The start time of the requested label.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the requested label.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Indicates whether a labeled event represents an anomaly.
     * </p>
     */
    private String rating;
    /**
     * <p>
     * Indicates the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private String faultCode;
    /**
     * <p>
     * Metadata providing additional information about the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private String notes;
    /**
     * <p>
     * Indicates that a label pertains to a particular piece of equipment.
     * </p>
     */
    private String equipment;
    /**
     * <p>
     * The time at which the label was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The name of the requested label group.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the requested label group.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * The name of the requested label group.
     * </p>
     * 
     * @return The name of the requested label group.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * The name of the requested label group.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the requested label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * The ARN of the requested label group.
     * </p>
     * 
     * @param labelGroupArn
     *        The ARN of the requested label group.
     */

    public void setLabelGroupArn(String labelGroupArn) {
        this.labelGroupArn = labelGroupArn;
    }

    /**
     * <p>
     * The ARN of the requested label group.
     * </p>
     * 
     * @return The ARN of the requested label group.
     */

    public String getLabelGroupArn() {
        return this.labelGroupArn;
    }

    /**
     * <p>
     * The ARN of the requested label group.
     * </p>
     * 
     * @param labelGroupArn
     *        The ARN of the requested label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withLabelGroupArn(String labelGroupArn) {
        setLabelGroupArn(labelGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the requested label.
     * </p>
     * 
     * @param labelId
     *        The ID of the requested label.
     */

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    /**
     * <p>
     * The ID of the requested label.
     * </p>
     * 
     * @return The ID of the requested label.
     */

    public String getLabelId() {
        return this.labelId;
    }

    /**
     * <p>
     * The ID of the requested label.
     * </p>
     * 
     * @param labelId
     *        The ID of the requested label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withLabelId(String labelId) {
        setLabelId(labelId);
        return this;
    }

    /**
     * <p>
     * The start time of the requested label.
     * </p>
     * 
     * @param startTime
     *        The start time of the requested label.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the requested label.
     * </p>
     * 
     * @return The start time of the requested label.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the requested label.
     * </p>
     * 
     * @param startTime
     *        The start time of the requested label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the requested label.
     * </p>
     * 
     * @param endTime
     *        The end time of the requested label.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the requested label.
     * </p>
     * 
     * @return The end time of the requested label.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the requested label.
     * </p>
     * 
     * @param endTime
     *        The end time of the requested label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether a labeled event represents an anomaly.
     * </p>
     * 
     * @param rating
     *        Indicates whether a labeled event represents an anomaly.
     * @see LabelRating
     */

    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * <p>
     * Indicates whether a labeled event represents an anomaly.
     * </p>
     * 
     * @return Indicates whether a labeled event represents an anomaly.
     * @see LabelRating
     */

    public String getRating() {
        return this.rating;
    }

    /**
     * <p>
     * Indicates whether a labeled event represents an anomaly.
     * </p>
     * 
     * @param rating
     *        Indicates whether a labeled event represents an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelRating
     */

    public DescribeLabelResult withRating(String rating) {
        setRating(rating);
        return this;
    }

    /**
     * <p>
     * Indicates whether a labeled event represents an anomaly.
     * </p>
     * 
     * @param rating
     *        Indicates whether a labeled event represents an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelRating
     */

    public DescribeLabelResult withRating(LabelRating rating) {
        this.rating = rating.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCode
     *        Indicates the type of anomaly associated with the label. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     */

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    /**
     * <p>
     * Indicates the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return Indicates the type of anomaly associated with the label. </p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * <p>
     * Indicates the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCode
     *        Indicates the type of anomaly associated with the label. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withFaultCode(String faultCode) {
        setFaultCode(faultCode);
        return this;
    }

    /**
     * <p>
     * Metadata providing additional information about the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param notes
     *        Metadata providing additional information about the label.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * Metadata providing additional information about the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return Metadata providing additional information about the label.</p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * <p>
     * Metadata providing additional information about the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param notes
     *        Metadata providing additional information about the label.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * Indicates that a label pertains to a particular piece of equipment.
     * </p>
     * 
     * @param equipment
     *        Indicates that a label pertains to a particular piece of equipment.
     */

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * <p>
     * Indicates that a label pertains to a particular piece of equipment.
     * </p>
     * 
     * @return Indicates that a label pertains to a particular piece of equipment.
     */

    public String getEquipment() {
        return this.equipment;
    }

    /**
     * <p>
     * Indicates that a label pertains to a particular piece of equipment.
     * </p>
     * 
     * @param equipment
     *        Indicates that a label pertains to a particular piece of equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withEquipment(String equipment) {
        setEquipment(equipment);
        return this;
    }

    /**
     * <p>
     * The time at which the label was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the label was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the label was created.
     * </p>
     * 
     * @return The time at which the label was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the label was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the label was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getLabelId() != null)
            sb.append("LabelId: ").append(getLabelId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getRating() != null)
            sb.append("Rating: ").append(getRating()).append(",");
        if (getFaultCode() != null)
            sb.append("FaultCode: ").append(getFaultCode()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getEquipment() != null)
            sb.append("Equipment: ").append(getEquipment()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLabelResult == false)
            return false;
        DescribeLabelResult other = (DescribeLabelResult) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getLabelGroupArn() == null ^ this.getLabelGroupArn() == null)
            return false;
        if (other.getLabelGroupArn() != null && other.getLabelGroupArn().equals(this.getLabelGroupArn()) == false)
            return false;
        if (other.getLabelId() == null ^ this.getLabelId() == null)
            return false;
        if (other.getLabelId() != null && other.getLabelId().equals(this.getLabelId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRating() == null ^ this.getRating() == null)
            return false;
        if (other.getRating() != null && other.getRating().equals(this.getRating()) == false)
            return false;
        if (other.getFaultCode() == null ^ this.getFaultCode() == null)
            return false;
        if (other.getFaultCode() != null && other.getFaultCode().equals(this.getFaultCode()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getEquipment() == null ^ this.getEquipment() == null)
            return false;
        if (other.getEquipment() != null && other.getEquipment().equals(this.getEquipment()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getLabelGroupArn() == null) ? 0 : getLabelGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLabelId() == null) ? 0 : getLabelId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRating() == null) ? 0 : getRating().hashCode());
        hashCode = prime * hashCode + ((getFaultCode() == null) ? 0 : getFaultCode().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getEquipment() == null) ? 0 : getEquipment().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLabelResult clone() {
        try {
            return (DescribeLabelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
