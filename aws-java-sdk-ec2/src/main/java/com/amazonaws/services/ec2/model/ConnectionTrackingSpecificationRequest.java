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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A security group connection tracking specification request that enables you to set the idle timeout for connection
 * tracking on an Elastic network interface. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts"
 * >Connection tracking timeouts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConnectionTrackingSpecificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionTrackingSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000 seconds (5
     * days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     * </p>
     */
    private Integer tcpEstablishedTimeout;
    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one request-response
     * transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     * </p>
     */
    private Integer udpStreamTimeout;
    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     * request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     * </p>
     */
    private Integer udpTimeout;

    /**
     * <p>
     * Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000 seconds (5
     * days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     * </p>
     * 
     * @param tcpEstablishedTimeout
     *        Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000
     *        seconds (5 days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     */

    public void setTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
        this.tcpEstablishedTimeout = tcpEstablishedTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000 seconds (5
     * days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     * </p>
     * 
     * @return Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000
     *         seconds (5 days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     */

    public Integer getTcpEstablishedTimeout() {
        return this.tcpEstablishedTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000 seconds (5
     * days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     * </p>
     * 
     * @param tcpEstablishedTimeout
     *        Timeout (in seconds) for idle TCP connections in an established state. Min: 60 seconds. Max: 432000
     *        seconds (5 days). Default: 432000 seconds. Recommended: Less than 432000 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionTrackingSpecificationRequest withTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
        setTcpEstablishedTimeout(tcpEstablishedTimeout);
        return this;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one request-response
     * transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     * </p>
     * 
     * @param udpStreamTimeout
     *        Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
     *        request-response transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     */

    public void setUdpStreamTimeout(Integer udpStreamTimeout) {
        this.udpStreamTimeout = udpStreamTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one request-response
     * transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     * </p>
     * 
     * @return Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
     *         request-response transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     */

    public Integer getUdpStreamTimeout() {
        return this.udpStreamTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one request-response
     * transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     * </p>
     * 
     * @param udpStreamTimeout
     *        Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
     *        request-response transaction. Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionTrackingSpecificationRequest withUdpStreamTimeout(Integer udpStreamTimeout) {
        setUdpStreamTimeout(udpStreamTimeout);
        return this;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     * request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     * </p>
     * 
     * @param udpTimeout
     *        Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     *        request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     */

    public void setUdpTimeout(Integer udpTimeout) {
        this.udpTimeout = udpTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     * request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     * </p>
     * 
     * @return Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     *         request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     */

    public Integer getUdpTimeout() {
        return this.udpTimeout;
    }

    /**
     * <p>
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     * request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     * </p>
     * 
     * @param udpTimeout
     *        Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or a single
     *        request-response transaction. Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionTrackingSpecificationRequest withUdpTimeout(Integer udpTimeout) {
        setUdpTimeout(udpTimeout);
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
        if (getTcpEstablishedTimeout() != null)
            sb.append("TcpEstablishedTimeout: ").append(getTcpEstablishedTimeout()).append(",");
        if (getUdpStreamTimeout() != null)
            sb.append("UdpStreamTimeout: ").append(getUdpStreamTimeout()).append(",");
        if (getUdpTimeout() != null)
            sb.append("UdpTimeout: ").append(getUdpTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionTrackingSpecificationRequest == false)
            return false;
        ConnectionTrackingSpecificationRequest other = (ConnectionTrackingSpecificationRequest) obj;
        if (other.getTcpEstablishedTimeout() == null ^ this.getTcpEstablishedTimeout() == null)
            return false;
        if (other.getTcpEstablishedTimeout() != null && other.getTcpEstablishedTimeout().equals(this.getTcpEstablishedTimeout()) == false)
            return false;
        if (other.getUdpStreamTimeout() == null ^ this.getUdpStreamTimeout() == null)
            return false;
        if (other.getUdpStreamTimeout() != null && other.getUdpStreamTimeout().equals(this.getUdpStreamTimeout()) == false)
            return false;
        if (other.getUdpTimeout() == null ^ this.getUdpTimeout() == null)
            return false;
        if (other.getUdpTimeout() != null && other.getUdpTimeout().equals(this.getUdpTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTcpEstablishedTimeout() == null) ? 0 : getTcpEstablishedTimeout().hashCode());
        hashCode = prime * hashCode + ((getUdpStreamTimeout() == null) ? 0 : getUdpStreamTimeout().hashCode());
        hashCode = prime * hashCode + ((getUdpTimeout() == null) ? 0 : getUdpTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionTrackingSpecificationRequest clone() {
        try {
            return (ConnectionTrackingSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
