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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportVmImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportVmImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used as the
     * base image for the recipe that imported the VM.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The idempotency token that was used for this request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used as the
     * base image for the recipe that imported the VM.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used
     *        as the base image for the recipe that imported the VM.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used as the
     * base image for the recipe that imported the VM.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used
     *         as the base image for the recipe that imported the VM.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used as the
     * base image for the recipe that imported the VM.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the AMI that was created during the VM import process. This AMI is used
     *        as the base image for the recipe that imported the VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageResult withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The idempotency token that was used for this request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token that was used for this request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token that was used for this request.
     * </p>
     * 
     * @return The idempotency token that was used for this request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token that was used for this request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token that was used for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVmImageResult withClientToken(String clientToken) {
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
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

        if (obj instanceof ImportVmImageResult == false)
            return false;
        ImportVmImageResult other = (ImportVmImageResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
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

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ImportVmImageResult clone() {
        try {
            return (ImportVmImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
