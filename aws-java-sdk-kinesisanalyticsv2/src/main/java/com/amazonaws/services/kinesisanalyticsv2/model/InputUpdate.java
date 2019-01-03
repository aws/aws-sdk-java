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
 * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to a specific input configuration
 * (identified by the <code>InputId</code> of an application).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/InputUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input ID of the application input to be updated.
     * </p>
     */
    private String inputId;
    /**
     * <p>
     * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
     * </p>
     */
    private String namePrefixUpdate;
    /**
     * <p>
     * Describes updates to an <a>InputProcessingConfiguration</a>.
     * </p>
     */
    private InputProcessingConfigurationUpdate inputProcessingConfigurationUpdate;
    /**
     * <p>
     * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name
     * (ARN).
     * </p>
     */
    private KinesisStreamsInputUpdate kinesisStreamsInputUpdate;
    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
     * </p>
     */
    private KinesisFirehoseInputUpdate kinesisFirehoseInputUpdate;
    /**
     * <p>
     * Describes the data format on the streaming source, and how record elements on the streaming source map to columns
     * of the in-application stream that is created.
     * </p>
     */
    private InputSchemaUpdate inputSchemaUpdate;
    /**
     * <p>
     * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the
     * specific streaming source).
     * </p>
     */
    private InputParallelismUpdate inputParallelismUpdate;

    /**
     * <p>
     * The input ID of the application input to be updated.
     * </p>
     * 
     * @param inputId
     *        The input ID of the application input to be updated.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The input ID of the application input to be updated.
     * </p>
     * 
     * @return The input ID of the application input to be updated.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The input ID of the application input to be updated.
     * </p>
     * 
     * @param inputId
     *        The input ID of the application input to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * <p>
     * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
     * </p>
     * 
     * @param namePrefixUpdate
     *        The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming
     *        source.
     */

    public void setNamePrefixUpdate(String namePrefixUpdate) {
        this.namePrefixUpdate = namePrefixUpdate;
    }

    /**
     * <p>
     * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
     * </p>
     * 
     * @return The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming
     *         source.
     */

    public String getNamePrefixUpdate() {
        return this.namePrefixUpdate;
    }

    /**
     * <p>
     * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
     * </p>
     * 
     * @param namePrefixUpdate
     *        The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withNamePrefixUpdate(String namePrefixUpdate) {
        setNamePrefixUpdate(namePrefixUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to an <a>InputProcessingConfiguration</a>.
     * </p>
     * 
     * @param inputProcessingConfigurationUpdate
     *        Describes updates to an <a>InputProcessingConfiguration</a>.
     */

    public void setInputProcessingConfigurationUpdate(InputProcessingConfigurationUpdate inputProcessingConfigurationUpdate) {
        this.inputProcessingConfigurationUpdate = inputProcessingConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an <a>InputProcessingConfiguration</a>.
     * </p>
     * 
     * @return Describes updates to an <a>InputProcessingConfiguration</a>.
     */

    public InputProcessingConfigurationUpdate getInputProcessingConfigurationUpdate() {
        return this.inputProcessingConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an <a>InputProcessingConfiguration</a>.
     * </p>
     * 
     * @param inputProcessingConfigurationUpdate
     *        Describes updates to an <a>InputProcessingConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withInputProcessingConfigurationUpdate(InputProcessingConfigurationUpdate inputProcessingConfigurationUpdate) {
        setInputProcessingConfigurationUpdate(inputProcessingConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param kinesisStreamsInputUpdate
     *        If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource
     *        Name (ARN).
     */

    public void setKinesisStreamsInputUpdate(KinesisStreamsInputUpdate kinesisStreamsInputUpdate) {
        this.kinesisStreamsInputUpdate = kinesisStreamsInputUpdate;
    }

    /**
     * <p>
     * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @return If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon
     *         Resource Name (ARN).
     */

    public KinesisStreamsInputUpdate getKinesisStreamsInputUpdate() {
        return this.kinesisStreamsInputUpdate;
    }

    /**
     * <p>
     * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param kinesisStreamsInputUpdate
     *        If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource
     *        Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withKinesisStreamsInputUpdate(KinesisStreamsInputUpdate kinesisStreamsInputUpdate) {
        setKinesisStreamsInputUpdate(kinesisStreamsInputUpdate);
        return this;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
     * </p>
     * 
     * @param kinesisFirehoseInputUpdate
     *        If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated
     *        stream ARN.
     */

    public void setKinesisFirehoseInputUpdate(KinesisFirehoseInputUpdate kinesisFirehoseInputUpdate) {
        this.kinesisFirehoseInputUpdate = kinesisFirehoseInputUpdate;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
     * </p>
     * 
     * @return If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated
     *         stream ARN.
     */

    public KinesisFirehoseInputUpdate getKinesisFirehoseInputUpdate() {
        return this.kinesisFirehoseInputUpdate;
    }

    /**
     * <p>
     * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
     * </p>
     * 
     * @param kinesisFirehoseInputUpdate
     *        If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated
     *        stream ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withKinesisFirehoseInputUpdate(KinesisFirehoseInputUpdate kinesisFirehoseInputUpdate) {
        setKinesisFirehoseInputUpdate(kinesisFirehoseInputUpdate);
        return this;
    }

    /**
     * <p>
     * Describes the data format on the streaming source, and how record elements on the streaming source map to columns
     * of the in-application stream that is created.
     * </p>
     * 
     * @param inputSchemaUpdate
     *        Describes the data format on the streaming source, and how record elements on the streaming source map to
     *        columns of the in-application stream that is created.
     */

    public void setInputSchemaUpdate(InputSchemaUpdate inputSchemaUpdate) {
        this.inputSchemaUpdate = inputSchemaUpdate;
    }

    /**
     * <p>
     * Describes the data format on the streaming source, and how record elements on the streaming source map to columns
     * of the in-application stream that is created.
     * </p>
     * 
     * @return Describes the data format on the streaming source, and how record elements on the streaming source map to
     *         columns of the in-application stream that is created.
     */

    public InputSchemaUpdate getInputSchemaUpdate() {
        return this.inputSchemaUpdate;
    }

    /**
     * <p>
     * Describes the data format on the streaming source, and how record elements on the streaming source map to columns
     * of the in-application stream that is created.
     * </p>
     * 
     * @param inputSchemaUpdate
     *        Describes the data format on the streaming source, and how record elements on the streaming source map to
     *        columns of the in-application stream that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withInputSchemaUpdate(InputSchemaUpdate inputSchemaUpdate) {
        setInputSchemaUpdate(inputSchemaUpdate);
        return this;
    }

    /**
     * <p>
     * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the
     * specific streaming source).
     * </p>
     * 
     * @param inputParallelismUpdate
     *        Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for
     *        the specific streaming source).
     */

    public void setInputParallelismUpdate(InputParallelismUpdate inputParallelismUpdate) {
        this.inputParallelismUpdate = inputParallelismUpdate;
    }

    /**
     * <p>
     * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the
     * specific streaming source).
     * </p>
     * 
     * @return Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates
     *         for the specific streaming source).
     */

    public InputParallelismUpdate getInputParallelismUpdate() {
        return this.inputParallelismUpdate;
    }

    /**
     * <p>
     * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the
     * specific streaming source).
     * </p>
     * 
     * @param inputParallelismUpdate
     *        Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for
     *        the specific streaming source).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputUpdate withInputParallelismUpdate(InputParallelismUpdate inputParallelismUpdate) {
        setInputParallelismUpdate(inputParallelismUpdate);
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
        if (getNamePrefixUpdate() != null)
            sb.append("NamePrefixUpdate: ").append(getNamePrefixUpdate()).append(",");
        if (getInputProcessingConfigurationUpdate() != null)
            sb.append("InputProcessingConfigurationUpdate: ").append(getInputProcessingConfigurationUpdate()).append(",");
        if (getKinesisStreamsInputUpdate() != null)
            sb.append("KinesisStreamsInputUpdate: ").append(getKinesisStreamsInputUpdate()).append(",");
        if (getKinesisFirehoseInputUpdate() != null)
            sb.append("KinesisFirehoseInputUpdate: ").append(getKinesisFirehoseInputUpdate()).append(",");
        if (getInputSchemaUpdate() != null)
            sb.append("InputSchemaUpdate: ").append(getInputSchemaUpdate()).append(",");
        if (getInputParallelismUpdate() != null)
            sb.append("InputParallelismUpdate: ").append(getInputParallelismUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputUpdate == false)
            return false;
        InputUpdate other = (InputUpdate) obj;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getNamePrefixUpdate() == null ^ this.getNamePrefixUpdate() == null)
            return false;
        if (other.getNamePrefixUpdate() != null && other.getNamePrefixUpdate().equals(this.getNamePrefixUpdate()) == false)
            return false;
        if (other.getInputProcessingConfigurationUpdate() == null ^ this.getInputProcessingConfigurationUpdate() == null)
            return false;
        if (other.getInputProcessingConfigurationUpdate() != null
                && other.getInputProcessingConfigurationUpdate().equals(this.getInputProcessingConfigurationUpdate()) == false)
            return false;
        if (other.getKinesisStreamsInputUpdate() == null ^ this.getKinesisStreamsInputUpdate() == null)
            return false;
        if (other.getKinesisStreamsInputUpdate() != null && other.getKinesisStreamsInputUpdate().equals(this.getKinesisStreamsInputUpdate()) == false)
            return false;
        if (other.getKinesisFirehoseInputUpdate() == null ^ this.getKinesisFirehoseInputUpdate() == null)
            return false;
        if (other.getKinesisFirehoseInputUpdate() != null && other.getKinesisFirehoseInputUpdate().equals(this.getKinesisFirehoseInputUpdate()) == false)
            return false;
        if (other.getInputSchemaUpdate() == null ^ this.getInputSchemaUpdate() == null)
            return false;
        if (other.getInputSchemaUpdate() != null && other.getInputSchemaUpdate().equals(this.getInputSchemaUpdate()) == false)
            return false;
        if (other.getInputParallelismUpdate() == null ^ this.getInputParallelismUpdate() == null)
            return false;
        if (other.getInputParallelismUpdate() != null && other.getInputParallelismUpdate().equals(this.getInputParallelismUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getNamePrefixUpdate() == null) ? 0 : getNamePrefixUpdate().hashCode());
        hashCode = prime * hashCode + ((getInputProcessingConfigurationUpdate() == null) ? 0 : getInputProcessingConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsInputUpdate() == null) ? 0 : getKinesisStreamsInputUpdate().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseInputUpdate() == null) ? 0 : getKinesisFirehoseInputUpdate().hashCode());
        hashCode = prime * hashCode + ((getInputSchemaUpdate() == null) ? 0 : getInputSchemaUpdate().hashCode());
        hashCode = prime * hashCode + ((getInputParallelismUpdate() == null) ? 0 : getInputParallelismUpdate().hashCode());
        return hashCode;
    }

    @Override
    public InputUpdate clone() {
        try {
            return (InputUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.InputUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
