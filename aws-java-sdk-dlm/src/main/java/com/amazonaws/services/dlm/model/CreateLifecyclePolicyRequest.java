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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The activation state of the lifecycle policy after creation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * <important>
     * <p>
     * If you create a default policy, you can specify the request parameters either in the request body, or in the
     * PolicyDetails request structure, but not both.
     * </p>
     * </important>
     */
    private PolicyDetails policyDetails;
    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * <b>[Default policies only]</b> Specify the type of default policy to create.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do not
     * have recent backups, specify <code>VOLUME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the Region
     * that do not have recent backups, specify <code>INSTANCE</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String defaultPolicy;
    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     * creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer createInterval;
    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before deleting
     * them. The retention period can range from 2 to 14 days, but it must be greater than the creation frequency to
     * ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not specify a value, the
     * default is 7.
     * </p>
     * <p>
     * Default: 7
     * </p>
     */
    private Integer retainInterval;
    /**
     * <p>
     * <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to the
     * snapshot or AMI. If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source volume
     * or instance is deleted, or if the policy enters the error, disabled, or deleted state.
     * </p>
     * <p>
     * By default (<b>ExtendDeletion=false</b>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     * snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you want
     * Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting snapshots
     * and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs, including the last
     * one, if the policy enters one of these states, specify <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors simultaneously.
     * </p>
     * <p>
     * If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean extendDeletion;
    /**
     * <p>
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     */
    private java.util.List<CrossRegionCopyTarget> crossRegionCopyTargets;
    /**
     * <p>
     * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want
     * to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of
     * the specified exclusion parameters.
     * </p>
     */
    private Exclusions exclusions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *         policy.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @return A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @return The activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public CreateLifecyclePolicyRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public CreateLifecyclePolicyRequest withState(SettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * <important>
     * <p>
     * If you create a default policy, you can specify the request parameters either in the request body, or in the
     * PolicyDetails request structure, but not both.
     * </p>
     * </important>
     * 
     * @param policyDetails
     *        The configuration details of the lifecycle policy.</p> <important>
     *        <p>
     *        If you create a default policy, you can specify the request parameters either in the request body, or in
     *        the PolicyDetails request structure, but not both.
     *        </p>
     */

    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * <important>
     * <p>
     * If you create a default policy, you can specify the request parameters either in the request body, or in the
     * PolicyDetails request structure, but not both.
     * </p>
     * </important>
     * 
     * @return The configuration details of the lifecycle policy.</p> <important>
     *         <p>
     *         If you create a default policy, you can specify the request parameters either in the request body, or in
     *         the PolicyDetails request structure, but not both.
     *         </p>
     */

    public PolicyDetails getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * <important>
     * <p>
     * If you create a default policy, you can specify the request parameters either in the request body, or in the
     * PolicyDetails request structure, but not both.
     * </p>
     * </important>
     * 
     * @param policyDetails
     *        The configuration details of the lifecycle policy.</p> <important>
     *        <p>
     *        If you create a default policy, you can specify the request parameters either in the request body, or in
     *        the PolicyDetails request structure, but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withPolicyDetails(PolicyDetails policyDetails) {
        setPolicyDetails(policyDetails);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @return The tags to apply to the lifecycle policy during creation.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the lifecycle policy during creation.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the lifecycle policy during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLifecyclePolicyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specify the type of default policy to create.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do not
     * have recent backups, specify <code>VOLUME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the Region
     * that do not have recent backups, specify <code>INSTANCE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultPolicy
     *        <b>[Default policies only]</b> Specify the type of default policy to create.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do
     *        not have recent backups, specify <code>VOLUME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the
     *        Region that do not have recent backups, specify <code>INSTANCE</code>.
     *        </p>
     *        </li>
     * @see DefaultPolicyTypeValues
     */

    public void setDefaultPolicy(String defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specify the type of default policy to create.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do not
     * have recent backups, specify <code>VOLUME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the Region
     * that do not have recent backups, specify <code>INSTANCE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <b>[Default policies only]</b> Specify the type of default policy to create.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do
     *         not have recent backups, specify <code>VOLUME</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the
     *         Region that do not have recent backups, specify <code>INSTANCE</code>.
     *         </p>
     *         </li>
     * @see DefaultPolicyTypeValues
     */

    public String getDefaultPolicy() {
        return this.defaultPolicy;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specify the type of default policy to create.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do not
     * have recent backups, specify <code>VOLUME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the Region
     * that do not have recent backups, specify <code>INSTANCE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultPolicy
     *        <b>[Default policies only]</b> Specify the type of default policy to create.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do
     *        not have recent backups, specify <code>VOLUME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the
     *        Region that do not have recent backups, specify <code>INSTANCE</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultPolicyTypeValues
     */

    public CreateLifecyclePolicyRequest withDefaultPolicy(String defaultPolicy) {
        setDefaultPolicy(defaultPolicy);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specify the type of default policy to create.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do not
     * have recent backups, specify <code>VOLUME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the Region
     * that do not have recent backups, specify <code>INSTANCE</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultPolicy
     *        <b>[Default policies only]</b> Specify the type of default policy to create.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To create a default policy for EBS snapshots, that creates snapshots of all volumes in the Region that do
     *        not have recent backups, specify <code>VOLUME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all instances in the
     *        Region that do not have recent backups, specify <code>INSTANCE</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultPolicyTypeValues
     */

    public CreateLifecyclePolicyRequest withDefaultPolicy(DefaultPolicyTypeValues defaultPolicy) {
        this.defaultPolicy = defaultPolicy.toString();
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     * creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param createInterval
     *        <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     *        creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.</p>
     *        <p>
     *        Default: 1
     */

    public void setCreateInterval(Integer createInterval) {
        this.createInterval = createInterval;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     * creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs.
     *         The creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getCreateInterval() {
        return this.createInterval;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     * creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param createInterval
     *        <b>[Default policies only]</b> Specifies how often the policy should run and create snapshots or AMIs. The
     *        creation frequency can range from 1 to 7 days. If you do not specify a value, the default is 1.</p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withCreateInterval(Integer createInterval) {
        setCreateInterval(createInterval);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before deleting
     * them. The retention period can range from 2 to 14 days, but it must be greater than the creation frequency to
     * ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not specify a value, the
     * default is 7.
     * </p>
     * <p>
     * Default: 7
     * </p>
     * 
     * @param retainInterval
     *        <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before
     *        deleting them. The retention period can range from 2 to 14 days, but it must be greater than the creation
     *        frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not
     *        specify a value, the default is 7.</p>
     *        <p>
     *        Default: 7
     */

    public void setRetainInterval(Integer retainInterval) {
        this.retainInterval = retainInterval;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before deleting
     * them. The retention period can range from 2 to 14 days, but it must be greater than the creation frequency to
     * ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not specify a value, the
     * default is 7.
     * </p>
     * <p>
     * Default: 7
     * </p>
     * 
     * @return <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before
     *         deleting them. The retention period can range from 2 to 14 days, but it must be greater than the creation
     *         frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not
     *         specify a value, the default is 7.</p>
     *         <p>
     *         Default: 7
     */

    public Integer getRetainInterval() {
        return this.retainInterval;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before deleting
     * them. The retention period can range from 2 to 14 days, but it must be greater than the creation frequency to
     * ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not specify a value, the
     * default is 7.
     * </p>
     * <p>
     * Default: 7
     * </p>
     * 
     * @param retainInterval
     *        <b>[Default policies only]</b> Specifies how long the policy should retain snapshots or AMIs before
     *        deleting them. The retention period can range from 2 to 14 days, but it must be greater than the creation
     *        frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you do not
     *        specify a value, the default is 7.</p>
     *        <p>
     *        Default: 7
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withRetainInterval(Integer retainInterval) {
        setRetainInterval(retainInterval);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to the
     * snapshot or AMI. If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param copyTags
     *        <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to
     *        the snapshot or AMI. If you do not specify a value, the default is <code>false</code>.</p>
     *        <p>
     *        Default: false
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to the
     * snapshot or AMI. If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to
     *         the snapshot or AMI. If you do not specify a value, the default is <code>false</code>.</p>
     *         <p>
     *         Default: false
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to the
     * snapshot or AMI. If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param copyTags
     *        <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to
     *        the snapshot or AMI. If you do not specify a value, the default is <code>false</code>.</p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to the
     * snapshot or AMI. If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return <b>[Default policies only]</b> Indicates whether the policy should copy tags from the source resource to
     *         the snapshot or AMI. If you do not specify a value, the default is <code>false</code>.</p>
     *         <p>
     *         Default: false
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source volume
     * or instance is deleted, or if the policy enters the error, disabled, or deleted state.
     * </p>
     * <p>
     * By default (<b>ExtendDeletion=false</b>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     * snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you want
     * Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting snapshots
     * and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs, including the last
     * one, if the policy enters one of these states, specify <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors simultaneously.
     * </p>
     * <p>
     * If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param extendDeletion
     *        <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source
     *        volume or instance is deleted, or if the policy enters the error, disabled, or deleted state.</p>
     *        <p>
     *        By default (<b>ExtendDeletion=false</b>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     *        snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you
     *        want Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify
     *        <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting
     *        snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs,
     *        including the last one, if the policy enters one of these states, specify <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors
     *        simultaneously.
     *        </p>
     *        <p>
     *        If you do not specify a value, the default is <code>false</code>.
     *        </p>
     *        <p>
     *        Default: false
     */

    public void setExtendDeletion(Boolean extendDeletion) {
        this.extendDeletion = extendDeletion;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source volume
     * or instance is deleted, or if the policy enters the error, disabled, or deleted state.
     * </p>
     * <p>
     * By default (<b>ExtendDeletion=false</b>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     * snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you want
     * Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting snapshots
     * and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs, including the last
     * one, if the policy enters one of these states, specify <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors simultaneously.
     * </p>
     * <p>
     * If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the
     *         source volume or instance is deleted, or if the policy enters the error, disabled, or deleted state.</p>
     *         <p>
     *         By default (<b>ExtendDeletion=false</b>):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     *         snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you
     *         want Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify
     *         <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting
     *         snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs,
     *         including the last one, if the policy enters one of these states, specify <code>true</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors
     *         simultaneously.
     *         </p>
     *         <p>
     *         If you do not specify a value, the default is <code>false</code>.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean getExtendDeletion() {
        return this.extendDeletion;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source volume
     * or instance is deleted, or if the policy enters the error, disabled, or deleted state.
     * </p>
     * <p>
     * By default (<b>ExtendDeletion=false</b>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     * snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you want
     * Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting snapshots
     * and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs, including the last
     * one, if the policy enters one of these states, specify <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors simultaneously.
     * </p>
     * <p>
     * If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param extendDeletion
     *        <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source
     *        volume or instance is deleted, or if the policy enters the error, disabled, or deleted state.</p>
     *        <p>
     *        By default (<b>ExtendDeletion=false</b>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     *        snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you
     *        want Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify
     *        <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting
     *        snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs,
     *        including the last one, if the policy enters one of these states, specify <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors
     *        simultaneously.
     *        </p>
     *        <p>
     *        If you do not specify a value, the default is <code>false</code>.
     *        </p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withExtendDeletion(Boolean extendDeletion) {
        setExtendDeletion(extendDeletion);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the source volume
     * or instance is deleted, or if the policy enters the error, disabled, or deleted state.
     * </p>
     * <p>
     * By default (<b>ExtendDeletion=false</b>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     * snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you want
     * Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting snapshots
     * and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs, including the last
     * one, if the policy enters one of these states, specify <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors simultaneously.
     * </p>
     * <p>
     * If you do not specify a value, the default is <code>false</code>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return <b>[Default policies only]</b> Defines the snapshot or AMI retention behavior for the policy if the
     *         source volume or instance is deleted, or if the policy enters the error, disabled, or deleted state.</p>
     *         <p>
     *         By default (<b>ExtendDeletion=false</b>):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete previously created
     *         snapshots or AMIs, up to but not including the last one, based on the specified retention period. If you
     *         want Amazon Data Lifecycle Manager to delete all snapshots or AMIs, including the last one, specify
     *         <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops deleting
     *         snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting snapshots or AMIs,
     *         including the last one, if the policy enters one of these states, specify <code>true</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you enable extended deletion (<b>ExtendDeletion=true</b>), you override both default behaviors
     *         simultaneously.
     *         </p>
     *         <p>
     *         If you do not specify a value, the default is <code>false</code>.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean isExtendDeletion() {
        return this.extendDeletion;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     * 
     * @return <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify
     *         up to 3 destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     */

    public java.util.List<CrossRegionCopyTarget> getCrossRegionCopyTargets() {
        return crossRegionCopyTargets;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     * 
     * @param crossRegionCopyTargets
     *        <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify
     *        up to 3 destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     */

    public void setCrossRegionCopyTargets(java.util.Collection<CrossRegionCopyTarget> crossRegionCopyTargets) {
        if (crossRegionCopyTargets == null) {
            this.crossRegionCopyTargets = null;
            return;
        }

        this.crossRegionCopyTargets = new java.util.ArrayList<CrossRegionCopyTarget>(crossRegionCopyTargets);
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossRegionCopyTargets(java.util.Collection)} or
     * {@link #withCrossRegionCopyTargets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param crossRegionCopyTargets
     *        <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify
     *        up to 3 destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withCrossRegionCopyTargets(CrossRegionCopyTarget... crossRegionCopyTargets) {
        if (this.crossRegionCopyTargets == null) {
            setCrossRegionCopyTargets(new java.util.ArrayList<CrossRegionCopyTarget>(crossRegionCopyTargets.length));
        }
        for (CrossRegionCopyTarget ele : crossRegionCopyTargets) {
            this.crossRegionCopyTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     * 
     * @param crossRegionCopyTargets
     *        <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify
     *        up to 3 destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withCrossRegionCopyTargets(java.util.Collection<CrossRegionCopyTarget> crossRegionCopyTargets) {
        setCrossRegionCopyTargets(crossRegionCopyTargets);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want
     * to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of
     * the specified exclusion parameters.
     * </p>
     * 
     * @param exclusions
     *        <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do
     *        not want to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources
     *        that match any of the specified exclusion parameters.
     */

    public void setExclusions(Exclusions exclusions) {
        this.exclusions = exclusions;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want
     * to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of
     * the specified exclusion parameters.
     * </p>
     * 
     * @return <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do
     *         not want to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources
     *         that match any of the specified exclusion parameters.
     */

    public Exclusions getExclusions() {
        return this.exclusions;
    }

    /**
     * <p>
     * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want
     * to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of
     * the specified exclusion parameters.
     * </p>
     * 
     * @param exclusions
     *        <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do
     *        not want to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources
     *        that match any of the specified exclusion parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withExclusions(Exclusions exclusions) {
        setExclusions(exclusions);
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDefaultPolicy() != null)
            sb.append("DefaultPolicy: ").append(getDefaultPolicy()).append(",");
        if (getCreateInterval() != null)
            sb.append("CreateInterval: ").append(getCreateInterval()).append(",");
        if (getRetainInterval() != null)
            sb.append("RetainInterval: ").append(getRetainInterval()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getExtendDeletion() != null)
            sb.append("ExtendDeletion: ").append(getExtendDeletion()).append(",");
        if (getCrossRegionCopyTargets() != null)
            sb.append("CrossRegionCopyTargets: ").append(getCrossRegionCopyTargets()).append(",");
        if (getExclusions() != null)
            sb.append("Exclusions: ").append(getExclusions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLifecyclePolicyRequest == false)
            return false;
        CreateLifecyclePolicyRequest other = (CreateLifecyclePolicyRequest) obj;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDefaultPolicy() == null ^ this.getDefaultPolicy() == null)
            return false;
        if (other.getDefaultPolicy() != null && other.getDefaultPolicy().equals(this.getDefaultPolicy()) == false)
            return false;
        if (other.getCreateInterval() == null ^ this.getCreateInterval() == null)
            return false;
        if (other.getCreateInterval() != null && other.getCreateInterval().equals(this.getCreateInterval()) == false)
            return false;
        if (other.getRetainInterval() == null ^ this.getRetainInterval() == null)
            return false;
        if (other.getRetainInterval() != null && other.getRetainInterval().equals(this.getRetainInterval()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getExtendDeletion() == null ^ this.getExtendDeletion() == null)
            return false;
        if (other.getExtendDeletion() != null && other.getExtendDeletion().equals(this.getExtendDeletion()) == false)
            return false;
        if (other.getCrossRegionCopyTargets() == null ^ this.getCrossRegionCopyTargets() == null)
            return false;
        if (other.getCrossRegionCopyTargets() != null && other.getCrossRegionCopyTargets().equals(this.getCrossRegionCopyTargets()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDefaultPolicy() == null) ? 0 : getDefaultPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreateInterval() == null) ? 0 : getCreateInterval().hashCode());
        hashCode = prime * hashCode + ((getRetainInterval() == null) ? 0 : getRetainInterval().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getExtendDeletion() == null) ? 0 : getExtendDeletion().hashCode());
        hashCode = prime * hashCode + ((getCrossRegionCopyTargets() == null) ? 0 : getCrossRegionCopyTargets().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        return hashCode;
    }

    @Override
    public CreateLifecyclePolicyRequest clone() {
        return (CreateLifecyclePolicyRequest) super.clone();
    }

}
