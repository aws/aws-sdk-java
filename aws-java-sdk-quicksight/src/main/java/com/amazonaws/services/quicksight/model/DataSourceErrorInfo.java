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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information for the data source creation or update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSourceErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error type.
     * </p>
     * 
     * @param type
     *        Error type.
     * @see DataSourceErrorInfoType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * 
     * @return Error type.
     * @see DataSourceErrorInfoType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * 
     * @param type
     *        Error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceErrorInfoType
     */

    public DataSourceErrorInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * 
     * @param type
     *        Error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceErrorInfoType
     */

    public DataSourceErrorInfo withType(DataSourceErrorInfoType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param message
     *        Error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @return Error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param message
     *        Error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceErrorInfo withMessage(String message) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof DataSourceErrorInfo == false)
            return false;
        DataSourceErrorInfo other = (DataSourceErrorInfo) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceErrorInfo clone() {
        try {
            return (DataSourceErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
