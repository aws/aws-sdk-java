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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestIdentityProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The result of the authorization test as a message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The result of the authorization test as a message.
     * </p>
     * 
     * @param message
     *        The result of the authorization test as a message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The result of the authorization test as a message.
     * </p>
     * 
     * @return The result of the authorization test as a message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The result of the authorization test as a message.
     * </p>
     * 
     * @param message
     *        The result of the authorization test as a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code that is the response from your API Gateway.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     * 
     * @return The HTTP status code that is the response from your API Gateway.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code that is the response from your API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * 
     * @param url
     *        The endpoint of the service used to authenticate a user.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * 
     * @return The endpoint of the service used to authenticate a user.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * 
     * @param url
     *        The endpoint of the service used to authenticate a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderResult withUrl(String url) {
        setUrl(url);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestIdentityProviderResult == false)
            return false;
        TestIdentityProviderResult other = (TestIdentityProviderResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public TestIdentityProviderResult clone() {
        try {
            return (TestIdentityProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
