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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A channel is a named input source that training algorithms can consume. The validation dataset size is limited to
 * less than 2 GB. The training dataset size must be less than 100 GB. For more information, see .
 * </p>
 * <note>
 * <p>
 * A validation dataset must contain the same headers as the training dataset.
 * </p>
 * </note>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source for an AutoML channel.
     * </p>
     */
    private AutoMLDataSource dataSource;
    /**
     * <p>
     * You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     */
    private String targetAttributeName;
    /**
     * <p>
     * The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>. Channels
     * for training and validation must share the same <code>ContentType</code> and <code>TargetAttributeName</code>.
     * For information on specifying training and validation channel types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     * > <code>How to specify training and validation datasets</code> </a>.
     * </p>
     */
    private String channelType;

    /**
     * <p>
     * The data source for an AutoML channel.
     * </p>
     * 
     * @param dataSource
     *        The data source for an AutoML channel.
     */

    public void setDataSource(AutoMLDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source for an AutoML channel.
     * </p>
     * 
     * @return The data source for an AutoML channel.
     */

    public AutoMLDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source for an AutoML channel.
     * </p>
     * 
     * @param dataSource
     *        The data source for an AutoML channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLChannel withDataSource(AutoMLDataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * </p>
     * 
     * @return You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLChannel withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * </p>
     * 
     * @param compressionType
     *        You can use <code>Gzip</code> or <code>None</code>. The default value is <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLChannel withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, usually represented by 'y'.
     */

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @return The name of the target variable in supervised learning, usually represented by 'y'.
     */

    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, usually represented by 'y'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLChannel withTargetAttributeName(String targetAttributeName) {
        setTargetAttributeName(targetAttributeName);
        return this;
    }

    /**
     * <p>
     * The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * 
     * @param contentType
     *        The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * 
     * @return The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     *         <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     * <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * </p>
     * 
     * @param contentType
     *        The content type of the data from the input source. You can use <code>text/csv;header=present</code> or
     *        <code>x-application/vnd.amazon+parquet</code>. The default value is <code>text/csv;header=present</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLChannel withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>. Channels
     * for training and validation must share the same <code>ContentType</code> and <code>TargetAttributeName</code>.
     * For information on specifying training and validation channel types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     * > <code>How to specify training and validation datasets</code> </a>.
     * </p>
     * 
     * @param channelType
     *        The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>.
     *        Channels for training and validation must share the same <code>ContentType</code> and
     *        <code>TargetAttributeName</code>. For information on specifying training and validation channel types, see
     *        <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     *        > <code>How to specify training and validation datasets</code> </a>.
     * @see AutoMLChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>. Channels
     * for training and validation must share the same <code>ContentType</code> and <code>TargetAttributeName</code>.
     * For information on specifying training and validation channel types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     * > <code>How to specify training and validation datasets</code> </a>.
     * </p>
     * 
     * @return The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>.
     *         Channels for training and validation must share the same <code>ContentType</code> and
     *         <code>TargetAttributeName</code>. For information on specifying training and validation channel types,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     *         > <code>How to specify training and validation datasets</code> </a>.
     * @see AutoMLChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>. Channels
     * for training and validation must share the same <code>ContentType</code> and <code>TargetAttributeName</code>.
     * For information on specifying training and validation channel types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     * > <code>How to specify training and validation datasets</code> </a>.
     * </p>
     * 
     * @param channelType
     *        The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>.
     *        Channels for training and validation must share the same <code>ContentType</code> and
     *        <code>TargetAttributeName</code>. For information on specifying training and validation channel types, see
     *        <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     *        > <code>How to specify training and validation datasets</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLChannelType
     */

    public AutoMLChannel withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>. Channels
     * for training and validation must share the same <code>ContentType</code> and <code>TargetAttributeName</code>.
     * For information on specifying training and validation channel types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     * > <code>How to specify training and validation datasets</code> </a>.
     * </p>
     * 
     * @param channelType
     *        The channel type (optional) is an <code>enum</code> string. The default value is <code>training</code>.
     *        Channels for training and validation must share the same <code>ContentType</code> and
     *        <code>TargetAttributeName</code>. For information on specifying training and validation channel types, see
     *        <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-data-sources-training-or-validation"
     *        > <code>How to specify training and validation datasets</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLChannelType
     */

    public AutoMLChannel withChannelType(AutoMLChannelType channelType) {
        this.channelType = channelType.toString();
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
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: ").append(getTargetAttributeName()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLChannel == false)
            return false;
        AutoMLChannel other = (AutoMLChannel) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLChannel clone() {
        try {
            return (AutoMLChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
