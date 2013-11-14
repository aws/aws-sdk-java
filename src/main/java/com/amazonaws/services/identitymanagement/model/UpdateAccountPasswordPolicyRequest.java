/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest) UpdateAccountPasswordPolicy operation}.
 * <p>
 * Updates the password policy settings for the account. For more information about using a password policy, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"> Managing an IAM Password Policy </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest)
 */
public class UpdateAccountPasswordPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    private Integer minimumPasswordLength;

    private Boolean requireSymbols;

    private Boolean requireNumbers;

    private Boolean requireUppercaseCharacters;

    private Boolean requireLowercaseCharacters;

    private Boolean allowUsersToChangePassword;

    /**
     * Returns the value of the MinimumPasswordLength property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @return The value of the MinimumPasswordLength property for this object.
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }
    
    /**
     * Sets the value of the MinimumPasswordLength property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength The new value for the MinimumPasswordLength property for this object.
     */
    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }
    
    /**
     * Sets the value of the MinimumPasswordLength property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength The new value for the MinimumPasswordLength property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * Returns the value of the RequireSymbols property for this object.
     *
     * @return The value of the RequireSymbols property for this object.
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }
    
    /**
     * Sets the value of the RequireSymbols property for this object.
     *
     * @param requireSymbols The new value for the RequireSymbols property for this object.
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }
    
    /**
     * Sets the value of the RequireSymbols property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireSymbols The new value for the RequireSymbols property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * Returns the value of the RequireSymbols property for this object.
     *
     * @return The value of the RequireSymbols property for this object.
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * Returns the value of the RequireNumbers property for this object.
     *
     * @return The value of the RequireNumbers property for this object.
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }
    
    /**
     * Sets the value of the RequireNumbers property for this object.
     *
     * @param requireNumbers The new value for the RequireNumbers property for this object.
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }
    
    /**
     * Sets the value of the RequireNumbers property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireNumbers The new value for the RequireNumbers property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * Returns the value of the RequireNumbers property for this object.
     *
     * @return The value of the RequireNumbers property for this object.
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * Returns the value of the RequireUppercaseCharacters property for this
     * object.
     *
     * @return The value of the RequireUppercaseCharacters property for this object.
     */
    public Boolean isRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }
    
    /**
     * Sets the value of the RequireUppercaseCharacters property for this
     * object.
     *
     * @param requireUppercaseCharacters The new value for the RequireUppercaseCharacters property for this
     *         object.
     */
    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }
    
    /**
     * Sets the value of the RequireUppercaseCharacters property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireUppercaseCharacters The new value for the RequireUppercaseCharacters property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * Returns the value of the RequireUppercaseCharacters property for this
     * object.
     *
     * @return The value of the RequireUppercaseCharacters property for this object.
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * Returns the value of the RequireLowercaseCharacters property for this
     * object.
     *
     * @return The value of the RequireLowercaseCharacters property for this object.
     */
    public Boolean isRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }
    
    /**
     * Sets the value of the RequireLowercaseCharacters property for this
     * object.
     *
     * @param requireLowercaseCharacters The new value for the RequireLowercaseCharacters property for this
     *         object.
     */
    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }
    
    /**
     * Sets the value of the RequireLowercaseCharacters property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireLowercaseCharacters The new value for the RequireLowercaseCharacters property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * Returns the value of the RequireLowercaseCharacters property for this
     * object.
     *
     * @return The value of the RequireLowercaseCharacters property for this object.
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * Returns the value of the AllowUsersToChangePassword property for this
     * object.
     *
     * @return The value of the AllowUsersToChangePassword property for this object.
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }
    
    /**
     * Sets the value of the AllowUsersToChangePassword property for this
     * object.
     *
     * @param allowUsersToChangePassword The new value for the AllowUsersToChangePassword property for this
     *         object.
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }
    
    /**
     * Sets the value of the AllowUsersToChangePassword property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUsersToChangePassword The new value for the AllowUsersToChangePassword property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * Returns the value of the AllowUsersToChangePassword property for this
     * object.
     *
     * @return The value of the AllowUsersToChangePassword property for this object.
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinimumPasswordLength() != null) sb.append("MinimumPasswordLength: " + getMinimumPasswordLength() + ",");
        if (isRequireSymbols() != null) sb.append("RequireSymbols: " + isRequireSymbols() + ",");
        if (isRequireNumbers() != null) sb.append("RequireNumbers: " + isRequireNumbers() + ",");
        if (isRequireUppercaseCharacters() != null) sb.append("RequireUppercaseCharacters: " + isRequireUppercaseCharacters() + ",");
        if (isRequireLowercaseCharacters() != null) sb.append("RequireLowercaseCharacters: " + isRequireLowercaseCharacters() + ",");
        if (isAllowUsersToChangePassword() != null) sb.append("AllowUsersToChangePassword: " + isAllowUsersToChangePassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMinimumPasswordLength() == null) ? 0 : getMinimumPasswordLength().hashCode()); 
        hashCode = prime * hashCode + ((isRequireSymbols() == null) ? 0 : isRequireSymbols().hashCode()); 
        hashCode = prime * hashCode + ((isRequireNumbers() == null) ? 0 : isRequireNumbers().hashCode()); 
        hashCode = prime * hashCode + ((isRequireUppercaseCharacters() == null) ? 0 : isRequireUppercaseCharacters().hashCode()); 
        hashCode = prime * hashCode + ((isRequireLowercaseCharacters() == null) ? 0 : isRequireLowercaseCharacters().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUsersToChangePassword() == null) ? 0 : isAllowUsersToChangePassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAccountPasswordPolicyRequest == false) return false;
        UpdateAccountPasswordPolicyRequest other = (UpdateAccountPasswordPolicyRequest)obj;
        
        if (other.getMinimumPasswordLength() == null ^ this.getMinimumPasswordLength() == null) return false;
        if (other.getMinimumPasswordLength() != null && other.getMinimumPasswordLength().equals(this.getMinimumPasswordLength()) == false) return false; 
        if (other.isRequireSymbols() == null ^ this.isRequireSymbols() == null) return false;
        if (other.isRequireSymbols() != null && other.isRequireSymbols().equals(this.isRequireSymbols()) == false) return false; 
        if (other.isRequireNumbers() == null ^ this.isRequireNumbers() == null) return false;
        if (other.isRequireNumbers() != null && other.isRequireNumbers().equals(this.isRequireNumbers()) == false) return false; 
        if (other.isRequireUppercaseCharacters() == null ^ this.isRequireUppercaseCharacters() == null) return false;
        if (other.isRequireUppercaseCharacters() != null && other.isRequireUppercaseCharacters().equals(this.isRequireUppercaseCharacters()) == false) return false; 
        if (other.isRequireLowercaseCharacters() == null ^ this.isRequireLowercaseCharacters() == null) return false;
        if (other.isRequireLowercaseCharacters() != null && other.isRequireLowercaseCharacters().equals(this.isRequireLowercaseCharacters()) == false) return false; 
        if (other.isAllowUsersToChangePassword() == null ^ this.isAllowUsersToChangePassword() == null) return false;
        if (other.isAllowUsersToChangePassword() != null && other.isAllowUsersToChangePassword().equals(this.isAllowUsersToChangePassword()) == false) return false; 
        return true;
    }
    
}
    