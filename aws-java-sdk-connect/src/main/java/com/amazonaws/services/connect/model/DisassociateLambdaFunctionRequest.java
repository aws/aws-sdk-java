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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateLambdaFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLambdaFunctionRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the Lambda function being disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLambdaFunctionRequest withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLambdaFunctionRequest == false)
            return false;
        DisassociateLambdaFunctionRequest other = (DisassociateLambdaFunctionRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateLambdaFunctionRequest clone() {
        return (DisassociateLambdaFunctionRequest) super.clone();
    }

}
