/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains default WorkSpace creation information.
 * </p>
 */
public class DefaultWorkspaceCreationProperties implements Serializable, Cloneable {

    /**
     * Specifies if the directory is enabled for Amazon WorkDocs.
     */
    private Boolean enableWorkDocs;

    /**
     * A public IP address will be attached to all WorkSpaces that are
     * created or rebuilt.
     */
    private Boolean enableInternetAccess;

    /**
     * The organizational unit (OU) in the directory that the WorkSpace
     * machine accounts are placed in.
     */
    private String defaultOu;

    /**
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     */
    private String customSecurityGroupId;

    /**
     * The WorkSpace user is an administrator on the WorkSpace.
     */
    private Boolean userEnabledAsLocalAdministrator;

    /**
     * Specifies if the directory is enabled for Amazon WorkDocs.
     *
     * @return Specifies if the directory is enabled for Amazon WorkDocs.
     */
    public Boolean isEnableWorkDocs() {
        return enableWorkDocs;
    }
    
    /**
     * Specifies if the directory is enabled for Amazon WorkDocs.
     *
     * @param enableWorkDocs Specifies if the directory is enabled for Amazon WorkDocs.
     */
    public void setEnableWorkDocs(Boolean enableWorkDocs) {
        this.enableWorkDocs = enableWorkDocs;
    }
    
    /**
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableWorkDocs Specifies if the directory is enabled for Amazon WorkDocs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefaultWorkspaceCreationProperties withEnableWorkDocs(Boolean enableWorkDocs) {
        this.enableWorkDocs = enableWorkDocs;
        return this;
    }

    /**
     * Specifies if the directory is enabled for Amazon WorkDocs.
     *
     * @return Specifies if the directory is enabled for Amazon WorkDocs.
     */
    public Boolean getEnableWorkDocs() {
        return enableWorkDocs;
    }

    /**
     * A public IP address will be attached to all WorkSpaces that are
     * created or rebuilt.
     *
     * @return A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     */
    public Boolean isEnableInternetAccess() {
        return enableInternetAccess;
    }
    
