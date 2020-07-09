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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the secret that you want to validate a resource policy. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen
     * followed by six characters.
     * </p>
     * <p>
     * If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     * <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you
     * receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your
     * permissions.
     * </p>
     * </note>
     */
    private String secretId;
    /**
     * <p>
     * Identifies the Resource Policy attached to the secret.
     * </p>
     */
    private String resourcePolicy;

    /**
     * <p>
     * The identifier for the secret that you want to validate a resource policy. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen
     * followed by six characters.
     * </p>
     * <p>
     * If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     * <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you
     * receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your
     * permissions.
     * </p>
     * </note>
     * 
     * @param secretId
     *        The identifier for the secret that you want to validate a resource policy. You can specify either the
     *        Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names ending with a hyphen followed by six characters.
     *        </p>
     *        <p>
     *        If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     *        <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager,
     *        you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending
     *        on your permissions.
     *        </p>
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The identifier for the secret that you want to validate a resource policy. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen
     * followed by six characters.
     * </p>
     * <p>
     * If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     * <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you
     * receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your
     * permissions.
     * </p>
     * </note>
     * 
     * @return The identifier for the secret that you want to validate a resource policy. You can specify either the
     *         Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *         <p>
     *         If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *         ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *         adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *         uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by
     *         six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use
     *         that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a
     *         complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you
     *         don’t create secret names ending with a hyphen followed by six characters.
     *         </p>
     *         <p>
     *         If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     *         <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager,
     *         you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending
     *         on your permissions.
     *         </p>
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The identifier for the secret that you want to validate a resource policy. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen
     * followed by six characters.
     * </p>
     * <p>
     * If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     * <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you
     * receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your
     * permissions.
     * </p>
     * </note>
     * 
     * @param secretId
     *        The identifier for the secret that you want to validate a resource policy. You can specify either the
     *        Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names ending with a hyphen followed by six characters.
     *        </p>
     *        <p>
     *        If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you
     *        <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager,
     *        you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending
     *        on your permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * Identifies the Resource Policy attached to the secret.
     * </p>
     * 
     * @param resourcePolicy
     *        Identifies the Resource Policy attached to the secret.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * Identifies the Resource Policy attached to the secret.
     * </p>
     * 
     * @return Identifies the Resource Policy attached to the secret.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * Identifies the Resource Policy attached to the secret.
     * </p>
     * 
     * @param resourcePolicy
     *        Identifies the Resource Policy attached to the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateResourcePolicyRequest == false)
            return false;
        ValidateResourcePolicyRequest other = (ValidateResourcePolicyRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public ValidateResourcePolicyRequest clone() {
        return (ValidateResourcePolicyRequest) super.clone();
    }

}
