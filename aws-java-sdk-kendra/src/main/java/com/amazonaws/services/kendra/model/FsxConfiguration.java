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
 * Provides the configuration information to connect to Amazon FSx as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FsxConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FsxConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon FSx file system.
     * </p>
     * <p>
     * You can find your file system ID on the file system dashboard in the Amazon FSx console. For information on how
     * to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting started
     * guide</a>.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The Amazon FSx file system type. Windows is currently the only supported type.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon FSx
     * instance must reside inside your VPC.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Amazon FSx file system. Windows is currently the only supported type. The secret must contain a JSON
     * structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     * <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the Amazon
     * FSx file system for Windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     * Windows file system.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match
     * the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match
     * the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to Amazon FSx fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * FSx data source field names must exist in your Amazon FSx custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The identifier of the Amazon FSx file system.
     * </p>
     * <p>
     * You can find your file system ID on the file system dashboard in the Amazon FSx console. For information on how
     * to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting started
     * guide</a>.
     * </p>
     * 
     * @param fileSystemId
     *        The identifier of the Amazon FSx file system.</p>
     *        <p>
     *        You can find your file system ID on the file system dashboard in the Amazon FSx console. For information
     *        on how to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting
     *        started guide</a>.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The identifier of the Amazon FSx file system.
     * </p>
     * <p>
     * You can find your file system ID on the file system dashboard in the Amazon FSx console. For information on how
     * to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting started
     * guide</a>.
     * </p>
     * 
     * @return The identifier of the Amazon FSx file system.</p>
     *         <p>
     *         You can find your file system ID on the file system dashboard in the Amazon FSx console. For information
     *         on how to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting
     *         started guide</a>.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The identifier of the Amazon FSx file system.
     * </p>
     * <p>
     * You can find your file system ID on the file system dashboard in the Amazon FSx console. For information on how
     * to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting started
     * guide</a>.
     * </p>
     * 
     * @param fileSystemId
     *        The identifier of the Amazon FSx file system.</p>
     *        <p>
     *        You can find your file system ID on the file system dashboard in the Amazon FSx console. For information
     *        on how to create a file system in Amazon FSx console, using Windows File Server as an example, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/getting-started-step1.html">Amazon FSx Getting
     *        started guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The Amazon FSx file system type. Windows is currently the only supported type.
     * </p>
     * 
     * @param fileSystemType
     *        The Amazon FSx file system type. Windows is currently the only supported type.
     * @see FsxFileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The Amazon FSx file system type. Windows is currently the only supported type.
     * </p>
     * 
     * @return The Amazon FSx file system type. Windows is currently the only supported type.
     * @see FsxFileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * The Amazon FSx file system type. Windows is currently the only supported type.
     * </p>
     * 
     * @param fileSystemType
     *        The Amazon FSx file system type. Windows is currently the only supported type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FsxFileSystemType
     */

    public FsxConfiguration withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * The Amazon FSx file system type. Windows is currently the only supported type.
     * </p>
     * 
     * @param fileSystemType
     *        The Amazon FSx file system type. Windows is currently the only supported type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FsxFileSystemType
     */

    public FsxConfiguration withFileSystemType(FsxFileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon FSx
     * instance must reside inside your VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon
     *        FSx instance must reside inside your VPC.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon FSx
     * instance must reside inside your VPC.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon
     *         FSx instance must reside inside your VPC.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon FSx
     * instance must reside inside your VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon
     *        FSx instance must reside inside your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Amazon FSx file system. Windows is currently the only supported type. The secret must contain a JSON
     * structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     * <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the Amazon
     * FSx file system for Windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     * Windows file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Amazon FSx file system. Windows is currently the only supported type. The secret must
     *        contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     *        <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the
     *        Amazon FSx file system for Windows.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     *        Windows file system.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Amazon FSx file system. Windows is currently the only supported type. The secret must contain a JSON
     * structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     * <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the Amazon
     * FSx file system for Windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     * Windows file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *         connect to your Amazon FSx file system. Windows is currently the only supported type. The secret must
     *         contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For
     *         example, <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting
     *         access to the Amazon FSx file system for Windows.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password—The password of the Active Directory user account with read and mounting access to the Amazon
     *         FSx Windows file system.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Amazon FSx file system. Windows is currently the only supported type. The secret must contain a JSON
     * structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     * <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the Amazon
     * FSx file system for Windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     * Windows file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Amazon FSx file system. Windows is currently the only supported type. The secret must
     *        contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example,
     *        <i>user@corp.example.com</i>. The Active Directory user account must have read and mounting access to the
     *        Amazon FSx file system for Windows.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password—The password of the Active Directory user account with read and mounting access to the Amazon FSx
     *        Windows file system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match
     * the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that
     *         match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *         index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *         and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match
     * the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
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
     * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match
     * the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match
     * the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match
     * the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that
     *         match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *         index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *         and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match
     * the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
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
     * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match
     * the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match
     * the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a
     * file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence
     *        and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to Amazon FSx fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * FSx data source field names must exist in your Amazon FSx custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes
     *         or field names to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to Amazon FSx fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Amazon FSx data source field names must exist in your Amazon FSx custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to Amazon FSx fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * FSx data source field names must exist in your Amazon FSx custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Amazon FSx fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon FSx data source field names must exist in your Amazon FSx custom metadata.
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to Amazon FSx fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * FSx data source field names must exist in your Amazon FSx custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Amazon FSx fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon FSx data source field names must exist in your Amazon FSx custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to Amazon FSx fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * FSx data source field names must exist in your Amazon FSx custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon FSx data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Amazon FSx fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon FSx data source field names must exist in your Amazon FSx custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FsxConfiguration == false)
            return false;
        FsxConfiguration other = (FsxConfiguration) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public FsxConfiguration clone() {
        try {
            return (FsxConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FsxConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
