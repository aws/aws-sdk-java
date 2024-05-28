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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Security Lake collects logs and events from supported Amazon Web Services and custom sources. For the list of
 * supported Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom
     * source will send to Security Lake. The supported event classes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FILE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_EXTENSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEMORY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODULE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_KEY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_VALUE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED_JOB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECURITY_FINDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT_CHANGE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHENTICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHORIZATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGEMENT_AUDIT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DHCP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSH_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_STATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVENTORY_INFO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOUD_API</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> eventClasses;
    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     */
    private java.util.List<DataLakeSourceStatus> sourceStatuses;

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @param account
     *        The ID of the Security Lake account for which logs are collected.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @return The ID of the Security Lake account for which logs are collected.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The ID of the Security Lake account for which logs are collected.
     * </p>
     * 
     * @param account
     *        The ID of the Security Lake account for which logs are collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom
     * source will send to Security Lake. The supported event classes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FILE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_EXTENSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEMORY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODULE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_KEY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_VALUE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED_JOB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECURITY_FINDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT_CHANGE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHENTICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHORIZATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGEMENT_AUDIT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DHCP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSH_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_STATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVENTORY_INFO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOUD_API</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the
     *         custom source will send to Security Lake. The supported event classes are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCESS_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FILE_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KERNEL_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KERNEL_EXTENSION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEMORY_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODULE_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROCESS_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGISTRY_KEY_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGISTRY_VALUE_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOURCE_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCHEDULED_JOB_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SECURITY_FINDING</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCOUNT_CHANGE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHENTICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHORIZATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENTITY_MANAGEMENT_AUDIT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DHCP_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DNS_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FTP_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDP_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMB_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSH_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONFIG_STATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVENTORY_INFO</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMAIL_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>API_ACTIVITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CLOUD_API</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getEventClasses() {
        return eventClasses;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom
     * source will send to Security Lake. The supported event classes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FILE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_EXTENSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEMORY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODULE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_KEY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_VALUE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED_JOB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECURITY_FINDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT_CHANGE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHENTICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHORIZATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGEMENT_AUDIT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DHCP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSH_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_STATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVENTORY_INFO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOUD_API</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventClasses
     *        The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the
     *        custom source will send to Security Lake. The supported event classes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FILE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_EXTENSION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEMORY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODULE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_KEY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_VALUE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED_JOB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SECURITY_FINDING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT_CHANGE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHENTICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHORIZATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGEMENT_AUDIT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DHCP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSH_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFIG_STATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVENTORY_INFO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOUD_API</code>
     *        </p>
     *        </li>
     */

    public void setEventClasses(java.util.Collection<String> eventClasses) {
        if (eventClasses == null) {
            this.eventClasses = null;
            return;
        }

        this.eventClasses = new java.util.ArrayList<String>(eventClasses);
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom
     * source will send to Security Lake. The supported event classes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FILE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_EXTENSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEMORY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODULE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_KEY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_VALUE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED_JOB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECURITY_FINDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT_CHANGE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHENTICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHORIZATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGEMENT_AUDIT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DHCP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSH_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_STATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVENTORY_INFO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOUD_API</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventClasses(java.util.Collection)} or {@link #withEventClasses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventClasses
     *        The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the
     *        custom source will send to Security Lake. The supported event classes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FILE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_EXTENSION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEMORY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODULE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_KEY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_VALUE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED_JOB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SECURITY_FINDING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT_CHANGE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHENTICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHORIZATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGEMENT_AUDIT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DHCP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSH_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFIG_STATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVENTORY_INFO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOUD_API</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withEventClasses(String... eventClasses) {
        if (this.eventClasses == null) {
            setEventClasses(new java.util.ArrayList<String>(eventClasses.length));
        }
        for (String ele : eventClasses) {
            this.eventClasses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom
     * source will send to Security Lake. The supported event classes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FILE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KERNEL_EXTENSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEMORY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODULE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_KEY_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRY_VALUE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED_JOB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECURITY_FINDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT_CHANGE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHENTICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHORIZATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGEMENT_AUDIT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DHCP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDP_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSH_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_STATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVENTORY_INFO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API_ACTIVITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOUD_API</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventClasses
     *        The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the
     *        custom source will send to Security Lake. The supported event classes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FILE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KERNEL_EXTENSION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEMORY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODULE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_KEY_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRY_VALUE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED_JOB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SECURITY_FINDING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT_CHANGE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHENTICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHORIZATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGEMENT_AUDIT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DHCP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDP_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSH_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFIG_STATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVENTORY_INFO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API_ACTIVITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOUD_API</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withEventClasses(java.util.Collection<String> eventClasses) {
        setEventClasses(eventClasses);
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceName
     *        The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *        log and event collection for natively supported Amazon Web Services.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @return The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *         log and event collection for natively supported Amazon Web Services.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and
     * event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceName
     *        The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports
     *        log and event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @return The log status for the Security Lake account.
     */

    public java.util.List<DataLakeSourceStatus> getSourceStatuses() {
        return sourceStatuses;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @param sourceStatuses
     *        The log status for the Security Lake account.
     */

    public void setSourceStatuses(java.util.Collection<DataLakeSourceStatus> sourceStatuses) {
        if (sourceStatuses == null) {
            this.sourceStatuses = null;
            return;
        }

        this.sourceStatuses = new java.util.ArrayList<DataLakeSourceStatus>(sourceStatuses);
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceStatuses(java.util.Collection)} or {@link #withSourceStatuses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceStatuses
     *        The log status for the Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withSourceStatuses(DataLakeSourceStatus... sourceStatuses) {
        if (this.sourceStatuses == null) {
            setSourceStatuses(new java.util.ArrayList<DataLakeSourceStatus>(sourceStatuses.length));
        }
        for (DataLakeSourceStatus ele : sourceStatuses) {
            this.sourceStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log status for the Security Lake account.
     * </p>
     * 
     * @param sourceStatuses
     *        The log status for the Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSource withSourceStatuses(java.util.Collection<DataLakeSourceStatus> sourceStatuses) {
        setSourceStatuses(sourceStatuses);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getEventClasses() != null)
            sb.append("EventClasses: ").append(getEventClasses()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceStatuses() != null)
            sb.append("SourceStatuses: ").append(getSourceStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeSource == false)
            return false;
        DataLakeSource other = (DataLakeSource) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getEventClasses() == null ^ this.getEventClasses() == null)
            return false;
        if (other.getEventClasses() != null && other.getEventClasses().equals(this.getEventClasses()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceStatuses() == null ^ this.getSourceStatuses() == null)
            return false;
        if (other.getSourceStatuses() != null && other.getSourceStatuses().equals(this.getSourceStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getEventClasses() == null) ? 0 : getEventClasses().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceStatuses() == null) ? 0 : getSourceStatuses().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeSource clone() {
        try {
            return (DataLakeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
