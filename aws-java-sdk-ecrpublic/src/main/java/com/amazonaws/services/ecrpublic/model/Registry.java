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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a public registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/Registry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Registry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID associated with the registry. If you do not specify a registry, the default public registry is
     * assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the public registry.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The URI of a public registry. The URI contains a universal prefix and the registry alias.
     * </p>
     */
    private String registryUri;
    /**
     * <p>
     * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account
     * is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
     * </p>
     */
    private Boolean verified;
    /**
     * <p>
     * An array of objects representing the aliases for a public registry.
     * </p>
     */
    private java.util.List<RegistryAlias> aliases;

    /**
     * <p>
     * The AWS account ID associated with the registry. If you do not specify a registry, the default public registry is
     * assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry. If you do not specify a registry, the default public
     *        registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry. If you do not specify a registry, the default public registry is
     * assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry. If you do not specify a registry, the default public
     *         registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry. If you do not specify a registry, the default public registry is
     * assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry. If you do not specify a registry, the default public
     *        registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the public registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the public registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the public registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the public registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the public registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the public registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * The URI of a public registry. The URI contains a universal prefix and the registry alias.
     * </p>
     * 
     * @param registryUri
     *        The URI of a public registry. The URI contains a universal prefix and the registry alias.
     */

    public void setRegistryUri(String registryUri) {
        this.registryUri = registryUri;
    }

    /**
     * <p>
     * The URI of a public registry. The URI contains a universal prefix and the registry alias.
     * </p>
     * 
     * @return The URI of a public registry. The URI contains a universal prefix and the registry alias.
     */

    public String getRegistryUri() {
        return this.registryUri;
    }

    /**
     * <p>
     * The URI of a public registry. The URI contains a universal prefix and the registry alias.
     * </p>
     * 
     * @param registryUri
     *        The URI of a public registry. The URI contains a universal prefix and the registry alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withRegistryUri(String registryUri) {
        setRegistryUri(registryUri);
        return this;
    }

    /**
     * <p>
     * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account
     * is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @param verified
     *        Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an
     *        account is verified, each public repository will received a verified account badge on the Amazon ECR
     *        Public Gallery.
     */

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * <p>
     * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account
     * is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @return Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an
     *         account is verified, each public repository will received a verified account badge on the Amazon ECR
     *         Public Gallery.
     */

    public Boolean getVerified() {
        return this.verified;
    }

    /**
     * <p>
     * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account
     * is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @param verified
     *        Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an
     *        account is verified, each public repository will received a verified account badge on the Amazon ECR
     *        Public Gallery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withVerified(Boolean verified) {
        setVerified(verified);
        return this;
    }

    /**
     * <p>
     * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account
     * is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @return Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an
     *         account is verified, each public repository will received a verified account badge on the Amazon ECR
     *         Public Gallery.
     */

    public Boolean isVerified() {
        return this.verified;
    }

    /**
     * <p>
     * An array of objects representing the aliases for a public registry.
     * </p>
     * 
     * @return An array of objects representing the aliases for a public registry.
     */

    public java.util.List<RegistryAlias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * An array of objects representing the aliases for a public registry.
     * </p>
     * 
     * @param aliases
     *        An array of objects representing the aliases for a public registry.
     */

    public void setAliases(java.util.Collection<RegistryAlias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<RegistryAlias>(aliases);
    }

    /**
     * <p>
     * An array of objects representing the aliases for a public registry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        An array of objects representing the aliases for a public registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withAliases(RegistryAlias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<RegistryAlias>(aliases.length));
        }
        for (RegistryAlias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the aliases for a public registry.
     * </p>
     * 
     * @param aliases
     *        An array of objects representing the aliases for a public registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Registry withAliases(java.util.Collection<RegistryAlias> aliases) {
        setAliases(aliases);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getRegistryUri() != null)
            sb.append("RegistryUri: ").append(getRegistryUri()).append(",");
        if (getVerified() != null)
            sb.append("Verified: ").append(getVerified()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Registry == false)
            return false;
        Registry other = (Registry) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getRegistryUri() == null ^ this.getRegistryUri() == null)
            return false;
        if (other.getRegistryUri() != null && other.getRegistryUri().equals(this.getRegistryUri()) == false)
            return false;
        if (other.getVerified() == null ^ this.getVerified() == null)
            return false;
        if (other.getVerified() != null && other.getVerified().equals(this.getVerified()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getRegistryUri() == null) ? 0 : getRegistryUri().hashCode());
        hashCode = prime * hashCode + ((getVerified() == null) ? 0 : getVerified().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        return hashCode;
    }

    @Override
    public Registry clone() {
        try {
            return (Registry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.RegistryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
