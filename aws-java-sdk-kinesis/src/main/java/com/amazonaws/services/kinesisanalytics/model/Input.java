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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When you configure the application input, you specify the streaming source, the in-application stream name that is
 * created, and the mapping between the two. For more information, see <a
 * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
 * Input</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Input implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     * "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     * <code>InputParallelism</code> count you specified) in-application streams with names "MyInApplicationStream_001,"
     * "MyInApplicationStream_002," and so on.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are received
     * from the stream, before the application's SQL code executes. Currently, the only input processing configuration
     * available is <a>InputLambdaProcessor</a>.
     * </p>
     */
    private InputProcessingConfiguration inputProcessingConfiguration;
    /**
     * <p>
     * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an
     * IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     */
    private KinesisStreamsInput kinesisStreamsInput;
    /**
     * <p>
     * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and
     * an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     */
    private KinesisFirehoseInput kinesisFirehoseInput;
    /**
     * <p>
     * Describes the number of in-application streams to create.
     * </p>
     * <p>
     * Data from your source is routed to these in-application input streams.
     * </p>
     * <p>
     * (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     * Application Input</a>.
     * </p>
     */
    private InputParallelism inputParallelism;
    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * <p>
     * Also used to describe the format of the reference data source.
     * </p>
     */
    private SourceSchema inputSchema;

    /**
     * <p>
     * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     * "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     * <code>InputParallelism</code> count you specified) in-application streams with names "MyInApplicationStream_001,"
     * "MyInApplicationStream_002," and so on.
     * </p>
     * 
     * @param namePrefix
     *        Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     *        "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     *        <code>InputParallelism</code> count you specified) in-application streams with names
     *        "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     * "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     * <code>InputParallelism</code> count you specified) in-application streams with names "MyInApplicationStream_001,"
     * "MyInApplicationStream_002," and so on.
     * </p>
     * 
     * @return Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     *         "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     *         <code>InputParallelism</code> count you specified) in-application streams with names
     *         "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     * "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     * <code>InputParallelism</code> count you specified) in-application streams with names "MyInApplicationStream_001,"
     * "MyInApplicationStream_002," and so on.
     * </p>
     * 
     * @param namePrefix
     *        Name prefix to use when creating an in-application stream. Suppose that you specify a prefix
     *        "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the
     *        <code>InputParallelism</code> count you specified) in-application streams with names
     *        "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are received
     * from the stream, before the application's SQL code executes. Currently, the only input processing configuration
     * available is <a>InputLambdaProcessor</a>.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are
     *        received from the stream, before the application's SQL code executes. Currently, the only input processing
     *        configuration available is <a>InputLambdaProcessor</a>.
     */

    public void setInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are received
     * from the stream, before the application's SQL code executes. Currently, the only input processing configuration
     * available is <a>InputLambdaProcessor</a>.
     * </p>
     * 
     * @return The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are
     *         received from the stream, before the application's SQL code executes. Currently, the only input
     *         processing configuration available is <a>InputLambdaProcessor</a>.
     */

    public InputProcessingConfiguration getInputProcessingConfiguration() {
        return this.inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are received
     * from the stream, before the application's SQL code executes. Currently, the only input processing configuration
     * available is <a>InputLambdaProcessor</a>.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> for the input. An input processor transforms records as they are
     *        received from the stream, before the application's SQL code executes. Currently, the only input processing
     *        configuration available is <a>InputLambdaProcessor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        setInputProcessingConfiguration(inputProcessingConfiguration);
        return this;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an
     * IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @param kinesisStreamsInput
     *        If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN)
     *        and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *        <p>
     *        Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     */

    public void setKinesisStreamsInput(KinesisStreamsInput kinesisStreamsInput) {
        this.kinesisStreamsInput = kinesisStreamsInput;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an
     * IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @return If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN)
     *         and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *         <p>
     *         Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     */

    public KinesisStreamsInput getKinesisStreamsInput() {
        return this.kinesisStreamsInput;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an
     * IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @param kinesisStreamsInput
     *        If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN)
     *        and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *        <p>
     *        Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withKinesisStreamsInput(KinesisStreamsInput kinesisStreamsInput) {
        setKinesisStreamsInput(kinesisStreamsInput);
        return this;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and
     * an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @param kinesisFirehoseInput
     *        If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's
     *        ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *        <p>
     *        Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     */

    public void setKinesisFirehoseInput(KinesisFirehoseInput kinesisFirehoseInput) {
        this.kinesisFirehoseInput = kinesisFirehoseInput;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and
     * an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @return If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's
     *         ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *         <p>
     *         Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     */

    public KinesisFirehoseInput getKinesisFirehoseInput() {
        return this.kinesisFirehoseInput;
    }

    /**
     * <p>
     * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and
     * an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
     * </p>
     * <p>
     * Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * </p>
     * 
     * @param kinesisFirehoseInput
     *        If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's
     *        ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
     *        <p>
     *        Note: Either <code>KinesisStreamsInput</code> or <code>KinesisFirehoseInput</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withKinesisFirehoseInput(KinesisFirehoseInput kinesisFirehoseInput) {
        setKinesisFirehoseInput(kinesisFirehoseInput);
        return this;
    }

    /**
     * <p>
     * Describes the number of in-application streams to create.
     * </p>
     * <p>
     * Data from your source is routed to these in-application input streams.
     * </p>
     * <p>
     * (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     * Application Input</a>.
     * </p>
     * 
     * @param inputParallelism
     *        Describes the number of in-application streams to create. </p>
     *        <p>
     *        Data from your source is routed to these in-application input streams.
     *        </p>
     *        <p>
     *        (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     */

    public void setInputParallelism(InputParallelism inputParallelism) {
        this.inputParallelism = inputParallelism;
    }

    /**
     * <p>
     * Describes the number of in-application streams to create.
     * </p>
     * <p>
     * Data from your source is routed to these in-application input streams.
     * </p>
     * <p>
     * (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     * Application Input</a>.
     * </p>
     * 
     * @return Describes the number of in-application streams to create. </p>
     *         <p>
     *         Data from your source is routed to these in-application input streams.
     *         </p>
     *         <p>
     *         (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *         Application Input</a>.
     */

    public InputParallelism getInputParallelism() {
        return this.inputParallelism;
    }

    /**
     * <p>
     * Describes the number of in-application streams to create.
     * </p>
     * <p>
     * Data from your source is routed to these in-application input streams.
     * </p>
     * <p>
     * (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     * Application Input</a>.
     * </p>
     * 
     * @param inputParallelism
     *        Describes the number of in-application streams to create. </p>
     *        <p>
     *        Data from your source is routed to these in-application input streams.
     *        </p>
     *        <p>
     *        (see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withInputParallelism(InputParallelism inputParallelism) {
        setInputParallelism(inputParallelism);
        return this;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * <p>
     * Also used to describe the format of the reference data source.
     * </p>
     * 
     * @param inputSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns in the in-application stream that is being created.</p>
     *        <p>
     *        Also used to describe the format of the reference data source.
     */

    public void setInputSchema(SourceSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * <p>
     * Also used to describe the format of the reference data source.
     * </p>
     * 
     * @return Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *         columns in the in-application stream that is being created.</p>
     *         <p>
     *         Also used to describe the format of the reference data source.
     */

    public SourceSchema getInputSchema() {
        return this.inputSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * <p>
     * Also used to describe the format of the reference data source.
     * </p>
     * 
     * @param inputSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns in the in-application stream that is being created.</p>
     *        <p>
     *        Also used to describe the format of the reference data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withInputSchema(SourceSchema inputSchema) {
        setInputSchema(inputSchema);
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getInputProcessingConfiguration() != null)
            sb.append("InputProcessingConfiguration: ").append(getInputProcessingConfiguration()).append(",");
        if (getKinesisStreamsInput() != null)
            sb.append("KinesisStreamsInput: ").append(getKinesisStreamsInput()).append(",");
        if (getKinesisFirehoseInput() != null)
            sb.append("KinesisFirehoseInput: ").append(getKinesisFirehoseInput()).append(",");
        if (getInputParallelism() != null)
            sb.append("InputParallelism: ").append(getInputParallelism()).append(",");
        if (getInputSchema() != null)
            sb.append("InputSchema: ").append(getInputSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getInputProcessingConfiguration() == null ^ this.getInputProcessingConfiguration() == null)
            return false;
        if (other.getInputProcessingConfiguration() != null && other.getInputProcessingConfiguration().equals(this.getInputProcessingConfiguration()) == false)
            return false;
        if (other.getKinesisStreamsInput() == null ^ this.getKinesisStreamsInput() == null)
            return false;
        if (other.getKinesisStreamsInput() != null && other.getKinesisStreamsInput().equals(this.getKinesisStreamsInput()) == false)
            return false;
        if (other.getKinesisFirehoseInput() == null ^ this.getKinesisFirehoseInput() == null)
            return false;
        if (other.getKinesisFirehoseInput() != null && other.getKinesisFirehoseInput().equals(this.getKinesisFirehoseInput()) == false)
            return false;
        if (other.getInputParallelism() == null ^ this.getInputParallelism() == null)
            return false;
        if (other.getInputParallelism() != null && other.getInputParallelism().equals(this.getInputParallelism()) == false)
            return false;
        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getInputProcessingConfiguration() == null) ? 0 : getInputProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsInput() == null) ? 0 : getKinesisStreamsInput().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseInput() == null) ? 0 : getKinesisFirehoseInput().hashCode());
        hashCode = prime * hashCode + ((getInputParallelism() == null) ? 0 : getInputParallelism().hashCode());
        hashCode = prime * hashCode + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        return hashCode;
    }

    @Override
    public Input clone() {
        try {
            return (Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.InputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
