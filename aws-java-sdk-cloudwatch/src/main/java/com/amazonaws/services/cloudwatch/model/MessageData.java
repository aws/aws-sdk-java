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
 * A message returned by the <code>GetMetricData</code>API, including a code and a description.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MessageData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageData implements Serializable, Cloneable {

    /**
     * <p>
     * The error code or status code associated with the message.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The message text.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The error code or status code associated with the message.
     * </p>
     * 
     * @param code
     *        The error code or status code associated with the message.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code or status code associated with the message.
     * </p>
     * 
     * @return The error code or status code associated with the message.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code or status code associated with the message.
     * </p>
     * 
     * @param code
     *        The error code or status code associated with the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageData withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The message text.
     * </p>
     * 
     * @param value
     *        The message text.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The message text.
     * </p>
     * 
     * @return The message text.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The message text.
     * </p>
     * 
     * @param value
     *        The message text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageData withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageData == false)
            return false;
        MessageData other = (MessageData) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MessageData clone() {
        try {
            return (MessageData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
