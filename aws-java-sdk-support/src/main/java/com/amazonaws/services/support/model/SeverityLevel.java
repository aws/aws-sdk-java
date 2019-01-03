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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A code and name pair that represent a severity level that can be applied to a support case.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/SeverityLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeverityLevel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to
     * the caller in <code>severityLevel.name</code>.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     */
    private String name;

    /**
     * <p>
     * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to
     * the caller in <code>severityLevel.name</code>.
     * </p>
     * 
     * @param code
     *        One of four values: "low," "medium," "high," and "urgent". These values correspond to response times
     *        returned to the caller in <code>severityLevel.name</code>.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to
     * the caller in <code>severityLevel.name</code>.
     * </p>
     * 
     * @return One of four values: "low," "medium," "high," and "urgent". These values correspond to response times
     *         returned to the caller in <code>severityLevel.name</code>.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to
     * the caller in <code>severityLevel.name</code>.
     * </p>
     * 
     * @param code
     *        One of four values: "low," "medium," "high," and "urgent". These values correspond to response times
     *        returned to the caller in <code>severityLevel.name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityLevel withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * 
     * @param name
     *        The name of the severity level that corresponds to the severity level code.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * 
     * @return The name of the severity level that corresponds to the severity level code.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level code.
     * </p>
     * 
     * @param name
     *        The name of the severity level that corresponds to the severity level code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityLevel withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeverityLevel == false)
            return false;
        SeverityLevel other = (SeverityLevel) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public SeverityLevel clone() {
        try {
            return (SeverityLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.SeverityLevelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
