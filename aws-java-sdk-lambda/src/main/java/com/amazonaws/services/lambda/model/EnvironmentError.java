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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * The parent object that contains error information associated with your configuration settings.
 * </p>
 */
public class EnvironmentError implements Serializable, Cloneable {

    /**
     * <p>
     * The error code returned by the environment error object.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message returned by the environment error object.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code returned by the environment error object.
     * </p>
     * 
     * @param errorCode
     *        The error code returned by the environment error object.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned by the environment error object.
     * </p>
     * 
     * @return The error code returned by the environment error object.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code returned by the environment error object.
     * </p>
     * 
     * @param errorCode
     *        The error code returned by the environment error object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message returned by the environment error object.
     * </p>
     * 
     * @param message
     *        The message returned by the environment error object.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message returned by the environment error object.
     * </p>
     * 
     * @return The message returned by the environment error object.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message returned by the environment error object.
     * </p>
     * 
     * @param message
     *        The message returned by the environment error object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentError withMessage(String message) {
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
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

        if (obj instanceof EnvironmentError == false)
            return false;
        EnvironmentError other = (EnvironmentError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentError clone() {
        try {
            return (EnvironmentError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
