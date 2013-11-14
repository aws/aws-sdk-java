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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createRole(CreateRoleRequest) CreateRole operation}.
 * <p>
 * Creates a new role for your AWS account. For more information about roles, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> . For information about limitations on role
 * names and the number of roles you can create, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
 * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access Management</i> .
 * </p>
 * <p>
 * The policy grants permission to an EC2 instance to assume the role. The policy is URL-encoded according to RFC 3986. For more information about RFC
 * 3986, go to <a href="http://www.faqs.org/rfcs/rfc3986.html"> http://www.faqs.org/rfcs/rfc3986.html </a> . Currently, only EC2 instances can assume
 * roles.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createRole(CreateRoleRequest)
 */
public class CreateRoleRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * Name of the role to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleName;

    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String assumeRolePolicyDocument;

    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRoleRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Name of the role to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the role to create.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * Name of the role to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to create.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * Name of the role to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to create.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRoleRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The policy that grants an entity permission to assume the role.
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }
    
    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument The policy that grants an entity permission to assume the role.
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }
    
    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument The policy that grants an entity permission to assume the role.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRoleRequest withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
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
        if (getAssumeRolePolicyDocument() != null) sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRoleRequest == false) return false;
        CreateRoleRequest other = (CreateRoleRequest)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null) return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false) return false; 
        return true;
    }
    
}
    