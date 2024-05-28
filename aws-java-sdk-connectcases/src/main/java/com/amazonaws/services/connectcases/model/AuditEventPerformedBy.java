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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information of the user which performed the audit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/AuditEventPerformedBy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditEventPerformedBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of an IAM role.
     * </p>
     */
    private String iamPrincipalArn;

    private UserUnion user;

    /**
     * <p>
     * Unique identifier of an IAM role.
     * </p>
     * 
     * @param iamPrincipalArn
     *        Unique identifier of an IAM role.
     */

    public void setIamPrincipalArn(String iamPrincipalArn) {
        this.iamPrincipalArn = iamPrincipalArn;
    }

    /**
     * <p>
     * Unique identifier of an IAM role.
     * </p>
     * 
     * @return Unique identifier of an IAM role.
     */

    public String getIamPrincipalArn() {
        return this.iamPrincipalArn;
    }

    /**
     * <p>
     * Unique identifier of an IAM role.
     * </p>
     * 
     * @param iamPrincipalArn
     *        Unique identifier of an IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventPerformedBy withIamPrincipalArn(String iamPrincipalArn) {
        setIamPrincipalArn(iamPrincipalArn);
        return this;
    }

    /**
     * @param user
     */

    public void setUser(UserUnion user) {
        this.user = user;
    }

    /**
     * @return
     */

    public UserUnion getUser() {
        return this.user;
    }

    /**
     * @param user
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventPerformedBy withUser(UserUnion user) {
        setUser(user);
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
        if (getIamPrincipalArn() != null)
            sb.append("IamPrincipalArn: ").append(getIamPrincipalArn()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditEventPerformedBy == false)
            return false;
        AuditEventPerformedBy other = (AuditEventPerformedBy) obj;
        if (other.getIamPrincipalArn() == null ^ this.getIamPrincipalArn() == null)
            return false;
        if (other.getIamPrincipalArn() != null && other.getIamPrincipalArn().equals(this.getIamPrincipalArn()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamPrincipalArn() == null) ? 0 : getIamPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public AuditEventPerformedBy clone() {
        try {
            return (AuditEventPerformedBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.AuditEventPerformedByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
