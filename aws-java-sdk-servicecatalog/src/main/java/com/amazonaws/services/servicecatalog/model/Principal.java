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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     */
    private String principalARN;
    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * 
     * @param principalARN
     *        The ARN of the principal (IAM user, role, or group).
     */

    public void setPrincipalARN(String principalARN) {
        this.principalARN = principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * 
     * @return The ARN of the principal (IAM user, role, or group).
     */

    public String getPrincipalARN() {
        return this.principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * 
     * @param principalARN
     *        The ARN of the principal (IAM user, role, or group).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withPrincipalARN(String principalARN) {
        setPrincipalARN(principalARN);
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code>.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * 
     * @return The principal type. The supported value is <code>IAM</code>.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code>.
     * @see PrincipalType
     */

    public void setPrincipalType(PrincipalType principalType) {
        withPrincipalType(principalType);
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getPrincipalARN() != null)
            sb.append("PrincipalARN: ").append(getPrincipalARN()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getPrincipalARN() == null ^ this.getPrincipalARN() == null)
            return false;
        if (other.getPrincipalARN() != null && other.getPrincipalARN().equals(this.getPrincipalARN()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalARN() == null) ? 0 : getPrincipalARN().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
