/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reason for a partial failure of an AutoML job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLPartialFailureReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLPartialFailureReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message containing the reason for a partial failure of an AutoML job.
     * </p>
     */
    private String partialFailureMessage;

    /**
     * <p>
     * The message containing the reason for a partial failure of an AutoML job.
     * </p>
     * 
     * @param partialFailureMessage
     *        The message containing the reason for a partial failure of an AutoML job.
     */

    public void setPartialFailureMessage(String partialFailureMessage) {
        this.partialFailureMessage = partialFailureMessage;
    }

    /**
     * <p>
     * The message containing the reason for a partial failure of an AutoML job.
     * </p>
     * 
     * @return The message containing the reason for a partial failure of an AutoML job.
     */

    public String getPartialFailureMessage() {
        return this.partialFailureMessage;
    }

    /**
     * <p>
     * The message containing the reason for a partial failure of an AutoML job.
     * </p>
     * 
     * @param partialFailureMessage
     *        The message containing the reason for a partial failure of an AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLPartialFailureReason withPartialFailureMessage(String partialFailureMessage) {
        setPartialFailureMessage(partialFailureMessage);
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
        if (getPartialFailureMessage() != null)
            sb.append("PartialFailureMessage: ").append(getPartialFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLPartialFailureReason == false)
            return false;
        AutoMLPartialFailureReason other = (AutoMLPartialFailureReason) obj;
        if (other.getPartialFailureMessage() == null ^ this.getPartialFailureMessage() == null)
            return false;
        if (other.getPartialFailureMessage() != null && other.getPartialFailureMessage().equals(this.getPartialFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartialFailureMessage() == null) ? 0 : getPartialFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLPartialFailureReason clone() {
        try {
            return (AutoMLPartialFailureReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLPartialFailureReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
