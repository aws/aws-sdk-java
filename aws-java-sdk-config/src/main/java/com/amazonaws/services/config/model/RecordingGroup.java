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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies which resource types Config records for configuration changes. By default, Config records configuration
 * changes for all current and future supported resource types in the Amazon Web Services Region where you have enabled
 * Config, excluding the global IAM resource types: IAM users, groups, roles, and customer managed policies.
 * </p>
 * <p>
 * In the recording group, you specify whether you want to record all supported current and future supported resource
 * types or to include or exclude specific resources types. For a list of supported resource types, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported Resource Types</a> in the <i>Config developer guide</i>.
 * </p>
 * <p>
 * If you don't want Config to record all current and future supported resource types (excluding the global IAM resource
 * types), use one of the following recording strategies:
 * </p>
 * <ol>
 * <li>
 * <p>
 * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>), or
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you use the recording strategy to <b>Record all current and future resource types</b> (
 * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>), you can use the flag <code>includeGlobalResourceTypes</code> to include
 * the global IAM resource types in your recording.
 * </p>
 * <important>
 * <p>
 * <b>Aurora global clusters are recorded in all enabled Regions</b>
 * </p>
 * <p>
 * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
 * configuration recorder is enabled.
 * </p>
 * <p>
 * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use the
 * <code>EXCLUSION_BY_RESOURCE_TYPES</code> or <code>INCLUSION_BY_RESOURCE_TYPES</code> recording strategy.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RecordingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Config records configuration changes for all supported resource types, excluding the global IAM
     * resource types.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, when Config adds support for a new resource type, Config starts
     * recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, or to
     * exclude in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web Services Region
     * where you set up Config.
     * </p>
     * </note>
     */
    private Boolean allSupported;
    /**
     * <p>
     * This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     * customer managed policies. These global IAM resource types can only be recorded by Config in Regions where Config
     * was available before February 2022. You cannot be record the global IAM resouce types in Regions supported by
     * Config after February 2022. This list where you cannot record the global IAM resource types includes the
     * following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <b>Aurora global clusters are recorded in all enabled Regions</b>
     * </p>
     * <p>
     * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
     * configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set<code>false</code>. The
     * <code>includeGlobalResourceTypes</code> option is a bundle which only applies to IAM users, groups, roles, and
     * customer managed policies.
     * </p>
     * <p>
     * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     * following recording strategies:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>),
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     * >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     * </p>
     * </important> <important>
     * <p>
     * <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field has no impact on the <code>EXCLUSION_BY_RESOURCE_TYPES</code>
     * recording strategy. This means that the global IAM resource types (IAM users, groups, roles, and customer managed
     * policies) will not be automatically added as exclusions for <code>exclusionByResourceTypes</code> when
     * <code>includeGlobalResourceTypes</code> is set to <code>false</code>.
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field should only be used to modify the <code>AllSupported</code>
     * field, as the default for the <code>AllSupported</code> field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM resource types when
     * <code>AllSupported</code> is set to <code>true</code>, make sure to set <code>includeGlobalResourceTypes</code>
     * to <code>true</code>.
     * </p>
     * <p>
     * To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, you
     * need to manually add them to the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </important> <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you set this field to <code>false</code> but list global IAM resource types in the <code>resourceTypes</code>
     * field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, Config
     * will still record configuration changes for those specified resource types <i>regardless</i> of if you set the
     * <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * <p>
     * If you do not want to record configuration changes to the global IAM resource types (IAM users, groups, roles,
     * and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field in addition to
     * setting the <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * </note>
     */
    private Boolean includeGlobalResourceTypes;
    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * An object that specifies how Config excludes resource types from being recorded by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * <b>Required fields</b>
     * </p>
     * <p>
     * To use this option, you must set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * </note>
     */
    private ExclusionByResourceTypes exclusionByResourceTypes;
    /**
     * <p>
     * An object that specifies the recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types,
     * excluding the global IAM resource types. You also must set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only the resource types you
     * specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types
     * except the resource types that you specify to exclude from being recorded in the <code>resourceTypes</code> field
     * of <a href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html">
     * ExclusionByResourceTypes</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you list resource types in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     * <code>exclusionByResourceTypes</code> field will override other properties in the request.
     * </p>
     * <p>
     * For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types will
     * still be automatically recorded in this option unless those resource types are specifically listed as exclusions
     * in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Global resources types and the resource exclusion recording strategy</b>
     * </p>
     * <p>
     * By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config adds
     * support for a new resource type in the Region where you set up the configuration recorder, including global
     * resource types, Config starts recording resources of that type automatically.
     * </p>
     * <p>
     * Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded automatically in
     * all supported Config Regions were the configuration recorder is enabled.
     * </p>
     * <p>
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up the
     * configuration recorder if that is a Region where Config was available before February 2022. You cannot be record
     * the global IAM resouce types in Regions supported by Config after February 2022. This list where you cannot
     * record the global IAM resource types includes the following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private RecordingStrategy recordingStrategy;

    /**
     * <p>
     * Specifies whether Config records configuration changes for all supported resource types, excluding the global IAM
     * resource types.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, when Config adds support for a new resource type, Config starts
     * recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, or to
     * exclude in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web Services Region
     * where you set up Config.
     * </p>
     * </note>
     * 
     * @param allSupported
     *        Specifies whether Config records configuration changes for all supported resource types, excluding the
     *        global IAM resource types.</p>
     *        <p>
     *        If you set this field to <code>true</code>, when Config adds support for a new resource type, Config
     *        starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *        or to exclude in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web
     *        Services Region where you set up Config.
     *        </p>
     */

    public void setAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
    }

    /**
     * <p>
     * Specifies whether Config records configuration changes for all supported resource types, excluding the global IAM
     * resource types.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, when Config adds support for a new resource type, Config starts
     * recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, or to
     * exclude in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web Services Region
     * where you set up Config.
     * </p>
     * </note>
     * 
     * @return Specifies whether Config records configuration changes for all supported resource types, excluding the
     *         global IAM resource types.</p>
     *         <p>
     *         If you set this field to <code>true</code>, when Config adds support for a new resource type, Config
     *         starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     *         <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *         or to exclude in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *         >ExclusionByResourceTypes</a>.
     *         </p>
     *         <note>
     *         <p>
     *         <b>Region availability</b>
     *         </p>
     *         <p>
     *         Check <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *         >Resource Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web
     *         Services Region where you set up Config.
     *         </p>
     */

    public Boolean getAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * Specifies whether Config records configuration changes for all supported resource types, excluding the global IAM
     * resource types.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, when Config adds support for a new resource type, Config starts
     * recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, or to
     * exclude in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web Services Region
     * where you set up Config.
     * </p>
     * </note>
     * 
     * @param allSupported
     *        Specifies whether Config records configuration changes for all supported resource types, excluding the
     *        global IAM resource types.</p>
     *        <p>
     *        If you set this field to <code>true</code>, when Config adds support for a new resource type, Config
     *        starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *        or to exclude in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web
     *        Services Region where you set up Config.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withAllSupported(Boolean allSupported) {
        setAllSupported(allSupported);
        return this;
    }

    /**
     * <p>
     * Specifies whether Config records configuration changes for all supported resource types, excluding the global IAM
     * resource types.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, when Config adds support for a new resource type, Config starts
     * recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, or to
     * exclude in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web Services Region
     * where you set up Config.
     * </p>
     * </note>
     * 
     * @return Specifies whether Config records configuration changes for all supported resource types, excluding the
     *         global IAM resource types.</p>
     *         <p>
     *         If you set this field to <code>true</code>, when Config adds support for a new resource type, Config
     *         starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         If you set this field to <code>true</code>, you cannot enumerate specific resource types to record in the
     *         <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *         or to exclude in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *         >ExclusionByResourceTypes</a>.
     *         </p>
     *         <note>
     *         <p>
     *         <b>Region availability</b>
     *         </p>
     *         <p>
     *         Check <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *         >Resource Coverage by Region Availability</a> to see if a resource type is supported in the Amazon Web
     *         Services Region where you set up Config.
     *         </p>
     */

    public Boolean isAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     * customer managed policies. These global IAM resource types can only be recorded by Config in Regions where Config
     * was available before February 2022. You cannot be record the global IAM resouce types in Regions supported by
     * Config after February 2022. This list where you cannot record the global IAM resource types includes the
     * following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <b>Aurora global clusters are recorded in all enabled Regions</b>
     * </p>
     * <p>
     * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
     * configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set<code>false</code>. The
     * <code>includeGlobalResourceTypes</code> option is a bundle which only applies to IAM users, groups, roles, and
     * customer managed policies.
     * </p>
     * <p>
     * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     * following recording strategies:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>),
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     * >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     * </p>
     * </important> <important>
     * <p>
     * <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field has no impact on the <code>EXCLUSION_BY_RESOURCE_TYPES</code>
     * recording strategy. This means that the global IAM resource types (IAM users, groups, roles, and customer managed
     * policies) will not be automatically added as exclusions for <code>exclusionByResourceTypes</code> when
     * <code>includeGlobalResourceTypes</code> is set to <code>false</code>.
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field should only be used to modify the <code>AllSupported</code>
     * field, as the default for the <code>AllSupported</code> field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM resource types when
     * <code>AllSupported</code> is set to <code>true</code>, make sure to set <code>includeGlobalResourceTypes</code>
     * to <code>true</code>.
     * </p>
     * <p>
     * To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, you
     * need to manually add them to the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </important> <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you set this field to <code>false</code> but list global IAM resource types in the <code>resourceTypes</code>
     * field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, Config
     * will still record configuration changes for those specified resource types <i>regardless</i> of if you set the
     * <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * <p>
     * If you do not want to record configuration changes to the global IAM resource types (IAM users, groups, roles,
     * and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field in addition to
     * setting the <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * </note>
     * 
     * @param includeGlobalResourceTypes
     *        This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     *        customer managed policies. These global IAM resource types can only be recorded by Config in Regions where
     *        Config was available before February 2022. You cannot be record the global IAM resouce types in Regions
     *        supported by Config after February 2022. This list where you cannot record the global IAM resource types
     *        includes the following Regions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Asia Pacific (Hyderabad)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Melbourne)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canada West (Calgary)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Spain)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Zurich)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Israel (Tel Aviv)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Middle East (UAE)
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        <b>Aurora global clusters are recorded in all enabled Regions</b>
     *        </p>
     *        <p>
     *        The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions
     *        where the configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set
     *        <code>false</code>. The <code>includeGlobalResourceTypes</code> option is a bundle which only applies to
     *        IAM users, groups, roles, and customer managed policies.
     *        </p>
     *        <p>
     *        If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     *        following recording strategies:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        <b>Record all current and future resource types with exclusions</b> (
     *        <code>EXCLUSION_BY_RESOURCE_TYPES</code>), or
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     *        >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     *        </p>
     *        </important> <important>
     *        <p>
     *        <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     *        </p>
     *        <p>
     *        The <code>includeGlobalResourceTypes</code> field has no impact on the
     *        <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy. This means that the global IAM resource types
     *        (IAM users, groups, roles, and customer managed policies) will not be automatically added as exclusions
     *        for <code>exclusionByResourceTypes</code> when <code>includeGlobalResourceTypes</code> is set to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        The <code>includeGlobalResourceTypes</code> field should only be used to modify the
     *        <code>AllSupported</code> field, as the default for the <code>AllSupported</code> field is to record
     *        configuration changes for all supported resource types excluding the global IAM resource types. To include
     *        the global IAM resource types when <code>AllSupported</code> is set to <code>true</code>, make sure to set
     *        <code>includeGlobalResourceTypes</code> to <code>true</code>.
     *        </p>
     *        <p>
     *        To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording
     *        strategy, you need to manually add them to the <code>resourceTypes</code> field of
     *        <code>exclusionByResourceTypes</code>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Overriding fields</b>
     *        </p>
     *        <p>
     *        If you set this field to <code>false</code> but list global IAM resource types in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *        Config will still record configuration changes for those specified resource types <i>regardless</i> of if
     *        you set the <code>includeGlobalResourceTypes</code> field to false.
     *        </p>
     *        <p>
     *        If you do not want to record configuration changes to the global IAM resource types (IAM users, groups,
     *        roles, and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field
     *        in addition to setting the <code>includeGlobalResourceTypes</code> field to false.
     *        </p>
     */

    public void setIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
    }

    /**
     * <p>
     * This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     * customer managed policies. These global IAM resource types can only be recorded by Config in Regions where Config
     * was available before February 2022. You cannot be record the global IAM resouce types in Regions supported by
     * Config after February 2022. This list where you cannot record the global IAM resource types includes the
     * following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <b>Aurora global clusters are recorded in all enabled Regions</b>
     * </p>
     * <p>
     * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
     * configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set<code>false</code>. The
     * <code>includeGlobalResourceTypes</code> option is a bundle which only applies to IAM users, groups, roles, and
     * customer managed policies.
     * </p>
     * <p>
     * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     * following recording strategies:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>),
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     * >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     * </p>
     * </important> <important>
     * <p>
     * <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field has no impact on the <code>EXCLUSION_BY_RESOURCE_TYPES</code>
     * recording strategy. This means that the global IAM resource types (IAM users, groups, roles, and customer managed
     * policies) will not be automatically added as exclusions for <code>exclusionByResourceTypes</code> when
     * <code>includeGlobalResourceTypes</code> is set to <code>false</code>.
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field should only be used to modify the <code>AllSupported</code>
     * field, as the default for the <code>AllSupported</code> field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM resource types when
     * <code>AllSupported</code> is set to <code>true</code>, make sure to set <code>includeGlobalResourceTypes</code>
     * to <code>true</code>.
     * </p>
     * <p>
     * To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, you
     * need to manually add them to the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </important> <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you set this field to <code>false</code> but list global IAM resource types in the <code>resourceTypes</code>
     * field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, Config
     * will still record configuration changes for those specified resource types <i>regardless</i> of if you set the
     * <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * <p>
     * If you do not want to record configuration changes to the global IAM resource types (IAM users, groups, roles,
     * and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field in addition to
     * setting the <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * </note>
     * 
     * @return This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles,
     *         and customer managed policies. These global IAM resource types can only be recorded by Config in Regions
     *         where Config was available before February 2022. You cannot be record the global IAM resouce types in
     *         Regions supported by Config after February 2022. This list where you cannot record the global IAM
     *         resource types includes the following Regions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Asia Pacific (Hyderabad)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Melbourne)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canada West (Calgary)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Spain)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Zurich)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Israel (Tel Aviv)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Middle East (UAE)
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         <b>Aurora global clusters are recorded in all enabled Regions</b>
     *         </p>
     *         <p>
     *         The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions
     *         where the configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set
     *         <code>false</code>. The <code>includeGlobalResourceTypes</code> option is a bundle which only applies to
     *         IAM users, groups, roles, and customer managed policies.
     *         </p>
     *         <p>
     *         If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     *         following recording strategies:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         <b>Record all current and future resource types with exclusions</b> (
     *         <code>EXCLUSION_BY_RESOURCE_TYPES</code>), or
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     *         >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     *         </p>
     *         </important> <important>
     *         <p>
     *         <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     *         </p>
     *         <p>
     *         The <code>includeGlobalResourceTypes</code> field has no impact on the
     *         <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy. This means that the global IAM resource
     *         types (IAM users, groups, roles, and customer managed policies) will not be automatically added as
     *         exclusions for <code>exclusionByResourceTypes</code> when <code>includeGlobalResourceTypes</code> is set
     *         to <code>false</code>.
     *         </p>
     *         <p>
     *         The <code>includeGlobalResourceTypes</code> field should only be used to modify the
     *         <code>AllSupported</code> field, as the default for the <code>AllSupported</code> field is to record
     *         configuration changes for all supported resource types excluding the global IAM resource types. To
     *         include the global IAM resource types when <code>AllSupported</code> is set to <code>true</code>, make
     *         sure to set <code>includeGlobalResourceTypes</code> to <code>true</code>.
     *         </p>
     *         <p>
     *         To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording
     *         strategy, you need to manually add them to the <code>resourceTypes</code> field of
     *         <code>exclusionByResourceTypes</code>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         <b>Required and optional fields</b>
     *         </p>
     *         <p>
     *         Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Overriding fields</b>
     *         </p>
     *         <p>
     *         If you set this field to <code>false</code> but list global IAM resource types in the
     *         <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *         Config will still record configuration changes for those specified resource types <i>regardless</i> of if
     *         you set the <code>includeGlobalResourceTypes</code> field to false.
     *         </p>
     *         <p>
     *         If you do not want to record configuration changes to the global IAM resource types (IAM users, groups,
     *         roles, and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field
     *         in addition to setting the <code>includeGlobalResourceTypes</code> field to false.
     *         </p>
     */

    public Boolean getIncludeGlobalResourceTypes() {
        return this.includeGlobalResourceTypes;
    }

    /**
     * <p>
     * This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     * customer managed policies. These global IAM resource types can only be recorded by Config in Regions where Config
     * was available before February 2022. You cannot be record the global IAM resouce types in Regions supported by
     * Config after February 2022. This list where you cannot record the global IAM resource types includes the
     * following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <b>Aurora global clusters are recorded in all enabled Regions</b>
     * </p>
     * <p>
     * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
     * configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set<code>false</code>. The
     * <code>includeGlobalResourceTypes</code> option is a bundle which only applies to IAM users, groups, roles, and
     * customer managed policies.
     * </p>
     * <p>
     * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     * following recording strategies:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>),
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     * >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     * </p>
     * </important> <important>
     * <p>
     * <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field has no impact on the <code>EXCLUSION_BY_RESOURCE_TYPES</code>
     * recording strategy. This means that the global IAM resource types (IAM users, groups, roles, and customer managed
     * policies) will not be automatically added as exclusions for <code>exclusionByResourceTypes</code> when
     * <code>includeGlobalResourceTypes</code> is set to <code>false</code>.
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field should only be used to modify the <code>AllSupported</code>
     * field, as the default for the <code>AllSupported</code> field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM resource types when
     * <code>AllSupported</code> is set to <code>true</code>, make sure to set <code>includeGlobalResourceTypes</code>
     * to <code>true</code>.
     * </p>
     * <p>
     * To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, you
     * need to manually add them to the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </important> <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you set this field to <code>false</code> but list global IAM resource types in the <code>resourceTypes</code>
     * field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, Config
     * will still record configuration changes for those specified resource types <i>regardless</i> of if you set the
     * <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * <p>
     * If you do not want to record configuration changes to the global IAM resource types (IAM users, groups, roles,
     * and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field in addition to
     * setting the <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * </note>
     * 
     * @param includeGlobalResourceTypes
     *        This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     *        customer managed policies. These global IAM resource types can only be recorded by Config in Regions where
     *        Config was available before February 2022. You cannot be record the global IAM resouce types in Regions
     *        supported by Config after February 2022. This list where you cannot record the global IAM resource types
     *        includes the following Regions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Asia Pacific (Hyderabad)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Melbourne)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canada West (Calgary)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Spain)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Zurich)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Israel (Tel Aviv)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Middle East (UAE)
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        <b>Aurora global clusters are recorded in all enabled Regions</b>
     *        </p>
     *        <p>
     *        The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions
     *        where the configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set
     *        <code>false</code>. The <code>includeGlobalResourceTypes</code> option is a bundle which only applies to
     *        IAM users, groups, roles, and customer managed policies.
     *        </p>
     *        <p>
     *        If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     *        following recording strategies:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        <b>Record all current and future resource types with exclusions</b> (
     *        <code>EXCLUSION_BY_RESOURCE_TYPES</code>), or
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     *        >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     *        </p>
     *        </important> <important>
     *        <p>
     *        <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     *        </p>
     *        <p>
     *        The <code>includeGlobalResourceTypes</code> field has no impact on the
     *        <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy. This means that the global IAM resource types
     *        (IAM users, groups, roles, and customer managed policies) will not be automatically added as exclusions
     *        for <code>exclusionByResourceTypes</code> when <code>includeGlobalResourceTypes</code> is set to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        The <code>includeGlobalResourceTypes</code> field should only be used to modify the
     *        <code>AllSupported</code> field, as the default for the <code>AllSupported</code> field is to record
     *        configuration changes for all supported resource types excluding the global IAM resource types. To include
     *        the global IAM resource types when <code>AllSupported</code> is set to <code>true</code>, make sure to set
     *        <code>includeGlobalResourceTypes</code> to <code>true</code>.
     *        </p>
     *        <p>
     *        To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording
     *        strategy, you need to manually add them to the <code>resourceTypes</code> field of
     *        <code>exclusionByResourceTypes</code>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Overriding fields</b>
     *        </p>
     *        <p>
     *        If you set this field to <code>false</code> but list global IAM resource types in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *        Config will still record configuration changes for those specified resource types <i>regardless</i> of if
     *        you set the <code>includeGlobalResourceTypes</code> field to false.
     *        </p>
     *        <p>
     *        If you do not want to record configuration changes to the global IAM resource types (IAM users, groups,
     *        roles, and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field
     *        in addition to setting the <code>includeGlobalResourceTypes</code> field to false.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        setIncludeGlobalResourceTypes(includeGlobalResourceTypes);
        return this;
    }

    /**
     * <p>
     * This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles, and
     * customer managed policies. These global IAM resource types can only be recorded by Config in Regions where Config
     * was available before February 2022. You cannot be record the global IAM resouce types in Regions supported by
     * Config after February 2022. This list where you cannot record the global IAM resource types includes the
     * following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <b>Aurora global clusters are recorded in all enabled Regions</b>
     * </p>
     * <p>
     * The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions where the
     * configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set<code>false</code>. The
     * <code>includeGlobalResourceTypes</code> option is a bundle which only applies to IAM users, groups, roles, and
     * customer managed policies.
     * </p>
     * <p>
     * If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     * following recording strategies:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <b>Record all current and future resource types with exclusions</b> (<code>EXCLUSION_BY_RESOURCE_TYPES</code>),
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     * >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     * </p>
     * </important> <important>
     * <p>
     * <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field has no impact on the <code>EXCLUSION_BY_RESOURCE_TYPES</code>
     * recording strategy. This means that the global IAM resource types (IAM users, groups, roles, and customer managed
     * policies) will not be automatically added as exclusions for <code>exclusionByResourceTypes</code> when
     * <code>includeGlobalResourceTypes</code> is set to <code>false</code>.
     * </p>
     * <p>
     * The <code>includeGlobalResourceTypes</code> field should only be used to modify the <code>AllSupported</code>
     * field, as the default for the <code>AllSupported</code> field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM resource types when
     * <code>AllSupported</code> is set to <code>true</code>, make sure to set <code>includeGlobalResourceTypes</code>
     * to <code>true</code>.
     * </p>
     * <p>
     * To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, you
     * need to manually add them to the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </important> <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you set this field to <code>false</code> but list global IAM resource types in the <code>resourceTypes</code>
     * field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>, Config
     * will still record configuration changes for those specified resource types <i>regardless</i> of if you set the
     * <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * <p>
     * If you do not want to record configuration changes to the global IAM resource types (IAM users, groups, roles,
     * and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field in addition to
     * setting the <code>includeGlobalResourceTypes</code> field to false.
     * </p>
     * </note>
     * 
     * @return This option is a bundle which only applies to the global IAM resource types: IAM users, groups, roles,
     *         and customer managed policies. These global IAM resource types can only be recorded by Config in Regions
     *         where Config was available before February 2022. You cannot be record the global IAM resouce types in
     *         Regions supported by Config after February 2022. This list where you cannot record the global IAM
     *         resource types includes the following Regions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Asia Pacific (Hyderabad)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Melbourne)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canada West (Calgary)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Spain)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Zurich)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Israel (Tel Aviv)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Middle East (UAE)
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         <b>Aurora global clusters are recorded in all enabled Regions</b>
     *         </p>
     *         <p>
     *         The <code>AWS::RDS::GlobalCluster</code> resource type will be recorded in all supported Config Regions
     *         where the configuration recorder is enabled, even if <code>includeGlobalResourceTypes</code> is set
     *         <code>false</code>. The <code>includeGlobalResourceTypes</code> option is a bundle which only applies to
     *         IAM users, groups, roles, and customer managed policies.
     *         </p>
     *         <p>
     *         If you do not want to record <code>AWS::RDS::GlobalCluster</code> in all enabled Regions, use one of the
     *         following recording strategies:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         <b>Record all current and future resource types with exclusions</b> (
     *         <code>EXCLUSION_BY_RESOURCE_TYPES</code>), or
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Record specific resource types</b> (<code>INCLUSION_BY_RESOURCE_TYPES</code>).
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all"
     *         >Selecting Which Resources are Recorded</a> in the <i>Config developer guide</i>.
     *         </p>
     *         </important> <important>
     *         <p>
     *         <b>includeGlobalResourceTypes and the exclusion recording strategy</b>
     *         </p>
     *         <p>
     *         The <code>includeGlobalResourceTypes</code> field has no impact on the
     *         <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy. This means that the global IAM resource
     *         types (IAM users, groups, roles, and customer managed policies) will not be automatically added as
     *         exclusions for <code>exclusionByResourceTypes</code> when <code>includeGlobalResourceTypes</code> is set
     *         to <code>false</code>.
     *         </p>
     *         <p>
     *         The <code>includeGlobalResourceTypes</code> field should only be used to modify the
     *         <code>AllSupported</code> field, as the default for the <code>AllSupported</code> field is to record
     *         configuration changes for all supported resource types excluding the global IAM resource types. To
     *         include the global IAM resource types when <code>AllSupported</code> is set to <code>true</code>, make
     *         sure to set <code>includeGlobalResourceTypes</code> to <code>true</code>.
     *         </p>
     *         <p>
     *         To exclude the global IAM resource types for the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording
     *         strategy, you need to manually add them to the <code>resourceTypes</code> field of
     *         <code>exclusionByResourceTypes</code>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         <b>Required and optional fields</b>
     *         </p>
     *         <p>
     *         Before you set this field to <code>true</code>, set the <code>allSupported</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>. Optionally, you can set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Overriding fields</b>
     *         </p>
     *         <p>
     *         If you set this field to <code>false</code> but list global IAM resource types in the
     *         <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>,
     *         Config will still record configuration changes for those specified resource types <i>regardless</i> of if
     *         you set the <code>includeGlobalResourceTypes</code> field to false.
     *         </p>
     *         <p>
     *         If you do not want to record configuration changes to the global IAM resource types (IAM users, groups,
     *         roles, and customer managed policies), make sure to not list them in the <code>resourceTypes</code> field
     *         in addition to setting the <code>includeGlobalResourceTypes</code> field to false.
     *         </p>
     */

    public Boolean isIncludeGlobalResourceTypes() {
        return this.includeGlobalResourceTypes;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     * 
     * @return A comma-separated list that specifies which resource types Config records.</p>
     *         <p>
     *         For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a
     *         href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <b>Required and optional fields</b>
     *         </p>
     *         <p>
     *         Optionally, you can set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     *         </p>
     *         <p>
     *         To record all configuration changes, set the <code>allSupported</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>, and either omit this field or don't specify any resource types in this field. If
     *         you set the <code>allSupported</code> field to <code>false</code> and specify values for
     *         <code>resourceTypes</code>, when Config adds support for a new type of resource, it will not record
     *         resources of that type unless you manually add that type to your recording group.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Region availability</b>
     *         </p>
     *         <p>
     *         Before specifying a resource type for Config to track, check <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *         >Resource Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web
     *         Services Region where you set up Config. If a resource type is supported by Config in at least one
     *         Region, you can enable the recording of that resource type in all Regions supported by Config, even if
     *         the specified resource type is not supported in the Amazon Web Services Region where you set up Config.
     *         </p>
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config records.</p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     *        <p>
     *        To record all configuration changes, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>, and either omit this field or don't specify any resource types in this field. If you
     *        set the <code>allSupported</code> field to <code>false</code> and specify values for
     *        <code>resourceTypes</code>, when Config adds support for a new type of resource, it will not record
     *        resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Before specifying a resource type for Config to track, check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web
     *        Services Region where you set up Config. If a resource type is supported by Config in at least one Region,
     *        you can enable the recording of that resource type in all Regions supported by Config, even if the
     *        specified resource type is not supported in the Amazon Web Services Region where you set up Config.
     *        </p>
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config records.</p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     *        <p>
     *        To record all configuration changes, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>, and either omit this field or don't specify any resource types in this field. If you
     *        set the <code>allSupported</code> field to <code>false</code> and specify values for
     *        <code>resourceTypes</code>, when Config adds support for a new type of resource, it will not record
     *        resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Before specifying a resource type for Config to track, check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web
     *        Services Region where you set up Config. If a resource type is supported by Config in at least one Region,
     *        you can enable the recording of that resource type in all Regions supported by Config, even if the
     *        specified resource type is not supported in the Amazon Web Services Region where you set up Config.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config records.</p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     *        <p>
     *        To record all configuration changes, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>, and either omit this field or don't specify any resource types in this field. If you
     *        set the <code>allSupported</code> field to <code>false</code> and specify values for
     *        <code>resourceTypes</code>, when Config adds support for a new type of resource, it will not record
     *        resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Before specifying a resource type for Config to track, check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web
     *        Services Region where you set up Config. If a resource type is supported by Config in at least one Region,
     *        you can enable the recording of that resource type in all Regions supported by Config, even if the
     *        specified resource type is not supported in the Amazon Web Services Region where you set up Config.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config records.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * Optionally, you can set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * <p>
     * To record all configuration changes, set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>, and either omit this field or don't specify any resource types in this field. If you set the
     * <code>allSupported</code> field to <code>false</code> and specify values for <code>resourceTypes</code>, when
     * Config adds support for a new type of resource, it will not record resources of that type unless you manually add
     * that type to your recording group.
     * </p>
     * </note> <note>
     * <p>
     * <b>Region availability</b>
     * </p>
     * <p>
     * Before specifying a resource type for Config to track, check <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html">Resource
     * Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web Services Region
     * where you set up Config. If a resource type is supported by Config in at least one Region, you can enable the
     * recording of that resource type in all Regions supported by Config, even if the specified resource type is not
     * supported in the Amazon Web Services Region where you set up Config.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config records.</p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>Resource Type Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Amazon Web Services resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        Optionally, you can set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     *        <p>
     *        To record all configuration changes, set the <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>, and either omit this field or don't specify any resource types in this field. If you
     *        set the <code>allSupported</code> field to <code>false</code> and specify values for
     *        <code>resourceTypes</code>, when Config adds support for a new type of resource, it will not record
     *        resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Region availability</b>
     *        </p>
     *        <p>
     *        Before specifying a resource type for Config to track, check <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html"
     *        >Resource Coverage by Region Availability</a> to see if the resource type is supported in the Amazon Web
     *        Services Region where you set up Config. If a resource type is supported by Config in at least one Region,
     *        you can enable the recording of that resource type in all Regions supported by Config, even if the
     *        specified resource type is not supported in the Amazon Web Services Region where you set up Config.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(ResourceType... resourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> resourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An object that specifies how Config excludes resource types from being recorded by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * <b>Required fields</b>
     * </p>
     * <p>
     * To use this option, you must set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * </note>
     * 
     * @param exclusionByResourceTypes
     *        An object that specifies how Config excludes resource types from being recorded by the configuration
     *        recorder.</p> <note>
     *        <p>
     *        <b>Required fields</b>
     *        </p>
     *        <p>
     *        To use this option, you must set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     */

    public void setExclusionByResourceTypes(ExclusionByResourceTypes exclusionByResourceTypes) {
        this.exclusionByResourceTypes = exclusionByResourceTypes;
    }

    /**
     * <p>
     * An object that specifies how Config excludes resource types from being recorded by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * <b>Required fields</b>
     * </p>
     * <p>
     * To use this option, you must set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * </note>
     * 
     * @return An object that specifies how Config excludes resource types from being recorded by the configuration
     *         recorder.</p> <note>
     *         <p>
     *         <b>Required fields</b>
     *         </p>
     *         <p>
     *         To use this option, you must set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     *         </p>
     */

    public ExclusionByResourceTypes getExclusionByResourceTypes() {
        return this.exclusionByResourceTypes;
    }

    /**
     * <p>
     * An object that specifies how Config excludes resource types from being recorded by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * <b>Required fields</b>
     * </p>
     * <p>
     * To use this option, you must set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     * </p>
     * </note>
     * 
     * @param exclusionByResourceTypes
     *        An object that specifies how Config excludes resource types from being recorded by the configuration
     *        recorder.</p> <note>
     *        <p>
     *        <b>Required fields</b>
     *        </p>
     *        <p>
     *        To use this option, you must set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withExclusionByResourceTypes(ExclusionByResourceTypes exclusionByResourceTypes) {
        setExclusionByResourceTypes(exclusionByResourceTypes);
        return this;
    }

    /**
     * <p>
     * An object that specifies the recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types,
     * excluding the global IAM resource types. You also must set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only the resource types you
     * specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types
     * except the resource types that you specify to exclude from being recorded in the <code>resourceTypes</code> field
     * of <a href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html">
     * ExclusionByResourceTypes</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you list resource types in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     * <code>exclusionByResourceTypes</code> field will override other properties in the request.
     * </p>
     * <p>
     * For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types will
     * still be automatically recorded in this option unless those resource types are specifically listed as exclusions
     * in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Global resources types and the resource exclusion recording strategy</b>
     * </p>
     * <p>
     * By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config adds
     * support for a new resource type in the Region where you set up the configuration recorder, including global
     * resource types, Config starts recording resources of that type automatically.
     * </p>
     * <p>
     * Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded automatically in
     * all supported Config Regions were the configuration recorder is enabled.
     * </p>
     * <p>
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up the
     * configuration recorder if that is a Region where Config was available before February 2022. You cannot be record
     * the global IAM resouce types in Regions supported by Config after February 2022. This list where you cannot
     * record the global IAM resource types includes the following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param recordingStrategy
     *        An object that specifies the recording strategy for the configuration recorder.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, excluding the global IAM resource types. You also must set the
     *        <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *        recording resources of that type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for only the resource types you specify in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types except the resource types that you specify to exclude from being recorded
     *        in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of
     *        <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>.
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is optional when you list resource types in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording
     *        in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Overriding fields</b>
     *        </p>
     *        <p>
     *        If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     *        <code>exclusionByResourceTypes</code> field will override other properties in the request.
     *        </p>
     *        <p>
     *        For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types
     *        will still be automatically recorded in this option unless those resource types are specifically listed as
     *        exclusions in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Global resources types and the resource exclusion recording strategy</b>
     *        </p>
     *        <p>
     *        By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config
     *        adds support for a new resource type in the Region where you set up the configuration recorder, including
     *        global resource types, Config starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded
     *        automatically in all supported Config Regions were the configuration recorder is enabled.
     *        </p>
     *        <p>
     *        IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up
     *        the configuration recorder if that is a Region where Config was available before February 2022. You cannot
     *        be record the global IAM resouce types in Regions supported by Config after February 2022. This list where
     *        you cannot record the global IAM resource types includes the following Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Asia Pacific (Hyderabad)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Melbourne)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canada West (Calgary)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Spain)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Zurich)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Israel (Tel Aviv)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Middle East (UAE)
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setRecordingStrategy(RecordingStrategy recordingStrategy) {
        this.recordingStrategy = recordingStrategy;
    }

    /**
     * <p>
     * An object that specifies the recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types,
     * excluding the global IAM resource types. You also must set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only the resource types you
     * specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types
     * except the resource types that you specify to exclude from being recorded in the <code>resourceTypes</code> field
     * of <a href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html">
     * ExclusionByResourceTypes</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you list resource types in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     * <code>exclusionByResourceTypes</code> field will override other properties in the request.
     * </p>
     * <p>
     * For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types will
     * still be automatically recorded in this option unless those resource types are specifically listed as exclusions
     * in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Global resources types and the resource exclusion recording strategy</b>
     * </p>
     * <p>
     * By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config adds
     * support for a new resource type in the Region where you set up the configuration recorder, including global
     * resource types, Config starts recording resources of that type automatically.
     * </p>
     * <p>
     * Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded automatically in
     * all supported Config Regions were the configuration recorder is enabled.
     * </p>
     * <p>
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up the
     * configuration recorder if that is a Region where Config was available before February 2022. You cannot be record
     * the global IAM resouce types in Regions supported by Config after February 2022. This list where you cannot
     * record the global IAM resource types includes the following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return An object that specifies the recording strategy for the configuration recorder.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *         for all supported resource types, excluding the global IAM resource types. You also must set the
     *         <code>allSupported</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *         recording resources of that type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *         for only the resource types you specify in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you set the <code>useOnly</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *         >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *         for all supported resource types except the resource types that you specify to exclude from being
     *         recorded in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *         >ExclusionByResourceTypes</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         <b>Required and optional fields</b>
     *         </p>
     *         <p>
     *         The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of
     *         <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>.
     *         </p>
     *         <p>
     *         The <code>recordingStrategy</code> field is optional when you list resource types in the
     *         <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *         </p>
     *         <p>
     *         The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording
     *         in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *         >ExclusionByResourceTypes</a>.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Overriding fields</b>
     *         </p>
     *         <p>
     *         If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     *         <code>exclusionByResourceTypes</code> field will override other properties in the request.
     *         </p>
     *         <p>
     *         For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types
     *         will still be automatically recorded in this option unless those resource types are specifically listed
     *         as exclusions in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Global resources types and the resource exclusion recording strategy</b>
     *         </p>
     *         <p>
     *         By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config
     *         adds support for a new resource type in the Region where you set up the configuration recorder, including
     *         global resource types, Config starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded
     *         automatically in all supported Config Regions were the configuration recorder is enabled.
     *         </p>
     *         <p>
     *         IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up
     *         the configuration recorder if that is a Region where Config was available before February 2022. You
     *         cannot be record the global IAM resouce types in Regions supported by Config after February 2022. This
     *         list where you cannot record the global IAM resource types includes the following Regions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Asia Pacific (Hyderabad)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Melbourne)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canada West (Calgary)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Spain)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Zurich)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Israel (Tel Aviv)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Middle East (UAE)
     *         </p>
     *         </li>
     *         </ul>
     */

    public RecordingStrategy getRecordingStrategy() {
        return this.recordingStrategy;
    }

    /**
     * <p>
     * An object that specifies the recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types,
     * excluding the global IAM resource types. You also must set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only the resource types you
     * specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the <code>useOnly</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
     * <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all supported resource types
     * except the resource types that you specify to exclude from being recorded in the <code>resourceTypes</code> field
     * of <a href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html">
     * ExclusionByResourceTypes</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <b>Required and optional fields</b>
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is optional when you list resource types in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * <p>
     * The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Overriding fields</b>
     * </p>
     * <p>
     * If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     * <code>exclusionByResourceTypes</code> field will override other properties in the request.
     * </p>
     * <p>
     * For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types will
     * still be automatically recorded in this option unless those resource types are specifically listed as exclusions
     * in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     * </p>
     * </note> <note>
     * <p>
     * <b>Global resources types and the resource exclusion recording strategy</b>
     * </p>
     * <p>
     * By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config adds
     * support for a new resource type in the Region where you set up the configuration recorder, including global
     * resource types, Config starts recording resources of that type automatically.
     * </p>
     * <p>
     * Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded automatically in
     * all supported Config Regions were the configuration recorder is enabled.
     * </p>
     * <p>
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up the
     * configuration recorder if that is a Region where Config was available before February 2022. You cannot be record
     * the global IAM resouce types in Regions supported by Config after February 2022. This list where you cannot
     * record the global IAM resource types includes the following Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Asia Pacific (Hyderabad)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Melbourne)
     * </p>
     * </li>
     * <li>
     * <p>
     * Canada West (Calgary)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Spain)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Zurich)
     * </p>
     * </li>
     * <li>
     * <p>
     * Israel (Tel Aviv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Middle East (UAE)
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param recordingStrategy
     *        An object that specifies the recording strategy for the configuration recorder.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, excluding the global IAM resource types. You also must set the
     *        <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *        recording resources of that type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for only the resource types you specify in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the <code>useOnly</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html"
     *        >RecordingStrategy</a> to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types except the resource types that you specify to exclude from being recorded
     *        in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        <b>Required and optional fields</b>
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is optional when you set the <code>allSupported</code> field of
     *        <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>.
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is optional when you list resource types in the
     *        <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        <p>
     *        The <code>recordingStrategy</code> field is required if you list resource types to exclude from recording
     *        in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     *        >ExclusionByResourceTypes</a>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Overriding fields</b>
     *        </p>
     *        <p>
     *        If you choose <code>EXCLUSION_BY_RESOURCE_TYPES</code> for the recording strategy, the
     *        <code>exclusionByResourceTypes</code> field will override other properties in the request.
     *        </p>
     *        <p>
     *        For example, even if you set <code>includeGlobalResourceTypes</code> to false, global IAM resource types
     *        will still be automatically recorded in this option unless those resource types are specifically listed as
     *        exclusions in the <code>resourceTypes</code> field of <code>exclusionByResourceTypes</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Global resources types and the resource exclusion recording strategy</b>
     *        </p>
     *        <p>
     *        By default, if you choose the <code>EXCLUSION_BY_RESOURCE_TYPES</code> recording strategy, when Config
     *        adds support for a new resource type in the Region where you set up the configuration recorder, including
     *        global resource types, Config starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        Unless specifically listed as exclusions, <code>AWS::RDS::GlobalCluster</code> will be recorded
     *        automatically in all supported Config Regions were the configuration recorder is enabled.
     *        </p>
     *        <p>
     *        IAM users, groups, roles, and customer managed policies will be recorded in the Region where you set up
     *        the configuration recorder if that is a Region where Config was available before February 2022. You cannot
     *        be record the global IAM resouce types in Regions supported by Config after February 2022. This list where
     *        you cannot record the global IAM resource types includes the following Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Asia Pacific (Hyderabad)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Melbourne)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canada West (Calgary)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Spain)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Zurich)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Israel (Tel Aviv)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Middle East (UAE)
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withRecordingStrategy(RecordingStrategy recordingStrategy) {
        setRecordingStrategy(recordingStrategy);
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
        if (getAllSupported() != null)
            sb.append("AllSupported: ").append(getAllSupported()).append(",");
        if (getIncludeGlobalResourceTypes() != null)
            sb.append("IncludeGlobalResourceTypes: ").append(getIncludeGlobalResourceTypes()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getExclusionByResourceTypes() != null)
            sb.append("ExclusionByResourceTypes: ").append(getExclusionByResourceTypes()).append(",");
        if (getRecordingStrategy() != null)
            sb.append("RecordingStrategy: ").append(getRecordingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingGroup == false)
            return false;
        RecordingGroup other = (RecordingGroup) obj;
        if (other.getAllSupported() == null ^ this.getAllSupported() == null)
            return false;
        if (other.getAllSupported() != null && other.getAllSupported().equals(this.getAllSupported()) == false)
            return false;
        if (other.getIncludeGlobalResourceTypes() == null ^ this.getIncludeGlobalResourceTypes() == null)
            return false;
        if (other.getIncludeGlobalResourceTypes() != null && other.getIncludeGlobalResourceTypes().equals(this.getIncludeGlobalResourceTypes()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getExclusionByResourceTypes() == null ^ this.getExclusionByResourceTypes() == null)
            return false;
        if (other.getExclusionByResourceTypes() != null && other.getExclusionByResourceTypes().equals(this.getExclusionByResourceTypes()) == false)
            return false;
        if (other.getRecordingStrategy() == null ^ this.getRecordingStrategy() == null)
            return false;
        if (other.getRecordingStrategy() != null && other.getRecordingStrategy().equals(this.getRecordingStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllSupported() == null) ? 0 : getAllSupported().hashCode());
        hashCode = prime * hashCode + ((getIncludeGlobalResourceTypes() == null) ? 0 : getIncludeGlobalResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getExclusionByResourceTypes() == null) ? 0 : getExclusionByResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRecordingStrategy() == null) ? 0 : getRecordingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public RecordingGroup clone() {
        try {
            return (RecordingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RecordingGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
