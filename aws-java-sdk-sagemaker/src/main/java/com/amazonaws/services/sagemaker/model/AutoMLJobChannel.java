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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A channel is a named input source that training algorithms can consume. This channel is used for AutoML jobs V2 (jobs
 * created by calling <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html">CreateAutoMLJobV2</a>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of channel. Defines whether the data are used for training or validation. The default value is
     * <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     * <code>ContentType</code>
     * </p>
     * <note>
     * <p>
     * The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     * </p>
     * </note>
     */
    private String channelType;
    /**
     * <p>
     * The content type of the data from the input source. The following are the allowed content types for different
     * problems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The default
     * value is <code>image/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * The allowed compression types depend on the input format and problem type. We allow the compression type
     * <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the compression
     * type should be <code>None</code>. If no compression type is provided, we default to <code>None</code>.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The data source for an AutoML channel (Required).
     * </p>
     */
    private AutoMLDataSource dataSource;

    /**
     * <p>
     * The type of channel. Defines whether the data are used for training or validation. The default value is
     * <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     * <code>ContentType</code>
     * </p>
     * <note>
     * <p>
     * The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     * </p>
     * </note>
     * 
     * @param channelType
     *        The type of channel. Defines whether the data are used for training or validation. The default value is
     *        <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     *        <code>ContentType</code> </p> <note>
     *        <p>
     *        The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     *        </p>
     * @see AutoMLChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The type of channel. Defines whether the data are used for training or validation. The default value is
     * <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     * <code>ContentType</code>
     * </p>
     * <note>
     * <p>
     * The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     * </p>
     * </note>
     * 
     * @return The type of channel. Defines whether the data are used for training or validation. The default value is
     *         <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     *         <code>ContentType</code> </p> <note>
     *         <p>
     *         The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     *         </p>
     * @see AutoMLChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The type of channel. Defines whether the data are used for training or validation. The default value is
     * <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     * <code>ContentType</code>
     * </p>
     * <note>
     * <p>
     * The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     * </p>
     * </note>
     * 
     * @param channelType
     *        The type of channel. Defines whether the data are used for training or validation. The default value is
     *        <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     *        <code>ContentType</code> </p> <note>
     *        <p>
     *        The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLChannelType
     */

    public AutoMLJobChannel withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The type of channel. Defines whether the data are used for training or validation. The default value is
     * <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     * <code>ContentType</code>
     * </p>
     * <note>
     * <p>
     * The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     * </p>
     * </note>
     * 
     * @param channelType
     *        The type of channel. Defines whether the data are used for training or validation. The default value is
     *        <code>training</code>. Channels for <code>training</code> and <code>validation</code> must share the same
     *        <code>ContentType</code> </p> <note>
     *        <p>
     *        The type of channel defaults to <code>training</code> for the time-series forecasting problem type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLChannelType
     */

    public AutoMLJobChannel withChannelType(AutoMLChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * The content type of the data from the input source. The following are the allowed content types for different
     * problems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The default
     * value is <code>image/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The content type of the data from the input source. The following are the allowed content types for
     *        different problems:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The
     *        default value is <code>image/*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text classification: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the data from the input source. The following are the allowed content types for different
     * problems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The default
     * value is <code>image/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The content type of the data from the input source. The following are the allowed content types for
     *         different problems:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tabular problem types: <code>text/csv;header=present</code> or
     *         <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The
     *         default value is <code>image/*</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For text classification: <code>text/csv;header=present</code> or
     *         <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For time-series forecasting: <code>text/csv;header=present</code> or
     *         <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     *         <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *         </p>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the data from the input source. The following are the allowed content types for different
     * problems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The default
     * value is <code>image/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>text/csv;header=present</code> or <code>x-application/vnd.amazon+parquet</code>.
     * The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The content type of the data from the input source. The following are the allowed content types for
     *        different problems:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For image classification: <code>image/png</code>, <code>image/jpeg</code>, or <code>image/*</code>. The
     *        default value is <code>image/*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text classification: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting: <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation (LLMs fine-tuning): <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobChannel withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The allowed compression types depend on the input format and problem type. We allow the compression type
     * <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the compression
     * type should be <code>None</code>. If no compression type is provided, we default to <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        The allowed compression types depend on the input format and problem type. We allow the compression type
     *        <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the
     *        compression type should be <code>None</code>. If no compression type is provided, we default to
     *        <code>None</code>.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * The allowed compression types depend on the input format and problem type. We allow the compression type
     * <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the compression
     * type should be <code>None</code>. If no compression type is provided, we default to <code>None</code>.
     * </p>
     * 
     * @return The allowed compression types depend on the input format and problem type. We allow the compression type
     *         <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the
     *         compression type should be <code>None</code>. If no compression type is provided, we default to
     *         <code>None</code>.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * The allowed compression types depend on the input format and problem type. We allow the compression type
     * <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the compression
     * type should be <code>None</code>. If no compression type is provided, we default to <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        The allowed compression types depend on the input format and problem type. We allow the compression type
     *        <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the
     *        compression type should be <code>None</code>. If no compression type is provided, we default to
     *        <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLJobChannel withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * The allowed compression types depend on the input format and problem type. We allow the compression type
     * <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the compression
     * type should be <code>None</code>. If no compression type is provided, we default to <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        The allowed compression types depend on the input format and problem type. We allow the compression type
     *        <code>Gzip</code> for <code>S3Prefix</code> inputs on tabular data only. For all other inputs, the
     *        compression type should be <code>None</code>. If no compression type is provided, we default to
     *        <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLJobChannel withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The data source for an AutoML channel (Required).
     * </p>
     * 
     * @param dataSource
     *        The data source for an AutoML channel (Required).
     */

    public void setDataSource(AutoMLDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source for an AutoML channel (Required).
     * </p>
     * 
     * @return The data source for an AutoML channel (Required).
     */

    public AutoMLDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source for an AutoML channel (Required).
     * </p>
     * 
     * @param dataSource
     *        The data source for an AutoML channel (Required).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobChannel withDataSource(AutoMLDataSource dataSource) {
        setDataSource(dataSource);
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
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobChannel == false)
            return false;
        AutoMLJobChannel other = (AutoMLJobChannel) obj;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobChannel clone() {
        try {
            return (AutoMLJobChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
