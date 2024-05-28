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
 * The target account, organizational unit, or the root that is associated with an Security Hub configuration. The
 * configuration can be a configuration policy or self-managed behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The organizational unit ID of the target organizational unit.
     * </p>
     */
    private String organizationalUnitId;
    /**
     * <p>
     * The ID of the organization root.
     * </p>
     */
    private String rootId;

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the target account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the target account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The organizational unit ID of the target organizational unit.
     * </p>
     * 
     * @param organizationalUnitId
     *        The organizational unit ID of the target organizational unit.
     */

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * The organizational unit ID of the target organizational unit.
     * </p>
     * 
     * @return The organizational unit ID of the target organizational unit.
     */

    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * <p>
     * The organizational unit ID of the target organizational unit.
     * </p>
     * 
     * @param organizationalUnitId
     *        The organizational unit ID of the target organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withOrganizationalUnitId(String organizationalUnitId) {
        setOrganizationalUnitId(organizationalUnitId);
        return this;
    }

    /**
     * <p>
     * The ID of the organization root.
     * </p>
     * 
     * @param rootId
     *        The ID of the organization root.
     */

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * The ID of the organization root.
     * </p>
     * 
     * @return The ID of the organization root.
     */

    public String getRootId() {
        return this.rootId;
    }

    /**
     * <p>
     * The ID of the organization root.
     * </p>
     * 
     * @param rootId
     *        The ID of the organization root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRootId(String rootId) {
        setRootId(rootId);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: ").append(getOrganizationalUnitId()).append(",");
        if (getRootId() != null)
            sb.append("RootId: ").append(getRootId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
