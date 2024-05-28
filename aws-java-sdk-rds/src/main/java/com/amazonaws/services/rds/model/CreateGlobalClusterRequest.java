/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     * </p>
     * <p>
     * If you provide a value for this parameter, don't specify values for the following settings because Amazon Aurora
     * uses the values from the specified source DB cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatabaseName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Engine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EngineVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageEncrypted</code>
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBClusterIdentifier;
    /**
     * <p>
     * The database engine to use for this global database cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The engine version to use for this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine version of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String engineVersion;
    /**
     * <p>
     * The life cycle type for this global database cluster.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global cluster
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, creating the global
     * cluster will fail if the DB major version is past its end of standard support date.
     * </p>
     * </note>
     * <p>
     * This setting only applies to Aurora PostgreSQL-based global databases.
     * </p>
     * <p>
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     * Support, you can run the selected major engine version on your global cluster past the end of standard support
     * for that engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     * Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     */
    private String engineLifecycleSupport;
    /**
     * <p>
     * Specifies whether to enable deletion protection for the new global database cluster. The global database can't be
     * deleted when deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     * doesn't create a database in the global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * database name from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies whether to enable storage encryption for the new global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * setting from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier for this global database cluster. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     * </p>
     * <p>
     * If you provide a value for this parameter, don't specify values for the following settings because Amazon Aurora
     * uses the values from the specified source DB cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatabaseName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Engine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EngineVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageEncrypted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterIdentifier
     *        The Amazon Resource Name (ARN) to use as the primary cluster of the global database.</p>
     *        <p>
     *        If you provide a value for this parameter, don't specify values for the following settings because Amazon
     *        Aurora uses the values from the specified source DB cluster:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DatabaseName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Engine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EngineVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StorageEncrypted</code>
     *        </p>
     *        </li>
     */

    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     * </p>
     * <p>
     * If you provide a value for this parameter, don't specify values for the following settings because Amazon Aurora
     * uses the values from the specified source DB cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatabaseName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Engine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EngineVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageEncrypted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) to use as the primary cluster of the global database.</p>
     *         <p>
     *         If you provide a value for this parameter, don't specify values for the following settings because Amazon
     *         Aurora uses the values from the specified source DB cluster:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DatabaseName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Engine</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EngineVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StorageEncrypted</code>
     *         </p>
     *         </li>
     */

    public String getSourceDBClusterIdentifier() {
        return this.sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     * </p>
     * <p>
     * If you provide a value for this parameter, don't specify values for the following settings because Amazon Aurora
     * uses the values from the specified source DB cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatabaseName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Engine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EngineVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageEncrypted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterIdentifier
     *        The Amazon Resource Name (ARN) to use as the primary cluster of the global database.</p>
     *        <p>
     *        If you provide a value for this parameter, don't specify values for the following settings because Amazon
     *        Aurora uses the values from the specified source DB cluster:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DatabaseName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Engine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EngineVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StorageEncrypted</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        setSourceDBClusterIdentifier(sourceDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The database engine to use for this global database cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to use for this global database cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the engine of the source DB cluster.
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for this global database cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The database engine to use for this global database cluster.</p>
     *         <p>
     *         Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *         uses the engine of the source DB cluster.
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for this global database cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to use for this global database cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora-mysql | aurora-postgresql</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the engine of the source DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version to use for this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine version of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The engine version to use for this global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the engine version of the source DB cluster.
     *        </p>
     *        </li>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version to use for this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine version of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The engine version to use for this global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *         uses the engine version of the source DB cluster.
     *         </p>
     *         </li>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version to use for this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * engine version of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The engine version to use for this global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the engine version of the source DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The life cycle type for this global database cluster.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global cluster
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, creating the global
     * cluster will fail if the DB major version is past its end of standard support date.
     * </p>
     * </note>
     * <p>
     * This setting only applies to Aurora PostgreSQL-based global databases.
     * </p>
     * <p>
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     * Support, you can run the selected major engine version on your global cluster past the end of standard support
     * for that engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     * Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @param engineLifecycleSupport
     *        The life cycle type for this global database cluster.</p> <note>
     *        <p>
     *        By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global
     *        cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *        Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *        case, creating the global cluster will fail if the DB major version is past its end of standard support
     *        date.
     *        </p>
     *        </note>
     *        <p>
     *        This setting only applies to Aurora PostgreSQL-based global databases.
     *        </p>
     *        <p>
     *        You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     *        Support, you can run the selected major engine version on your global cluster past the end of standard
     *        support for that engine version. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     *        Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *        </p>
     *        <p>
     *        Default: <code>open-source-rds-extended-support</code>
     */

    public void setEngineLifecycleSupport(String engineLifecycleSupport) {
        this.engineLifecycleSupport = engineLifecycleSupport;
    }

    /**
     * <p>
     * The life cycle type for this global database cluster.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global cluster
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, creating the global
     * cluster will fail if the DB major version is past its end of standard support date.
     * </p>
     * </note>
     * <p>
     * This setting only applies to Aurora PostgreSQL-based global databases.
     * </p>
     * <p>
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     * Support, you can run the selected major engine version on your global cluster past the end of standard support
     * for that engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     * Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @return The life cycle type for this global database cluster.</p> <note>
     *         <p>
     *         By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global
     *         cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *         Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *         case, creating the global cluster will fail if the DB major version is past its end of standard support
     *         date.
     *         </p>
     *         </note>
     *         <p>
     *         This setting only applies to Aurora PostgreSQL-based global databases.
     *         </p>
     *         <p>
     *         You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS
     *         Extended Support, you can run the selected major engine version on your global cluster past the end of
     *         standard support for that engine version. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon
     *         RDS Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *         </p>
     *         <p>
     *         Default: <code>open-source-rds-extended-support</code>
     */

    public String getEngineLifecycleSupport() {
        return this.engineLifecycleSupport;
    }

    /**
     * <p>
     * The life cycle type for this global database cluster.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global cluster
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, creating the global
     * cluster will fail if the DB major version is past its end of standard support date.
     * </p>
     * </note>
     * <p>
     * This setting only applies to Aurora PostgreSQL-based global databases.
     * </p>
     * <p>
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     * Support, you can run the selected major engine version on your global cluster past the end of standard support
     * for that engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     * Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @param engineLifecycleSupport
     *        The life cycle type for this global database cluster.</p> <note>
     *        <p>
     *        By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your global
     *        cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *        Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *        case, creating the global cluster will fail if the DB major version is past its end of standard support
     *        date.
     *        </p>
     *        </note>
     *        <p>
     *        This setting only applies to Aurora PostgreSQL-based global databases.
     *        </p>
     *        <p>
     *        You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With RDS Extended
     *        Support, you can run the selected major engine version on your global cluster past the end of standard
     *        support for that engine version. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html">Using Amazon RDS
     *        Extended Support</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *        </p>
     *        <p>
     *        Default: <code>open-source-rds-extended-support</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withEngineLifecycleSupport(String engineLifecycleSupport) {
        setEngineLifecycleSupport(engineLifecycleSupport);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable deletion protection for the new global database cluster. The global database can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether to enable deletion protection for the new global database cluster. The global database
     *        can't be deleted when deletion protection is enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Specifies whether to enable deletion protection for the new global database cluster. The global database can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @return Specifies whether to enable deletion protection for the new global database cluster. The global database
     *         can't be deleted when deletion protection is enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Specifies whether to enable deletion protection for the new global database cluster. The global database can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether to enable deletion protection for the new global database cluster. The global database
     *        can't be deleted when deletion protection is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable deletion protection for the new global database cluster. The global database can't be
     * deleted when deletion protection is enabled.
     * </p>
     * 
     * @return Specifies whether to enable deletion protection for the new global database cluster. The global database
     *         can't be deleted when deletion protection is enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     * doesn't create a database in the global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * database name from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     *        doesn't create a database in the global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the database name from the source DB cluster.
     *        </p>
     *        </li>
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     * doesn't create a database in the global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * database name from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon
     *         Aurora doesn't create a database in the global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *         uses the database name from the source DB cluster.
     *         </p>
     *         </li>
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     * doesn't create a database in the global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * database name from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you don't specify a name, Amazon Aurora
     *        doesn't create a database in the global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the database name from the source DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable storage encryption for the new global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * setting from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageEncrypted
     *        Specifies whether to enable storage encryption for the new global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the setting from the source DB cluster.
     *        </p>
     *        </li>
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether to enable storage encryption for the new global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * setting from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to enable storage encryption for the new global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *         uses the setting from the source DB cluster.
     *         </p>
     *         </li>
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether to enable storage encryption for the new global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * setting from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageEncrypted
     *        Specifies whether to enable storage encryption for the new global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *        uses the setting from the source DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable storage encryption for the new global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora uses the
     * setting from the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to enable storage encryption for the new global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>SourceDBClusterIdentifier</code> is specified. In this case, Amazon Aurora
     *         uses the setting from the source DB cluster.
     *         </p>
     *         </li>
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: ").append(getSourceDBClusterIdentifier()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineLifecycleSupport() != null)
            sb.append("EngineLifecycleSupport: ").append(getEngineLifecycleSupport()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalClusterRequest == false)
            return false;
        CreateGlobalClusterRequest other = (CreateGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getSourceDBClusterIdentifier() == null ^ this.getSourceDBClusterIdentifier() == null)
            return false;
        if (other.getSourceDBClusterIdentifier() != null && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineLifecycleSupport() == null ^ this.getEngineLifecycleSupport() == null)
            return false;
        if (other.getEngineLifecycleSupport() != null && other.getEngineLifecycleSupport().equals(this.getEngineLifecycleSupport()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineLifecycleSupport() == null) ? 0 : getEngineLifecycleSupport().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public CreateGlobalClusterRequest clone() {
        return (CreateGlobalClusterRequest) super.clone();
    }

}
