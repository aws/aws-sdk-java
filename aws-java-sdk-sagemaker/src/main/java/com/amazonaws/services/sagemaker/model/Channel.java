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
     * <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set it to
     * None.
     * </p>
     */
    private String compressionType;
    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In File mode, leave this field unset or set it to None.
     * </p>
     */
    private String recordWrapperType;
    /**
     * <p>
     * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     * <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     * parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a> request when
     * you have a channel that needs a different input mode from the training job's general setting. To download the
     * data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory
     * to a Docker volume, use <code>File</code> input mode. To stream data directly from Amazon S3 to the container,
     * choose <code>Pipe</code> input mode.
     * </p>
     * <p>
     * To use a model for incremental training, choose <code>File</code> input model.
     * </p>
     */
    private String inputMode;
    /**
     * <p>
     * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     * <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     * <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If
     * you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code>
     * is shuffled. The shuffling order is determined using the <code>Seed</code> value.
     * </p>
     * <p>
     * For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the
     * order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a
     * multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     * <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on
     * the first epoch might be sent to a different node on the second epoch.
     * </p>
     */
    private ShuffleConfig shuffleConfig;

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
     * <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set
     *        it to None.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @return If training data is compressed, the compression type. The default value is <code>None</code>.
     *         <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set
     *         it to None.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * If training data is compressed, the compression type. The default value is <code>None</code>.
     * <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set
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
     * <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set it to
     * None.
     * </p>
     * 
     * @param compressionType
     *        If training data is compressed, the compression type. The default value is <code>None</code>.
     *        <code>CompressionType</code> is used only in Pipe input mode. In File mode, leave this field unset or set
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
     * format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In File mode, leave this field unset or set it to None.
     * </p>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a
     *        Dataset Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In File mode, leave this field unset or set it to None.
     * @see RecordWrapper
     */

    public void setRecordWrapperType(String recordWrapperType) {
        this.recordWrapperType = recordWrapperType;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In File mode, leave this field unset or set it to None.
     * </p>
     * 
     * @return <p>
     *         Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *         RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *         the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *         see <a href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a
     *         Dataset Using RecordIO</a>.
     *         </p>
     *         <p>
     *         In File mode, leave this field unset or set it to None.
     * @see RecordWrapper
     */

    public String getRecordWrapperType() {
        return this.recordWrapperType;
    }

    /**
     * <p/>
     * <p>
     * Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO
     * format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In File mode, leave this field unset or set it to None.
     * </p>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a
     *        Dataset Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In File mode, leave this field unset or set it to None.
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
     * format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is
     * already in RecordIO format, you don't need to set this attribute. For more information, see <a
     * href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a Dataset Using
     * RecordIO</a>.
     * </p>
     * <p>
     * In File mode, leave this field unset or set it to None.
     * </p>
     * 
     * @param recordWrapperType
     *        <p>
     *        Specify RecordIO as the value when input data is in raw format but the training algorithm requires the
     *        RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If
     *        the input data is already in RecordIO format, you don't need to set this attribute. For more information,
     *        see <a href="https://mxnet.incubator.apache.org/architecture/note_data_loading.html#data-format">Create a
     *        Dataset Using RecordIO</a>.
     *        </p>
     *        <p>
     *        In File mode, leave this field unset or set it to None.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordWrapper
     */

    public Channel withRecordWrapperType(RecordWrapper recordWrapperType) {
        this.recordWrapperType = recordWrapperType.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     * <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     * parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a> request when
     * you have a channel that needs a different input mode from the training job's general setting. To download the
     * data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory
     * to a Docker volume, use <code>File</code> input mode. To stream data directly from Amazon S3 to the container,
     * choose <code>Pipe</code> input mode.
     * </p>
     * <p>
     * To use a model for incremental training, choose <code>File</code> input model.
     * </p>
     * 
     * @param inputMode
     *        (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     *        <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     *        parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a>
     *        request when you have a channel that needs a different input mode from the training job's general setting.
     *        To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume,
     *        and mount the directory to a Docker volume, use <code>File</code> input mode. To stream data directly from
     *        Amazon S3 to the container, choose <code>Pipe</code> input mode.</p>
     *        <p>
     *        To use a model for incremental training, choose <code>File</code> input model.
     * @see TrainingInputMode
     */

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    /**
     * <p>
     * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     * <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     * parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a> request when
     * you have a channel that needs a different input mode from the training job's general setting. To download the
     * data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory
     * to a Docker volume, use <code>File</code> input mode. To stream data directly from Amazon S3 to the container,
     * choose <code>Pipe</code> input mode.
     * </p>
     * <p>
     * To use a model for incremental training, choose <code>File</code> input model.
     * </p>
     * 
     * @return (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     *         <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     *         parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a>
     *         request when you have a channel that needs a different input mode from the training job's general
     *         setting. To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML
     *         storage volume, and mount the directory to a Docker volume, use <code>File</code> input mode. To stream
     *         data directly from Amazon S3 to the container, choose <code>Pipe</code> input mode.</p>
     *         <p>
     *         To use a model for incremental training, choose <code>File</code> input model.
     * @see TrainingInputMode
     */

    public String getInputMode() {
        return this.inputMode;
    }

    /**
     * <p>
     * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     * <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     * parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a> request when
     * you have a channel that needs a different input mode from the training job's general setting. To download the
     * data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory
     * to a Docker volume, use <code>File</code> input mode. To stream data directly from Amazon S3 to the container,
     * choose <code>Pipe</code> input mode.
     * </p>
     * <p>
     * To use a model for incremental training, choose <code>File</code> input model.
     * </p>
     * 
     * @param inputMode
     *        (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     *        <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     *        parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a>
     *        request when you have a channel that needs a different input mode from the training job's general setting.
     *        To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume,
     *        and mount the directory to a Docker volume, use <code>File</code> input mode. To stream data directly from
     *        Amazon S3 to the container, choose <code>Pipe</code> input mode.</p>
     *        <p>
     *        To use a model for incremental training, choose <code>File</code> input model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public Channel withInputMode(String inputMode) {
        setInputMode(inputMode);
        return this;
    }

    /**
     * <p>
     * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     * <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     * parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a> request when
     * you have a channel that needs a different input mode from the training job's general setting. To download the
     * data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory
     * to a Docker volume, use <code>File</code> input mode. To stream data directly from Amazon S3 to the container,
     * choose <code>Pipe</code> input mode.
     * </p>
     * <p>
     * To use a model for incremental training, choose <code>File</code> input model.
     * </p>
     * 
     * @param inputMode
     *        (Optional) The input mode to use for the data channel in a training job. If you don't set a value for
     *        <code>InputMode</code>, Amazon SageMaker uses the value set for <code>TrainingInputMode</code>. Use this
     *        parameter to override the <code>TrainingInputMode</code> setting in a <a>AlgorithmSpecification</a>
     *        request when you have a channel that needs a different input mode from the training job's general setting.
     *        To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume,
     *        and mount the directory to a Docker volume, use <code>File</code> input mode. To stream data directly from
     *        Amazon S3 to the container, choose <code>Pipe</code> input mode.</p>
     *        <p>
     *        To use a model for incremental training, choose <code>File</code> input model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public Channel withInputMode(TrainingInputMode inputMode) {
        this.inputMode = inputMode.toString();
        return this;
    }

    /**
     * <p>
     * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     * <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     * <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If
     * you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code>
     * is shuffled. The shuffling order is determined using the <code>Seed</code> value.
     * </p>
     * <p>
     * For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the
     * order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a
     * multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     * <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on
     * the first epoch might be sent to a different node on the second epoch.
     * </p>
     * 
     * @param shuffleConfig
     *        A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     *        <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     *        <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is
     *        shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the
     *        <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the
     *        <code>Seed</code> value.</p>
     *        <p>
     *        For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that
     *        the order of the training data is different for each epoch, it helps reduce bias and possible overfitting.
     *        In a multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     *        <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular
     *        node on the first epoch might be sent to a different node on the second epoch.
     */

    public void setShuffleConfig(ShuffleConfig shuffleConfig) {
        this.shuffleConfig = shuffleConfig;
    }

    /**
     * <p>
     * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     * <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     * <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If
     * you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code>
     * is shuffled. The shuffling order is determined using the <code>Seed</code> value.
     * </p>
     * <p>
     * For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the
     * order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a
     * multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     * <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on
     * the first epoch might be sent to a different node on the second epoch.
     * </p>
     * 
     * @return A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     *         <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     *         <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is
     *         shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the
     *         <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the
     *         <code>Seed</code> value.</p>
     *         <p>
     *         For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that
     *         the order of the training data is different for each epoch, it helps reduce bias and possible
     *         overfitting. In a multi-node training job when ShuffleConfig is combined with
     *         <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so
     *         that the content sent to a particular node on the first epoch might be sent to a different node on the
     *         second epoch.
     */

    public ShuffleConfig getShuffleConfig() {
        return this.shuffleConfig;
    }

    /**
     * <p>
     * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     * <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     * <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If
     * you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code>
     * is shuffled. The shuffling order is determined using the <code>Seed</code> value.
     * </p>
     * <p>
     * For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the
     * order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a
     * multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     * <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on
     * the first epoch might be sent to a different node on the second epoch.
     * </p>
     * 
     * @param shuffleConfig
     *        A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for
     *        <code>S3DataType</code>, this shuffles the results of the S3 key prefix matches. If you use
     *        <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is
     *        shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the
     *        <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the
     *        <code>Seed</code> value.</p>
     *        <p>
     *        For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that
     *        the order of the training data is different for each epoch, it helps reduce bias and possible overfitting.
     *        In a multi-node training job when ShuffleConfig is combined with <code>S3DataDistributionType</code> of
     *        <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular
     *        node on the first epoch might be sent to a different node on the second epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withShuffleConfig(ShuffleConfig shuffleConfig) {
        setShuffleConfig(shuffleConfig);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getRecordWrapperType() != null)
            sb.append("RecordWrapperType: ").append(getRecordWrapperType()).append(",");
        if (getInputMode() != null)
            sb.append("InputMode: ").append(getInputMode()).append(",");
        if (getShuffleConfig() != null)
            sb.append("ShuffleConfig: ").append(getShuffleConfig());
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
        if (other.getInputMode() == null ^ this.getInputMode() == null)
            return false;
        if (other.getInputMode() != null && other.getInputMode().equals(this.getInputMode()) == false)
            return false;
        if (other.getShuffleConfig() == null ^ this.getShuffleConfig() == null)
            return false;
        if (other.getShuffleConfig() != null && other.getShuffleConfig().equals(this.getShuffleConfig()) == false)
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
        hashCode = prime * hashCode + ((getInputMode() == null) ? 0 : getInputMode().hashCode());
        hashCode = prime * hashCode + ((getShuffleConfig() == null) ? 0 : getShuffleConfig().hashCode());
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
