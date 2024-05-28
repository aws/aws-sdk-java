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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomLogSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration for the third-party custom source.
     * </p>
     */
    private CustomLogSourceConfiguration configuration;
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
     * Specify the name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * Specify the source version for the third-party custom source, to limit log collection to a specific version of
     * custom data source.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * The configuration for the third-party custom source.
     * </p>
     * 
     * @param configuration
     *        The configuration for the third-party custom source.
     */

    public void setConfiguration(CustomLogSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the third-party custom source.
     * </p>
     * 
     * @return The configuration for the third-party custom source.
     */

    public CustomLogSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for the third-party custom source.
     * </p>
     * 
     * @param configuration
     *        The configuration for the third-party custom source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withConfiguration(CustomLogSourceConfiguration configuration) {
        setConfiguration(configuration);
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

    public CreateCustomLogSourceRequest withEventClasses(String... eventClasses) {
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

    public CreateCustomLogSourceRequest withEventClasses(java.util.Collection<String> eventClasses) {
        setEventClasses(eventClasses);
        return this;
    }

    /**
     * <p>
     * Specify the name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceName
     *        Specify the name for a third-party custom source. This must be a Regionally unique value.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * Specify the name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @return Specify the name for a third-party custom source. This must be a Regionally unique value.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * Specify the name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceName
     *        Specify the name for a third-party custom source. This must be a Regionally unique value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * Specify the source version for the third-party custom source, to limit log collection to a specific version of
     * custom data source.
     * </p>
     * 
     * @param sourceVersion
     *        Specify the source version for the third-party custom source, to limit log collection to a specific
     *        version of custom data source.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * Specify the source version for the third-party custom source, to limit log collection to a specific version of
     * custom data source.
     * </p>
     * 
     * @return Specify the source version for the third-party custom source, to limit log collection to a specific
     *         version of custom data source.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * Specify the source version for the third-party custom source, to limit log collection to a specific version of
     * custom data source.
     * </p>
     * 
     * @param sourceVersion
     *        Specify the source version for the third-party custom source, to limit log collection to a specific
     *        version of custom data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getEventClasses() != null)
            sb.append("EventClasses: ").append(getEventClasses()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomLogSourceRequest == false)
            return false;
        CreateCustomLogSourceRequest other = (CreateCustomLogSourceRequest) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getEventClasses() == null ^ this.getEventClasses() == null)
            return false;
        if (other.getEventClasses() != null && other.getEventClasses().equals(this.getEventClasses()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEventClasses() == null) ? 0 : getEventClasses().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomLogSourceRequest clone() {
        return (CreateCustomLogSourceRequest) super.clone();
    }

}
