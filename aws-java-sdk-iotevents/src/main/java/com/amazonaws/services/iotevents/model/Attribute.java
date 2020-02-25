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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to
 * the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload. Those
 * attributes (and their paired values) specified here are available for use in the <code>condition</code> expressions
 * used by detectors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/Attribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from
     * the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (
     * <code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and its paired value)
     * specified here are available for use in the <code>condition</code> expressions used by detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     */
    private String jsonPath;

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from
     * the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (
     * <code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and its paired value)
     * specified here are available for use in the <code>condition</code> expressions used by detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * 
     * @param jsonPath
     *        An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute
     *        from the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS
     *        IoT Events (<code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and
     *        its paired value) specified here are available for use in the <code>condition</code> expressions used by
     *        detectors. </p>
     *        <p>
     *        Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     */

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from
     * the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (
     * <code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and its paired value)
     * specified here are available for use in the <code>condition</code> expressions used by detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * 
     * @return An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an
     *         attribute from the JSON payload that is made available by the input. Inputs are derived from messages
     *         sent to AWS IoT Events (<code>BatchPutMessage</code>). Each such message contains a JSON payload. The
     *         attribute (and its paired value) specified here are available for use in the <code>condition</code>
     *         expressions used by detectors. </p>
     *         <p>
     *         Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     */

    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from
     * the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (
     * <code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and its paired value)
     * specified here are available for use in the <code>condition</code> expressions used by detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * 
     * @param jsonPath
     *        An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute
     *        from the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS
     *        IoT Events (<code>BatchPutMessage</code>). Each such message contains a JSON payload. The attribute (and
     *        its paired value) specified here are available for use in the <code>condition</code> expressions used by
     *        detectors. </p>
     *        <p>
     *        Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withJsonPath(String jsonPath) {
        setJsonPath(jsonPath);
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
        if (getJsonPath() != null)
            sb.append("JsonPath: ").append(getJsonPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
