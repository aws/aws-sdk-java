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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a file uploaded during chat.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AttachmentOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a file uploaded during chat.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of a file uploaded during chat.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An error associated with a file uploaded during chat.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * The name of a file uploaded during chat.
     * </p>
     * 
     * @param name
     *        The name of a file uploaded during chat.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a file uploaded during chat.
     * </p>
     * 
     * @return The name of a file uploaded during chat.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a file uploaded during chat.
     * </p>
     * 
     * @param name
     *        The name of a file uploaded during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentOutput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of a file uploaded during chat.
     * </p>
     * 
     * @param status
     *        The status of a file uploaded during chat.
     * @see AttachmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a file uploaded during chat.
     * </p>
     * 
     * @return The status of a file uploaded during chat.
     * @see AttachmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a file uploaded during chat.
     * </p>
     * 
     * @param status
     *        The status of a file uploaded during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public AttachmentOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a file uploaded during chat.
     * </p>
     * 
     * @param status
     *        The status of a file uploaded during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public AttachmentOutput withStatus(AttachmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error associated with a file uploaded during chat.
     * </p>
     * 
     * @param error
     *        An error associated with a file uploaded during chat.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * An error associated with a file uploaded during chat.
     * </p>
     * 
     * @return An error associated with a file uploaded during chat.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * An error associated with a file uploaded during chat.
     * </p>
     * 
     * @param error
     *        An error associated with a file uploaded during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentOutput withError(ErrorDetail error) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof AttachmentOutput == false)
            return false;
        AttachmentOutput other = (AttachmentOutput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentOutput clone() {
        try {
            return (AttachmentOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AttachmentOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
