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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The detailed description of the cluster.
 * </p>
 */
public class Cluster implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     */
    private ClusterStatus status;
    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID,
     * IAM instance profile, and so on.
     * </p>
     */
    private Ec2InstanceAttributes ec2InstanceAttributes;
    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are stored.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     */
    private String requestedAmiVersion;
    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     */
    private String runningAmiVersion;
    /**
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all steps.
     * </p>
     */
    private Boolean autoTerminate;
    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API
     * call or user intervention, or in the event of a cluster error.
     * </p>
     */
    private Boolean terminationProtected;
    /**
     * <p>
     * Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If
     * this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the job flow if
     * they have the proper policy permissions set. If this value is <code>false</code>, only the IAM user that created
     * the cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     */
    private Boolean visibleToAllUsers;
    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Application> applications;
    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;
    /**
     * <p>
     * The public DNS name of the master EC2 instance.
     * </p>
     */
    private String masterPublicDnsName;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of Configurations supplied to the EMR cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     */
    private String autoScalingRole;
    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     */
    private String scaleDownBehavior;

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cluster.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @return The unique identifier for the cluster.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     * 
     * @param status
     *        The current status details about the cluster.
     */

    public void setStatus(ClusterStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     * 
     * @return The current status details about the cluster.
     */

    public ClusterStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     * 
     * @param status
     *        The current status details about the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatus(ClusterStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID,
     * IAM instance profile, and so on.
     * </p>
     * 
     * @param ec2InstanceAttributes
     *        Provides information about the EC2 instances in a cluster grouped by category. For example, key name,
     *        subnet ID, IAM instance profile, and so on.
     */

    public void setEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID,
     * IAM instance profile, and so on.
     * </p>
     * 
     * @return Provides information about the EC2 instances in a cluster grouped by category. For example, key name,
     *         subnet ID, IAM instance profile, and so on.
     */

    public Ec2InstanceAttributes getEc2InstanceAttributes() {
        return this.ec2InstanceAttributes;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID,
     * IAM instance profile, and so on.
     * </p>
     * 
     * @param ec2InstanceAttributes
     *        Provides information about the EC2 instances in a cluster grouped by category. For example, key name,
     *        subnet ID, IAM instance profile, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        setEc2InstanceAttributes(ec2InstanceAttributes);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are stored.
     * </p>
     * 
     * @param logUri
     *        The path to the Amazon S3 location where logs for this cluster are stored.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are stored.
     * </p>
     * 
     * @return The path to the Amazon S3 location where logs for this cluster are stored.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are stored.
     * </p>
     * 
     * @param logUri
     *        The path to the Amazon S3 location where logs for this cluster are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     * 
     * @param requestedAmiVersion
     *        The AMI version requested for this cluster.
     */

    public void setRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     * 
     * @return The AMI version requested for this cluster.
     */

    public String getRequestedAmiVersion() {
        return this.requestedAmiVersion;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     * 
     * @param requestedAmiVersion
     *        The AMI version requested for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRequestedAmiVersion(String requestedAmiVersion) {
        setRequestedAmiVersion(requestedAmiVersion);
        return this;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     * 
     * @param runningAmiVersion
     *        The AMI version running on this cluster.
     */

    public void setRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     * 
     * @return The AMI version running on this cluster.
     */

    public String getRunningAmiVersion() {
        return this.runningAmiVersion;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     * 
     * @param runningAmiVersion
     *        The AMI version running on this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRunningAmiVersion(String runningAmiVersion) {
        setRunningAmiVersion(runningAmiVersion);
        return this;
    }

    /**
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @param releaseLabel
     *        The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *        instead of ReleaseLabel.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @return The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *         instead of ReleaseLabel.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @param releaseLabel
     *        The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *        instead of ReleaseLabel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all steps.
     * </p>
     * 
     * @param autoTerminate
     *        Specifies whether the cluster should terminate after completing all steps.
     */

    public void setAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all steps.
     * </p>
     * 
     * @return Specifies whether the cluster should terminate after completing all steps.
     */

    public Boolean getAutoTerminate() {
        return this.autoTerminate;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all steps.
     * </p>
     * 
     * @param autoTerminate
     *        Specifies whether the cluster should terminate after completing all steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAutoTerminate(Boolean autoTerminate) {
        setAutoTerminate(autoTerminate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all steps.
     * </p>
     * 
     * @return Specifies whether the cluster should terminate after completing all steps.
     */

    public Boolean isAutoTerminate() {
        return this.autoTerminate;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API
     * call or user intervention, or in the event of a cluster error.
     * </p>
     * 
     * @param terminationProtected
     *        Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by
     *        an API call or user intervention, or in the event of a cluster error.
     */

    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API
     * call or user intervention, or in the event of a cluster error.
     * </p>
     * 
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by
     *         an API call or user intervention, or in the event of a cluster error.
     */

    public Boolean getTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API
     * call or user intervention, or in the event of a cluster error.
     * </p>
     * 
     * @param terminationProtected
     *        Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by
     *        an API call or user intervention, or in the event of a cluster error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTerminationProtected(Boolean terminationProtected) {
        setTerminationProtected(terminationProtected);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API
     * call or user intervention, or in the event of a cluster error.
     * </p>
     * 
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by
     *         an API call or user intervention, or in the event of a cluster error.
     */

    public Boolean isTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If
     * this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the job flow if
     * they have the proper policy permissions set. If this value is <code>false</code>, only the IAM user that created
     * the cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job
     *        flow. If this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the
     *        job flow if they have the proper policy permissions set. If this value is <code>false</code>, only the IAM
     *        user that created the cluster can view and manage it. This value can be changed using the
     *        <a>SetVisibleToAllUsers</a> action.
     */

    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If
     * this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the job flow if
     * they have the proper policy permissions set. If this value is <code>false</code>, only the IAM user that created
     * the cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @return Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job
     *         flow. If this value is set to <code>true</code>, all IAM users of that AWS account can view and manage
     *         the job flow if they have the proper policy permissions set. If this value is <code>false</code>, only
     *         the IAM user that created the cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */

    public Boolean getVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If
     * this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the job flow if
     * they have the proper policy permissions set. If this value is <code>false</code>, only the IAM user that created
     * the cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job
     *        flow. If this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the
     *        job flow if they have the proper policy permissions set. If this value is <code>false</code>, only the IAM
     *        user that created the cluster can view and manage it. This value can be changed using the
     *        <a>SetVisibleToAllUsers</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVisibleToAllUsers(Boolean visibleToAllUsers) {
        setVisibleToAllUsers(visibleToAllUsers);
        return this;
    }

    /**
     * <p>
     * Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If
     * this value is set to <code>true</code>, all IAM users of that AWS account can view and manage the job flow if
     * they have the proper policy permissions set. If this value is <code>false</code>, only the IAM user that created
     * the cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @return Indicates whether the job flow is visible to all IAM users of the AWS account associated with the job
     *         flow. If this value is set to <code>true</code>, all IAM users of that AWS account can view and manage
     *         the job flow if they have the proper policy permissions set. If this value is <code>false</code>, only
     *         the IAM user that created the cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */

    public Boolean isVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * 
     * @return The applications installed on this cluster.
     */

    public java.util.List<Application> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<Application>();
        }
        return applications;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * 
     * @param applications
     *        The applications installed on this cluster.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<Application>(applications);
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        The applications installed on this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new com.amazonaws.internal.SdkInternalList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * 
     * @param applications
     *        The applications installed on this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     * 
     * @return A list of tags associated with a cluster.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a cluster.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @return The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one
     *        time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that
     *        is roughly four times more expensive would result in the normalized instance hours being incremented by
     *        four. This result is only an approximation and does not reflect the actual billing rate.
     */

    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @return An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented
     *         one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance
     *         that is roughly four times more expensive would result in the normalized instance hours being incremented
     *         by four. This result is only an approximation and does not reflect the actual billing rate.
     */

    public Integer getNormalizedInstanceHours() {
        return this.normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the job flow, represented in m1.small/hours. This value is incremented one
     *        time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that
     *        is roughly four times more expensive would result in the normalized instance hours being incremented by
     *        four. This result is only an approximation and does not reflect the actual billing rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        setNormalizedInstanceHours(normalizedInstanceHours);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the master EC2 instance.
     * </p>
     * 
     * @param masterPublicDnsName
     *        The public DNS name of the master EC2 instance.
     */

    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the master EC2 instance.
     * </p>
     * 
     * @return The public DNS name of the master EC2 instance.
     */

    public String getMasterPublicDnsName() {
        return this.masterPublicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the master EC2 instance.
     * </p>
     * 
     * @param masterPublicDnsName
     *        The public DNS name of the master EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withMasterPublicDnsName(String masterPublicDnsName) {
        setMasterPublicDnsName(masterPublicDnsName);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of Configurations supplied to the EMR cluster.
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The list of Configurations supplied to the EMR cluster.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of Configurations supplied to the EMR cluster.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of Configurations supplied to the EMR cluster.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of Configurations supplied to the EMR cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of Configurations supplied to the EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of Configurations supplied to the EMR cluster.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of Configurations supplied to the EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the security configuration applied to the cluster.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * 
     * @return The name of the security configuration applied to the cluster.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the security configuration applied to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *        instances in an instance group.
     */

    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @return An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *         The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *         instances in an instance group.
     */

    public String getAutoScalingRole() {
        return this.autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *        instances in an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAutoScalingRole(String autoScalingRole) {
        setAutoScalingRole(autoScalingRole);
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available
     *        only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than
     *        5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @return The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *         instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *         nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *         submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *         created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *         blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *         instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *         instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is
     *         available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *         earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public String getScaleDownBehavior() {
        return this.scaleDownBehavior;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available
     *        only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than
     *        5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public Cluster withScaleDownBehavior(String scaleDownBehavior) {
        setScaleDownBehavior(scaleDownBehavior);
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available
     *        only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than
     *        5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available
     *        only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than
     *        5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public Cluster withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        setScaleDownBehavior(scaleDownBehavior);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEc2InstanceAttributes() != null)
            sb.append("Ec2InstanceAttributes: " + getEc2InstanceAttributes() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getRequestedAmiVersion() != null)
            sb.append("RequestedAmiVersion: " + getRequestedAmiVersion() + ",");
        if (getRunningAmiVersion() != null)
            sb.append("RunningAmiVersion: " + getRunningAmiVersion() + ",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (getAutoTerminate() != null)
            sb.append("AutoTerminate: " + getAutoTerminate() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected() + ",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers() + ",");
        if (getApplications() != null)
            sb.append("Applications: " + getApplications() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() + ",");
        if (getMasterPublicDnsName() != null)
            sb.append("MasterPublicDnsName: " + getMasterPublicDnsName() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: " + getAutoScalingRole() + ",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: " + getScaleDownBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEc2InstanceAttributes() == null ^ this.getEc2InstanceAttributes() == null)
            return false;
        if (other.getEc2InstanceAttributes() != null && other.getEc2InstanceAttributes().equals(this.getEc2InstanceAttributes()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRequestedAmiVersion() == null ^ this.getRequestedAmiVersion() == null)
            return false;
        if (other.getRequestedAmiVersion() != null && other.getRequestedAmiVersion().equals(this.getRequestedAmiVersion()) == false)
            return false;
        if (other.getRunningAmiVersion() == null ^ this.getRunningAmiVersion() == null)
            return false;
        if (other.getRunningAmiVersion() != null && other.getRunningAmiVersion().equals(this.getRunningAmiVersion()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getAutoTerminate() == null ^ this.getAutoTerminate() == null)
            return false;
        if (other.getAutoTerminate() != null && other.getAutoTerminate().equals(this.getAutoTerminate()) == false)
            return false;
        if (other.getTerminationProtected() == null ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null && other.getTerminationProtected().equals(this.getTerminationProtected()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false)
            return false;
        if (other.getMasterPublicDnsName() == null ^ this.getMasterPublicDnsName() == null)
            return false;
        if (other.getMasterPublicDnsName() != null && other.getMasterPublicDnsName().equals(this.getMasterPublicDnsName()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getAutoScalingRole() == null ^ this.getAutoScalingRole() == null)
            return false;
        if (other.getAutoScalingRole() != null && other.getAutoScalingRole().equals(this.getAutoScalingRole()) == false)
            return false;
        if (other.getScaleDownBehavior() == null ^ this.getScaleDownBehavior() == null)
            return false;
        if (other.getScaleDownBehavior() != null && other.getScaleDownBehavior().equals(this.getScaleDownBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceAttributes() == null) ? 0 : getEc2InstanceAttributes().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getRequestedAmiVersion() == null) ? 0 : getRequestedAmiVersion().hashCode());
        hashCode = prime * hashCode + ((getRunningAmiVersion() == null) ? 0 : getRunningAmiVersion().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getAutoTerminate() == null) ? 0 : getAutoTerminate().hashCode());
        hashCode = prime * hashCode + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        hashCode = prime * hashCode + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours().hashCode());
        hashCode = prime * hashCode + ((getMasterPublicDnsName() == null) ? 0 : getMasterPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingRole() == null) ? 0 : getAutoScalingRole().hashCode());
        hashCode = prime * hashCode + ((getScaleDownBehavior() == null) ? 0 : getScaleDownBehavior().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
