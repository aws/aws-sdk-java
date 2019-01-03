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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an OTA update.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OTAUpdateInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OTA update ID.
     * </p>
     */
    private String otaUpdateId;
    /**
     * <p>
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;
    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * A description of the OTA update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     */
    private AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig;
    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things
     * specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a
     * thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is
     * added to a target group, even after the OTA update was completed by all things originally in the group.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     */
    private java.util.List<OTAUpdateFile> otaUpdateFiles;
    /**
     * <p>
     * The status of the OTA update.
     * </p>
     */
    private String otaUpdateStatus;
    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     */
    private String awsIotJobId;
    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     */
    private String awsIotJobArn;
    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     */
    private ErrorInfo errorInfo;
    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     */
    private java.util.Map<String, String> additionalParameters;

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @return The OTA update ID.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
        return this;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     */

    public void setOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @return The OTA update ARN.
     */

    public String getOtaUpdateArn() {
        return this.otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withOtaUpdateArn(String otaUpdateArn) {
        setOtaUpdateArn(otaUpdateArn);
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the OTA update was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @return The date when the OTA update was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the OTA update was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the OTA update was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     * 
     * @return The date when the OTA update was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the OTA update was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * 
     * @param description
     *        A description of the OTA update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * 
     * @return A description of the OTA update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * 
     * @param description
     *        A description of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * 
     * @return The targets of the OTA update.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * 
     * @param targets
     *        The targets of the OTA update.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * 
     * @param targets
     *        The targets of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     * 
     * @param awsJobExecutionsRolloutConfig
     *        Configuration for the rollout of OTA updates.
     */

    public void setAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     * 
     * @return Configuration for the rollout of OTA updates.
     */

    public AwsJobExecutionsRolloutConfig getAwsJobExecutionsRolloutConfig() {
        return this.awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     * 
     * @param awsJobExecutionsRolloutConfig
     *        Configuration for the rollout of OTA updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        setAwsJobExecutionsRolloutConfig(awsJobExecutionsRolloutConfig);
        return this;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things
     * specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a
     * thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is
     * added to a target group, even after the OTA update was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those
     *        things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     *        also be run on a thing when a change is detected in a target. For example, an OTA update will run on a
     *        thing when the thing is added to a target group, even after the OTA update was completed by all things
     *        originally in the group.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things
     * specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a
     * thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is
     * added to a target group, even after the OTA update was completed by all things originally in the group.
     * </p>
     * 
     * @return Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those
     *         things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     *         also be run on a thing when a change is detected in a target. For example, an OTA update will run on a
     *         thing when the thing is added to a target group, even after the OTA update was completed by all things
     *         originally in the group.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things
     * specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a
     * thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is
     * added to a target group, even after the OTA update was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those
     *        things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     *        also be run on a thing when a change is detected in a target. For example, an OTA update will run on a
     *        thing when the thing is added to a target group, even after the OTA update was completed by all things
     *        originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public OTAUpdateInfo withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things
     * specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a
     * thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is
     * added to a target group, even after the OTA update was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those
     *        things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     *        also be run on a thing when a change is detected in a target. For example, an OTA update will run on a
     *        thing when the thing is added to a target group, even after the OTA update was completed by all things
     *        originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public OTAUpdateInfo withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * 
     * @return A list of files associated with the OTA update.
     */

    public java.util.List<OTAUpdateFile> getOtaUpdateFiles() {
        return otaUpdateFiles;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * 
     * @param otaUpdateFiles
     *        A list of files associated with the OTA update.
     */

    public void setOtaUpdateFiles(java.util.Collection<OTAUpdateFile> otaUpdateFiles) {
        if (otaUpdateFiles == null) {
            this.otaUpdateFiles = null;
            return;
        }

        this.otaUpdateFiles = new java.util.ArrayList<OTAUpdateFile>(otaUpdateFiles);
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOtaUpdateFiles(java.util.Collection)} or {@link #withOtaUpdateFiles(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param otaUpdateFiles
     *        A list of files associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withOtaUpdateFiles(OTAUpdateFile... otaUpdateFiles) {
        if (this.otaUpdateFiles == null) {
            setOtaUpdateFiles(new java.util.ArrayList<OTAUpdateFile>(otaUpdateFiles.length));
        }
        for (OTAUpdateFile ele : otaUpdateFiles) {
            this.otaUpdateFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * 
     * @param otaUpdateFiles
     *        A list of files associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withOtaUpdateFiles(java.util.Collection<OTAUpdateFile> otaUpdateFiles) {
        setOtaUpdateFiles(otaUpdateFiles);
        return this;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The status of the OTA update.
     * @see OTAUpdateStatus
     */

    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * 
     * @return The status of the OTA update.
     * @see OTAUpdateStatus
     */

    public String getOtaUpdateStatus() {
        return this.otaUpdateStatus;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The status of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public OTAUpdateInfo withOtaUpdateStatus(String otaUpdateStatus) {
        setOtaUpdateStatus(otaUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The status of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public OTAUpdateInfo withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobId
     *        The AWS IoT job ID associated with the OTA update.
     */

    public void setAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @return The AWS IoT job ID associated with the OTA update.
     */

    public String getAwsIotJobId() {
        return this.awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobId
     *        The AWS IoT job ID associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withAwsIotJobId(String awsIotJobId) {
        setAwsIotJobId(awsIotJobId);
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobArn
     *        The AWS IoT job ARN associated with the OTA update.
     */

    public void setAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @return The AWS IoT job ARN associated with the OTA update.
     */

    public String getAwsIotJobArn() {
        return this.awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobArn
     *        The AWS IoT job ARN associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withAwsIotJobArn(String awsIotJobArn) {
        setAwsIotJobArn(awsIotJobArn);
        return this;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     * 
     * @param errorInfo
     *        Error information associated with the OTA update.
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     * 
     * @return Error information associated with the OTA update.
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     * 
     * @param errorInfo
     *        Error information associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     * 
     * @return A collection of name/value pairs
     */

    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     * 
     * @param additionalParameters
     *        A collection of name/value pairs
     */

    public void setAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     * 
     * @param additionalParameters
     *        A collection of name/value pairs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo withAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        setAdditionalParameters(additionalParameters);
        return this;
    }

    public OTAUpdateInfo addAdditionalParametersEntry(String key, String value) {
        if (null == this.additionalParameters) {
            this.additionalParameters = new java.util.HashMap<String, String>();
        }
        if (this.additionalParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateInfo clearAdditionalParametersEntries() {
        this.additionalParameters = null;
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
        if (getOtaUpdateId() != null)
            sb.append("OtaUpdateId: ").append(getOtaUpdateId()).append(",");
        if (getOtaUpdateArn() != null)
            sb.append("OtaUpdateArn: ").append(getOtaUpdateArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getAwsJobExecutionsRolloutConfig() != null)
            sb.append("AwsJobExecutionsRolloutConfig: ").append(getAwsJobExecutionsRolloutConfig()).append(",");
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
        if (getOtaUpdateFiles() != null)
            sb.append("OtaUpdateFiles: ").append(getOtaUpdateFiles()).append(",");
        if (getOtaUpdateStatus() != null)
            sb.append("OtaUpdateStatus: ").append(getOtaUpdateStatus()).append(",");
        if (getAwsIotJobId() != null)
            sb.append("AwsIotJobId: ").append(getAwsIotJobId()).append(",");
        if (getAwsIotJobArn() != null)
            sb.append("AwsIotJobArn: ").append(getAwsIotJobArn()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getAdditionalParameters() != null)
            sb.append("AdditionalParameters: ").append(getAdditionalParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateInfo == false)
            return false;
        OTAUpdateInfo other = (OTAUpdateInfo) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() == null ^ this.getAwsJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() != null
                && other.getAwsJobExecutionsRolloutConfig().equals(this.getAwsJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getOtaUpdateFiles() == null ^ this.getOtaUpdateFiles() == null)
            return false;
        if (other.getOtaUpdateFiles() != null && other.getOtaUpdateFiles().equals(this.getOtaUpdateFiles()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        if (other.getAwsIotJobId() == null ^ this.getAwsIotJobId() == null)
            return false;
        if (other.getAwsIotJobId() != null && other.getAwsIotJobId().equals(this.getAwsIotJobId()) == false)
            return false;
        if (other.getAwsIotJobArn() == null ^ this.getAwsIotJobArn() == null)
            return false;
        if (other.getAwsIotJobArn() != null && other.getAwsIotJobArn().equals(this.getAwsIotJobArn()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getAdditionalParameters() == null ^ this.getAdditionalParameters() == null)
            return false;
        if (other.getAdditionalParameters() != null && other.getAdditionalParameters().equals(this.getAdditionalParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getAwsJobExecutionsRolloutConfig() == null) ? 0 : getAwsJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateFiles() == null) ? 0 : getOtaUpdateFiles().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getAwsIotJobId() == null) ? 0 : getAwsIotJobId().hashCode());
        hashCode = prime * hashCode + ((getAwsIotJobArn() == null) ? 0 : getAwsIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getAdditionalParameters() == null) ? 0 : getAdditionalParameters().hashCode());
        return hashCode;
    }

    @Override
    public OTAUpdateInfo clone() {
        try {
            return (OTAUpdateInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.OTAUpdateInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
