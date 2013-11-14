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


/**
 * <p>
 * The InstanceProfile data type contains information about an instance profile.
 * </p>
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * CreateInstanceProfile
 * </p>
 * </li>
 * <li> <p>
 * GetInstanceProfile
 * </p>
 * </li>
 * <li> <p>
 * ListInstanceProfiles
 * </p>
 * </li>
 * <li> <p>
 * ListInstanceProfilesForRole
 * </p>
 * </li>
 * 
 * </ul>
 */
public class InstanceProfile implements Serializable {

    /**
     * Path to the instance profile. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * The name identifying the instance profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String instanceProfileName;

    /**
     * The stable and unique string identifying the instance profile. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String instanceProfileId;

    /**
     * The Amazon Resource Name (ARN) specifying the instance profile. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date when the instance profile was created.
     */
    private java.util.Date createDate;

    /**
     * The role associated with the instance profile.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Role> roles;

    /**
     * Path to the instance profile. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return Path to the instance profile. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Path to the instance profile. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the instance profile. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Path to the instance profile. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the instance profile. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The name identifying the instance profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name identifying the instance profile.
     */
    public String getInstanceProfileName() {
        return instanceProfileName;
    }
    
    /**
     * The name identifying the instance profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param instanceProfileName The name identifying the instance profile.
     */
    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }
    
    /**
     * The name identifying the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param instanceProfileName The name identifying the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
        return this;
    }

    /**
     * The stable and unique string identifying the instance profile. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The stable and unique string identifying the instance profile. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getInstanceProfileId() {
        return instanceProfileId;
    }
    
    /**
     * The stable and unique string identifying the instance profile. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param instanceProfileId The stable and unique string identifying the instance profile. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setInstanceProfileId(String instanceProfileId) {
        this.instanceProfileId = instanceProfileId;
    }
    
    /**
     * The stable and unique string identifying the instance profile. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param instanceProfileId The stable and unique string identifying the instance profile. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withInstanceProfileId(String instanceProfileId) {
        this.instanceProfileId = instanceProfileId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the instance profile. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) specifying the instance profile. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the instance profile. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the instance profile. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the instance profile. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the instance profile. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The date when the instance profile was created.
     *
     * @return The date when the instance profile was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date when the instance profile was created.
     *
     * @param createDate The date when the instance profile was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date when the instance profile was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date when the instance profile was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * The role associated with the instance profile.
     *
     * @return The role associated with the instance profile.
     */
    public java.util.List<Role> getRoles() {
        if (roles == null) {
              roles = new com.amazonaws.internal.ListWithAutoConstructFlag<Role>();
              roles.setAutoConstruct(true);
        }
        return roles;
    }
    
    /**
     * The role associated with the instance profile.
     *
     * @param roles The role associated with the instance profile.
     */
    public void setRoles(java.util.Collection<Role> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Role> rolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Role>(roles.size());
        rolesCopy.addAll(roles);
        this.roles = rolesCopy;
    }
    
    /**
     * The role associated with the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roles The role associated with the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withRoles(Role... roles) {
        if (getRoles() == null) setRoles(new java.util.ArrayList<Role>(roles.length));
        for (Role value : roles) {
            getRoles().add(value);
        }
        return this;
    }
    
    /**
     * The role associated with the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roles The role associated with the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceProfile withRoles(java.util.Collection<Role> roles) {
        if (roles == null) {
            this.roles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Role> rolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Role>(roles.size());
            rolesCopy.addAll(roles);
            this.roles = rolesCopy;
        }

        return this;
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getInstanceProfileName() != null) sb.append("InstanceProfileName: " + getInstanceProfileName() + ",");
        if (getInstanceProfileId() != null) sb.append("InstanceProfileId: " + getInstanceProfileId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getRoles() != null) sb.append("Roles: " + getRoles() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceProfileId() == null) ? 0 : getInstanceProfileId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceProfile == false) return false;
        InstanceProfile other = (InstanceProfile)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null) return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false) return false; 
        if (other.getInstanceProfileId() == null ^ this.getInstanceProfileId() == null) return false;
        if (other.getInstanceProfileId() != null && other.getInstanceProfileId().equals(this.getInstanceProfileId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getRoles() == null ^ this.getRoles() == null) return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false) return false; 
        return true;
    }
    
}
    