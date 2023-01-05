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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListSensorStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSensorStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such
     * as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate
     * timestamps.
     * </p>
     */
    private java.util.List<SensorStatisticsSummary> sensorStatisticsSummaries;
    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of sensor statistics.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such
     * as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate
     * timestamps.
     * </p>
     * 
     * @return Provides ingestion-based statistics regarding the specified sensor with respect to various validation
     *         types, such as whether data exists, the number and percentage of missing values, and the number and
     *         percentage of duplicate timestamps.
     */

    public java.util.List<SensorStatisticsSummary> getSensorStatisticsSummaries() {
        return sensorStatisticsSummaries;
    }

    /**
     * <p>
     * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such
     * as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate
     * timestamps.
     * </p>
     * 
     * @param sensorStatisticsSummaries
     *        Provides ingestion-based statistics regarding the specified sensor with respect to various validation
     *        types, such as whether data exists, the number and percentage of missing values, and the number and
     *        percentage of duplicate timestamps.
     */

    public void setSensorStatisticsSummaries(java.util.Collection<SensorStatisticsSummary> sensorStatisticsSummaries) {
        if (sensorStatisticsSummaries == null) {
            this.sensorStatisticsSummaries = null;
            return;
        }

        this.sensorStatisticsSummaries = new java.util.ArrayList<SensorStatisticsSummary>(sensorStatisticsSummaries);
    }

    /**
     * <p>
     * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such
     * as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate
     * timestamps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSensorStatisticsSummaries(java.util.Collection)} or
     * {@link #withSensorStatisticsSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sensorStatisticsSummaries
     *        Provides ingestion-based statistics regarding the specified sensor with respect to various validation
     *        types, such as whether data exists, the number and percentage of missing values, and the number and
     *        percentage of duplicate timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsResult withSensorStatisticsSummaries(SensorStatisticsSummary... sensorStatisticsSummaries) {
        if (this.sensorStatisticsSummaries == null) {
            setSensorStatisticsSummaries(new java.util.ArrayList<SensorStatisticsSummary>(sensorStatisticsSummaries.length));
        }
        for (SensorStatisticsSummary ele : sensorStatisticsSummaries) {
            this.sensorStatisticsSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such
     * as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate
     * timestamps.
     * </p>
     * 
     * @param sensorStatisticsSummaries
     *        Provides ingestion-based statistics regarding the specified sensor with respect to various validation
     *        types, such as whether data exists, the number and percentage of missing values, and the number and
     *        percentage of duplicate timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsResult withSensorStatisticsSummaries(java.util.Collection<SensorStatisticsSummary> sensorStatisticsSummaries) {
        setSensorStatisticsSummaries(sensorStatisticsSummaries);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of sensor statistics.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of sensor statistics.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of sensor statistics.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of sensor statistics.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of sensor statistics.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of sensor statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSensorStatisticsSummaries() != null)
            sb.append("SensorStatisticsSummaries: ").append(getSensorStatisticsSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSensorStatisticsResult == false)
            return false;
        ListSensorStatisticsResult other = (ListSensorStatisticsResult) obj;
        if (other.getSensorStatisticsSummaries() == null ^ this.getSensorStatisticsSummaries() == null)
            return false;
        if (other.getSensorStatisticsSummaries() != null && other.getSensorStatisticsSummaries().equals(this.getSensorStatisticsSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSensorStatisticsSummaries() == null) ? 0 : getSensorStatisticsSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSensorStatisticsResult clone() {
        try {
            return (ListSensorStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
