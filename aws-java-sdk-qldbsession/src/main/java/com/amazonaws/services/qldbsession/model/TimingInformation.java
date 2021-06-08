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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains server-side performance information for a command. Amazon QLDB captures timing information between the times
 * when it receives the request and when it sends the corresponding response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/TimingInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimingInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time that QLDB spent on processing the command, measured in milliseconds.
     * </p>
     */
    private Long processingTimeMilliseconds;

    /**
     * <p>
     * The amount of time that QLDB spent on processing the command, measured in milliseconds.
     * </p>
     * 
     * @param processingTimeMilliseconds
     *        The amount of time that QLDB spent on processing the command, measured in milliseconds.
     */

    public void setProcessingTimeMilliseconds(Long processingTimeMilliseconds) {
        this.processingTimeMilliseconds = processingTimeMilliseconds;
    }

    /**
     * <p>
     * The amount of time that QLDB spent on processing the command, measured in milliseconds.
     * </p>
     * 
     * @return The amount of time that QLDB spent on processing the command, measured in milliseconds.
     */

    public Long getProcessingTimeMilliseconds() {
        return this.processingTimeMilliseconds;
    }

    /**
     * <p>
     * The amount of time that QLDB spent on processing the command, measured in milliseconds.
     * </p>
     * 
     * @param processingTimeMilliseconds
     *        The amount of time that QLDB spent on processing the command, measured in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimingInformation withProcessingTimeMilliseconds(Long processingTimeMilliseconds) {
        setProcessingTimeMilliseconds(processingTimeMilliseconds);
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
        if (getProcessingTimeMilliseconds() != null)
            sb.append("ProcessingTimeMilliseconds: ").append(getProcessingTimeMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimingInformation == false)
            return false;
        TimingInformation other = (TimingInformation) obj;
        if (other.getProcessingTimeMilliseconds() == null ^ this.getProcessingTimeMilliseconds() == null)
            return false;
        if (other.getProcessingTimeMilliseconds() != null && other.getProcessingTimeMilliseconds().equals(this.getProcessingTimeMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingTimeMilliseconds() == null) ? 0 : getProcessingTimeMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public TimingInformation clone() {
        try {
            return (TimingInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.TimingInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
