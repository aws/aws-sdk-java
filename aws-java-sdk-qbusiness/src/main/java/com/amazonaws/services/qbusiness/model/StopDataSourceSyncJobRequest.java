/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StopDataSourceSyncJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDataSourceSyncJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the Amazon Q Business application that the data source is connected to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     */
    private String indexId;

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @return The identifier of the data source connector.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataSourceSyncJobRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application that the data source is connected to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application that the data source is connected to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application that the data source is connected to.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application that the data source is connected to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application that the data source is connected to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application that the data source is connected to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataSourceSyncJobRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the Amazon Q Business data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @return The identifier of the index used with the Amazon Q Business data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the Amazon Q Business data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataSourceSyncJobRequest withIndexId(String indexId) {
        setIndexId(indexId);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDataSourceSyncJobRequest == false)
            return false;
        StopDataSourceSyncJobRequest other = (StopDataSourceSyncJobRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        return hashCode;
    }

    @Override
    public StopDataSourceSyncJobRequest clone() {
        return (StopDataSourceSyncJobRequest) super.clone();
    }

}
