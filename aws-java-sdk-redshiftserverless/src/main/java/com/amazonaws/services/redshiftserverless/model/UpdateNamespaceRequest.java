/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateNamespace"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The password of the administrator for the first database created in the namespace.
     * </p>
     */
    private String adminUserPassword;
    /**
     * <p>
     * The username of the administrator for the first database created in the namespace.
     * </p>
     */
    private String adminUsername;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * </p>
     */
    private String defaultIamRoleArn;
    /**
     * <p>
     * A list of IAM roles to associate with the namespace.
     * </p>
     */
    private java.util.List<String> iamRoles;
    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     */
    private java.util.List<String> logExports;
    /**
     * <p>
     * The name of the namespace.
     * </p>
     */
    private String namespaceName;

    /**
     * <p>
     * The password of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @param adminUserPassword
     *        The password of the administrator for the first database created in the namespace.
     */

    public void setAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
    }

    /**
     * <p>
     * The password of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @return The password of the administrator for the first database created in the namespace.
     */

    public String getAdminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * <p>
     * The password of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @param adminUserPassword
     *        The password of the administrator for the first database created in the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withAdminUserPassword(String adminUserPassword) {
        setAdminUserPassword(adminUserPassword);
        return this;
    }

    /**
     * <p>
     * The username of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @param adminUsername
     *        The username of the administrator for the first database created in the namespace.
     */

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * <p>
     * The username of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @return The username of the administrator for the first database created in the namespace.
     */

    public String getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * <p>
     * The username of the administrator for the first database created in the namespace.
     * </p>
     * 
     * @param adminUsername
     *        The username of the administrator for the first database created in the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withAdminUsername(String adminUsername) {
        setAdminUsername(adminUsername);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * </p>
     * 
     * @param defaultIamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     */

    public void setDefaultIamRoleArn(String defaultIamRoleArn) {
        this.defaultIamRoleArn = defaultIamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     */

    public String getDefaultIamRoleArn() {
        return this.defaultIamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * </p>
     * 
     * @param defaultIamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withDefaultIamRoleArn(String defaultIamRoleArn) {
        setDefaultIamRoleArn(defaultIamRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of IAM roles to associate with the namespace.
     * </p>
     * 
     * @return A list of IAM roles to associate with the namespace.
     */

    public java.util.List<String> getIamRoles() {
        return iamRoles;
    }

    /**
     * <p>
     * A list of IAM roles to associate with the namespace.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles to associate with the namespace.
     */

    public void setIamRoles(java.util.Collection<String> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new java.util.ArrayList<String>(iamRoles);
    }

    /**
     * <p>
     * A list of IAM roles to associate with the namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIamRoles(java.util.Collection)} or {@link #withIamRoles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles to associate with the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withIamRoles(String... iamRoles) {
        if (this.iamRoles == null) {
            setIamRoles(new java.util.ArrayList<String>(iamRoles.length));
        }
        for (String ele : iamRoles) {
            this.iamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM roles to associate with the namespace.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles to associate with the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withIamRoles(java.util.Collection<String> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     * 
     * @return The types of logs the namespace can export. The export types are <code>userlog</code>,
     *         <code>connectionlog</code>, and <code>useractivitylog</code>.
     * @see LogExport
     */

    public java.util.List<String> getLogExports() {
        return logExports;
    }

    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. The export types are <code>userlog</code>,
     *        <code>connectionlog</code>, and <code>useractivitylog</code>.
     * @see LogExport
     */

    public void setLogExports(java.util.Collection<String> logExports) {
        if (logExports == null) {
            this.logExports = null;
            return;
        }

        this.logExports = new java.util.ArrayList<String>(logExports);
    }

    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogExports(java.util.Collection)} or {@link #withLogExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. The export types are <code>userlog</code>,
     *        <code>connectionlog</code>, and <code>useractivitylog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public UpdateNamespaceRequest withLogExports(String... logExports) {
        if (this.logExports == null) {
            setLogExports(new java.util.ArrayList<String>(logExports.length));
        }
        for (String ele : logExports) {
            this.logExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. The export types are <code>userlog</code>,
     *        <code>connectionlog</code>, and <code>useractivitylog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public UpdateNamespaceRequest withLogExports(java.util.Collection<String> logExports) {
        setLogExports(logExports);
        return this;
    }

    /**
     * <p>
     * The types of logs the namespace can export. The export types are <code>userlog</code>, <code>connectionlog</code>
     * , and <code>useractivitylog</code>.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. The export types are <code>userlog</code>,
     *        <code>connectionlog</code>, and <code>useractivitylog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public UpdateNamespaceRequest withLogExports(LogExport... logExports) {
        java.util.ArrayList<String> logExportsCopy = new java.util.ArrayList<String>(logExports.length);
        for (LogExport value : logExports) {
            logExportsCopy.add(value.toString());
        }
        if (getLogExports() == null) {
            setLogExports(logExportsCopy);
        } else {
            getLogExports().addAll(logExportsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @return The name of the namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamespaceRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
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
        if (getAdminUserPassword() != null)
            sb.append("AdminUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAdminUsername() != null)
            sb.append("AdminUsername: ").append("***Sensitive Data Redacted***").append(",");
        if (getDefaultIamRoleArn() != null)
            sb.append("DefaultIamRoleArn: ").append(getDefaultIamRoleArn()).append(",");
        if (getIamRoles() != null)
            sb.append("IamRoles: ").append(getIamRoles()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLogExports() != null)
            sb.append("LogExports: ").append(getLogExports()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNamespaceRequest == false)
            return false;
        UpdateNamespaceRequest other = (UpdateNamespaceRequest) obj;
        if (other.getAdminUserPassword() == null ^ this.getAdminUserPassword() == null)
            return false;
        if (other.getAdminUserPassword() != null && other.getAdminUserPassword().equals(this.getAdminUserPassword()) == false)
            return false;
        if (other.getAdminUsername() == null ^ this.getAdminUsername() == null)
            return false;
        if (other.getAdminUsername() != null && other.getAdminUsername().equals(this.getAdminUsername()) == false)
            return false;
        if (other.getDefaultIamRoleArn() == null ^ this.getDefaultIamRoleArn() == null)
            return false;
        if (other.getDefaultIamRoleArn() != null && other.getDefaultIamRoleArn().equals(this.getDefaultIamRoleArn()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLogExports() == null ^ this.getLogExports() == null)
            return false;
        if (other.getLogExports() != null && other.getLogExports().equals(this.getLogExports()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUserPassword() == null) ? 0 : getAdminUserPassword().hashCode());
        hashCode = prime * hashCode + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        hashCode = prime * hashCode + ((getDefaultIamRoleArn() == null) ? 0 : getDefaultIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLogExports() == null) ? 0 : getLogExports().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNamespaceRequest clone() {
        return (UpdateNamespaceRequest) super.clone();
    }

}
