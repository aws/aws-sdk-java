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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEdgeConfigurationUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream from which the edge configuration was updated.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was first created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The current sync status of the stream's edge configuration. When you invoke this API, the sync status will be set
     * to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the latest status of
     * the edge configuration.
     * </p>
     */
    private String syncStatus;
    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     */
    private String failedStatusDetails;
    /**
     * <p>
     * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass
     * component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     * </p>
     */
    private EdgeConfig edgeConfig;

    /**
     * <p>
     * The name of the stream from which the edge configuration was updated.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which the edge configuration was updated.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which the edge configuration was updated.
     * </p>
     * 
     * @return The name of the stream from which the edge configuration was updated.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream from which the edge configuration was updated.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which the edge configuration was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was first created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which a stream’s edge configuration was first created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was first created.
     * </p>
     * 
     * @return The timestamp at which a stream’s edge configuration was first created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was first created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which a stream’s edge configuration was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which a stream’s edge configuration was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was last updated.
     * </p>
     * 
     * @return The timestamp at which a stream’s edge configuration was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which a stream’s edge configuration was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which a stream’s edge configuration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration. When you invoke this API, the sync status will be set
     * to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the latest status of
     * the edge configuration.
     * </p>
     * 
     * @param syncStatus
     *        The current sync status of the stream's edge configuration. When you invoke this API, the sync status will
     *        be set to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the
     *        latest status of the edge configuration.
     * @see SyncStatus
     */

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration. When you invoke this API, the sync status will be set
     * to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the latest status of
     * the edge configuration.
     * </p>
     * 
     * @return The current sync status of the stream's edge configuration. When you invoke this API, the sync status
     *         will be set to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get
     *         the latest status of the edge configuration.
     * @see SyncStatus
     */

    public String getSyncStatus() {
        return this.syncStatus;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration. When you invoke this API, the sync status will be set
     * to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the latest status of
     * the edge configuration.
     * </p>
     * 
     * @param syncStatus
     *        The current sync status of the stream's edge configuration. When you invoke this API, the sync status will
     *        be set to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the
     *        latest status of the edge configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncStatus
     */

    public StartEdgeConfigurationUpdateResult withSyncStatus(String syncStatus) {
        setSyncStatus(syncStatus);
        return this;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration. When you invoke this API, the sync status will be set
     * to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the latest status of
     * the edge configuration.
     * </p>
     * 
     * @param syncStatus
     *        The current sync status of the stream's edge configuration. When you invoke this API, the sync status will
     *        be set to the <code>SYNCING</code> state. Use the <code>DescribeEdgeConfiguration</code> API to get the
     *        latest status of the edge configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncStatus
     */

    public StartEdgeConfigurationUpdateResult withSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     * 
     * @param failedStatusDetails
     *        A description of the generated failure status.
     */

    public void setFailedStatusDetails(String failedStatusDetails) {
        this.failedStatusDetails = failedStatusDetails;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     * 
     * @return A description of the generated failure status.
     */

    public String getFailedStatusDetails() {
        return this.failedStatusDetails;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     * 
     * @param failedStatusDetails
     *        A description of the generated failure status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withFailedStatusDetails(String failedStatusDetails) {
        setFailedStatusDetails(failedStatusDetails);
        return this;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass
     * component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     * </p>
     * 
     * @param edgeConfig
     *        A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT
     *        Greengrass component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     */

    public void setEdgeConfig(EdgeConfig edgeConfig) {
        this.edgeConfig = edgeConfig;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass
     * component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     * </p>
     * 
     * @return A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT
     *         Greengrass component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     */

    public EdgeConfig getEdgeConfig() {
        return this.edgeConfig;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass
     * component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     * </p>
     * 
     * @param edgeConfig
     *        A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT
     *        Greengrass component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateResult withEdgeConfig(EdgeConfig edgeConfig) {
        setEdgeConfig(edgeConfig);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getSyncStatus() != null)
            sb.append("SyncStatus: ").append(getSyncStatus()).append(",");
        if (getFailedStatusDetails() != null)
            sb.append("FailedStatusDetails: ").append(getFailedStatusDetails()).append(",");
        if (getEdgeConfig() != null)
            sb.append("EdgeConfig: ").append(getEdgeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEdgeConfigurationUpdateResult == false)
            return false;
        StartEdgeConfigurationUpdateResult other = (StartEdgeConfigurationUpdateResult) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getSyncStatus() == null ^ this.getSyncStatus() == null)
            return false;
        if (other.getSyncStatus() != null && other.getSyncStatus().equals(this.getSyncStatus()) == false)
            return false;
        if (other.getFailedStatusDetails() == null ^ this.getFailedStatusDetails() == null)
            return false;
        if (other.getFailedStatusDetails() != null && other.getFailedStatusDetails().equals(this.getFailedStatusDetails()) == false)
            return false;
        if (other.getEdgeConfig() == null ^ this.getEdgeConfig() == null)
            return false;
        if (other.getEdgeConfig() != null && other.getEdgeConfig().equals(this.getEdgeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getSyncStatus() == null) ? 0 : getSyncStatus().hashCode());
        hashCode = prime * hashCode + ((getFailedStatusDetails() == null) ? 0 : getFailedStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getEdgeConfig() == null) ? 0 : getEdgeConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartEdgeConfigurationUpdateResult clone() {
        try {
            return (StartEdgeConfigurationUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
