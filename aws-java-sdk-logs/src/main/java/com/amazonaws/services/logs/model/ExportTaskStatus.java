/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the status of an export task.
 * </p>
 */
public class ExportTaskStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The status code of the export task.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The status message related to the status code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * 
     * @param code
     *        The status code of the export task.
     * @see ExportTaskStatusCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * 
     * @return The status code of the export task.
     * @see ExportTaskStatusCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * 
     * @param code
     *        The status code of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public ExportTaskStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * 
     * @param code
     *        The status code of the export task.
     * @see ExportTaskStatusCode
     */

    public void setCode(ExportTaskStatusCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * 
     * @param code
     *        The status code of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public ExportTaskStatus withCode(ExportTaskStatusCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     * 
     * @param message
     *        The status message related to the status code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     * 
     * @return The status message related to the status code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     * 
     * @param message
     *        The status message related to the status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskStatus withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskStatus == false)
            return false;
        ExportTaskStatus other = (ExportTaskStatus) obj;
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
    public ExportTaskStatus clone() {
        try {
            return (ExportTaskStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
