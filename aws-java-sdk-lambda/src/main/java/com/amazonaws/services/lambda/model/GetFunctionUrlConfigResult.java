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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionUrlConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionUrlConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP URL endpoint for your function.
     * </p>
     */
    private String functionUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to restrict
     * access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM authentication to
     * create a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda function
     * URLs</a>.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing (CORS)</a>
     * settings for your function URL.
     * </p>
     */
    private Cors cors;
    /**
     * <p>
     * When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * When the function URL configuration was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private String lastModifiedTime;

    /**
     * <p>
     * The HTTP URL endpoint for your function.
     * </p>
     * 
     * @param functionUrl
     *        The HTTP URL endpoint for your function.
     */

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }

    /**
     * <p>
     * The HTTP URL endpoint for your function.
     * </p>
     * 
     * @return The HTTP URL endpoint for your function.
     */

    public String getFunctionUrl() {
        return this.functionUrl;
    }

    /**
     * <p>
     * The HTTP URL endpoint for your function.
     * </p>
     * 
     * @param functionUrl
     *        The HTTP URL endpoint for your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionUrlConfigResult withFunctionUrl(String functionUrl) {
        setFunctionUrl(functionUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of your function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionUrlConfigResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to restrict
     * access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM authentication to
     * create a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda function
     * URLs</a>.
     * </p>
     * 
     * @param authType
     *        The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to
     *        restrict access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM
     *        authentication to create a public endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda
     *        function URLs</a>.
     * @see FunctionUrlAuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to restrict
     * access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM authentication to
     * create a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda function
     * URLs</a>.
     * </p>
     * 
     * @return The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to
     *         restrict access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM
     *         authentication to create a public endpoint. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda
     *         function URLs</a>.
     * @see FunctionUrlAuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to restrict
     * access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM authentication to
     * create a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda function
     * URLs</a>.
     * </p>
     * 
     * @param authType
     *        The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to
     *        restrict access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM
     *        authentication to create a public endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda
     *        function URLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionUrlAuthType
     */

    public GetFunctionUrlConfigResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to restrict
     * access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM authentication to
     * create a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda function
     * URLs</a>.
     * </p>
     * 
     * @param authType
     *        The type of authentication that your function URL uses. Set to <code>AWS_IAM</code> if you want to
     *        restrict access to authenticated IAM users only. Set to <code>NONE</code> if you want to bypass IAM
     *        authentication to create a public endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html">Security and auth model for Lambda
     *        function URLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionUrlAuthType
     */

    public GetFunctionUrlConfigResult withAuthType(FunctionUrlAuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing (CORS)</a>
     * settings for your function URL.
     * </p>
     * 
     * @param cors
     *        The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing
     *        (CORS)</a> settings for your function URL.
     */

    public void setCors(Cors cors) {
        this.cors = cors;
    }

    /**
     * <p>
     * The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing (CORS)</a>
     * settings for your function URL.
     * </p>
     * 
     * @return The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing
     *         (CORS)</a> settings for your function URL.
     */

    public Cors getCors() {
        return this.cors;
    }

    /**
     * <p>
     * The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing (CORS)</a>
     * settings for your function URL.
     * </p>
     * 
     * @param cors
     *        The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing
     *        (CORS)</a> settings for your function URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionUrlConfigResult withCors(Cors cors) {
        setCors(cors);
        return this;
    }

    /**
     * <p>
     * When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param creationTime
     *        When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *         (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param creationTime
     *        When the function URL was created, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionUrlConfigResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the function URL configuration was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the function URL configuration was last updated, in <a
     *        href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the function URL configuration was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return When the function URL configuration was last updated, in <a
     *         href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the function URL configuration was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the function URL configuration was last updated, in <a
     *        href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionUrlConfigResult withLastModifiedTime(String lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getFunctionUrl() != null)
            sb.append("FunctionUrl: ").append(getFunctionUrl()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCors() != null)
            sb.append("Cors: ").append(getCors()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionUrlConfigResult == false)
            return false;
        GetFunctionUrlConfigResult other = (GetFunctionUrlConfigResult) obj;
        if (other.getFunctionUrl() == null ^ this.getFunctionUrl() == null)
            return false;
        if (other.getFunctionUrl() != null && other.getFunctionUrl().equals(this.getFunctionUrl()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCors() == null ^ this.getCors() == null)
            return false;
        if (other.getCors() != null && other.getCors().equals(this.getCors()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionUrl() == null) ? 0 : getFunctionUrl().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCors() == null) ? 0 : getCors().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionUrlConfigResult clone() {
        try {
            return (GetFunctionUrlConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
