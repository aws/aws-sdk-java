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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalyMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A cost anomaly monitor ARN.
     * </p>
     */
    private String monitorArn;

    /**
     * <p>
     * A cost anomaly monitor ARN.
     * </p>
     * 
     * @param monitorArn
     *        A cost anomaly monitor ARN.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * A cost anomaly monitor ARN.
     * </p>
     * 
     * @return A cost anomaly monitor ARN.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * A cost anomaly monitor ARN.
     * </p>
     * 
     * @param monitorArn
     *        A cost anomaly monitor ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyMonitorResult withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnomalyMonitorResult == false)
            return false;
        UpdateAnomalyMonitorResult other = (UpdateAnomalyMonitorResult) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnomalyMonitorResult clone() {
        try {
            return (UpdateAnomalyMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
