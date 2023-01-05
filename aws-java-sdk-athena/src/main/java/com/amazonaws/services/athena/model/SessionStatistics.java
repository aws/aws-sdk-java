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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains statistics for a notebook session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/SessionStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data processing unit execution time for a session in milliseconds.
     * </p>
     */
    private Long dpuExecutionInMillis;

    /**
     * <p>
     * The data processing unit execution time for a session in milliseconds.
     * </p>
     * 
     * @param dpuExecutionInMillis
     *        The data processing unit execution time for a session in milliseconds.
     */

    public void setDpuExecutionInMillis(Long dpuExecutionInMillis) {
        this.dpuExecutionInMillis = dpuExecutionInMillis;
    }

    /**
     * <p>
     * The data processing unit execution time for a session in milliseconds.
     * </p>
     * 
     * @return The data processing unit execution time for a session in milliseconds.
     */

    public Long getDpuExecutionInMillis() {
        return this.dpuExecutionInMillis;
    }

    /**
     * <p>
     * The data processing unit execution time for a session in milliseconds.
     * </p>
     * 
     * @param dpuExecutionInMillis
     *        The data processing unit execution time for a session in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatistics withDpuExecutionInMillis(Long dpuExecutionInMillis) {
        setDpuExecutionInMillis(dpuExecutionInMillis);
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
        if (getDpuExecutionInMillis() != null)
            sb.append("DpuExecutionInMillis: ").append(getDpuExecutionInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionStatistics == false)
            return false;
        SessionStatistics other = (SessionStatistics) obj;
        if (other.getDpuExecutionInMillis() == null ^ this.getDpuExecutionInMillis() == null)
            return false;
        if (other.getDpuExecutionInMillis() != null && other.getDpuExecutionInMillis().equals(this.getDpuExecutionInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDpuExecutionInMillis() == null) ? 0 : getDpuExecutionInMillis().hashCode());
        return hashCode;
    }

    @Override
    public SessionStatistics clone() {
        try {
            return (SessionStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.SessionStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
