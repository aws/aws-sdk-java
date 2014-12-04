/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about an IAM role, including all of the role's
 * policies.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * GetAccountAuthorizationDetails action.
 * </p>
 */
public class RoleDetail implements Serializable {

    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     */
    private String path;

    /**
     * The friendly name that identifies the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleName;

    /**
     * The stable and unique string identifying the role. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String roleId;

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the role was created.
     */
    private java.util.Date createDate;

    /**
     * The trust policy that grants permission to assume the role. <p> The
     * returned policy is URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String assumeRolePolicyDocument;

    /**
     * Contains a list of instance profiles.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile> instanceProfileList;

    /**
     * A list of the role's access (permissions) policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> rolePolicyList;

    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @return The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param path The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param path The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The friendly name that identifies the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The friendly name that identifies the role.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * The friendly name that identifies the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName The friendly name that identifies the role.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * The friendly name that identifies the role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName The friendly name that identifies the role.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * The stable and unique string identifying the role. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The stable and unique string identifying the role. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getRoleId() {
        return roleId;
    }
    
    /**
     * The stable and unique string identifying the role. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param roleId The stable and unique string identifying the role. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    
    /**
     * The stable and unique string identifying the role. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param roleId The stable and unique string identifying the role. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the role was created.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the role was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the role was created.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the role was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the role was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the role was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * The trust policy that grants permission to assume the role. <p> The
     * returned policy is URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The trust policy that grants permission to assume the role. <p> The
     *         returned policy is URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }
    
    /**
     * The trust policy that grants permission to assume the role. <p> The
     * returned policy is URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument The trust policy that grants permission to assume the role. <p> The
     *         returned policy is URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }
    
    /**
     * The trust policy that grants permission to assume the role. <p> The
     * returned policy is URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument The trust policy that grants permission to assume the role. <p> The
     *         returned policy is URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    /**
     * Contains a list of instance profiles.
     *
     * @return Contains a list of instance profiles.
     */
    public java.util.List<InstanceProfile> getInstanceProfileList() {
        if (instanceProfileList == null) {
              instanceProfileList = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile>();
              instanceProfileList.setAutoConstruct(true);
        }
        return instanceProfileList;
    }
    
    /**
     * Contains a list of instance profiles.
     *
     * @param instanceProfileList Contains a list of instance profiles.
     */
    public void setInstanceProfileList(java.util.Collection<InstanceProfile> instanceProfileList) {
        if (instanceProfileList == null) {
            this.instanceProfileList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile> instanceProfileListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile>(instanceProfileList.size());
        instanceProfileListCopy.addAll(instanceProfileList);
        this.instanceProfileList = instanceProfileListCopy;
    }
    
    /**
     * Contains a list of instance profiles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProfileList Contains a list of instance profiles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withInstanceProfileList(InstanceProfile... instanceProfileList) {
        if (getInstanceProfileList() == null) setInstanceProfileList(new java.util.ArrayList<InstanceProfile>(instanceProfileList.length));
        for (InstanceProfile value : instanceProfileList) {
            getInstanceProfileList().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of instance profiles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProfileList Contains a list of instance profiles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withInstanceProfileList(java.util.Collection<InstanceProfile> instanceProfileList) {
        if (instanceProfileList == null) {
            this.instanceProfileList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile> instanceProfileListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceProfile>(instanceProfileList.size());
            instanceProfileListCopy.addAll(instanceProfileList);
            this.instanceProfileList = instanceProfileListCopy;
        }

        return this;
    }

    /**
     * A list of the role's access (permissions) policies.
     *
     * @return A list of the role's access (permissions) policies.
     */
    public java.util.List<PolicyDetail> getRolePolicyList() {
        if (rolePolicyList == null) {
              rolePolicyList = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>();
              rolePolicyList.setAutoConstruct(true);
        }
        return rolePolicyList;
    }
    
    /**
     * A list of the role's access (permissions) policies.
     *
     * @param rolePolicyList A list of the role's access (permissions) policies.
     */
    public void setRolePolicyList(java.util.Collection<PolicyDetail> rolePolicyList) {
        if (rolePolicyList == null) {
            this.rolePolicyList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> rolePolicyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>(rolePolicyList.size());
        rolePolicyListCopy.addAll(rolePolicyList);
        this.rolePolicyList = rolePolicyListCopy;
    }
    
    /**
     * A list of the role's access (permissions) policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rolePolicyList A list of the role's access (permissions) policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withRolePolicyList(PolicyDetail... rolePolicyList) {
        if (getRolePolicyList() == null) setRolePolicyList(new java.util.ArrayList<PolicyDetail>(rolePolicyList.length));
        for (PolicyDetail value : rolePolicyList) {
            getRolePolicyList().add(value);
        }
        return this;
    }
    
    /**
     * A list of the role's access (permissions) policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rolePolicyList A list of the role's access (permissions) policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RoleDetail withRolePolicyList(java.util.Collection<PolicyDetail> rolePolicyList) {
        if (rolePolicyList == null) {
            this.rolePolicyList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> rolePolicyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>(rolePolicyList.size());
            rolePolicyListCopy.addAll(rolePolicyList);
            this.rolePolicyList = rolePolicyListCopy;
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
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() + ",");
        if (getRoleId() != null) sb.append("RoleId: " + getRoleId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getAssumeRolePolicyDocument() != null) sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() + ",");
        if (getInstanceProfileList() != null) sb.append("InstanceProfileList: " + getInstanceProfileList() + ",");
        if (getRolePolicyList() != null) sb.append("RolePolicyList: " + getRolePolicyList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceProfileList() == null) ? 0 : getInstanceProfileList().hashCode()); 
        hashCode = prime * hashCode + ((getRolePolicyList() == null) ? 0 : getRolePolicyList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RoleDetail == false) return false;
        RoleDetail other = (RoleDetail)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        if (other.getRoleId() == null ^ this.getRoleId() == null) return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null) return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false) return false; 
        if (other.getInstanceProfileList() == null ^ this.getInstanceProfileList() == null) return false;
        if (other.getInstanceProfileList() != null && other.getInstanceProfileList().equals(this.getInstanceProfileList()) == false) return false; 
        if (other.getRolePolicyList() == null ^ this.getRolePolicyList() == null) return false;
        if (other.getRolePolicyList() != null && other.getRolePolicyList().equals(this.getRolePolicyList()) == false) return false; 
        return true;
    }
    
}
    