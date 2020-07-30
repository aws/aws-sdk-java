/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a stage for a batch build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildBatchPhase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildBatchPhase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>COMBINE_ARTIFACTS</dt>
     * <dd>
     * <p>
     * Build output artifacts are being combined and uploaded to the output location.
     * </p>
     * </dd>
     * <dt>DOWNLOAD_BATCHSPEC</dt>
     * <dd>
     * <p>
     * The batch build specification is being downloaded.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * One or more of the builds failed.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The batch build is in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The batch build was stopped.
     * </p>
     * </dd>
     * <dt>SUBMITTED</dt>
     * <dd>
     * <p>
     * The btach build has been submitted.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The batch build succeeded.
     * </p>
     * </dd>
     * </dl>
     */
    private String phaseType;
    /**
     * <p>
     * The current status of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build phase failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build phase faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build phase is still in progress.
     * </p>
     * </dd>
     * <dt>QUEUED</dt>
     * <dd>
     * <p>
     * The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build phase stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build phase succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build phase timed out.
     * </p>
     * </dd>
     * </dl>
     */
    private String phaseStatus;
    /**
     * <p>
     * When the batch build phase started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the batch build phase ended, expressed in Unix time format.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the batch build's phase.
     * </p>
     */
    private Long durationInSeconds;
    /**
     * <p>
     * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * </p>
     */
    private java.util.List<PhaseContext> contexts;

    /**
     * <p>
     * The name of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>COMBINE_ARTIFACTS</dt>
     * <dd>
     * <p>
     * Build output artifacts are being combined and uploaded to the output location.
     * </p>
     * </dd>
     * <dt>DOWNLOAD_BATCHSPEC</dt>
     * <dd>
     * <p>
     * The batch build specification is being downloaded.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * One or more of the builds failed.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The batch build is in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The batch build was stopped.
     * </p>
     * </dd>
     * <dt>SUBMITTED</dt>
     * <dd>
     * <p>
     * The btach build has been submitted.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The batch build succeeded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseType
     *        The name of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>COMBINE_ARTIFACTS</dt>
     *        <dd>
     *        <p>
     *        Build output artifacts are being combined and uploaded to the output location.
     *        </p>
     *        </dd>
     *        <dt>DOWNLOAD_BATCHSPEC</dt>
     *        <dd>
     *        <p>
     *        The batch build specification is being downloaded.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        One or more of the builds failed.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The batch build is in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The batch build was stopped.
     *        </p>
     *        </dd>
     *        <dt>SUBMITTED</dt>
     *        <dd>
     *        <p>
     *        The btach build has been submitted.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The batch build succeeded.
     *        </p>
     *        </dd>
     * @see BuildBatchPhaseType
     */

    public void setPhaseType(String phaseType) {
        this.phaseType = phaseType;
    }

    /**
     * <p>
     * The name of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>COMBINE_ARTIFACTS</dt>
     * <dd>
     * <p>
     * Build output artifacts are being combined and uploaded to the output location.
     * </p>
     * </dd>
     * <dt>DOWNLOAD_BATCHSPEC</dt>
     * <dd>
     * <p>
     * The batch build specification is being downloaded.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * One or more of the builds failed.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The batch build is in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The batch build was stopped.
     * </p>
     * </dd>
     * <dt>SUBMITTED</dt>
     * <dd>
     * <p>
     * The btach build has been submitted.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The batch build succeeded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The name of the batch build phase. Valid values include:</p>
     *         <dl>
     *         <dt>COMBINE_ARTIFACTS</dt>
     *         <dd>
     *         <p>
     *         Build output artifacts are being combined and uploaded to the output location.
     *         </p>
     *         </dd>
     *         <dt>DOWNLOAD_BATCHSPEC</dt>
     *         <dd>
     *         <p>
     *         The batch build specification is being downloaded.
     *         </p>
     *         </dd>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         One or more of the builds failed.
     *         </p>
     *         </dd>
     *         <dt>IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The batch build is in progress.
     *         </p>
     *         </dd>
     *         <dt>STOPPED</dt>
     *         <dd>
     *         <p>
     *         The batch build was stopped.
     *         </p>
     *         </dd>
     *         <dt>SUBMITTED</dt>
     *         <dd>
     *         <p>
     *         The btach build has been submitted.
     *         </p>
     *         </dd>
     *         <dt>SUCCEEDED</dt>
     *         <dd>
     *         <p>
     *         The batch build succeeded.
     *         </p>
     *         </dd>
     * @see BuildBatchPhaseType
     */

    public String getPhaseType() {
        return this.phaseType;
    }

    /**
     * <p>
     * The name of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>COMBINE_ARTIFACTS</dt>
     * <dd>
     * <p>
     * Build output artifacts are being combined and uploaded to the output location.
     * </p>
     * </dd>
     * <dt>DOWNLOAD_BATCHSPEC</dt>
     * <dd>
     * <p>
     * The batch build specification is being downloaded.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * One or more of the builds failed.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The batch build is in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The batch build was stopped.
     * </p>
     * </dd>
     * <dt>SUBMITTED</dt>
     * <dd>
     * <p>
     * The btach build has been submitted.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The batch build succeeded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseType
     *        The name of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>COMBINE_ARTIFACTS</dt>
     *        <dd>
     *        <p>
     *        Build output artifacts are being combined and uploaded to the output location.
     *        </p>
     *        </dd>
     *        <dt>DOWNLOAD_BATCHSPEC</dt>
     *        <dd>
     *        <p>
     *        The batch build specification is being downloaded.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        One or more of the builds failed.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The batch build is in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The batch build was stopped.
     *        </p>
     *        </dd>
     *        <dt>SUBMITTED</dt>
     *        <dd>
     *        <p>
     *        The btach build has been submitted.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The batch build succeeded.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildBatchPhaseType
     */

    public BuildBatchPhase withPhaseType(String phaseType) {
        setPhaseType(phaseType);
        return this;
    }

    /**
     * <p>
     * The name of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>COMBINE_ARTIFACTS</dt>
     * <dd>
     * <p>
     * Build output artifacts are being combined and uploaded to the output location.
     * </p>
     * </dd>
     * <dt>DOWNLOAD_BATCHSPEC</dt>
     * <dd>
     * <p>
     * The batch build specification is being downloaded.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * One or more of the builds failed.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The batch build is in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The batch build was stopped.
     * </p>
     * </dd>
     * <dt>SUBMITTED</dt>
     * <dd>
     * <p>
     * The btach build has been submitted.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The batch build succeeded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseType
     *        The name of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>COMBINE_ARTIFACTS</dt>
     *        <dd>
     *        <p>
     *        Build output artifacts are being combined and uploaded to the output location.
     *        </p>
     *        </dd>
     *        <dt>DOWNLOAD_BATCHSPEC</dt>
     *        <dd>
     *        <p>
     *        The batch build specification is being downloaded.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        One or more of the builds failed.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The batch build is in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The batch build was stopped.
     *        </p>
     *        </dd>
     *        <dt>SUBMITTED</dt>
     *        <dd>
     *        <p>
     *        The btach build has been submitted.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The batch build succeeded.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildBatchPhaseType
     */

    public BuildBatchPhase withPhaseType(BuildBatchPhaseType phaseType) {
        this.phaseType = phaseType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build phase failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build phase faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build phase is still in progress.
     * </p>
     * </dd>
     * <dt>QUEUED</dt>
     * <dd>
     * <p>
     * The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build phase stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build phase succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build phase timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseStatus
     *        The current status of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build phase failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build phase faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build phase is still in progress.
     *        </p>
     *        </dd>
     *        <dt>QUEUED</dt>
     *        <dd>
     *        <p>
     *        The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build phase stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build phase succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build phase timed out.
     *        </p>
     *        </dd>
     * @see StatusType
     */

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    /**
     * <p>
     * The current status of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build phase failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build phase faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build phase is still in progress.
     * </p>
     * </dd>
     * <dt>QUEUED</dt>
     * <dd>
     * <p>
     * The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build phase stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build phase succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build phase timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The current status of the batch build phase. Valid values include:</p>
     *         <dl>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The build phase failed.
     *         </p>
     *         </dd>
     *         <dt>FAULT</dt>
     *         <dd>
     *         <p>
     *         The build phase faulted.
     *         </p>
     *         </dd>
     *         <dt>IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The build phase is still in progress.
     *         </p>
     *         </dd>
     *         <dt>QUEUED</dt>
     *         <dd>
     *         <p>
     *         The build has been submitted and is queued behind other submitted builds.
     *         </p>
     *         </dd>
     *         <dt>STOPPED</dt>
     *         <dd>
     *         <p>
     *         The build phase stopped.
     *         </p>
     *         </dd>
     *         <dt>SUCCEEDED</dt>
     *         <dd>
     *         <p>
     *         The build phase succeeded.
     *         </p>
     *         </dd>
     *         <dt>TIMED_OUT</dt>
     *         <dd>
     *         <p>
     *         The build phase timed out.
     *         </p>
     *         </dd>
     * @see StatusType
     */

    public String getPhaseStatus() {
        return this.phaseStatus;
    }

    /**
     * <p>
     * The current status of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build phase failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build phase faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build phase is still in progress.
     * </p>
     * </dd>
     * <dt>QUEUED</dt>
     * <dd>
     * <p>
     * The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build phase stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build phase succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build phase timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseStatus
     *        The current status of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build phase failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build phase faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build phase is still in progress.
     *        </p>
     *        </dd>
     *        <dt>QUEUED</dt>
     *        <dd>
     *        <p>
     *        The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build phase stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build phase succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build phase timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildBatchPhase withPhaseStatus(String phaseStatus) {
        setPhaseStatus(phaseStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the batch build phase. Valid values include:
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build phase failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build phase faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build phase is still in progress.
     * </p>
     * </dd>
     * <dt>QUEUED</dt>
     * <dd>
     * <p>
     * The build has been submitted and is queued behind other submitted builds.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build phase stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build phase succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build phase timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param phaseStatus
     *        The current status of the batch build phase. Valid values include:</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build phase failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build phase faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build phase is still in progress.
     *        </p>
     *        </dd>
     *        <dt>QUEUED</dt>
     *        <dd>
     *        <p>
     *        The build has been submitted and is queued behind other submitted builds.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build phase stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build phase succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build phase timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildBatchPhase withPhaseStatus(StatusType phaseStatus) {
        this.phaseStatus = phaseStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the batch build phase started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the batch build phase started, expressed in Unix time format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the batch build phase started, expressed in Unix time format.
     * </p>
     * 
     * @return When the batch build phase started, expressed in Unix time format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the batch build phase started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the batch build phase started, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatchPhase withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the batch build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the batch build phase ended, expressed in Unix time format.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the batch build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @return When the batch build phase ended, expressed in Unix time format.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the batch build phase ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the batch build phase ended, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatchPhase withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the batch build's phase.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, between the starting and ending times of the batch build's phase.
     */

    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the batch build's phase.
     * </p>
     * 
     * @return How long, in seconds, between the starting and ending times of the batch build's phase.
     */

    public Long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the batch build's phase.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, between the starting and ending times of the batch build's phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatchPhase withDurationInSeconds(Long durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * </p>
     * 
     * @return Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     */

    public java.util.List<PhaseContext> getContexts() {
        return contexts;
    }

    /**
     * <p>
     * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * </p>
     * 
     * @param contexts
     *        Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
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
     * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContexts(java.util.Collection)} or {@link #withContexts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contexts
     *        Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatchPhase withContexts(PhaseContext... contexts) {
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
     * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * </p>
     * 
     * @param contexts
     *        Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatchPhase withContexts(java.util.Collection<PhaseContext> contexts) {
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

        if (obj instanceof BuildBatchPhase == false)
            return false;
        BuildBatchPhase other = (BuildBatchPhase) obj;
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
    public BuildBatchPhase clone() {
        try {
            return (BuildBatchPhase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildBatchPhaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
