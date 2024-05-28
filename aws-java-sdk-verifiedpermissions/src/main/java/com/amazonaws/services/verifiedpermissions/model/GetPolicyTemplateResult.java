/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the policy store that contains the policy template.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * The ID of the policy template.
     * </p>
     */
    private String policyTemplateId;
    /**
     * <p>
     * The description of the policy template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The content of the body of the policy template written in the Cedar policy language.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * The date and time that the policy template was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time that the policy template was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The ID of the policy store that contains the policy template.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store that contains the policy template.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store that contains the policy template.
     * </p>
     * 
     * @return The ID of the policy store that contains the policy template.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store that contains the policy template.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store that contains the policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * The ID of the policy template.
     * </p>
     * 
     * @param policyTemplateId
     *        The ID of the policy template.
     */

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * <p>
     * The ID of the policy template.
     * </p>
     * 
     * @return The ID of the policy template.
     */

    public String getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * <p>
     * The ID of the policy template.
     * </p>
     * 
     * @param policyTemplateId
     *        The ID of the policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withPolicyTemplateId(String policyTemplateId) {
        setPolicyTemplateId(policyTemplateId);
        return this;
    }

    /**
     * <p>
     * The description of the policy template.
     * </p>
     * 
     * @param description
     *        The description of the policy template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the policy template.
     * </p>
     * 
     * @return The description of the policy template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the policy template.
     * </p>
     * 
     * @param description
     *        The description of the policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The content of the body of the policy template written in the Cedar policy language.
     * </p>
     * 
     * @param statement
     *        The content of the body of the policy template written in the Cedar policy language.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The content of the body of the policy template written in the Cedar policy language.
     * </p>
     * 
     * @return The content of the body of the policy template written in the Cedar policy language.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The content of the body of the policy template written in the Cedar policy language.
     * </p>
     * 
     * @param statement
     *        The content of the body of the policy template written in the Cedar policy language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy template was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy template was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the policy template was originally created.
     * </p>
     * 
     * @return The date and time that the policy template was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that the policy template was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy template was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy template was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy template was most recently updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy template was most recently updated.
     * </p>
     * 
     * @return The date and time that the policy template was most recently updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy template was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy template was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyTemplateResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getPolicyTemplateId() != null)
            sb.append("PolicyTemplateId: ").append(getPolicyTemplateId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatement() != null)
            sb.append("Statement: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyTemplateResult == false)
            return false;
        GetPolicyTemplateResult other = (GetPolicyTemplateResult) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyTemplateId() == null ^ this.getPolicyTemplateId() == null)
            return false;
        if (other.getPolicyTemplateId() != null && other.getPolicyTemplateId().equals(this.getPolicyTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplateId() == null) ? 0 : getPolicyTemplateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyTemplateResult clone() {
        try {
            return (GetPolicyTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
