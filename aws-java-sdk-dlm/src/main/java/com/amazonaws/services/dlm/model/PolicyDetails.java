/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>[All policy types]</b> Specifies the configuration of a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/PolicyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     */
    private java.util.List<String> resourceLocations;
    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     */
    private java.util.List<Tag> targetTags;
    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI lifecycle
     * policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
     * </p>
     */
    private java.util.List<Schedule> schedules;
    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle policies.
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
     * <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     *        <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     * <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
     * <code>EBS_SNAPSHOT_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of Amazon EBS
     * snapshots. Specify <code>IMAGE_MANAGEMENT</code> to create a lifecycle policy that manages the lifecycle of
     * EBS-backed AMIs. Specify <code>EVENT_BASED_POLICY </code> to create an event-based policy that performs specific
     * actions when a defined event occurs in your Amazon Web Services account.
     * </p>
     * <p>
     * The default is <code>EBS_SNAPSHOT_MANAGEMENT</code>.
     * </p>
     * 
     * @return <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     * <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     *        <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     * <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     *        <b>[All policy types]</b> The valid target resource types and actions a policy can manage. Specify
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
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @return <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     *         <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
     *         multi-volume snapshots from the volumes for an instance.
     * @see ResourceTypeValues
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     *        <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
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
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
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
     *        <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     *        <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
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
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     *        <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
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
     * <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     * <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create multi-volume
     * snapshots from the volumes for an instance.
     * </p>
     * 
     * @param resourceTypes
     *        <b>[Snapshot policies only]</b> The target resource type for snapshot and AMI lifecycle policies. Use
     *        <code>VOLUME </code>to create snapshots of individual volumes or use <code>INSTANCE</code> to create
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
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @return <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     *         are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are
     *         located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
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
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     *        are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are
     *        located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
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
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
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
     *        <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     *        are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are
     *        located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
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
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     *        are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are
     *        located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
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
     * <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources are
     * located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are located on an
     * Outpost in your account, specify <code>OUTPOST</code>.
     * </p>
     * <p>
     * If you specify <code>OUTPOST</code>, Amazon Data Lifecycle Manager backs up all resources of the specified type
     * with matching target tags across all of the Outposts in your account.
     * </p>
     * 
     * @param resourceLocations
     *        <b>[Snapshot and AMI policies only]</b> The location of the resources to backup. If the source resources
     *        are located in an Amazon Web Services Region, specify <code>CLOUD</code>. If the source resources are
     *        located on an Outpost in your account, specify <code>OUTPOST</code>.</p>
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
     * <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @return <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this
     *         policy.
     */

    public java.util.List<Tag> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
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
     * <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTags(java.util.Collection)} or {@link #withTargetTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetTags
     *        <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
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
     * <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        <b>[Snapshot and AMI policies only]</b> The single tag that identifies targeted resources for this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withTargetTags(java.util.Collection<Tag> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI lifecycle
     * policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
     * </p>
     * 
     * @return <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     *         lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three
     *         optional schedules.
     */

    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI lifecycle
     * policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
     * </p>
     * 
     * @param schedules
     *        <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     *        lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     *        schedules.
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
     * <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI lifecycle
     * policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedules(java.util.Collection)} or {@link #withSchedules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schedules
     *        <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     *        lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     *        schedules.
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
     * <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI lifecycle
     * policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
     * </p>
     * 
     * @param schedules
     *        <b>[Snapshot and AMI policies only]</b> The schedules of policy-defined actions for snapshot and AMI
     *        lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional
     *        schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withSchedules(java.util.Collection<Schedule> schedules) {
        setSchedules(schedules);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle policies.
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
     *        <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
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
     * <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle policies.
     * </p>
     * <note>
     * <p>
     * If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager
     * console, then you must include this parameter and specify either the default values or the new values that you
     * require. You can't omit this parameter or set its values to null.
     * </p>
     * </note>
     * 
     * @return <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
     *         policies. </p> <note>
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
     * <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle policies.
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
     *        <b>[Snapshot and AMI policies only]</b> A set of optional parameters for snapshot and AMI lifecycle
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
            sb.append("Actions: ").append(getActions());
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
