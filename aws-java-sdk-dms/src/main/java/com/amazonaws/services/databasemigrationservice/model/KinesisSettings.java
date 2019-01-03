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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/KinesisSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * </p>
     */
    private String messageFormat;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * @see MessageFormatValue
     */

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * </p>
     * 
     * @return The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * @see MessageFormatValue
     */

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatValue
     */

    public KinesisSettings withMessageFormat(String messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatValue
     */

    public KinesisSettings withMessageFormat(MessageFormatValue messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisSettings == false)
            return false;
        KinesisSettings other = (KinesisSettings) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public KinesisSettings clone() {
        try {
            return (KinesisSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.KinesisSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
