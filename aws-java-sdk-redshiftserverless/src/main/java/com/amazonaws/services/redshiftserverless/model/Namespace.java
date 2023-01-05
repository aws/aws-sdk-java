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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of database objects and users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/Namespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Namespace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The username of the administrator for the first database created in the namespace.
     * </p>
     */
    private String adminUsername;
    /**
     * <p>
     * The date of when the namespace was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The name of the first database created in the namespace.
     * </p>
     */
    private String dbName;
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
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     */
    private java.util.List<String> logExports;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a namespace.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The unique identifier of a namespace.
     * </p>
     */
    private String namespaceId;
    /**
     * <p>
     * The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
     * word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The status of the namespace.
     * </p>
     */
    private String status;

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

    public Namespace withAdminUsername(String adminUsername) {
        setAdminUsername(adminUsername);
        return this;
    }

    /**
     * <p>
     * The date of when the namespace was created.
     * </p>
     * 
     * @param creationDate
     *        The date of when the namespace was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date of when the namespace was created.
     * </p>
     * 
     * @return The date of when the namespace was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date of when the namespace was created.
     * </p>
     * 
     * @param creationDate
     *        The date of when the namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Namespace withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The name of the first database created in the namespace.
     * </p>
     * 
     * @param dbName
     *        The name of the first database created in the namespace.
     */

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * <p>
     * The name of the first database created in the namespace.
     * </p>
     * 
     * @return The name of the first database created in the namespace.
     */

    public String getDbName() {
        return this.dbName;
    }

    /**
     * <p>
     * The name of the first database created in the namespace.
     * </p>
     * 
     * @param dbName
     *        The name of the first database created in the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Namespace withDbName(String dbName) {
        setDbName(dbName);
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

    public Namespace withDefaultIamRoleArn(String defaultIamRoleArn) {
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

    public Namespace withIamRoles(String... iamRoles) {
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

    public Namespace withIamRoles(java.util.Collection<String> iamRoles) {
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

    public Namespace withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     * 
     * @return The types of logs the namespace can export. Available export types are User log, Connection log, and User
     *         activity log.
     * @see LogExport
     */

    public java.util.List<String> getLogExports() {
        return logExports;
    }

    /**
     * <p>
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. Available export types are User log, Connection log, and User
     *        activity log.
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
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogExports(java.util.Collection)} or {@link #withLogExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. Available export types are User log, Connection log, and User
     *        activity log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public Namespace withLogExports(String... logExports) {
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
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. Available export types are User log, Connection log, and User
     *        activity log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public Namespace withLogExports(java.util.Collection<String> logExports) {
        setLogExports(logExports);
        return this;
    }

    /**
     * <p>
     * The types of logs the namespace can export. Available export types are User log, Connection log, and User
     * activity log.
     * </p>
     * 
     * @param logExports
     *        The types of logs the namespace can export. Available export types are User log, Connection log, and User
     *        activity log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogExport
     */

    public Namespace withLogExports(LogExport... logExports) {
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
     * The Amazon Resource Name (ARN) associated with a namespace.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) associated with a namespace.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a namespace.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with a namespace.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with a namespace.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) associated with a namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Namespace withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a namespace.
     * </p>
     * 
     * @param namespaceId
     *        The unique identifier of a namespace.
     */

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The unique identifier of a namespace.
     * </p>
     * 
     * @return The unique identifier of a namespace.
     */

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The unique identifier of a namespace.
     * </p>
     * 
     * @param namespaceId
     *        The unique identifier of a namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Namespace withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * <p>
     * The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
     * word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a
     *        reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
     * word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * 
     * @return The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a
     *         reserved word. A list of reserved words can be found in <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
     * word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace. Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a
     *        reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Namespace withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The status of the namespace.
     * </p>
     * 
     * @param status
     *        The status of the namespace.
     * @see NamespaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the namespace.
     * </p>
     * 
     * @return The status of the namespace.
     * @see NamespaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the namespace.
     * </p>
     * 
     * @param status
     *        The status of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public Namespace withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the namespace.
     * </p>
     * 
     * @param status
     *        The status of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public Namespace withStatus(NamespaceStatus status) {
        this.status = status.toString();
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
        if (getAdminUsername() != null)
            sb.append("AdminUsername: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDbName() != null)
            sb.append("DbName: ").append(getDbName()).append(",");
        if (getDefaultIamRoleArn() != null)
            sb.append("DefaultIamRoleArn: ").append(getDefaultIamRoleArn()).append(",");
        if (getIamRoles() != null)
            sb.append("IamRoles: ").append(getIamRoles()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLogExports() != null)
            sb.append("LogExports: ").append(getLogExports()).append(",");
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceId() != null)
            sb.append("NamespaceId: ").append(getNamespaceId()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Namespace == false)
            return false;
        Namespace other = (Namespace) obj;
        if (other.getAdminUsername() == null ^ this.getAdminUsername() == null)
            return false;
        if (other.getAdminUsername() != null && other.getAdminUsername().equals(this.getAdminUsername()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDbName() == null ^ this.getDbName() == null)
            return false;
        if (other.getDbName() != null && other.getDbName().equals(this.getDbName()) == false)
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
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDbName() == null) ? 0 : getDbName().hashCode());
        hashCode = prime * hashCode + ((getDefaultIamRoleArn() == null) ? 0 : getDefaultIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLogExports() == null) ? 0 : getLogExports().hashCode());
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Namespace clone() {
        try {
            return (Namespace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.NamespaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
