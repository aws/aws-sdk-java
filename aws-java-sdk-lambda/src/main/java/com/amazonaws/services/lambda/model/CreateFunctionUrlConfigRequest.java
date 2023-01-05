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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunctionUrlConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionUrlConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The alias name.
     * </p>
     */
    private String qualifier;
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
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> – <code>my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> – <code>my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> – <code>my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionUrlConfigRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @param qualifier
     *        The alias name.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @return The alias name.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @param qualifier
     *        The alias name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionUrlConfigRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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

    public CreateFunctionUrlConfigRequest withAuthType(String authType) {
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

    public CreateFunctionUrlConfigRequest withAuthType(FunctionUrlAuthType authType) {
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

    public CreateFunctionUrlConfigRequest withCors(Cors cors) {
        setCors(cors);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCors() != null)
            sb.append("Cors: ").append(getCors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionUrlConfigRequest == false)
            return false;
        CreateFunctionUrlConfigRequest other = (CreateFunctionUrlConfigRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCors() == null ^ this.getCors() == null)
            return false;
        if (other.getCors() != null && other.getCors().equals(this.getCors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCors() == null) ? 0 : getCors().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionUrlConfigRequest clone() {
        return (CreateFunctionUrlConfigRequest) super.clone();
    }

}
