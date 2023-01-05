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
 * Provides the configuration information to connect to Google Drive as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GoogleDriveConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GoogleDriveConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to connect to
     * Google Drive. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Google
     * Drive data source field names must exist in your Google Drive custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.
     * </p>
     * <p>
     * For a list of MIME types, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     */
    private java.util.List<String> excludeMimeTypes;
    /**
     * <p>
     * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents
     * shared with excluded users are indexed unless they are excluded in another way.
     * </p>
     */
    private java.util.List<String> excludeUserAccounts;
    /**
     * <p>
     * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared
     * drive are excluded.
     * </p>
     */
    private java.util.List<String> excludeSharedDrives;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to connect to
     * Google Drive. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to
     *        connect to Google Drive. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace
     *        Drive data source</a>.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to connect to
     * Google Drive. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to
     *         connect to Google Drive. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google
     *         Workspace Drive data source</a>.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to connect to
     * Google Drive. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to
     *        connect to Google Drive. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace
     *        Drive data source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain items in your Google Drive, including shared
     *         drives and users' My Drives. Items that match the patterns are included in the index. Items that don't
     *         match the patterns are excluded from the index. If an item matches both an inclusion and exclusion
     *         pattern, the exclusion pattern takes precedence and the item isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are included in the index. Items that don't
     *        match the patterns are excluded from the index. If an item matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the item isn't included in the index.
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
     * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are included in the index. Items that don't
     *        match the patterns are excluded from the index. If an item matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are included in the index. Items that don't
     *        match the patterns are excluded from the index. If an item matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain items in your Google Drive, including shared
     *         drives and users' My Drives. Items that match the patterns are excluded from the index. Items that don't
     *         match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     *         the exclusion pattern takes precedence and the item isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are excluded from the index. Items that don't
     *        match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the item isn't included in the index.
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
     * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are excluded from the index. Items that don't
     *        match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and
     * users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the item isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain items in your Google Drive, including shared
     *        drives and users' My Drives. Items that match the patterns are excluded from the index. Items that don't
     *        match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Google
     * Drive data source field names must exist in your Google Drive custom metadata.
     * </p>
     * 
     * @return Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create
     *         custom fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more
     *         information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *         source fields</a>. The Google Drive data source field names must exist in your Google Drive custom
     *         metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Google
     * Drive data source field names must exist in your Google Drive custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Google Drive data source field names must exist in your Google Drive custom
     *        metadata.
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
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Google
     * Drive data source field names must exist in your Google Drive custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Google Drive data source field names must exist in your Google Drive custom
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
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
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Google
     * Drive data source field names must exist in your Google Drive custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Google Drive fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Google Drive data source field names must exist in your Google Drive custom
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.
     * </p>
     * <p>
     * For a list of MIME types, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @return A list of MIME types to exclude from the index. All documents matching the specified MIME type are
     *         excluded. </p>
     *         <p>
     *         For a list of MIME types, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google
     *         Workspace Drive data source</a>.
     */

    public java.util.List<String> getExcludeMimeTypes() {
        return excludeMimeTypes;
    }

    /**
     * <p>
     * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.
     * </p>
     * <p>
     * For a list of MIME types, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @param excludeMimeTypes
     *        A list of MIME types to exclude from the index. All documents matching the specified MIME type are
     *        excluded. </p>
     *        <p>
     *        For a list of MIME types, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace
     *        Drive data source</a>.
     */

    public void setExcludeMimeTypes(java.util.Collection<String> excludeMimeTypes) {
        if (excludeMimeTypes == null) {
            this.excludeMimeTypes = null;
            return;
        }

        this.excludeMimeTypes = new java.util.ArrayList<String>(excludeMimeTypes);
    }

    /**
     * <p>
     * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.
     * </p>
     * <p>
     * For a list of MIME types, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeMimeTypes(java.util.Collection)} or {@link #withExcludeMimeTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludeMimeTypes
     *        A list of MIME types to exclude from the index. All documents matching the specified MIME type are
     *        excluded. </p>
     *        <p>
     *        For a list of MIME types, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace
     *        Drive data source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeMimeTypes(String... excludeMimeTypes) {
        if (this.excludeMimeTypes == null) {
            setExcludeMimeTypes(new java.util.ArrayList<String>(excludeMimeTypes.length));
        }
        for (String ele : excludeMimeTypes) {
            this.excludeMimeTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.
     * </p>
     * <p>
     * For a list of MIME types, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace Drive
     * data source</a>.
     * </p>
     * 
     * @param excludeMimeTypes
     *        A list of MIME types to exclude from the index. All documents matching the specified MIME type are
     *        excluded. </p>
     *        <p>
     *        For a list of MIME types, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html">Using a Google Workspace
     *        Drive data source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeMimeTypes(java.util.Collection<String> excludeMimeTypes) {
        setExcludeMimeTypes(excludeMimeTypes);
        return this;
    }

    /**
     * <p>
     * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents
     * shared with excluded users are indexed unless they are excluded in another way.
     * </p>
     * 
     * @return A list of email addresses of the users. Documents owned by these users are excluded from the index.
     *         Documents shared with excluded users are indexed unless they are excluded in another way.
     */

    public java.util.List<String> getExcludeUserAccounts() {
        return excludeUserAccounts;
    }

    /**
     * <p>
     * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents
     * shared with excluded users are indexed unless they are excluded in another way.
     * </p>
     * 
     * @param excludeUserAccounts
     *        A list of email addresses of the users. Documents owned by these users are excluded from the index.
     *        Documents shared with excluded users are indexed unless they are excluded in another way.
     */

    public void setExcludeUserAccounts(java.util.Collection<String> excludeUserAccounts) {
        if (excludeUserAccounts == null) {
            this.excludeUserAccounts = null;
            return;
        }

        this.excludeUserAccounts = new java.util.ArrayList<String>(excludeUserAccounts);
    }

    /**
     * <p>
     * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents
     * shared with excluded users are indexed unless they are excluded in another way.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeUserAccounts(java.util.Collection)} or {@link #withExcludeUserAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param excludeUserAccounts
     *        A list of email addresses of the users. Documents owned by these users are excluded from the index.
     *        Documents shared with excluded users are indexed unless they are excluded in another way.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeUserAccounts(String... excludeUserAccounts) {
        if (this.excludeUserAccounts == null) {
            setExcludeUserAccounts(new java.util.ArrayList<String>(excludeUserAccounts.length));
        }
        for (String ele : excludeUserAccounts) {
            this.excludeUserAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents
     * shared with excluded users are indexed unless they are excluded in another way.
     * </p>
     * 
     * @param excludeUserAccounts
     *        A list of email addresses of the users. Documents owned by these users are excluded from the index.
     *        Documents shared with excluded users are indexed unless they are excluded in another way.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeUserAccounts(java.util.Collection<String> excludeUserAccounts) {
        setExcludeUserAccounts(excludeUserAccounts);
        return this;
    }

    /**
     * <p>
     * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared
     * drive are excluded.
     * </p>
     * 
     * @return A list of identifiers or shared drives to exclude from the index. All files and folders stored on the
     *         shared drive are excluded.
     */

    public java.util.List<String> getExcludeSharedDrives() {
        return excludeSharedDrives;
    }

    /**
     * <p>
     * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared
     * drive are excluded.
     * </p>
     * 
     * @param excludeSharedDrives
     *        A list of identifiers or shared drives to exclude from the index. All files and folders stored on the
     *        shared drive are excluded.
     */

    public void setExcludeSharedDrives(java.util.Collection<String> excludeSharedDrives) {
        if (excludeSharedDrives == null) {
            this.excludeSharedDrives = null;
            return;
        }

        this.excludeSharedDrives = new java.util.ArrayList<String>(excludeSharedDrives);
    }

    /**
     * <p>
     * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared
     * drive are excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeSharedDrives(java.util.Collection)} or {@link #withExcludeSharedDrives(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param excludeSharedDrives
     *        A list of identifiers or shared drives to exclude from the index. All files and folders stored on the
     *        shared drive are excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeSharedDrives(String... excludeSharedDrives) {
        if (this.excludeSharedDrives == null) {
            setExcludeSharedDrives(new java.util.ArrayList<String>(excludeSharedDrives.length));
        }
        for (String ele : excludeSharedDrives) {
            this.excludeSharedDrives.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared
     * drive are excluded.
     * </p>
     * 
     * @param excludeSharedDrives
     *        A list of identifiers or shared drives to exclude from the index. All files and folders stored on the
     *        shared drive are excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExcludeSharedDrives(java.util.Collection<String> excludeSharedDrives) {
        setExcludeSharedDrives(excludeSharedDrives);
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
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getExcludeMimeTypes() != null)
            sb.append("ExcludeMimeTypes: ").append(getExcludeMimeTypes()).append(",");
        if (getExcludeUserAccounts() != null)
            sb.append("ExcludeUserAccounts: ").append(getExcludeUserAccounts()).append(",");
        if (getExcludeSharedDrives() != null)
            sb.append("ExcludeSharedDrives: ").append(getExcludeSharedDrives());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GoogleDriveConfiguration == false)
            return false;
        GoogleDriveConfiguration other = (GoogleDriveConfiguration) obj;
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
        if (other.getExcludeMimeTypes() == null ^ this.getExcludeMimeTypes() == null)
            return false;
        if (other.getExcludeMimeTypes() != null && other.getExcludeMimeTypes().equals(this.getExcludeMimeTypes()) == false)
            return false;
        if (other.getExcludeUserAccounts() == null ^ this.getExcludeUserAccounts() == null)
            return false;
        if (other.getExcludeUserAccounts() != null && other.getExcludeUserAccounts().equals(this.getExcludeUserAccounts()) == false)
            return false;
        if (other.getExcludeSharedDrives() == null ^ this.getExcludeSharedDrives() == null)
            return false;
        if (other.getExcludeSharedDrives() != null && other.getExcludeSharedDrives().equals(this.getExcludeSharedDrives()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getExcludeMimeTypes() == null) ? 0 : getExcludeMimeTypes().hashCode());
        hashCode = prime * hashCode + ((getExcludeUserAccounts() == null) ? 0 : getExcludeUserAccounts().hashCode());
        hashCode = prime * hashCode + ((getExcludeSharedDrives() == null) ? 0 : getExcludeSharedDrives().hashCode());
        return hashCode;
    }

    @Override
    public GoogleDriveConfiguration clone() {
        try {
            return (GoogleDriveConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GoogleDriveConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
