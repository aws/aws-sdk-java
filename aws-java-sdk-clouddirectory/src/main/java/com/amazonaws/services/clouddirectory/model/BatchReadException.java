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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The batch read exception structure, which contains the exception type and message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchReadException" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadException implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An exception message that is associated with the failure.
     * </p>
     */
    private String message;

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     * 
     * @param type
     *        A type of exception, such as <code>InvalidArnException</code>.
     * @see BatchReadExceptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     * 
     * @return A type of exception, such as <code>InvalidArnException</code>.
     * @see BatchReadExceptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     * 
     * @param type
     *        A type of exception, such as <code>InvalidArnException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchReadExceptionType
     */

    public BatchReadException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     * 
     * @param type
     *        A type of exception, such as <code>InvalidArnException</code>.
     * @see BatchReadExceptionType
     */

    public void setType(BatchReadExceptionType type) {
        withType(type);
    }

    /**
     * <p>
     * A type of exception, such as <code>InvalidArnException</code>.
     * </p>
     * 
     * @param type
     *        A type of exception, such as <code>InvalidArnException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchReadExceptionType
     */

    public BatchReadException withType(BatchReadExceptionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An exception message that is associated with the failure.
     * </p>
     * 
     * @param message
     *        An exception message that is associated with the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An exception message that is associated with the failure.
     * </p>
     * 
     * @return An exception message that is associated with the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An exception message that is associated with the failure.
     * </p>
     * 
     * @param message
     *        An exception message that is associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadException withMessage(String message) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof BatchReadException == false)
            return false;
        BatchReadException other = (BatchReadException) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchReadException clone() {
        try {
            return (BatchReadException) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchReadExceptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
