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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the policy store;
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy store.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current validation settings for the policy store.
     * </p>
     */
    private ValidationSettings validationSettings;
    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time that the policy store was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the policy store;
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store;
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store;
     * </p>
     * 
     * @return The ID of the policy store;
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store;
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy store.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy store.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy store.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy store.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current validation settings for the policy store.
     * </p>
     * 
     * @param validationSettings
     *        The current validation settings for the policy store.
     */

    public void setValidationSettings(ValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
    }

    /**
     * <p>
     * The current validation settings for the policy store.
     * </p>
     * 
     * @return The current validation settings for the policy store.
     */

    public ValidationSettings getValidationSettings() {
        return this.validationSettings;
    }

    /**
     * <p>
     * The current validation settings for the policy store.
     * </p>
     * 
     * @param validationSettings
     *        The current validation settings for the policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withValidationSettings(ValidationSettings validationSettings) {
        setValidationSettings(validationSettings);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy store was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @return The date and time that the policy store was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy store was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy store was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy store was last updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy store was last updated.
     * </p>
     * 
     * @return The date and time that the policy store was last updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy store was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy store was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @param description
     *        Descriptive text that you can provide to help with identification of the current policy store.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @return Descriptive text that you can provide to help with identification of the current policy store.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @param description
     *        Descriptive text that you can provide to help with identification of the current policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyStoreResult withDescription(String description) {
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getValidationSettings() != null)
            sb.append("ValidationSettings: ").append(getValidationSettings()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyStoreResult == false)
            return false;
        GetPolicyStoreResult other = (GetPolicyStoreResult) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValidationSettings() == null ^ this.getValidationSettings() == null)
            return false;
        if (other.getValidationSettings() != null && other.getValidationSettings().equals(this.getValidationSettings()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
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

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValidationSettings() == null) ? 0 : getValidationSettings().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyStoreResult clone() {
        try {
            return (GetPolicyStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
