/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * Output structure for the CancelJob operation.
 */
public class CancelJobResult implements Serializable, Cloneable {

    private Boolean success;

    /**
     * Sets the value of the Success property for this object.
     * 
     * @param success
     *        The new value for the Success property for this object.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Returns the value of the Success property for this object.
     * 
     * @return The value of the Success property for this object.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Sets the value of the Success property for this object.
     * 
     * @param success
     *        The new value for the Success property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CancelJobResult withSuccess(Boolean success) {
        setSuccess(success);
        return this;
    }

    /**
     * Returns the value of the Success property for this object.
     * 
     * @return The value of the Success property for this object.
     */
    public Boolean isSuccess() {
        return this.success;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccess() != null)
            sb.append("Success: " + getSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobResult == false)
            return false;
        CancelJobResult other = (CancelJobResult) obj;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null
                && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobResult clone() {
        try {
            return (CancelJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}