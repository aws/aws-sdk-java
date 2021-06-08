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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a Lambda function that verifies requests to a bot or fulfilles the user's request to a bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/LambdaCodeHook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaCodeHook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     */
    private String lambdaARN;
    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * </p>
     */
    private String codeHookInterfaceVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param lambdaARN
     *        The Amazon Resource Name (ARN) of the Lambda function.
     */

    public void setLambdaARN(String lambdaARN) {
        this.lambdaARN = lambdaARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     */

    public String getLambdaARN() {
        return this.lambdaARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param lambdaARN
     *        The Amazon Resource Name (ARN) of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaCodeHook withLambdaARN(String lambdaARN) {
        setLambdaARN(lambdaARN);
        return this;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * </p>
     * 
     * @param codeHookInterfaceVersion
     *        The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     */

    public void setCodeHookInterfaceVersion(String codeHookInterfaceVersion) {
        this.codeHookInterfaceVersion = codeHookInterfaceVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * </p>
     * 
     * @return The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     */

    public String getCodeHookInterfaceVersion() {
        return this.codeHookInterfaceVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * </p>
     * 
     * @param codeHookInterfaceVersion
     *        The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaCodeHook withCodeHookInterfaceVersion(String codeHookInterfaceVersion) {
        setCodeHookInterfaceVersion(codeHookInterfaceVersion);
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
        if (getLambdaARN() != null)
            sb.append("LambdaARN: ").append(getLambdaARN()).append(",");
        if (getCodeHookInterfaceVersion() != null)
            sb.append("CodeHookInterfaceVersion: ").append(getCodeHookInterfaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaCodeHook == false)
            return false;
        LambdaCodeHook other = (LambdaCodeHook) obj;
        if (other.getLambdaARN() == null ^ this.getLambdaARN() == null)
            return false;
        if (other.getLambdaARN() != null && other.getLambdaARN().equals(this.getLambdaARN()) == false)
            return false;
        if (other.getCodeHookInterfaceVersion() == null ^ this.getCodeHookInterfaceVersion() == null)
            return false;
        if (other.getCodeHookInterfaceVersion() != null && other.getCodeHookInterfaceVersion().equals(this.getCodeHookInterfaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaARN() == null) ? 0 : getLambdaARN().hashCode());
        hashCode = prime * hashCode + ((getCodeHookInterfaceVersion() == null) ? 0 : getCodeHookInterfaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public LambdaCodeHook clone() {
        try {
            return (LambdaCodeHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.LambdaCodeHookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
