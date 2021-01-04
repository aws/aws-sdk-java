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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttackStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAttackStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private TimeRange timeRange;
    /**
     * <p>
     * The data that describes the attacks detected during the time period.
     * </p>
     */
    private java.util.List<AttackStatisticsDataItem> dataItems;

    /**
     * @param timeRange
     */

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * @return
     */

    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * @param timeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttackStatisticsResult withTimeRange(TimeRange timeRange) {
        setTimeRange(timeRange);
        return this;
    }

    /**
     * <p>
     * The data that describes the attacks detected during the time period.
     * </p>
     * 
     * @return The data that describes the attacks detected during the time period.
     */

    public java.util.List<AttackStatisticsDataItem> getDataItems() {
        return dataItems;
    }

    /**
     * <p>
     * The data that describes the attacks detected during the time period.
     * </p>
     * 
     * @param dataItems
     *        The data that describes the attacks detected during the time period.
     */

    public void setDataItems(java.util.Collection<AttackStatisticsDataItem> dataItems) {
        if (dataItems == null) {
            this.dataItems = null;
            return;
        }

        this.dataItems = new java.util.ArrayList<AttackStatisticsDataItem>(dataItems);
    }

    /**
     * <p>
     * The data that describes the attacks detected during the time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataItems(java.util.Collection)} or {@link #withDataItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataItems
     *        The data that describes the attacks detected during the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttackStatisticsResult withDataItems(AttackStatisticsDataItem... dataItems) {
        if (this.dataItems == null) {
            setDataItems(new java.util.ArrayList<AttackStatisticsDataItem>(dataItems.length));
        }
        for (AttackStatisticsDataItem ele : dataItems) {
            this.dataItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data that describes the attacks detected during the time period.
     * </p>
     * 
     * @param dataItems
     *        The data that describes the attacks detected during the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttackStatisticsResult withDataItems(java.util.Collection<AttackStatisticsDataItem> dataItems) {
        setDataItems(dataItems);
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
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange()).append(",");
        if (getDataItems() != null)
            sb.append("DataItems: ").append(getDataItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAttackStatisticsResult == false)
            return false;
        DescribeAttackStatisticsResult other = (DescribeAttackStatisticsResult) obj;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        if (other.getDataItems() == null ^ this.getDataItems() == null)
            return false;
        if (other.getDataItems() != null && other.getDataItems().equals(this.getDataItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        hashCode = prime * hashCode + ((getDataItems() == null) ? 0 : getDataItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAttackStatisticsResult clone() {
        try {
            return (DescribeAttackStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
