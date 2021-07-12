/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides configuration information for data sources that connect to Google Drive.
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
     * A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     * included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is excluded
     * from the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern are
     * excluded from the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * included in the index. If an item matches both an exclusion pattern and an inclusion pattern, it is excluded from
     * the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Defines mapping between a field in the Google Drive and a Amazon Kendra index field.
     * </p>
     * <p>
     * If you are using the console, you can define index fields when creating the mapping. If you are using the API,
     * you must first create the field using the <code>UpdateIndex</code> operation.
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
     * A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     * included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is excluded
     * from the index.
     * </p>
     * 
     * @return A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern
     *         are included in the index from both shared drives and users' My Drives. Items that don't match the
     *         pattern are excluded from the index. If an item matches both an inclusion pattern and an exclusion
     *         pattern, it is excluded from the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     * included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is excluded
     * from the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     *        included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     *        excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is
     *        excluded from the index.
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
     * A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     * included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is excluded
     * from the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     *        included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     *        excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is
     *        excluded from the index.
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
     * A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     * included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is excluded
     * from the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to path on Google Drive. Items that match the pattern are
     *        included in the index from both shared drives and users' My Drives. Items that don't match the pattern are
     *        excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, it is
     *        excluded from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern are
     * excluded from the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * included in the index. If an item matches both an exclusion pattern and an inclusion pattern, it is excluded from
     * the index.
     * </p>
     * 
     * @return A list of regular expression patterns that apply to the path on Google Drive. Items that match the
     *         pattern are excluded from the index from both shared drives and users' My Drives. Items that don't match
     *         the pattern are included in the index. If an item matches both an exclusion pattern and an inclusion
     *         pattern, it is excluded from the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern are
     * excluded from the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * included in the index. If an item matches both an exclusion pattern and an inclusion pattern, it is excluded from
     * the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern
     *        are excluded from the index from both shared drives and users' My Drives. Items that don't match the
     *        pattern are included in the index. If an item matches both an exclusion pattern and an inclusion pattern,
     *        it is excluded from the index.
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
     * A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern are
     * excluded from the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * included in the index. If an item matches both an exclusion pattern and an inclusion pattern, it is excluded from
     * the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern
     *        are excluded from the index from both shared drives and users' My Drives. Items that don't match the
     *        pattern are included in the index. If an item matches both an exclusion pattern and an inclusion pattern,
     *        it is excluded from the index.
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
     * A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern are
     * excluded from the index from both shared drives and users' My Drives. Items that don't match the pattern are
     * included in the index. If an item matches both an exclusion pattern and an inclusion pattern, it is excluded from
     * the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to the path on Google Drive. Items that match the pattern
     *        are excluded from the index from both shared drives and users' My Drives. Items that don't match the
     *        pattern are included in the index. If an item matches both an exclusion pattern and an inclusion pattern,
     *        it is excluded from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GoogleDriveConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Defines mapping between a field in the Google Drive and a Amazon Kendra index field.
     * </p>
     * <p>
     * If you are using the console, you can define index fields when creating the mapping. If you are using the API,
     * you must first create the field using the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @return Defines mapping between a field in the Google Drive and a Amazon Kendra index field.</p>
     *         <p>
     *         If you are using the console, you can define index fields when creating the mapping. If you are using the
     *         API, you must first create the field using the <code>UpdateIndex</code> operation.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Defines mapping between a field in the Google Drive and a Amazon Kendra index field.
     * </p>
     * <p>
     * If you are using the console, you can define index fields when creating the mapping. If you are using the API,
     * you must first create the field using the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @param fieldMappings
     *        Defines mapping between a field in the Google Drive and a Amazon Kendra index field.</p>
     *        <p>
     *        If you are using the console, you can define index fields when creating the mapping. If you are using the
     *        API, you must first create the field using the <code>UpdateIndex</code> operation.
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
     * Defines mapping between a field in the Google Drive and a Amazon Kendra index field.
     * </p>
     * <p>
     * If you are using the console, you can define index fields when creating the mapping. If you are using the API,
     * you must first create the field using the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        Defines mapping between a field in the Google Drive and a Amazon Kendra index field.</p>
     *        <p>
     *        If you are using the console, you can define index fields when creating the mapping. If you are using the
     *        API, you must first create the field using the <code>UpdateIndex</code> operation.
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
     * Defines mapping between a field in the Google Drive and a Amazon Kendra index field.
     * </p>
     * <p>
     * If you are using the console, you can define index fields when creating the mapping. If you are using the API,
     * you must first create the field using the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @param fieldMappings
     *        Defines mapping between a field in the Google Drive and a Amazon Kendra index field.</p>
     *        <p>
     *        If you are using the console, you can define index fields when creating the mapping. If you are using the
     *        API, you must first create the field using the <code>UpdateIndex</code> operation.
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
