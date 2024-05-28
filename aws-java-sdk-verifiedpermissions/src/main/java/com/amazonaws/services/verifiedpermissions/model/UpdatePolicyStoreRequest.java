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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that you want to update
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * A structure that defines the validation settings that want to enable for the policy store.
     * </p>
     */
    private ValidationSettings validationSettings;
    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies the ID of the policy store that you want to update
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that you want to update
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that you want to update
     * </p>
     * 
     * @return Specifies the ID of the policy store that you want to update
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that you want to update
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that you want to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * A structure that defines the validation settings that want to enable for the policy store.
     * </p>
     * 
     * @param validationSettings
     *        A structure that defines the validation settings that want to enable for the policy store.
     */

    public void setValidationSettings(ValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
    }

    /**
     * <p>
     * A structure that defines the validation settings that want to enable for the policy store.
     * </p>
     * 
     * @return A structure that defines the validation settings that want to enable for the policy store.
     */

    public ValidationSettings getValidationSettings() {
        return this.validationSettings;
    }

    /**
     * <p>
     * A structure that defines the validation settings that want to enable for the policy store.
     * </p>
     * 
     * @param validationSettings
     *        A structure that defines the validation settings that want to enable for the policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreRequest withValidationSettings(ValidationSettings validationSettings) {
        setValidationSettings(validationSettings);
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

    public UpdatePolicyStoreRequest withDescription(String description) {
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
        if (getValidationSettings() != null)
            sb.append("ValidationSettings: ").append(getValidationSettings()).append(",");
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

        if (obj instanceof UpdatePolicyStoreRequest == false)
            return false;
        UpdatePolicyStoreRequest other = (UpdatePolicyStoreRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getValidationSettings() == null ^ this.getValidationSettings() == null)
            return false;
        if (other.getValidationSettings() != null && other.getValidationSettings().equals(this.getValidationSettings()) == false)
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
        hashCode = prime * hashCode + ((getValidationSettings() == null) ? 0 : getValidationSettings().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyStoreRequest clone() {
        return (UpdatePolicyStoreRequest) super.clone();
    }

}
