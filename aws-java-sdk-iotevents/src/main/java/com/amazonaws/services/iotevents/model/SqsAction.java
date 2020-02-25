/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/SqsAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set
     * this to FALSE.
     * </p>
     */
    private Boolean useBase64;

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the SQS queue where the data is written.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     * 
     * @return The URL of the SQS queue where the data is written.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the SQS queue where the data is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsAction withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set
     * this to FALSE.
     * </p>
     * 
     * @param useBase64
     *        Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise,
     *        set this to FALSE.
     */

    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set
     * this to FALSE.
     * </p>
     * 
     * @return Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise,
     *         set this to FALSE.
     */

    public Boolean getUseBase64() {
        return this.useBase64;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set
     * this to FALSE.
     * </p>
     * 
     * @param useBase64
     *        Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise,
     *        set this to FALSE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsAction withUseBase64(Boolean useBase64) {
        setUseBase64(useBase64);
        return this;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set
     * this to FALSE.
     * </p>
     * 
     * @return Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise,
     *         set this to FALSE.
     */

    public Boolean isUseBase64() {
        return this.useBase64;
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getUseBase64() != null)
            sb.append("UseBase64: ").append(getUseBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsAction == false)
            return false;
        SqsAction other = (SqsAction) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getUseBase64() == null ^ this.getUseBase64() == null)
            return false;
        if (other.getUseBase64() != null && other.getUseBase64().equals(this.getUseBase64()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getUseBase64() == null) ? 0 : getUseBase64().hashCode());
        return hashCode;
    }

    @Override
    public SqsAction clone() {
        try {
            return (SqsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.SqsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
