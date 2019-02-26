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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value of the variable as a structure that specifies an output file URI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/OutputFileUriValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputFileUriValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     * </p>
     * 
     * @param fileName
     *        The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     * </p>
     * 
     * @return The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     * </p>
     * 
     * @param fileName
     *        The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputFileUriValue withFileName(String fileName) {
        setFileName(fileName);
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
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputFileUriValue == false)
            return false;
        OutputFileUriValue other = (OutputFileUriValue) obj;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        return hashCode;
    }

    @Override
    public OutputFileUriValue clone() {
        try {
            return (OutputFileUriValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.OutputFileUriValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
