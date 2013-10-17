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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#setPermission(SetPermissionRequest) SetPermission operation}.
 * <p>
 * Specifies a stack's permissions. For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html">
 * Security and Permissions </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#setPermission(SetPermissionRequest)
 */
public class SetPermissionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The user's IAM ARN.
     */
    private String iamUserArn;

    /**
     * The user is allowed to use SSH to communicate with the instance.
     */
    private Boolean allowSsh;

    /**
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     */
    private Boolean allowSudo;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetPermissionRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The user's IAM ARN.
     *
     * @return The user's IAM ARN.
     */
    public String getIamUserArn() {
        return iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     *
     * @param iamUserArn The user's IAM ARN.
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArn The user's IAM ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetPermissionRequest withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * The user is allowed to use SSH to communicate with the instance.
     *
     * @return The user is allowed to use SSH to communicate with the instance.
     */
    public Boolean isAllowSsh() {
        return allowSsh;
    }
    
    /**
     * The user is allowed to use SSH to communicate with the instance.
     *
     * @param allowSsh The user is allowed to use SSH to communicate with the instance.
     */
    public void setAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
    }
    
    /**
     * The user is allowed to use SSH to communicate with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowSsh The user is allowed to use SSH to communicate with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetPermissionRequest withAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
        return this;
    }

    /**
     * The user is allowed to use SSH to communicate with the instance.
     *
     * @return The user is allowed to use SSH to communicate with the instance.
     */
    public Boolean getAllowSsh() {
        return allowSsh;
    }

    /**
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     *
     * @return The user is allowed to use <b>sudo</b> to elevate privileges.
     */
    public Boolean isAllowSudo() {
        return allowSudo;
    }
    
    /**
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     *
     * @param allowSudo The user is allowed to use <b>sudo</b> to elevate privileges.
     */
    public void setAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
    }
    
    /**
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowSudo The user is allowed to use <b>sudo</b> to elevate privileges.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetPermissionRequest withAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
        return this;
    }

    /**
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     *
     * @return The user is allowed to use <b>sudo</b> to elevate privileges.
     */
    public Boolean getAllowSudo() {
        return allowSudo;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getIamUserArn() != null) sb.append("IamUserArn: " + getIamUserArn() + ",");
        if (isAllowSsh() != null) sb.append("AllowSsh: " + isAllowSsh() + ",");
        if (isAllowSudo() != null) sb.append("AllowSudo: " + isAllowSudo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode()); 
        hashCode = prime * hashCode + ((isAllowSsh() == null) ? 0 : isAllowSsh().hashCode()); 
        hashCode = prime * hashCode + ((isAllowSudo() == null) ? 0 : isAllowSudo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetPermissionRequest == false) return false;
        SetPermissionRequest other = (SetPermissionRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null) return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false) return false; 
        if (other.isAllowSsh() == null ^ this.isAllowSsh() == null) return false;
        if (other.isAllowSsh() != null && other.isAllowSsh().equals(this.isAllowSsh()) == false) return false; 
        if (other.isAllowSudo() == null ^ this.isAllowSudo() == null) return false;
        if (other.isAllowSudo() != null && other.isAllowSudo().equals(this.isAllowSudo()) == false) return false; 
        return true;
    }
    
}
    