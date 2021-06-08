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
 * An object representing the aliases for a public registry. A public registry is given an alias upon creation but a
 * custom alias can be set using the Amazon ECR console. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html">Registries</a> in the <i>Amazon Elastic
 * Container Registry User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/RegistryAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the registry alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the registry alias.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     * registry alias and is displayed in both the repository URL and the image URI used in the <code>docker pull</code>
     * commands on the Amazon ECR Public Gallery.
     * </p>
     * <note>
     * <p>
     * A registry alias that is not the primary registry alias can be used in the repository URI in a
     * <code>docker pull</code> command.
     * </p>
     * </note>
     */
    private Boolean primaryRegistryAlias;
    /**
     * <p>
     * Whether or not the registry alias is the default alias for the registry. When the first public repository is
     * created, your public registry is assigned a default registry alias.
     * </p>
     */
    private Boolean defaultRegistryAlias;

    /**
     * <p>
     * The name of the registry alias.
     * </p>
     * 
     * @param name
     *        The name of the registry alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the registry alias.
     * </p>
     * 
     * @return The name of the registry alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the registry alias.
     * </p>
     * 
     * @param name
     *        The name of the registry alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryAlias withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the registry alias.
     * </p>
     * 
     * @param status
     *        The status of the registry alias.
     * @see RegistryAliasStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the registry alias.
     * </p>
     * 
     * @return The status of the registry alias.
     * @see RegistryAliasStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the registry alias.
     * </p>
     * 
     * @param status
     *        The status of the registry alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryAliasStatus
     */

    public RegistryAlias withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the registry alias.
     * </p>
     * 
     * @param status
     *        The status of the registry alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryAliasStatus
     */

    public RegistryAlias withStatus(RegistryAliasStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     * registry alias and is displayed in both the repository URL and the image URI used in the <code>docker pull</code>
     * commands on the Amazon ECR Public Gallery.
     * </p>
     * <note>
     * <p>
     * A registry alias that is not the primary registry alias can be used in the repository URI in a
     * <code>docker pull</code> command.
     * </p>
     * </note>
     * 
     * @param primaryRegistryAlias
     *        Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     *        registry alias and is displayed in both the repository URL and the image URI used in the
     *        <code>docker pull</code> commands on the Amazon ECR Public Gallery.</p> <note>
     *        <p>
     *        A registry alias that is not the primary registry alias can be used in the repository URI in a
     *        <code>docker pull</code> command.
     *        </p>
     */

    public void setPrimaryRegistryAlias(Boolean primaryRegistryAlias) {
        this.primaryRegistryAlias = primaryRegistryAlias;
    }

    /**
     * <p>
     * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     * registry alias and is displayed in both the repository URL and the image URI used in the <code>docker pull</code>
     * commands on the Amazon ECR Public Gallery.
     * </p>
     * <note>
     * <p>
     * A registry alias that is not the primary registry alias can be used in the repository URI in a
     * <code>docker pull</code> command.
     * </p>
     * </note>
     * 
     * @return Whether or not the registry alias is the primary alias for the registry. If true, the alias is the
     *         primary registry alias and is displayed in both the repository URL and the image URI used in the
     *         <code>docker pull</code> commands on the Amazon ECR Public Gallery.</p> <note>
     *         <p>
     *         A registry alias that is not the primary registry alias can be used in the repository URI in a
     *         <code>docker pull</code> command.
     *         </p>
     */

    public Boolean getPrimaryRegistryAlias() {
        return this.primaryRegistryAlias;
    }

    /**
     * <p>
     * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     * registry alias and is displayed in both the repository URL and the image URI used in the <code>docker pull</code>
     * commands on the Amazon ECR Public Gallery.
     * </p>
     * <note>
     * <p>
     * A registry alias that is not the primary registry alias can be used in the repository URI in a
     * <code>docker pull</code> command.
     * </p>
     * </note>
     * 
     * @param primaryRegistryAlias
     *        Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     *        registry alias and is displayed in both the repository URL and the image URI used in the
     *        <code>docker pull</code> commands on the Amazon ECR Public Gallery.</p> <note>
     *        <p>
     *        A registry alias that is not the primary registry alias can be used in the repository URI in a
     *        <code>docker pull</code> command.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryAlias withPrimaryRegistryAlias(Boolean primaryRegistryAlias) {
        setPrimaryRegistryAlias(primaryRegistryAlias);
        return this;
    }

    /**
     * <p>
     * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary
     * registry alias and is displayed in both the repository URL and the image URI used in the <code>docker pull</code>
     * commands on the Amazon ECR Public Gallery.
     * </p>
     * <note>
     * <p>
     * A registry alias that is not the primary registry alias can be used in the repository URI in a
     * <code>docker pull</code> command.
     * </p>
     * </note>
     * 
     * @return Whether or not the registry alias is the primary alias for the registry. If true, the alias is the
     *         primary registry alias and is displayed in both the repository URL and the image URI used in the
     *         <code>docker pull</code> commands on the Amazon ECR Public Gallery.</p> <note>
     *         <p>
     *         A registry alias that is not the primary registry alias can be used in the repository URI in a
     *         <code>docker pull</code> command.
     *         </p>
     */

    public Boolean isPrimaryRegistryAlias() {
        return this.primaryRegistryAlias;
    }

    /**
     * <p>
     * Whether or not the registry alias is the default alias for the registry. When the first public repository is
     * created, your public registry is assigned a default registry alias.
     * </p>
     * 
     * @param defaultRegistryAlias
     *        Whether or not the registry alias is the default alias for the registry. When the first public repository
     *        is created, your public registry is assigned a default registry alias.
     */

    public void setDefaultRegistryAlias(Boolean defaultRegistryAlias) {
        this.defaultRegistryAlias = defaultRegistryAlias;
    }

    /**
     * <p>
     * Whether or not the registry alias is the default alias for the registry. When the first public repository is
     * created, your public registry is assigned a default registry alias.
     * </p>
     * 
     * @return Whether or not the registry alias is the default alias for the registry. When the first public repository
     *         is created, your public registry is assigned a default registry alias.
     */

    public Boolean getDefaultRegistryAlias() {
        return this.defaultRegistryAlias;
    }

    /**
     * <p>
     * Whether or not the registry alias is the default alias for the registry. When the first public repository is
     * created, your public registry is assigned a default registry alias.
     * </p>
     * 
     * @param defaultRegistryAlias
     *        Whether or not the registry alias is the default alias for the registry. When the first public repository
     *        is created, your public registry is assigned a default registry alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryAlias withDefaultRegistryAlias(Boolean defaultRegistryAlias) {
        setDefaultRegistryAlias(defaultRegistryAlias);
        return this;
    }

    /**
     * <p>
     * Whether or not the registry alias is the default alias for the registry. When the first public repository is
     * created, your public registry is assigned a default registry alias.
     * </p>
     * 
     * @return Whether or not the registry alias is the default alias for the registry. When the first public repository
     *         is created, your public registry is assigned a default registry alias.
     */

    public Boolean isDefaultRegistryAlias() {
        return this.defaultRegistryAlias;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPrimaryRegistryAlias() != null)
            sb.append("PrimaryRegistryAlias: ").append(getPrimaryRegistryAlias()).append(",");
        if (getDefaultRegistryAlias() != null)
            sb.append("DefaultRegistryAlias: ").append(getDefaultRegistryAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryAlias == false)
            return false;
        RegistryAlias other = (RegistryAlias) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPrimaryRegistryAlias() == null ^ this.getPrimaryRegistryAlias() == null)
            return false;
        if (other.getPrimaryRegistryAlias() != null && other.getPrimaryRegistryAlias().equals(this.getPrimaryRegistryAlias()) == false)
            return false;
        if (other.getDefaultRegistryAlias() == null ^ this.getDefaultRegistryAlias() == null)
            return false;
        if (other.getDefaultRegistryAlias() != null && other.getDefaultRegistryAlias().equals(this.getDefaultRegistryAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPrimaryRegistryAlias() == null) ? 0 : getPrimaryRegistryAlias().hashCode());
        hashCode = prime * hashCode + ((getDefaultRegistryAlias() == null) ? 0 : getDefaultRegistryAlias().hashCode());
        return hashCode;
    }

    @Override
    public RegistryAlias clone() {
        try {
            return (RegistryAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.RegistryAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
