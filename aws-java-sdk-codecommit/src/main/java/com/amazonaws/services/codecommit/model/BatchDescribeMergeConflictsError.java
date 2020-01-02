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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about errors in a BatchDescribeMergeConflicts operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflictsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeMergeConflictsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The name of the exception.
     * </p>
     */
    private String exceptionName;
    /**
     * <p>
     * The message provided by the exception.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The path to the file.
     * </p>
     * 
     * @param filePath
     *        The path to the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path to the file.
     * </p>
     * 
     * @return The path to the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The path to the file.
     * </p>
     * 
     * @param filePath
     *        The path to the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsError withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @param exceptionName
     *        The name of the exception.
     */

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @return The name of the exception.
     */

    public String getExceptionName() {
        return this.exceptionName;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @param exceptionName
     *        The name of the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsError withExceptionName(String exceptionName) {
        setExceptionName(exceptionName);
        return this;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     * 
     * @param message
     *        The message provided by the exception.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     * 
     * @return The message provided by the exception.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     * 
     * @param message
     *        The message provided by the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsError withMessage(String message) {
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getExceptionName() != null)
            sb.append("ExceptionName: ").append(getExceptionName()).append(",");
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

        if (obj instanceof BatchDescribeMergeConflictsError == false)
            return false;
        BatchDescribeMergeConflictsError other = (BatchDescribeMergeConflictsError) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getExceptionName() == null ^ this.getExceptionName() == null)
            return false;
        if (other.getExceptionName() != null && other.getExceptionName().equals(this.getExceptionName()) == false)
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

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getExceptionName() == null) ? 0 : getExceptionName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeMergeConflictsError clone() {
        try {
            return (BatchDescribeMergeConflictsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.BatchDescribeMergeConflictsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
