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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a repository, including its Amazon Resource Name (ARN), description, and domain information. The <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListRepositories.html">ListRepositories</a>
 * operation returns a list of <code>RepositorySummary</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/RepositorySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS account ID that manages the repository.
     * </p>
     */
    private String administratorAccount;
    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The ARN of the repository.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the repository.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS account ID that manages the repository.
     * </p>
     * 
     * @param administratorAccount
     *        The AWS account ID that manages the repository.
     */

    public void setAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
    }

    /**
     * <p>
     * The AWS account ID that manages the repository.
     * </p>
     * 
     * @return The AWS account ID that manages the repository.
     */

    public String getAdministratorAccount() {
        return this.administratorAccount;
    }

    /**
     * <p>
     * The AWS account ID that manages the repository.
     * </p>
     * 
     * @param administratorAccount
     *        The AWS account ID that manages the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withAdministratorAccount(String administratorAccount) {
        setAdministratorAccount(administratorAccount);
        return this;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the repository.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @return The name of the domain that contains the repository.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param arn
     *        The ARN of the repository.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @return The ARN of the repository.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param arn
     *        The ARN of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the repository.
     * </p>
     * 
     * @param description
     *        The description of the repository.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the repository.
     * </p>
     * 
     * @return The description of the repository.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the repository.
     * </p>
     * 
     * @param description
     *        The description of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySummary withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAdministratorAccount() != null)
            sb.append("AdministratorAccount: ").append(getAdministratorAccount()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositorySummary == false)
            return false;
        RepositorySummary other = (RepositorySummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAdministratorAccount() == null ^ this.getAdministratorAccount() == null)
            return false;
        if (other.getAdministratorAccount() != null && other.getAdministratorAccount().equals(this.getAdministratorAccount()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAdministratorAccount() == null) ? 0 : getAdministratorAccount().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public RepositorySummary clone() {
        try {
            return (RepositorySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.RepositorySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
