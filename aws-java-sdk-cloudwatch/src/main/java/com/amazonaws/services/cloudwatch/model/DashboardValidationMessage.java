/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An error or warning for the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DashboardValidationMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardValidationMessage implements Serializable, Cloneable {

    /**
     * <p>
     * The data path related to the message.
     * </p>
     */
    private String dataPath;
    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The data path related to the message.
     * </p>
     * 
     * @param dataPath
     *        The data path related to the message.
     */

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    /**
     * <p>
     * The data path related to the message.
     * </p>
     * 
     * @return The data path related to the message.
     */

    public String getDataPath() {
        return this.dataPath;
    }

    /**
     * <p>
     * The data path related to the message.
     * </p>
     * 
     * @param dataPath
     *        The data path related to the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardValidationMessage withDataPath(String dataPath) {
        setDataPath(dataPath);
        return this;
    }

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @param message
     *        A message describing the error or warning.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @return A message describing the error or warning.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @param message
     *        A message describing the error or warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardValidationMessage withMessage(String message) {
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
        if (getDataPath() != null)
            sb.append("DataPath: ").append(getDataPath()).append(",");
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

        if (obj instanceof DashboardValidationMessage == false)
            return false;
        DashboardValidationMessage other = (DashboardValidationMessage) obj;
        if (other.getDataPath() == null ^ this.getDataPath() == null)
            return false;
        if (other.getDataPath() != null && other.getDataPath().equals(this.getDataPath()) == false)
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

        hashCode = prime * hashCode + ((getDataPath() == null) ? 0 : getDataPath().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DashboardValidationMessage clone() {
        try {
            return (DashboardValidationMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
