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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details about the policy generation error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/JobError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Specific information about the error. For example, which service quota was exceeded or which resource was not
     * found.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The job error code.
     * </p>
     * 
     * @param code
     *        The job error code.
     * @see JobErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The job error code.
     * </p>
     * 
     * @return The job error code.
     * @see JobErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The job error code.
     * </p>
     * 
     * @param code
     *        The job error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorCode
     */

    public JobError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The job error code.
     * </p>
     * 
     * @param code
     *        The job error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorCode
     */

    public JobError withCode(JobErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * Specific information about the error. For example, which service quota was exceeded or which resource was not
     * found.
     * </p>
     * 
     * @param message
     *        Specific information about the error. For example, which service quota was exceeded or which resource was
     *        not found.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specific information about the error. For example, which service quota was exceeded or which resource was not
     * found.
     * </p>
     * 
     * @return Specific information about the error. For example, which service quota was exceeded or which resource was
     *         not found.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specific information about the error. For example, which service quota was exceeded or which resource was not
     * found.
     * </p>
     * 
     * @param message
     *        Specific information about the error. For example, which service quota was exceeded or which resource was
     *        not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobError == false)
            return false;
        JobError other = (JobError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public JobError clone() {
        try {
            return (JobError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.JobErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
