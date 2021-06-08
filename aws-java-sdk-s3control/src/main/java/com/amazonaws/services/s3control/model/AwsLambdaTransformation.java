/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * AWS Lambda function used to transform objects through an Object Lambda Access Point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AwsLambdaTransformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaTransformation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * </p>
     */
    private String functionPayload;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaTransformation withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * </p>
     * 
     * @param functionPayload
     *        Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     */

    public void setFunctionPayload(String functionPayload) {
        this.functionPayload = functionPayload;
    }

    /**
     * <p>
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * </p>
     * 
     * @return Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     */

    public String getFunctionPayload() {
        return this.functionPayload;
    }

    /**
     * <p>
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * </p>
     * 
     * @param functionPayload
     *        Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaTransformation withFunctionPayload(String functionPayload) {
        setFunctionPayload(functionPayload);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getFunctionPayload() != null)
            sb.append("FunctionPayload: ").append(getFunctionPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaTransformation == false)
            return false;
        AwsLambdaTransformation other = (AwsLambdaTransformation) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getFunctionPayload() == null ^ this.getFunctionPayload() == null)
            return false;
        if (other.getFunctionPayload() != null && other.getFunctionPayload().equals(this.getFunctionPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionPayload() == null) ? 0 : getFunctionPayload().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaTransformation clone() {
        try {
            return (AwsLambdaTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
