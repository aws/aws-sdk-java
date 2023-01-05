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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure providing details of any failures that occurred.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileCacheFailureDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheFailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A message describing any failures that occurred.
     * </p>
     */
    private String message;

    /**
     * <p>
     * A message describing any failures that occurred.
     * </p>
     * 
     * @param message
     *        A message describing any failures that occurred.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing any failures that occurred.
     * </p>
     * 
     * @return A message describing any failures that occurred.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing any failures that occurred.
     * </p>
     * 
     * @param message
     *        A message describing any failures that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheFailureDetails withMessage(String message) {
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

        if (obj instanceof FileCacheFailureDetails == false)
            return false;
        FileCacheFailureDetails other = (FileCacheFailureDetails) obj;
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

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public FileCacheFailureDetails clone() {
        try {
            return (FileCacheFailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileCacheFailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
