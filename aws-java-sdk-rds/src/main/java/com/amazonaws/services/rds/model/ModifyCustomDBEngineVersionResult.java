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

/**
 * <p>
 * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCustomDBEngineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDBEngineVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * The description of the database engine.
     * </p>
     */
    private String dBEngineDescription;
    /**
     * <p>
     * The description of the database engine version.
     * </p>
     */
    private String dBEngineVersionDescription;
    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     */
    private CharacterSet defaultCharacterSet;
    /**
     * <p>
     * The EC2 image
     * </p>
     */
    private CustomDBEngineVersionAMI image;
    /**
     * <p>
     * A value that indicates the source media provider of the AMI based on the usage operation. Applicable for RDS
     * Custom for SQL Server.
     * </p>
     */
    private String dBEngineMediaType;
    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CharacterSet> supportedCharacterSets;
    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CharacterSet> supportedNcharCharacterSets;
    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpgradeTarget> validUpgradeTarget;
    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Timezone> supportedTimezones;
    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportableLogTypes;
    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     */
    private Boolean supportsLogExportsToCloudwatchLogs;
    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     */
    private Boolean supportsReadReplica;
    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedEngineModes;
    /**
     * <p>
     * A list of features supported by the DB engine.
     * </p>
     * <p>
     * The supported features vary by DB engine and DB engine version.
     * </p>
     * <p>
     * To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     * </p>
     * <p>
     * For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     * </p>
     * <p>
     * The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedFeatureNames;
    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     */
    private Boolean supportsParallelQuery;
    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     */
    private Boolean supportsGlobalDatabases;
    /**
     * <p>
     * The major engine version of the CEV.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * The name of the Amazon S3 bucket that contains your database installation files.
     * </p>
     */
    private String databaseInstallationFilesS3BucketName;
    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     * assumed.
     * </p>
     */
    private String databaseInstallationFilesS3Prefix;
    /**
     * <p>
     * The ARN of the custom engine version.
     * </p>
     */
    private String dBEngineVersionArn;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS Custom, but
     * optional for Amazon RDS.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * The creation time of the DB engine version.
     * </p>
     */
    private java.util.Date createTime;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;
    /**
     * <p>
     * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * </p>
     */
    private Boolean supportsBabelfish;
    /**
     * <p>
     * JSON string that lists the installation files and parameters that RDS Custom uses to create a custom engine
     * version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest. You can set
     * the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     * >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String customDBEngineVersionManifest;

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @return The name of the database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @return The version number of the database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @return The name of the DB parameter group family for the database engine.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     */

    public void setDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @return The description of the database engine.
     */

    public String getDBEngineDescription() {
        return this.dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDBEngineDescription(String dBEngineDescription) {
        setDBEngineDescription(dBEngineDescription);
        return this;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     */

    public void setDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @return The description of the database engine version.
     */

    public String getDBEngineVersionDescription() {
        return this.dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDBEngineVersionDescription(String dBEngineVersionDescription) {
        setDBEngineVersionDescription(dBEngineVersionDescription);
        return this;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API isn't specified.
     */

    public void setDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        this.defaultCharacterSet = defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @return The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *         parameter of the CreateDBInstance API isn't specified.
     */

    public CharacterSet getDefaultCharacterSet() {
        return this.defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API isn't specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API isn't specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        setDefaultCharacterSet(defaultCharacterSet);
        return this;
    }

    /**
     * <p>
     * The EC2 image
     * </p>
     * 
     * @param image
     *        The EC2 image
     */

    public void setImage(CustomDBEngineVersionAMI image) {
        this.image = image;
    }

    /**
     * <p>
     * The EC2 image
     * </p>
     * 
     * @return The EC2 image
     */

    public CustomDBEngineVersionAMI getImage() {
        return this.image;
    }

    /**
     * <p>
     * The EC2 image
     * </p>
     * 
     * @param image
     *        The EC2 image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withImage(CustomDBEngineVersionAMI image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * A value that indicates the source media provider of the AMI based on the usage operation. Applicable for RDS
     * Custom for SQL Server.
     * </p>
     * 
     * @param dBEngineMediaType
     *        A value that indicates the source media provider of the AMI based on the usage operation. Applicable for
     *        RDS Custom for SQL Server.
     */

    public void setDBEngineMediaType(String dBEngineMediaType) {
        this.dBEngineMediaType = dBEngineMediaType;
    }

    /**
     * <p>
     * A value that indicates the source media provider of the AMI based on the usage operation. Applicable for RDS
     * Custom for SQL Server.
     * </p>
     * 
     * @return A value that indicates the source media provider of the AMI based on the usage operation. Applicable for
     *         RDS Custom for SQL Server.
     */

    public String getDBEngineMediaType() {
        return this.dBEngineMediaType;
    }

    /**
     * <p>
     * A value that indicates the source media provider of the AMI based on the usage operation. Applicable for RDS
     * Custom for SQL Server.
     * </p>
     * 
     * @param dBEngineMediaType
     *        A value that indicates the source media provider of the AMI based on the usage operation. Applicable for
     *        RDS Custom for SQL Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDBEngineMediaType(String dBEngineMediaType) {
        setDBEngineMediaType(dBEngineMediaType);
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @return A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *         the <code>CreateDBInstance</code> operation.
     */

    public java.util.List<CharacterSet> getSupportedCharacterSets() {
        if (supportedCharacterSets == null) {
            supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>();
        }
        return supportedCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     */

    public void setSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        if (supportedCharacterSets == null) {
            this.supportedCharacterSets = null;
            return;
        }

        this.supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedCharacterSets(java.util.Collection)} or
     * {@link #withSupportedCharacterSets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedCharacterSets(CharacterSet... supportedCharacterSets) {
        if (this.supportedCharacterSets == null) {
            setSupportedCharacterSets(new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets.length));
        }
        for (CharacterSet ele : supportedCharacterSets) {
            this.supportedCharacterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        setSupportedCharacterSets(supportedCharacterSets);
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @return A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *         parameter of the <code>CreateDBInstance</code> operation.
     */

    public java.util.List<CharacterSet> getSupportedNcharCharacterSets() {
        if (supportedNcharCharacterSets == null) {
            supportedNcharCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>();
        }
        return supportedNcharCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     */

    public void setSupportedNcharCharacterSets(java.util.Collection<CharacterSet> supportedNcharCharacterSets) {
        if (supportedNcharCharacterSets == null) {
            this.supportedNcharCharacterSets = null;
            return;
        }

        this.supportedNcharCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedNcharCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedNcharCharacterSets(java.util.Collection)} or
     * {@link #withSupportedNcharCharacterSets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedNcharCharacterSets(CharacterSet... supportedNcharCharacterSets) {
        if (this.supportedNcharCharacterSets == null) {
            setSupportedNcharCharacterSets(new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedNcharCharacterSets.length));
        }
        for (CharacterSet ele : supportedNcharCharacterSets) {
            this.supportedNcharCharacterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     * parameter of the <code>CreateDBInstance</code> operation.
     * </p>
     * 
     * @param supportedNcharCharacterSets
     *        A list of the character sets supported by the Oracle DB engine for the <code>NcharCharacterSetName</code>
     *        parameter of the <code>CreateDBInstance</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedNcharCharacterSets(java.util.Collection<CharacterSet> supportedNcharCharacterSets) {
        setSupportedNcharCharacterSets(supportedNcharCharacterSets);
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @return A list of engine versions that this database engine version can be upgraded to.
     */

    public java.util.List<UpgradeTarget> getValidUpgradeTarget() {
        if (validUpgradeTarget == null) {
            validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>();
        }
        return validUpgradeTarget;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     */

    public void setValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        if (validUpgradeTarget == null) {
            this.validUpgradeTarget = null;
            return;
        }

        this.validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget);
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidUpgradeTarget(java.util.Collection)} or {@link #withValidUpgradeTarget(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withValidUpgradeTarget(UpgradeTarget... validUpgradeTarget) {
        if (this.validUpgradeTarget == null) {
            setValidUpgradeTarget(new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget.length));
        }
        for (UpgradeTarget ele : validUpgradeTarget) {
            this.validUpgradeTarget.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        setValidUpgradeTarget(validUpgradeTarget);
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @return A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *         <code>CreateDBInstance</code> action.
     */

    public java.util.List<Timezone> getSupportedTimezones() {
        if (supportedTimezones == null) {
            supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>();
        }
        return supportedTimezones;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     */

    public void setSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        if (supportedTimezones == null) {
            this.supportedTimezones = null;
            return;
        }

        this.supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones);
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTimezones(java.util.Collection)} or {@link #withSupportedTimezones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedTimezones(Timezone... supportedTimezones) {
        if (this.supportedTimezones == null) {
            setSupportedTimezones(new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones.length));
        }
        for (Timezone ele : supportedTimezones) {
            this.supportedTimezones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        setSupportedTimezones(supportedTimezones);
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @return The types of logs that the database engine has available for export to CloudWatch Logs.
     */

    public java.util.List<String> getExportableLogTypes() {
        if (exportableLogTypes == null) {
            exportableLogTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportableLogTypes;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     */

    public void setExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        if (exportableLogTypes == null) {
            this.exportableLogTypes = null;
            return;
        }

        this.exportableLogTypes = new com.amazonaws.internal.SdkInternalList<String>(exportableLogTypes);
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportableLogTypes(java.util.Collection)} or {@link #withExportableLogTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withExportableLogTypes(String... exportableLogTypes) {
        if (this.exportableLogTypes == null) {
            setExportableLogTypes(new com.amazonaws.internal.SdkInternalList<String>(exportableLogTypes.length));
        }
        for (String ele : exportableLogTypes) {
            this.exportableLogTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        setExportableLogTypes(exportableLogTypes);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        ExportableLogTypes to CloudWatch Logs.
     */

    public void setSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        this.supportsLogExportsToCloudwatchLogs = supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         ExportableLogTypes to CloudWatch Logs.
     */

    public Boolean getSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        ExportableLogTypes to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        setSupportsLogExportsToCloudwatchLogs(supportsLogExportsToCloudwatchLogs);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * ExportableLogTypes to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         ExportableLogTypes to CloudWatch Logs.
     */

    public Boolean isSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @param supportsReadReplica
     *        Indicates whether the database engine version supports read replicas.
     */

    public void setSupportsReadReplica(Boolean supportsReadReplica) {
        this.supportsReadReplica = supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @return Indicates whether the database engine version supports read replicas.
     */

    public Boolean getSupportsReadReplica() {
        return this.supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @param supportsReadReplica
     *        Indicates whether the database engine version supports read replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportsReadReplica(Boolean supportsReadReplica) {
        setSupportsReadReplica(supportsReadReplica);
        return this;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * 
     * @return Indicates whether the database engine version supports read replicas.
     */

    public Boolean isSupportsReadReplica() {
        return this.supportsReadReplica;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @return A list of the supported DB engine modes.
     */

    public java.util.List<String> getSupportedEngineModes() {
        if (supportedEngineModes == null) {
            supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedEngineModes;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     */

    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedEngineModes(java.util.Collection)} or {@link #withSupportedEngineModes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedEngineModes(String... supportedEngineModes) {
        if (this.supportedEngineModes == null) {
            setSupportedEngineModes(new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes.length));
        }
        for (String ele : supportedEngineModes) {
            this.supportedEngineModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine.
     * </p>
     * <p>
     * The supported features vary by DB engine and DB engine version.
     * </p>
     * <p>
     * To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     * </p>
     * <p>
     * For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     * </p>
     * <p>
     * The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * </p>
     * 
     * @return A list of features supported by the DB engine.</p>
     *         <p>
     *         The supported features vary by DB engine and DB engine version.
     *         </p>
     *         <p>
     *         To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     *         following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     *         </p>
     *         <p>
     *         For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use
     *         the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     *         </p>
     *         <p>
     *         The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     */

    public java.util.List<String> getSupportedFeatureNames() {
        if (supportedFeatureNames == null) {
            supportedFeatureNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedFeatureNames;
    }

    /**
     * <p>
     * A list of features supported by the DB engine.
     * </p>
     * <p>
     * The supported features vary by DB engine and DB engine version.
     * </p>
     * <p>
     * To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     * </p>
     * <p>
     * For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     * </p>
     * <p>
     * The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * </p>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine.</p>
     *        <p>
     *        The supported features vary by DB engine and DB engine version.
     *        </p>
     *        <p>
     *        To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     *        following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     *        </p>
     *        <p>
     *        For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     *        </p>
     *        <p>
     *        The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     */

    public void setSupportedFeatureNames(java.util.Collection<String> supportedFeatureNames) {
        if (supportedFeatureNames == null) {
            this.supportedFeatureNames = null;
            return;
        }

        this.supportedFeatureNames = new com.amazonaws.internal.SdkInternalList<String>(supportedFeatureNames);
    }

    /**
     * <p>
     * A list of features supported by the DB engine.
     * </p>
     * <p>
     * The supported features vary by DB engine and DB engine version.
     * </p>
     * <p>
     * To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     * </p>
     * <p>
     * For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     * </p>
     * <p>
     * The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedFeatureNames(java.util.Collection)} or
     * {@link #withSupportedFeatureNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine.</p>
     *        <p>
     *        The supported features vary by DB engine and DB engine version.
     *        </p>
     *        <p>
     *        To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     *        following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     *        </p>
     *        <p>
     *        For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     *        </p>
     *        <p>
     *        The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedFeatureNames(String... supportedFeatureNames) {
        if (this.supportedFeatureNames == null) {
            setSupportedFeatureNames(new com.amazonaws.internal.SdkInternalList<String>(supportedFeatureNames.length));
        }
        for (String ele : supportedFeatureNames) {
            this.supportedFeatureNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine.
     * </p>
     * <p>
     * The supported features vary by DB engine and DB engine version.
     * </p>
     * <p>
     * To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     * </p>
     * <p>
     * For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     * </p>
     * <p>
     * The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * </p>
     * 
     * @param supportedFeatureNames
     *        A list of features supported by the DB engine.</p>
     *        <p>
     *        The supported features vary by DB engine and DB engine version.
     *        </p>
     *        <p>
     *        To determine the supported features for a specific DB engine and DB engine version using the CLI, use the
     *        following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;</code>
     *        </p>
     *        <p>
     *        For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --engine-version 13.3</code>
     *        </p>
     *        <p>
     *        The supported features are listed under <code>SupportedFeatureNames</code> in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportedFeatureNames(java.util.Collection<String> supportedFeatureNames) {
        setSupportedFeatureNames(supportedFeatureNames);
        return this;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @return The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB engine version, either <code>available</code> or <code>deprecated</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @param supportsParallelQuery
     *        A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public void setSupportsParallelQuery(Boolean supportsParallelQuery) {
        this.supportsParallelQuery = supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public Boolean getSupportsParallelQuery() {
        return this.supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @param supportsParallelQuery
     *        A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportsParallelQuery(Boolean supportsParallelQuery) {
        setSupportsParallelQuery(supportsParallelQuery);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
     */

    public Boolean isSupportsParallelQuery() {
        return this.supportsParallelQuery;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public void setSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        this.supportsGlobalDatabases = supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public Boolean getSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        setSupportsGlobalDatabases(supportsGlobalDatabases);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific DB engine version.
     */

    public Boolean isSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }

    /**
     * <p>
     * The major engine version of the CEV.
     * </p>
     * 
     * @param majorEngineVersion
     *        The major engine version of the CEV.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * The major engine version of the CEV.
     * </p>
     * 
     * @return The major engine version of the CEV.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * The major engine version of the CEV.
     * </p>
     * 
     * @param majorEngineVersion
     *        The major engine version of the CEV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that contains your database installation files.
     * </p>
     * 
     * @param databaseInstallationFilesS3BucketName
     *        The name of the Amazon S3 bucket that contains your database installation files.
     */

    public void setDatabaseInstallationFilesS3BucketName(String databaseInstallationFilesS3BucketName) {
        this.databaseInstallationFilesS3BucketName = databaseInstallationFilesS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that contains your database installation files.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket that contains your database installation files.
     */

    public String getDatabaseInstallationFilesS3BucketName() {
        return this.databaseInstallationFilesS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that contains your database installation files.
     * </p>
     * 
     * @param databaseInstallationFilesS3BucketName
     *        The name of the Amazon S3 bucket that contains your database installation files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDatabaseInstallationFilesS3BucketName(String databaseInstallationFilesS3BucketName) {
        setDatabaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     * assumed.
     * </p>
     * 
     * @param databaseInstallationFilesS3Prefix
     *        The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     *        assumed.
     */

    public void setDatabaseInstallationFilesS3Prefix(String databaseInstallationFilesS3Prefix) {
        this.databaseInstallationFilesS3Prefix = databaseInstallationFilesS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     * assumed.
     * </p>
     * 
     * @return The Amazon S3 directory that contains the database installation files. If not specified, then no prefix
     *         is assumed.
     */

    public String getDatabaseInstallationFilesS3Prefix() {
        return this.databaseInstallationFilesS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     * assumed.
     * </p>
     * 
     * @param databaseInstallationFilesS3Prefix
     *        The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is
     *        assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDatabaseInstallationFilesS3Prefix(String databaseInstallationFilesS3Prefix) {
        setDatabaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix);
        return this;
    }

    /**
     * <p>
     * The ARN of the custom engine version.
     * </p>
     * 
     * @param dBEngineVersionArn
     *        The ARN of the custom engine version.
     */

    public void setDBEngineVersionArn(String dBEngineVersionArn) {
        this.dBEngineVersionArn = dBEngineVersionArn;
    }

    /**
     * <p>
     * The ARN of the custom engine version.
     * </p>
     * 
     * @return The ARN of the custom engine version.
     */

    public String getDBEngineVersionArn() {
        return this.dBEngineVersionArn;
    }

    /**
     * <p>
     * The ARN of the custom engine version.
     * </p>
     * 
     * @param dBEngineVersionArn
     *        The ARN of the custom engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withDBEngineVersionArn(String dBEngineVersionArn) {
        setDBEngineVersionArn(dBEngineVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS Custom, but
     * optional for Amazon RDS.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS
     *        Custom, but optional for Amazon RDS.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS Custom, but
     * optional for Amazon RDS.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS
     *         Custom, but optional for Amazon RDS.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS Custom, but
     * optional for Amazon RDS.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS
     *        Custom, but optional for Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * The creation time of the DB engine version.
     * </p>
     * 
     * @param createTime
     *        The creation time of the DB engine version.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation time of the DB engine version.
     * </p>
     * 
     * @return The creation time of the DB engine version.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation time of the DB engine version.
     * </p>
     * 
     * @param createTime
     *        The creation time of the DB engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
            tagList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagList;
    }

    /**
     * @param tagList
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new com.amazonaws.internal.SdkInternalList<Tag>(tagList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new com.amazonaws.internal.SdkInternalList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * </p>
     * 
     * @param supportsBabelfish
     *        A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     */

    public void setSupportsBabelfish(Boolean supportsBabelfish) {
        this.supportsBabelfish = supportsBabelfish;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     */

    public Boolean getSupportsBabelfish() {
        return this.supportsBabelfish;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * </p>
     * 
     * @param supportsBabelfish
     *        A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withSupportsBabelfish(Boolean supportsBabelfish) {
        setSupportsBabelfish(supportsBabelfish);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
     */

    public Boolean isSupportsBabelfish() {
        return this.supportsBabelfish;
    }

    /**
     * <p>
     * JSON string that lists the installation files and parameters that RDS Custom uses to create a custom engine
     * version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest. You can set
     * the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     * >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param customDBEngineVersionManifest
     *        JSON string that lists the installation files and parameters that RDS Custom uses to create a custom
     *        engine version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest.
     *        You can set the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     *        >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setCustomDBEngineVersionManifest(String customDBEngineVersionManifest) {
        this.customDBEngineVersionManifest = customDBEngineVersionManifest;
    }

    /**
     * <p>
     * JSON string that lists the installation files and parameters that RDS Custom uses to create a custom engine
     * version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest. You can set
     * the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     * >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return JSON string that lists the installation files and parameters that RDS Custom uses to create a custom
     *         engine version (CEV). RDS Custom applies the patches in the order in which they're listed in the
     *         manifest. You can set the Oracle home, Oracle base, and UNIX/Linux user and group using the installation
     *         parameters. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     *         >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getCustomDBEngineVersionManifest() {
        return this.customDBEngineVersionManifest;
    }

    /**
     * <p>
     * JSON string that lists the installation files and parameters that RDS Custom uses to create a custom engine
     * version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest. You can set
     * the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     * >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param customDBEngineVersionManifest
     *        JSON string that lists the installation files and parameters that RDS Custom uses to create a custom
     *        engine version (CEV). RDS Custom applies the patches in the order in which they're listed in the manifest.
     *        You can set the Oracle home, Oracle base, and UNIX/Linux user and group using the installation parameters.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.preparing.html#custom-cev.preparing.manifest.fields"
     *        >JSON fields in the CEV manifest</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionResult withCustomDBEngineVersionManifest(String customDBEngineVersionManifest) {
        setCustomDBEngineVersionManifest(customDBEngineVersionManifest);
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getDBEngineDescription() != null)
            sb.append("DBEngineDescription: ").append(getDBEngineDescription()).append(",");
        if (getDBEngineVersionDescription() != null)
            sb.append("DBEngineVersionDescription: ").append(getDBEngineVersionDescription()).append(",");
        if (getDefaultCharacterSet() != null)
            sb.append("DefaultCharacterSet: ").append(getDefaultCharacterSet()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getDBEngineMediaType() != null)
            sb.append("DBEngineMediaType: ").append(getDBEngineMediaType()).append(",");
        if (getSupportedCharacterSets() != null)
            sb.append("SupportedCharacterSets: ").append(getSupportedCharacterSets()).append(",");
        if (getSupportedNcharCharacterSets() != null)
            sb.append("SupportedNcharCharacterSets: ").append(getSupportedNcharCharacterSets()).append(",");
        if (getValidUpgradeTarget() != null)
            sb.append("ValidUpgradeTarget: ").append(getValidUpgradeTarget()).append(",");
        if (getSupportedTimezones() != null)
            sb.append("SupportedTimezones: ").append(getSupportedTimezones()).append(",");
        if (getExportableLogTypes() != null)
            sb.append("ExportableLogTypes: ").append(getExportableLogTypes()).append(",");
        if (getSupportsLogExportsToCloudwatchLogs() != null)
            sb.append("SupportsLogExportsToCloudwatchLogs: ").append(getSupportsLogExportsToCloudwatchLogs()).append(",");
        if (getSupportsReadReplica() != null)
            sb.append("SupportsReadReplica: ").append(getSupportsReadReplica()).append(",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: ").append(getSupportedEngineModes()).append(",");
        if (getSupportedFeatureNames() != null)
            sb.append("SupportedFeatureNames: ").append(getSupportedFeatureNames()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSupportsParallelQuery() != null)
            sb.append("SupportsParallelQuery: ").append(getSupportsParallelQuery()).append(",");
        if (getSupportsGlobalDatabases() != null)
            sb.append("SupportsGlobalDatabases: ").append(getSupportsGlobalDatabases()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion()).append(",");
        if (getDatabaseInstallationFilesS3BucketName() != null)
            sb.append("DatabaseInstallationFilesS3BucketName: ").append(getDatabaseInstallationFilesS3BucketName()).append(",");
        if (getDatabaseInstallationFilesS3Prefix() != null)
            sb.append("DatabaseInstallationFilesS3Prefix: ").append(getDatabaseInstallationFilesS3Prefix()).append(",");
        if (getDBEngineVersionArn() != null)
            sb.append("DBEngineVersionArn: ").append(getDBEngineVersionArn()).append(",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getSupportsBabelfish() != null)
            sb.append("SupportsBabelfish: ").append(getSupportsBabelfish()).append(",");
        if (getCustomDBEngineVersionManifest() != null)
            sb.append("CustomDBEngineVersionManifest: ").append(getCustomDBEngineVersionManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCustomDBEngineVersionResult == false)
            return false;
        ModifyCustomDBEngineVersionResult other = (ModifyCustomDBEngineVersionResult) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDBEngineDescription() == null ^ this.getDBEngineDescription() == null)
            return false;
        if (other.getDBEngineDescription() != null && other.getDBEngineDescription().equals(this.getDBEngineDescription()) == false)
            return false;
        if (other.getDBEngineVersionDescription() == null ^ this.getDBEngineVersionDescription() == null)
            return false;
        if (other.getDBEngineVersionDescription() != null && other.getDBEngineVersionDescription().equals(this.getDBEngineVersionDescription()) == false)
            return false;
        if (other.getDefaultCharacterSet() == null ^ this.getDefaultCharacterSet() == null)
            return false;
        if (other.getDefaultCharacterSet() != null && other.getDefaultCharacterSet().equals(this.getDefaultCharacterSet()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getDBEngineMediaType() == null ^ this.getDBEngineMediaType() == null)
            return false;
        if (other.getDBEngineMediaType() != null && other.getDBEngineMediaType().equals(this.getDBEngineMediaType()) == false)
            return false;
        if (other.getSupportedCharacterSets() == null ^ this.getSupportedCharacterSets() == null)
            return false;
        if (other.getSupportedCharacterSets() != null && other.getSupportedCharacterSets().equals(this.getSupportedCharacterSets()) == false)
            return false;
        if (other.getSupportedNcharCharacterSets() == null ^ this.getSupportedNcharCharacterSets() == null)
            return false;
        if (other.getSupportedNcharCharacterSets() != null && other.getSupportedNcharCharacterSets().equals(this.getSupportedNcharCharacterSets()) == false)
            return false;
        if (other.getValidUpgradeTarget() == null ^ this.getValidUpgradeTarget() == null)
            return false;
        if (other.getValidUpgradeTarget() != null && other.getValidUpgradeTarget().equals(this.getValidUpgradeTarget()) == false)
            return false;
        if (other.getSupportedTimezones() == null ^ this.getSupportedTimezones() == null)
            return false;
        if (other.getSupportedTimezones() != null && other.getSupportedTimezones().equals(this.getSupportedTimezones()) == false)
            return false;
        if (other.getExportableLogTypes() == null ^ this.getExportableLogTypes() == null)
            return false;
        if (other.getExportableLogTypes() != null && other.getExportableLogTypes().equals(this.getExportableLogTypes()) == false)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() == null ^ this.getSupportsLogExportsToCloudwatchLogs() == null)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() != null
                && other.getSupportsLogExportsToCloudwatchLogs().equals(this.getSupportsLogExportsToCloudwatchLogs()) == false)
            return false;
        if (other.getSupportsReadReplica() == null ^ this.getSupportsReadReplica() == null)
            return false;
        if (other.getSupportsReadReplica() != null && other.getSupportsReadReplica().equals(this.getSupportsReadReplica()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        if (other.getSupportedFeatureNames() == null ^ this.getSupportedFeatureNames() == null)
            return false;
        if (other.getSupportedFeatureNames() != null && other.getSupportedFeatureNames().equals(this.getSupportedFeatureNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSupportsParallelQuery() == null ^ this.getSupportsParallelQuery() == null)
            return false;
        if (other.getSupportsParallelQuery() != null && other.getSupportsParallelQuery().equals(this.getSupportsParallelQuery()) == false)
            return false;
        if (other.getSupportsGlobalDatabases() == null ^ this.getSupportsGlobalDatabases() == null)
            return false;
        if (other.getSupportsGlobalDatabases() != null && other.getSupportsGlobalDatabases().equals(this.getSupportsGlobalDatabases()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
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
        if (other.getDBEngineVersionArn() == null ^ this.getDBEngineVersionArn() == null)
            return false;
        if (other.getDBEngineVersionArn() != null && other.getDBEngineVersionArn().equals(this.getDBEngineVersionArn()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getSupportsBabelfish() == null ^ this.getSupportsBabelfish() == null)
            return false;
        if (other.getSupportsBabelfish() != null && other.getSupportsBabelfish().equals(this.getSupportsBabelfish()) == false)
            return false;
        if (other.getCustomDBEngineVersionManifest() == null ^ this.getCustomDBEngineVersionManifest() == null)
            return false;
        if (other.getCustomDBEngineVersionManifest() != null
                && other.getCustomDBEngineVersionManifest().equals(this.getCustomDBEngineVersionManifest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDBEngineDescription() == null) ? 0 : getDBEngineDescription().hashCode());
        hashCode = prime * hashCode + ((getDBEngineVersionDescription() == null) ? 0 : getDBEngineVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultCharacterSet() == null) ? 0 : getDefaultCharacterSet().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getDBEngineMediaType() == null) ? 0 : getDBEngineMediaType().hashCode());
        hashCode = prime * hashCode + ((getSupportedCharacterSets() == null) ? 0 : getSupportedCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getSupportedNcharCharacterSets() == null) ? 0 : getSupportedNcharCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getValidUpgradeTarget() == null) ? 0 : getValidUpgradeTarget().hashCode());
        hashCode = prime * hashCode + ((getSupportedTimezones() == null) ? 0 : getSupportedTimezones().hashCode());
        hashCode = prime * hashCode + ((getExportableLogTypes() == null) ? 0 : getExportableLogTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportsLogExportsToCloudwatchLogs() == null) ? 0 : getSupportsLogExportsToCloudwatchLogs().hashCode());
        hashCode = prime * hashCode + ((getSupportsReadReplica() == null) ? 0 : getSupportsReadReplica().hashCode());
        hashCode = prime * hashCode + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        hashCode = prime * hashCode + ((getSupportedFeatureNames() == null) ? 0 : getSupportedFeatureNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSupportsParallelQuery() == null) ? 0 : getSupportsParallelQuery().hashCode());
        hashCode = prime * hashCode + ((getSupportsGlobalDatabases() == null) ? 0 : getSupportsGlobalDatabases().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInstallationFilesS3BucketName() == null) ? 0 : getDatabaseInstallationFilesS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInstallationFilesS3Prefix() == null) ? 0 : getDatabaseInstallationFilesS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getDBEngineVersionArn() == null) ? 0 : getDBEngineVersionArn().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getSupportsBabelfish() == null) ? 0 : getSupportsBabelfish().hashCode());
        hashCode = prime * hashCode + ((getCustomDBEngineVersionManifest() == null) ? 0 : getCustomDBEngineVersionManifest().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCustomDBEngineVersionResult clone() {
        try {
            return (ModifyCustomDBEngineVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
