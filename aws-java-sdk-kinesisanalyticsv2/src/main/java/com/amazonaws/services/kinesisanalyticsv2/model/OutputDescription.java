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
 * For an SQL-based Amazon Kinesis Data Analytics application, describes the application output configuration, which
 * includes the in-application stream name and the destination where the stream data is written. The destination can be
 * a Kinesis data stream or a Kinesis Data Firehose delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/OutputDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     */
    private String outputId;
    /**
     * <p>
     * The name of the in-application stream that is configured as output.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the Kinesis data stream that is configured as the destination where output is written.
     * </p>
     */
    private KinesisStreamsOutputDescription kinesisStreamsOutputDescription;
    /**
     * <p>
     * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     * written.
     * </p>
     */
    private KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription;
    /**
     * <p>
     * Describes the Lambda function that is configured as the destination where output is written.
     * </p>
     */
    private LambdaOutputDescription lambdaOutputDescription;
    /**
     * <p>
     * The data format used for writing data to the destination.
     * </p>
     */
    private DestinationSchema destinationSchema;

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @param outputId
     *        A unique identifier for the output configuration.
     */

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @return A unique identifier for the output configuration.
     */

    public String getOutputId() {
        return this.outputId;
    }

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @param outputId
     *        A unique identifier for the output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withOutputId(String outputId) {
        setOutputId(outputId);
        return this;
    }

    /**
     * <p>
     * The name of the in-application stream that is configured as output.
     * </p>
     * 
     * @param name
     *        The name of the in-application stream that is configured as output.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the in-application stream that is configured as output.
     * </p>
     * 
     * @return The name of the in-application stream that is configured as output.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the in-application stream that is configured as output.
     * </p>
     * 
     * @param name
     *        The name of the in-application stream that is configured as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the Kinesis data stream that is configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisStreamsOutputDescription
     *        Describes the Kinesis data stream that is configured as the destination where output is written.
     */

    public void setKinesisStreamsOutputDescription(KinesisStreamsOutputDescription kinesisStreamsOutputDescription) {
        this.kinesisStreamsOutputDescription = kinesisStreamsOutputDescription;
    }

    /**
     * <p>
     * Describes the Kinesis data stream that is configured as the destination where output is written.
     * </p>
     * 
     * @return Describes the Kinesis data stream that is configured as the destination where output is written.
     */

    public KinesisStreamsOutputDescription getKinesisStreamsOutputDescription() {
        return this.kinesisStreamsOutputDescription;
    }

    /**
     * <p>
     * Describes the Kinesis data stream that is configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisStreamsOutputDescription
     *        Describes the Kinesis data stream that is configured as the destination where output is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withKinesisStreamsOutputDescription(KinesisStreamsOutputDescription kinesisStreamsOutputDescription) {
        setKinesisStreamsOutputDescription(kinesisStreamsOutputDescription);
        return this;
    }

    /**
     * <p>
     * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     * written.
     * </p>
     * 
     * @param kinesisFirehoseOutputDescription
     *        Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     *        written.
     */

    public void setKinesisFirehoseOutputDescription(KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription) {
        this.kinesisFirehoseOutputDescription = kinesisFirehoseOutputDescription;
    }

    /**
     * <p>
     * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     * written.
     * </p>
     * 
     * @return Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     *         written.
     */

    public KinesisFirehoseOutputDescription getKinesisFirehoseOutputDescription() {
        return this.kinesisFirehoseOutputDescription;
    }

    /**
     * <p>
     * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     * written.
     * </p>
     * 
     * @param kinesisFirehoseOutputDescription
     *        Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is
     *        written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withKinesisFirehoseOutputDescription(KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription) {
        setKinesisFirehoseOutputDescription(kinesisFirehoseOutputDescription);
        return this;
    }

    /**
     * <p>
     * Describes the Lambda function that is configured as the destination where output is written.
     * </p>
     * 
     * @param lambdaOutputDescription
     *        Describes the Lambda function that is configured as the destination where output is written.
     */

    public void setLambdaOutputDescription(LambdaOutputDescription lambdaOutputDescription) {
        this.lambdaOutputDescription = lambdaOutputDescription;
    }

    /**
     * <p>
     * Describes the Lambda function that is configured as the destination where output is written.
     * </p>
     * 
     * @return Describes the Lambda function that is configured as the destination where output is written.
     */

    public LambdaOutputDescription getLambdaOutputDescription() {
        return this.lambdaOutputDescription;
    }

    /**
     * <p>
     * Describes the Lambda function that is configured as the destination where output is written.
     * </p>
     * 
     * @param lambdaOutputDescription
     *        Describes the Lambda function that is configured as the destination where output is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withLambdaOutputDescription(LambdaOutputDescription lambdaOutputDescription) {
        setLambdaOutputDescription(lambdaOutputDescription);
        return this;
    }

    /**
     * <p>
     * The data format used for writing data to the destination.
     * </p>
     * 
     * @param destinationSchema
     *        The data format used for writing data to the destination.
     */

    public void setDestinationSchema(DestinationSchema destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    /**
     * <p>
     * The data format used for writing data to the destination.
     * </p>
     * 
     * @return The data format used for writing data to the destination.
     */

    public DestinationSchema getDestinationSchema() {
        return this.destinationSchema;
    }

    /**
     * <p>
     * The data format used for writing data to the destination.
     * </p>
     * 
     * @param destinationSchema
     *        The data format used for writing data to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withDestinationSchema(DestinationSchema destinationSchema) {
        setDestinationSchema(destinationSchema);
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
        if (getOutputId() != null)
            sb.append("OutputId: ").append(getOutputId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getKinesisStreamsOutputDescription() != null)
            sb.append("KinesisStreamsOutputDescription: ").append(getKinesisStreamsOutputDescription()).append(",");
        if (getKinesisFirehoseOutputDescription() != null)
            sb.append("KinesisFirehoseOutputDescription: ").append(getKinesisFirehoseOutputDescription()).append(",");
        if (getLambdaOutputDescription() != null)
            sb.append("LambdaOutputDescription: ").append(getLambdaOutputDescription()).append(",");
        if (getDestinationSchema() != null)
            sb.append("DestinationSchema: ").append(getDestinationSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDescription == false)
            return false;
        OutputDescription other = (OutputDescription) obj;
        if (other.getOutputId() == null ^ this.getOutputId() == null)
            return false;
        if (other.getOutputId() != null && other.getOutputId().equals(this.getOutputId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKinesisStreamsOutputDescription() == null ^ this.getKinesisStreamsOutputDescription() == null)
            return false;
        if (other.getKinesisStreamsOutputDescription() != null
                && other.getKinesisStreamsOutputDescription().equals(this.getKinesisStreamsOutputDescription()) == false)
            return false;
        if (other.getKinesisFirehoseOutputDescription() == null ^ this.getKinesisFirehoseOutputDescription() == null)
            return false;
        if (other.getKinesisFirehoseOutputDescription() != null
                && other.getKinesisFirehoseOutputDescription().equals(this.getKinesisFirehoseOutputDescription()) == false)
            return false;
        if (other.getLambdaOutputDescription() == null ^ this.getLambdaOutputDescription() == null)
            return false;
        if (other.getLambdaOutputDescription() != null && other.getLambdaOutputDescription().equals(this.getLambdaOutputDescription()) == false)
            return false;
        if (other.getDestinationSchema() == null ^ this.getDestinationSchema() == null)
            return false;
        if (other.getDestinationSchema() != null && other.getDestinationSchema().equals(this.getDestinationSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputId() == null) ? 0 : getOutputId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsOutputDescription() == null) ? 0 : getKinesisStreamsOutputDescription().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseOutputDescription() == null) ? 0 : getKinesisFirehoseOutputDescription().hashCode());
        hashCode = prime * hashCode + ((getLambdaOutputDescription() == null) ? 0 : getLambdaOutputDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationSchema() == null) ? 0 : getDestinationSchema().hashCode());
        return hashCode;
    }

    @Override
    public OutputDescription clone() {
        try {
            return (OutputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.OutputDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
