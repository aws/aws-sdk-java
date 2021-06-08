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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalyMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnomalyMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cost anomaly detection monitor object that you want to create.
     * </p>
     */
    private AnomalyMonitor anomalyMonitor;

    /**
     * <p>
     * The cost anomaly detection monitor object that you want to create.
     * </p>
     * 
     * @param anomalyMonitor
     *        The cost anomaly detection monitor object that you want to create.
     */

    public void setAnomalyMonitor(AnomalyMonitor anomalyMonitor) {
        this.anomalyMonitor = anomalyMonitor;
    }

    /**
     * <p>
     * The cost anomaly detection monitor object that you want to create.
     * </p>
     * 
     * @return The cost anomaly detection monitor object that you want to create.
     */

    public AnomalyMonitor getAnomalyMonitor() {
        return this.anomalyMonitor;
    }

    /**
     * <p>
     * The cost anomaly detection monitor object that you want to create.
     * </p>
     * 
     * @param anomalyMonitor
     *        The cost anomaly detection monitor object that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyMonitorRequest withAnomalyMonitor(AnomalyMonitor anomalyMonitor) {
        setAnomalyMonitor(anomalyMonitor);
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
        if (getAnomalyMonitor() != null)
            sb.append("AnomalyMonitor: ").append(getAnomalyMonitor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnomalyMonitorRequest == false)
            return false;
        CreateAnomalyMonitorRequest other = (CreateAnomalyMonitorRequest) obj;
        if (other.getAnomalyMonitor() == null ^ this.getAnomalyMonitor() == null)
            return false;
        if (other.getAnomalyMonitor() != null && other.getAnomalyMonitor().equals(this.getAnomalyMonitor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyMonitor() == null) ? 0 : getAnomalyMonitor().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnomalyMonitorRequest clone() {
        return (CreateAnomalyMonitorRequest) super.clone();
    }

}
