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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAccountSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountSettingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon ECS account setting name to modify.
     * </p>
     * <p>
     * The following are the valid values for the account setting name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID
     * format of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     * and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format
     * of a resource is defined by the opt-in status of the user or role that created the resource. You must turn on
     * this setting to use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new container
     * instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any new container
     * instances that support the feature are launched have the increased ENI limits available to them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic Network
     * Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     * CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code> is
     * turned on, any new clusters that are created will have Container Insights turned on unless you disable it during
     * cluster creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html">CloudWatch
     * Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     * <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6 with tasks
     * launched on Amazon EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     * affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     * infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and new
     * tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait time to
     * retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web Services
     * Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource creation.
     * Users must have permissions for actions that create the resource, such as <code>ecsCreateCluster</code>. If tags
     * are specified when you create a resource, Amazon Web Services performs additional authorization to verify if
     * users or roles have permissions to create tags. Therefore, you must grant explicit permissions to use the
     * <code>ecs:TagResource</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html">Grant
     * permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS and
     * indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator in your
     * Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html">Protecting
     * Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     * <code>disabled</code>, <code>on</code>, and <code>off</code>.
     * </p>
     * <p>
     * When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are the
     * valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the tasks.
     * </p>
     * </li>
     * </ul>
     */
    private String value;
    /**
     * <p>
     * The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it modifies
     * the account setting for all users, roles, and the root user of the account unless a user or role explicitly
     * overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
     * </p>
     * <note>
     * <p>
     * You must use the root user when you set the Fargate wait time (<code>fargateTaskRetirementWaitPeriod</code>).
     * </p>
     * <p>
     * Federated users assume the account setting of the root user and can't have explicit account settings set for
     * them.
     * </p>
     * </note>
     */
    private String principalArn;

    /**
     * <p>
     * The Amazon ECS account setting name to modify.
     * </p>
     * <p>
     * The following are the valid values for the account setting name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID
     * format of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     * and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format
     * of a resource is defined by the opt-in status of the user or role that created the resource. You must turn on
     * this setting to use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new container
     * instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any new container
     * instances that support the feature are launched have the increased ENI limits available to them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic Network
     * Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     * CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code> is
     * turned on, any new clusters that are created will have Container Insights turned on unless you disable it during
     * cluster creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html">CloudWatch
     * Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     * <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6 with tasks
     * launched on Amazon EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     * affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     * infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and new
     * tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait time to
     * retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web Services
     * Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource creation.
     * Users must have permissions for actions that create the resource, such as <code>ecsCreateCluster</code>. If tags
     * are specified when you create a resource, Amazon Web Services performs additional authorization to verify if
     * users or roles have permissions to create tags. Therefore, you must grant explicit permissions to use the
     * <code>ecs:TagResource</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html">Grant
     * permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS and
     * indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator in your
     * Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html">Protecting
     * Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The Amazon ECS account setting name to modify.</p>
     *        <p>
     *        The following are the valid values for the account setting name.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format
     *        of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     *        and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of
     *        the resource type for a specified user, role, or the root user for an account is affected. The opt-in and
     *        opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource
     *        ID format of the resource type for a specified user, role, or the root user for an account is affected.
     *        The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and
     *        resource ID format of a resource is defined by the opt-in status of the user or role that created the
     *        resource. You must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new
     *        container instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any
     *        new container instances that support the feature are launched have the increased ENI limits available to
     *        them. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic
     *        Network Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     *        CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code>
     *        is turned on, any new clusters that are created will have Container Insights turned on unless you disable
     *        it during cluster creation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
     *        >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     *        <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6
     *        with tasks launched on Amazon EC2 instances, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     *        affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     *        infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and
     *        new tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait
     *        time to retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web
     *        Services Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource
     *        creation. Users must have permissions for actions that create the resource, such as
     *        <code>ecsCreateCluster</code>. If tags are specified when you create a resource, Amazon Web Services
     *        performs additional authorization to verify if users or roles have permissions to create tags. Therefore,
     *        you must grant explicit permissions to use the <code>ecs:TagResource</code> action. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html"
     *        >Grant permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS
     *        and indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator
     *        in your Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html"
     *        >Protecting Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     *        </p>
     *        </li>
     * @see SettingName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon ECS account setting name to modify.
     * </p>
     * <p>
     * The following are the valid values for the account setting name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID
     * format of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     * and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format
     * of a resource is defined by the opt-in status of the user or role that created the resource. You must turn on
     * this setting to use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new container
     * instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any new container
     * instances that support the feature are launched have the increased ENI limits available to them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic Network
     * Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     * CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code> is
     * turned on, any new clusters that are created will have Container Insights turned on unless you disable it during
     * cluster creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html">CloudWatch
     * Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     * <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6 with tasks
     * launched on Amazon EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     * affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     * infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and new
     * tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait time to
     * retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web Services
     * Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource creation.
     * Users must have permissions for actions that create the resource, such as <code>ecsCreateCluster</code>. If tags
     * are specified when you create a resource, Amazon Web Services performs additional authorization to verify if
     * users or roles have permissions to create tags. Therefore, you must grant explicit permissions to use the
     * <code>ecs:TagResource</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html">Grant
     * permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS and
     * indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator in your
     * Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html">Protecting
     * Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon ECS account setting name to modify.</p>
     *         <p>
     *         The following are the valid values for the account setting name.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format
     *         of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     *         and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *         format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *         must turn on this setting to use Amazon ECS features such as resource tagging.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of
     *         the resource type for a specified user, role, or the root user for an account is affected. The opt-in and
     *         opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *         format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *         must turn on this setting to use Amazon ECS features such as resource tagging.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource
     *         ID format of the resource type for a specified user, role, or the root user for an account is affected.
     *         The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and
     *         resource ID format of a resource is defined by the opt-in status of the user or role that created the
     *         resource. You must turn on this setting to use Amazon ECS features such as resource tagging.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new
     *         container instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any
     *         new container instances that support the feature are launched have the increased ENI limits available to
     *         them. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic
     *         Network Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web
     *         Services CloudWatch Container Insights is turned on for your clusters is changed. If
     *         <code>containerInsights</code> is turned on, any new clusters that are created will have Container
     *         Insights turned on unless you disable it during cluster creation. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
     *         >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     *         <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6
     *         with tasks launched on Amazon EC2 instances, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     *         >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     *         >Using a VPC in dual-stack mode</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance
     *         is affected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     *         infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped
     *         and new tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the
     *         wait time to retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web
     *         Services Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource
     *         creation. Users must have permissions for actions that create the resource, such as
     *         <code>ecsCreateCluster</code>. If tags are specified when you create a resource, Amazon Web Services
     *         performs additional authorization to verify if users or roles have permissions to create tags. Therefore,
     *         you must grant explicit permissions to use the <code>ecs:TagResource</code> action. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html"
     *         >Grant permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS
     *         and indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator
     *         in your Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html"
     *         >Protecting Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     *         </p>
     *         </li>
     * @see SettingName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The Amazon ECS account setting name to modify.
     * </p>
     * <p>
     * The following are the valid values for the account setting name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID
     * format of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     * and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format
     * of a resource is defined by the opt-in status of the user or role that created the resource. You must turn on
     * this setting to use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new container
     * instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any new container
     * instances that support the feature are launched have the increased ENI limits available to them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic Network
     * Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     * CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code> is
     * turned on, any new clusters that are created will have Container Insights turned on unless you disable it during
     * cluster creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html">CloudWatch
     * Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     * <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6 with tasks
     * launched on Amazon EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     * affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     * infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and new
     * tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait time to
     * retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web Services
     * Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource creation.
     * Users must have permissions for actions that create the resource, such as <code>ecsCreateCluster</code>. If tags
     * are specified when you create a resource, Amazon Web Services performs additional authorization to verify if
     * users or roles have permissions to create tags. Therefore, you must grant explicit permissions to use the
     * <code>ecs:TagResource</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html">Grant
     * permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS and
     * indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator in your
     * Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html">Protecting
     * Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The Amazon ECS account setting name to modify.</p>
     *        <p>
     *        The following are the valid values for the account setting name.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format
     *        of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     *        and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of
     *        the resource type for a specified user, role, or the root user for an account is affected. The opt-in and
     *        opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource
     *        ID format of the resource type for a specified user, role, or the root user for an account is affected.
     *        The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and
     *        resource ID format of a resource is defined by the opt-in status of the user or role that created the
     *        resource. You must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new
     *        container instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any
     *        new container instances that support the feature are launched have the increased ENI limits available to
     *        them. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic
     *        Network Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     *        CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code>
     *        is turned on, any new clusters that are created will have Container Insights turned on unless you disable
     *        it during cluster creation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
     *        >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     *        <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6
     *        with tasks launched on Amazon EC2 instances, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     *        affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     *        infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and
     *        new tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait
     *        time to retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web
     *        Services Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource
     *        creation. Users must have permissions for actions that create the resource, such as
     *        <code>ecsCreateCluster</code>. If tags are specified when you create a resource, Amazon Web Services
     *        performs additional authorization to verify if users or roles have permissions to create tags. Therefore,
     *        you must grant explicit permissions to use the <code>ecs:TagResource</code> action. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html"
     *        >Grant permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS
     *        and indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator
     *        in your Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html"
     *        >Protecting Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public PutAccountSettingRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon ECS account setting name to modify.
     * </p>
     * <p>
     * The following are the valid values for the account setting name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of the
     * resource type for a specified user, role, or the root user for an account is affected. The opt-in and opt-out
     * account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource
     * is defined by the opt-in status of the user or role that created the resource. You must turn on this setting to
     * use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID
     * format of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     * and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format
     * of a resource is defined by the opt-in status of the user or role that created the resource. You must turn on
     * this setting to use Amazon ECS features such as resource tagging.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new container
     * instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any new container
     * instances that support the feature are launched have the increased ENI limits available to them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic Network
     * Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     * CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code> is
     * turned on, any new clusters that are created will have Container Insights turned on unless you disable it during
     * cluster creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html">CloudWatch
     * Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     * <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6 with tasks
     * launched on Amazon EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     * >Using a VPC in dual-stack mode</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     * affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     * infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and new
     * tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait time to
     * retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web Services
     * Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource creation.
     * Users must have permissions for actions that create the resource, such as <code>ecsCreateCluster</code>. If tags
     * are specified when you create a resource, Amazon Web Services performs additional authorization to verify if
     * users or roles have permissions to create tags. Therefore, you must grant explicit permissions to use the
     * <code>ecs:TagResource</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html">Grant
     * permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS and
     * indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator in your
     * Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html">Protecting
     * Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The Amazon ECS account setting name to modify.</p>
     *        <p>
     *        The following are the valid values for the account setting name.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>serviceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format
     *        of the resource type for a specified user, role, or the root user for an account is affected. The opt-in
     *        and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>taskLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource ID format of
     *        the resource type for a specified user, role, or the root user for an account is affected. The opt-in and
     *        opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID
     *        format of a resource is defined by the opt-in status of the user or role that created the resource. You
     *        must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInstanceLongArnFormat</code> - When modified, the Amazon Resource Name (ARN) and resource
     *        ID format of the resource type for a specified user, role, or the root user for an account is affected.
     *        The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and
     *        resource ID format of a resource is defined by the opt-in status of the user or role that created the
     *        resource. You must turn on this setting to use Amazon ECS features such as resource tagging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>awsvpcTrunking</code> - When modified, the elastic network interface (ENI) limit for any new
     *        container instances that support the feature is changed. If <code>awsvpcTrunking</code> is turned on, any
     *        new container instances that support the feature are launched have the increased ENI limits available to
     *        them. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html">Elastic
     *        Network Interface Trunking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>containerInsights</code> - When modified, the default setting indicating whether Amazon Web Services
     *        CloudWatch Container Insights is turned on for your clusters is changed. If <code>containerInsights</code>
     *        is turned on, any new clusters that are created will have Container Insights turned on unless you disable
     *        it during cluster creation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
     *        >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dualStackIPv6</code> - When turned on, when using a VPC in dual stack mode, your tasks using the
     *        <code>awsvpc</code> network mode can have an IPv6 address assigned. For more information on using IPv6
     *        with tasks launched on Amazon EC2 instances, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking-awsvpc.html#task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>. For more information on using IPv6 with tasks launched on Fargate,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-task-networking.html#fargate-task-networking-vpc-dual-stack"
     *        >Using a VPC in dual-stack mode</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateFIPSMode</code> - If you specify <code>fargateFIPSMode</code>, Fargate FIPS 140 compliance is
     *        affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fargateTaskRetirementWaitPeriod</code> - When Amazon Web Services determines that a security or
     *        infrastructure update is needed for an Amazon ECS task hosted on Fargate, the tasks need to be stopped and
     *        new tasks launched to replace them. Use <code>fargateTaskRetirementWaitPeriod</code> to configure the wait
     *        time to retire a Fargate task. For information about the Fargate tasks maintenance, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-maintenance.html">Amazon Web
     *        Services Fargate task maintenance</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tagResourceAuthorization</code> - Amazon ECS is introducing tagging authorization for resource
     *        creation. Users must have permissions for actions that create the resource, such as
     *        <code>ecsCreateCluster</code>. If tags are specified when you create a resource, Amazon Web Services
     *        performs additional authorization to verify if users or roles have permissions to create tags. Therefore,
     *        you must grant explicit permissions to use the <code>ecs:TagResource</code> action. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/supported-iam-actions-tagging.html"
     *        >Grant permission to tag resources on creation</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>guardDutyActivate</code> - The <code>guardDutyActivate</code> parameter is read-only in Amazon ECS
     *        and indicates whether Amazon ECS Runtime Monitoring is enabled or disabled by your security administrator
     *        in your Amazon ECS account. Amazon GuardDuty controls this account setting on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-guard-duty-integration.html"
     *        >Protecting Amazon ECS workloads with Amazon ECS Runtime Monitoring</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public PutAccountSettingRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     * <code>disabled</code>, <code>on</code>, and <code>off</code>.
     * </p>
     * <p>
     * When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are the
     * valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     *        <code>disabled</code>, <code>on</code>, and <code>off</code>.</p>
     *        <p>
     *        When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are
     *        the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the
     *        tasks.
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     * <code>disabled</code>, <code>on</code>, and <code>off</code>.
     * </p>
     * <p>
     * When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are the
     * valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     *         <code>disabled</code>, <code>on</code>, and <code>off</code>.</p>
     *         <p>
     *         When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following
     *         are the valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the
     *         tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the
     *         tasks.
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     * <code>disabled</code>, <code>on</code>, and <code>off</code>.
     * </p>
     * <p>
     * When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are the
     * valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The account setting value for the specified principal ARN. Accepted values are <code>enabled</code>,
     *        <code>disabled</code>, <code>on</code>, and <code>off</code>.</p>
     *        <p>
     *        When you specify <code>fargateTaskRetirementWaitPeriod</code> for the <code>name</code>, the following are
     *        the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> - Amazon Web Services sends the notification, and immediately retires the affected tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>7</code> - Amazon Web Services sends the notification, and waits 7 calendar days to retire the
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>14</code> - Amazon Web Services sends the notification, and waits 14 calendar days to retire the
     *        tasks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountSettingRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it modifies
     * the account setting for all users, roles, and the root user of the account unless a user or role explicitly
     * overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
     * </p>
     * <note>
     * <p>
     * You must use the root user when you set the Fargate wait time (<code>fargateTaskRetirementWaitPeriod</code>).
     * </p>
     * <p>
     * Federated users assume the account setting of the root user and can't have explicit account settings set for
     * them.
     * </p>
     * </note>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it
     *        modifies the account setting for all users, roles, and the root user of the account unless a user or role
     *        explicitly overrides these settings. If this field is omitted, the setting is changed only for the
     *        authenticated user.</p> <note>
     *        <p>
     *        You must use the root user when you set the Fargate wait time (
     *        <code>fargateTaskRetirementWaitPeriod</code>).
     *        </p>
     *        <p>
     *        Federated users assume the account setting of the root user and can't have explicit account settings set
     *        for them.
     *        </p>
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it modifies
     * the account setting for all users, roles, and the root user of the account unless a user or role explicitly
     * overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
     * </p>
     * <note>
     * <p>
     * You must use the root user when you set the Fargate wait time (<code>fargateTaskRetirementWaitPeriod</code>).
     * </p>
     * <p>
     * Federated users assume the account setting of the root user and can't have explicit account settings set for
     * them.
     * </p>
     * </note>
     * 
     * @return The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it
     *         modifies the account setting for all users, roles, and the root user of the account unless a user or role
     *         explicitly overrides these settings. If this field is omitted, the setting is changed only for the
     *         authenticated user.</p> <note>
     *         <p>
     *         You must use the root user when you set the Fargate wait time (
     *         <code>fargateTaskRetirementWaitPeriod</code>).
     *         </p>
     *         <p>
     *         Federated users assume the account setting of the root user and can't have explicit account settings set
     *         for them.
     *         </p>
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it modifies
     * the account setting for all users, roles, and the root user of the account unless a user or role explicitly
     * overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
     * </p>
     * <note>
     * <p>
     * You must use the root user when you set the Fargate wait time (<code>fargateTaskRetirementWaitPeriod</code>).
     * </p>
     * <p>
     * Federated users assume the account setting of the root user and can't have explicit account settings set for
     * them.
     * </p>
     * </note>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it
     *        modifies the account setting for all users, roles, and the root user of the account unless a user or role
     *        explicitly overrides these settings. If this field is omitted, the setting is changed only for the
     *        authenticated user.</p> <note>
     *        <p>
     *        You must use the root user when you set the Fargate wait time (
     *        <code>fargateTaskRetirementWaitPeriod</code>).
     *        </p>
     *        <p>
     *        Federated users assume the account setting of the root user and can't have explicit account settings set
     *        for them.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountSettingRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountSettingRequest == false)
            return false;
        PutAccountSettingRequest other = (PutAccountSettingRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountSettingRequest clone() {
        return (PutAccountSettingRequest) super.clone();
    }

}
