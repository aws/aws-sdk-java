/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about each entry in the grant list.
 * </p>
 */
public class GrantListEntry implements Serializable {

    /**
     * Unique grant identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * The principal that receives the grant permission.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String granteePrincipal;

    /**
     * The principal that can retire the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String retiringPrincipal;

    /**
     * The account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String issuingAccount;

    /**
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> operations;

    /**
     * Specifies the conditions under which the actions specified by the
     * <code>Operations</code> parameter are allowed.
     */
    private GrantConstraints constraints;

    /**
     * Unique grant identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return Unique grant identifier.
     */
    public String getGrantId() {
        return grantId;
    }
    
    /**
     * Unique grant identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Unique grant identifier.
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }
    
    /**
     * Unique grant identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Unique grant identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    /**
     * The principal that receives the grant permission.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The principal that receives the grant permission.
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }
    
    /**
     * The principal that receives the grant permission.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal The principal that receives the grant permission.
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }
    
    /**
     * The principal that receives the grant permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal The principal that receives the grant permission.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    /**
     * The principal that can retire the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The principal that can retire the account.
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }
    
    /**
     * The principal that can retire the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The principal that can retire the account.
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }
    
    /**
     * The principal that can retire the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The principal that can retire the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    /**
     * The account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The account under which the grant was issued.
     */
    public String getIssuingAccount() {
        return issuingAccount;
    }
    
    /**
     * The account under which the grant was issued.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param issuingAccount The account under which the grant was issued.
     */
    public void setIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
    }
    
    /**
     * The account under which the grant was issued.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param issuingAccount The account under which the grant was issued.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantListEntry withIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
        return this;
    }

    /**
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     *
     * @return List of operations permitted by the grant. This can be any combination
     *         of one or more of the following values: <ol> <li>Decrypt</li>
     *         <li>Encrypt</li> <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     */
    public java.util.List<String> getOperations() {
        if (operations == null) {
              operations = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              operations.setAutoConstruct(true);
        }
        return operations;
    }
    
    /**
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     *
     * @param operations List of operations permitted by the grant. This can be any combination
     *         of one or more of the following values: <ol> <li>Decrypt</li>
     *         <li>Encrypt</li> <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
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
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations List of operations permitted by the grant. This can be any combination
     *         of one or more of the following values: <ol> <li>Decrypt</li>
     *         <li>Encrypt</li> <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
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
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations List of operations permitted by the grant. This can be any combination
     *         of one or more of the following values: <ol> <li>Decrypt</li>
     *         <li>Encrypt</li> <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
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
     * List of operations permitted by the grant. This can be any combination
     * of one or more of the following values: <ol> <li>Decrypt</li>
     * <li>Encrypt</li> <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations List of operations permitted by the grant. This can be any combination
     *         of one or more of the following values: <ol> <li>Decrypt</li>
     *         <li>Encrypt</li> <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li> <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li> <li>CreateGrant</li> </ol>
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
     * Specifies the conditions under which the actions specified by the
     * <code>Operations</code> parameter are allowed.
     *
     * @return Specifies the conditions under which the actions specified by the
     *         <code>Operations</code> parameter are allowed.
     */
    public GrantConstraints getConstraints() {
        return constraints;
    }
    
    /**
     * Specifies the conditions under which the actions specified by the
     * <code>Operations</code> parameter are allowed.
     *
     * @param constraints Specifies the conditions under which the actions specified by the
     *         <code>Operations</code> parameter are allowed.
     */
    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }
    
    /**
     * Specifies the conditions under which the actions specified by the
     * <code>Operations</code> parameter are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param constraints Specifies the conditions under which the actions specified by the
     *         <code>Operations</code> parameter are allowed.
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
        if (getGrantId() != null) sb.append("GrantId: " + getGrantId() + ",");
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
        
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode()); 
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
        
        if (other.getGrantId() == null ^ this.getGrantId() == null) return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false) return false; 
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
    
}
    