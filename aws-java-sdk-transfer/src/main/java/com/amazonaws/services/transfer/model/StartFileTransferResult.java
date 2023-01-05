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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFileTransferResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the unique identifier for this file transfer.
     * </p>
     */
    private String transferId;

    /**
     * <p>
     * Returns the unique identifier for this file transfer.
     * </p>
     * 
     * @param transferId
     *        Returns the unique identifier for this file transfer.
     */

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    /**
     * <p>
     * Returns the unique identifier for this file transfer.
     * </p>
     * 
     * @return Returns the unique identifier for this file transfer.
     */

    public String getTransferId() {
        return this.transferId;
    }

    /**
     * <p>
     * Returns the unique identifier for this file transfer.
     * </p>
     * 
     * @param transferId
     *        Returns the unique identifier for this file transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferResult withTransferId(String transferId) {
        setTransferId(transferId);
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
        if (getTransferId() != null)
            sb.append("TransferId: ").append(getTransferId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFileTransferResult == false)
            return false;
        StartFileTransferResult other = (StartFileTransferResult) obj;
        if (other.getTransferId() == null ^ this.getTransferId() == null)
            return false;
        if (other.getTransferId() != null && other.getTransferId().equals(this.getTransferId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransferId() == null) ? 0 : getTransferId().hashCode());
        return hashCode;
    }

    @Override
    public StartFileTransferResult clone() {
        try {
            return (StartFileTransferResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
