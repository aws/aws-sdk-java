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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a content of an Amazon Connect file object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FileContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a File in Amazon Connect.
     * </p>
     */
    private String fileArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a File in Amazon Connect.
     * </p>
     * 
     * @param fileArn
     *        The Amazon Resource Name (ARN) of a File in Amazon Connect.
     */

    public void setFileArn(String fileArn) {
        this.fileArn = fileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a File in Amazon Connect.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a File in Amazon Connect.
     */

    public String getFileArn() {
        return this.fileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a File in Amazon Connect.
     * </p>
     * 
     * @param fileArn
     *        The Amazon Resource Name (ARN) of a File in Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileContent withFileArn(String fileArn) {
        setFileArn(fileArn);
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
        if (getFileArn() != null)
            sb.append("FileArn: ").append(getFileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileContent == false)
            return false;
        FileContent other = (FileContent) obj;
        if (other.getFileArn() == null ^ this.getFileArn() == null)
            return false;
        if (other.getFileArn() != null && other.getFileArn().equals(this.getFileArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileArn() == null) ? 0 : getFileArn().hashCode());
        return hashCode;
    }

    @Override
    public FileContent clone() {
        try {
            return (FileContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FileContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
