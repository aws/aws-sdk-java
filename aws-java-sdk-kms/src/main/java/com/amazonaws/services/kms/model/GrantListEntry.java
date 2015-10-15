/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an entry in a list of grants.
 * </p>
 */
public class GrantListEntry implements Serializable, Cloneable {

    /**
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * The unique identifier for the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String name;

    /**
     * The date and time when the grant was created.
     */
    private java.util.Date creationDate;

    /**
     * The principal that receives the grant's permissions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String granteePrincipal;

    /**
     * The principal that can retire the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String retiringPrincipal;

    /**
     * The AWS account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String issuingAccount;

    /**
     * The list of operations permitted by the grant.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> operations;

    /**
     * The conditions under which the grant's operations are allowed.
     */
    private GrantConstraints constraints;

    /**
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique identifier for the customer master key (CMK) to which the
     *         grant applies.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId The unique identifier for the customer master key (CMK) to which the
     *         grant applies.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId The unique identifier for the customer master key (CMK) to which the
     *         grant applies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The unique identifier for the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The unique identifier for the grant.
     */
    public String getGrantId() {
        return grantId;
    }
    
    /**
     * The unique identifier for the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId The unique identifier for the grant.
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }
    
    /**
     * The unique identifier for the grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId The unique identifier for the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    /**
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return The friendly name that identifies the grant. If a name was provided in
     *         the <a>CreateGrant</a> request, that name is returned. Otherwise this
     *         value is null.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name The friendly name that identifies the grant. If a name was provided in
     *         the <a>CreateGrant</a> request, that name is returned. Otherwise this
     *         value is null.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name The friendly name that identifies the grant. If a name was provided in
     *         the <a>CreateGrant</a> request, that name is returned. Otherwise this
     *         value is null.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The date and time when the grant was created.
     *
     * @return The date and time when the grant was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date and time when the grant was created.
     *
     * @param creationDate The date and time when the grant was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date and time when the grant was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date and time when the grant was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The principal that receives the grant's permissions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The principal that receives the grant's permissions.
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }
    
    /**
     * The principal that receives the grant's permissions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal The principal that receives the grant's permissions.
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }
    
    /**
     * The principal that receives the grant's permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal The principal that receives the grant's permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    /**
     * The principal that can retire the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The principal that can retire the grant.
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }
    
    /**
     * The principal that can retire the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The principal that can retire the grant.
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }
    
    /**
     * The principal that can retire the grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The principal that can retire the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    /**
     * The AWS account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The AWS account under which the grant was issued.
     */
    public String getIssuingAccount() {
        return issuingAccount;
    }
    
    /**
     * The AWS account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param issuingAccount The AWS account under which the grant was issued.
     */
    public void setIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
    }
    
    /**
     * The AWS account under which the grant was issued.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param issuingAccount The AWS account under which the grant was issued.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
        return this;
    }

    /**
     * The list of operations permitted by the grant.
     *
     * @return The list of operations permitted by the grant.
     */
    public java.util.List<String> getOperations() {
        if (operations == null) {
              operations = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              operations.setAutoConstruct(true);
        }
        return operations;
    }
    
    /**
     * The list of operations permitted by the grant.
     *
     * @param operations The list of operations permitted by the grant.
     */
    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> operationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(operations.size());
        operationsCopy.addAll(operations);
        this.operations = operationsCopy;
    }
    
    /**
     * The list of operations permitted by the grant.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOperations(java.util.Collection)} or {@link
     * #withOperations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations The list of operations permitted by the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withOperations(String... operations) {
        if (getOperations() == null) setOperations(new java.util.ArrayList<String>(operations.length));
        for (String value : operations) {
            getOperations().add(value);
        }
        return this;
    }
    
    /**
     * The list of operations permitted by the grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations The list of operations permitted by the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> operationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(operations.size());
            operationsCopy.addAll(operations);
            this.operations = operationsCopy;
        }

        return this;
    }

    /**
     * The list of operations permitted by the grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations The list of operations permitted by the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withOperations(GrantOperation... operations) {
        java.util.ArrayList<String> operationsCopy = new java.util.ArrayList<String>(operations.length);
        for (GrantOperation member : operations) {
            operationsCopy.add(member.toString());
        }
        if (getOperations() == null) {
            setOperations(operationsCopy);
        } else {
            getOperations().addAll(operationsCopy);
        }
        return this;
    }

    /**
     * The conditions under which the grant's operations are allowed.
     *
     * @return The conditions under which the grant's operations are allowed.
     */
    public GrantConstraints getConstraints() {
        return constraints;
    }
    
    /**
     * The conditions under which the grant's operations are allowed.
     *
     * @param constraints The conditions under which the grant's operations are allowed.
     */
    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }
    
    /**
     * The conditions under which the grant's operations are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param constraints The conditions under which the grant's operations are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantId() != null) sb.append("GrantId: " + getGrantId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getGranteePrincipal() != null) sb.append("GranteePrincipal: " + getGranteePrincipal() + ",");
        if (getRetiringPrincipal() != null) sb.append("RetiringPrincipal: " + getRetiringPrincipal() + ",");
        if (getIssuingAccount() != null) sb.append("IssuingAccount: " + getIssuingAccount() + ",");
        if (getOperations() != null) sb.append("Operations: " + getOperations() + ",");
        if (getConstraints() != null) sb.append("Constraints: " + getConstraints() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GrantListEntry == false) return false;
        GrantListEntry other = (GrantListEntry)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getGrantId() == null ^ this.getGrantId() == null) return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null) return false;
        if (other.getGranteePrincipal() != null && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false) return false; 
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null) return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false) return false; 
        if (other.getIssuingAccount() == null ^ this.getIssuingAccount() == null) return false;
        if (other.getIssuingAccount() != null && other.getIssuingAccount().equals(this.getIssuingAccount()) == false) return false; 
        if (other.getOperations() == null ^ this.getOperations() == null) return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false) return false; 
        if (other.getConstraints() == null ^ this.getConstraints() == null) return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false) return false; 
        return true;
    }
    
    @Override
    public GrantListEntry clone() {
        try {
            return (GrantListEntry) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    