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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the application input configuration for an SQL-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/InputDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to
     * each input configuration that you add to your application.
     * </p>
     */
    private String inputId;
    /**
     * <p>
     * The in-application name prefix.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * Returns the in-application stream names that are mapped to the stream source.
     * </p>
     */
    private java.util.List<String> inAppStreamNames;
    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     */
    private InputProcessingConfigurationDescription inputProcessingConfigurationDescription;
    /**
     * <p>
     * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource
     * Name (ARN).
     * </p>
     */
    private KinesisStreamsInputDescription kinesisStreamsInputDescription;
    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's
     * ARN.
     * </p>
     */
    private KinesisFirehoseInputDescription kinesisFirehoseInputDescription;
    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     */
    private SourceSchema inputSchema;
    /**
     * <p>
     * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     * </p>
     */
    private InputParallelism inputParallelism;
    /**
     * <p>
     * The point at which the application is configured to read from the input stream.
     * </p>
     */
    private InputStartingPositionConfiguration inputStartingPositionConfiguration;

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to
     * each input configuration that you add to your application.
     * </p>
     * 
     * @param inputId
     *        The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics
     *        assigns to each input configuration that you add to your application.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to
     * each input configuration that you add to your application.
     * </p>
     * 
     * @return The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics
     *         assigns to each input configuration that you add to your application.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to
     * each input configuration that you add to your application.
     * </p>
     * 
     * @param inputId
     *        The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics
     *        assigns to each input configuration that you add to your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * <p>
     * The in-application name prefix.
     * </p>
     * 
     * @param namePrefix
     *        The in-application name prefix.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * The in-application name prefix.
     * </p>
     * 
     * @return The in-application name prefix.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * The in-application name prefix.
     * </p>
     * 
     * @param namePrefix
     *        The in-application name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * Returns the in-application stream names that are mapped to the stream source.
     * </p>
     * 
     * @return Returns the in-application stream names that are mapped to the stream source.
     */

    public java.util.List<String> getInAppStreamNames() {
        return inAppStreamNames;
    }

    /**
     * <p>
     * Returns the in-application stream names that are mapped to the stream source.
     * </p>
     * 
     * @param inAppStreamNames
     *        Returns the in-application stream names that are mapped to the stream source.
     */

    public void setInAppStreamNames(java.util.Collection<String> inAppStreamNames) {
        if (inAppStreamNames == null) {
            this.inAppStreamNames = null;
            return;
        }

        this.inAppStreamNames = new java.util.ArrayList<String>(inAppStreamNames);
    }

    /**
     * <p>
     * Returns the in-application stream names that are mapped to the stream source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInAppStreamNames(java.util.Collection)} or {@link #withInAppStreamNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inAppStreamNames
     *        Returns the in-application stream names that are mapped to the stream source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInAppStreamNames(String... inAppStreamNames) {
        if (this.inAppStreamNames == null) {
            setInAppStreamNames(new java.util.ArrayList<String>(inAppStreamNames.length));
        }
        for (String ele : inAppStreamNames) {
            this.inAppStreamNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the in-application stream names that are mapped to the stream source.
     * </p>
     * 
     * @param inAppStreamNames
     *        Returns the in-application stream names that are mapped to the stream source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInAppStreamNames(java.util.Collection<String> inAppStreamNames) {
        setInAppStreamNames(inAppStreamNames);
        return this;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @param inputProcessingConfigurationDescription
     *        The description of the preprocessor that executes on records in this input before the application's code
     *        is run.
     */

    public void setInputProcessingConfigurationDescription(InputProcessingConfigurationDescription inputProcessingConfigurationDescription) {
        this.inputProcessingConfigurationDescription = inputProcessingConfigurationDescription;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @return The description of the preprocessor that executes on records in this input before the application's code
     *         is run.
     */

    public InputProcessingConfigurationDescription getInputProcessingConfigurationDescription() {
        return this.inputProcessingConfigurationDescription;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @param inputProcessingConfigurationDescription
     *        The description of the preprocessor that executes on records in this input before the application's code
     *        is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInputProcessingConfigurationDescription(InputProcessingConfigurationDescription inputProcessingConfigurationDescription) {
        setInputProcessingConfigurationDescription(inputProcessingConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource
     * Name (ARN).
     * </p>
     * 
     * @param kinesisStreamsInputDescription
     *        If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon
     *        Resource Name (ARN).
     */

    public void setKinesisStreamsInputDescription(KinesisStreamsInputDescription kinesisStreamsInputDescription) {
        this.kinesisStreamsInputDescription = kinesisStreamsInputDescription;
    }

    /**
     * <p>
     * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource
     * Name (ARN).
     * </p>
     * 
     * @return If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon
     *         Resource Name (ARN).
     */

    public KinesisStreamsInputDescription getKinesisStreamsInputDescription() {
        return this.kinesisStreamsInputDescription;
    }

    /**
     * <p>
     * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource
     * Name (ARN).
     * </p>
     * 
     * @param kinesisStreamsInputDescription
     *        If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon
     *        Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withKinesisStreamsInputDescription(KinesisStreamsInputDescription kinesisStreamsInputDescription) {
        setKinesisStreamsInputDescription(kinesisStreamsInputDescription);
        return this;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's
     * ARN.
     * </p>
     * 
     * @param kinesisFirehoseInputDescription
     *        If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery
     *        stream's ARN.
     */

    public void setKinesisFirehoseInputDescription(KinesisFirehoseInputDescription kinesisFirehoseInputDescription) {
        this.kinesisFirehoseInputDescription = kinesisFirehoseInputDescription;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's
     * ARN.
     * </p>
     * 
     * @return If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery
     *         stream's ARN.
     */

    public KinesisFirehoseInputDescription getKinesisFirehoseInputDescription() {
        return this.kinesisFirehoseInputDescription;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's
     * ARN.
     * </p>
     * 
     * @param kinesisFirehoseInputDescription
     *        If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery
     *        stream's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withKinesisFirehoseInputDescription(KinesisFirehoseInputDescription kinesisFirehoseInputDescription) {
        setKinesisFirehoseInputDescription(kinesisFirehoseInputDescription);
        return this;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * 
     * @param inputSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns in the in-application stream that is being created.
     */

    public void setInputSchema(SourceSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * 
     * @return Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *         columns in the in-application stream that is being created.
     */

    public SourceSchema getInputSchema() {
        return this.inputSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * in the in-application stream that is being created.
     * </p>
     * 
     * @param inputSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns in the in-application stream that is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInputSchema(SourceSchema inputSchema) {
        setInputSchema(inputSchema);
        return this;
    }

    /**
     * <p>
     * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     * </p>
     * 
     * @param inputParallelism
     *        Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     */

    public void setInputParallelism(InputParallelism inputParallelism) {
        this.inputParallelism = inputParallelism;
    }

    /**
     * <p>
     * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     * </p>
     * 
     * @return Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     */

    public InputParallelism getInputParallelism() {
        return this.inputParallelism;
    }

    /**
     * <p>
     * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     * </p>
     * 
     * @param inputParallelism
     *        Describes the configured parallelism (number of in-application streams mapped to the streaming source).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInputParallelism(InputParallelism inputParallelism) {
        setInputParallelism(inputParallelism);
        return this;
    }

    /**
     * <p>
     * The point at which the application is configured to read from the input stream.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        The point at which the application is configured to read from the input stream.
     */

    public void setInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        this.inputStartingPositionConfiguration = inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * The point at which the application is configured to read from the input stream.
     * </p>
     * 
     * @return The point at which the application is configured to read from the input stream.
     */

    public InputStartingPositionConfiguration getInputStartingPositionConfiguration() {
        return this.inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * The point at which the application is configured to read from the input stream.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        The point at which the application is configured to read from the input stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDescription withInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        setInputStartingPositionConfiguration(inputStartingPositionConfiguration);
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
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getInAppStreamNames() != null)
            sb.append("InAppStreamNames: ").append(getInAppStreamNames()).append(",");
        if (getInputProcessingConfigurationDescription() != null)
            sb.append("InputProcessingConfigurationDescription: ").append(getInputProcessingConfigurationDescription()).append(",");
        if (getKinesisStreamsInputDescription() != null)
            sb.append("KinesisStreamsInputDescription: ").append(getKinesisStreamsInputDescription()).append(",");
        if (getKinesisFirehoseInputDescription() != null)
            sb.append("KinesisFirehoseInputDescription: ").append(getKinesisFirehoseInputDescription()).append(",");
        if (getInputSchema() != null)
            sb.append("InputSchema: ").append(getInputSchema()).append(",");
        if (getInputParallelism() != null)
            sb.append("InputParallelism: ").append(getInputParallelism()).append(",");
        if (getInputStartingPositionConfiguration() != null)
            sb.append("InputStartingPositionConfiguration: ").append(getInputStartingPositionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDescription == false)
            return false;
        InputDescription other = (InputDescription) obj;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getInAppStreamNames() == null ^ this.getInAppStreamNames() == null)
            return false;
        if (other.getInAppStreamNames() != null && other.getInAppStreamNames().equals(this.getInAppStreamNames()) == false)
            return false;
        if (other.getInputProcessingConfigurationDescription() == null ^ this.getInputProcessingConfigurationDescription() == null)
            return false;
        if (other.getInputProcessingConfigurationDescription() != null
                && other.getInputProcessingConfigurationDescription().equals(this.getInputProcessingConfigurationDescription()) == false)
            return false;
        if (other.getKinesisStreamsInputDescription() == null ^ this.getKinesisStreamsInputDescription() == null)
            return false;
        if (other.getKinesisStreamsInputDescription() != null
                && other.getKinesisStreamsInputDescription().equals(this.getKinesisStreamsInputDescription()) == false)
            return false;
        if (other.getKinesisFirehoseInputDescription() == null ^ this.getKinesisFirehoseInputDescription() == null)
            return false;
        if (other.getKinesisFirehoseInputDescription() != null
                && other.getKinesisFirehoseInputDescription().equals(this.getKinesisFirehoseInputDescription()) == false)
            return false;
        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        if (other.getInputParallelism() == null ^ this.getInputParallelism() == null)
            return false;
        if (other.getInputParallelism() != null && other.getInputParallelism().equals(this.getInputParallelism()) == false)
            return false;
        if (other.getInputStartingPositionConfiguration() == null ^ this.getInputStartingPositionConfiguration() == null)
            return false;
        if (other.getInputStartingPositionConfiguration() != null
                && other.getInputStartingPositionConfiguration().equals(this.getInputStartingPositionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getInAppStreamNames() == null) ? 0 : getInAppStreamNames().hashCode());
        hashCode = prime * hashCode + ((getInputProcessingConfigurationDescription() == null) ? 0 : getInputProcessingConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsInputDescription() == null) ? 0 : getKinesisStreamsInputDescription().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseInputDescription() == null) ? 0 : getKinesisFirehoseInputDescription().hashCode());
        hashCode = prime * hashCode + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        hashCode = prime * hashCode + ((getInputParallelism() == null) ? 0 : getInputParallelism().hashCode());
        hashCode = prime * hashCode + ((getInputStartingPositionConfiguration() == null) ? 0 : getInputStartingPositionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public InputDescription clone() {
        try {
            return (InputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.InputDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
