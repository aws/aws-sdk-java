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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details related to problems with AWS TNB resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ProblemDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProblemDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A human-readable explanation specific to this occurrence of the problem.
     * </p>
     */
    private String detail;
    /**
     * <p>
     * A human-readable title of the problem type.
     * </p>
     */
    private String title;

    /**
     * <p>
     * A human-readable explanation specific to this occurrence of the problem.
     * </p>
     * 
     * @param detail
     *        A human-readable explanation specific to this occurrence of the problem.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * A human-readable explanation specific to this occurrence of the problem.
     * </p>
     * 
     * @return A human-readable explanation specific to this occurrence of the problem.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * A human-readable explanation specific to this occurrence of the problem.
     * </p>
     * 
     * @param detail
     *        A human-readable explanation specific to this occurrence of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProblemDetails withDetail(String detail) {
        setDetail(detail);
        return this;
    }

    /**
     * <p>
     * A human-readable title of the problem type.
     * </p>
     * 
     * @param title
     *        A human-readable title of the problem type.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A human-readable title of the problem type.
     * </p>
     * 
     * @return A human-readable title of the problem type.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A human-readable title of the problem type.
     * </p>
     * 
     * @param title
     *        A human-readable title of the problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProblemDetails withTitle(String title) {
        setTitle(title);
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
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProblemDetails == false)
            return false;
        ProblemDetails other = (ProblemDetails) obj;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public ProblemDetails clone() {
        try {
            return (ProblemDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ProblemDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
