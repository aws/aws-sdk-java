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
 * Proposed access control configuration for a KMS key. You can propose a configuration for a new KMS key or an existing
 * KMS key that you own by specifying the key policy and KMS grant configuration. If the configuration is for an
 * existing key and you do not specify the key policy, the access preview uses the existing policy for the key. If the
 * access preview is for a new resource and you do not specify the key policy, then the access preview uses the default
 * key policy. The proposed key policy cannot be an empty string. For more information, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default key
 * policy</a>. For more information about key policy limits, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/resource-limits.html">Resource quotas</a>.
 * </p>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/KmsKeyConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsKeyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing
     * key, the access preview uses the proposed list of grant configurations in place of the existing grants.
     * Otherwise, the access preview uses the existing grants for the key.
     * </p>
     */
    private java.util.List<KmsGrantConfiguration> grants;
    /**
     * <p>
     * Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     * <code>default</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default key
     * policy</a>.
     * </p>
     */
    private java.util.Map<String, String> keyPolicies;

    /**
     * <p>
     * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing
     * key, the access preview uses the proposed list of grant configurations in place of the existing grants.
     * Otherwise, the access preview uses the existing grants for the key.
     * </p>
     * 
     * @return A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an
     *         existing key, the access preview uses the proposed list of grant configurations in place of the existing
     *         grants. Otherwise, the access preview uses the existing grants for the key.
     */

    public java.util.List<KmsGrantConfiguration> getGrants() {
        return grants;
    }

    /**
     * <p>
     * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing
     * key, the access preview uses the proposed list of grant configurations in place of the existing grants.
     * Otherwise, the access preview uses the existing grants for the key.
     * </p>
     * 
     * @param grants
     *        A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an
     *        existing key, the access preview uses the proposed list of grant configurations in place of the existing
     *        grants. Otherwise, the access preview uses the existing grants for the key.
     */

    public void setGrants(java.util.Collection<KmsGrantConfiguration> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<KmsGrantConfiguration>(grants);
    }

    /**
     * <p>
     * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing
     * key, the access preview uses the proposed list of grant configurations in place of the existing grants.
     * Otherwise, the access preview uses the existing grants for the key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrants(java.util.Collection)} or {@link #withGrants(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param grants
     *        A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an
     *        existing key, the access preview uses the proposed list of grant configurations in place of the existing
     *        grants. Otherwise, the access preview uses the existing grants for the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKeyConfiguration withGrants(KmsGrantConfiguration... grants) {
        if (this.grants == null) {
            setGrants(new java.util.ArrayList<KmsGrantConfiguration>(grants.length));
        }
        for (KmsGrantConfiguration ele : grants) {
            this.grants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing
     * key, the access preview uses the proposed list of grant configurations in place of the existing grants.
     * Otherwise, the access preview uses the existing grants for the key.
     * </p>
     * 
     * @param grants
     *        A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an
     *        existing key, the access preview uses the proposed list of grant configurations in place of the existing
     *        grants. Otherwise, the access preview uses the existing grants for the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKeyConfiguration withGrants(java.util.Collection<KmsGrantConfiguration> grants) {
        setGrants(grants);
        return this;
    }

    /**
     * <p>
     * Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     * <code>default</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default key
     * policy</a>.
     * </p>
     * 
     * @return Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     *         <code>default</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *         key policy</a>.
     */

    public java.util.Map<String, String> getKeyPolicies() {
        return keyPolicies;
    }

    /**
     * <p>
     * Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     * <code>default</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default key
     * policy</a>.
     * </p>
     * 
     * @param keyPolicies
     *        Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     *        <code>default</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        key policy</a>.
     */

    public void setKeyPolicies(java.util.Map<String, String> keyPolicies) {
        this.keyPolicies = keyPolicies;
    }

    /**
     * <p>
     * Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     * <code>default</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default key
     * policy</a>.
     * </p>
     * 
     * @param keyPolicies
     *        Resource policy configuration for the KMS key. The only valid value for the name of the key policy is
     *        <code>default</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        key policy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKeyConfiguration withKeyPolicies(java.util.Map<String, String> keyPolicies) {
        setKeyPolicies(keyPolicies);
        return this;
    }

    /**
     * Add a single KeyPolicies entry
     *
     * @see KmsKeyConfiguration#withKeyPolicies
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KmsKeyConfiguration addKeyPoliciesEntry(String key, String value) {
        if (null == this.keyPolicies) {
            this.keyPolicies = new java.util.HashMap<String, String>();
        }
        if (this.keyPolicies.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyPolicies.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyPolicies.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKeyConfiguration clearKeyPoliciesEntries() {
        this.keyPolicies = null;
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
        if (getGrants() != null)
            sb.append("Grants: ").append(getGrants()).append(",");
        if (getKeyPolicies() != null)
            sb.append("KeyPolicies: ").append(getKeyPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KmsKeyConfiguration == false)
            return false;
        KmsKeyConfiguration other = (KmsKeyConfiguration) obj;
        if (other.getGrants() == null ^ this.getGrants() == null)
            return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false)
            return false;
        if (other.getKeyPolicies() == null ^ this.getKeyPolicies() == null)
            return false;
        if (other.getKeyPolicies() != null && other.getKeyPolicies().equals(this.getKeyPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode());
        hashCode = prime * hashCode + ((getKeyPolicies() == null) ? 0 : getKeyPolicies().hashCode());
        return hashCode;
    }

    @Override
    public KmsKeyConfiguration clone() {
        try {
            return (KmsKeyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.KmsKeyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
