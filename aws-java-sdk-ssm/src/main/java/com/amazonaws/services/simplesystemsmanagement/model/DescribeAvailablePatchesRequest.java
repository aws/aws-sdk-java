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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailablePatchesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * <b>Windows Server</b>
     * </p>
     * <p>
     * Supported keys for Windows Server instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PATCH_SET</code> </b>
     * </p>
     * <p>
     * Sample values: <code>OS</code> | <code>APPLICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     * <code>MicrosoftDefenderAntivirus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT_FAMILY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Windows</code> | <code>Office</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MSRC_SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CLASSIFICATION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PATCH_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB123456</code> | <code>KB4516046</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Linux</b>
     * </p>
     * <important>
     * <p>
     * When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For example,
     * using the Command Line Interface (CLI), the following command fails:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * <p>
     * However, the following command succeeds:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * </important>
     * <p>
     * Supported keys for Linux instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NAME</code> </b>
     * </p>
     * <p>
     * Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EPOCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>0</code> | <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VERSION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>RELEASE</code> </b>
     * </p>
     * <p>
     * Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ARCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>i686</code> | <code>x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>REPOSITORY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Core</code> | <code>Updates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADVISORY_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CVE_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BUGZILLA_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>1463241</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter> filters;
    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * <b>Windows Server</b>
     * </p>
     * <p>
     * Supported keys for Windows Server instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PATCH_SET</code> </b>
     * </p>
     * <p>
     * Sample values: <code>OS</code> | <code>APPLICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     * <code>MicrosoftDefenderAntivirus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT_FAMILY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Windows</code> | <code>Office</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MSRC_SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CLASSIFICATION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PATCH_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB123456</code> | <code>KB4516046</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Linux</b>
     * </p>
     * <important>
     * <p>
     * When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For example,
     * using the Command Line Interface (CLI), the following command fails:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * <p>
     * However, the following command succeeds:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * </important>
     * <p>
     * Supported keys for Linux instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NAME</code> </b>
     * </p>
     * <p>
     * Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EPOCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>0</code> | <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VERSION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>RELEASE</code> </b>
     * </p>
     * <p>
     * Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ARCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>i686</code> | <code>x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>REPOSITORY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Core</code> | <code>Updates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADVISORY_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CVE_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BUGZILLA_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>1463241</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Each element in the array is a structure containing a key-value pair.</p>
     *         <p>
     *         <b>Windows Server</b>
     *         </p>
     *         <p>
     *         Supported keys for Windows Server instance patches include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>PATCH_SET</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>OS</code> | <code>APPLICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PRODUCT</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     *         <code>MicrosoftDefenderAntivirus</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PRODUCT_FAMILY</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Windows</code> | <code>Office</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MSRC_SEVERITY</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>CLASSIFICATION</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PATCH_ID</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>KB123456</code> | <code>KB4516046</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Linux</b>
     *         </p>
     *         <important>
     *         <p>
     *         When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For
     *         example, using the Command Line Interface (CLI), the following command fails:
     *         </p>
     *         <p>
     *         <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     *         </p>
     *         <p>
     *         However, the following command succeeds:
     *         </p>
     *         <p>
     *         <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     *         </p>
     *         </important>
     *         <p>
     *         Supported keys for Linux instance patches include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>PRODUCT</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NAME</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>SEVERITY</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>EPOCH</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>0</code> | <code>1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>VERSION</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>RELEASE</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ARCH</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>i686</code> | <code>x86_64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>REPOSITORY</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Core</code> | <code>Updates</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ADVISORY_ID</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>CVE_ID</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>BUGZILLA_ID</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>1463241</code>
     *         </p>
     *         </li>
     */

    public java.util.List<PatchOrchestratorFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * <b>Windows Server</b>
     * </p>
     * <p>
     * Supported keys for Windows Server instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PATCH_SET</code> </b>
     * </p>
     * <p>
     * Sample values: <code>OS</code> | <code>APPLICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     * <code>MicrosoftDefenderAntivirus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT_FAMILY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Windows</code> | <code>Office</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MSRC_SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CLASSIFICATION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PATCH_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB123456</code> | <code>KB4516046</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Linux</b>
     * </p>
     * <important>
     * <p>
     * When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For example,
     * using the Command Line Interface (CLI), the following command fails:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * <p>
     * However, the following command succeeds:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * </important>
     * <p>
     * Supported keys for Linux instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NAME</code> </b>
     * </p>
     * <p>
     * Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EPOCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>0</code> | <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VERSION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>RELEASE</code> </b>
     * </p>
     * <p>
     * Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ARCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>i686</code> | <code>x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>REPOSITORY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Core</code> | <code>Updates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADVISORY_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CVE_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BUGZILLA_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>1463241</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        <b>Windows Server</b>
     *        </p>
     *        <p>
     *        Supported keys for Windows Server instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_SET</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>OS</code> | <code>APPLICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     *        <code>MicrosoftDefenderAntivirus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT_FAMILY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Windows</code> | <code>Office</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MSRC_SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CLASSIFICATION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB123456</code> | <code>KB4516046</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Linux</b>
     *        </p>
     *        <important>
     *        <p>
     *        When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For
     *        example, using the Command Line Interface (CLI), the following command fails:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        <p>
     *        However, the following command succeeds:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        </important>
     *        <p>
     *        Supported keys for Linux instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NAME</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EPOCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>0</code> | <code>1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VERSION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>RELEASE</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ARCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>i686</code> | <code>x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>REPOSITORY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Core</code> | <code>Updates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ADVISORY_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CVE_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BUGZILLA_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>1463241</code>
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters);
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * <b>Windows Server</b>
     * </p>
     * <p>
     * Supported keys for Windows Server instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PATCH_SET</code> </b>
     * </p>
     * <p>
     * Sample values: <code>OS</code> | <code>APPLICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     * <code>MicrosoftDefenderAntivirus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT_FAMILY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Windows</code> | <code>Office</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MSRC_SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CLASSIFICATION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PATCH_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB123456</code> | <code>KB4516046</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Linux</b>
     * </p>
     * <important>
     * <p>
     * When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For example,
     * using the Command Line Interface (CLI), the following command fails:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * <p>
     * However, the following command succeeds:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * </important>
     * <p>
     * Supported keys for Linux instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NAME</code> </b>
     * </p>
     * <p>
     * Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EPOCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>0</code> | <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VERSION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>RELEASE</code> </b>
     * </p>
     * <p>
     * Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ARCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>i686</code> | <code>x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>REPOSITORY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Core</code> | <code>Updates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADVISORY_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CVE_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BUGZILLA_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>1463241</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        <b>Windows Server</b>
     *        </p>
     *        <p>
     *        Supported keys for Windows Server instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_SET</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>OS</code> | <code>APPLICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     *        <code>MicrosoftDefenderAntivirus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT_FAMILY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Windows</code> | <code>Office</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MSRC_SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CLASSIFICATION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB123456</code> | <code>KB4516046</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Linux</b>
     *        </p>
     *        <important>
     *        <p>
     *        When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For
     *        example, using the Command Line Interface (CLI), the following command fails:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        <p>
     *        However, the following command succeeds:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        </important>
     *        <p>
     *        Supported keys for Linux instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NAME</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EPOCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>0</code> | <code>1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VERSION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>RELEASE</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ARCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>i686</code> | <code>x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>REPOSITORY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Core</code> | <code>Updates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ADVISORY_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CVE_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BUGZILLA_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>1463241</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesRequest withFilters(PatchOrchestratorFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters.length));
        }
        for (PatchOrchestratorFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * <b>Windows Server</b>
     * </p>
     * <p>
     * Supported keys for Windows Server instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PATCH_SET</code> </b>
     * </p>
     * <p>
     * Sample values: <code>OS</code> | <code>APPLICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     * <code>MicrosoftDefenderAntivirus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PRODUCT_FAMILY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Windows</code> | <code>Office</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MSRC_SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CLASSIFICATION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PATCH_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB123456</code> | <code>KB4516046</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Linux</b>
     * </p>
     * <important>
     * <p>
     * When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For example,
     * using the Command Line Interface (CLI), the following command fails:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * <p>
     * However, the following command succeeds:
     * </p>
     * <p>
     * <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     * </p>
     * </important>
     * <p>
     * Supported keys for Linux instance patches include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PRODUCT</code> </b>
     * </p>
     * <p>
     * Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NAME</code> </b>
     * </p>
     * <p>
     * Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>SEVERITY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EPOCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>0</code> | <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VERSION</code> </b>
     * </p>
     * <p>
     * Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>RELEASE</code> </b>
     * </p>
     * <p>
     * Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ARCH</code> </b>
     * </p>
     * <p>
     * Sample values: <code>i686</code> | <code>x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>REPOSITORY</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Core</code> | <code>Updates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADVISORY_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CVE_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BUGZILLA_ID</code> </b>
     * </p>
     * <p>
     * Sample values: <code>1463241</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        <b>Windows Server</b>
     *        </p>
     *        <p>
     *        Supported keys for Windows Server instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_SET</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>OS</code> | <code>APPLICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>WindowsServer2012</code> | <code>Office 2010</code> |
     *        <code>MicrosoftDefenderAntivirus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT_FAMILY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Windows</code> | <code>Office</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MSRC_SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>Important</code> | <code>Moderate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CLASSIFICATION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ServicePacks</code> | <code>SecurityUpdates</code> | <code>DefinitionUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PATCH_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB123456</code> | <code>KB4516046</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Linux</b>
     *        </p>
     *        <important>
     *        <p>
     *        When specifying filters for Linux patches, you must specify a key-pair for <code>PRODUCT</code>. For
     *        example, using the Command Line Interface (CLI), the following command fails:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        <p>
     *        However, the following command succeeds:
     *        </p>
     *        <p>
     *        <code>aws ssm describe-available-patches --filters Key=PRODUCT,Values=AmazonLinux2018.03 Key=CVE_ID,Values=CVE-2018-3615</code>
     *        </p>
     *        </important>
     *        <p>
     *        Supported keys for Linux instance patches include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PRODUCT</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>AmazonLinux2018.03</code> | <code>AmazonLinux2.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NAME</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>kernel-headers</code> | <code>samba-python</code> | <code>php</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>SEVERITY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Critical</code> | <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EPOCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>0</code> | <code>1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VERSION</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>78.6.1</code> | <code>4.10.16</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>RELEASE</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>9.56.amzn1</code> | <code>1.amzn2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ARCH</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>i686</code> | <code>x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>REPOSITORY</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Core</code> | <code>Updates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ADVISORY_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>ALAS-2018-1058</code> | <code>ALAS2-2021-1594</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CVE_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>CVE-2018-3615</code> | <code>CVE-2020-1472</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BUGZILLA_ID</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>1463241</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesRequest withFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patches to return (per page).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @return The maximum number of patches to return (per page).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patches to return (per page).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailablePatchesRequest == false)
            return false;
        DescribeAvailablePatchesRequest other = (DescribeAvailablePatchesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailablePatchesRequest clone() {
        return (DescribeAvailablePatchesRequest) super.clone();
    }

}
