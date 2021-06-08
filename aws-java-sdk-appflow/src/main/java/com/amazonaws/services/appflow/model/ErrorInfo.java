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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details in the event of a failed flow, including the failure count and the related error messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the failure count for the attempted flow.
     * </p>
     */
    private Long putFailuresCount;
    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     */
    private String executionMessage;

    /**
     * <p>
     * Specifies the failure count for the attempted flow.
     * </p>
     * 
     * @param putFailuresCount
     *        Specifies the failure count for the attempted flow.
     */

    public void setPutFailuresCount(Long putFailuresCount) {
        this.putFailuresCount = putFailuresCount;
    }

    /**
     * <p>
     * Specifies the failure count for the attempted flow.
     * </p>
     * 
     * @return Specifies the failure count for the attempted flow.
     */

    public Long getPutFailuresCount() {
        return this.putFailuresCount;
    }

    /**
     * <p>
     * Specifies the failure count for the attempted flow.
     * </p>
     * 
     * @param putFailuresCount
     *        Specifies the failure count for the attempted flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withPutFailuresCount(Long putFailuresCount) {
        setPutFailuresCount(putFailuresCount);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param executionMessage
     *        Specifies the error message that appears if a flow fails.
     */

    public void setExecutionMessage(String executionMessage) {
        this.executionMessage = executionMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @return Specifies the error message that appears if a flow fails.
     */

    public String getExecutionMessage() {
        return this.executionMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param executionMessage
     *        Specifies the error message that appears if a flow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withExecutionMessage(String executionMessage) {
        setExecutionMessage(executionMessage);
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
        if (getPutFailuresCount() != null)
            sb.append("PutFailuresCount: ").append(getPutFailuresCount()).append(",");
        if (getExecutionMessage() != null)
            sb.append("ExecutionMessage: ").append(getExecutionMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (other.getPutFailuresCount() == null ^ this.getPutFailuresCount() == null)
            return false;
        if (other.getPutFailuresCount() != null && other.getPutFailuresCount().equals(this.getPutFailuresCount()) == false)
            return false;
        if (other.getExecutionMessage() == null ^ this.getExecutionMessage() == null)
            return false;
        if (other.getExecutionMessage() != null && other.getExecutionMessage().equals(this.getExecutionMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPutFailuresCount() == null) ? 0 : getPutFailuresCount().hashCode());
        hashCode = prime * hashCode + ((getExecutionMessage() == null) ? 0 : getExecutionMessage().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInfo clone() {
        try {
            return (ErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
