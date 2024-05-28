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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the destination of the export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ExportDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data format of the final export job file, can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CSV</code> - A comma-separated values file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - A Json file.
     * </p>
     * </li>
     * </ul>
     */
    private String dataFormat;
    /**
     * <p>
     * An Amazon S3 pre-signed URL that points to the generated export file.
     * </p>
     */
    private String s3Url;

    /**
     * <p>
     * The data format of the final export job file, can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CSV</code> - A comma-separated values file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - A Json file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The data format of the final export job file, can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CSV</code> - A comma-separated values file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JSON</code> - A Json file.
     *        </p>
     *        </li>
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the final export job file, can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CSV</code> - A comma-separated values file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - A Json file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data format of the final export job file, can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CSV</code> - A comma-separated values file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JSON</code> - A Json file.
     *         </p>
     *         </li>
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the final export job file, can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CSV</code> - A comma-separated values file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - A Json file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The data format of the final export job file, can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CSV</code> - A comma-separated values file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JSON</code> - A Json file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public ExportDestination withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the final export job file, can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CSV</code> - A comma-separated values file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - A Json file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The data format of the final export job file, can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CSV</code> - A comma-separated values file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JSON</code> - A Json file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public ExportDestination withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * An Amazon S3 pre-signed URL that points to the generated export file.
     * </p>
     * 
     * @param s3Url
     *        An Amazon S3 pre-signed URL that points to the generated export file.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * An Amazon S3 pre-signed URL that points to the generated export file.
     * </p>
     * 
     * @return An Amazon S3 pre-signed URL that points to the generated export file.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * An Amazon S3 pre-signed URL that points to the generated export file.
     * </p>
     * 
     * @param s3Url
     *        An Amazon S3 pre-signed URL that points to the generated export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDestination withS3Url(String s3Url) {
        setS3Url(s3Url);
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
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportDestination == false)
            return false;
        ExportDestination other = (ExportDestination) obj;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        return hashCode;
    }

    @Override
    public ExportDestination clone() {
        try {
            return (ExportDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ExportDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
