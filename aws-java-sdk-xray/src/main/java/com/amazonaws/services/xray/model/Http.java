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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an HTTP request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Http" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Http implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The request URL.
     * </p>
     */
    private String httpURL;
    /**
     * <p>
     * The response status.
     * </p>
     */
    private Integer httpStatus;
    /**
     * <p>
     * The request method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The request's user agent string.
     * </p>
     */
    private String userAgent;
    /**
     * <p>
     * The IP address of the requestor.
     * </p>
     */
    private String clientIp;

    /**
     * <p>
     * The request URL.
     * </p>
     * 
     * @param httpURL
     *        The request URL.
     */

    public void setHttpURL(String httpURL) {
        this.httpURL = httpURL;
    }

    /**
     * <p>
     * The request URL.
     * </p>
     * 
     * @return The request URL.
     */

    public String getHttpURL() {
        return this.httpURL;
    }

    /**
     * <p>
     * The request URL.
     * </p>
     * 
     * @param httpURL
     *        The request URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Http withHttpURL(String httpURL) {
        setHttpURL(httpURL);
        return this;
    }

    /**
     * <p>
     * The response status.
     * </p>
     * 
     * @param httpStatus
     *        The response status.
     */

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    /**
     * <p>
     * The response status.
     * </p>
     * 
     * @return The response status.
     */

    public Integer getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * <p>
     * The response status.
     * </p>
     * 
     * @param httpStatus
     *        The response status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Http withHttpStatus(Integer httpStatus) {
        setHttpStatus(httpStatus);
        return this;
    }

    /**
     * <p>
     * The request method.
     * </p>
     * 
     * @param httpMethod
     *        The request method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The request method.
     * </p>
     * 
     * @return The request method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The request method.
     * </p>
     * 
     * @param httpMethod
     *        The request method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Http withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The request's user agent string.
     * </p>
     * 
     * @param userAgent
     *        The request's user agent string.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * The request's user agent string.
     * </p>
     * 
     * @return The request's user agent string.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * The request's user agent string.
     * </p>
     * 
     * @param userAgent
     *        The request's user agent string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Http withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * <p>
     * The IP address of the requestor.
     * </p>
     * 
     * @param clientIp
     *        The IP address of the requestor.
     */

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * <p>
     * The IP address of the requestor.
     * </p>
     * 
     * @return The IP address of the requestor.
     */

    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * <p>
     * The IP address of the requestor.
     * </p>
     * 
     * @param clientIp
     *        The IP address of the requestor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Http withClientIp(String clientIp) {
        setClientIp(clientIp);
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
        if (getHttpURL() != null)
            sb.append("HttpURL: ").append(getHttpURL()).append(",");
        if (getHttpStatus() != null)
            sb.append("HttpStatus: ").append(getHttpStatus()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent()).append(",");
        if (getClientIp() != null)
            sb.append("ClientIp: ").append(getClientIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Http == false)
            return false;
        Http other = (Http) obj;
        if (other.getHttpURL() == null ^ this.getHttpURL() == null)
            return false;
        if (other.getHttpURL() != null && other.getHttpURL().equals(this.getHttpURL()) == false)
            return false;
        if (other.getHttpStatus() == null ^ this.getHttpStatus() == null)
            return false;
        if (other.getHttpStatus() != null && other.getHttpStatus().equals(this.getHttpStatus()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        if (other.getClientIp() == null ^ this.getClientIp() == null)
            return false;
        if (other.getClientIp() != null && other.getClientIp().equals(this.getClientIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpURL() == null) ? 0 : getHttpURL().hashCode());
        hashCode = prime * hashCode + ((getHttpStatus() == null) ? 0 : getHttpStatus().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        hashCode = prime * hashCode + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        return hashCode;
    }

    @Override
    public Http clone() {
        try {
            return (Http) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.HttpMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
