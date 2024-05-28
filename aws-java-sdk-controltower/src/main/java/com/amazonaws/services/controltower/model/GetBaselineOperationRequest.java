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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaselineOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBaselineOperationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     * </p>
     */
    private String operationIdentifier;

    /**
     * <p>
     * The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     * </p>
     * 
     * @param operationIdentifier
     *        The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     */

    public void setOperationIdentifier(String operationIdentifier) {
        this.operationIdentifier = operationIdentifier;
    }

    /**
     * <p>
     * The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     * </p>
     * 
     * @return The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     */

    public String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    /**
     * <p>
     * The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     * </p>
     * 
     * @param operationIdentifier
     *        The operation ID returned from mutating asynchronous APIs (Enable, Disable, Update, Reset).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineOperationRequest withOperationIdentifier(String operationIdentifier) {
        setOperationIdentifier(operationIdentifier);
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
        if (getOperationIdentifier() != null)
            sb.append("OperationIdentifier: ").append(getOperationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBaselineOperationRequest == false)
            return false;
        GetBaselineOperationRequest other = (GetBaselineOperationRequest) obj;
        if (other.getOperationIdentifier() == null ^ this.getOperationIdentifier() == null)
            return false;
        if (other.getOperationIdentifier() != null && other.getOperationIdentifier().equals(this.getOperationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationIdentifier() == null) ? 0 : getOperationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetBaselineOperationRequest clone() {
        return (GetBaselineOperationRequest) super.clone();
    }

}
