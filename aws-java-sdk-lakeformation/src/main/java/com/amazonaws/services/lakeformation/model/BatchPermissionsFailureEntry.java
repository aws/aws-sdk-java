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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of failures when performing a batch grant or batch revoke operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchPermissionsFailureEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPermissionsFailureEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for an entry of the batch request.
     * </p>
     */
    private BatchPermissionsRequestEntry requestEntry;
    /**
     * <p>
     * An error message that applies to the failure of the entry.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * An identifier for an entry of the batch request.
     * </p>
     * 
     * @param requestEntry
     *        An identifier for an entry of the batch request.
     */

    public void setRequestEntry(BatchPermissionsRequestEntry requestEntry) {
        this.requestEntry = requestEntry;
    }

    /**
     * <p>
     * An identifier for an entry of the batch request.
     * </p>
     * 
     * @return An identifier for an entry of the batch request.
     */

    public BatchPermissionsRequestEntry getRequestEntry() {
        return this.requestEntry;
    }

    /**
     * <p>
     * An identifier for an entry of the batch request.
     * </p>
     * 
     * @param requestEntry
     *        An identifier for an entry of the batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPermissionsFailureEntry withRequestEntry(BatchPermissionsRequestEntry requestEntry) {
        setRequestEntry(requestEntry);
        return this;
    }

    /**
     * <p>
     * An error message that applies to the failure of the entry.
     * </p>
     * 
     * @param error
     *        An error message that applies to the failure of the entry.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message that applies to the failure of the entry.
     * </p>
     * 
     * @return An error message that applies to the failure of the entry.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * An error message that applies to the failure of the entry.
     * </p>
     * 
     * @param error
     *        An error message that applies to the failure of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPermissionsFailureEntry withError(ErrorDetail error) {
        setError(error);
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
        if (getRequestEntry() != null)
            sb.append("RequestEntry: ").append(getRequestEntry()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPermissionsFailureEntry == false)
            return false;
        BatchPermissionsFailureEntry other = (BatchPermissionsFailureEntry) obj;
        if (other.getRequestEntry() == null ^ this.getRequestEntry() == null)
            return false;
        if (other.getRequestEntry() != null && other.getRequestEntry().equals(this.getRequestEntry()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestEntry() == null) ? 0 : getRequestEntry().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public BatchPermissionsFailureEntry clone() {
        try {
            return (BatchPermissionsFailureEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.BatchPermissionsFailureEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
