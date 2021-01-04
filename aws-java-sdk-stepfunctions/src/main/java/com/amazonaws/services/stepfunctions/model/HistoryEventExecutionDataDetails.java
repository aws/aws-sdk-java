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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about input or output in an execution history event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/HistoryEventExecutionDataDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryEventExecutionDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * </p>
     * 
     * @param truncated
     *        Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * </p>
     * 
     * @return Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * </p>
     * 
     * @param truncated
     *        Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEventExecutionDataDetails withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     * </p>
     * 
     * @return Indicates whether input or output was truncated in the response. Always <code>false</code> for API calls.
     */

    public Boolean isTruncated() {
        return this.truncated;
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
        if (getTruncated() != null)
            sb.append("Truncated: ").append(getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryEventExecutionDataDetails == false)
            return false;
        HistoryEventExecutionDataDetails other = (HistoryEventExecutionDataDetails) obj;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public HistoryEventExecutionDataDetails clone() {
        try {
            return (HistoryEventExecutionDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.HistoryEventExecutionDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
