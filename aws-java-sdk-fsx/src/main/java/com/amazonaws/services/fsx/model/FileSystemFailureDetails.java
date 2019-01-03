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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure providing details of any failures that occur when creating the file system has failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileSystemFailureDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemFailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Message describing the failures that occurred during file system creation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Message describing the failures that occurred during file system creation.
     * </p>
     * 
     * @param message
     *        Message describing the failures that occurred during file system creation.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message describing the failures that occurred during file system creation.
     * </p>
     * 
     * @return Message describing the failures that occurred during file system creation.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Message describing the failures that occurred during file system creation.
     * </p>
     * 
     * @param message
     *        Message describing the failures that occurred during file system creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemFailureDetails withMessage(String message) {
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

        if (obj instanceof FileSystemFailureDetails == false)
            return false;
        FileSystemFailureDetails other = (FileSystemFailureDetails) obj;
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
    public FileSystemFailureDetails clone() {
        try {
            return (FileSystemFailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileSystemFailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
