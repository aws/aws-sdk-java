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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error for a request in the batch for BatchStartViewerSessionRevocation. Each error is related to a specific
 * channel-ARN and viewer-ID pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchStartViewerSessionRevocationError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartViewerSessionRevocationError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Channel ARN.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * Error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Error message, determined by the application.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The ID of the viewer session to revoke.
     * </p>
     */
    private String viewerId;

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @return Channel ARN.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationError withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @param code
     *        Error code.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @return Error code.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @param code
     *        Error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Error message, determined by the application.
     * </p>
     * 
     * @param message
     *        Error message, determined by the application.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error message, determined by the application.
     * </p>
     * 
     * @return Error message, determined by the application.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Error message, determined by the application.
     * </p>
     * 
     * @param message
     *        Error message, determined by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The ID of the viewer session to revoke.
     * </p>
     * 
     * @param viewerId
     *        The ID of the viewer session to revoke.
     */

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    /**
     * <p>
     * The ID of the viewer session to revoke.
     * </p>
     * 
     * @return The ID of the viewer session to revoke.
     */

    public String getViewerId() {
        return this.viewerId;
    }

    /**
     * <p>
     * The ID of the viewer session to revoke.
     * </p>
     * 
     * @param viewerId
     *        The ID of the viewer session to revoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationError withViewerId(String viewerId) {
        setViewerId(viewerId);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getViewerId() != null)
            sb.append("ViewerId: ").append(getViewerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStartViewerSessionRevocationError == false)
            return false;
        BatchStartViewerSessionRevocationError other = (BatchStartViewerSessionRevocationError) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getViewerId() == null ^ this.getViewerId() == null)
            return false;
        if (other.getViewerId() != null && other.getViewerId().equals(this.getViewerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getViewerId() == null) ? 0 : getViewerId().hashCode());
        return hashCode;
    }

    @Override
    public BatchStartViewerSessionRevocationError clone() {
        try {
            return (BatchStartViewerSessionRevocationError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.BatchStartViewerSessionRevocationErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
