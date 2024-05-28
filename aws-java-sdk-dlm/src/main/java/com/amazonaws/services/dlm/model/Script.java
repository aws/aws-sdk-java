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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>[Custom snapshot policies that target instances only]</b> Information about pre and/or post scripts for a snapshot
 * lifecycle policy that targets instances. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html"> Automating
 * application-consistent snapshots with pre and post scripts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Script" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Script implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     */
    private java.util.List<String> stages;
    /**
     * <p>
     * Indicates the service used to execute the pre and/or post scripts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA workloads,
     * specify <code>AWS_SYSTEMS_MANAGER</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: AWS_SYSTEMS_MANAGER
     * </p>
     */
    private String executionHandlerService;
    /**
     * <p>
     * The SSM document that includes the pre and/or post scripts to run.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data Lifecycle
     * Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     * <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document. If you
     * are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     * </p>
     * </li>
     * </ul>
     */
    private String executionHandler;
    /**
     * <p>
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre script
     * fails.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is supported only if you run a pre script. If you run a post script only, omit this parameter.
     * </p>
     * <p>
     * Default: true
     * </p>
     */
    private Boolean executeOperationOnScriptFailure;
    /**
     * <p>
     * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run attempt if
     * it has not completed. If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
     * fails the attempt. The timeout period applies to the pre and post scripts individually.
     * </p>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: 10
     * </p>
     */
    private Integer executionTimeout;
    /**
     * <p>
     * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process, including
     * running the pre and post scripts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the pre
     * script will have completed and the snapshot might have been created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     * </p>
     * <p>
     * Default: 0
     * </p>
     */
    private Integer maximumRetryCount;

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     * 
     * @return Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run
     *         before Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data
     *         Lifecycle Manager initiates snapshot creation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the
     *         SSM document with the <code>pre-script</code> parameter before initiating snapshot creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls
     *         the SSM document with the <code>post-script</code> parameter after initiating snapshot creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case,
     *         Amazon Data Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before
     *         initiating snapshot creation, and then it calls the SSM document again with the <code>post-script</code>
     *         parameter after initiating snapshot creation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you are automating VSS Backups, omit this parameter.
     *         </p>
     *         <p>
     *         Default: PRE and POST
     * @see StageValues
     */

    public java.util.List<String> getStages() {
        return stages;
    }

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     * 
     * @param stages
     *        Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run
     *        before Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data
     *        Lifecycle Manager initiates snapshot creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the
     *        SSM document with the <code>pre-script</code> parameter before initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls
     *        the SSM document with the <code>post-script</code> parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case,
     *        Amazon Data Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before
     *        initiating snapshot creation, and then it calls the SSM document again with the <code>post-script</code>
     *        parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: PRE and POST
     * @see StageValues
     */

    public void setStages(java.util.Collection<String> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<String>(stages);
    }

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run
     *        before Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data
     *        Lifecycle Manager initiates snapshot creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the
     *        SSM document with the <code>pre-script</code> parameter before initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls
     *        the SSM document with the <code>post-script</code> parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case,
     *        Amazon Data Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before
     *        initiating snapshot creation, and then it calls the SSM document again with the <code>post-script</code>
     *        parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: PRE and POST
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageValues
     */

    public Script withStages(String... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<String>(stages.length));
        }
        for (String ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     * 
     * @param stages
     *        Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run
     *        before Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data
     *        Lifecycle Manager initiates snapshot creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the
     *        SSM document with the <code>pre-script</code> parameter before initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls
     *        the SSM document with the <code>post-script</code> parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case,
     *        Amazon Data Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before
     *        initiating snapshot creation, and then it calls the SSM document again with the <code>post-script</code>
     *        parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: PRE and POST
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageValues
     */

    public Script withStages(java.util.Collection<String> stages) {
        setStages(stages);
        return this;
    }

    /**
     * <p>
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run before
     * Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data Lifecycle Manager
     * initiates snapshot creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>pre-script</code> parameter before initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls the SSM
     * document with the <code>post-script</code> parameter after initiating snapshot creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before initiating snapshot
     * creation, and then it calls the SSM document again with the <code>post-script</code> parameter after initiating
     * snapshot creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: PRE and POST
     * </p>
     * 
     * @param stages
     *        Indicate which scripts Amazon Data Lifecycle Manager should run on target instances. Pre scripts run
     *        before Amazon Data Lifecycle Manager initiates snapshot creation. Post scripts run after Amazon Data
     *        Lifecycle Manager initiates snapshot creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To run a pre script only, specify <code>PRE</code>. In this case, Amazon Data Lifecycle Manager calls the
     *        SSM document with the <code>pre-script</code> parameter before initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run a post script only, specify <code>POST</code>. In this case, Amazon Data Lifecycle Manager calls
     *        the SSM document with the <code>post-script</code> parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To run both pre and post scripts, specify both <code>PRE</code> and <code>POST</code>. In this case,
     *        Amazon Data Lifecycle Manager calls the SSM document with the <code>pre-script</code> parameter before
     *        initiating snapshot creation, and then it calls the SSM document again with the <code>post-script</code>
     *        parameter after initiating snapshot creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: PRE and POST
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageValues
     */

    public Script withStages(StageValues... stages) {
        java.util.ArrayList<String> stagesCopy = new java.util.ArrayList<String>(stages.length);
        for (StageValues value : stages) {
            stagesCopy.add(value.toString());
        }
        if (getStages() == null) {
            setStages(stagesCopy);
        } else {
            getStages().addAll(stagesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the service used to execute the pre and/or post scripts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA workloads,
     * specify <code>AWS_SYSTEMS_MANAGER</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: AWS_SYSTEMS_MANAGER
     * </p>
     * 
     * @param executionHandlerService
     *        Indicates the service used to execute the pre and/or post scripts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA
     *        workloads, specify <code>AWS_SYSTEMS_MANAGER</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: AWS_SYSTEMS_MANAGER
     * @see ExecutionHandlerServiceValues
     */

    public void setExecutionHandlerService(String executionHandlerService) {
        this.executionHandlerService = executionHandlerService;
    }

    /**
     * <p>
     * Indicates the service used to execute the pre and/or post scripts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA workloads,
     * specify <code>AWS_SYSTEMS_MANAGER</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: AWS_SYSTEMS_MANAGER
     * </p>
     * 
     * @return Indicates the service used to execute the pre and/or post scripts.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA
     *         workloads, specify <code>AWS_SYSTEMS_MANAGER</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are automating VSS Backups, omit this parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: AWS_SYSTEMS_MANAGER
     * @see ExecutionHandlerServiceValues
     */

    public String getExecutionHandlerService() {
        return this.executionHandlerService;
    }

    /**
     * <p>
     * Indicates the service used to execute the pre and/or post scripts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA workloads,
     * specify <code>AWS_SYSTEMS_MANAGER</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: AWS_SYSTEMS_MANAGER
     * </p>
     * 
     * @param executionHandlerService
     *        Indicates the service used to execute the pre and/or post scripts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA
     *        workloads, specify <code>AWS_SYSTEMS_MANAGER</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: AWS_SYSTEMS_MANAGER
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionHandlerServiceValues
     */

    public Script withExecutionHandlerService(String executionHandlerService) {
        setExecutionHandlerService(executionHandlerService);
        return this;
    }

    /**
     * <p>
     * Indicates the service used to execute the pre and/or post scripts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA workloads,
     * specify <code>AWS_SYSTEMS_MANAGER</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: AWS_SYSTEMS_MANAGER
     * </p>
     * 
     * @param executionHandlerService
     *        Indicates the service used to execute the pre and/or post scripts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are using custom SSM documents or automating application-consistent snapshots of SAP HANA
     *        workloads, specify <code>AWS_SYSTEMS_MANAGER</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: AWS_SYSTEMS_MANAGER
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionHandlerServiceValues
     */

    public Script withExecutionHandlerService(ExecutionHandlerServiceValues executionHandlerService) {
        this.executionHandlerService = executionHandlerService.toString();
        return this;
    }

    /**
     * <p>
     * The SSM document that includes the pre and/or post scripts to run.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data Lifecycle
     * Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     * <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document. If you
     * are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executionHandler
     *        The SSM document that includes the pre and/or post scripts to run.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data
     *        Lifecycle Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are automating application-consistent snapshots for SAP HANA workloads, specify
     *        <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document.
     *        If you are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     *        </p>
     *        </li>
     */

    public void setExecutionHandler(String executionHandler) {
        this.executionHandler = executionHandler;
    }

    /**
     * <p>
     * The SSM document that includes the pre and/or post scripts to run.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data Lifecycle
     * Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     * <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document. If you
     * are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The SSM document that includes the pre and/or post scripts to run.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data
     *         Lifecycle Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are automating application-consistent snapshots for SAP HANA workloads, specify
     *         <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document.
     *         If you are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     *         </p>
     *         </li>
     */

    public String getExecutionHandler() {
        return this.executionHandler;
    }

    /**
     * <p>
     * The SSM document that includes the pre and/or post scripts to run.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data Lifecycle
     * Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     * <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document. If you
     * are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executionHandler
     *        The SSM document that includes the pre and/or post scripts to run.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are automating VSS backups, specify <code>AWS_VSS_BACKUP</code>. In this case, Amazon Data
     *        Lifecycle Manager automatically uses the <code>AWSEC2-CreateVssSnapshot</code> SSM document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are automating application-consistent snapshots for SAP HANA workloads, specify
     *        <code>AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using a custom SSM document that you own, specify either the name or ARN of the SSM document.
     *        If you are using a custom SSM document that is shared with you, specify the ARN of the SSM document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withExecutionHandler(String executionHandler) {
        setExecutionHandler(executionHandler);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre script
     * fails.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is supported only if you run a pre script. If you run a post script only, omit this parameter.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param executeOperationOnScriptFailure
     *        Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre
     *        script fails.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is supported only if you run a pre script. If you run a post script only, omit this
     *        parameter.
     *        </p>
     *        <p>
     *        Default: true
     */

    public void setExecuteOperationOnScriptFailure(Boolean executeOperationOnScriptFailure) {
        this.executeOperationOnScriptFailure = executeOperationOnScriptFailure;
    }

    /**
     * <p>
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre script
     * fails.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is supported only if you run a pre script. If you run a post script only, omit this parameter.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre
     *         script fails.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is supported only if you run a pre script. If you run a post script only, omit this
     *         parameter.
     *         </p>
     *         <p>
     *         Default: true
     */

    public Boolean getExecuteOperationOnScriptFailure() {
        return this.executeOperationOnScriptFailure;
    }

    /**
     * <p>
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre script
     * fails.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is supported only if you run a pre script. If you run a post script only, omit this parameter.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param executeOperationOnScriptFailure
     *        Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre
     *        script fails.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is supported only if you run a pre script. If you run a post script only, omit this
     *        parameter.
     *        </p>
     *        <p>
     *        Default: true
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withExecuteOperationOnScriptFailure(Boolean executeOperationOnScriptFailure) {
        setExecuteOperationOnScriptFailure(executeOperationOnScriptFailure);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre script
     * fails.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is supported only if you run a pre script. If you run a post script only, omit this parameter.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots if the pre
     *         script fails.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To default to crash consistent snapshot if the pre script fails, specify <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To skip the instance for snapshot creation if the pre script fails, specify <code>false</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is supported only if you run a pre script. If you run a post script only, omit this
     *         parameter.
     *         </p>
     *         <p>
     *         Default: true
     */

    public Boolean isExecuteOperationOnScriptFailure() {
        return this.executeOperationOnScriptFailure;
    }

    /**
     * <p>
     * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run attempt if
     * it has not completed. If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
     * fails the attempt. The timeout period applies to the pre and post scripts individually.
     * </p>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: 10
     * </p>
     * 
     * @param executionTimeout
     *        Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run
     *        attempt if it has not completed. If a script does not complete within its timeout period, Amazon Data
     *        Lifecycle Manager fails the attempt. The timeout period applies to the pre and post scripts individually.
     *        </p>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: 10
     */

    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    /**
     * <p>
     * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run attempt if
     * it has not completed. If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
     * fails the attempt. The timeout period applies to the pre and post scripts individually.
     * </p>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: 10
     * </p>
     * 
     * @return Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run
     *         attempt if it has not completed. If a script does not complete within its timeout period, Amazon Data
     *         Lifecycle Manager fails the attempt. The timeout period applies to the pre and post scripts individually.
     *         </p>
     *         <p>
     *         If you are automating VSS Backups, omit this parameter.
     *         </p>
     *         <p>
     *         Default: 10
     */

    public Integer getExecutionTimeout() {
        return this.executionTimeout;
    }

    /**
     * <p>
     * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run attempt if
     * it has not completed. If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
     * fails the attempt. The timeout period applies to the pre and post scripts individually.
     * </p>
     * <p>
     * If you are automating VSS Backups, omit this parameter.
     * </p>
     * <p>
     * Default: 10
     * </p>
     * 
     * @param executionTimeout
     *        Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the script run
     *        attempt if it has not completed. If a script does not complete within its timeout period, Amazon Data
     *        Lifecycle Manager fails the attempt. The timeout period applies to the pre and post scripts individually.
     *        </p>
     *        <p>
     *        If you are automating VSS Backups, omit this parameter.
     *        </p>
     *        <p>
     *        Default: 10
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withExecutionTimeout(Integer executionTimeout) {
        setExecutionTimeout(executionTimeout);
        return this;
    }

    /**
     * <p>
     * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process, including
     * running the pre and post scripts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the pre
     * script will have completed and the snapshot might have been created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param maximumRetryCount
     *        Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process,
     *        including running the pre and post scripts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the
     *        pre script will have completed and the snapshot might have been created.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     *        </p>
     *        <p>
     *        Default: 0
     */

    public void setMaximumRetryCount(Integer maximumRetryCount) {
        this.maximumRetryCount = maximumRetryCount;
    }

    /**
     * <p>
     * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process, including
     * running the pre and post scripts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the pre
     * script will have completed and the snapshot might have been created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @return Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process,
     *         including running the pre and post scripts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the
     *         pre script will have completed and the snapshot might have been created.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     *         </p>
     *         <p>
     *         Default: 0
     */

    public Integer getMaximumRetryCount() {
        return this.maximumRetryCount;
    }

    /**
     * <p>
     * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process, including
     * running the pre and post scripts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the pre
     * script will have completed and the snapshot might have been created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param maximumRetryCount
     *        Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation process,
     *        including running the pre and post scripts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in this case, the
     *        pre script will have completed and the snapshot might have been created.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify <code>0</code>.
     *        </p>
     *        <p>
     *        Default: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withMaximumRetryCount(Integer maximumRetryCount) {
        setMaximumRetryCount(maximumRetryCount);
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
        if (getStages() != null)
            sb.append("Stages: ").append(getStages()).append(",");
        if (getExecutionHandlerService() != null)
            sb.append("ExecutionHandlerService: ").append(getExecutionHandlerService()).append(",");
        if (getExecutionHandler() != null)
            sb.append("ExecutionHandler: ").append(getExecutionHandler()).append(",");
        if (getExecuteOperationOnScriptFailure() != null)
            sb.append("ExecuteOperationOnScriptFailure: ").append(getExecuteOperationOnScriptFailure()).append(",");
        if (getExecutionTimeout() != null)
            sb.append("ExecutionTimeout: ").append(getExecutionTimeout()).append(",");
        if (getMaximumRetryCount() != null)
            sb.append("MaximumRetryCount: ").append(getMaximumRetryCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Script == false)
            return false;
        Script other = (Script) obj;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        if (other.getExecutionHandlerService() == null ^ this.getExecutionHandlerService() == null)
            return false;
        if (other.getExecutionHandlerService() != null && other.getExecutionHandlerService().equals(this.getExecutionHandlerService()) == false)
            return false;
        if (other.getExecutionHandler() == null ^ this.getExecutionHandler() == null)
            return false;
        if (other.getExecutionHandler() != null && other.getExecutionHandler().equals(this.getExecutionHandler()) == false)
            return false;
        if (other.getExecuteOperationOnScriptFailure() == null ^ this.getExecuteOperationOnScriptFailure() == null)
            return false;
        if (other.getExecuteOperationOnScriptFailure() != null
                && other.getExecuteOperationOnScriptFailure().equals(this.getExecuteOperationOnScriptFailure()) == false)
            return false;
        if (other.getExecutionTimeout() == null ^ this.getExecutionTimeout() == null)
            return false;
        if (other.getExecutionTimeout() != null && other.getExecutionTimeout().equals(this.getExecutionTimeout()) == false)
            return false;
        if (other.getMaximumRetryCount() == null ^ this.getMaximumRetryCount() == null)
            return false;
        if (other.getMaximumRetryCount() != null && other.getMaximumRetryCount().equals(this.getMaximumRetryCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        hashCode = prime * hashCode + ((getExecutionHandlerService() == null) ? 0 : getExecutionHandlerService().hashCode());
        hashCode = prime * hashCode + ((getExecutionHandler() == null) ? 0 : getExecutionHandler().hashCode());
        hashCode = prime * hashCode + ((getExecuteOperationOnScriptFailure() == null) ? 0 : getExecuteOperationOnScriptFailure().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimeout() == null) ? 0 : getExecutionTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryCount() == null) ? 0 : getMaximumRetryCount().hashCode());
        return hashCode;
    }

    @Override
    public Script clone() {
        try {
            return (Script) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ScriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
