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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contextual user data type used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ContextDataType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextDataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     */
    private String serverPath;
    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     */
    private java.util.List<HttpHeader> httpHeaders;
    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection
     * library.
     * </p>
     */
    private String encodedData;

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     * 
     * @param ipAddress
     *        Source IP address of your user.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     * 
     * @return Source IP address of your user.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     * 
     * @param ipAddress
     *        Source IP address of your user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     * 
     * @param serverName
     *        Your server endpoint where this API is invoked.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     * 
     * @return Your server endpoint where this API is invoked.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     * 
     * @param serverName
     *        Your server endpoint where this API is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     * 
     * @param serverPath
     *        Your server path where this API is invoked.
     */

    public void setServerPath(String serverPath) {
        this.serverPath = serverPath;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     * 
     * @return Your server path where this API is invoked.
     */

    public String getServerPath() {
        return this.serverPath;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     * 
     * @param serverPath
     *        Your server path where this API is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withServerPath(String serverPath) {
        setServerPath(serverPath);
        return this;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * 
     * @return HttpHeaders received on your server in same order.
     */

    public java.util.List<HttpHeader> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * 
     * @param httpHeaders
     *        HttpHeaders received on your server in same order.
     */

    public void setHttpHeaders(java.util.Collection<HttpHeader> httpHeaders) {
        if (httpHeaders == null) {
            this.httpHeaders = null;
            return;
        }

        this.httpHeaders = new java.util.ArrayList<HttpHeader>(httpHeaders);
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHttpHeaders(java.util.Collection)} or {@link #withHttpHeaders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param httpHeaders
     *        HttpHeaders received on your server in same order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withHttpHeaders(HttpHeader... httpHeaders) {
        if (this.httpHeaders == null) {
            setHttpHeaders(new java.util.ArrayList<HttpHeader>(httpHeaders.length));
        }
        for (HttpHeader ele : httpHeaders) {
            this.httpHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * 
     * @param httpHeaders
     *        HttpHeaders received on your server in same order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withHttpHeaders(java.util.Collection<HttpHeader> httpHeaders) {
        setHttpHeaders(httpHeaders);
        return this;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection
     * library.
     * </p>
     * 
     * @param encodedData
     *        Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data
     *        collection library.
     */

    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection
     * library.
     * </p>
     * 
     * @return Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data
     *         collection library.
     */

    public String getEncodedData() {
        return this.encodedData;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection
     * library.
     * </p>
     * 
     * @param encodedData
     *        Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data
     *        collection library.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDataType withEncodedData(String encodedData) {
        setEncodedData(encodedData);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServerPath() != null)
            sb.append("ServerPath: ").append(getServerPath()).append(",");
        if (getHttpHeaders() != null)
            sb.append("HttpHeaders: ").append(getHttpHeaders()).append(",");
        if (getEncodedData() != null)
            sb.append("EncodedData: ").append(getEncodedData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextDataType == false)
            return false;
        ContextDataType other = (ContextDataType) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServerPath() == null ^ this.getServerPath() == null)
            return false;
        if (other.getServerPath() != null && other.getServerPath().equals(this.getServerPath()) == false)
            return false;
        if (other.getHttpHeaders() == null ^ this.getHttpHeaders() == null)
            return false;
        if (other.getHttpHeaders() != null && other.getHttpHeaders().equals(this.getHttpHeaders()) == false)
            return false;
        if (other.getEncodedData() == null ^ this.getEncodedData() == null)
            return false;
        if (other.getEncodedData() != null && other.getEncodedData().equals(this.getEncodedData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServerPath() == null) ? 0 : getServerPath().hashCode());
        hashCode = prime * hashCode + ((getHttpHeaders() == null) ? 0 : getHttpHeaders().hashCode());
        hashCode = prime * hashCode + ((getEncodedData() == null) ? 0 : getEncodedData().hashCode());
        return hashCode;
    }

    @Override
    public ContextDataType clone() {
        try {
            return (ContextDataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ContextDataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
