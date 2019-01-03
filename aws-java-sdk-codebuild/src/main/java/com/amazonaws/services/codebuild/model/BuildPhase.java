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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a stage for a build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildPhase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildPhase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     */
    private String phaseType;
    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     */
    private String phaseStatus;
    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the build's phase.
     * </p>
     */
    private Long durationInSeconds;
    /**
     * <p>
     * Additional information about a build phase, especially to help troubleshoot a failed build.
     * </p>
     */
    private java.util.List<PhaseContext> contexts;

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseType
     *        The name of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD</code>: Core build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The build has been completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINALIZING</code>: The build process is completing in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTALL</code>: Installation activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: The build environment is being set up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: The build has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     *        </p>
     *        </li>
     * @see BuildPhaseType
     */

    public void setPhaseType(String phaseType) {
        this.phaseType = phaseType;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the build phase. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD</code>: Core build activities typically occur in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>: The build has been completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FINALIZING</code>: The build process is completing in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTALL</code>: Installation activities typically occur in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code>: The build environment is being set up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBMITTED</code>: The build has been submitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     *         </p>
     *         </li>
     * @see BuildPhaseType
     */

    public String getPhaseType() {
        return this.phaseType;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseType
     *        The name of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD</code>: Core build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The build has been completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINALIZING</code>: The build process is completing in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTALL</code>: Installation activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: The build environment is being set up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: The build has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildPhaseType
     */

    public BuildPhase withPhaseType(String phaseType) {
        setPhaseType(phaseType);
        return this;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseType
     *        The name of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD</code>: Core build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The build has been completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINALIZING</code>: The build process is completing in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTALL</code>: Installation activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: The build environment is being set up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: The build has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     *        </p>
     *        </li>
     * @see BuildPhaseType
     */

    public void setPhaseType(BuildPhaseType phaseType) {
        withPhaseType(phaseType);
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseType
     *        The name of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD</code>: Core build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The build has been completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINALIZING</code>: The build process is completing in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTALL</code>: Installation activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_BUILD</code>: Post-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRE_BUILD</code>: Pre-build activities typically occur in this build phase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: The build environment is being set up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: The build has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded to the output location.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildPhaseType
     */

    public BuildPhase withPhaseType(BuildPhaseType phaseType) {
        this.phaseType = phaseType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseStatus
     *        The current status of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build phase failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build phase faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build phase is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build phase stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build phase succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build phase timed out.
     *        </p>
     *        </li>
     * @see StatusType
     */

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the build phase. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The build phase failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAULT</code>: The build phase faulted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The build phase is still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The build phase stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The build phase succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMED_OUT</code>: The build phase timed out.
     *         </p>
     *         </li>
     * @see StatusType
     */

    public String getPhaseStatus() {
        return this.phaseStatus;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseStatus
     *        The current status of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build phase failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build phase faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build phase is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build phase stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build phase succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build phase timed out.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildPhase withPhaseStatus(String phaseStatus) {
        setPhaseStatus(phaseStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseStatus
     *        The current status of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build phase failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build phase faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build phase is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build phase stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build phase succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build phase timed out.
     *        </p>
     *        </li>
     * @see StatusType
     */

    public void setPhaseStatus(StatusType phaseStatus) {
        withPhaseStatus(phaseStatus);
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phaseStatus
     *        The current status of the build phase. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build phase failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build phase faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build phase is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code>: The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build phase stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build phase succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build phase timed out.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildPhase withPhaseStatus(StatusType phaseStatus) {
        this.phaseStatus = phaseStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the build phase started, expressed in Unix time format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     * 
     * @return When the build phase started, expressed in Unix time format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the build phase started, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildPhase withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the build phase ended, expressed in Unix time format.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @return When the build phase ended, expressed in Unix time format.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the build phase ended, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildPhase withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the build's phase.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, between the starting and ending times of the build's phase.
     */

    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the build's phase.
     * </p>
     * 
     * @return How long, in seconds, between the starting and ending times of the build's phase.
     */

    public Long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the build's phase.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, between the starting and ending times of the build's phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildPhase withDurationInSeconds(Long durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help troubleshoot a failed build.
     * </p>
     * 
     * @return Additional information about a build phase, especially to help troubleshoot a failed build.
     */

    public java.util.List<PhaseContext> getContexts() {
        return contexts;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help troubleshoot a failed build.
     * </p>
     * 
     * @param contexts
     *        Additional information about a build phase, especially to help troubleshoot a failed build.
     */

    public void setContexts(java.util.Collection<PhaseContext> contexts) {
        if (contexts == null) {
            this.contexts = null;
            return;
        }

        this.contexts = new java.util.ArrayList<PhaseContext>(contexts);
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help troubleshoot a failed build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContexts(java.util.Collection)} or {@link #withContexts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contexts
     *        Additional information about a build phase, especially to help troubleshoot a failed build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildPhase withContexts(PhaseContext... contexts) {
        if (this.contexts == null) {
            setContexts(new java.util.ArrayList<PhaseContext>(contexts.length));
        }
        for (PhaseContext ele : contexts) {
            this.contexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help troubleshoot a failed build.
     * </p>
     * 
     * @param contexts
     *        Additional information about a build phase, especially to help troubleshoot a failed build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildPhase withContexts(java.util.Collection<PhaseContext> contexts) {
        setContexts(contexts);
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
        if (getPhaseType() != null)
            sb.append("PhaseType: ").append(getPhaseType()).append(",");
        if (getPhaseStatus() != null)
            sb.append("PhaseStatus: ").append(getPhaseStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getContexts() != null)
            sb.append("Contexts: ").append(getContexts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildPhase == false)
            return false;
        BuildPhase other = (BuildPhase) obj;
        if (other.getPhaseType() == null ^ this.getPhaseType() == null)
            return false;
        if (other.getPhaseType() != null && other.getPhaseType().equals(this.getPhaseType()) == false)
            return false;
        if (other.getPhaseStatus() == null ^ this.getPhaseStatus() == null)
            return false;
        if (other.getPhaseStatus() != null && other.getPhaseStatus().equals(this.getPhaseStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getContexts() == null ^ this.getContexts() == null)
            return false;
        if (other.getContexts() != null && other.getContexts().equals(this.getContexts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhaseType() == null) ? 0 : getPhaseType().hashCode());
        hashCode = prime * hashCode + ((getPhaseStatus() == null) ? 0 : getPhaseStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getContexts() == null) ? 0 : getContexts().hashCode());
        return hashCode;
    }

    @Override
    public BuildPhase clone() {
        try {
            return (BuildPhase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildPhaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
