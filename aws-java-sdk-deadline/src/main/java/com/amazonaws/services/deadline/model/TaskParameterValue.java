/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data types for the task parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TaskParameterValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A double precision IEEE-754 floating point number represented as a string.
     * </p>
     */
    private String floatValue;
    /**
     * <p>
     * A signed integer represented as a string.
     * </p>
     */
    private String intValue;
    /**
     * <p>
     * A file system path represented as a string.
     * </p>
     */
    private String path;
    /**
     * <p>
     * A UTF-8 string.
     * </p>
     */
    private String string;

    /**
     * <p>
     * A double precision IEEE-754 floating point number represented as a string.
     * </p>
     * 
     * @param floatValue
     *        A double precision IEEE-754 floating point number represented as a string.
     */

    public void setFloat(String floatValue) {
        this.floatValue = floatValue;
    }

    /**
     * <p>
     * A double precision IEEE-754 floating point number represented as a string.
     * </p>
     * 
     * @return A double precision IEEE-754 floating point number represented as a string.
     */

    public String getFloat() {
        return this.floatValue;
    }

    /**
     * <p>
     * A double precision IEEE-754 floating point number represented as a string.
     * </p>
     * 
     * @param floatValue
     *        A double precision IEEE-754 floating point number represented as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskParameterValue withFloat(String floatValue) {
        setFloat(floatValue);
        return this;
    }

    /**
     * <p>
     * A signed integer represented as a string.
     * </p>
     * 
     * @param intValue
     *        A signed integer represented as a string.
     */

    public void setInt(String intValue) {
        this.intValue = intValue;
    }

    /**
     * <p>
     * A signed integer represented as a string.
     * </p>
     * 
     * @return A signed integer represented as a string.
     */

    public String getInt() {
        return this.intValue;
    }

    /**
     * <p>
     * A signed integer represented as a string.
     * </p>
     * 
     * @param intValue
     *        A signed integer represented as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskParameterValue withInt(String intValue) {
        setInt(intValue);
        return this;
    }

    /**
     * <p>
     * A file system path represented as a string.
     * </p>
     * 
     * @param path
     *        A file system path represented as a string.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * A file system path represented as a string.
     * </p>
     * 
     * @return A file system path represented as a string.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * A file system path represented as a string.
     * </p>
     * 
     * @param path
     *        A file system path represented as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskParameterValue withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * A UTF-8 string.
     * </p>
     * 
     * @param string
     *        A UTF-8 string.
     */

    public void setString(String string) {
        this.string = string;
    }

    /**
     * <p>
     * A UTF-8 string.
     * </p>
     * 
     * @return A UTF-8 string.
     */

    public String getString() {
        return this.string;
    }

    /**
     * <p>
     * A UTF-8 string.
     * </p>
     * 
     * @param string
     *        A UTF-8 string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskParameterValue withString(String string) {
        setString(string);
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
        if (getFloat() != null)
            sb.append("Float: ").append(getFloat()).append(",");
        if (getInt() != null)
            sb.append("Int: ").append(getInt()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getString() != null)
            sb.append("String: ").append(getString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskParameterValue == false)
            return false;
        TaskParameterValue other = (TaskParameterValue) obj;
        if (other.getFloat() == null ^ this.getFloat() == null)
            return false;
        if (other.getFloat() != null && other.getFloat().equals(this.getFloat()) == false)
            return false;
        if (other.getInt() == null ^ this.getInt() == null)
            return false;
        if (other.getInt() != null && other.getInt().equals(this.getInt()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFloat() == null) ? 0 : getFloat().hashCode());
        hashCode = prime * hashCode + ((getInt() == null) ? 0 : getInt().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        return hashCode;
    }

    @Override
    public TaskParameterValue clone() {
        try {
            return (TaskParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.TaskParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
