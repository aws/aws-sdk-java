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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Kubernetes API call action described in this finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesApiCallAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesApiCallAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Kubernetes API request URI.
     * </p>
     */
    private String requestUri;
    /**
     * <p>
     * The Kubernetes API request HTTP verb.
     * </p>
     */
    private String verb;
    /**
     * <p>
     * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API
     * endpoint.
     * </p>
     */
    private java.util.List<String> sourceIps;
    /**
     * <p>
     * The user agent of the caller of the Kubernetes API.
     * </p>
     */
    private String userAgent;

    private RemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * The resulting HTTP response code of the Kubernetes API call action.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * Parameters related to the Kubernetes API call action.
     * </p>
     */
    private String parameters;

    /**
     * <p>
     * The Kubernetes API request URI.
     * </p>
     * 
     * @param requestUri
     *        The Kubernetes API request URI.
     */

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    /**
     * <p>
     * The Kubernetes API request URI.
     * </p>
     * 
     * @return The Kubernetes API request URI.
     */

    public String getRequestUri() {
        return this.requestUri;
    }

    /**
     * <p>
     * The Kubernetes API request URI.
     * </p>
     * 
     * @param requestUri
     *        The Kubernetes API request URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withRequestUri(String requestUri) {
        setRequestUri(requestUri);
        return this;
    }

    /**
     * <p>
     * The Kubernetes API request HTTP verb.
     * </p>
     * 
     * @param verb
     *        The Kubernetes API request HTTP verb.
     */

    public void setVerb(String verb) {
        this.verb = verb;
    }

    /**
     * <p>
     * The Kubernetes API request HTTP verb.
     * </p>
     * 
     * @return The Kubernetes API request HTTP verb.
     */

    public String getVerb() {
        return this.verb;
    }

    /**
     * <p>
     * The Kubernetes API request HTTP verb.
     * </p>
     * 
     * @param verb
     *        The Kubernetes API request HTTP verb.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withVerb(String verb) {
        setVerb(verb);
        return this;
    }

    /**
     * <p>
     * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API
     * endpoint.
     * </p>
     * 
     * @return The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and
     *         the API endpoint.
     */

    public java.util.List<String> getSourceIps() {
        return sourceIps;
    }

    /**
     * <p>
     * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API
     * endpoint.
     * </p>
     * 
     * @param sourceIps
     *        The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and
     *        the API endpoint.
     */

    public void setSourceIps(java.util.Collection<String> sourceIps) {
        if (sourceIps == null) {
            this.sourceIps = null;
            return;
        }

        this.sourceIps = new java.util.ArrayList<String>(sourceIps);
    }

    /**
     * <p>
     * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API
     * endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIps(java.util.Collection)} or {@link #withSourceIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceIps
     *        The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and
     *        the API endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withSourceIps(String... sourceIps) {
        if (this.sourceIps == null) {
            setSourceIps(new java.util.ArrayList<String>(sourceIps.length));
        }
        for (String ele : sourceIps) {
            this.sourceIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API
     * endpoint.
     * </p>
     * 
     * @param sourceIps
     *        The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and
     *        the API endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withSourceIps(java.util.Collection<String> sourceIps) {
        setSourceIps(sourceIps);
        return this;
    }

    /**
     * <p>
     * The user agent of the caller of the Kubernetes API.
     * </p>
     * 
     * @param userAgent
     *        The user agent of the caller of the Kubernetes API.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * The user agent of the caller of the Kubernetes API.
     * </p>
     * 
     * @return The user agent of the caller of the Kubernetes API.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * The user agent of the caller of the Kubernetes API.
     * </p>
     * 
     * @param userAgent
     *        The user agent of the caller of the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * @param remoteIpDetails
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * @return
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * @param remoteIpDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * The resulting HTTP response code of the Kubernetes API call action.
     * </p>
     * 
     * @param statusCode
     *        The resulting HTTP response code of the Kubernetes API call action.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The resulting HTTP response code of the Kubernetes API call action.
     * </p>
     * 
     * @return The resulting HTTP response code of the Kubernetes API call action.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The resulting HTTP response code of the Kubernetes API call action.
     * </p>
     * 
     * @param statusCode
     *        The resulting HTTP response code of the Kubernetes API call action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Parameters related to the Kubernetes API call action.
     * </p>
     * 
     * @param parameters
     *        Parameters related to the Kubernetes API call action.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Parameters related to the Kubernetes API call action.
     * </p>
     * 
     * @return Parameters related to the Kubernetes API call action.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Parameters related to the Kubernetes API call action.
     * </p>
     * 
     * @param parameters
     *        Parameters related to the Kubernetes API call action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesApiCallAction withParameters(String parameters) {
        setParameters(parameters);
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
        if (getRequestUri() != null)
            sb.append("RequestUri: ").append(getRequestUri()).append(",");
        if (getVerb() != null)
            sb.append("Verb: ").append(getVerb()).append(",");
        if (getSourceIps() != null)
            sb.append("SourceIps: ").append(getSourceIps()).append(",");
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesApiCallAction == false)
            return false;
        KubernetesApiCallAction other = (KubernetesApiCallAction) obj;
        if (other.getRequestUri() == null ^ this.getRequestUri() == null)
            return false;
        if (other.getRequestUri() != null && other.getRequestUri().equals(this.getRequestUri()) == false)
            return false;
        if (other.getVerb() == null ^ this.getVerb() == null)
            return false;
        if (other.getVerb() != null && other.getVerb().equals(this.getVerb()) == false)
            return false;
        if (other.getSourceIps() == null ^ this.getSourceIps() == null)
            return false;
        if (other.getSourceIps() != null && other.getSourceIps().equals(this.getSourceIps()) == false)
            return false;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestUri() == null) ? 0 : getRequestUri().hashCode());
        hashCode = prime * hashCode + ((getVerb() == null) ? 0 : getVerb().hashCode());
        hashCode = prime * hashCode + ((getSourceIps() == null) ? 0 : getSourceIps().hashCode());
        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesApiCallAction clone() {
        try {
            return (KubernetesApiCallAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesApiCallActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
