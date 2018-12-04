/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A channel is a named input source that training algorithms can consume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The location of the channel data.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The MIME type of the data.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set it to
     * None.
     * </p>
     */
    private String compressionType;
    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In FILE mode, leave this field unset or set it to None.
     * </p>
     * <p/>
     */
    private String recordWrapperType;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The location of the channel data.
     * </p>
     * 
     * @param dataSource
     *        The location of the channel data.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the channel data.
     * </p>
     * 
     * @return The location of the channel data.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The location of the channel data.
     * </p>
     * 
     * @param dataSource
     *        The location of the channel data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The MIME type of the data.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the data.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the data.
     * </p>
     * 
     * @return The MIME type of the data.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the data.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set
     *        it to None.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @return If training data is compressed, the compression type. The default value is <code>None</code>.
     *         <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set
     *         it to None.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set
     *        it to None.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public Channel withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in PIPE input mode. In FILE mode, leave this field unset or set
     *        it to None.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public Channel withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In FILE mode, leave this field unset or set it to None.
     * </p>
     * <p/>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset
     *        Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In FILE mode, leave this field unset or set it to None.
     *        </p>
     * @see RecordWrapper
     */

    public void setRecordWrapperType(String recordWrapperType) {
        this.recordWrapperType = recordWrapperType;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In FILE mode, leave this field unset or set it to None.
     * </p>
     * <p/>
     * 
     * @return <p>
     *         Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *         RecordIO format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *         the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *         see <a href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset
     *         Using RecordIO</a>.
     *         </p>
     *         <p>
     *         In FILE mode, leave this field unset or set it to None.
     *         </p>
     * @see RecordWrapper
     */

    public String getRecordWrapperType() {
        return this.recordWrapperType;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In FILE mode, leave this field unset or set it to None.
     * </p>
     * <p/>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset
     *        Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In FILE mode, leave this field unset or set it to None.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordWrapper
     */

    public Channel withRecordWrapperType(String recordWrapperType) {
        setRecordWrapperType(recordWrapperType);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In FILE mode, leave this field unset or set it to None.
     * </p>
     * <p/>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format, in which caseAmazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/how_to/recordio.html?highlight=im2rec">Create a Dataset
     *        Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In FILE mode, leave this field unset or set it to None.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordWrapper
     */

    public Channel withRecordWrapperType(RecordWrapper recordWrapperType) {
        this.recordWrapperType = recordWrapperType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getRecordWrapperType() != null)
            sb.append("RecordWrapperType: ").append(getRecordWrapperType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
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
        if (other.getRecordWrapperType() == null ^ this.getRecordWrapperType() == null)
            return false;
        if (other.getRecordWrapperType() != null && other.getRecordWrapperType().equals(this.getRecordWrapperType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getRecordWrapperType() == null) ? 0 : getRecordWrapperType().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
