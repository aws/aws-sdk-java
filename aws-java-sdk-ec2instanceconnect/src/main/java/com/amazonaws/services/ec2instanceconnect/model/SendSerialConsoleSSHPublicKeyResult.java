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
package com.amazonaws.services.ec2instanceconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendSerialConsoleSSHPublicKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * Is true if the request succeeds and an error otherwise.
     * </p>
     */
    private Boolean success;

    /**
     * <p>
     * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     * </p>
     * 
     * @param requestId
     *        The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     * </p>
     * 
     * @return The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     * </p>
     * 
     * @param requestId
     *        The ID of the request. Please provide this ID when contacting AWS Support for assistance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSerialConsoleSSHPublicKeyResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * Is true if the request succeeds and an error otherwise.
     * </p>
     * 
     * @param success
     *        Is true if the request succeeds and an error otherwise.
     */

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * <p>
     * Is true if the request succeeds and an error otherwise.
     * </p>
     * 
     * @return Is true if the request succeeds and an error otherwise.
     */

    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * <p>
     * Is true if the request succeeds and an error otherwise.
     * </p>
     * 
     * @param success
     *        Is true if the request succeeds and an error otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSerialConsoleSSHPublicKeyResult withSuccess(Boolean success) {
        setSuccess(success);
        return this;
    }

    /**
     * <p>
     * Is true if the request succeeds and an error otherwise.
     * </p>
     * 
     * @return Is true if the request succeeds and an error otherwise.
     */

    public Boolean isSuccess() {
        return this.success;
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
        if (getSuccess() != null)
            sb.append("Success: ").append(getSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendSerialConsoleSSHPublicKeyResult == false)
            return false;
        SendSerialConsoleSSHPublicKeyResult other = (SendSerialConsoleSSHPublicKeyResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return hashCode;
    }

    @Override
    public SendSerialConsoleSSHPublicKeyResult clone() {
        try {
            return (SendSerialConsoleSSHPublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
