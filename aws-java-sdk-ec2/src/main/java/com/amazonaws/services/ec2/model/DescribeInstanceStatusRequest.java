/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the status of one or more instances.
 * </p>
 * <p>
 * Instance status includes the following components:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <b>Status checks</b> - Amazon EC2 performs status checks on running
 * EC2 instances to identify hardware and software issues. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html"> Status Checks for Your Instances </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"> Troubleshooting Instances with Failed Status Checks </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * </li>
 * <li> <p>
 * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as
 * reboot, stop, or terminate) for your instances related to hardware
 * issues, software updates, or system maintenance. For more information,
 * see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html"> Scheduled Events for Your Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * </li>
 * <li> <p>
 * <b>Instance state</b> - You can manage your instances from the moment
 * you launch them through their termination. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstanceStatus(DescribeInstanceStatusRequest)
 */
public class DescribeInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstanceStatusRequest> {

    /**
     * One or more instance IDs. <p>Default: Describes all your instances.
     * <p>Constraints: Maximum 100 explicitly specified instance IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.code</code> - The code for the scheduled event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     * <p><code>instance-state-code</code> - The code for the instance state,
     * as a 16-bit unsigned integer. The high byte is an opaque internal
     * value and should be ignored. The low byte is set based on the state
     * represented. The valid values are 0 (pending), 16 (running), 32
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
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. You cannot specify this parameter and the
     * instance IDs parameter in the same request.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceIds(java.util.Collection)} or {@link
     * #withInstanceIds(java.util.Collection)} if you want to override the
     * existing values.
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
     * <p><code>event.code</code> - The code for the scheduled event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     * <p><code>instance-state-code</code> - The code for the instance state,
     * as a 16-bit unsigned integer. The high byte is an opaque internal
     * value and should be ignored. The low byte is set based on the state
     * represented. The valid values are 0 (pending), 16 (running), 32
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
     *         <p><code>event.code</code> - The code for the scheduled event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     *         <p><code>instance-state-code</code> - The code for the instance state,
     *         as a 16-bit unsigned integer. The high byte is an opaque internal
     *         value and should be ignored. The low byte is set based on the state
     *         represented. The valid values are 0 (pending), 16 (running), 32
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
     * <p><code>event.code</code> - The code for the scheduled event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     * <p><code>instance-state-code</code> - The code for the instance state,
     * as a 16-bit unsigned integer. The high byte is an opaque internal
     * value and should be ignored. The low byte is set based on the state
     * represented. The valid values are 0 (pending), 16 (running), 32
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
     *         <p><code>event.code</code> - The code for the scheduled event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     *         <p><code>instance-state-code</code> - The code for the instance state,
     *         as a 16-bit unsigned integer. The high byte is an opaque internal
     *         value and should be ignored. The low byte is set based on the state
     *         represented. The valid values are 0 (pending), 16 (running), 32
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
     * <p><code>event.code</code> - The code for the scheduled event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     * <p><code>instance-state-code</code> - The code for the instance state,
     * as a 16-bit unsigned integer. The high byte is an opaque internal
     * value and should be ignored. The low byte is set based on the state
     * represented. The valid values are 0 (pending), 16 (running), 32
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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.code</code> - The code for the scheduled event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     *         <p><code>instance-state-code</code> - The code for the instance state,
     *         as a 16-bit unsigned integer. The high byte is an opaque internal
     *         value and should be ignored. The low byte is set based on the state
     *         represented. The valid values are 0 (pending), 16 (running), 32
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
     * <p><code>event.code</code> - The code for the scheduled event
     * (<code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>). </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.not-after</code> - The latest end time for the
     * scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     * <p><code>instance-state-code</code> - The code for the instance state,
     * as a 16-bit unsigned integer. The high byte is an opaque internal
     * value and should be ignored. The low byte is set based on the state
     * represented. The valid values are 0 (pending), 16 (running), 32
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
     *         <p><code>event.code</code> - The code for the scheduled event
     *         (<code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>). </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.not-after</code> - The latest end time for the
     *         scheduled event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>). </li> <li>
     *         <p><code>instance-state-code</code> - The code for the instance state,
     *         as a 16-bit unsigned integer. The high byte is an opaque internal
     *         value and should be ignored. The low byte is set based on the state
     *         represented. The valid values are 0 (pending), 16 (running), 32
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
     * The token to retrieve the next page of results.
     *
     * @return The token to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     *
     * @param nextToken The token to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstanceStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. You cannot specify this parameter and the
     * instance IDs parameter in the same request.
     *
     * @return The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. You cannot specify this parameter and the
     *         instance IDs parameter in the same request.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. You cannot specify this parameter and the
     * instance IDs parameter in the same request.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. You cannot specify this parameter and the
     *         instance IDs parameter in the same request.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. You cannot specify this parameter and the
     * instance IDs parameter in the same request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. You cannot specify this parameter and the
     *         instance IDs parameter in the same request.
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
    
    @Override
    public DescribeInstanceStatusRequest clone() {
        
            return (DescribeInstanceStatusRequest) super.clone();
    }

}
    