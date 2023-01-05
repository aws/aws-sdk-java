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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/TemporalStatisticsConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemporalStatisticsConfigInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String groupBy;
    /** <p/> */
    private java.util.List<String> statistics;
    /** <p/> */
    private java.util.List<String> targetBands;

    /**
     * <p/>
     * 
     * @param groupBy
     * @see GroupBy
     */

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p/>
     * 
     * @return
     * @see GroupBy
     */

    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p/>
     * 
     * @param groupBy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupBy
     */

    public TemporalStatisticsConfigInput withGroupBy(String groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p/>
     * 
     * @param groupBy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupBy
     */

    public TemporalStatisticsConfigInput withGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     * @see TemporalStatistics
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p/>
     * 
     * @param statistics
     * @see TemporalStatistics
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalStatistics
     */

    public TemporalStatisticsConfigInput withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalStatistics
     */

    public TemporalStatisticsConfigInput withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p/>
     * 
     * @param statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalStatistics
     */

    public TemporalStatisticsConfigInput withStatistics(TemporalStatistics... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (TemporalStatistics value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getTargetBands() {
        return targetBands;
    }

    /**
     * <p/>
     * 
     * @param targetBands
     */

    public void setTargetBands(java.util.Collection<String> targetBands) {
        if (targetBands == null) {
            this.targetBands = null;
            return;
        }

        this.targetBands = new java.util.ArrayList<String>(targetBands);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetBands(java.util.Collection)} or {@link #withTargetBands(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporalStatisticsConfigInput withTargetBands(String... targetBands) {
        if (this.targetBands == null) {
            setTargetBands(new java.util.ArrayList<String>(targetBands.length));
        }
        for (String ele : targetBands) {
            this.targetBands.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporalStatisticsConfigInput withTargetBands(java.util.Collection<String> targetBands) {
        setTargetBands(targetBands);
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
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTargetBands() != null)
            sb.append("TargetBands: ").append(getTargetBands());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemporalStatisticsConfigInput == false)
            return false;
        TemporalStatisticsConfigInput other = (TemporalStatisticsConfigInput) obj;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTargetBands() == null ^ this.getTargetBands() == null)
            return false;
        if (other.getTargetBands() != null && other.getTargetBands().equals(this.getTargetBands()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTargetBands() == null) ? 0 : getTargetBands().hashCode());
        return hashCode;
    }

    @Override
    public TemporalStatisticsConfigInput clone() {
        try {
            return (TemporalStatisticsConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.TemporalStatisticsConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
