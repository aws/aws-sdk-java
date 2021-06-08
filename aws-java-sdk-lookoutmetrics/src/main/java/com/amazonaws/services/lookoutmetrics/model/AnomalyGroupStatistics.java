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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregated statistics for a group of anomalous metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyGroupStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyGroupStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start of the time range that was searched.
     * </p>
     */
    private String evaluationStartDate;
    /**
     * <p>
     * The number of groups found.
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * Statistics for individual metrics within the group.
     * </p>
     */
    private java.util.List<ItemizedMetricStats> itemizedMetricStatsList;

    /**
     * <p>
     * The start of the time range that was searched.
     * </p>
     * 
     * @param evaluationStartDate
     *        The start of the time range that was searched.
     */

    public void setEvaluationStartDate(String evaluationStartDate) {
        this.evaluationStartDate = evaluationStartDate;
    }

    /**
     * <p>
     * The start of the time range that was searched.
     * </p>
     * 
     * @return The start of the time range that was searched.
     */

    public String getEvaluationStartDate() {
        return this.evaluationStartDate;
    }

    /**
     * <p>
     * The start of the time range that was searched.
     * </p>
     * 
     * @param evaluationStartDate
     *        The start of the time range that was searched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupStatistics withEvaluationStartDate(String evaluationStartDate) {
        setEvaluationStartDate(evaluationStartDate);
        return this;
    }

    /**
     * <p>
     * The number of groups found.
     * </p>
     * 
     * @param totalCount
     *        The number of groups found.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The number of groups found.
     * </p>
     * 
     * @return The number of groups found.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The number of groups found.
     * </p>
     * 
     * @param totalCount
     *        The number of groups found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupStatistics withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * Statistics for individual metrics within the group.
     * </p>
     * 
     * @return Statistics for individual metrics within the group.
     */

    public java.util.List<ItemizedMetricStats> getItemizedMetricStatsList() {
        return itemizedMetricStatsList;
    }

    /**
     * <p>
     * Statistics for individual metrics within the group.
     * </p>
     * 
     * @param itemizedMetricStatsList
     *        Statistics for individual metrics within the group.
     */

    public void setItemizedMetricStatsList(java.util.Collection<ItemizedMetricStats> itemizedMetricStatsList) {
        if (itemizedMetricStatsList == null) {
            this.itemizedMetricStatsList = null;
            return;
        }

        this.itemizedMetricStatsList = new java.util.ArrayList<ItemizedMetricStats>(itemizedMetricStatsList);
    }

    /**
     * <p>
     * Statistics for individual metrics within the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItemizedMetricStatsList(java.util.Collection)} or
     * {@link #withItemizedMetricStatsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param itemizedMetricStatsList
     *        Statistics for individual metrics within the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupStatistics withItemizedMetricStatsList(ItemizedMetricStats... itemizedMetricStatsList) {
        if (this.itemizedMetricStatsList == null) {
            setItemizedMetricStatsList(new java.util.ArrayList<ItemizedMetricStats>(itemizedMetricStatsList.length));
        }
        for (ItemizedMetricStats ele : itemizedMetricStatsList) {
            this.itemizedMetricStatsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Statistics for individual metrics within the group.
     * </p>
     * 
     * @param itemizedMetricStatsList
     *        Statistics for individual metrics within the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupStatistics withItemizedMetricStatsList(java.util.Collection<ItemizedMetricStats> itemizedMetricStatsList) {
        setItemizedMetricStatsList(itemizedMetricStatsList);
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
        if (getEvaluationStartDate() != null)
            sb.append("EvaluationStartDate: ").append(getEvaluationStartDate()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getItemizedMetricStatsList() != null)
            sb.append("ItemizedMetricStatsList: ").append(getItemizedMetricStatsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyGroupStatistics == false)
            return false;
        AnomalyGroupStatistics other = (AnomalyGroupStatistics) obj;
        if (other.getEvaluationStartDate() == null ^ this.getEvaluationStartDate() == null)
            return false;
        if (other.getEvaluationStartDate() != null && other.getEvaluationStartDate().equals(this.getEvaluationStartDate()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getItemizedMetricStatsList() == null ^ this.getItemizedMetricStatsList() == null)
            return false;
        if (other.getItemizedMetricStatsList() != null && other.getItemizedMetricStatsList().equals(this.getItemizedMetricStatsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationStartDate() == null) ? 0 : getEvaluationStartDate().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getItemizedMetricStatsList() == null) ? 0 : getItemizedMetricStatsList().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyGroupStatistics clone() {
        try {
            return (AnomalyGroupStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyGroupStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
