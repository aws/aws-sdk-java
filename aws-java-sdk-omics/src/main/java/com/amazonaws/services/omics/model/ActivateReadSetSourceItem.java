/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A source for a read set activation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ActivateReadSetSourceItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateReadSetSourceItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source's read set ID.
     * </p>
     */
    private String readSetId;
    /**
     * <p>
     * The source's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The source's status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The source's read set ID.
     * </p>
     * 
     * @param readSetId
     *        The source's read set ID.
     */

    public void setReadSetId(String readSetId) {
        this.readSetId = readSetId;
    }

    /**
     * <p>
     * The source's read set ID.
     * </p>
     * 
     * @return The source's read set ID.
     */

    public String getReadSetId() {
        return this.readSetId;
    }

    /**
     * <p>
     * The source's read set ID.
     * </p>
     * 
     * @param readSetId
     *        The source's read set ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateReadSetSourceItem withReadSetId(String readSetId) {
        setReadSetId(readSetId);
        return this;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @see ReadSetActivationJobItemStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @return The source's status.
     * @see ReadSetActivationJobItemStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetActivationJobItemStatus
     */

    public ActivateReadSetSourceItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetActivationJobItemStatus
     */

    public ActivateReadSetSourceItem withStatus(ReadSetActivationJobItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @param statusMessage
     *        The source's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @return The source's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @param statusMessage
     *        The source's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateReadSetSourceItem withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getReadSetId() != null)
            sb.append("ReadSetId: ").append(getReadSetId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateReadSetSourceItem == false)
            return false;
        ActivateReadSetSourceItem other = (ActivateReadSetSourceItem) obj;
        if (other.getReadSetId() == null ^ this.getReadSetId() == null)
            return false;
        if (other.getReadSetId() != null && other.getReadSetId().equals(this.getReadSetId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadSetId() == null) ? 0 : getReadSetId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ActivateReadSetSourceItem clone() {
        try {
            return (ActivateReadSetSourceItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ActivateReadSetSourceItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
