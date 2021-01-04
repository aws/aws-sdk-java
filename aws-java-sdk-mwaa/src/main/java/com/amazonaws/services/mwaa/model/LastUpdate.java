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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Last update information for the environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/LastUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time that last update occurred.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Error string of last update, if applicable.
     * </p>
     */
    private UpdateError error;
    /**
     * <p>
     * Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Time that last update occurred.
     * </p>
     * 
     * @param createdAt
     *        Time that last update occurred.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Time that last update occurred.
     * </p>
     * 
     * @return Time that last update occurred.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Time that last update occurred.
     * </p>
     * 
     * @param createdAt
     *        Time that last update occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUpdate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Error string of last update, if applicable.
     * </p>
     * 
     * @param error
     *        Error string of last update, if applicable.
     */

    public void setError(UpdateError error) {
        this.error = error;
    }

    /**
     * <p>
     * Error string of last update, if applicable.
     * </p>
     * 
     * @return Error string of last update, if applicable.
     */

    public UpdateError getError() {
        return this.error;
    }

    /**
     * <p>
     * Error string of last update, if applicable.
     * </p>
     * 
     * @param error
     *        Error string of last update, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUpdate withError(UpdateError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * </p>
     * 
     * @param status
     *        Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * @see UpdateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * </p>
     * 
     * @return Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * @see UpdateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * </p>
     * 
     * @param status
     *        Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public LastUpdate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * </p>
     * 
     * @param status
     *        Status of last update of SUCCESS, FAILED, CREATING, DELETING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public LastUpdate withStatus(UpdateStatus status) {
        this.status = status.toString();
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastUpdate == false)
            return false;
        LastUpdate other = (LastUpdate) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LastUpdate clone() {
        try {
            return (LastUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.LastUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
