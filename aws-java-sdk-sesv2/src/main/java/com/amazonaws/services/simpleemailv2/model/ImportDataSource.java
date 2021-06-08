/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that contains details about the data source of the import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ImportDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     * </p>
     */
    private String s3Url;
    /**
     * <p>
     * The data format of the import job's data source.
     * </p>
     */
    private String dataFormat;

    /**
     * <p>
     * An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     * </p>
     * 
     * @param s3Url
     *        An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     * </p>
     * 
     * @return An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     * </p>
     * 
     * @param s3Url
     *        An Amazon S3 URL in the format s3://<i>&lt;bucket_name&gt;</i>/<i>&lt;object&gt;</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDataSource withS3Url(String s3Url) {
        setS3Url(s3Url);
        return this;
    }

    /**
     * <p>
     * The data format of the import job's data source.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the import job's data source.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the import job's data source.
     * </p>
     * 
     * @return The data format of the import job's data source.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the import job's data source.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the import job's data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public ImportDataSource withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the import job's data source.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the import job's data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public ImportDataSource withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
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
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDataSource == false)
            return false;
        ImportDataSource other = (ImportDataSource) obj;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        return hashCode;
    }

    @Override
    public ImportDataSource clone() {
        try {
            return (ImportDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ImportDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
