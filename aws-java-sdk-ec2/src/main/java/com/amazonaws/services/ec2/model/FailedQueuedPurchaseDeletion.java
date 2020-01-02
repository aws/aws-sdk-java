/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Reserved Instance whose queued purchase was not deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FailedQueuedPurchaseDeletion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedQueuedPurchaseDeletion implements Serializable, Cloneable {

    /**
     * <p>
     * The error.
     * </p>
     */
    private DeleteQueuedReservedInstancesError error;
    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @param error
     *        The error.
     */

    public void setError(DeleteQueuedReservedInstancesError error) {
        this.error = error;
    }

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @return The error.
     */

    public DeleteQueuedReservedInstancesError getError() {
        return this.error;
    }

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @param error
     *        The error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedQueuedPurchaseDeletion withError(DeleteQueuedReservedInstancesError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @return The ID of the Reserved Instance.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedQueuedPurchaseDeletion withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedQueuedPurchaseDeletion == false)
            return false;
        FailedQueuedPurchaseDeletion other = (FailedQueuedPurchaseDeletion) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        return hashCode;
    }

    @Override
    public FailedQueuedPurchaseDeletion clone() {
        try {
            return (FailedQueuedPurchaseDeletion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
