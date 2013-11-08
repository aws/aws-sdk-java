/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest) SetLoadBalancerListenerSSLCertificate operation}.
 * <p>
 * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces any prior certificate that was used
 * on the same load balancer and port.
 * </p>
 * <p>
 * For more information on updating your SSL certificate, see <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load
 * Balancer </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest)
 */
public class SetLoadBalancerListenerSSLCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * The port that uses the specified SSL certificate.
     */
    private Integer loadBalancerPort;

    /**
     * The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     * For more information on SSL certificates, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     * Managing Server Certificates</a> in the <i>AWS Identity and Access
     * Management User Guide</i>.
     */
    private String sSLCertificateId;

    /**
     * Default constructor for a new SetLoadBalancerListenerSSLCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetLoadBalancerListenerSSLCertificateRequest() {}
    
    /**
     * Constructs a new SetLoadBalancerListenerSSLCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancerPort The port that uses the specified SSL
     * certificate.
     * @param sSLCertificateId The Amazon Resource Number (ARN) of the SSL
     * certificate chain to use. For more information on SSL certificates,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     * Managing Server Certificates</a> in the <i>AWS Identity and Access
     * Management User Guide</i>.
     */
    public SetLoadBalancerListenerSSLCertificateRequest(String loadBalancerName, Integer loadBalancerPort, String sSLCertificateId) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setSSLCertificateId(sSLCertificateId);
    }

    /**
     * The name of the load balancer.
     *
     * @return The name of the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     *
     * @param loadBalancerName The name of the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The port that uses the specified SSL certificate.
     *
     * @return The port that uses the specified SSL certificate.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * The port that uses the specified SSL certificate.
     *
     * @param loadBalancerPort The port that uses the specified SSL certificate.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * The port that uses the specified SSL certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort The port that uses the specified SSL certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     * For more information on SSL certificates, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     * Managing Server Certificates</a> in the <i>AWS Identity and Access
     * Management User Guide</i>.
     *
     * @return The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     *         For more information on SSL certificates, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     *         Managing Server Certificates</a> in the <i>AWS Identity and Access
     *         Management User Guide</i>.
     */
    public String getSSLCertificateId() {
        return sSLCertificateId;
    }
    
    /**
     * The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     * For more information on SSL certificates, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     * Managing Server Certificates</a> in the <i>AWS Identity and Access
     * Management User Guide</i>.
     *
     * @param sSLCertificateId The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     *         For more information on SSL certificates, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     *         Managing Server Certificates</a> in the <i>AWS Identity and Access
     *         Management User Guide</i>.
     */
    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }
    
    /**
     * The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     * For more information on SSL certificates, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     * Managing Server Certificates</a> in the <i>AWS Identity and Access
     * Management User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sSLCertificateId The Amazon Resource Number (ARN) of the SSL certificate chain to use.
     *         For more information on SSL certificates, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html">
     *         Managing Server Certificates</a> in the <i>AWS Identity and Access
     *         Management User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerListenerSSLCertificateRequest withSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getLoadBalancerPort() != null) sb.append("LoadBalancerPort: " + getLoadBalancerPort() + ",");
        if (getSSLCertificateId() != null) sb.append("SSLCertificateId: " + getSSLCertificateId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetLoadBalancerListenerSSLCertificateRequest == false) return false;
        SetLoadBalancerListenerSSLCertificateRequest other = (SetLoadBalancerListenerSSLCertificateRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null) return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false) return false; 
        if (other.getSSLCertificateId() == null ^ this.getSSLCertificateId() == null) return false;
        if (other.getSSLCertificateId() != null && other.getSSLCertificateId().equals(this.getSSLCertificateId()) == false) return false; 
        return true;
    }
    
}
    