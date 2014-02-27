/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInstanceStatusRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstanceStatus(DescribeInstanceStatusRequest) DescribeInstanceStatus operation}.
 * <p>
 * Describes the status of one or more instances, including any scheduled
 * events.
 * </p>
 * <p>
 * Instance status has two main components:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * System Status reports impaired functionality that stems from issues
 * related to the systems that support an instance, such as such as
 * hardware failures and network connectivity problems. This call reports
 * such problems as impaired reachability.
 * </p>
 * </li>
 * <li> <p>
 * Instance Status reports impaired functionality that arises from
 * problems internal to the instance. This call reports such problems as
 * impaired reachability.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Instance status provides information about four types of scheduled
 * events for an instance that may require your attention:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Scheduled Reboot: When Amazon EC2 determines that an instance must be
 * rebooted, the instances status returns one of two event codes:
 * <code>system-reboot</code> or <code>instance-reboot</code> . System
 * reboot commonly occurs if certain maintenance or upgrade operations
 * require a reboot of the underlying host that supports an instance.
 * Instance reboot commonly occurs if the instance must be rebooted,
 * rather than the underlying host. Rebooting events include a scheduled
 * start and end time.
 * </p>
 * </li>
 * <li> <p>
 * System Maintenance: When Amazon EC2 determines that an instance
 * requires maintenance that requires power or network impact, the
 * instance status is the event code <code>system-maintenance</code> .
 * System maintenance is either power maintenance or network maintenance.
 * For power maintenance, your instance will be unavailable for a brief
 * period of time and then rebooted. For network maintenance, your
 * instance will experience a brief loss of network connectivity. System
 * maintenance events include a scheduled start and end time. You will
 * also be notified by email if one of your instances is set for system
 * maintenance. The email message indicates when your instance is
 * scheduled for maintenance.
 * </p>
 * </li>
 * <li> <p>
 * Scheduled Retirement: When Amazon EC2 determines that an instance must
 * be shut down, the instance status is the event code
 * <code>instance-retirement</code> . Retirement commonly occurs when the
 * underlying host is degraded and must be replaced. Retirement events
 * include a scheduled start and end time. You will also be notified by
 * email if one of your instances is set to retiring. The email message
 * indicates when your instance will be permanently retired.
 * </p>
 * </li>
 * <li> <p>
 * Scheduled Stop: When Amazon EC2 determines that an instance must be
 * shut down, the instances status returns an event code called
 * <code>instance-stop</code> .
 * Stop events include a scheduled start and end time. You will
 * also be notified by email if one of your instances is set to stop. The
 * email message indicates when your instance will be stopped.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * When your instance is retired, it will either be terminated (if its
 * root device type is the instance-store) or stopped (if its root device
 * type is an EBS volume). Instances stopped due to retirement will not
 * be restarted, but you can do so manually. You can also avoid
 * retirement of EBS-backed instances by manually restarting your
 * instance when its event code is <code>instance-retirement</code> .
 * This ensures that your instance is started on a different underlying
 * host.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstanceStatus(DescribeInstanceStatusRequest)
 */
public class DescribeInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeInstanceStatusRequest> {

    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code identifying the type of event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event. </li> <li> <p><code>event.not-before</code> - The
     * earliest start time for the scheduled event. </li> <li>
     * <p><code>instance-state-code</code> - A code representing the state of
     * the instance, as a 16-bit unsigned integer. The high byte is an opaque
     * internal value and should be ignored. The low byte is set based on the
     * state represented. The valid values are 0 (pending), 16 (running), 32
     * (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </li> <li> <p><code>instance-state-name</code> - The state of the
     * instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> |
     * <code>stopping</code> | <code>stopped</code>). </li> <li>
     * <p><code>instance-status.reachability</code> - Filters on instance
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>instance-status.status</code> - The status of the instance
     * (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     * <li> <p><code>system-status.reachability</code> - Filters on system
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>system-status.status</code> - The system status of the
     * instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> |
     * <code>not-applicable</code>). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The next paginated set of results to return.
     */
    private String nextToken;

    /**
     * The maximum number of paginated instance items per response.
     * <p>Default: 1000
     */
    private Integer maxResults;

