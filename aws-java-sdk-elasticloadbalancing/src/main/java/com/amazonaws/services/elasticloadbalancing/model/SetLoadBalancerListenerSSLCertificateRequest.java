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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for SetLoadBalancerListenerSSLCertificate.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerListenerSSLCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLoadBalancerListenerSSLCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     */
    private Integer loadBalancerPort;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     */
    private String sSLCertificateId;

    /**
     * Default constructor for SetLoadBalancerListenerSSLCertificateRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public SetLoadBalancerListenerSSLCertificateRequest() {
    }

    /**
     * Constructs a new SetLoadBalancerListenerSSLCertificateRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @param loadBalancerPort
     *        The port that uses the specified SSL certificate.
     * @param sSLCertificateId
     *        The Amazon Resource Name (ARN) of the SSL certificate.
     */
    public SetLoadBalancerListenerSSLCertificateRequest(String loadBalancerName, Integer loadBalancerPort, String sSLCertificateId) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setSSLCertificateId(sSLCertificateId);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port that uses the specified SSL certificate.
     */

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     * 
     * @return The port that uses the specified SSL certificate.
     */

    public Integer getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * <p>
     * The port that uses the specified SSL certificate.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port that uses the specified SSL certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerPort(Integer loadBalancerPort) {
        setLoadBalancerPort(loadBalancerPort);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     * 
     * @param sSLCertificateId
     *        The Amazon Resource Name (ARN) of the SSL certificate.
     */

    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SSL certificate.
     */

    public String getSSLCertificateId() {
        return this.sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL certificate.
     * </p>
     * 
     * @param sSLCertificateId
     *        The Amazon Resource Name (ARN) of the SSL certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerListenerSSLCertificateRequest withSSLCertificateId(String sSLCertificateId) {
        setSSLCertificateId(sSLCertificateId);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: ").append(getLoadBalancerPort()).append(",");
        if (getSSLCertificateId() != null)
            sb.append("SSLCertificateId: ").append(getSSLCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBalancerListenerSSLCertificateRequest == false)
            return false;
        SetLoadBalancerListenerSSLCertificateRequest other = (SetLoadBalancerListenerSSLCertificateRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getSSLCertificateId() == null ^ this.getSSLCertificateId() == null)
            return false;
        if (other.getSSLCertificateId() != null && other.getSSLCertificateId().equals(this.getSSLCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode + ((getSSLCertificateId() == null) ? 0 : getSSLCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public SetLoadBalancerListenerSSLCertificateRequest clone() {
        return (SetLoadBalancerListenerSSLCertificateRequest) super.clone();
    }

}
