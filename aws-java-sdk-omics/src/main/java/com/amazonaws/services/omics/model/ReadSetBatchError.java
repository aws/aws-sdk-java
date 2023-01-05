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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error from a batch read set operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReadSetBatchError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadSetBatchError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error's code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The error's message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error's code.
     * </p>
     * 
     * @param code
     *        The error's code.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error's code.
     * </p>
     * 
     * @return The error's code.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error's code.
     * </p>
     * 
     * @param code
     *        The error's code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetBatchError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error's ID.
     * </p>
     * 
     * @param id
     *        The error's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The error's ID.
     * </p>
     * 
     * @return The error's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The error's ID.
     * </p>
     * 
     * @param id
     *        The error's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetBatchError withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The error's message.
     * </p>
     * 
     * @param message
     *        The error's message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error's message.
     * </p>
     * 
     * @return The error's message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error's message.
     * </p>
     * 
     * @param message
     *        The error's message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetBatchError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadSetBatchError == false)
            return false;
        ReadSetBatchError other = (ReadSetBatchError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ReadSetBatchError clone() {
        try {
            return (ReadSetBatchError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReadSetBatchErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
