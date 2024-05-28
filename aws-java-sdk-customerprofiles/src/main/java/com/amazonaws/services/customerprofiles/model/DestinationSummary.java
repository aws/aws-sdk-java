/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the Kinesis data stream
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DestinationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The status of enabling the Kinesis stream as a destination for export.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the status last changed to <code>UNHEALHY</code>.
     * </p>
     */
    private java.util.Date unhealthySince;

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name.
     * </p>
     * 
     * @param uri
     *        The StreamARN of the destination to deliver profile events to. For example,
     *        arn:aws:kinesis:region:account-id:stream/stream-name.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name.
     * </p>
     * 
     * @return The StreamARN of the destination to deliver profile events to. For example,
     *         arn:aws:kinesis:region:account-id:stream/stream-name.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name.
     * </p>
     * 
     * @param uri
     *        The StreamARN of the destination to deliver profile events to. For example,
     *        arn:aws:kinesis:region:account-id:stream/stream-name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationSummary withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The status of enabling the Kinesis stream as a destination for export.
     * </p>
     * 
     * @param status
     *        The status of enabling the Kinesis stream as a destination for export.
     * @see EventStreamDestinationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of enabling the Kinesis stream as a destination for export.
     * </p>
     * 
     * @return The status of enabling the Kinesis stream as a destination for export.
     * @see EventStreamDestinationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of enabling the Kinesis stream as a destination for export.
     * </p>
     * 
     * @param status
     *        The status of enabling the Kinesis stream as a destination for export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStreamDestinationStatus
     */

    public DestinationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of enabling the Kinesis stream as a destination for export.
     * </p>
     * 
     * @param status
     *        The status of enabling the Kinesis stream as a destination for export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStreamDestinationStatus
     */

    public DestinationSummary withStatus(EventStreamDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the status last changed to <code>UNHEALHY</code>.
     * </p>
     * 
     * @param unhealthySince
     *        The timestamp when the status last changed to <code>UNHEALHY</code>.
     */

    public void setUnhealthySince(java.util.Date unhealthySince) {
        this.unhealthySince = unhealthySince;
    }

    /**
     * <p>
     * The timestamp when the status last changed to <code>UNHEALHY</code>.
     * </p>
     * 
     * @return The timestamp when the status last changed to <code>UNHEALHY</code>.
     */

    public java.util.Date getUnhealthySince() {
        return this.unhealthySince;
    }

    /**
     * <p>
     * The timestamp when the status last changed to <code>UNHEALHY</code>.
     * </p>
     * 
     * @param unhealthySince
     *        The timestamp when the status last changed to <code>UNHEALHY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationSummary withUnhealthySince(java.util.Date unhealthySince) {
        setUnhealthySince(unhealthySince);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUnhealthySince() != null)
            sb.append("UnhealthySince: ").append(getUnhealthySince());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationSummary == false)
            return false;
        DestinationSummary other = (DestinationSummary) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUnhealthySince() == null ^ this.getUnhealthySince() == null)
            return false;
        if (other.getUnhealthySince() != null && other.getUnhealthySince().equals(this.getUnhealthySince()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUnhealthySince() == null) ? 0 : getUnhealthySince().hashCode());
        return hashCode;
    }

    @Override
    public DestinationSummary clone() {
        try {
            return (DestinationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.DestinationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
