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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an entry in a list of grants.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GrantListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the grant applies.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     */
    private String grantId;
    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name
     * is returned. Otherwise this value is null.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     */
    private String granteePrincipal;
    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     */
    private String retiringPrincipal;
    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     */
    private String issuingAccount;
    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> operations;
    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows.
     * </p>
     */
    private GrantConstraints constraints;

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the grant applies.
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the customer master key (CMK) to which the grant applies.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the grant applies.
     * </p>
     * 
     * @return The unique identifier for the customer master key (CMK) to which the grant applies.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the grant applies.
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the customer master key (CMK) to which the grant applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * 
     * @param grantId
     *        The unique identifier for the grant.
     */

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * 
     * @return The unique identifier for the grant.
     */

    public String getGrantId() {
        return this.grantId;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * 
     * @param grantId
     *        The unique identifier for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withGrantId(String grantId) {
        setGrantId(grantId);
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name
     * is returned. Otherwise this value is null.
     * </p>
     * 
     * @param name
     *        The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request,
     *        that name is returned. Otherwise this value is null.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name
     * is returned. Otherwise this value is null.
     * </p>
     * 
     * @return The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request,
     *         that name is returned. Otherwise this value is null.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name
     * is returned. Otherwise this value is null.
     * </p>
     * 
     * @param name
     *        The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request,
     *        that name is returned. Otherwise this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the grant was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     * 
     * @return The date and time when the grant was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the grant was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that receives the grant's permissions.
     */

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * 
     * @return The principal that receives the grant's permissions.
     */

    public String getGranteePrincipal() {
        return this.granteePrincipal;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that receives the grant's permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withGranteePrincipal(String granteePrincipal) {
        setGranteePrincipal(granteePrincipal);
        return this;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that can retire the grant.
     */

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * 
     * @return The principal that can retire the grant.
     */

    public String getRetiringPrincipal() {
        return this.retiringPrincipal;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that can retire the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withRetiringPrincipal(String retiringPrincipal) {
        setRetiringPrincipal(retiringPrincipal);
        return this;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * 
     * @param issuingAccount
     *        The AWS account under which the grant was issued.
     */

    public void setIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * 
     * @return The AWS account under which the grant was issued.
     */

    public String getIssuingAccount() {
        return this.issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * 
     * @param issuingAccount
     *        The AWS account under which the grant was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withIssuingAccount(String issuingAccount) {
        setIssuingAccount(issuingAccount);
        return this;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * 
     * @return The list of operations permitted by the grant.
     * @see GrantOperation
     */

    public java.util.List<String> getOperations() {
        if (operations == null) {
            operations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return operations;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * 
     * @param operations
     *        The list of operations permitted by the grant.
     * @see GrantOperation
     */

    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new com.amazonaws.internal.SdkInternalList<String>(operations);
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        The list of operations permitted by the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantOperation
     */

    public GrantListEntry withOperations(String... operations) {
        if (this.operations == null) {
            setOperations(new com.amazonaws.internal.SdkInternalList<String>(operations.length));
        }
        for (String ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * 
     * @param operations
     *        The list of operations permitted by the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantOperation
     */

    public GrantListEntry withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * 
     * @param operations
     *        The list of operations permitted by the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantOperation
     */

    public GrantListEntry withOperations(GrantOperation... operations) {
        com.amazonaws.internal.SdkInternalList<String> operationsCopy = new com.amazonaws.internal.SdkInternalList<String>(operations.length);
        for (GrantOperation value : operations) {
            operationsCopy.add(value.toString());
        }
        if (getOperations() == null) {
            setOperations(operationsCopy);
        } else {
            getOperations().addAll(operationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows.
     * </p>
     * 
     * @param constraints
     *        A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *        that the grant allows.
     */

    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows.
     * </p>
     * 
     * @return A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *         that the grant allows.
     */

    public GrantConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows.
     * </p>
     * 
     * @param constraints
     *        A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *        that the grant allows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantListEntry withConstraints(GrantConstraints constraints) {
        setConstraints(constraints);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getGrantId() != null)
            sb.append("GrantId: ").append(getGrantId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getGranteePrincipal() != null)
            sb.append("GranteePrincipal: ").append(getGranteePrincipal()).append(",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: ").append(getRetiringPrincipal()).append(",");
        if (getIssuingAccount() != null)
            sb.append("IssuingAccount: ").append(getIssuingAccount()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantListEntry == false)
            return false;
        GrantListEntry other = (GrantListEntry) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantId() == null ^ this.getGrantId() == null)
            return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null)
            return false;
        if (other.getGranteePrincipal() != null && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        if (other.getIssuingAccount() == null ^ this.getIssuingAccount() == null)
            return false;
        if (other.getIssuingAccount() != null && other.getIssuingAccount().equals(this.getIssuingAccount()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal().hashCode());
        hashCode = prime * hashCode + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        hashCode = prime * hashCode + ((getIssuingAccount() == null) ? 0 : getIssuingAccount().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        return hashCode;
    }

    @Override
    public GrantListEntry clone() {
        try {
            return (GrantListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.GrantListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
