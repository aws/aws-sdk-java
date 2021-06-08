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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomalyGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     */
    private String anomalyDetectorArn;

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     */

    public void setAnomalyGroupId(String anomalyGroupId) {
        this.anomalyGroupId = anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @return The ID of the anomaly group.
     */

    public String getAnomalyGroupId() {
        return this.anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyGroupRequest withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the anomaly detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyGroupRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
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
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnomalyGroupRequest == false)
            return false;
        GetAnomalyGroupRequest other = (GetAnomalyGroupRequest) obj;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomalyGroupRequest clone() {
        return (GetAnomalyGroupRequest) super.clone();
    }

}
