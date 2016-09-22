/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The TranserDomain response includes the following element.
 * </p>
 */
public class TransferDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        GetOperationDetail.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * 
     * @return Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *         GetOperationDetail.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        GetOperationDetail.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainResult withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("OperationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainResult == false)
            return false;
        TransferDomainResult other = (TransferDomainResult) obj;
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
    public TransferDomainResult clone() {
        try {
            return (TransferDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
