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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the input source of a transform job and the way the transform job consumes it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of the input data that the model can
     * consume.
     * </p>
     */
    private TransformDataSource dataSource;
    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each
     * http call to transfer data to the transform job.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses
     * the data for the transform job accordingly. The default value is <code>None</code>.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The method to use to split the transform job's data into smaller batches. If you don't want to split the data,
     * specify <code>None</code>. If you want to split records on a newline character boundary, specify
     * <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The default
     * value is <code>None</code>.
     * </p>
     * <p>
     * Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB limit.
     * For more information, see <a href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data
     * format</a>.
     * </p>
     * <note>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * </note>
     */
    private String splitType;

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of the input data that the model can
     * consume.
     * </p>
     * 
     * @param dataSource
     *        Describes the location of the channel data, which is, the S3 location of the input data that the model can
     *        consume.
     */

    public void setDataSource(TransformDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of the input data that the model can
     * consume.
     * </p>
     * 
     * @return Describes the location of the channel data, which is, the S3 location of the input data that the model
     *         can consume.
     */

    public TransformDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of the input data that the model can
     * consume.
     * </p>
     * 
     * @param dataSource
     *        Describes the location of the channel data, which is, the S3 location of the input data that the model can
     *        consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformInput withDataSource(TransformDataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each
     * http call to transfer data to the transform job.
     * </p>
     * 
     * @param contentType
     *        The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with
     *        each http call to transfer data to the transform job.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each
     * http call to transfer data to the transform job.
     * </p>
     * 
     * @return The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type
     *         with each http call to transfer data to the transform job.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each
     * http call to transfer data to the transform job.
     * </p>
     * 
     * @param contentType
     *        The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with
     *        each http call to transfer data to the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformInput withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses
     * the data for the transform job accordingly. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        If your transform data is compressed, specify the compression type. Amazon SageMaker automatically
     *        decompresses the data for the transform job accordingly. The default value is <code>None</code>.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses
     * the data for the transform job accordingly. The default value is <code>None</code>.
     * </p>
     * 
     * @return If your transform data is compressed, specify the compression type. Amazon SageMaker automatically
     *         decompresses the data for the transform job accordingly. The default value is <code>None</code>.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses
     * the data for the transform job accordingly. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        If your transform data is compressed, specify the compression type. Amazon SageMaker automatically
     *        decompresses the data for the transform job accordingly. The default value is <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public TransformInput withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses
     * the data for the transform job accordingly. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        If your transform data is compressed, specify the compression type. Amazon SageMaker automatically
     *        decompresses the data for the transform job accordingly. The default value is <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public TransformInput withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The method to use to split the transform job's data into smaller batches. If you don't want to split the data,
     * specify <code>None</code>. If you want to split records on a newline character boundary, specify
     * <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The default
     * value is <code>None</code>.
     * </p>
     * <p>
     * Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB limit.
     * For more information, see <a href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data
     * format</a>.
     * </p>
     * <note>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * </note>
     * 
     * @param splitType
     *        The method to use to split the transform job's data into smaller batches. If you don't want to split the
     *        data, specify <code>None</code>. If you want to split records on a newline character boundary, specify
     *        <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The
     *        default value is <code>None</code>. </p>
     *        <p>
     *        Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB
     *        limit. For more information, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data format</a>.
     *        </p>
     *        <note>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     *        </p>
     * @see SplitType
     */

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    /**
     * <p>
     * The method to use to split the transform job's data into smaller batches. If you don't want to split the data,
     * specify <code>None</code>. If you want to split records on a newline character boundary, specify
     * <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The default
     * value is <code>None</code>.
     * </p>
     * <p>
     * Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB limit.
     * For more information, see <a href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data
     * format</a>.
     * </p>
     * <note>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * </note>
     * 
     * @return The method to use to split the transform job's data into smaller batches. If you don't want to split the
     *         data, specify <code>None</code>. If you want to split records on a newline character boundary, specify
     *         <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The
     *         default value is <code>None</code>. </p>
     *         <p>
     *         Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB
     *         limit. For more information, see <a
     *         href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data format</a>.
     *         </p>
     *         <note>
     *         <p>
     *         For information about the <code>RecordIO</code> format, see <a
     *         href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     *         </p>
     * @see SplitType
     */

    public String getSplitType() {
        return this.splitType;
    }

    /**
     * <p>
     * The method to use to split the transform job's data into smaller batches. If you don't want to split the data,
     * specify <code>None</code>. If you want to split records on a newline character boundary, specify
     * <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The default
     * value is <code>None</code>.
     * </p>
     * <p>
     * Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB limit.
     * For more information, see <a href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data
     * format</a>.
     * </p>
     * <note>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * </note>
     * 
     * @param splitType
     *        The method to use to split the transform job's data into smaller batches. If you don't want to split the
     *        data, specify <code>None</code>. If you want to split records on a newline character boundary, specify
     *        <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The
     *        default value is <code>None</code>. </p>
     *        <p>
     *        Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB
     *        limit. For more information, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data format</a>.
     *        </p>
     *        <note>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SplitType
     */

    public TransformInput withSplitType(String splitType) {
        setSplitType(splitType);
        return this;
    }

    /**
     * <p>
     * The method to use to split the transform job's data into smaller batches. If you don't want to split the data,
     * specify <code>None</code>. If you want to split records on a newline character boundary, specify
     * <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The default
     * value is <code>None</code>.
     * </p>
     * <p>
     * Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB limit.
     * For more information, see <a href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data
     * format</a>.
     * </p>
     * <note>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * </note>
     * 
     * @param splitType
     *        The method to use to split the transform job's data into smaller batches. If you don't want to split the
     *        data, specify <code>None</code>. If you want to split records on a newline character boundary, specify
     *        <code>Line</code>. To split records according to the RecordIO format, specify <code>RecordIO</code>. The
     *        default value is <code>None</code>. </p>
     *        <p>
     *        Amazon SageMaker sends the maximum number of records per batch in each request up to the MaxPayloadInMB
     *        limit. For more information, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">RecordIO data format</a>.
     *        </p>
     *        <note>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SplitType
     */

    public TransformInput withSplitType(SplitType splitType) {
        this.splitType = splitType.toString();
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getSplitType() != null)
            sb.append("SplitType: ").append(getSplitType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformInput == false)
            return false;
        TransformInput other = (TransformInput) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getSplitType() == null ^ this.getSplitType() == null)
            return false;
        if (other.getSplitType() != null && other.getSplitType().equals(this.getSplitType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getSplitType() == null) ? 0 : getSplitType().hashCode());
        return hashCode;
    }

    @Override
    public TransformInput clone() {
        try {
            return (TransformInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
