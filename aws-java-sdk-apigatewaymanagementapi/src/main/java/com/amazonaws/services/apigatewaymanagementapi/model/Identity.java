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
package com.amazonaws.services.apigatewaymanagementapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apigatewaymanagementapi-2018-11-29/Identity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Identity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source IP address of the TCP connection making the request to API Gateway.
     * </p>
     */
    private String sourceIp;
    /**
     * <p>
     * The User Agent of the API caller.
     * </p>
     */
    private String userAgent;

    /**
     * <p>
     * The source IP address of the TCP connection making the request to API Gateway.
     * </p>
     * 
     * @param sourceIp
     *        The source IP address of the TCP connection making the request to API Gateway.
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * The source IP address of the TCP connection making the request to API Gateway.
     * </p>
     * 
     * @return The source IP address of the TCP connection making the request to API Gateway.
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * <p>
     * The source IP address of the TCP connection making the request to API Gateway.
     * </p>
     * 
     * @param sourceIp
     *        The source IP address of the TCP connection making the request to API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
        return this;
    }

    /**
     * <p>
     * The User Agent of the API caller.
     * </p>
     * 
     * @param userAgent
     *        The User Agent of the API caller.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * The User Agent of the API caller.
     * </p>
     * 
     * @return The User Agent of the API caller.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * The User Agent of the API caller.
     * </p>
     * 
     * @param userAgent
     *        The User Agent of the API caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withUserAgent(String userAgent) {
        setUserAgent(userAgent);
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
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp()).append(",");
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Identity == false)
            return false;
        Identity other = (Identity) obj;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        return hashCode;
    }

    @Override
    public Identity clone() {
        try {
            return (Identity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewaymanagementapi.model.transform.IdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
