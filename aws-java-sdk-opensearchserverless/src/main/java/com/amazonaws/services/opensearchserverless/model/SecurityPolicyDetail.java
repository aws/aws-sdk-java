/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an OpenSearch Serverless security policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/SecurityPolicyDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityPolicyDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date the policy was created.
     * </p>
     */
    private Long createdDate;
    /**
     * <p>
     * The description of the security policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp of when the policy was last modified.
     * </p>
     */
    private Long lastModifiedDate;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the policy.
     * </p>
     */
    private String policyVersion;
    /**
     * <p>
     * The type of security policy.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @param createdDate
     *        The date the policy was created.
     */

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @return The date the policy was created.
     */

    public Long getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @param createdDate
     *        The date the policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyDetail withCreatedDate(Long createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The description of the security policy.
     * </p>
     * 
     * @param description
     *        The description of the security policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security policy.
     * </p>
     * 
     * @return The description of the security policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security policy.
     * </p>
     * 
     * @param description
     *        The description of the security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the policy was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the policy was last modified.
     */

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the policy was last modified.
     * </p>
     * 
     * @return The timestamp of when the policy was last modified.
     */

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the policy was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyDetail withLastModifiedDate(Long lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the policy.
     * </p>
     * 
     * @param policyVersion
     *        The version of the policy.
     */

    public void setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
    }

    /**
     * <p>
     * The version of the policy.
     * </p>
     * 
     * @return The version of the policy.
     */

    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * <p>
     * The version of the policy.
     * </p>
     * 
     * @param policyVersion
     *        The version of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyDetail withPolicyVersion(String policyVersion) {
        setPolicyVersion(policyVersion);
        return this;
    }

    /**
     * <p>
     * The type of security policy.
     * </p>
     * 
     * @param type
     *        The type of security policy.
     * @see SecurityPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of security policy.
     * </p>
     * 
     * @return The type of security policy.
     * @see SecurityPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of security policy.
     * </p>
     * 
     * @param type
     *        The type of security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyType
     */

    public SecurityPolicyDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of security policy.
     * </p>
     * 
     * @param type
     *        The type of security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyType
     */

    public SecurityPolicyDetail withType(SecurityPolicyType type) {
        this.type = type.toString();
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicyVersion() != null)
            sb.append("PolicyVersion: ").append(getPolicyVersion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityPolicyDetail == false)
            return false;
        SecurityPolicyDetail other = (SecurityPolicyDetail) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicyVersion() == null ^ this.getPolicyVersion() == null)
            return false;
        if (other.getPolicyVersion() != null && other.getPolicyVersion().equals(this.getPolicyVersion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersion() == null) ? 0 : getPolicyVersion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SecurityPolicyDetail clone() {
        try {
            return (SecurityPolicyDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.SecurityPolicyDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