    /**
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running
     * instances only. <p>Default: <code>false</code>
     */
    private Boolean includeAllInstances;

    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     *
     * @return One or more instance IDs. <p>Default: Describes all your instances.
     *         <p>Constraints: Maximum 100 explicitly specified instance IDs.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     *
     * @param instanceIds One or more instance IDs. <p>Default: Describes all your instances.
     *         <p>Constraints: Maximum 100 explicitly specified instance IDs.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more instance IDs. <p>Default: Describes all your instances.
     *         <p>Constraints: Maximum 100 explicitly specified instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more instance IDs. <p>Default: Describes all your instances.
     *         <p>Constraints: Maximum 100 explicitly specified instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code identifying the type of event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event. </li> <li> <p><code>event.not-before</code> - The
     * earliest start time for the scheduled event. </li> <li>
     * <p><code>instance-state-code</code> - A code representing the state of
     * the instance, as a 16-bit unsigned integer. The high byte is an opaque
     * internal value and should be ignored. The low byte is set based on the
     * state represented. The valid values are 0 (pending), 16 (running), 32
     * (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </li> <li> <p><code>instance-state-name</code> - The state of the
     * instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> |
     * <code>stopping</code> | <code>stopped</code>). </li> <li>
     * <p><code>instance-status.reachability</code> - Filters on instance
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>instance-status.status</code> - The status of the instance
     * (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     * <li> <p><code>system-status.reachability</code> - Filters on system
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>system-status.status</code> - The system status of the
     * instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> |
     * <code>not-applicable</code>). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.code</code> - The code identifying the type of event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event. </li> <li> <p><code>event.not-before</code> - The
     *         earliest start time for the scheduled event. </li> <li>
     *         <p><code>instance-state-code</code> - A code representing the state of
     *         the instance, as a 16-bit unsigned integer. The high byte is an opaque
     *         internal value and should be ignored. The low byte is set based on the
     *         state represented. The valid values are 0 (pending), 16 (running), 32
     *         (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     *         </li> <li> <p><code>instance-state-name</code> - The state of the
     *         instance (<code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>). </li> <li>
     *         <p><code>instance-status.reachability</code> - Filters on instance
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>instance-status.status</code> - The status of the instance
     *         (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     *         <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     *         <li> <p><code>system-status.reachability</code> - Filters on system
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>system-status.status</code> - The system status of the
     *         instance (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code identifying the type of event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event. </li> <li> <p><code>event.not-before</code> - The
     * earliest start time for the scheduled event. </li> <li>
     * <p><code>instance-state-code</code> - A code representing the state of
     * the instance, as a 16-bit unsigned integer. The high byte is an opaque
     * internal value and should be ignored. The low byte is set based on the
     * state represented. The valid values are 0 (pending), 16 (running), 32
     * (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </li> <li> <p><code>instance-state-name</code> - The state of the
     * instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> |
     * <code>stopping</code> | <code>stopped</code>). </li> <li>
     * <p><code>instance-status.reachability</code> - Filters on instance
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>instance-status.status</code> - The status of the instance
     * (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     * <li> <p><code>system-status.reachability</code> - Filters on system
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>system-status.status</code> - The system status of the
     * instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> |
     * <code>not-applicable</code>). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.code</code> - The code identifying the type of event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event. </li> <li> <p><code>event.not-before</code> - The
     *         earliest start time for the scheduled event. </li> <li>
     *         <p><code>instance-state-code</code> - A code representing the state of
     *         the instance, as a 16-bit unsigned integer. The high byte is an opaque
     *         internal value and should be ignored. The low byte is set based on the
     *         state represented. The valid values are 0 (pending), 16 (running), 32
     *         (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     *         </li> <li> <p><code>instance-state-name</code> - The state of the
     *         instance (<code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>). </li> <li>
     *         <p><code>instance-status.reachability</code> - Filters on instance
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>instance-status.status</code> - The status of the instance
     *         (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     *         <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     *         <li> <p><code>system-status.reachability</code> - Filters on system
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>system-status.status</code> - The system status of the
     *         instance (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>). </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code identifying the type of event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event. </li> <li> <p><code>event.not-before</code> - The
     * earliest start time for the scheduled event. </li> <li>
     * <p><code>instance-state-code</code> - A code representing the state of
     * the instance, as a 16-bit unsigned integer. The high byte is an opaque
     * internal value and should be ignored. The low byte is set based on the
     * state represented. The valid values are 0 (pending), 16 (running), 32
     * (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </li> <li> <p><code>instance-state-name</code> - The state of the
     * instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> |
     * <code>stopping</code> | <code>stopped</code>). </li> <li>
     * <p><code>instance-status.reachability</code> - Filters on instance
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>instance-status.status</code> - The status of the instance
     * (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     * <li> <p><code>system-status.reachability</code> - Filters on system
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>system-status.status</code> - The system status of the
     * instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> |
     * <code>not-applicable</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.code</code> - The code identifying the type of event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event. </li> <li> <p><code>event.not-before</code> - The
     *         earliest start time for the scheduled event. </li> <li>
     *         <p><code>instance-state-code</code> - A code representing the state of
     *         the instance, as a 16-bit unsigned integer. The high byte is an opaque
     *         internal value and should be ignored. The low byte is set based on the
     *         state represented. The valid values are 0 (pending), 16 (running), 32
     *         (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     *         </li> <li> <p><code>instance-state-name</code> - The state of the
     *         instance (<code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>). </li> <li>
     *         <p><code>instance-status.reachability</code> - Filters on instance
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>instance-status.status</code> - The status of the instance
     *         (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     *         <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     *         <li> <p><code>system-status.reachability</code> - Filters on system
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>system-status.status</code> - The system status of the
     *         instance (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code identifying the type of event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event. </li> <li> <p><code>event.not-before</code> - The
     * earliest start time for the scheduled event. </li> <li>
     * <p><code>instance-state-code</code> - A code representing the state of
     * the instance, as a 16-bit unsigned integer. The high byte is an opaque
     * internal value and should be ignored. The low byte is set based on the
     * state represented. The valid values are 0 (pending), 16 (running), 32
     * (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </li> <li> <p><code>instance-state-name</code> - The state of the
     * instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> |
     * <code>stopping</code> | <code>stopped</code>). </li> <li>
     * <p><code>instance-status.reachability</code> - Filters on instance
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>instance-status.status</code> - The status of the instance
     * (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     * <li> <p><code>system-status.reachability</code> - Filters on system
     * status where the name is <code>reachability</code>
     * (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     * | <code>insufficient-data</code>). </li> <li>
     * <p><code>system-status.status</code> - The system status of the
     * instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> |
     * <code>not-applicable</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.code</code> - The code identifying the type of event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event. </li> <li> <p><code>event.not-before</code> - The
     *         earliest start time for the scheduled event. </li> <li>
     *         <p><code>instance-state-code</code> - A code representing the state of
     *         the instance, as a 16-bit unsigned integer. The high byte is an opaque
     *         internal value and should be ignored. The low byte is set based on the
     *         state represented. The valid values are 0 (pending), 16 (running), 32
     *         (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     *         </li> <li> <p><code>instance-state-name</code> - The state of the
     *         instance (<code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>). </li> <li>
     *         <p><code>instance-status.reachability</code> - Filters on instance
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>instance-status.status</code> - The status of the instance
     *         (<code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     *         <code>insufficient-data</code> | <code>not-applicable</code>). </li>
     *         <li> <p><code>system-status.reachability</code> - Filters on system
     *         status where the name is <code>reachability</code>
     *         (<code>passed</code> | <code>failed</code> | <code>initializing</code>
     *         | <code>insufficient-data</code>). </li> <li>
     *         <p><code>system-status.status</code> - The system status of the
     *         instance (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The next paginated set of results to return.
     *
     * @return The next paginated set of results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The next paginated set of results to return.
     *
     * @param nextToken The next paginated set of results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The next paginated set of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The next paginated set of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of paginated instance items per response.
     * <p>Default: 1000
     *
     * @return The maximum number of paginated instance items per response.
     *         <p>Default: 1000
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of paginated instance items per response.
     * <p>Default: 1000
     *
     * @param maxResults The maximum number of paginated instance items per response.
     *         <p>Default: 1000
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of paginated instance items per response.
     * <p>Default: 1000
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of paginated instance items per response.
     *         <p>Default: 1000
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running
     * instances only. <p>Default: <code>false</code>
     *
     * @return When <code>true</code>, includes the health status for all instances.
     *         When <code>false</code>, includes the health status for running
     *         instances only. <p>Default: <code>false</code>
     */
    public Boolean isIncludeAllInstances() {
        return includeAllInstances;
    }
    
    /**
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running
     * instances only. <p>Default: <code>false</code>
     *
     * @param includeAllInstances When <code>true</code>, includes the health status for all instances.
     *         When <code>false</code>, includes the health status for running
     *         instances only. <p>Default: <code>false</code>
     */
    public void setIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
    }
    
    /**
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running
     * instances only. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeAllInstances When <code>true</code>, includes the health status for all instances.
     *         When <code>false</code>, includes the health status for running
     *         instances only. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
        return this;
    }

    /**
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running
     * instances only. <p>Default: <code>false</code>
     *
     * @return When <code>true</code>, includes the health status for all instances.
     *         When <code>false</code>, includes the health status for running
     *         instances only. <p>Default: <code>false</code>
     */
    public Boolean getIncludeAllInstances() {
        return includeAllInstances;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceStatusRequest> getDryRunRequest() {
        Request<DescribeInstanceStatusRequest> request = new DescribeInstanceStatusRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (isIncludeAllInstances() != null) sb.append("IncludeAllInstances: " + isIncludeAllInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeAllInstances() == null) ? 0 : isIncludeAllInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceStatusRequest == false) return false;
        DescribeInstanceStatusRequest other = (DescribeInstanceStatusRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.isIncludeAllInstances() == null ^ this.isIncludeAllInstances() == null) return false;
        if (other.isIncludeAllInstances() != null && other.isIncludeAllInstances().equals(this.isIncludeAllInstances()) == false) return false; 
        return true;
    }
    
}
    