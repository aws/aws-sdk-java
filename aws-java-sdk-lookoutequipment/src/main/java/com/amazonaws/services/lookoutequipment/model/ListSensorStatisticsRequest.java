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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListSensorStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSensorStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset associated with the list of Sensor Statistics.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a particular
     * ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     * </p>
     */
    private String ingestionJobId;
    /**
     * <p>
     * Specifies the maximum number of sensors for which to retrieve statistics.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of sensor statistics.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the dataset associated with the list of Sensor Statistics.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset associated with the list of Sensor Statistics.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset associated with the list of Sensor Statistics.
     * </p>
     * 
     * @return The name of the dataset associated with the list of Sensor Statistics.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset associated with the list of Sensor Statistics.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset associated with the list of Sensor Statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a particular
     * ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     * </p>
     * 
     * @param ingestionJobId
     *        The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a
     *        particular ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     */

    public void setIngestionJobId(String ingestionJobId) {
        this.ingestionJobId = ingestionJobId;
    }

    /**
     * <p>
     * The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a particular
     * ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     * </p>
     * 
     * @return The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a
     *         particular ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     */

    public String getIngestionJobId() {
        return this.ingestionJobId;
    }

    /**
     * <p>
     * The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a particular
     * ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     * </p>
     * 
     * @param ingestionJobId
     *        The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a
     *        particular ingestion job id, both dataset name and ingestion job id must be submitted as inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsRequest withIngestionJobId(String ingestionJobId) {
        setIngestionJobId(ingestionJobId);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of sensors for which to retrieve statistics.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of sensors for which to retrieve statistics.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of sensors for which to retrieve statistics.
     * </p>
     * 
     * @return Specifies the maximum number of sensors for which to retrieve statistics.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of sensors for which to retrieve statistics.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of sensors for which to retrieve statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSensorStatisticsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListSensorStatisticsRequest withNextToken(String nextToken) {
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getIngestionJobId() != null)
            sb.append("IngestionJobId: ").append(getIngestionJobId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListSensorStatisticsRequest == false)
            return false;
        ListSensorStatisticsRequest other = (ListSensorStatisticsRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getIngestionJobId() == null ^ this.getIngestionJobId() == null)
            return false;
        if (other.getIngestionJobId() != null && other.getIngestionJobId().equals(this.getIngestionJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getIngestionJobId() == null) ? 0 : getIngestionJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSensorStatisticsRequest clone() {
        return (ListSensorStatisticsRequest) super.clone();
    }

}
