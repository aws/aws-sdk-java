/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A proposed grant configuration for a KMS key. For more information, see <a
 * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/KmsGrantConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsGrantConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this structure to propose allowing <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> in the grant only when the operation request includes the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     * context</a>.
     * </p>
     */
    private KmsGrantConstraints constraints;
    /**
     * <p>
     * The principal that is given permission to perform the operations that the grant permits.
     * </p>
     */
    private String granteePrincipal;
    /**
     * <p>
     * The AWS account under which the grant was issued. The account is used to propose KMS grants issued by accounts
     * other than the owner of the key.
     * </p>
     */
    private String issuingAccount;
    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     */
    private java.util.List<String> operations;
    /**
     * <p>
     * The principal that is given permission to retire the grant by using <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     * </p>
     */
    private String retiringPrincipal;

    /**
     * <p>
     * Use this structure to propose allowing <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> in the grant only when the operation request includes the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     * context</a>.
     * </p>
     * 
     * @param constraints
     *        Use this structure to propose allowing <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> in the grant only when the operation request includes the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     *        context</a>.
     */

    public void setConstraints(KmsGrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Use this structure to propose allowing <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> in the grant only when the operation request includes the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     * context</a>.
     * </p>
     * 
     * @return Use this structure to propose allowing <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operations</a> in the grant only when the operation request includes the specified <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     *         context</a>.
     */

    public KmsGrantConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * Use this structure to propose allowing <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> in the grant only when the operation request includes the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     * context</a>.
     * </p>
     * 
     * @param constraints
     *        Use this structure to propose allowing <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> in the grant only when the operation request includes the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     *        context</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConfiguration withConstraints(KmsGrantConstraints constraints) {
        setConstraints(constraints);
        return this;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the grant permits.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that is given permission to perform the operations that the grant permits.
     */

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the grant permits.
     * </p>
     * 
     * @return The principal that is given permission to perform the operations that the grant permits.
     */

    public String getGranteePrincipal() {
        return this.granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the grant permits.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that is given permission to perform the operations that the grant permits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConfiguration withGranteePrincipal(String granteePrincipal) {
        setGranteePrincipal(granteePrincipal);
        return this;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued. The account is used to propose KMS grants issued by accounts
     * other than the owner of the key.
     * </p>
     * 
     * @param issuingAccount
     *        The AWS account under which the grant was issued. The account is used to propose KMS grants issued by
     *        accounts other than the owner of the key.
     */

    public void setIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued. The account is used to propose KMS grants issued by accounts
     * other than the owner of the key.
     * </p>
     * 
     * @return The AWS account under which the grant was issued. The account is used to propose KMS grants issued by
     *         accounts other than the owner of the key.
     */

    public String getIssuingAccount() {
        return this.issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued. The account is used to propose KMS grants issued by accounts
     * other than the owner of the key.
     * </p>
     * 
     * @param issuingAccount
     *        The AWS account under which the grant was issued. The account is used to propose KMS grants issued by
     *        accounts other than the owner of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConfiguration withIssuingAccount(String issuingAccount) {
        setIssuingAccount(issuingAccount);
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * 
     * @return A list of operations that the grant permits.
     * @see KmsGrantOperation
     */

    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits.
     * @see KmsGrantOperation
     */

    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<String>(operations);
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KmsGrantOperation
     */

    public KmsGrantConfiguration withOperations(String... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<String>(operations.length));
        }
        for (String ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KmsGrantOperation
     */

    public KmsGrantConfiguration withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KmsGrantOperation
     */

    public KmsGrantConfiguration withOperations(KmsGrantOperation... operations) {
        java.util.ArrayList<String> operationsCopy = new java.util.ArrayList<String>(operations.length);
        for (KmsGrantOperation value : operations) {
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
     * The principal that is given permission to retire the grant by using <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that is given permission to retire the grant by using <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     */

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     * </p>
     * 
     * @return The principal that is given permission to retire the grant by using <a
     *         href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a>
     *         operation.
     */

    public String getRetiringPrincipal() {
        return this.retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that is given permission to retire the grant by using <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html">RetireGrant</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConfiguration withRetiringPrincipal(String retiringPrincipal) {
        setRetiringPrincipal(retiringPrincipal);
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
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints()).append(",");
        if (getGranteePrincipal() != null)
            sb.append("GranteePrincipal: ").append(getGranteePrincipal()).append(",");
        if (getIssuingAccount() != null)
            sb.append("IssuingAccount: ").append(getIssuingAccount()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: ").append(getRetiringPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KmsGrantConfiguration == false)
            return false;
        KmsGrantConfiguration other = (KmsGrantConfiguration) obj;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null)
            return false;
        if (other.getGranteePrincipal() != null && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false)
            return false;
        if (other.getIssuingAccount() == null ^ this.getIssuingAccount() == null)
            return false;
        if (other.getIssuingAccount() != null && other.getIssuingAccount().equals(this.getIssuingAccount()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal().hashCode());
        hashCode = prime * hashCode + ((getIssuingAccount() == null) ? 0 : getIssuingAccount().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public KmsGrantConfiguration clone() {
        try {
            return (KmsGrantConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.KmsGrantConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
