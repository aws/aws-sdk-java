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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelImageCreationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     * </p>
     */
    private String imageBuildVersionArn;
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
     * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelImageCreationRequest withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
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

    public CancelImageCreationRequest withClientToken(String clientToken) {
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
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
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

        if (obj instanceof CancelImageCreationRequest == false)
            return false;
        CancelImageCreationRequest other = (CancelImageCreationRequest) obj;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
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

        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CancelImageCreationRequest clone() {
        return (CancelImageCreationRequest) super.clone();
    }

}
