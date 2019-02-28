/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a patch filter.
 * </p>
 * <p>
 * A patch filter consists of key/value pairs, but not all keys are valid for all operating system types. For example,
 * the key <code>PRODUCT</code> is valid for all supported operating system types. The key <code>MSRC_SEVERITY</code>,
 * however, is valid only for Windows operating systems, and the key <code>SECTION</code> is valid only for Ubuntu
 * operating systems.
 * </p>
 * <p>
 * Refer to the following sections for information about which keys may be used with each major operating system, and
 * which values are valid for each key.
 * </p>
 * <p>
 * <b>Windows Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for Windows operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and
 * <code>MSRC_SEVERITY</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Windows7</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Windows8</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Windows8.1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Windows8Embedded</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Windows10</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Windows10LTSB</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2008</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2008R2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2012</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2012R2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2016</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WindowsServer2019</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CriticalUpdates</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DefinitionUpdates</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Drivers</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FeaturePacks</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SecurityUpdates</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ServicePacks</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Tools</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateRollups</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Updates</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Upgrades</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>MSRC_SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Moderate</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Unspecified</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Ubuntu Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for Ubuntu operating systems are <code>PRODUCT</code>, <code>PRIORITY</code>, and
 * <code>SECTION</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Ubuntu14.04</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Ubuntu16.04</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>PRIORITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Required</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Standard</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Optional</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Extra</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SECTION</code>
 * </p>
 * <p>
 * Only the length of the key value is validated. Minimum length is 1. Maximum length is 64.
 * </p>
 * <p>
 * <b>Amazon Linux Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for Amazon Linux operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and
 * <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AmazonLinux2012.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2012.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2013.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2013.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2014.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2014.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2015.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2015.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2016.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2016.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2017.03</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2017.09</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Security</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Bugfix</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Enhancement</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Recommended</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Newpackage</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Medium</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Linux 2 Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for Amazon Linux 2 operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and
 * <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AmazonLinux2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AmazonLinux2.0</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Security</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Bugfix</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Enhancement</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Recommended</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Newpackage</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Medium</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>RedHat Enterprise Linux (RHEL) Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for RedHat Enterprise Linux operating systems are <code>PRODUCT</code>,
 * <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these
 * keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux6.5</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux6.6</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux6.7</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux6.8</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux6.9</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.0</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.4</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.5</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedhatEnterpriseLinux7.6</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Security</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Bugfix</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Enhancement</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Recommended</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Newpackage</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Medium</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>SUSE Linux Enterprise Server (SLES) Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for SLES operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and
 * <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Suse12.0</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.4</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.5</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.6</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.7</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.8</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suse12.9</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Security</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Recommended</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Optional</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Feature</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Document</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Yast</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Moderate</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>CentOS Operating Systems</b>
 * </p>
 * <p>
 * The supported keys for CentOS operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and
 * <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
 * </p>
 * <p>
 * <i>Supported key:</i> <code>PRODUCT</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CentOS6.5</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS6.6</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS6.7</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS6.8</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS6.9</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.0</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.4</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.5</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CentOS7.6</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>*</code>
 * </p>
 * <p>
 * <i>Use a wildcard character (*) to target all supported operating system versions.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>CLASSIFICATION</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Security</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Bugfix</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Enhancement</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Recommended</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Newpackage</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>Supported key:</i> <code>SEVERITY</code>
 * </p>
 * <p>
 * <i>Supported values:</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Critical</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Important</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Medium</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Low</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * @see PatchFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     * 
     * @return The key for the filter.</p>
     *         <p>
     *         See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * @see PatchFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * @see PatchFilterKey
     */

    public void setKey(PatchFilterKey key) {
        withKey(key);
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid keys for each operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(PatchFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * </p>
     * 
     * @return The value for the filter key.</p>
     *         <p>
     *         See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        See <a>PatchFilter</a> for lists of valid values for each key based on operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchFilter == false)
            return false;
        PatchFilter other = (PatchFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public PatchFilter clone() {
        try {
            return (PatchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
