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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateCustomDBEngineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomDBEngineVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The database engine to use for your custom engine version (CEV). The only supported value is
     * <code>custom-oracle-ee</code>.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     * <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS. The
     * combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a valid
     * bucket name is <code>my-custom-installation-files</code>.
     * </p>
     */
    private String databaseInstallationFilesS3BucketName;
    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid bucket
     * name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     * </p>
     */
    private String databaseInstallationFilesS3Prefix;
    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is required for
     * RDS Custom, but optional for Amazon RDS.
     * </p>
     * <p>
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No further
     * action is necessary. If you don't already have a symmetric encryption KMS key in your account, follow the
     * instructions in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk"> Creating a
     * symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose different
     * keys.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     * Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in which
     * they are listed.
     * </p>
     * <p>
     * The following JSON fields are valid:
     * </p>
     * <dl>
     * <dt>MediaImportTemplateVersion</dt>
     * <dd>
     * <p>
     * Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     * </p>
     * </dd>
     * <dt>databaseInstallationFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of installation files for the CEV.
     * </p>
     * </dd>
     * <dt>opatchFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of OPatch installers used for the Oracle DB engine.
     * </p>
     * </dd>
     * <dt>psuRuPatchFileNames</dt>
     * <dd>
     * <p>
     * The PSU and RU patches for this CEV.
     * </p>
     * </dd>
     * <dt>OtherPatchFileNames</dt>
     * <dd>
     * <p>
     * The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after applying the
     * PSU and RU patches.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     * Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String manifest;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The database engine to use for your custom engine version (CEV). The only supported value is
     * <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @param engine
     *        The database engine to use for your custom engine version (CEV). The only supported value is
     *        <code>custom-oracle-ee</code>.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for your custom engine version (CEV). The only supported value is
     * <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @return The database engine to use for your custom engine version (CEV). The only supported value is
     *         <code>custom-oracle-ee</code>.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for your custom engine version (CEV). The only supported value is
     * <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @param engine
     *        The database engine to use for your custom engine version (CEV). The only supported value is
     *        <code>custom-oracle-ee</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     * <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS. The
     * combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     * </p>
     * 
     * @param engineVersion
     *        The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     *        <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     *        The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     * <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS. The
     * combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     * </p>
     * 
     * @return The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     *         <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     *         The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     * <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS. The
     * combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     * </p>
     * 
     * @param engineVersion
     *        The name of your CEV. The name format is 19.<i>customized_string</i>. For example, a valid CEV name is
     *        <code>19.my_cev1</code>. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     *        The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a valid
     * bucket name is <code>my-custom-installation-files</code>.
     * </p>
     * 
     * @param databaseInstallationFilesS3BucketName
     *        The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a
     *        valid bucket name is <code>my-custom-installation-files</code>.
     */

    public void setDatabaseInstallationFilesS3BucketName(String databaseInstallationFilesS3BucketName) {
        this.databaseInstallationFilesS3BucketName = databaseInstallationFilesS3BucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a valid
     * bucket name is <code>my-custom-installation-files</code>.
     * </p>
     * 
     * @return The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a
     *         valid bucket name is <code>my-custom-installation-files</code>.
     */

    public String getDatabaseInstallationFilesS3BucketName() {
        return this.databaseInstallationFilesS3BucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a valid
     * bucket name is <code>my-custom-installation-files</code>.
     * </p>
     * 
     * @param databaseInstallationFilesS3BucketName
     *        The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a
     *        valid bucket name is <code>my-custom-installation-files</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withDatabaseInstallationFilesS3BucketName(String databaseInstallationFilesS3BucketName) {
        setDatabaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid bucket
     * name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     * </p>
     * 
     * @param databaseInstallationFilesS3Prefix
     *        The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid
     *        bucket name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     */

    public void setDatabaseInstallationFilesS3Prefix(String databaseInstallationFilesS3Prefix) {
        this.databaseInstallationFilesS3Prefix = databaseInstallationFilesS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid bucket
     * name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     * </p>
     * 
     * @return The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid
     *         bucket name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     */

    public String getDatabaseInstallationFilesS3Prefix() {
        return this.databaseInstallationFilesS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid bucket
     * name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     * </p>
     * 
     * @param databaseInstallationFilesS3Prefix
     *        The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid
     *        bucket name is <code>123456789012/cev1</code>. If this setting isn't specified, no prefix is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withDatabaseInstallationFilesS3Prefix(String databaseInstallationFilesS3Prefix) {
        setDatabaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     * </p>
     * 
     * @return The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI. An AMI ID is required to create a CEV for RDS Custom for SQL Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is required for
     * RDS Custom, but optional for Amazon RDS.
     * </p>
     * <p>
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No further
     * action is necessary. If you don't already have a symmetric encryption KMS key in your account, follow the
     * instructions in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk"> Creating a
     * symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose different
     * keys.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is
     *        required for RDS Custom, but optional for Amazon RDS.</p>
     *        <p>
     *        If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No
     *        further action is necessary. If you don't already have a symmetric encryption KMS key in your account,
     *        follow the instructions in <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk">
     *        Creating a symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose
     *        different keys.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is required for
     * RDS Custom, but optional for Amazon RDS.
     * </p>
     * <p>
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No further
     * action is necessary. If you don't already have a symmetric encryption KMS key in your account, follow the
     * instructions in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk"> Creating a
     * symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose different
     * keys.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is
     *         required for RDS Custom, but optional for Amazon RDS.</p>
     *         <p>
     *         If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No
     *         further action is necessary. If you don't already have a symmetric encryption KMS key in your account,
     *         follow the instructions in <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk">
     *         Creating a symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose
     *         different keys.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is required for
     * RDS Custom, but optional for Amazon RDS.
     * </p>
     * <p>
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No further
     * action is necessary. If you don't already have a symmetric encryption KMS key in your account, follow the
     * instructions in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk"> Creating a
     * symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose different
     * keys.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is
     *        required for RDS Custom, but optional for Amazon RDS.</p>
     *        <p>
     *        If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No
     *        further action is necessary. If you don't already have a symmetric encryption KMS key in your account,
     *        follow the instructions in <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk">
     *        Creating a symmetric encryption KMS key</a> in the <i>Amazon Web Services Key Management Service Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose
     *        different keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @param description
     *        An optional description of your CEV.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @return An optional description of your CEV.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @param description
     *        An optional description of your CEV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     * Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in which
     * they are listed.
     * </p>
     * <p>
     * The following JSON fields are valid:
     * </p>
     * <dl>
     * <dt>MediaImportTemplateVersion</dt>
     * <dd>
     * <p>
     * Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     * </p>
     * </dd>
     * <dt>databaseInstallationFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of installation files for the CEV.
     * </p>
     * </dd>
     * <dt>opatchFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of OPatch installers used for the Oracle DB engine.
     * </p>
     * </dd>
     * <dt>psuRuPatchFileNames</dt>
     * <dd>
     * <p>
     * The PSU and RU patches for this CEV.
     * </p>
     * </dd>
     * <dt>OtherPatchFileNames</dt>
     * <dd>
     * <p>
     * The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after applying the
     * PSU and RU patches.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     * Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param manifest
     *        The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     *        Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in
     *        which they are listed.</p>
     *        <p>
     *        The following JSON fields are valid:
     *        </p>
     *        <dl>
     *        <dt>MediaImportTemplateVersion</dt>
     *        <dd>
     *        <p>
     *        Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     *        </p>
     *        </dd>
     *        <dt>databaseInstallationFileNames</dt>
     *        <dd>
     *        <p>
     *        Ordered list of installation files for the CEV.
     *        </p>
     *        </dd>
     *        <dt>opatchFileNames</dt>
     *        <dd>
     *        <p>
     *        Ordered list of OPatch installers used for the Oracle DB engine.
     *        </p>
     *        </dd>
     *        <dt>psuRuPatchFileNames</dt>
     *        <dd>
     *        <p>
     *        The PSU and RU patches for this CEV.
     *        </p>
     *        </dd>
     *        <dt>OtherPatchFileNames</dt>
     *        <dd>
     *        <p>
     *        The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after
     *        applying the PSU and RU patches.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     *        Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     * Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in which
     * they are listed.
     * </p>
     * <p>
     * The following JSON fields are valid:
     * </p>
     * <dl>
     * <dt>MediaImportTemplateVersion</dt>
     * <dd>
     * <p>
     * Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     * </p>
     * </dd>
     * <dt>databaseInstallationFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of installation files for the CEV.
     * </p>
     * </dd>
     * <dt>opatchFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of OPatch installers used for the Oracle DB engine.
     * </p>
     * </dd>
     * <dt>psuRuPatchFileNames</dt>
     * <dd>
     * <p>
     * The PSU and RU patches for this CEV.
     * </p>
     * </dd>
     * <dt>OtherPatchFileNames</dt>
     * <dd>
     * <p>
     * The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after applying the
     * PSU and RU patches.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     * Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon
     *         S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the
     *         order in which they are listed.</p>
     *         <p>
     *         The following JSON fields are valid:
     *         </p>
     *         <dl>
     *         <dt>MediaImportTemplateVersion</dt>
     *         <dd>
     *         <p>
     *         Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     *         </p>
     *         </dd>
     *         <dt>databaseInstallationFileNames</dt>
     *         <dd>
     *         <p>
     *         Ordered list of installation files for the CEV.
     *         </p>
     *         </dd>
     *         <dt>opatchFileNames</dt>
     *         <dd>
     *         <p>
     *         Ordered list of OPatch installers used for the Oracle DB engine.
     *         </p>
     *         </dd>
     *         <dt>psuRuPatchFileNames</dt>
     *         <dd>
     *         <p>
     *         The PSU and RU patches for this CEV.
     *         </p>
     *         </dd>
     *         <dt>OtherPatchFileNames</dt>
     *         <dd>
     *         <p>
     *         The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after
     *         applying the PSU and RU patches.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     *         Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getManifest() {
        return this.manifest;
    }

    /**
     * <p>
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     * Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in which
     * they are listed.
     * </p>
     * <p>
     * The following JSON fields are valid:
     * </p>
     * <dl>
     * <dt>MediaImportTemplateVersion</dt>
     * <dd>
     * <p>
     * Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     * </p>
     * </dd>
     * <dt>databaseInstallationFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of installation files for the CEV.
     * </p>
     * </dd>
     * <dt>opatchFileNames</dt>
     * <dd>
     * <p>
     * Ordered list of OPatch installers used for the Oracle DB engine.
     * </p>
     * </dd>
     * <dt>psuRuPatchFileNames</dt>
     * <dd>
     * <p>
     * The PSU and RU patches for this CEV.
     * </p>
     * </dd>
     * <dt>OtherPatchFileNames</dt>
     * <dd>
     * <p>
     * The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after applying the
     * PSU and RU patches.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     * Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param manifest
     *        The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3.
     *        Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in
     *        which they are listed.</p>
     *        <p>
     *        The following JSON fields are valid:
     *        </p>
     *        <dl>
     *        <dt>MediaImportTemplateVersion</dt>
     *        <dd>
     *        <p>
     *        Version of the CEV manifest. The date is in the format <code>YYYY-MM-DD</code>.
     *        </p>
     *        </dd>
     *        <dt>databaseInstallationFileNames</dt>
     *        <dd>
     *        <p>
     *        Ordered list of installation files for the CEV.
     *        </p>
     *        </dd>
     *        <dt>opatchFileNames</dt>
     *        <dd>
     *        <p>
     *        Ordered list of OPatch installers used for the Oracle DB engine.
     *        </p>
     *        </dd>
     *        <dt>psuRuPatchFileNames</dt>
     *        <dd>
     *        <p>
     *        The PSU and RU patches for this CEV.
     *        </p>
     *        </dd>
     *        <dt>OtherPatchFileNames</dt>
     *        <dd>
     *        <p>
     *        The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after
     *        applying the PSU and RU patches.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest">
     *        Creating the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withManifest(String manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDBEngineVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDatabaseInstallationFilesS3BucketName() != null)
            sb.append("DatabaseInstallationFilesS3BucketName: ").append(getDatabaseInstallationFilesS3BucketName()).append(",");
        if (getDatabaseInstallationFilesS3Prefix() != null)
            sb.append("DatabaseInstallationFilesS3Prefix: ").append(getDatabaseInstallationFilesS3Prefix()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getManifest() != null)
            sb.append("Manifest: ").append(getManifest()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomDBEngineVersionRequest == false)
            return false;
        CreateCustomDBEngineVersionRequest other = (CreateCustomDBEngineVersionRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDatabaseInstallationFilesS3BucketName() == null ^ this.getDatabaseInstallationFilesS3BucketName() == null)
            return false;
        if (other.getDatabaseInstallationFilesS3BucketName() != null
                && other.getDatabaseInstallationFilesS3BucketName().equals(this.getDatabaseInstallationFilesS3BucketName()) == false)
            return false;
        if (other.getDatabaseInstallationFilesS3Prefix() == null ^ this.getDatabaseInstallationFilesS3Prefix() == null)
            return false;
        if (other.getDatabaseInstallationFilesS3Prefix() != null
                && other.getDatabaseInstallationFilesS3Prefix().equals(this.getDatabaseInstallationFilesS3Prefix()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInstallationFilesS3BucketName() == null) ? 0 : getDatabaseInstallationFilesS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInstallationFilesS3Prefix() == null) ? 0 : getDatabaseInstallationFilesS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomDBEngineVersionRequest clone() {
        return (CreateCustomDBEngineVersionRequest) super.clone();
    }

}
