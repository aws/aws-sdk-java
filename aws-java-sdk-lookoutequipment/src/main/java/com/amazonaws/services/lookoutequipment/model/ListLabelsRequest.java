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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Retruns the name of the label group.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * Returns all the labels with a end time equal to or later than the start time given.
     * </p>
     */
    private java.util.Date intervalStartTime;
    /**
     * <p>
     * Returns all labels with a start time earlier than the end time given.
     * </p>
     */
    private java.util.Date intervalEndTime;
    /**
     * <p>
     * Returns labels with a particular fault code.
     * </p>
     */
    private String faultCode;
    /**
     * <p>
     * Lists the labels that pertain to a particular piece of equipment.
     * </p>
     */
    private String equipment;
    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of labels to list.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Retruns the name of the label group.
     * </p>
     * 
     * @param labelGroupName
     *        Retruns the name of the label group.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * Retruns the name of the label group.
     * </p>
     * 
     * @return Retruns the name of the label group.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * Retruns the name of the label group.
     * </p>
     * 
     * @param labelGroupName
     *        Retruns the name of the label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * Returns all the labels with a end time equal to or later than the start time given.
     * </p>
     * 
     * @param intervalStartTime
     *        Returns all the labels with a end time equal to or later than the start time given.
     */

    public void setIntervalStartTime(java.util.Date intervalStartTime) {
        this.intervalStartTime = intervalStartTime;
    }

    /**
     * <p>
     * Returns all the labels with a end time equal to or later than the start time given.
     * </p>
     * 
     * @return Returns all the labels with a end time equal to or later than the start time given.
     */

    public java.util.Date getIntervalStartTime() {
        return this.intervalStartTime;
    }

    /**
     * <p>
     * Returns all the labels with a end time equal to or later than the start time given.
     * </p>
     * 
     * @param intervalStartTime
     *        Returns all the labels with a end time equal to or later than the start time given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withIntervalStartTime(java.util.Date intervalStartTime) {
        setIntervalStartTime(intervalStartTime);
        return this;
    }

    /**
     * <p>
     * Returns all labels with a start time earlier than the end time given.
     * </p>
     * 
     * @param intervalEndTime
     *        Returns all labels with a start time earlier than the end time given.
     */

    public void setIntervalEndTime(java.util.Date intervalEndTime) {
        this.intervalEndTime = intervalEndTime;
    }

    /**
     * <p>
     * Returns all labels with a start time earlier than the end time given.
     * </p>
     * 
     * @return Returns all labels with a start time earlier than the end time given.
     */

    public java.util.Date getIntervalEndTime() {
        return this.intervalEndTime;
    }

    /**
     * <p>
     * Returns all labels with a start time earlier than the end time given.
     * </p>
     * 
     * @param intervalEndTime
     *        Returns all labels with a start time earlier than the end time given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withIntervalEndTime(java.util.Date intervalEndTime) {
        setIntervalEndTime(intervalEndTime);
        return this;
    }

    /**
     * <p>
     * Returns labels with a particular fault code.
     * </p>
     * 
     * @param faultCode
     *        Returns labels with a particular fault code.
     */

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    /**
     * <p>
     * Returns labels with a particular fault code.
     * </p>
     * 
     * @return Returns labels with a particular fault code.
     */

    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * <p>
     * Returns labels with a particular fault code.
     * </p>
     * 
     * @param faultCode
     *        Returns labels with a particular fault code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withFaultCode(String faultCode) {
        setFaultCode(faultCode);
        return this;
    }

    /**
     * <p>
     * Lists the labels that pertain to a particular piece of equipment.
     * </p>
     * 
     * @param equipment
     *        Lists the labels that pertain to a particular piece of equipment.
     */

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * <p>
     * Lists the labels that pertain to a particular piece of equipment.
     * </p>
     * 
     * @return Lists the labels that pertain to a particular piece of equipment.
     */

    public String getEquipment() {
        return this.equipment;
    }

    /**
     * <p>
     * Lists the labels that pertain to a particular piece of equipment.
     * </p>
     * 
     * @param equipment
     *        Lists the labels that pertain to a particular piece of equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withEquipment(String equipment) {
        setEquipment(equipment);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of label groups.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of label groups.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of label groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of labels to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of labels to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of labels to list.
     * </p>
     * 
     * @return Specifies the maximum number of labels to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of labels to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of labels to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getIntervalStartTime() != null)
            sb.append("IntervalStartTime: ").append(getIntervalStartTime()).append(",");
        if (getIntervalEndTime() != null)
            sb.append("IntervalEndTime: ").append(getIntervalEndTime()).append(",");
        if (getFaultCode() != null)
            sb.append("FaultCode: ").append(getFaultCode()).append(",");
        if (getEquipment() != null)
            sb.append("Equipment: ").append(getEquipment()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLabelsRequest == false)
            return false;
        ListLabelsRequest other = (ListLabelsRequest) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getIntervalStartTime() == null ^ this.getIntervalStartTime() == null)
            return false;
        if (other.getIntervalStartTime() != null && other.getIntervalStartTime().equals(this.getIntervalStartTime()) == false)
            return false;
        if (other.getIntervalEndTime() == null ^ this.getIntervalEndTime() == null)
            return false;
        if (other.getIntervalEndTime() != null && other.getIntervalEndTime().equals(this.getIntervalEndTime()) == false)
            return false;
        if (other.getFaultCode() == null ^ this.getFaultCode() == null)
            return false;
        if (other.getFaultCode() != null && other.getFaultCode().equals(this.getFaultCode()) == false)
            return false;
        if (other.getEquipment() == null ^ this.getEquipment() == null)
            return false;
        if (other.getEquipment() != null && other.getEquipment().equals(this.getEquipment()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getIntervalStartTime() == null) ? 0 : getIntervalStartTime().hashCode());
        hashCode = prime * hashCode + ((getIntervalEndTime() == null) ? 0 : getIntervalEndTime().hashCode());
        hashCode = prime * hashCode + ((getFaultCode() == null) ? 0 : getFaultCode().hashCode());
        hashCode = prime * hashCode + ((getEquipment() == null) ? 0 : getEquipment().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLabelsRequest clone() {
        return (ListLabelsRequest) super.clone();
    }

}
