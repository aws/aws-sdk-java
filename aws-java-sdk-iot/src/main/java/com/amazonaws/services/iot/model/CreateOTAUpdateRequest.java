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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOTAUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     */
    private String otaUpdateId;
    /**
     * <p>
     * The description of the OTA update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The targeted devices to receive OTA updates.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     * specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on a thing when the thing is added to a
     * target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS
     * | SNAPSHOT.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     */
    private AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig;
    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     */
    private java.util.List<OTAUpdateFile> files;
    /**
     * <p>
     * The IAM role that allows access to the AWS IoT Jobs service.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> additionalParameters;
    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * 
     * @param otaUpdateId
     *        The ID of the OTA update to be created.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * 
     * @return The ID of the OTA update to be created.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * 
     * @param otaUpdateId
     *        The ID of the OTA update to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
        return this;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * 
     * @param description
     *        The description of the OTA update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * 
     * @return The description of the OTA update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * 
     * @param description
     *        The description of the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The targeted devices to receive OTA updates.
     * </p>
     * 
     * @return The targeted devices to receive OTA updates.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targeted devices to receive OTA updates.
     * </p>
     * 
     * @param targets
     *        The targeted devices to receive OTA updates.
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
     * The targeted devices to receive OTA updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targeted devices to receive OTA updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withTargets(String... targets) {
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
     * The targeted devices to receive OTA updates.
     * </p>
     * 
     * @param targets
     *        The targeted devices to receive OTA updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     * specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on a thing when the thing is added to a
     * target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS
     * | SNAPSHOT.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     *        specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a
     *        thing when a change is detected in a target. For example, an update will run on a thing when the thing is
     *        added to a target group, even after the update was completed by all things originally in the group. Valid
     *        values: CONTINUOUS | SNAPSHOT.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     * specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on a thing when the thing is added to a
     * target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS
     * | SNAPSHOT.
     * </p>
     * 
     * @return Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     *         specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a
     *         thing when a change is detected in a target. For example, an update will run on a thing when the thing is
     *         added to a target group, even after the update was completed by all things originally in the group. Valid
     *         values: CONTINUOUS | SNAPSHOT.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     * specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on a thing when the thing is added to a
     * target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS
     * | SNAPSHOT.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     *        specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a
     *        thing when a change is detected in a target. For example, an update will run on a thing when the thing is
     *        added to a target group, even after the update was completed by all things originally in the group. Valid
     *        values: CONTINUOUS | SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public CreateOTAUpdateRequest withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     * specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on a thing when the thing is added to a
     * target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS
     * | SNAPSHOT.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things
     *        specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a
     *        thing when a change is detected in a target. For example, an update will run on a thing when the thing is
     *        added to a target group, even after the update was completed by all things originally in the group. Valid
     *        values: CONTINUOUS | SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public CreateOTAUpdateRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
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

    public CreateOTAUpdateRequest withAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        setAwsJobExecutionsRolloutConfig(awsJobExecutionsRolloutConfig);
        return this;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * 
     * @return The files to be streamed by the OTA update.
     */

    public java.util.List<OTAUpdateFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * 
     * @param files
     *        The files to be streamed by the OTA update.
     */

    public void setFiles(java.util.Collection<OTAUpdateFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<OTAUpdateFile>(files);
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        The files to be streamed by the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withFiles(OTAUpdateFile... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<OTAUpdateFile>(files.length));
        }
        for (OTAUpdateFile ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * 
     * @param files
     *        The files to be streamed by the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withFiles(java.util.Collection<OTAUpdateFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The IAM role that allows access to the AWS IoT Jobs service.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the AWS IoT Jobs service.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the AWS IoT Jobs service.
     * </p>
     * 
     * @return The IAM role that allows access to the AWS IoT Jobs service.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the AWS IoT Jobs service.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the AWS IoT Jobs service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     * 
     * @return A list of additional OTA update parameters which are name-value pairs.
     */

    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     * 
     * @param additionalParameters
     *        A list of additional OTA update parameters which are name-value pairs.
     */

    public void setAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     * 
     * @param additionalParameters
     *        A list of additional OTA update parameters which are name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        setAdditionalParameters(additionalParameters);
        return this;
    }

    public CreateOTAUpdateRequest addAdditionalParametersEntry(String key, String value) {
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

    public CreateOTAUpdateRequest clearAdditionalParametersEntries() {
        this.additionalParameters = null;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * 
     * @return Metadata which can be used to manage updates.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage updates.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
        if (getAwsJobExecutionsRolloutConfig() != null)
            sb.append("AwsJobExecutionsRolloutConfig: ").append(getAwsJobExecutionsRolloutConfig()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAdditionalParameters() != null)
            sb.append("AdditionalParameters: ").append(getAdditionalParameters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOTAUpdateRequest == false)
            return false;
        CreateOTAUpdateRequest other = (CreateOTAUpdateRequest) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() == null ^ this.getAwsJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() != null
                && other.getAwsJobExecutionsRolloutConfig().equals(this.getAwsJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAdditionalParameters() == null ^ this.getAdditionalParameters() == null)
            return false;
        if (other.getAdditionalParameters() != null && other.getAdditionalParameters().equals(this.getAdditionalParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getAwsJobExecutionsRolloutConfig() == null) ? 0 : getAwsJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAdditionalParameters() == null) ? 0 : getAdditionalParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateOTAUpdateRequest clone() {
        return (CreateOTAUpdateRequest) super.clone();
    }

}
