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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeAvailabilityMonitorTest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailabilityMonitorTestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is
     * null.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this
     * field is null.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityMonitorTestResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is
     * null.
     * </p>
     * 
     * @param status
     *        The status of the High Availability monitoring test. If a test hasn't been performed, the value of this
     *        field is null.
     * @see AvailabilityMonitorTestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is
     * null.
     * </p>
     * 
     * @return The status of the High Availability monitoring test. If a test hasn't been performed, the value of this
     *         field is null.
     * @see AvailabilityMonitorTestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is
     * null.
     * </p>
     * 
     * @param status
     *        The status of the High Availability monitoring test. If a test hasn't been performed, the value of this
     *        field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityMonitorTestStatus
     */

    public DescribeAvailabilityMonitorTestResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is
     * null.
     * </p>
     * 
     * @param status
     *        The status of the High Availability monitoring test. If a test hasn't been performed, the value of this
     *        field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityMonitorTestStatus
     */

    public DescribeAvailabilityMonitorTestResult withStatus(AvailabilityMonitorTestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this
     * field is null.
     * </p>
     * 
     * @param startTime
     *        The time the High Availability monitoring test was started. If a test hasn't been performed, the value of
     *        this field is null.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this
     * field is null.
     * </p>
     * 
     * @return The time the High Availability monitoring test was started. If a test hasn't been performed, the value of
     *         this field is null.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this
     * field is null.
     * </p>
     * 
     * @param startTime
     *        The time the High Availability monitoring test was started. If a test hasn't been performed, the value of
     *        this field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityMonitorTestResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityMonitorTestResult == false)
            return false;
        DescribeAvailabilityMonitorTestResult other = (DescribeAvailabilityMonitorTestResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailabilityMonitorTestResult clone() {
        try {
            return (DescribeAvailabilityMonitorTestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
