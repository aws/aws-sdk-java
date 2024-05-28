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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array with one or more objects that includes a security control (identified with <code>SecurityControlId</code>,
 * <code>SecurityControlArn</code>, or a mix of both parameters) and the Amazon Resource Name (ARN) of a standard. The
 * security control ID or ARN is the same across standards.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsControlAssociationId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControlAssociationId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix
     * of both parameters) of a security control across standards.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The ARN of a standard.
     * </p>
     */
    private String standardsArn;

    /**
     * <p>
     * The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix
     * of both parameters) of a security control across standards.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     *        a mix of both parameters) of a security control across standards.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix
     * of both parameters) of a security control across standards.
     * </p>
     * 
     * @return The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>,
     *         or a mix of both parameters) of a security control across standards.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix
     * of both parameters) of a security control across standards.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     *        a mix of both parameters) of a security control across standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationId withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @return The ARN of a standard.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationId withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsControlAssociationId == false)
            return false;
        StandardsControlAssociationId other = (StandardsControlAssociationId) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        return hashCode;
    }

    @Override
    public StandardsControlAssociationId clone() {
        try {
            return (StandardsControlAssociationId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsControlAssociationIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
