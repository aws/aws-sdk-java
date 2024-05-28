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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains status components of a Gremlin query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GremlinQueryStatusAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GremlinQueryStatusAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The HTTP response code returned fro the Gremlin query request..
     * </p>
     */
    private Integer code;

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param message
     *        The status message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param message
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GremlinQueryStatusAttributes withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The HTTP response code returned fro the Gremlin query request..
     * </p>
     * 
     * @param code
     *        The HTTP response code returned fro the Gremlin query request..
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * The HTTP response code returned fro the Gremlin query request..
     * </p>
     * 
     * @return The HTTP response code returned fro the Gremlin query request..
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * The HTTP response code returned fro the Gremlin query request..
     * </p>
     * 
     * @param code
     *        The HTTP response code returned fro the Gremlin query request..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GremlinQueryStatusAttributes withCode(Integer code) {
        setCode(code);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GremlinQueryStatusAttributes == false)
            return false;
        GremlinQueryStatusAttributes other = (GremlinQueryStatusAttributes) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public GremlinQueryStatusAttributes clone() {
        try {
            return (GremlinQueryStatusAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.GremlinQueryStatusAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
