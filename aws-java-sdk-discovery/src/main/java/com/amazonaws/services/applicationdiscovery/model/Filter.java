/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * <p>
 * A filter that can use conditional operators.
 * </p>
 */
public class Filter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Server</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentid</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Process</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>process.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentId</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Connection</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection.sourceIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationPort</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.agentId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.agentId</code>
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * A string value that you want to filter on. For example, if you choose the
     * <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you
     * specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you specify
     * multiple values for a particular filter, the system differentiates the values using <i>OR</i>. Calling either
     * <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching configuration items.
     * </p>
     */
    private String condition;

    /**
     * <p>
     * The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Server</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentid</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Process</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>process.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentId</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Connection</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection.sourceIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationPort</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.agentId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.agentId</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration
     *        items.</p>
     *        <p class="title">
     *        <b>Server</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>server.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.agentid</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration
     *        items.
     *        </p>
     *        <p class="title">
     *        <b>Process</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>process.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>process.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>process.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.agentId</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration
     *        items.
     *        </p>
     *        <p class="title">
     *        <b>Connection</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connection.sourceIp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection.destinationIp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection.destinationPort</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.agentId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.agentId</code>
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Server</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentid</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Process</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>process.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentId</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Connection</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection.sourceIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationPort</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.agentId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.agentId</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration
     *         items.</p>
     *         <p class="title">
     *         <b>Server</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>server.hostName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.osName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.osVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.configurationid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.agentid</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration
     *         items.
     *         </p>
     *         <p class="title">
     *         <b>Process</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>process.configurationid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>process.name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>process.commandLine</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.configurationid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.hostName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.osName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.osVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server.agentId</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration
     *         items.
     *         </p>
     *         <p class="title">
     *         <b>Connection</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>connection.sourceIp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection.destinationIp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection.destinationPort</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceProcess.configurationId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceProcess.name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceProcess.commandLine</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationProcess.configurationId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationProcess.name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationProcess.commandLine</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceServer.configurationId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceServer.hostName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceServer.osName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceServer.osVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sourceServer.agentId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationServer.configurationId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationServer.hostName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationServer.osName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationServer.osVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destinationServer.agentId</code>
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Server</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentid</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Process</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>process.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>process.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.configurationid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server.agentId</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration items.
     * </p>
     * <p class="title">
     * <b>Connection</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection.sourceIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationIp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection.destinationPort</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationProcess.commandLine</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sourceServer.agentId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.configurationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.hostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.osVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationServer.agentId</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the filter. The following filter names are allowed for <code>SERVER</code> configuration
     *        items.</p>
     *        <p class="title">
     *        <b>Server</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>server.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.agentid</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the filter. The following filter names are allowed for <code>PROCESS</code> configuration
     *        items.
     *        </p>
     *        <p class="title">
     *        <b>Process</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>process.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>process.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>process.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.configurationid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server.agentId</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of the filter. The following filter names are allowed for <code>CONNECTION</code> configuration
     *        items.
     *        </p>
     *        <p class="title">
     *        <b>Connection</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connection.sourceIp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection.destinationIp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection.destinationPort</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceProcess.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationProcess.commandLine</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sourceServer.agentId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.configurationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.hostName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.osName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.osVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destinationServer.agentId</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A string value that you want to filter on. For example, if you choose the
     * <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * </p>
     * 
     * @return A string value that you want to filter on. For example, if you choose the
     *         <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the
     *         value.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A string value that you want to filter on. For example, if you choose the
     * <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * </p>
     * 
     * @param values
     *        A string value that you want to filter on. For example, if you choose the
     *        <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * A string value that you want to filter on. For example, if you choose the
     * <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A string value that you want to filter on. For example, if you choose the
     *        <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string value that you want to filter on. For example, if you choose the
     * <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * </p>
     * 
     * @param values
     *        A string value that you want to filter on. For example, if you choose the
     *        <code>destinationServer.osVersion</code> filter name, you could specify <code>Ubuntu</code> for the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you
     * specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you specify
     * multiple values for a particular filter, the system differentiates the values using <i>OR</i>. Calling either
     * <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching configuration items.
     * </p>
     * 
     * @param condition
     *        A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If
     *        you specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you
     *        specify multiple values for a particular filter, the system differentiates the values using <i>OR</i>.
     *        Calling either <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching
     *        configuration items.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you
     * specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you specify
     * multiple values for a particular filter, the system differentiates the values using <i>OR</i>. Calling either
     * <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching configuration items.
     * </p>
     * 
     * @return A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If
     *         you specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If
     *         you specify multiple values for a particular filter, the system differentiates the values using
     *         <i>OR</i>. Calling either <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes
     *         of matching configuration items.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you
     * specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you specify
     * multiple values for a particular filter, the system differentiates the values using <i>OR</i>. Calling either
     * <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching configuration items.
     * </p>
     * 
     * @param condition
     *        A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If
     *        you specify multiple filters, the system utilizes all filters as though concatenated by <i>AND</i>. If you
     *        specify multiple values for a particular filter, the system differentiates the values using <i>OR</i>.
     *        Calling either <i>DescribeConfigurations</i> or <i>ListConfigurations</i> returns attributes of matching
     *        configuration items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getCondition() != null)
            sb.append("Condition: " + getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
