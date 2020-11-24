/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/GetReportGroupTrend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReportGroupTrendResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ReportGroupTrendStats stats;

    private java.util.List<ReportWithRawData> rawData;

    /**
     * @param stats
     */

    public void setStats(ReportGroupTrendStats stats) {
        this.stats = stats;
    }

    /**
     * @return
     */

    public ReportGroupTrendStats getStats() {
        return this.stats;
    }

    /**
     * @param stats
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendResult withStats(ReportGroupTrendStats stats) {
        setStats(stats);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ReportWithRawData> getRawData() {
        return rawData;
    }

    /**
     * @param rawData
     */

    public void setRawData(java.util.Collection<ReportWithRawData> rawData) {
        if (rawData == null) {
            this.rawData = null;
            return;
        }

        this.rawData = new java.util.ArrayList<ReportWithRawData>(rawData);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRawData(java.util.Collection)} or {@link #withRawData(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rawData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendResult withRawData(ReportWithRawData... rawData) {
        if (this.rawData == null) {
            setRawData(new java.util.ArrayList<ReportWithRawData>(rawData.length));
        }
        for (ReportWithRawData ele : rawData) {
            this.rawData.add(ele);
        }
        return this;
    }

    /**
     * @param rawData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendResult withRawData(java.util.Collection<ReportWithRawData> rawData) {
        setRawData(rawData);
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
        if (getStats() != null)
            sb.append("Stats: ").append(getStats()).append(",");
        if (getRawData() != null)
            sb.append("RawData: ").append(getRawData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReportGroupTrendResult == false)
            return false;
        GetReportGroupTrendResult other = (GetReportGroupTrendResult) obj;
        if (other.getStats() == null ^ this.getStats() == null)
            return false;
        if (other.getStats() != null && other.getStats().equals(this.getStats()) == false)
            return false;
        if (other.getRawData() == null ^ this.getRawData() == null)
            return false;
        if (other.getRawData() != null && other.getRawData().equals(this.getRawData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStats() == null) ? 0 : getStats().hashCode());
        hashCode = prime * hashCode + ((getRawData() == null) ? 0 : getRawData().hashCode());
        return hashCode;
    }

    @Override
    public GetReportGroupTrendResult clone() {
        try {
            return (GetReportGroupTrendResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
