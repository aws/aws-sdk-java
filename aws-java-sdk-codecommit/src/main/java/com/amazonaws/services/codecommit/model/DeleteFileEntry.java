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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A file that will be deleted as part of a commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFileEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full path of the file that will be deleted, including the name of the file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The full path of the file that will be deleted, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path of the file that will be deleted, including the name of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path of the file that will be deleted, including the name of the file.
     * </p>
     * 
     * @return The full path of the file that will be deleted, including the name of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The full path of the file that will be deleted, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path of the file that will be deleted, including the name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileEntry withFilePath(String filePath) {
        setFilePath(filePath);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileEntry == false)
            return false;
        DeleteFileEntry other = (DeleteFileEntry) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileEntry clone() {
        try {
            return (DeleteFileEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.DeleteFileEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
