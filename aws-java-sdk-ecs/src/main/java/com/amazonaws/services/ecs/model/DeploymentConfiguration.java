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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional deployment parameters that control how many tasks run during a deployment and the ordering of stopping and
 * starting tasks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeploymentConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <note>
     * <p>
     * The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     * deployment type.
     * </p>
     * </note>
     * <p>
     * The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service can't
     * reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition to a failed
     * state and stop launching new tasks. If rollback is enabled, when a service deployment fails, the service is
     * rolled back to the last deployment that completed successfully.
     * </p>
     */
    private DeploymentCircuitBreaker deploymentCircuitBreaker;
    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the <code>maximumPercent</code>
     * parameter represents an upper limit on the number of your service's tasks that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service is using the <code>REPLICA</code> service scheduler and has a
     * <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of 200%, the scheduler may start
     * four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are
     * available). The default <code>maximumPercent</code> value for a service using the <code>REPLICA</code> service
     * scheduler is 200%.
     * </p>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value and is used
     * to define the upper limit on the number of the tasks in the service that remain in the <code>RUNNING</code> state
     * while the container instances are in the <code>DRAINING</code> state. If the tasks in the service use the Fargate
     * launch type, the maximum percent value is not used, although it is returned when describing your service.
     * </p>
     */
    private Integer maximumPercent;
    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the
     * <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing tasks to free up cluster
     * capacity before starting two new tasks.
     * </p>
     * <p>
     * For services that <i>do not</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A service is considered healthy if all essential containers within the tasks in the service pass their health
     * checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for 40 seconds
     * after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum healthy percent
     * total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has one or more essential containers with a health check defined, the service scheduler will wait for
     * the task to reach a healthy status before counting it towards the minimum healthy percent total. A task is
     * considered healthy when all essential containers within the task have passed their health checks. The amount of
     * time the service scheduler can wait for is determined by the container health check settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For services are that <i>do</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for the load
     * balancer target group health check to return a healthy status before counting the task towards the minimum
     * healthy percent total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has an essential container with a health check defined, the service scheduler will wait for both the
     * task to reach a healthy status and the load balancer target group health check to return a healthy status before
     * counting the task towards the minimum healthy percent total.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If a service is
     * using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and is running
     * tasks that use the Fargate launch type, the minimum healthy percent value is not used, although it is returned
     * when describing your service.
     * </p>
     */
    private Integer minimumHealthyPercent;
    /**
     * <p>
     * Information about the CloudWatch alarms.
     * </p>
     */
    private DeploymentAlarms alarms;

    /**
     * <note>
     * <p>
     * The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     * deployment type.
     * </p>
     * </note>
     * <p>
     * The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service can't
     * reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition to a failed
     * state and stop launching new tasks. If rollback is enabled, when a service deployment fails, the service is
     * rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @param deploymentCircuitBreaker
     *        <p>
     *        The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     *        deployment type.
     *        </p>
     *        </note>
     *        <p>
     *        The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service
     *        can't reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition
     *        to a failed state and stop launching new tasks. If rollback is enabled, when a service deployment fails,
     *        the service is rolled back to the last deployment that completed successfully.
     */

    public void setDeploymentCircuitBreaker(DeploymentCircuitBreaker deploymentCircuitBreaker) {
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
    }

    /**
     * <note>
     * <p>
     * The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     * deployment type.
     * </p>
     * </note>
     * <p>
     * The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service can't
     * reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition to a failed
     * state and stop launching new tasks. If rollback is enabled, when a service deployment fails, the service is
     * rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @return <p>
     *         The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     *         deployment type.
     *         </p>
     *         </note>
     *         <p>
     *         The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service
     *         can't reach a steady state. If deployment circuit breaker is enabled, a service deployment will
     *         transition to a failed state and stop launching new tasks. If rollback is enabled, when a service
     *         deployment fails, the service is rolled back to the last deployment that completed successfully.
     */

    public DeploymentCircuitBreaker getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker;
    }

    /**
     * <note>
     * <p>
     * The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     * deployment type.
     * </p>
     * </note>
     * <p>
     * The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service can't
     * reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition to a failed
     * state and stop launching new tasks. If rollback is enabled, when a service deployment fails, the service is
     * rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @param deploymentCircuitBreaker
     *        <p>
     *        The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>)
     *        deployment type.
     *        </p>
     *        </note>
     *        <p>
     *        The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service
     *        can't reach a steady state. If deployment circuit breaker is enabled, a service deployment will transition
     *        to a failed state and stop launching new tasks. If rollback is enabled, when a service deployment fails,
     *        the service is rolled back to the last deployment that completed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withDeploymentCircuitBreaker(DeploymentCircuitBreaker deploymentCircuitBreaker) {
        setDeploymentCircuitBreaker(deploymentCircuitBreaker);
        return this;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the <code>maximumPercent</code>
     * parameter represents an upper limit on the number of your service's tasks that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service is using the <code>REPLICA</code> service scheduler and has a
     * <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of 200%, the scheduler may start
     * four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are
     * available). The default <code>maximumPercent</code> value for a service using the <code>REPLICA</code> service
     * scheduler is 200%.
     * </p>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value and is used
     * to define the upper limit on the number of the tasks in the service that remain in the <code>RUNNING</code> state
     * while the container instances are in the <code>DRAINING</code> state. If the tasks in the service use the Fargate
     * launch type, the maximum percent value is not used, although it is returned when describing your service.
     * </p>
     * 
     * @param maximumPercent
     *        If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *        <code>maximumPercent</code> parameter represents an upper limit on the number of your service's tasks that
     *        are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage
     *        of the <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to
     *        define the deployment batch size. For example, if your service is using the <code>REPLICA</code> service
     *        scheduler and has a <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of
     *        200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the
     *        cluster resources required to do this are available). The default <code>maximumPercent</code> value for a
     *        service using the <code>REPLICA</code> service scheduler is 200%.</p>
     *        <p>
     *        If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value
     *        and is used to define the upper limit on the number of the tasks in the service that remain in the
     *        <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If the
     *        tasks in the service use the Fargate launch type, the maximum percent value is not used, although it is
     *        returned when describing your service.
     */

    public void setMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the <code>maximumPercent</code>
     * parameter represents an upper limit on the number of your service's tasks that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service is using the <code>REPLICA</code> service scheduler and has a
     * <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of 200%, the scheduler may start
     * four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are
     * available). The default <code>maximumPercent</code> value for a service using the <code>REPLICA</code> service
     * scheduler is 200%.
     * </p>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value and is used
     * to define the upper limit on the number of the tasks in the service that remain in the <code>RUNNING</code> state
     * while the container instances are in the <code>DRAINING</code> state. If the tasks in the service use the Fargate
     * launch type, the maximum percent value is not used, although it is returned when describing your service.
     * </p>
     * 
     * @return If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *         <code>maximumPercent</code> parameter represents an upper limit on the number of your service's tasks
     *         that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a
     *         percentage of the <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables
     *         you to define the deployment batch size. For example, if your service is using the <code>REPLICA</code>
     *         service scheduler and has a <code>desiredCount</code> of four tasks and a <code>maximumPercent</code>
     *         value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that
     *         the cluster resources required to do this are available). The default <code>maximumPercent</code> value
     *         for a service using the <code>REPLICA</code> service scheduler is 200%.</p>
     *         <p>
     *         If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code>
     *         deployment types and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the
     *         default value and is used to define the upper limit on the number of the tasks in the service that remain
     *         in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *         If the tasks in the service use the Fargate launch type, the maximum percent value is not used, although
     *         it is returned when describing your service.
     */

    public Integer getMaximumPercent() {
        return this.maximumPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the <code>maximumPercent</code>
     * parameter represents an upper limit on the number of your service's tasks that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service is using the <code>REPLICA</code> service scheduler and has a
     * <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of 200%, the scheduler may start
     * four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are
     * available). The default <code>maximumPercent</code> value for a service using the <code>REPLICA</code> service
     * scheduler is 200%.
     * </p>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value and is used
     * to define the upper limit on the number of the tasks in the service that remain in the <code>RUNNING</code> state
     * while the container instances are in the <code>DRAINING</code> state. If the tasks in the service use the Fargate
     * launch type, the maximum percent value is not used, although it is returned when describing your service.
     * </p>
     * 
     * @param maximumPercent
     *        If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *        <code>maximumPercent</code> parameter represents an upper limit on the number of your service's tasks that
     *        are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage
     *        of the <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to
     *        define the deployment batch size. For example, if your service is using the <code>REPLICA</code> service
     *        scheduler and has a <code>desiredCount</code> of four tasks and a <code>maximumPercent</code> value of
     *        200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the
     *        cluster resources required to do this are available). The default <code>maximumPercent</code> value for a
     *        service using the <code>REPLICA</code> service scheduler is 200%.</p>
     *        <p>
     *        If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and tasks that use the EC2 launch type, the <b>maximum percent</b> value is set to the default value
     *        and is used to define the upper limit on the number of the tasks in the service that remain in the
     *        <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If the
     *        tasks in the service use the Fargate launch type, the maximum percent value is not used, although it is
     *        returned when describing your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withMaximumPercent(Integer maximumPercent) {
        setMaximumPercent(maximumPercent);
        return this;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the
     * <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing tasks to free up cluster
     * capacity before starting two new tasks.
     * </p>
     * <p>
     * For services that <i>do not</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A service is considered healthy if all essential containers within the tasks in the service pass their health
     * checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for 40 seconds
     * after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum healthy percent
     * total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has one or more essential containers with a health check defined, the service scheduler will wait for
     * the task to reach a healthy status before counting it towards the minimum healthy percent total. A task is
     * considered healthy when all essential containers within the task have passed their health checks. The amount of
     * time the service scheduler can wait for is determined by the container health check settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For services are that <i>do</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for the load
     * balancer target group health check to return a healthy status before counting the task towards the minimum
     * healthy percent total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has an essential container with a health check defined, the service scheduler will wait for both the
     * task to reach a healthy status and the load balancer target group health check to return a healthy status before
     * counting the task towards the minimum healthy percent total.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If a service is
     * using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and is running
     * tasks that use the Fargate launch type, the minimum healthy percent value is not used, although it is returned
     * when describing your service.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *        <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that
     *        must remain in the <code>RUNNING</code> state during a deployment, as a percentage of the
     *        <code>desiredCount</code> (rounded up to the nearest integer). This parameter enables you to deploy
     *        without using additional cluster capacity. For example, if your service has a <code>desiredCount</code> of
     *        four tasks and a <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing
     *        tasks to free up cluster capacity before starting two new tasks. </p>
     *        <p>
     *        For services that <i>do not</i> use a load balancer, the following should be noted:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A service is considered healthy if all essential containers within the tasks in the service pass their
     *        health checks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has no essential containers with a health check defined, the service scheduler will wait for 40
     *        seconds after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum
     *        healthy percent total.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has one or more essential containers with a health check defined, the service scheduler will
     *        wait for the task to reach a healthy status before counting it towards the minimum healthy percent total.
     *        A task is considered healthy when all essential containers within the task have passed their health
     *        checks. The amount of time the service scheduler can wait for is determined by the container health check
     *        settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For services are that <i>do</i> use a load balancer, the following should be noted:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a task has no essential containers with a health check defined, the service scheduler will wait for the
     *        load balancer target group health check to return a healthy status before counting the task towards the
     *        minimum healthy percent total.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has an essential container with a health check defined, the service scheduler will wait for both
     *        the task to reach a healthy status and the load balancer target group health check to return a healthy
     *        status before counting the task towards the minimum healthy percent total.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set
     *        to the default value and is used to define the lower limit on the number of the tasks in the service that
     *        remain in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code>
     *        state. If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code>
     *        deployment types and is running tasks that use the Fargate launch type, the minimum healthy percent value
     *        is not used, although it is returned when describing your service.
     */

    public void setMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the
     * <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing tasks to free up cluster
     * capacity before starting two new tasks.
     * </p>
     * <p>
     * For services that <i>do not</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A service is considered healthy if all essential containers within the tasks in the service pass their health
     * checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for 40 seconds
     * after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum healthy percent
     * total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has one or more essential containers with a health check defined, the service scheduler will wait for
     * the task to reach a healthy status before counting it towards the minimum healthy percent total. A task is
     * considered healthy when all essential containers within the task have passed their health checks. The amount of
     * time the service scheduler can wait for is determined by the container health check settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For services are that <i>do</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for the load
     * balancer target group health check to return a healthy status before counting the task towards the minimum
     * healthy percent total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has an essential container with a health check defined, the service scheduler will wait for both the
     * task to reach a healthy status and the load balancer target group health check to return a healthy status before
     * counting the task towards the minimum healthy percent total.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If a service is
     * using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and is running
     * tasks that use the Fargate launch type, the minimum healthy percent value is not used, although it is returned
     * when describing your service.
     * </p>
     * 
     * @return If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *         <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that
     *         must remain in the <code>RUNNING</code> state during a deployment, as a percentage of the
     *         <code>desiredCount</code> (rounded up to the nearest integer). This parameter enables you to deploy
     *         without using additional cluster capacity. For example, if your service has a <code>desiredCount</code>
     *         of four tasks and a <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two
     *         existing tasks to free up cluster capacity before starting two new tasks. </p>
     *         <p>
     *         For services that <i>do not</i> use a load balancer, the following should be noted:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A service is considered healthy if all essential containers within the tasks in the service pass their
     *         health checks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a task has no essential containers with a health check defined, the service scheduler will wait for 40
     *         seconds after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum
     *         healthy percent total.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a task has one or more essential containers with a health check defined, the service scheduler will
     *         wait for the task to reach a healthy status before counting it towards the minimum healthy percent total.
     *         A task is considered healthy when all essential containers within the task have passed their health
     *         checks. The amount of time the service scheduler can wait for is determined by the container health check
     *         settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For services are that <i>do</i> use a load balancer, the following should be noted:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If a task has no essential containers with a health check defined, the service scheduler will wait for
     *         the load balancer target group health check to return a healthy status before counting the task towards
     *         the minimum healthy percent total.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a task has an essential container with a health check defined, the service scheduler will wait for
     *         both the task to reach a healthy status and the load balancer target group health check to return a
     *         healthy status before counting the task towards the minimum healthy percent total.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code>
     *         deployment types and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b>
     *         value is set to the default value and is used to define the lower limit on the number of the tasks in the
     *         service that remain in the <code>RUNNING</code> state while the container instances are in the
     *         <code>DRAINING</code> state. If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or
     *         <code>EXTERNAL</code> deployment types and is running tasks that use the Fargate launch type, the minimum
     *         healthy percent value is not used, although it is returned when describing your service.
     */

    public Integer getMinimumHealthyPercent() {
        return this.minimumHealthyPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment type, the
     * <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing tasks to free up cluster
     * capacity before starting two new tasks.
     * </p>
     * <p>
     * For services that <i>do not</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A service is considered healthy if all essential containers within the tasks in the service pass their health
     * checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for 40 seconds
     * after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum healthy percent
     * total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has one or more essential containers with a health check defined, the service scheduler will wait for
     * the task to reach a healthy status before counting it towards the minimum healthy percent total. A task is
     * considered healthy when all essential containers within the task have passed their health checks. The amount of
     * time the service scheduler can wait for is determined by the container health check settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For services are that <i>do</i> use a load balancer, the following should be noted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a task has no essential containers with a health check defined, the service scheduler will wait for the load
     * balancer target group health check to return a healthy status before counting the task towards the minimum
     * healthy percent total.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a task has an essential container with a health check defined, the service scheduler will wait for both the
     * task to reach a healthy status and the load balancer target group health check to return a healthy status before
     * counting the task towards the minimum healthy percent total.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types
     * and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If a service is
     * using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and is running
     * tasks that use the Fargate launch type, the minimum healthy percent value is not used, although it is returned
     * when describing your service.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        If a service is using the rolling update (<code>ECS</code>) deployment type, the
     *        <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that
     *        must remain in the <code>RUNNING</code> state during a deployment, as a percentage of the
     *        <code>desiredCount</code> (rounded up to the nearest integer). This parameter enables you to deploy
     *        without using additional cluster capacity. For example, if your service has a <code>desiredCount</code> of
     *        four tasks and a <code>minimumHealthyPercent</code> of 50%, the service scheduler may stop two existing
     *        tasks to free up cluster capacity before starting two new tasks. </p>
     *        <p>
     *        For services that <i>do not</i> use a load balancer, the following should be noted:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A service is considered healthy if all essential containers within the tasks in the service pass their
     *        health checks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has no essential containers with a health check defined, the service scheduler will wait for 40
     *        seconds after a task reaches a <code>RUNNING</code> state before the task is counted towards the minimum
     *        healthy percent total.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has one or more essential containers with a health check defined, the service scheduler will
     *        wait for the task to reach a healthy status before counting it towards the minimum healthy percent total.
     *        A task is considered healthy when all essential containers within the task have passed their health
     *        checks. The amount of time the service scheduler can wait for is determined by the container health check
     *        settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For services are that <i>do</i> use a load balancer, the following should be noted:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a task has no essential containers with a health check defined, the service scheduler will wait for the
     *        load balancer target group health check to return a healthy status before counting the task towards the
     *        minimum healthy percent total.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a task has an essential container with a health check defined, the service scheduler will wait for both
     *        the task to reach a healthy status and the load balancer target group health check to return a healthy
     *        status before counting the task towards the minimum healthy percent total.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and is running tasks that use the EC2 launch type, the <b>minimum healthy percent</b> value is set
     *        to the default value and is used to define the lower limit on the number of the tasks in the service that
     *        remain in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code>
     *        state. If a service is using either the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code>
     *        deployment types and is running tasks that use the Fargate launch type, the minimum healthy percent value
     *        is not used, although it is returned when describing your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withMinimumHealthyPercent(Integer minimumHealthyPercent) {
        setMinimumHealthyPercent(minimumHealthyPercent);
        return this;
    }

    /**
     * <p>
     * Information about the CloudWatch alarms.
     * </p>
     * 
     * @param alarms
     *        Information about the CloudWatch alarms.
     */

    public void setAlarms(DeploymentAlarms alarms) {
        this.alarms = alarms;
    }

    /**
     * <p>
     * Information about the CloudWatch alarms.
     * </p>
     * 
     * @return Information about the CloudWatch alarms.
     */

    public DeploymentAlarms getAlarms() {
        return this.alarms;
    }

    /**
     * <p>
     * Information about the CloudWatch alarms.
     * </p>
     * 
     * @param alarms
     *        Information about the CloudWatch alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withAlarms(DeploymentAlarms alarms) {
        setAlarms(alarms);
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
        if (getDeploymentCircuitBreaker() != null)
            sb.append("DeploymentCircuitBreaker: ").append(getDeploymentCircuitBreaker()).append(",");
        if (getMaximumPercent() != null)
            sb.append("MaximumPercent: ").append(getMaximumPercent()).append(",");
        if (getMinimumHealthyPercent() != null)
            sb.append("MinimumHealthyPercent: ").append(getMinimumHealthyPercent()).append(",");
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfiguration == false)
            return false;
        DeploymentConfiguration other = (DeploymentConfiguration) obj;
        if (other.getDeploymentCircuitBreaker() == null ^ this.getDeploymentCircuitBreaker() == null)
            return false;
        if (other.getDeploymentCircuitBreaker() != null && other.getDeploymentCircuitBreaker().equals(this.getDeploymentCircuitBreaker()) == false)
            return false;
        if (other.getMaximumPercent() == null ^ this.getMaximumPercent() == null)
            return false;
        if (other.getMaximumPercent() != null && other.getMaximumPercent().equals(this.getMaximumPercent()) == false)
            return false;
        if (other.getMinimumHealthyPercent() == null ^ this.getMinimumHealthyPercent() == null)
            return false;
        if (other.getMinimumHealthyPercent() != null && other.getMinimumHealthyPercent().equals(this.getMinimumHealthyPercent()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentCircuitBreaker() == null) ? 0 : getDeploymentCircuitBreaker().hashCode());
        hashCode = prime * hashCode + ((getMaximumPercent() == null) ? 0 : getMaximumPercent().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyPercent() == null) ? 0 : getMinimumHealthyPercent().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfiguration clone() {
        try {
            return (DeploymentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.DeploymentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
