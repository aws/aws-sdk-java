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
 * Specifies the recording strategy of the configuration recorder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RecordingStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, excluding the global IAM resource types. You also must set the
     * <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type. For a list of supported resource types, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only
     * the resource types that you specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, except the resource types that you specify to exclude from being recorded in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
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
     * <b>Global resource types and the exclusion recording strategy</b>
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
    private String useOnly;

    /**
     * <p>
     * The recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, excluding the global IAM resource types. You also must set the
     * <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type. For a list of supported resource types, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only
     * the resource types that you specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, except the resource types that you specify to exclude from being recorded in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
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
     * <b>Global resource types and the exclusion recording strategy</b>
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
     * @param useOnly
     *        The recording strategy for the configuration recorder.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, excluding the global IAM resource types. You also must set the
     *        <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *        recording resources of that type. For a list of supported resource types, see <a href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for only the resource types that you specify in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, except the resource types that you specify to exclude from being
     *        recorded in the <code>resourceTypes</code> field of <a
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
     *        <b>Global resource types and the exclusion recording strategy</b>
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
     * @see RecordingStrategyType
     */

    public void setUseOnly(String useOnly) {
        this.useOnly = useOnly;
    }

    /**
     * <p>
     * The recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, excluding the global IAM resource types. You also must set the
     * <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type. For a list of supported resource types, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only
     * the resource types that you specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, except the resource types that you specify to exclude from being recorded in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
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
     * <b>Global resource types and the exclusion recording strategy</b>
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
     * @return The recording strategy for the configuration recorder.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *         for all supported resource types, excluding the global IAM resource types. You also must set the
     *         <code>allSupported</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *         to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *         recording resources of that type. For a list of supported resource types, see <a href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported Resource Types</a> in the <i>Config developer guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *         for only the resource types that you specify in the <code>resourceTypes</code> field of <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *         for all supported resource types, except the resource types that you specify to exclude from being
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
     *         <b>Global resource types and the exclusion recording strategy</b>
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
     * @see RecordingStrategyType
     */

    public String getUseOnly() {
        return this.useOnly;
    }

    /**
     * <p>
     * The recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, excluding the global IAM resource types. You also must set the
     * <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type. For a list of supported resource types, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only
     * the resource types that you specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, except the resource types that you specify to exclude from being recorded in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
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
     * <b>Global resource types and the exclusion recording strategy</b>
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
     * @param useOnly
     *        The recording strategy for the configuration recorder.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, excluding the global IAM resource types. You also must set the
     *        <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *        recording resources of that type. For a list of supported resource types, see <a href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for only the resource types that you specify in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, except the resource types that you specify to exclude from being
     *        recorded in the <code>resourceTypes</code> field of <a
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
     *        <b>Global resource types and the exclusion recording strategy</b>
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
     * @see RecordingStrategyType
     */

    public RecordingStrategy withUseOnly(String useOnly) {
        setUseOnly(useOnly);
        return this;
    }

    /**
     * <p>
     * The recording strategy for the configuration recorder.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, excluding the global IAM resource types. You also must set the
     * <code>allSupported</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
     * <code>true</code>. When Config adds support for a new resource type, Config automatically starts recording
     * resources of that type. For a list of supported resource types, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported Resource Types</a> in the <i>Config developer guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for only
     * the resource types that you specify in the <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes for all
     * supported resource types, except the resource types that you specify to exclude from being recorded in the
     * <code>resourceTypes</code> field of <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html"
     * >ExclusionByResourceTypes</a>.
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
     * <b>Global resource types and the exclusion recording strategy</b>
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
     * @param useOnly
     *        The recording strategy for the configuration recorder.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set this option to <code>ALL_SUPPORTED_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, excluding the global IAM resource types. You also must set the
     *        <code>allSupported</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>
     *        to <code>true</code>. When Config adds support for a new resource type, Config automatically starts
     *        recording resources of that type. For a list of supported resource types, see <a href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported Resource Types</a> in the <i>Config developer guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>INCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for only the resource types that you specify in the <code>resourceTypes</code> field of <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set this option to <code>EXCLUSION_BY_RESOURCE_TYPES</code>, Config records configuration changes
     *        for all supported resource types, except the resource types that you specify to exclude from being
     *        recorded in the <code>resourceTypes</code> field of <a
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
     *        <b>Global resource types and the exclusion recording strategy</b>
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
     * @see RecordingStrategyType
     */

    public RecordingStrategy withUseOnly(RecordingStrategyType useOnly) {
        this.useOnly = useOnly.toString();
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
        if (getUseOnly() != null)
            sb.append("UseOnly: ").append(getUseOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingStrategy == false)
            return false;
        RecordingStrategy other = (RecordingStrategy) obj;
        if (other.getUseOnly() == null ^ this.getUseOnly() == null)
            return false;
        if (other.getUseOnly() != null && other.getUseOnly().equals(this.getUseOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseOnly() == null) ? 0 : getUseOnly().hashCode());
        return hashCode;
    }

    @Override
    public RecordingStrategy clone() {
        try {
            return (RecordingStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RecordingStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