    /**
     * A public IP address will be attached to all WorkSpaces that are
     * created or rebuilt.
     *
     * @param enableInternetAccess A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     */
    public void setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
    }
    
    /**
     * A public IP address will be attached to all WorkSpaces that are
     * created or rebuilt.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableInternetAccess A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefaultWorkspaceCreationProperties withEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }

    /**
     * A public IP address will be attached to all WorkSpaces that are
     * created or rebuilt.
     *
     * @return A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     */
    public Boolean getEnableInternetAccess() {
        return enableInternetAccess;
    }

    /**
     * The organizational unit (OU) in the directory that the WorkSpace
     * machine accounts are placed in.
     *
     * @return The organizational unit (OU) in the directory that the WorkSpace
     *         machine accounts are placed in.
     */
    public String getDefaultOu() {
        return defaultOu;
    }
    
    /**
     * The organizational unit (OU) in the directory that the WorkSpace
     * machine accounts are placed in.
     *
     * @param defaultOu The organizational unit (OU) in the directory that the WorkSpace
     *         machine accounts are placed in.
     */
    public void setDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
    }
    
    /**
     * The organizational unit (OU) in the directory that the WorkSpace
     * machine accounts are placed in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOu The organizational unit (OU) in the directory that the WorkSpace
     *         machine accounts are placed in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefaultWorkspaceCreationProperties withDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
        return this;
    }

    /**
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of any custom security groups that are applied to the
     *         WorkSpaces when they are created.
     */
    public String getCustomSecurityGroupId() {
        return customSecurityGroupId;
    }
    
    /**
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param customSecurityGroupId The identifier of any custom security groups that are applied to the
     *         WorkSpaces when they are created.
     */
    public void setCustomSecurityGroupId(String customSecurityGroupId) {
        this.customSecurityGroupId = customSecurityGroupId;
    }
    
    /**
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param customSecurityGroupId The identifier of any custom security groups that are applied to the
     *         WorkSpaces when they are created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefaultWorkspaceCreationProperties withCustomSecurityGroupId(String customSecurityGroupId) {
        this.customSecurityGroupId = customSecurityGroupId;
        return this;
    }

    /**
     * The WorkSpace user is an administrator on the WorkSpace.
     *
     * @return The WorkSpace user is an administrator on the WorkSpace.
     */
    public Boolean isUserEnabledAsLocalAdministrator() {
        return userEnabledAsLocalAdministrator;
    }
    
    /**
     * The WorkSpace user is an administrator on the WorkSpace.
     *
     * @param userEnabledAsLocalAdministrator The WorkSpace user is an administrator on the WorkSpace.
     */
    public void setUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }
    
    /**
     * The WorkSpace user is an administrator on the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userEnabledAsLocalAdministrator The WorkSpace user is an administrator on the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefaultWorkspaceCreationProperties withUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
        return this;
    }

    /**
     * The WorkSpace user is an administrator on the WorkSpace.
     *
     * @return The WorkSpace user is an administrator on the WorkSpace.
     */
    public Boolean getUserEnabledAsLocalAdministrator() {
        return userEnabledAsLocalAdministrator;
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
        if (isEnableWorkDocs() != null) sb.append("EnableWorkDocs: " + isEnableWorkDocs() + ",");
        if (isEnableInternetAccess() != null) sb.append("EnableInternetAccess: " + isEnableInternetAccess() + ",");
        if (getDefaultOu() != null) sb.append("DefaultOu: " + getDefaultOu() + ",");
        if (getCustomSecurityGroupId() != null) sb.append("CustomSecurityGroupId: " + getCustomSecurityGroupId() + ",");
        if (isUserEnabledAsLocalAdministrator() != null) sb.append("UserEnabledAsLocalAdministrator: " + isUserEnabledAsLocalAdministrator() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnableWorkDocs() == null) ? 0 : isEnableWorkDocs().hashCode()); 
        hashCode = prime * hashCode + ((isEnableInternetAccess() == null) ? 0 : isEnableInternetAccess().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultOu() == null) ? 0 : getDefaultOu().hashCode()); 
        hashCode = prime * hashCode + ((getCustomSecurityGroupId() == null) ? 0 : getCustomSecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((isUserEnabledAsLocalAdministrator() == null) ? 0 : isUserEnabledAsLocalAdministrator().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefaultWorkspaceCreationProperties == false) return false;
        DefaultWorkspaceCreationProperties other = (DefaultWorkspaceCreationProperties)obj;
        
        if (other.isEnableWorkDocs() == null ^ this.isEnableWorkDocs() == null) return false;
        if (other.isEnableWorkDocs() != null && other.isEnableWorkDocs().equals(this.isEnableWorkDocs()) == false) return false; 
        if (other.isEnableInternetAccess() == null ^ this.isEnableInternetAccess() == null) return false;
        if (other.isEnableInternetAccess() != null && other.isEnableInternetAccess().equals(this.isEnableInternetAccess()) == false) return false; 
        if (other.getDefaultOu() == null ^ this.getDefaultOu() == null) return false;
        if (other.getDefaultOu() != null && other.getDefaultOu().equals(this.getDefaultOu()) == false) return false; 
        if (other.getCustomSecurityGroupId() == null ^ this.getCustomSecurityGroupId() == null) return false;
        if (other.getCustomSecurityGroupId() != null && other.getCustomSecurityGroupId().equals(this.getCustomSecurityGroupId()) == false) return false; 
        if (other.isUserEnabledAsLocalAdministrator() == null ^ this.isUserEnabledAsLocalAdministrator() == null) return false;
        if (other.isUserEnabledAsLocalAdministrator() != null && other.isUserEnabledAsLocalAdministrator().equals(this.isUserEnabledAsLocalAdministrator()) == false) return false; 
        return true;
    }
    
    @Override
    public DefaultWorkspaceCreationProperties clone() {
        try {
            return (DefaultWorkspaceCreationProperties) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    