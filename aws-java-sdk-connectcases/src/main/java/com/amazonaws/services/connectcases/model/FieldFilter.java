/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for fields. Only one value can be provided.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue contains;
    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue equalTo;
    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue greaterThan;
    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue greaterThanOrEqualTo;
    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue lessThan;
    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     */
    private FieldValue lessThanOrEqualTo;

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param contains
     *        Object containing field identifier and value information.
     */

    public void setContains(FieldValue contains) {
        this.contains = contains;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getContains() {
        return this.contains;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param contains
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withContains(FieldValue contains) {
        setContains(contains);
        return this;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param equalTo
     *        Object containing field identifier and value information.
     */

    public void setEqualTo(FieldValue equalTo) {
        this.equalTo = equalTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getEqualTo() {
        return this.equalTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param equalTo
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withEqualTo(FieldValue equalTo) {
        setEqualTo(equalTo);
        return this;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param greaterThan
     *        Object containing field identifier and value information.
     */

    public void setGreaterThan(FieldValue greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param greaterThan
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withGreaterThan(FieldValue greaterThan) {
        setGreaterThan(greaterThan);
        return this;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param greaterThanOrEqualTo
     *        Object containing field identifier and value information.
     */

    public void setGreaterThanOrEqualTo(FieldValue greaterThanOrEqualTo) {
        this.greaterThanOrEqualTo = greaterThanOrEqualTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getGreaterThanOrEqualTo() {
        return this.greaterThanOrEqualTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param greaterThanOrEqualTo
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withGreaterThanOrEqualTo(FieldValue greaterThanOrEqualTo) {
        setGreaterThanOrEqualTo(greaterThanOrEqualTo);
        return this;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param lessThan
     *        Object containing field identifier and value information.
     */

    public void setLessThan(FieldValue lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getLessThan() {
        return this.lessThan;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param lessThan
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withLessThan(FieldValue lessThan) {
        setLessThan(lessThan);
        return this;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param lessThanOrEqualTo
     *        Object containing field identifier and value information.
     */

    public void setLessThanOrEqualTo(FieldValue lessThanOrEqualTo) {
        this.lessThanOrEqualTo = lessThanOrEqualTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @return Object containing field identifier and value information.
     */

    public FieldValue getLessThanOrEqualTo() {
        return this.lessThanOrEqualTo;
    }

    /**
     * <p>
     * Object containing field identifier and value information.
     * </p>
     * 
     * @param lessThanOrEqualTo
     *        Object containing field identifier and value information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFilter withLessThanOrEqualTo(FieldValue lessThanOrEqualTo) {
        setLessThanOrEqualTo(lessThanOrEqualTo);
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
        if (getContains() != null)
            sb.append("Contains: ").append(getContains()).append(",");
        if (getEqualTo() != null)
            sb.append("EqualTo: ").append(getEqualTo()).append(",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: ").append(getGreaterThan()).append(",");
        if (getGreaterThanOrEqualTo() != null)
            sb.append("GreaterThanOrEqualTo: ").append(getGreaterThanOrEqualTo()).append(",");
        if (getLessThan() != null)
            sb.append("LessThan: ").append(getLessThan()).append(",");
        if (getLessThanOrEqualTo() != null)
            sb.append("LessThanOrEqualTo: ").append(getLessThanOrEqualTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldFilter == false)
            return false;
        FieldFilter other = (FieldFilter) obj;
        if (other.getContains() == null ^ this.getContains() == null)
            return false;
        if (other.getContains() != null && other.getContains().equals(this.getContains()) == false)
            return false;
        if (other.getEqualTo() == null ^ this.getEqualTo() == null)
            return false;
        if (other.getEqualTo() != null && other.getEqualTo().equals(this.getEqualTo()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEqualTo() == null ^ this.getGreaterThanOrEqualTo() == null)
            return false;
        if (other.getGreaterThanOrEqualTo() != null && other.getGreaterThanOrEqualTo().equals(this.getGreaterThanOrEqualTo()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEqualTo() == null ^ this.getLessThanOrEqualTo() == null)
            return false;
        if (other.getLessThanOrEqualTo() != null && other.getLessThanOrEqualTo().equals(this.getLessThanOrEqualTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContains() == null) ? 0 : getContains().hashCode());
        hashCode = prime * hashCode + ((getEqualTo() == null) ? 0 : getEqualTo().hashCode());
        hashCode = prime * hashCode + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getGreaterThanOrEqualTo() == null) ? 0 : getGreaterThanOrEqualTo().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode + ((getLessThanOrEqualTo() == null) ? 0 : getLessThanOrEqualTo().hashCode());
        return hashCode;
    }

    @Override
    public FieldFilter clone() {
        try {
            return (FieldFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
