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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#createGrant(CreateGrantRequest) CreateGrant operation}.
 * <p>
 * Adds a grant to a key to specify who can access the key and under what
 * conditions. Grants are alternate permission mechanisms to key
 * policies. If absent, access to the key is evaluated based on IAM
 * policies attached to the user. By default, grants do not expire.
 * Grants can be listed, retired, or revoked as indicated by the
 * following APIs. Typically, when you are finished using a grant, you
 * retire it. When you want to end a grant immediately, revoke it. For
 * more information about grants, see
 * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
 * . <ol> <li> ListGrants </li>
 * <li> RetireGrant </li>
 * <li> RevokeGrant </li>
 * </ol>
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#createGrant(CreateGrantRequest)
 */
public class CreateGrantRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A unique key identifier for a customer master key. This value can be a
     * globally unique identifier, an ARN, or an alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Principal given permission by the grant to use the key identified by
     * the <code>keyId</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String granteePrincipal;

    /**
     * Principal given permission to retire the grant. For more information,
     * see <a>RetireGrant</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String retiringPrincipal;

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
     * List of grant tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * A unique key identifier for a customer master key. This value can be a
     * globally unique identifier, an ARN, or an alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A unique key identifier for a customer master key. This value can be a
     *         globally unique identifier, an ARN, or an alias.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * A unique key identifier for a customer master key. This value can be a
     * globally unique identifier, an ARN, or an alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId A unique key identifier for a customer master key. This value can be a
     *         globally unique identifier, an ARN, or an alias.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * A unique key identifier for a customer master key. This value can be a
     * globally unique identifier, an ARN, or an alias.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId A unique key identifier for a customer master key. This value can be a
     *         globally unique identifier, an ARN, or an alias.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Principal given permission by the grant to use the key identified by
     * the <code>keyId</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Principal given permission by the grant to use the key identified by
     *         the <code>keyId</code> parameter.
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }
    
    /**
     * Principal given permission by the grant to use the key identified by
     * the <code>keyId</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal Principal given permission by the grant to use the key identified by
     *         the <code>keyId</code> parameter.
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }
    
    /**
     * Principal given permission by the grant to use the key identified by
     * the <code>keyId</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param granteePrincipal Principal given permission by the grant to use the key identified by
     *         the <code>keyId</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantRequest withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    /**
     * Principal given permission to retire the grant. For more information,
     * see <a>RetireGrant</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Principal given permission to retire the grant. For more information,
     *         see <a>RetireGrant</a>.
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }
    
    /**
     * Principal given permission to retire the grant. For more information,
     * see <a>RetireGrant</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal Principal given permission to retire the grant. For more information,
     *         see <a>RetireGrant</a>.
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }
    
    /**
     * Principal given permission to retire the grant. For more information,
     * see <a>RetireGrant</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal Principal given permission to retire the grant. For more information,
     *         see <a>RetireGrant</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantRequest withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
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
    public CreateGrantRequest withOperations(String... operations) {
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
    public CreateGrantRequest withOperations(java.util.Collection<String> operations) {
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
    public CreateGrantRequest withOperations(GrantOperation... operations) {
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
    public CreateGrantRequest withConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * List of grant tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return List of grant tokens.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
              grantTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              grantTokens.setAutoConstruct(true);
        }
        return grantTokens;
    }
    
    /**
     * List of grant tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens List of grant tokens.
     */
    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(grantTokens.size());
        grantTokensCopy.addAll(grantTokens);
        this.grantTokens = grantTokensCopy;
    }
    
    /**
     * List of grant tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens List of grant tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * List of grant tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens List of grant tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(grantTokens.size());
            grantTokensCopy.addAll(grantTokens);
            this.grantTokens = grantTokensCopy;
        }

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
        if (getGranteePrincipal() != null) sb.append("GranteePrincipal: " + getGranteePrincipal() + ",");
        if (getRetiringPrincipal() != null) sb.append("RetiringPrincipal: " + getRetiringPrincipal() + ",");
        if (getOperations() != null) sb.append("Operations: " + getOperations() + ",");
        if (getConstraints() != null) sb.append("Constraints: " + getConstraints() + ",");
        if (getGrantTokens() != null) sb.append("GrantTokens: " + getGrantTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal().hashCode()); 
        hashCode = prime * hashCode + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode()); 
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode()); 
        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateGrantRequest == false) return false;
        CreateGrantRequest other = (CreateGrantRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null) return false;
        if (other.getGranteePrincipal() != null && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false) return false; 
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null) return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false) return false; 
        if (other.getOperations() == null ^ this.getOperations() == null) return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false) return false; 
        if (other.getConstraints() == null ^ this.getConstraints() == null) return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
}
    