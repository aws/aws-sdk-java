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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for logging access in a stage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessLogSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected $context variables. The format must
     * include at least $context.requestId.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the CloudWatch Logs log group to receive access logs.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     * 
     * @return The ARN of the CloudWatch Logs log group to receive access logs.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the CloudWatch Logs log group to receive access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessLogSettings withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected $context variables. The format must
     * include at least $context.requestId.
     * </p>
     * 
     * @param format
     *        A single line format of the access logs of data, as specified by selected $context variables. The format
     *        must include at least $context.requestId.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected $context variables. The format must
     * include at least $context.requestId.
     * </p>
     * 
     * @return A single line format of the access logs of data, as specified by selected $context variables. The format
     *         must include at least $context.requestId.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected $context variables. The format must
     * include at least $context.requestId.
     * </p>
     * 
     * @param format
     *        A single line format of the access logs of data, as specified by selected $context variables. The format
     *        must include at least $context.requestId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessLogSettings withFormat(String format) {
        setFormat(format);
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
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessLogSettings == false)
            return false;
        AccessLogSettings other = (AccessLogSettings) obj;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public AccessLogSettings clone() {
        try {
            return (AccessLogSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.AccessLogSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
