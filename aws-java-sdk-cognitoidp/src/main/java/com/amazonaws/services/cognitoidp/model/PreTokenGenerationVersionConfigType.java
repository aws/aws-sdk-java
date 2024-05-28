/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The properties of a pre token generation Lambda trigger.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/PreTokenGenerationVersionConfigType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreTokenGenerationVersionConfigType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda function. Higher-numbered
     * versions add fields that support new features.
     * </p>
     */
    private String lambdaVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same value.
     * For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda function. Higher-numbered
     * versions add fields that support new features.
     * </p>
     * 
     * @param lambdaVersion
     *        The user pool trigger version of the request that Amazon Cognito sends to your Lambda function.
     *        Higher-numbered versions add fields that support new features.
     * @see PreTokenGenerationLambdaVersionType
     */

    public void setLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda function. Higher-numbered
     * versions add fields that support new features.
     * </p>
     * 
     * @return The user pool trigger version of the request that Amazon Cognito sends to your Lambda function.
     *         Higher-numbered versions add fields that support new features.
     * @see PreTokenGenerationLambdaVersionType
     */

    public String getLambdaVersion() {
        return this.lambdaVersion;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda function. Higher-numbered
     * versions add fields that support new features.
     * </p>
     * 
     * @param lambdaVersion
     *        The user pool trigger version of the request that Amazon Cognito sends to your Lambda function.
     *        Higher-numbered versions add fields that support new features.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreTokenGenerationLambdaVersionType
     */

    public PreTokenGenerationVersionConfigType withLambdaVersion(String lambdaVersion) {
        setLambdaVersion(lambdaVersion);
        return this;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda function. Higher-numbered
     * versions add fields that support new features.
     * </p>
     * 
     * @param lambdaVersion
     *        The user pool trigger version of the request that Amazon Cognito sends to your Lambda function.
     *        Higher-numbered versions add fields that support new features.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreTokenGenerationLambdaVersionType
     */

    public PreTokenGenerationVersionConfigType withLambdaVersion(PreTokenGenerationLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same value.
     * For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.</p>
     *        <p>
     *        This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same
     *        value. For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same value.
     * For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.</p>
     *         <p>
     *         This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the
     *         same value. For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same value.
     * For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda trigger.</p>
     *        <p>
     *        This parameter and the <code>PreTokenGeneration</code> property of <code>LambdaConfig</code> have the same
     *        value. For new instances of pre token generation triggers, set <code>LambdaArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreTokenGenerationVersionConfigType withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
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
        if (getLambdaVersion() != null)
            sb.append("LambdaVersion: ").append(getLambdaVersion()).append(",");
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreTokenGenerationVersionConfigType == false)
            return false;
        PreTokenGenerationVersionConfigType other = (PreTokenGenerationVersionConfigType) obj;
        if (other.getLambdaVersion() == null ^ this.getLambdaVersion() == null)
            return false;
        if (other.getLambdaVersion() != null && other.getLambdaVersion().equals(this.getLambdaVersion()) == false)
            return false;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaVersion() == null) ? 0 : getLambdaVersion().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public PreTokenGenerationVersionConfigType clone() {
        try {
            return (PreTokenGenerationVersionConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.PreTokenGenerationVersionConfigTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
