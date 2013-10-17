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


/**
 * <p>
 * Describes stack or user permissions.
 * </p>
 */
public class Permission implements Serializable {

    /**
     * A stack ID.
     */
    private String stackId;

    /**
     * The Amazon Resource Name (ARN) for an AWS Identity and Access
     * Management (IAM) role. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String iamUserArn;

    /**
     * Whether the user can use SSH.
     */
    private Boolean allowSsh;

    /**
     * Whether the user can use <b>sudo</b>.
     */
    private Boolean allowSudo;

    /**
     * A stack ID.
     *
     * @return A stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID.
     *
     * @param stackId A stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for an AWS Identity and Access
     * Management (IAM) role. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The Amazon Resource Name (ARN) for an AWS Identity and Access
     *         Management (IAM) role. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getIamUserArn() {
        return iamUserArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for an AWS Identity and Access
     * Management (IAM) role. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param iamUserArn The Amazon Resource Name (ARN) for an AWS Identity and Access
     *         Management (IAM) role. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for an AWS Identity and Access
     * Management (IAM) role. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArn The Amazon Resource Name (ARN) for an AWS Identity and Access
     *         Management (IAM) role. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * Whether the user can use SSH.
     *
     * @return Whether the user can use SSH.
     */
    public Boolean isAllowSsh() {
        return allowSsh;
    }
    
    /**
     * Whether the user can use SSH.
     *
     * @param allowSsh Whether the user can use SSH.
     */
    public void setAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
    }
    
    /**
     * Whether the user can use SSH.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowSsh Whether the user can use SSH.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
        return this;
    }

    /**
     * Whether the user can use SSH.
     *
     * @return Whether the user can use SSH.
     */
    public Boolean getAllowSsh() {
        return allowSsh;
    }

    /**
     * Whether the user can use <b>sudo</b>.
     *
     * @return Whether the user can use <b>sudo</b>.
     */
    public Boolean isAllowSudo() {
        return allowSudo;
    }
    
    /**
     * Whether the user can use <b>sudo</b>.
     *
     * @param allowSudo Whether the user can use <b>sudo</b>.
     */
    public void setAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
    }
    
    /**
     * Whether the user can use <b>sudo</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowSudo Whether the user can use <b>sudo</b>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
        return this;
    }

    /**
     * Whether the user can use <b>sudo</b>.
     *
     * @return Whether the user can use <b>sudo</b>.
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

        if (obj instanceof Permission == false) return false;
        Permission other = (Permission)obj;
        
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
    