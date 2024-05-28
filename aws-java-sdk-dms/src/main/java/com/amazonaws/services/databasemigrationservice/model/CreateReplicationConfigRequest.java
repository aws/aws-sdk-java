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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as part
     * of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as the value of
     * the <code>ReplicationConfigArn</code> option for other actions to identify both DMS Serverless replications and
     * replication configurations that you want those actions to operate on. For some actions, you can also use either
     * this unique identifier or a corresponding ARN in action filters to identify the specific replication and
     * replication configuration to operate on.
     * </p>
     */
    private String replicationConfigIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     */
    private ComputeConfig computeConfig;
    /**
     * <p>
     * The type of DMS Serverless replication to provision using this replication configuration.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"full-load"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"cdc"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"full-load-and-cdc"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String replicationType;
    /**
     * <p>
     * JSON table mappings for DMS Serverless replications that are provisioned using this replication configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     * > Specifying table selection and transformations rules using JSON</a>.
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * Optional JSON settings for DMS Serverless replications that are provisioned using this replication configuration.
     * For example, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     * > Change processing tuning settings</a>.
     * </p>
     */
    private String replicationSettings;
    /**
     * <p>
     * Optional JSON settings for specifying supplemental data. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental data
     * for task settings</a>.
     * </p>
     */
    private String supplementalSettings;
    /**
     * <p>
     * Optional unique value or name that you set for a given resource that can be used to construct an Amazon Resource
     * Name (ARN) for that resource. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     * Fine-grained access control using resource names and tags</a>.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * One or more optional tags associated with resources used by the DMS Serverless replication. For more information,
     * see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging resources in Database
     * Migration Service</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as part
     * of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as the value of
     * the <code>ReplicationConfigArn</code> option for other actions to identify both DMS Serverless replications and
     * replication configurations that you want those actions to operate on. For some actions, you can also use either
     * this unique identifier or a corresponding ARN in action filters to identify the specific replication and
     * replication configuration to operate on.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as
     *        part of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as
     *        the value of the <code>ReplicationConfigArn</code> option for other actions to identify both DMS
     *        Serverless replications and replication configurations that you want those actions to operate on. For some
     *        actions, you can also use either this unique identifier or a corresponding ARN in action filters to
     *        identify the specific replication and replication configuration to operate on.
     */

    public void setReplicationConfigIdentifier(String replicationConfigIdentifier) {
        this.replicationConfigIdentifier = replicationConfigIdentifier;
    }

    /**
     * <p>
     * A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as part
     * of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as the value of
     * the <code>ReplicationConfigArn</code> option for other actions to identify both DMS Serverless replications and
     * replication configurations that you want those actions to operate on. For some actions, you can also use either
     * this unique identifier or a corresponding ARN in action filters to identify the specific replication and
     * replication configuration to operate on.
     * </p>
     * 
     * @return A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned
     *         as part of the output from this action. You can then pass this output <code>ReplicationConfigArn</code>
     *         as the value of the <code>ReplicationConfigArn</code> option for other actions to identify both DMS
     *         Serverless replications and replication configurations that you want those actions to operate on. For
     *         some actions, you can also use either this unique identifier or a corresponding ARN in action filters to
     *         identify the specific replication and replication configuration to operate on.
     */

    public String getReplicationConfigIdentifier() {
        return this.replicationConfigIdentifier;
    }

    /**
     * <p>
     * A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as part
     * of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as the value of
     * the <code>ReplicationConfigArn</code> option for other actions to identify both DMS Serverless replications and
     * replication configurations that you want those actions to operate on. For some actions, you can also use either
     * this unique identifier or a corresponding ARN in action filters to identify the specific replication and
     * replication configuration to operate on.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        A unique identifier that you want to use to create a <code>ReplicationConfigArn</code> that is returned as
     *        part of the output from this action. You can then pass this output <code>ReplicationConfigArn</code> as
     *        the value of the <code>ReplicationConfigArn</code> option for other actions to identify both DMS
     *        Serverless replications and replication configurations that you want those actions to operate on. For some
     *        actions, you can also use either this unique identifier or a corresponding ARN in action filters to
     *        identify the specific replication and replication configuration to operate on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withReplicationConfigIdentifier(String replicationConfigIdentifier) {
        setReplicationConfigIdentifier(replicationConfigIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) of the source endpoint for this DMS Serverless replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @param computeConfig
     *        Configuration parameters for provisioning an DMS Serverless replication.
     */

    public void setComputeConfig(ComputeConfig computeConfig) {
        this.computeConfig = computeConfig;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @return Configuration parameters for provisioning an DMS Serverless replication.
     */

    public ComputeConfig getComputeConfig() {
        return this.computeConfig;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @param computeConfig
     *        Configuration parameters for provisioning an DMS Serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withComputeConfig(ComputeConfig computeConfig) {
        setComputeConfig(computeConfig);
        return this;
    }

    /**
     * <p>
     * The type of DMS Serverless replication to provision using this replication configuration.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"full-load"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"cdc"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"full-load-and-cdc"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationType
     *        The type of DMS Serverless replication to provision using this replication configuration.</p>
     *        <p>
     *        Possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"full-load"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"cdc"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"full-load-and-cdc"</code>
     *        </p>
     *        </li>
     * @see MigrationTypeValue
     */

    public void setReplicationType(String replicationType) {
        this.replicationType = replicationType;
    }

    /**
     * <p>
     * The type of DMS Serverless replication to provision using this replication configuration.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"full-load"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"cdc"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"full-load-and-cdc"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of DMS Serverless replication to provision using this replication configuration.</p>
     *         <p>
     *         Possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"full-load"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"cdc"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"full-load-and-cdc"</code>
     *         </p>
     *         </li>
     * @see MigrationTypeValue
     */

    public String getReplicationType() {
        return this.replicationType;
    }

    /**
     * <p>
     * The type of DMS Serverless replication to provision using this replication configuration.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"full-load"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"cdc"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"full-load-and-cdc"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationType
     *        The type of DMS Serverless replication to provision using this replication configuration.</p>
     *        <p>
     *        Possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"full-load"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"cdc"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"full-load-and-cdc"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public CreateReplicationConfigRequest withReplicationType(String replicationType) {
        setReplicationType(replicationType);
        return this;
    }

    /**
     * <p>
     * The type of DMS Serverless replication to provision using this replication configuration.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"full-load"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"cdc"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"full-load-and-cdc"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationType
     *        The type of DMS Serverless replication to provision using this replication configuration.</p>
     *        <p>
     *        Possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"full-load"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"cdc"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"full-load-and-cdc"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public CreateReplicationConfigRequest withReplicationType(MigrationTypeValue replicationType) {
        this.replicationType = replicationType.toString();
        return this;
    }

    /**
     * <p>
     * JSON table mappings for DMS Serverless replications that are provisioned using this replication configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     * > Specifying table selection and transformations rules using JSON</a>.
     * </p>
     * 
     * @param tableMappings
     *        JSON table mappings for DMS Serverless replications that are provisioned using this replication
     *        configuration. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     *        > Specifying table selection and transformations rules using JSON</a>.
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * JSON table mappings for DMS Serverless replications that are provisioned using this replication configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     * > Specifying table selection and transformations rules using JSON</a>.
     * </p>
     * 
     * @return JSON table mappings for DMS Serverless replications that are provisioned using this replication
     *         configuration. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     *         > Specifying table selection and transformations rules using JSON</a>.
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * JSON table mappings for DMS Serverless replications that are provisioned using this replication configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     * > Specifying table selection and transformations rules using JSON</a>.
     * </p>
     * 
     * @param tableMappings
     *        JSON table mappings for DMS Serverless replications that are provisioned using this replication
     *        configuration. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html"
     *        > Specifying table selection and transformations rules using JSON</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * Optional JSON settings for DMS Serverless replications that are provisioned using this replication configuration.
     * For example, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     * > Change processing tuning settings</a>.
     * </p>
     * 
     * @param replicationSettings
     *        Optional JSON settings for DMS Serverless replications that are provisioned using this replication
     *        configuration. For example, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     *        > Change processing tuning settings</a>.
     */

    public void setReplicationSettings(String replicationSettings) {
        this.replicationSettings = replicationSettings;
    }

    /**
     * <p>
     * Optional JSON settings for DMS Serverless replications that are provisioned using this replication configuration.
     * For example, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     * > Change processing tuning settings</a>.
     * </p>
     * 
     * @return Optional JSON settings for DMS Serverless replications that are provisioned using this replication
     *         configuration. For example, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     *         > Change processing tuning settings</a>.
     */

    public String getReplicationSettings() {
        return this.replicationSettings;
    }

    /**
     * <p>
     * Optional JSON settings for DMS Serverless replications that are provisioned using this replication configuration.
     * For example, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     * > Change processing tuning settings</a>.
     * </p>
     * 
     * @param replicationSettings
     *        Optional JSON settings for DMS Serverless replications that are provisioned using this replication
     *        configuration. For example, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html"
     *        > Change processing tuning settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withReplicationSettings(String replicationSettings) {
        setReplicationSettings(replicationSettings);
        return this;
    }

    /**
     * <p>
     * Optional JSON settings for specifying supplemental data. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental data
     * for task settings</a>.
     * </p>
     * 
     * @param supplementalSettings
     *        Optional JSON settings for specifying supplemental data. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental
     *        data for task settings</a>.
     */

    public void setSupplementalSettings(String supplementalSettings) {
        this.supplementalSettings = supplementalSettings;
    }

    /**
     * <p>
     * Optional JSON settings for specifying supplemental data. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental data
     * for task settings</a>.
     * </p>
     * 
     * @return Optional JSON settings for specifying supplemental data. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental
     *         data for task settings</a>.
     */

    public String getSupplementalSettings() {
        return this.supplementalSettings;
    }

    /**
     * <p>
     * Optional JSON settings for specifying supplemental data. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental data
     * for task settings</a>.
     * </p>
     * 
     * @param supplementalSettings
     *        Optional JSON settings for specifying supplemental data. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"> Specifying supplemental
     *        data for task settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withSupplementalSettings(String supplementalSettings) {
        setSupplementalSettings(supplementalSettings);
        return this;
    }

    /**
     * <p>
     * Optional unique value or name that you set for a given resource that can be used to construct an Amazon Resource
     * Name (ARN) for that resource. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     * Fine-grained access control using resource names and tags</a>.
     * </p>
     * 
     * @param resourceIdentifier
     *        Optional unique value or name that you set for a given resource that can be used to construct an Amazon
     *        Resource Name (ARN) for that resource. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     *        Fine-grained access control using resource names and tags</a>.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Optional unique value or name that you set for a given resource that can be used to construct an Amazon Resource
     * Name (ARN) for that resource. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     * Fine-grained access control using resource names and tags</a>.
     * </p>
     * 
     * @return Optional unique value or name that you set for a given resource that can be used to construct an Amazon
     *         Resource Name (ARN) for that resource. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     *         Fine-grained access control using resource names and tags</a>.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Optional unique value or name that you set for a given resource that can be used to construct an Amazon Resource
     * Name (ARN) for that resource. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     * Fine-grained access control using resource names and tags</a>.
     * </p>
     * 
     * @param resourceIdentifier
     *        Optional unique value or name that you set for a given resource that can be used to construct an Amazon
     *        Resource Name (ARN) for that resource. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess">
     *        Fine-grained access control using resource names and tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * One or more optional tags associated with resources used by the DMS Serverless replication. For more information,
     * see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging resources in Database
     * Migration Service</a>.
     * </p>
     * 
     * @return One or more optional tags associated with resources used by the DMS Serverless replication. For more
     *         information, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging
     *         resources in Database Migration Service</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more optional tags associated with resources used by the DMS Serverless replication. For more information,
     * see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging resources in Database
     * Migration Service</a>.
     * </p>
     * 
     * @param tags
     *        One or more optional tags associated with resources used by the DMS Serverless replication. For more
     *        information, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging
     *        resources in Database Migration Service</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more optional tags associated with resources used by the DMS Serverless replication. For more information,
     * see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging resources in Database
     * Migration Service</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more optional tags associated with resources used by the DMS Serverless replication. For more
     *        information, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging
     *        resources in Database Migration Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more optional tags associated with resources used by the DMS Serverless replication. For more information,
     * see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging resources in Database
     * Migration Service</a>.
     * </p>
     * 
     * @param tags
     *        One or more optional tags associated with resources used by the DMS Serverless replication. For more
     *        information, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html"> Tagging
     *        resources in Database Migration Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getReplicationConfigIdentifier() != null)
            sb.append("ReplicationConfigIdentifier: ").append(getReplicationConfigIdentifier()).append(",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: ").append(getSourceEndpointArn()).append(",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: ").append(getTargetEndpointArn()).append(",");
        if (getComputeConfig() != null)
            sb.append("ComputeConfig: ").append(getComputeConfig()).append(",");
        if (getReplicationType() != null)
            sb.append("ReplicationType: ").append(getReplicationType()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getReplicationSettings() != null)
            sb.append("ReplicationSettings: ").append(getReplicationSettings()).append(",");
        if (getSupplementalSettings() != null)
            sb.append("SupplementalSettings: ").append(getSupplementalSettings()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
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

        if (obj instanceof CreateReplicationConfigRequest == false)
            return false;
        CreateReplicationConfigRequest other = (CreateReplicationConfigRequest) obj;
        if (other.getReplicationConfigIdentifier() == null ^ this.getReplicationConfigIdentifier() == null)
            return false;
        if (other.getReplicationConfigIdentifier() != null && other.getReplicationConfigIdentifier().equals(this.getReplicationConfigIdentifier()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        if (other.getComputeConfig() == null ^ this.getComputeConfig() == null)
            return false;
        if (other.getComputeConfig() != null && other.getComputeConfig().equals(this.getComputeConfig()) == false)
            return false;
        if (other.getReplicationType() == null ^ this.getReplicationType() == null)
            return false;
        if (other.getReplicationType() != null && other.getReplicationType().equals(this.getReplicationType()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getReplicationSettings() == null ^ this.getReplicationSettings() == null)
            return false;
        if (other.getReplicationSettings() != null && other.getReplicationSettings().equals(this.getReplicationSettings()) == false)
            return false;
        if (other.getSupplementalSettings() == null ^ this.getSupplementalSettings() == null)
            return false;
        if (other.getSupplementalSettings() != null && other.getSupplementalSettings().equals(this.getSupplementalSettings()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getReplicationConfigIdentifier() == null) ? 0 : getReplicationConfigIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getComputeConfig() == null) ? 0 : getComputeConfig().hashCode());
        hashCode = prime * hashCode + ((getReplicationType() == null) ? 0 : getReplicationType().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getReplicationSettings() == null) ? 0 : getReplicationSettings().hashCode());
        hashCode = prime * hashCode + ((getSupplementalSettings() == null) ? 0 : getSupplementalSettings().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationConfigRequest clone() {
        return (CreateReplicationConfigRequest) super.clone();
    }

}
