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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a custom plugin file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CustomPluginFileDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPluginFileDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     * </p>
     */
    private String fileMd5;
    /**
     * <p>
     * The size in bytes of the custom plugin file. You can use it to validate the file.
     * </p>
     */
    private Long fileSize;

    /**
     * <p>
     * The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @param fileMd5
     *        The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     */

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    /**
     * <p>
     * The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @return The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     */

    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * <p>
     * The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @param fileMd5
     *        The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginFileDescription withFileMd5(String fileMd5) {
        setFileMd5(fileMd5);
        return this;
    }

    /**
     * <p>
     * The size in bytes of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @param fileSize
     *        The size in bytes of the custom plugin file. You can use it to validate the file.
     */

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * The size in bytes of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @return The size in bytes of the custom plugin file. You can use it to validate the file.
     */

    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * <p>
     * The size in bytes of the custom plugin file. You can use it to validate the file.
     * </p>
     * 
     * @param fileSize
     *        The size in bytes of the custom plugin file. You can use it to validate the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginFileDescription withFileSize(Long fileSize) {
        setFileSize(fileSize);
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
        if (getFileMd5() != null)
            sb.append("FileMd5: ").append(getFileMd5()).append(",");
        if (getFileSize() != null)
            sb.append("FileSize: ").append(getFileSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPluginFileDescription == false)
            return false;
        CustomPluginFileDescription other = (CustomPluginFileDescription) obj;
        if (other.getFileMd5() == null ^ this.getFileMd5() == null)
            return false;
        if (other.getFileMd5() != null && other.getFileMd5().equals(this.getFileMd5()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileMd5() == null) ? 0 : getFileMd5().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        return hashCode;
    }

    @Override
    public CustomPluginFileDescription clone() {
        try {
            return (CustomPluginFileDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CustomPluginFileDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
