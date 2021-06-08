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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single item in a batch that failed to perform the intended action because of an error preventing it from
 * succeeding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/FailedBatchItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedBatchItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     * BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows operations.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The error message that indicates why the batch item failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     * BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows operations.
     * </p>
     * 
     * @param id
     *        The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     *        BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows
     *        operations.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     * BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows operations.
     * </p>
     * 
     * @return The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     *         BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows
     *         operations.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     * BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows operations.
     * </p>
     * 
     * @param id
     *        The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and
     *        BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedBatchItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The error message that indicates why the batch item failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message that indicates why the batch item failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that indicates why the batch item failed.
     * </p>
     * 
     * @return The error message that indicates why the batch item failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that indicates why the batch item failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message that indicates why the batch item failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedBatchItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedBatchItem == false)
            return false;
        FailedBatchItem other = (FailedBatchItem) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedBatchItem clone() {
        try {
            return (FailedBatchItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.FailedBatchItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
