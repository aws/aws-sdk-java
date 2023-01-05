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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The code execution output in JSON format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StatementOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code execution output.
     * </p>
     */
    private StatementOutputData data;
    /**
     * <p>
     * The execution count of the output.
     * </p>
     */
    private Integer executionCount;
    /**
     * <p>
     * The status of the code execution output.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the error in the output.
     * </p>
     */
    private String errorName;
    /**
     * <p>
     * The error value of the output.
     * </p>
     */
    private String errorValue;
    /**
     * <p>
     * The traceback of the output.
     * </p>
     */
    private java.util.List<String> traceback;

    /**
     * <p>
     * The code execution output.
     * </p>
     * 
     * @param data
     *        The code execution output.
     */

    public void setData(StatementOutputData data) {
        this.data = data;
    }

    /**
     * <p>
     * The code execution output.
     * </p>
     * 
     * @return The code execution output.
     */

    public StatementOutputData getData() {
        return this.data;
    }

    /**
     * <p>
     * The code execution output.
     * </p>
     * 
     * @param data
     *        The code execution output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withData(StatementOutputData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The execution count of the output.
     * </p>
     * 
     * @param executionCount
     *        The execution count of the output.
     */

    public void setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
    }

    /**
     * <p>
     * The execution count of the output.
     * </p>
     * 
     * @return The execution count of the output.
     */

    public Integer getExecutionCount() {
        return this.executionCount;
    }

    /**
     * <p>
     * The execution count of the output.
     * </p>
     * 
     * @param executionCount
     *        The execution count of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withExecutionCount(Integer executionCount) {
        setExecutionCount(executionCount);
        return this;
    }

    /**
     * <p>
     * The status of the code execution output.
     * </p>
     * 
     * @param status
     *        The status of the code execution output.
     * @see StatementState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the code execution output.
     * </p>
     * 
     * @return The status of the code execution output.
     * @see StatementState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the code execution output.
     * </p>
     * 
     * @param status
     *        The status of the code execution output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementState
     */

    public StatementOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the code execution output.
     * </p>
     * 
     * @param status
     *        The status of the code execution output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementState
     */

    public StatementOutput withStatus(StatementState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the error in the output.
     * </p>
     * 
     * @param errorName
     *        The name of the error in the output.
     */

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    /**
     * <p>
     * The name of the error in the output.
     * </p>
     * 
     * @return The name of the error in the output.
     */

    public String getErrorName() {
        return this.errorName;
    }

    /**
     * <p>
     * The name of the error in the output.
     * </p>
     * 
     * @param errorName
     *        The name of the error in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withErrorName(String errorName) {
        setErrorName(errorName);
        return this;
    }

    /**
     * <p>
     * The error value of the output.
     * </p>
     * 
     * @param errorValue
     *        The error value of the output.
     */

    public void setErrorValue(String errorValue) {
        this.errorValue = errorValue;
    }

    /**
     * <p>
     * The error value of the output.
     * </p>
     * 
     * @return The error value of the output.
     */

    public String getErrorValue() {
        return this.errorValue;
    }

    /**
     * <p>
     * The error value of the output.
     * </p>
     * 
     * @param errorValue
     *        The error value of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withErrorValue(String errorValue) {
        setErrorValue(errorValue);
        return this;
    }

    /**
     * <p>
     * The traceback of the output.
     * </p>
     * 
     * @return The traceback of the output.
     */

    public java.util.List<String> getTraceback() {
        return traceback;
    }

    /**
     * <p>
     * The traceback of the output.
     * </p>
     * 
     * @param traceback
     *        The traceback of the output.
     */

    public void setTraceback(java.util.Collection<String> traceback) {
        if (traceback == null) {
            this.traceback = null;
            return;
        }

        this.traceback = new java.util.ArrayList<String>(traceback);
    }

    /**
     * <p>
     * The traceback of the output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraceback(java.util.Collection)} or {@link #withTraceback(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param traceback
     *        The traceback of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withTraceback(String... traceback) {
        if (this.traceback == null) {
            setTraceback(new java.util.ArrayList<String>(traceback.length));
        }
        for (String ele : traceback) {
            this.traceback.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The traceback of the output.
     * </p>
     * 
     * @param traceback
     *        The traceback of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutput withTraceback(java.util.Collection<String> traceback) {
        setTraceback(traceback);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getExecutionCount() != null)
            sb.append("ExecutionCount: ").append(getExecutionCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorName() != null)
            sb.append("ErrorName: ").append(getErrorName()).append(",");
        if (getErrorValue() != null)
            sb.append("ErrorValue: ").append(getErrorValue()).append(",");
        if (getTraceback() != null)
            sb.append("Traceback: ").append(getTraceback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatementOutput == false)
            return false;
        StatementOutput other = (StatementOutput) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getExecutionCount() == null ^ this.getExecutionCount() == null)
            return false;
        if (other.getExecutionCount() != null && other.getExecutionCount().equals(this.getExecutionCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorName() == null ^ this.getErrorName() == null)
            return false;
        if (other.getErrorName() != null && other.getErrorName().equals(this.getErrorName()) == false)
            return false;
        if (other.getErrorValue() == null ^ this.getErrorValue() == null)
            return false;
        if (other.getErrorValue() != null && other.getErrorValue().equals(this.getErrorValue()) == false)
            return false;
        if (other.getTraceback() == null ^ this.getTraceback() == null)
            return false;
        if (other.getTraceback() != null && other.getTraceback().equals(this.getTraceback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getExecutionCount() == null) ? 0 : getExecutionCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorName() == null) ? 0 : getErrorName().hashCode());
        hashCode = prime * hashCode + ((getErrorValue() == null) ? 0 : getErrorValue().hashCode());
        hashCode = prime * hashCode + ((getTraceback() == null) ? 0 : getTraceback().hashCode());
        return hashCode;
    }

    @Override
    public StatementOutput clone() {
        try {
            return (StatementOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StatementOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
