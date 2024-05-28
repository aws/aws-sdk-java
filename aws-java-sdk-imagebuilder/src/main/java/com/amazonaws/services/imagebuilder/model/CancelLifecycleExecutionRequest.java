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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelLifecycleExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelLifecycleExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the specific runtime instance of the image lifecycle to cancel.
     * </p>
     */
    private String lifecycleExecutionId;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Identifies the specific runtime instance of the image lifecycle to cancel.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Identifies the specific runtime instance of the image lifecycle to cancel.
     */

    public void setLifecycleExecutionId(String lifecycleExecutionId) {
        this.lifecycleExecutionId = lifecycleExecutionId;
    }

    /**
     * <p>
     * Identifies the specific runtime instance of the image lifecycle to cancel.
     * </p>
     * 
     * @return Identifies the specific runtime instance of the image lifecycle to cancel.
     */

    public String getLifecycleExecutionId() {
        return this.lifecycleExecutionId;
    }

    /**
     * <p>
     * Identifies the specific runtime instance of the image lifecycle to cancel.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Identifies the specific runtime instance of the image lifecycle to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLifecycleExecutionRequest withLifecycleExecutionId(String lifecycleExecutionId) {
        setLifecycleExecutionId(lifecycleExecutionId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLifecycleExecutionRequest withClientToken(String clientToken) {
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
        if (getLifecycleExecutionId() != null)
            sb.append("LifecycleExecutionId: ").append(getLifecycleExecutionId()).append(",");
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

        if (obj instanceof CancelLifecycleExecutionRequest == false)
            return false;
        CancelLifecycleExecutionRequest other = (CancelLifecycleExecutionRequest) obj;
        if (other.getLifecycleExecutionId() == null ^ this.getLifecycleExecutionId() == null)
            return false;
        if (other.getLifecycleExecutionId() != null && other.getLifecycleExecutionId().equals(this.getLifecycleExecutionId()) == false)
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

        hashCode = prime * hashCode + ((getLifecycleExecutionId() == null) ? 0 : getLifecycleExecutionId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CancelLifecycleExecutionRequest clone() {
        return (CancelLifecycleExecutionRequest) super.clone();
    }

}
