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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/QueryCompileError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryCompileError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved.
     * </p>
     */
    private QueryCompileErrorLocation location;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param location
     *        Reserved.
     */

    public void setLocation(QueryCompileErrorLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public QueryCompileErrorLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param location
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryCompileError withLocation(QueryCompileErrorLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param message
     *        Reserved.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param message
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryCompileError withMessage(String message) {
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
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

        if (obj instanceof QueryCompileError == false)
            return false;
        QueryCompileError other = (QueryCompileError) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
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

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public QueryCompileError clone() {
        try {
            return (QueryCompileError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.QueryCompileErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
