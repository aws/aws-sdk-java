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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The compression type, file format, and overwrite preference for the data export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/S3OutputConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3OutputConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compression type for the data export.
     * </p>
     */
    private String compression;
    /**
     * <p>
     * The file format for the data export.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The output type for the data export.
     * </p>
     */
    private String outputType;
    /**
     * <p>
     * The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     * previous version or to be delivered in addition to the previous versions. Overwriting exports can save on Amazon
     * S3 storage costs. Creating new export versions allows you to track the changes in cost and usage data over time.
     * </p>
     */
    private String overwrite;

    /**
     * <p>
     * The compression type for the data export.
     * </p>
     * 
     * @param compression
     *        The compression type for the data export.
     * @see CompressionOption
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * The compression type for the data export.
     * </p>
     * 
     * @return The compression type for the data export.
     * @see CompressionOption
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * The compression type for the data export.
     * </p>
     * 
     * @param compression
     *        The compression type for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionOption
     */

    public S3OutputConfigurations withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * The compression type for the data export.
     * </p>
     * 
     * @param compression
     *        The compression type for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionOption
     */

    public S3OutputConfigurations withCompression(CompressionOption compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * The file format for the data export.
     * </p>
     * 
     * @param format
     *        The file format for the data export.
     * @see FormatOption
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The file format for the data export.
     * </p>
     * 
     * @return The file format for the data export.
     * @see FormatOption
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The file format for the data export.
     * </p>
     * 
     * @param format
     *        The file format for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatOption
     */

    public S3OutputConfigurations withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The file format for the data export.
     * </p>
     * 
     * @param format
     *        The file format for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatOption
     */

    public S3OutputConfigurations withFormat(FormatOption format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The output type for the data export.
     * </p>
     * 
     * @param outputType
     *        The output type for the data export.
     * @see S3OutputType
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The output type for the data export.
     * </p>
     * 
     * @return The output type for the data export.
     * @see S3OutputType
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * The output type for the data export.
     * </p>
     * 
     * @param outputType
     *        The output type for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OutputType
     */

    public S3OutputConfigurations withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * The output type for the data export.
     * </p>
     * 
     * @param outputType
     *        The output type for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OutputType
     */

    public S3OutputConfigurations withOutputType(S3OutputType outputType) {
        this.outputType = outputType.toString();
        return this;
    }

    /**
     * <p>
     * The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     * previous version or to be delivered in addition to the previous versions. Overwriting exports can save on Amazon
     * S3 storage costs. Creating new export versions allows you to track the changes in cost and usage data over time.
     * </p>
     * 
     * @param overwrite
     *        The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     *        previous version or to be delivered in addition to the previous versions. Overwriting exports can save on
     *        Amazon S3 storage costs. Creating new export versions allows you to track the changes in cost and usage
     *        data over time.
     * @see OverwriteOption
     */

    public void setOverwrite(String overwrite) {
        this.overwrite = overwrite;
    }

    /**
     * <p>
     * The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     * previous version or to be delivered in addition to the previous versions. Overwriting exports can save on Amazon
     * S3 storage costs. Creating new export versions allows you to track the changes in cost and usage data over time.
     * </p>
     * 
     * @return The rule to follow when generating a version of the data export file. You have the choice to overwrite
     *         the previous version or to be delivered in addition to the previous versions. Overwriting exports can
     *         save on Amazon S3 storage costs. Creating new export versions allows you to track the changes in cost and
     *         usage data over time.
     * @see OverwriteOption
     */

    public String getOverwrite() {
        return this.overwrite;
    }

    /**
     * <p>
     * The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     * previous version or to be delivered in addition to the previous versions. Overwriting exports can save on Amazon
     * S3 storage costs. Creating new export versions allows you to track the changes in cost and usage data over time.
     * </p>
     * 
     * @param overwrite
     *        The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     *        previous version or to be delivered in addition to the previous versions. Overwriting exports can save on
     *        Amazon S3 storage costs. Creating new export versions allows you to track the changes in cost and usage
     *        data over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteOption
     */

    public S3OutputConfigurations withOverwrite(String overwrite) {
        setOverwrite(overwrite);
        return this;
    }

    /**
     * <p>
     * The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     * previous version or to be delivered in addition to the previous versions. Overwriting exports can save on Amazon
     * S3 storage costs. Creating new export versions allows you to track the changes in cost and usage data over time.
     * </p>
     * 
     * @param overwrite
     *        The rule to follow when generating a version of the data export file. You have the choice to overwrite the
     *        previous version or to be delivered in addition to the previous versions. Overwriting exports can save on
     *        Amazon S3 storage costs. Creating new export versions allows you to track the changes in cost and usage
     *        data over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteOption
     */

    public S3OutputConfigurations withOverwrite(OverwriteOption overwrite) {
        this.overwrite = overwrite.toString();
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
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType()).append(",");
        if (getOverwrite() != null)
            sb.append("Overwrite: ").append(getOverwrite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OutputConfigurations == false)
            return false;
        S3OutputConfigurations other = (S3OutputConfigurations) obj;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getOverwrite() == null ^ this.getOverwrite() == null)
            return false;
        if (other.getOverwrite() != null && other.getOverwrite().equals(this.getOverwrite()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode + ((getOverwrite() == null) ? 0 : getOverwrite().hashCode());
        return hashCode;
    }

    @Override
    public S3OutputConfigurations clone() {
        try {
            return (S3OutputConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.S3OutputConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
