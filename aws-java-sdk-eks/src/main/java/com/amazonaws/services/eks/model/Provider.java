/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the secrets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Provider" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Provider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the
     * same region as the cluster, and if the CMK was created in a different account, the user must have access to the
     * CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html">Allowing
     * Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String keyArn;

    /**
     * <p>
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the
     * same region as the cluster, and if the CMK was created in a different account, the user must have access to the
     * CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html">Allowing
     * Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyArn
     *        Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created
     *        in the same region as the cluster, and if the CMK was created in a different account, the user must have
     *        access to the CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html"
     *        >Allowing Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the
     * same region as the cluster, and if the CMK was created in a different account, the user must have access to the
     * CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html">Allowing
     * Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created
     *         in the same region as the cluster, and if the CMK was created in a different account, the user must have
     *         access to the CMK. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html"
     *         >Allowing Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the
     * same region as the cluster, and if the CMK was created in a different account, the user must have access to the
     * CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html">Allowing
     * Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyArn
     *        Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created
     *        in the same region as the cluster, and if the CMK was created in a different account, the user must have
     *        access to the CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html"
     *        >Allowing Users in Other Accounts to Use a CMK</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Provider withKeyArn(String keyArn) {
        setKeyArn(keyArn);
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Provider == false)
            return false;
        Provider other = (Provider) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public Provider clone() {
        try {
            return (Provider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
