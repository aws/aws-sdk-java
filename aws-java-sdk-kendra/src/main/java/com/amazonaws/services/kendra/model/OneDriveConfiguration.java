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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to OneDrive as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/OneDriveConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OneDriveConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Azure Active Directory domain of the organization.
     * </p>
     */
    private String tenantDomain;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to connect to
     * OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the
     * application key for the OneDrive application.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     */
    private OneDriveUsers oneDriveUsers;
    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to OneDrive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * OneDrive data source field names must exist in your OneDrive custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     */
    private Boolean disableLocalGroups;

    /**
     * <p>
     * The Azure Active Directory domain of the organization.
     * </p>
     * 
     * @param tenantDomain
     *        The Azure Active Directory domain of the organization.
     */

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    /**
     * <p>
     * The Azure Active Directory domain of the organization.
     * </p>
     * 
     * @return The Azure Active Directory domain of the organization.
     */

    public String getTenantDomain() {
        return this.tenantDomain;
    }

    /**
     * <p>
     * The Azure Active Directory domain of the organization.
     * </p>
     * 
     * @param tenantDomain
     *        The Azure Active Directory domain of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withTenantDomain(String tenantDomain) {
        setTenantDomain(tenantDomain);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to connect to
     * OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the
     * application key for the OneDrive application.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to
     *        connect to OneDrive. The user namd should be the application ID for the OneDrive application, and the
     *        password is the application key for the OneDrive application.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to connect to
     * OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the
     * application key for the OneDrive application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to
     *         connect to OneDrive. The user namd should be the application ID for the OneDrive application, and the
     *         password is the application key for the OneDrive application.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to connect to
     * OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the
     * application key for the OneDrive application.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to
     *        connect to OneDrive. The user namd should be the application ID for the OneDrive application, and the
     *        password is the application key for the OneDrive application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     * 
     * @param oneDriveUsers
     *        A list of user accounts whose documents should be indexed.
     */

    public void setOneDriveUsers(OneDriveUsers oneDriveUsers) {
        this.oneDriveUsers = oneDriveUsers;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     * 
     * @return A list of user accounts whose documents should be indexed.
     */

    public OneDriveUsers getOneDriveUsers() {
        return this.oneDriveUsers;
    }

    /**
     * <p>
     * A list of user accounts whose documents should be indexed.
     * </p>
     * 
     * @param oneDriveUsers
     *        A list of user accounts whose documents should be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withOneDriveUsers(OneDriveUsers oneDriveUsers) {
        setOneDriveUsers(oneDriveUsers);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain documents in your OneDrive. Documents that match
     *         the patterns are included in the index. Documents that don't match the patterns are excluded from the
     *         index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the document isn't included in the index.</p>
     *         <p>
     *         The pattern is applied to the file name.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your OneDrive. Documents that match
     *        the patterns are included in the index. Documents that don't match the patterns are excluded from the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     */

    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your OneDrive. Documents that match
     *        the patterns are included in the index. Documents that don't match the patterns are excluded from the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (this.inclusionPatterns == null) {
            setInclusionPatterns(new java.util.ArrayList<String>(inclusionPatterns.length));
        }
        for (String ele : inclusionPatterns) {
            this.inclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your OneDrive. Documents that match
     *        the patterns are included in the index. Documents that don't match the patterns are excluded from the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match
     *         the patterns are excluded from the index. Documents that don't match the patterns are included in the
     *         index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the document isn't included in the index.</p>
     *         <p>
     *         The pattern is applied to the file name.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match
     *        the patterns are excluded from the index. Documents that don't match the patterns are included in the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match
     *        the patterns are excluded from the index. Documents that don't match the patterns are included in the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The pattern is applied to the file name.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match
     *        the patterns are excluded from the index. Documents that don't match the patterns are included in the
     *        index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The pattern is applied to the file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to OneDrive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * OneDrive data source field names must exist in your OneDrive custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or
     *         field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to OneDrive fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The OneDrive data source field names must exist in your OneDrive custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to OneDrive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * OneDrive data source field names must exist in your OneDrive custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to OneDrive fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        OneDrive data source field names must exist in your OneDrive custom metadata.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to OneDrive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * OneDrive data source field names must exist in your OneDrive custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to OneDrive fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        OneDrive data source field names must exist in your OneDrive custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to OneDrive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * OneDrive data source field names must exist in your OneDrive custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map OneDrive data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to OneDrive fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        OneDrive data source field names must exist in your OneDrive custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @param disableLocalGroups
     *        <code>TRUE</code> to disable local groups information.
     */

    public void setDisableLocalGroups(Boolean disableLocalGroups) {
        this.disableLocalGroups = disableLocalGroups;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @return <code>TRUE</code> to disable local groups information.
     */

    public Boolean getDisableLocalGroups() {
        return this.disableLocalGroups;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @param disableLocalGroups
     *        <code>TRUE</code> to disable local groups information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveConfiguration withDisableLocalGroups(Boolean disableLocalGroups) {
        setDisableLocalGroups(disableLocalGroups);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @return <code>TRUE</code> to disable local groups information.
     */

    public Boolean isDisableLocalGroups() {
        return this.disableLocalGroups;
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
        if (getTenantDomain() != null)
            sb.append("TenantDomain: ").append(getTenantDomain()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getOneDriveUsers() != null)
            sb.append("OneDriveUsers: ").append(getOneDriveUsers()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getDisableLocalGroups() != null)
            sb.append("DisableLocalGroups: ").append(getDisableLocalGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OneDriveConfiguration == false)
            return false;
        OneDriveConfiguration other = (OneDriveConfiguration) obj;
        if (other.getTenantDomain() == null ^ this.getTenantDomain() == null)
            return false;
        if (other.getTenantDomain() != null && other.getTenantDomain().equals(this.getTenantDomain()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getOneDriveUsers() == null ^ this.getOneDriveUsers() == null)
            return false;
        if (other.getOneDriveUsers() != null && other.getOneDriveUsers().equals(this.getOneDriveUsers()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getDisableLocalGroups() == null ^ this.getDisableLocalGroups() == null)
            return false;
        if (other.getDisableLocalGroups() != null && other.getDisableLocalGroups().equals(this.getDisableLocalGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTenantDomain() == null) ? 0 : getTenantDomain().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getOneDriveUsers() == null) ? 0 : getOneDriveUsers().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getDisableLocalGroups() == null) ? 0 : getDisableLocalGroups().hashCode());
        return hashCode;
    }

    @Override
    public OneDriveConfiguration clone() {
        try {
            return (OneDriveConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.OneDriveConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
