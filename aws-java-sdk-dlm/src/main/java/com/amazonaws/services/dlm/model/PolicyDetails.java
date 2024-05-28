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
 * Specifies the configuration of a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/PolicyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     */
    private java.util.List<String> resourceLocations;
    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     */
    private java.util.List<Tag> targetTags;
    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     * lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     * </p>
     */
    private java.util.List<Schedule> schedules;
    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     * policies.
     * </p>
     * <note>
     * <p>
     * If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager
     * console, then you must include this parameter and specify either the default values or the new values that you
     * require. You can't omit this parameter or set its values to null.
     * </p>
     * </note>
     */
    private Parameters parameters;
    /**
     * <p>
     * <b>[Event-based policies only]</b> The event that activates the event-based policy.
     * </p>
     */
    private EventSource eventSource;
    /**
     * <p>
     * <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated. You can
     * specify only one action per policy.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * The type of policy to create. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SIMPLIFIED</code> To create a default policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> To create a custom policy.
     * </p>
     * </li>
     * </ul>
     */
    private String policyLanguage;
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
    private String resourceType;
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
     * <b>[Default policies only]</b> Specifies destination Regions for snapshot or AMI copies. You can specify up to 3
     * destination Regions. If you do not want to create cross-Region copies, omit this parameter.
     * </p>
     */
    private java.util.List<CrossRegionCopyTarget> crossRegionCopyTargets;
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
     * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want
     * to create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of
     * the specified exclusion parameters.
     * </p>
     */
    private Exclusions exclusions;

    /**
     * <p>
     * <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     * 
     * @param policyType
     *        <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     *        <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     *        snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle
     *        of EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs
     *        specific actions when a defined event occurs in your Amazon Web Services account.</p>
     *        <p>
     *        The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * @see PolicyTypeValues
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     * 
     * @return <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     *         <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon
     *         EBS snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the
     *         lifecycle of EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy
     *         that performs specific actions when a defined event occurs in your Amazon Web Services account.</p>
     *         <p>
     *         The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * @see PolicyTypeValues
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     * 
     * @param policyType
     *        <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     *        <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     *        snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle
     *        of EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs
     *        specific actions when a defined event occurs in your Amazon Web Services account.</p>
     *        <p>
     *        The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTypeValues
     */

    public PolicyDetails withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     * 
     * @param policyType
     *        <b>[Custom policies only]</b> The valid target resource types and actions a policy can manage. Specify
     *        <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     *        snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle
     *        of EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs
     *        specific actions when a defined event occurs in your Amazon Web Services account.</p>
     *        <p>
     *        The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTypeValues
     */

    public PolicyDetails withPolicyType(PolicyTypeValues policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @return <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies.
     *         Use <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *         multi-volume snapshots from the volumes for an instance.
     * @see ResourceTypeValues
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies.
     *        Use <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *        multi-volume snapshots from the volumes for an instance.
     * @see ResourceTypeValues
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies.
     *        Use <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *        multi-volume snapshots from the volumes for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies.
     *        Use <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *        multi-volume snapshots from the volumes for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Custom snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies.
     *        Use <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *        multi-volume snapshots from the volumes for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(ResourceTypeValues... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceTypeValues value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @return <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source
     *         resources are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source
     *         resources are located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
     *         <p>
     *         If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the
     *         specified type with matching target tags across all of the Outposts in your account.
     * @see ResourceLocationValues
     */

    public java.util.List<String> getResourceLocations() {
        return resourceLocations;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source
     *        resources are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source
     *        resources are located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
     *        <p>
     *        If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified
     *        type with matching target tags across all of the Outposts in your account.
     * @see ResourceLocationValues
     */

    public void setResourceLocations(java.util.Collection<String> resourceLocations) {
        if (resourceLocations == null) {
            this.resourceLocations = null;
            return;
        }

        this.resourceLocations = new java.util.ArrayList<String>(resourceLocations);
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceLocations(java.util.Collection)} or {@link #withResourceLocations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source
     *        resources are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source
     *        resources are located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
     *        <p>
     *        If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified
     *        type with matching target tags across all of the Outposts in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceLocationValues
     */

    public PolicyDetails withResourceLocations(String... resourceLocations) {
        if (this.resourceLocations == null) {
            setResourceLocations(new java.util.ArrayList<String>(resourceLocations.length));
        }
        for (String ele : resourceLocations) {
            this.resourceLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source
     *        resources are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source
     *        resources are located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
     *        <p>
     *        If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified
     *        type with matching target tags across all of the Outposts in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceLocationValues
     */

    public PolicyDetails withResourceLocations(java.util.Collection<String> resourceLocations) {
        setResourceLocations(resourceLocations);
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     * are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on
     * an Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Custom snapshot and AMI policies only]</b> The location of the resources to backup. If the source
     *        resources are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source
     *        resources are located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
     *        <p>
     *        If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified
     *        type with matching target tags across all of the Outposts in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceLocationValues
     */

    public PolicyDetails withResourceLocations(ResourceLocationValues... resourceLocations) {
        java.util.ArrayList<String> resourceLocationsCopy = new java.util.ArrayList<String>(resourceLocations.length);
        for (ResourceLocationValues value : resourceLocations) {
            resourceLocationsCopy.add(value.toString());
        }
        if (getResourceLocations() == null) {
            setResourceLocations(resourceLocationsCopy);
        } else {
            getResourceLocations().addAll(resourceLocationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @return <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this
     *         policy.
     */

    public java.util.List<Tag> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this
     *        policy.
     */

    public void setTargetTags(java.util.Collection<Tag> targetTags) {
        if (targetTags == null) {
            this.targetTags = null;
            return;
        }

        this.targetTags = new java.util.ArrayList<Tag>(targetTags);
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTags(java.util.Collection)} or {@link #withTargetTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetTags
     *        <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withTargetTags(Tag... targetTags) {
        if (this.targetTags == null) {
            setTargetTags(new java.util.ArrayList<Tag>(targetTags.length));
        }
        for (Tag ele : targetTags) {
            this.targetTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        <b>[Custom snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withTargetTags(java.util.Collection<Tag> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     * lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     * </p>
     * 
     * @return <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and
     *         AMI lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three
     *         optional schedules.
     */

    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     * lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     * </p>
     * 
     * @param schedules
     *        <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and
     *        AMI lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three
     *        optional schedules.
     */

    public void setSchedules(java.util.Collection<Schedule> schedules) {
        if (schedules == null) {
            this.schedules = null;
            return;
        }

        this.schedules = new java.util.ArrayList<Schedule>(schedules);
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     * lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedules(java.util.Collection)} or {@link #withSchedules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schedules
     *        <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and
     *        AMI lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three
     *        optional schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withSchedules(Schedule... schedules) {
        if (this.schedules == null) {
            setSchedules(new java.util.ArrayList<Schedule>(schedules.length));
        }
        for (Schedule ele : schedules) {
            this.schedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     * lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     * </p>
     * 
     * @param schedules
     *        <b>[Custom snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and
     *        AMI lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three
     *        optional schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withSchedules(java.util.Collection<Schedule> schedules) {
        setSchedules(schedules);
        return this;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     * policies.
     * </p>
     * <note>
     * <p>
     * If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager
     * console, then you must include this parameter and specify either the default values or the new values that you
     * require. You can't omit this parameter or set its values to null.
     * </p>
     * </note>
     * 
     * @param parameters
     *        <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     *        policies. </p> <note>
     *        <p>
     *        If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle
     *        Manager console, then you must include this parameter and specify either the default values or the new
     *        values that you require. You can't omit this parameter or set its values to null.
     *        </p>
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     * policies.
     * </p>
     * <note>
     * <p>
     * If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager
     * console, then you must include this parameter and specify either the default values or the new values that you
     * require. You can't omit this parameter or set its values to null.
     * </p>
     * </note>
     * 
     * @return <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI
     *         lifecycle policies. </p> <note>
     *         <p>
     *         If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle
     *         Manager console, then you must include this parameter and specify either the default values or the new
     *         values that you require. You can't omit this parameter or set its values to null.
     *         </p>
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     * policies.
     * </p>
     * <note>
     * <p>
     * If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager
     * console, then you must include this parameter and specify either the default values or the new values that you
     * require. You can't omit this parameter or set its values to null.
     * </p>
     * </note>
     * 
     * @param parameters
     *        <b>[Custom snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     *        policies. </p> <note>
     *        <p>
     *        If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle
     *        Manager console, then you must include this parameter and specify either the default values or the new
     *        values that you require. You can't omit this parameter or set its values to null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withParameters(Parameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The event that activates the event-based policy.
     * </p>
     * 
     * @param eventSource
     *        <b>[Event-based policies only]</b> The event that activates the event-based policy.
     */

    public void setEventSource(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The event that activates the event-based policy.
     * </p>
     * 
     * @return <b>[Event-based policies only]</b> The event that activates the event-based policy.
     */

    public EventSource getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The event that activates the event-based policy.
     * </p>
     * 
     * @param eventSource
     *        <b>[Event-based policies only]</b> The event that activates the event-based policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withEventSource(EventSource eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated. You can
     * specify only one action per policy.
     * </p>
     * 
     * @return <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated.
     *         You can specify only one action per policy.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated. You can
     * specify only one action per policy.
     * </p>
     * 
     * @param actions
     *        <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated.
     *        You can specify only one action per policy.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated. You can
     * specify only one action per policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated.
     *        You can specify only one action per policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated. You can
     * specify only one action per policy.
     * </p>
     * 
     * @param actions
     *        <b>[Event-based policies only]</b> The actions to be performed when the event-based policy is activated.
     *        You can specify only one action per policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The type of policy to create. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SIMPLIFIED</code> To create a default policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> To create a custom policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyLanguage
     *        The type of policy to create. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SIMPLIFIED</code> To create a default policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> To create a custom policy.
     *        </p>
     *        </li>
     * @see PolicyLanguageValues
     */

    public void setPolicyLanguage(String policyLanguage) {
        this.policyLanguage = policyLanguage;
    }

    /**
     * <p>
     * The type of policy to create. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SIMPLIFIED</code> To create a default policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> To create a custom policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of policy to create. Specify one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SIMPLIFIED</code> To create a default policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STANDARD</code> To create a custom policy.
     *         </p>
     *         </li>
     * @see PolicyLanguageValues
     */

    public String getPolicyLanguage() {
        return this.policyLanguage;
    }

    /**
     * <p>
     * The type of policy to create. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SIMPLIFIED</code> To create a default policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> To create a custom policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyLanguage
     *        The type of policy to create. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SIMPLIFIED</code> To create a default policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> To create a custom policy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyLanguageValues
     */

    public PolicyDetails withPolicyLanguage(String policyLanguage) {
        setPolicyLanguage(policyLanguage);
        return this;
    }

    /**
     * <p>
     * The type of policy to create. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SIMPLIFIED</code> To create a default policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> To create a custom policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyLanguage
     *        The type of policy to create. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SIMPLIFIED</code> To create a default policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code> To create a custom policy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyLanguageValues
     */

    public PolicyDetails withPolicyLanguage(PolicyLanguageValues policyLanguage) {
        this.policyLanguage = policyLanguage.toString();
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
     * @param resourceType
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
     * @see ResourceTypeValues
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
     * @see ResourceTypeValues
     */

    public String getResourceType() {
        return this.resourceType;
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
     * @param resourceType
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
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
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
     * @param resourceType
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
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceType(ResourceTypeValues resourceType) {
        this.resourceType = resourceType.toString();
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

    public PolicyDetails withCreateInterval(Integer createInterval) {
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

    public PolicyDetails withRetainInterval(Integer retainInterval) {
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

    public PolicyDetails withCopyTags(Boolean copyTags) {
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

    public PolicyDetails withCrossRegionCopyTargets(CrossRegionCopyTarget... crossRegionCopyTargets) {
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

    public PolicyDetails withCrossRegionCopyTargets(java.util.Collection<CrossRegionCopyTarget> crossRegionCopyTargets) {
        setCrossRegionCopyTargets(crossRegionCopyTargets);
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

    public PolicyDetails withExtendDeletion(Boolean extendDeletion) {
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

    public PolicyDetails withExclusions(Exclusions exclusions) {
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
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getResourceLocations() != null)
            sb.append("ResourceLocations: ").append(getResourceLocations()).append(",");
        if (getTargetTags() != null)
            sb.append("TargetTags: ").append(getTargetTags()).append(",");
        if (getSchedules() != null)
            sb.append("Schedules: ").append(getSchedules()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPolicyLanguage() != null)
            sb.append("PolicyLanguage: ").append(getPolicyLanguage()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCreateInterval() != null)
            sb.append("CreateInterval: ").append(getCreateInterval()).append(",");
        if (getRetainInterval() != null)
            sb.append("RetainInterval: ").append(getRetainInterval()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getCrossRegionCopyTargets() != null)
            sb.append("CrossRegionCopyTargets: ").append(getCrossRegionCopyTargets()).append(",");
        if (getExtendDeletion() != null)
            sb.append("ExtendDeletion: ").append(getExtendDeletion()).append(",");
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

        if (obj instanceof PolicyDetails == false)
            return false;
        PolicyDetails other = (PolicyDetails) obj;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getResourceLocations() == null ^ this.getResourceLocations() == null)
            return false;
        if (other.getResourceLocations() != null && other.getResourceLocations().equals(this.getResourceLocations()) == false)
            return false;
        if (other.getTargetTags() == null ^ this.getTargetTags() == null)
            return false;
        if (other.getTargetTags() != null && other.getTargetTags().equals(this.getTargetTags()) == false)
            return false;
        if (other.getSchedules() == null ^ this.getSchedules() == null)
            return false;
        if (other.getSchedules() != null && other.getSchedules().equals(this.getSchedules()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPolicyLanguage() == null ^ this.getPolicyLanguage() == null)
            return false;
        if (other.getPolicyLanguage() != null && other.getPolicyLanguage().equals(this.getPolicyLanguage()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
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
        if (other.getCrossRegionCopyTargets() == null ^ this.getCrossRegionCopyTargets() == null)
            return false;
        if (other.getCrossRegionCopyTargets() != null && other.getCrossRegionCopyTargets().equals(this.getCrossRegionCopyTargets()) == false)
            return false;
        if (other.getExtendDeletion() == null ^ this.getExtendDeletion() == null)
            return false;
        if (other.getExtendDeletion() != null && other.getExtendDeletion().equals(this.getExtendDeletion()) == false)
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

        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getResourceLocations() == null) ? 0 : getResourceLocations().hashCode());
        hashCode = prime * hashCode + ((getTargetTags() == null) ? 0 : getTargetTags().hashCode());
        hashCode = prime * hashCode + ((getSchedules() == null) ? 0 : getSchedules().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPolicyLanguage() == null) ? 0 : getPolicyLanguage().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreateInterval() == null) ? 0 : getCreateInterval().hashCode());
        hashCode = prime * hashCode + ((getRetainInterval() == null) ? 0 : getRetainInterval().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getCrossRegionCopyTargets() == null) ? 0 : getCrossRegionCopyTargets().hashCode());
        hashCode = prime * hashCode + ((getExtendDeletion() == null) ? 0 : getExtendDeletion().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        return hashCode;
    }

    @Override
    public PolicyDetails clone() {
        try {
            return (PolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.PolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
