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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for the Dataview destination type parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DataViewDestinationTypeParams"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataViewDestinationTypeParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Destination type for a Dataview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GLUE_TABLE</code> – Glue table destination type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> – S3 destination type.
     * </p>
     * </li>
     * </ul>
     */
    private String destinationType;
    /**
     * <p>
     * Dataview export file format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> – Parquet export file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIMITED_TEXT</code> – Delimited text export file format.
     * </p>
     * </li>
     * </ul>
     */
    private String s3DestinationExportFileFormat;
    /**
     * <p>
     * Format Options for S3 Destination type.
     * </p>
     * <p>
     * Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     * </p>
     * <p>
     * <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     * </p>
     */
    private java.util.Map<String, String> s3DestinationExportFileFormatOptions;

    /**
     * <p>
     * Destination type for a Dataview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GLUE_TABLE</code> – Glue table destination type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> – S3 destination type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationType
     *        Destination type for a Dataview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GLUE_TABLE</code> – Glue table destination type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> – S3 destination type.
     *        </p>
     *        </li>
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * Destination type for a Dataview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GLUE_TABLE</code> – Glue table destination type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> – S3 destination type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Destination type for a Dataview.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GLUE_TABLE</code> – Glue table destination type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code> – S3 destination type.
     *         </p>
     *         </li>
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * Destination type for a Dataview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GLUE_TABLE</code> – Glue table destination type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> – S3 destination type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationType
     *        Destination type for a Dataview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GLUE_TABLE</code> – Glue table destination type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> – S3 destination type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataViewDestinationTypeParams withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * Dataview export file format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> – Parquet export file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIMITED_TEXT</code> – Delimited text export file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3DestinationExportFileFormat
     *        Dataview export file format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARQUET</code> – Parquet export file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIMITED_TEXT</code> – Delimited text export file format.
     *        </p>
     *        </li>
     * @see ExportFileFormat
     */

    public void setS3DestinationExportFileFormat(String s3DestinationExportFileFormat) {
        this.s3DestinationExportFileFormat = s3DestinationExportFileFormat;
    }

    /**
     * <p>
     * Dataview export file format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> – Parquet export file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIMITED_TEXT</code> – Delimited text export file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Dataview export file format.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PARQUET</code> – Parquet export file format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIMITED_TEXT</code> – Delimited text export file format.
     *         </p>
     *         </li>
     * @see ExportFileFormat
     */

    public String getS3DestinationExportFileFormat() {
        return this.s3DestinationExportFileFormat;
    }

    /**
     * <p>
     * Dataview export file format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> – Parquet export file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIMITED_TEXT</code> – Delimited text export file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3DestinationExportFileFormat
     *        Dataview export file format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARQUET</code> – Parquet export file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIMITED_TEXT</code> – Delimited text export file format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFileFormat
     */

    public DataViewDestinationTypeParams withS3DestinationExportFileFormat(String s3DestinationExportFileFormat) {
        setS3DestinationExportFileFormat(s3DestinationExportFileFormat);
        return this;
    }

    /**
     * <p>
     * Dataview export file format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> – Parquet export file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIMITED_TEXT</code> – Delimited text export file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3DestinationExportFileFormat
     *        Dataview export file format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARQUET</code> – Parquet export file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIMITED_TEXT</code> – Delimited text export file format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFileFormat
     */

    public DataViewDestinationTypeParams withS3DestinationExportFileFormat(ExportFileFormat s3DestinationExportFileFormat) {
        this.s3DestinationExportFileFormat = s3DestinationExportFileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Format Options for S3 Destination type.
     * </p>
     * <p>
     * Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     * </p>
     * <p>
     * <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     * </p>
     * 
     * @return Format Options for S3 Destination type.</p>
     *         <p>
     *         Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     *         </p>
     *         <p>
     *         <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     */

    public java.util.Map<String, String> getS3DestinationExportFileFormatOptions() {
        return s3DestinationExportFileFormatOptions;
    }

    /**
     * <p>
     * Format Options for S3 Destination type.
     * </p>
     * <p>
     * Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     * </p>
     * <p>
     * <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     * </p>
     * 
     * @param s3DestinationExportFileFormatOptions
     *        Format Options for S3 Destination type.</p>
     *        <p>
     *        Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     *        </p>
     *        <p>
     *        <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     */

    public void setS3DestinationExportFileFormatOptions(java.util.Map<String, String> s3DestinationExportFileFormatOptions) {
        this.s3DestinationExportFileFormatOptions = s3DestinationExportFileFormatOptions;
    }

    /**
     * <p>
     * Format Options for S3 Destination type.
     * </p>
     * <p>
     * Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     * </p>
     * <p>
     * <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     * </p>
     * 
     * @param s3DestinationExportFileFormatOptions
     *        Format Options for S3 Destination type.</p>
     *        <p>
     *        Here is an example of how you could specify the <code>s3DestinationExportFileFormatOptions</code>
     *        </p>
     *        <p>
     *        <code> { "header": "true", "delimiter": ",", "compression": "gzip" }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataViewDestinationTypeParams withS3DestinationExportFileFormatOptions(java.util.Map<String, String> s3DestinationExportFileFormatOptions) {
        setS3DestinationExportFileFormatOptions(s3DestinationExportFileFormatOptions);
        return this;
    }

    /**
     * Add a single S3DestinationExportFileFormatOptions entry
     *
     * @see DataViewDestinationTypeParams#withS3DestinationExportFileFormatOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataViewDestinationTypeParams addS3DestinationExportFileFormatOptionsEntry(String key, String value) {
        if (null == this.s3DestinationExportFileFormatOptions) {
            this.s3DestinationExportFileFormatOptions = new java.util.HashMap<String, String>();
        }
        if (this.s3DestinationExportFileFormatOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.s3DestinationExportFileFormatOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into S3DestinationExportFileFormatOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataViewDestinationTypeParams clearS3DestinationExportFileFormatOptionsEntries() {
        this.s3DestinationExportFileFormatOptions = null;
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
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getS3DestinationExportFileFormat() != null)
            sb.append("S3DestinationExportFileFormat: ").append(getS3DestinationExportFileFormat()).append(",");
        if (getS3DestinationExportFileFormatOptions() != null)
            sb.append("S3DestinationExportFileFormatOptions: ").append(getS3DestinationExportFileFormatOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataViewDestinationTypeParams == false)
            return false;
        DataViewDestinationTypeParams other = (DataViewDestinationTypeParams) obj;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getS3DestinationExportFileFormat() == null ^ this.getS3DestinationExportFileFormat() == null)
            return false;
        if (other.getS3DestinationExportFileFormat() != null
                && other.getS3DestinationExportFileFormat().equals(this.getS3DestinationExportFileFormat()) == false)
            return false;
        if (other.getS3DestinationExportFileFormatOptions() == null ^ this.getS3DestinationExportFileFormatOptions() == null)
            return false;
        if (other.getS3DestinationExportFileFormatOptions() != null
                && other.getS3DestinationExportFileFormatOptions().equals(this.getS3DestinationExportFileFormatOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationExportFileFormat() == null) ? 0 : getS3DestinationExportFileFormat().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationExportFileFormatOptions() == null) ? 0 : getS3DestinationExportFileFormatOptions().hashCode());
        return hashCode;
    }

    @Override
    public DataViewDestinationTypeParams clone() {
        try {
            return (DataViewDestinationTypeParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.DataViewDestinationTypeParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
