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
 * Information about a domain, including its name, Amazon Resource Name (ARN), and status. The <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListDomains.html">ListDomains</a> operation
 * returns a list of <code>DomainSummary</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DomainSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The ARN of the domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     */
    private String encryptionKey;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param owner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param owner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * 
     * @return The ARN of the domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the domain. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @see DomainStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string that contains the status of the domain. The valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleted</code>
     *         </p>
     *         </li>
     * @see DomainStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the domain. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the domain. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the domain. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainSummary withStatus(DomainStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that contains the date and time the domain was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     * 
     * @return A timestamp that contains the date and time the domain was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the domain was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that contains the date and time the domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * 
     * @param encryptionKey
     *        The key used to encrypt the domain.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * 
     * @return The key used to encrypt the domain.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The key used to encrypt the domain.
     * </p>
     * 
     * @param encryptionKey
     *        The key used to encrypt the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public DomainSummary clone() {
        try {
            return (DomainSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.DomainSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
