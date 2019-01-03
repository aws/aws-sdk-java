/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output for <a>EnableEnhancedMonitoring</a> and <a>DisableEnhancedMonitoring</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/EnableEnhancedMonitoring" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableEnhancedMonitoringResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> currentShardLevelMetrics;
    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> desiredShardLevelMetrics;

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Kinesis data stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @return The name of the Kinesis data stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableEnhancedMonitoringResult withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     * 
     * @return Represents the current state of the metrics that are in the enhanced state before the operation.
     * @see MetricsName
     */

    public java.util.List<String> getCurrentShardLevelMetrics() {
        if (currentShardLevelMetrics == null) {
            currentShardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return currentShardLevelMetrics;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     * 
     * @param currentShardLevelMetrics
     *        Represents the current state of the metrics that are in the enhanced state before the operation.
     * @see MetricsName
     */

    public void setCurrentShardLevelMetrics(java.util.Collection<String> currentShardLevelMetrics) {
        if (currentShardLevelMetrics == null) {
            this.currentShardLevelMetrics = null;
            return;
        }

        this.currentShardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>(currentShardLevelMetrics);
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCurrentShardLevelMetrics(java.util.Collection)} or
     * {@link #withCurrentShardLevelMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param currentShardLevelMetrics
     *        Represents the current state of the metrics that are in the enhanced state before the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(String... currentShardLevelMetrics) {
        if (this.currentShardLevelMetrics == null) {
            setCurrentShardLevelMetrics(new com.amazonaws.internal.SdkInternalList<String>(currentShardLevelMetrics.length));
        }
        for (String ele : currentShardLevelMetrics) {
            this.currentShardLevelMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     * 
     * @param currentShardLevelMetrics
     *        Represents the current state of the metrics that are in the enhanced state before the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(java.util.Collection<String> currentShardLevelMetrics) {
        setCurrentShardLevelMetrics(currentShardLevelMetrics);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced state before the operation.
     * </p>
     * 
     * @param currentShardLevelMetrics
     *        Represents the current state of the metrics that are in the enhanced state before the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(MetricsName... currentShardLevelMetrics) {
        com.amazonaws.internal.SdkInternalList<String> currentShardLevelMetricsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                currentShardLevelMetrics.length);
        for (MetricsName value : currentShardLevelMetrics) {
            currentShardLevelMetricsCopy.add(value.toString());
        }
        if (getCurrentShardLevelMetrics() == null) {
            setCurrentShardLevelMetrics(currentShardLevelMetricsCopy);
        } else {
            getCurrentShardLevelMetrics().addAll(currentShardLevelMetricsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     * 
     * @return Represents the list of all the metrics that would be in the enhanced state after the operation.
     * @see MetricsName
     */

    public java.util.List<String> getDesiredShardLevelMetrics() {
        if (desiredShardLevelMetrics == null) {
            desiredShardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return desiredShardLevelMetrics;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     * 
     * @param desiredShardLevelMetrics
     *        Represents the list of all the metrics that would be in the enhanced state after the operation.
     * @see MetricsName
     */

    public void setDesiredShardLevelMetrics(java.util.Collection<String> desiredShardLevelMetrics) {
        if (desiredShardLevelMetrics == null) {
            this.desiredShardLevelMetrics = null;
            return;
        }

        this.desiredShardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>(desiredShardLevelMetrics);
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDesiredShardLevelMetrics(java.util.Collection)} or
     * {@link #withDesiredShardLevelMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param desiredShardLevelMetrics
     *        Represents the list of all the metrics that would be in the enhanced state after the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(String... desiredShardLevelMetrics) {
        if (this.desiredShardLevelMetrics == null) {
            setDesiredShardLevelMetrics(new com.amazonaws.internal.SdkInternalList<String>(desiredShardLevelMetrics.length));
        }
        for (String ele : desiredShardLevelMetrics) {
            this.desiredShardLevelMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     * 
     * @param desiredShardLevelMetrics
     *        Represents the list of all the metrics that would be in the enhanced state after the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(java.util.Collection<String> desiredShardLevelMetrics) {
        setDesiredShardLevelMetrics(desiredShardLevelMetrics);
        return this;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced state after the operation.
     * </p>
     * 
     * @param desiredShardLevelMetrics
     *        Represents the list of all the metrics that would be in the enhanced state after the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(MetricsName... desiredShardLevelMetrics) {
        com.amazonaws.internal.SdkInternalList<String> desiredShardLevelMetricsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                desiredShardLevelMetrics.length);
        for (MetricsName value : desiredShardLevelMetrics) {
            desiredShardLevelMetricsCopy.add(value.toString());
        }
        if (getDesiredShardLevelMetrics() == null) {
            setDesiredShardLevelMetrics(desiredShardLevelMetricsCopy);
        } else {
            getDesiredShardLevelMetrics().addAll(desiredShardLevelMetricsCopy);
        }
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
        if (getCurrentShardLevelMetrics() != null)
            sb.append("CurrentShardLevelMetrics: ").append(getCurrentShardLevelMetrics()).append(",");
        if (getDesiredShardLevelMetrics() != null)
            sb.append("DesiredShardLevelMetrics: ").append(getDesiredShardLevelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableEnhancedMonitoringResult == false)
            return false;
        EnableEnhancedMonitoringResult other = (EnableEnhancedMonitoringResult) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getCurrentShardLevelMetrics() == null ^ this.getCurrentShardLevelMetrics() == null)
            return false;
        if (other.getCurrentShardLevelMetrics() != null && other.getCurrentShardLevelMetrics().equals(this.getCurrentShardLevelMetrics()) == false)
            return false;
        if (other.getDesiredShardLevelMetrics() == null ^ this.getDesiredShardLevelMetrics() == null)
            return false;
        if (other.getDesiredShardLevelMetrics() != null && other.getDesiredShardLevelMetrics().equals(this.getDesiredShardLevelMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getCurrentShardLevelMetrics() == null) ? 0 : getCurrentShardLevelMetrics().hashCode());
        hashCode = prime * hashCode + ((getDesiredShardLevelMetrics() == null) ? 0 : getDesiredShardLevelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public EnableEnhancedMonitoringResult clone() {
        try {
            return (EnableEnhancedMonitoringResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
