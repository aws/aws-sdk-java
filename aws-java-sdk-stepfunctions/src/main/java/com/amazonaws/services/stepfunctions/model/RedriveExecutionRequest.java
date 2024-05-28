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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/RedriveExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedriveExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to be redriven.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     * specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the
     * request to ensure idempotency. The API will return idempotent responses for the last 10 client tokens used to
     * successfully redrive the execution. These client tokens are valid for up to 15 minutes after they are first used.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to be redriven.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to be redriven.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to be redriven.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution to be redriven.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to be redriven.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to be redriven.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedriveExecutionRequest withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     * specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the
     * request to ensure idempotency. The API will return idempotent responses for the last 10 client tokens used to
     * successfully redrive the execution. These client tokens are valid for up to 15 minutes after they are first used.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses
     *        it for the request to ensure idempotency. The API will return idempotent responses for the last 10 client
     *        tokens used to successfully redrive the execution. These client tokens are valid for up to 15 minutes
     *        after they are first used.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     * specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the
     * request to ensure idempotency. The API will return idempotent responses for the last 10 client tokens used to
     * successfully redrive the execution. These client tokens are valid for up to 15 minutes after they are first used.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses
     *         it for the request to ensure idempotency. The API will return idempotent responses for the last 10 client
     *         tokens used to successfully redrive the execution. These client tokens are valid for up to 15 minutes
     *         after they are first used.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     * specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the
     * request to ensure idempotency. The API will return idempotent responses for the last 10 client tokens used to
     * successfully redrive the execution. These client tokens are valid for up to 15 minutes after they are first used.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses
     *        it for the request to ensure idempotency. The API will return idempotent responses for the last 10 client
     *        tokens used to successfully redrive the execution. These client tokens are valid for up to 15 minutes
     *        after they are first used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedriveExecutionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedriveExecutionRequest == false)
            return false;
        RedriveExecutionRequest other = (RedriveExecutionRequest) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RedriveExecutionRequest clone() {
        return (RedriveExecutionRequest) super.clone();
    }

}
