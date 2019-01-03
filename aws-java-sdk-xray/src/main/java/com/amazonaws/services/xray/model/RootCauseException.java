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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The exception associated with a root cause.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/RootCauseException" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RootCauseException implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the exception.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The message of the exception.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @param name
     *        The name of the exception.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @return The name of the exception.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @param name
     *        The name of the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCauseException withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The message of the exception.
     * </p>
     * 
     * @param message
     *        The message of the exception.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message of the exception.
     * </p>
     * 
     * @return The message of the exception.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message of the exception.
     * </p>
     * 
     * @param message
     *        The message of the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCauseException withMessage(String message) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof RootCauseException == false)
            return false;
        RootCauseException other = (RootCauseException) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public RootCauseException clone() {
        try {
            return (RootCauseException) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.RootCauseExceptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
