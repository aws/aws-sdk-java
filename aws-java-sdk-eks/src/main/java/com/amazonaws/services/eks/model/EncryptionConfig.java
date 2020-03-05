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
 * The encryption configuration for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/EncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     * </p>
     */
    private Provider provider;

    /**
     * <p>
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * </p>
     * 
     * @return Specifies the resources to be encrypted. The only supported value is "secrets".
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * </p>
     * 
     * @param resources
     *        Specifies the resources to be encrypted. The only supported value is "secrets".
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Specifies the resources to be encrypted. The only supported value is "secrets".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * </p>
     * 
     * @param resources
     *        Specifies the resources to be encrypted. The only supported value is "secrets".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     * </p>
     * 
     * @param provider
     *        AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     */

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     * </p>
     * 
     * @return AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     */

    public Provider getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     * </p>
     * 
     * @param provider
     *        AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withProvider(Provider provider) {
        setProvider(provider);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfig == false)
            return false;
        EncryptionConfig other = (EncryptionConfig) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfig clone() {
        try {
            return (EncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.EncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
