/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <a>GetOperationDetail</a> request includes the following element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetOperationDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOperationDetailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in
     * the response to the original request.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in
     * the response to the original request.
     * </p>
     * 
     * @param operationId
     *        The identifier for the operation for which you want to get the status. Amazon Route 53 returned the
     *        identifier in the response to the original request.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in
     * the response to the original request.
     * </p>
     * 
     * @return The identifier for the operation for which you want to get the status. Amazon Route 53 returned the
     *         identifier in the response to the original request.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in
     * the response to the original request.
     * </p>
     * 
     * @param operationId
     *        The identifier for the operation for which you want to get the status. Amazon Route 53 returned the
     *        identifier in the response to the original request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationDetailRequest withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOperationDetailRequest == false)
            return false;
        GetOperationDetailRequest other = (GetOperationDetailRequest) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public GetOperationDetailRequest clone() {
        return (GetOperationDetailRequest) super.clone();
    }

}
