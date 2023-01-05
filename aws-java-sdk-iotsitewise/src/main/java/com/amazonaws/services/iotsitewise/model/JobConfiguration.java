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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/JobConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file format of the data in Amazon S3.
     * </p>
     */
    private FileFormat fileFormat;

    /**
     * <p>
     * The file format of the data in Amazon S3.
     * </p>
     * 
     * @param fileFormat
     *        The file format of the data in Amazon S3.
     */

    public void setFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The file format of the data in Amazon S3.
     * </p>
     * 
     * @return The file format of the data in Amazon S3.
     */

    public FileFormat getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The file format of the data in Amazon S3.
     * </p>
     * 
     * @param fileFormat
     *        The file format of the data in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfiguration withFileFormat(FileFormat fileFormat) {
        setFileFormat(fileFormat);
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
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobConfiguration == false)
            return false;
        JobConfiguration other = (JobConfiguration) obj;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        return hashCode;
    }

    @Override
    public JobConfiguration clone() {
        try {
            return (JobConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.JobConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
