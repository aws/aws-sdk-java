/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes updates to the output configuration identified by the <code>OutputId</code>.
 * </p>
 */
public class OutputUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the specific output configuration that you want to update.
     * </p>
     */
    private String outputId;
    /**
     * <p>
     * If you want to specify a different in-application stream for this output configuration, use this field to specify
     * the new in-application stream name.
     * </p>
     */
    private String nameUpdate;
    /**
     * <p>
     * Describes an Amazon Kinesis stream as the destination for the output.
     * </p>
     */
    private KinesisStreamsOutputUpdate kinesisStreamsOutputUpdate;
    /**
     * <p>
     * Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     * </p>
     */
    private KinesisFirehoseOutputUpdate kinesisFirehoseOutputUpdate;

    private DestinationSchema destinationSchemaUpdate;

    /**
     * <p>
     * Identifies the specific output configuration that you want to update.
     * </p>
     * 
     * @param outputId
     *        Identifies the specific output configuration that you want to update.
     */

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    /**
     * <p>
     * Identifies the specific output configuration that you want to update.
     * </p>
     * 
     * @return Identifies the specific output configuration that you want to update.
     */

    public String getOutputId() {
        return this.outputId;
    }

    /**
     * <p>
     * Identifies the specific output configuration that you want to update.
     * </p>
     * 
     * @param outputId
     *        Identifies the specific output configuration that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputUpdate withOutputId(String outputId) {
        setOutputId(outputId);
        return this;
    }

    /**
     * <p>
     * If you want to specify a different in-application stream for this output configuration, use this field to specify
     * the new in-application stream name.
     * </p>
     * 
     * @param nameUpdate
     *        If you want to specify a different in-application stream for this output configuration, use this field to
     *        specify the new in-application stream name.
     */

    public void setNameUpdate(String nameUpdate) {
        this.nameUpdate = nameUpdate;
    }

    /**
     * <p>
     * If you want to specify a different in-application stream for this output configuration, use this field to specify
     * the new in-application stream name.
     * </p>
     * 
     * @return If you want to specify a different in-application stream for this output configuration, use this field to
     *         specify the new in-application stream name.
     */

    public String getNameUpdate() {
        return this.nameUpdate;
    }

    /**
     * <p>
     * If you want to specify a different in-application stream for this output configuration, use this field to specify
     * the new in-application stream name.
     * </p>
     * 
     * @param nameUpdate
     *        If you want to specify a different in-application stream for this output configuration, use this field to
     *        specify the new in-application stream name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputUpdate withNameUpdate(String nameUpdate) {
        setNameUpdate(nameUpdate);
        return this;
    }

    /**
     * <p>
     * Describes an Amazon Kinesis stream as the destination for the output.
     * </p>
     * 
     * @param kinesisStreamsOutputUpdate
     *        Describes an Amazon Kinesis stream as the destination for the output.
     */

    public void setKinesisStreamsOutputUpdate(KinesisStreamsOutputUpdate kinesisStreamsOutputUpdate) {
        this.kinesisStreamsOutputUpdate = kinesisStreamsOutputUpdate;
    }

    /**
     * <p>
     * Describes an Amazon Kinesis stream as the destination for the output.
     * </p>
     * 
     * @return Describes an Amazon Kinesis stream as the destination for the output.
     */

    public KinesisStreamsOutputUpdate getKinesisStreamsOutputUpdate() {
        return this.kinesisStreamsOutputUpdate;
    }

    /**
     * <p>
     * Describes an Amazon Kinesis stream as the destination for the output.
     * </p>
     * 
     * @param kinesisStreamsOutputUpdate
     *        Describes an Amazon Kinesis stream as the destination for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputUpdate withKinesisStreamsOutputUpdate(KinesisStreamsOutputUpdate kinesisStreamsOutputUpdate) {
        setKinesisStreamsOutputUpdate(kinesisStreamsOutputUpdate);
        return this;
    }

    /**
     * <p>
     * Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     * </p>
     * 
     * @param kinesisFirehoseOutputUpdate
     *        Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     */

    public void setKinesisFirehoseOutputUpdate(KinesisFirehoseOutputUpdate kinesisFirehoseOutputUpdate) {
        this.kinesisFirehoseOutputUpdate = kinesisFirehoseOutputUpdate;
    }

    /**
     * <p>
     * Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     * </p>
     * 
     * @return Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     */

    public KinesisFirehoseOutputUpdate getKinesisFirehoseOutputUpdate() {
        return this.kinesisFirehoseOutputUpdate;
    }

    /**
     * <p>
     * Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     * </p>
     * 
     * @param kinesisFirehoseOutputUpdate
     *        Describes a Amazon Kinesis Firehose delivery stream as the destination for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputUpdate withKinesisFirehoseOutputUpdate(KinesisFirehoseOutputUpdate kinesisFirehoseOutputUpdate) {
        setKinesisFirehoseOutputUpdate(kinesisFirehoseOutputUpdate);
        return this;
    }

    /**
     * @param destinationSchemaUpdate
     */

    public void setDestinationSchemaUpdate(DestinationSchema destinationSchemaUpdate) {
        this.destinationSchemaUpdate = destinationSchemaUpdate;
    }

    /**
     * @return
     */

    public DestinationSchema getDestinationSchemaUpdate() {
        return this.destinationSchemaUpdate;
    }

    /**
     * @param destinationSchemaUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputUpdate withDestinationSchemaUpdate(DestinationSchema destinationSchemaUpdate) {
        setDestinationSchemaUpdate(destinationSchemaUpdate);
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
        if (getOutputId() != null)
            sb.append("OutputId: " + getOutputId() + ",");
        if (getNameUpdate() != null)
            sb.append("NameUpdate: " + getNameUpdate() + ",");
        if (getKinesisStreamsOutputUpdate() != null)
            sb.append("KinesisStreamsOutputUpdate: " + getKinesisStreamsOutputUpdate() + ",");
        if (getKinesisFirehoseOutputUpdate() != null)
            sb.append("KinesisFirehoseOutputUpdate: " + getKinesisFirehoseOutputUpdate() + ",");
        if (getDestinationSchemaUpdate() != null)
            sb.append("DestinationSchemaUpdate: " + getDestinationSchemaUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputUpdate == false)
            return false;
        OutputUpdate other = (OutputUpdate) obj;
        if (other.getOutputId() == null ^ this.getOutputId() == null)
            return false;
        if (other.getOutputId() != null && other.getOutputId().equals(this.getOutputId()) == false)
            return false;
        if (other.getNameUpdate() == null ^ this.getNameUpdate() == null)
            return false;
        if (other.getNameUpdate() != null && other.getNameUpdate().equals(this.getNameUpdate()) == false)
            return false;
        if (other.getKinesisStreamsOutputUpdate() == null ^ this.getKinesisStreamsOutputUpdate() == null)
            return false;
        if (other.getKinesisStreamsOutputUpdate() != null && other.getKinesisStreamsOutputUpdate().equals(this.getKinesisStreamsOutputUpdate()) == false)
            return false;
        if (other.getKinesisFirehoseOutputUpdate() == null ^ this.getKinesisFirehoseOutputUpdate() == null)
            return false;
        if (other.getKinesisFirehoseOutputUpdate() != null && other.getKinesisFirehoseOutputUpdate().equals(this.getKinesisFirehoseOutputUpdate()) == false)
            return false;
        if (other.getDestinationSchemaUpdate() == null ^ this.getDestinationSchemaUpdate() == null)
            return false;
        if (other.getDestinationSchemaUpdate() != null && other.getDestinationSchemaUpdate().equals(this.getDestinationSchemaUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputId() == null) ? 0 : getOutputId().hashCode());
        hashCode = prime * hashCode + ((getNameUpdate() == null) ? 0 : getNameUpdate().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsOutputUpdate() == null) ? 0 : getKinesisStreamsOutputUpdate().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseOutputUpdate() == null) ? 0 : getKinesisFirehoseOutputUpdate().hashCode());
        hashCode = prime * hashCode + ((getDestinationSchemaUpdate() == null) ? 0 : getDestinationSchemaUpdate().hashCode());
        return hashCode;
    }

    @Override
    public OutputUpdate clone() {
        try {
            return (OutputUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
