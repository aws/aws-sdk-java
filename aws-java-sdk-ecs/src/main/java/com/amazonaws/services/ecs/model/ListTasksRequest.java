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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The container instance ID or full ARN of the container instance with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>containerInstance</code> limits the results to tasks that belong to that container
     * instance.
     * </p>
     */
    private String containerInstance;
    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code> results. Specifying a <code>family</code>
     * limits the results to tasks that belong to that family.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this parameter is
     * used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results. Specifying a <code>startedBy</code> value
     * limits the results to tasks that were started with that value.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>serviceName</code> limits the results to tasks that belong to that service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     */
    private String desiredStatus;
    /**
     * <p>
     * The launch type for services to list.
     * </p>
     */
    private String launchType;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do
     *        not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do
     *         not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do
     *        not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>containerInstance</code> limits the results to tasks that belong to that container
     * instance.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN of the container instance with which to filter the
     *        <code>ListTasks</code> results. Specifying a <code>containerInstance</code> limits the results to tasks
     *        that belong to that container instance.
     */

    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>containerInstance</code> limits the results to tasks that belong to that container
     * instance.
     * </p>
     * 
     * @return The container instance ID or full ARN of the container instance with which to filter the
     *         <code>ListTasks</code> results. Specifying a <code>containerInstance</code> limits the results to tasks
     *         that belong to that container instance.
     */

    public String getContainerInstance() {
        return this.containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>containerInstance</code> limits the results to tasks that belong to that container
     * instance.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN of the container instance with which to filter the
     *        <code>ListTasks</code> results. Specifying a <code>containerInstance</code> limits the results to tasks
     *        that belong to that container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withContainerInstance(String containerInstance) {
        setContainerInstance(containerInstance);
        return this;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code> results. Specifying a <code>family</code>
     * limits the results to tasks that belong to that family.
     * </p>
     * 
     * @param family
     *        The name of the family with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>family</code> limits the results to tasks that belong to that family.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code> results. Specifying a <code>family</code>
     * limits the results to tasks that belong to that family.
     * </p>
     * 
     * @return The name of the family with which to filter the <code>ListTasks</code> results. Specifying a
     *         <code>family</code> limits the results to tasks that belong to that family.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code> results. Specifying a <code>family</code>
     * limits the results to tasks that belong to that family.
     * </p>
     * 
     * @param family
     *        The name of the family with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>family</code> limits the results to tasks that belong to that family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTasks</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this parameter is
     * used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this
     *        parameter is used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListTasks</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up
     *        to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this parameter is
     * used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this
     *         parameter is used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page
     *         along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *         seen by sending another <code>ListTasks</code> request with the returned <code>nextToken</code> value.
     *         This value can be between 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns
     *         up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this parameter is
     * used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned <code>nextToken</code> value. This value can be between
     * 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task results returned by <code>ListTasks</code> in paginated output. When this
     *        parameter is used, <code>ListTasks</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListTasks</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 100. If this parameter is not used, then <code>ListTasks</code> returns up
     *        to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results. Specifying a <code>startedBy</code> value
     * limits the results to tasks that were started with that value.
     * </p>
     * 
     * @param startedBy
     *        The <code>startedBy</code> value with which to filter the task results. Specifying a
     *        <code>startedBy</code> value limits the results to tasks that were started with that value.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results. Specifying a <code>startedBy</code> value
     * limits the results to tasks that were started with that value.
     * </p>
     * 
     * @return The <code>startedBy</code> value with which to filter the task results. Specifying a
     *         <code>startedBy</code> value limits the results to tasks that were started with that value.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results. Specifying a <code>startedBy</code> value
     * limits the results to tasks that were started with that value.
     * </p>
     * 
     * @param startedBy
     *        The <code>startedBy</code> value with which to filter the task results. Specifying a
     *        <code>startedBy</code> value limits the results to tasks that were started with that value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>serviceName</code> limits the results to tasks that belong to that service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>serviceName</code> limits the results to tasks that belong to that service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>serviceName</code> limits the results to tasks that belong to that service.
     * </p>
     * 
     * @return The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     *         <code>serviceName</code> limits the results to tasks that belong to that service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>serviceName</code> limits the results to tasks that belong to that service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>serviceName</code> limits the results to tasks that belong to that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * 
     * @param desiredStatus
     *        The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     *        desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting
     *        properly or have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks
     *        that Amazon ECS has set the desired status to <code>RUNNING</code>.</p> <note>
     *        <p>
     *        Although you can filter results based on a desired status of <code>PENDING</code>, this does not return
     *        any results. Amazon ECS never sets the desired status of a task to that value (only a task's
     *        <code>lastStatus</code> may have a value of <code>PENDING</code>).
     *        </p>
     * @see DesiredStatus
     */

    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * 
     * @return The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     *         <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set
     *         the desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting
     *         properly or have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks
     *         that Amazon ECS has set the desired status to <code>RUNNING</code>.</p> <note>
     *         <p>
     *         Although you can filter results based on a desired status of <code>PENDING</code>, this does not return
     *         any results. Amazon ECS never sets the desired status of a task to that value (only a task's
     *         <code>lastStatus</code> may have a value of <code>PENDING</code>).
     *         </p>
     * @see DesiredStatus
     */

    public String getDesiredStatus() {
        return this.desiredStatus;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * 
     * @param desiredStatus
     *        The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     *        desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting
     *        properly or have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks
     *        that Amazon ECS has set the desired status to <code>RUNNING</code>.</p> <note>
     *        <p>
     *        Although you can filter results based on a desired status of <code>PENDING</code>, this does not return
     *        any results. Amazon ECS never sets the desired status of a task to that value (only a task's
     *        <code>lastStatus</code> may have a value of <code>PENDING</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredStatus
     */

    public ListTasksRequest withDesiredStatus(String desiredStatus) {
        setDesiredStatus(desiredStatus);
        return this;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * 
     * @param desiredStatus
     *        The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     *        desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting
     *        properly or have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks
     *        that Amazon ECS has set the desired status to <code>RUNNING</code>.</p> <note>
     *        <p>
     *        Although you can filter results based on a desired status of <code>PENDING</code>, this does not return
     *        any results. Amazon ECS never sets the desired status of a task to that value (only a task's
     *        <code>lastStatus</code> may have a value of <code>PENDING</code>).
     *        </p>
     * @see DesiredStatus
     */

    public void setDesiredStatus(DesiredStatus desiredStatus) {
        withDesiredStatus(desiredStatus);
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     * <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     * desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting properly or
     * have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks that Amazon ECS has
     * set the desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of <code>PENDING</code>, this does not return any
     * results. Amazon ECS never sets the desired status of a task to that value (only a task's <code>lastStatus</code>
     * may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * 
     * @param desiredStatus
     *        The task desired status with which to filter the <code>ListTasks</code> results. Specifying a
     *        <code>desiredStatus</code> of <code>STOPPED</code> limits the results to tasks that Amazon ECS has set the
     *        desired status to <code>STOPPED</code>. This can be useful for debugging tasks that are not starting
     *        properly or have died or finished. The default status filter is <code>RUNNING</code>, which shows tasks
     *        that Amazon ECS has set the desired status to <code>RUNNING</code>.</p> <note>
     *        <p>
     *        Although you can filter results based on a desired status of <code>PENDING</code>, this does not return
     *        any results. Amazon ECS never sets the desired status of a task to that value (only a task's
     *        <code>lastStatus</code> may have a value of <code>PENDING</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredStatus
     */

    public ListTasksRequest withDesiredStatus(DesiredStatus desiredStatus) {
        this.desiredStatus = desiredStatus.toString();
        return this;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * 
     * @param launchType
     *        The launch type for services to list.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * 
     * @return The launch type for services to list.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * 
     * @param launchType
     *        The launch type for services to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public ListTasksRequest withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * 
     * @param launchType
     *        The launch type for services to list.
     * @see LaunchType
     */

    public void setLaunchType(LaunchType launchType) {
        withLaunchType(launchType);
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * 
     * @param launchType
     *        The launch type for services to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public ListTasksRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getContainerInstance() != null)
            sb.append("ContainerInstance: ").append(getContainerInstance()).append(",");
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getDesiredStatus() != null)
            sb.append("DesiredStatus: ").append(getDesiredStatus()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTasksRequest == false)
            return false;
        ListTasksRequest other = (ListTasksRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null)
            return false;
        if (other.getDesiredStatus() != null && other.getDesiredStatus().equals(this.getDesiredStatus()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getDesiredStatus() == null) ? 0 : getDesiredStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        return hashCode;
    }

    @Override
    public ListTasksRequest clone() {
        return (ListTasksRequest) super.clone();
    }

}
