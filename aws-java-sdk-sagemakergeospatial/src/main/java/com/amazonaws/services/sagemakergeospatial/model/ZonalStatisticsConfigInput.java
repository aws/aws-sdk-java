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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ZonalStatisticsConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZonalStatisticsConfigInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private java.util.List<String> statistics;
    /** <p/> */
    private java.util.List<String> targetBands;
    /** <p/> */
    private String zoneS3Path;

    /**
     * <p/>
     * 
     * @return
     * @see ZonalStatistics
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p/>
     * 
     * @param statistics
     * @see ZonalStatistics
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
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(String... statistics) {
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
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p/>
     * 
     * @param statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(ZonalStatistics... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (ZonalStatistics value : statistics) {
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

    public ZonalStatisticsConfigInput withTargetBands(String... targetBands) {
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

    public ZonalStatisticsConfigInput withTargetBands(java.util.Collection<String> targetBands) {
        setTargetBands(targetBands);
        return this;
    }

    /**
     * <p/>
     * 
     * @param zoneS3Path
     */

    public void setZoneS3Path(String zoneS3Path) {
        this.zoneS3Path = zoneS3Path;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getZoneS3Path() {
        return this.zoneS3Path;
    }

    /**
     * <p/>
     * 
     * @param zoneS3Path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalStatisticsConfigInput withZoneS3Path(String zoneS3Path) {
        setZoneS3Path(zoneS3Path);
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
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTargetBands() != null)
            sb.append("TargetBands: ").append(getTargetBands()).append(",");
        if (getZoneS3Path() != null)
            sb.append("ZoneS3Path: ").append(getZoneS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZonalStatisticsConfigInput == false)
            return false;
        ZonalStatisticsConfigInput other = (ZonalStatisticsConfigInput) obj;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTargetBands() == null ^ this.getTargetBands() == null)
            return false;
        if (other.getTargetBands() != null && other.getTargetBands().equals(this.getTargetBands()) == false)
            return false;
        if (other.getZoneS3Path() == null ^ this.getZoneS3Path() == null)
            return false;
        if (other.getZoneS3Path() != null && other.getZoneS3Path().equals(this.getZoneS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTargetBands() == null) ? 0 : getTargetBands().hashCode());
        hashCode = prime * hashCode + ((getZoneS3Path() == null) ? 0 : getZoneS3Path().hashCode());
        return hashCode;
    }

    @Override
    public ZonalStatisticsConfigInput clone() {
        try {
            return (ZonalStatisticsConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ZonalStatisticsConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
