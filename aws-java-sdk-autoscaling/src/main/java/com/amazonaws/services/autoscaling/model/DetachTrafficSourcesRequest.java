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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachTrafficSources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachTrafficSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     * sources.
     * </p>
     * <p>
     * Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When you
     * detach a target group, it enters the <code>Removing</code> state while deregistering the instances in the group.
     * When all instances are deregistered, then you can no longer describe the target group using the
     * <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier> trafficSources;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachTrafficSourcesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     * sources.
     * </p>
     * <p>
     * Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When you
     * detach a target group, it enters the <code>Removing</code> state while deregistering the instances in the group.
     * When all instances are deregistered, then you can no longer describe the target group using the
     * <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * </p>
     * 
     * @return The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     *         sources.</p>
     *         <p>
     *         Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When
     *         you detach a target group, it enters the <code>Removing</code> state while deregistering the instances in
     *         the group. When all instances are deregistered, then you can no longer describe the target group using
     *         the <a>DescribeTrafficSources</a> API call. The instances continue to run.
     */

    public java.util.List<TrafficSourceIdentifier> getTrafficSources() {
        if (trafficSources == null) {
            trafficSources = new com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>();
        }
        return trafficSources;
    }

    /**
     * <p>
     * The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     * sources.
     * </p>
     * <p>
     * Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When you
     * detach a target group, it enters the <code>Removing</code> state while deregistering the instances in the group.
     * When all instances are deregistered, then you can no longer describe the target group using the
     * <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * </p>
     * 
     * @param trafficSources
     *        The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     *        sources.</p>
     *        <p>
     *        Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When
     *        you detach a target group, it enters the <code>Removing</code> state while deregistering the instances in
     *        the group. When all instances are deregistered, then you can no longer describe the target group using the
     *        <a>DescribeTrafficSources</a> API call. The instances continue to run.
     */

    public void setTrafficSources(java.util.Collection<TrafficSourceIdentifier> trafficSources) {
        if (trafficSources == null) {
            this.trafficSources = null;
            return;
        }

        this.trafficSources = new com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>(trafficSources);
    }

    /**
     * <p>
     * The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     * sources.
     * </p>
     * <p>
     * Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When you
     * detach a target group, it enters the <code>Removing</code> state while deregistering the instances in the group.
     * When all instances are deregistered, then you can no longer describe the target group using the
     * <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficSources(java.util.Collection)} or {@link #withTrafficSources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param trafficSources
     *        The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     *        sources.</p>
     *        <p>
     *        Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When
     *        you detach a target group, it enters the <code>Removing</code> state while deregistering the instances in
     *        the group. When all instances are deregistered, then you can no longer describe the target group using the
     *        <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachTrafficSourcesRequest withTrafficSources(TrafficSourceIdentifier... trafficSources) {
        if (this.trafficSources == null) {
            setTrafficSources(new com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>(trafficSources.length));
        }
        for (TrafficSourceIdentifier ele : trafficSources) {
            this.trafficSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     * sources.
     * </p>
     * <p>
     * Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When you
     * detach a target group, it enters the <code>Removing</code> state while deregistering the instances in the group.
     * When all instances are deregistered, then you can no longer describe the target group using the
     * <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * </p>
     * 
     * @param trafficSources
     *        The unique identifiers of one or more traffic sources you are detaching. You can specify up to 10 traffic
     *        sources.</p>
     *        <p>
     *        Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group. When
     *        you detach a target group, it enters the <code>Removing</code> state while deregistering the instances in
     *        the group. When all instances are deregistered, then you can no longer describe the target group using the
     *        <a>DescribeTrafficSources</a> API call. The instances continue to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachTrafficSourcesRequest withTrafficSources(java.util.Collection<TrafficSourceIdentifier> trafficSources) {
        setTrafficSources(trafficSources);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getTrafficSources() != null)
            sb.append("TrafficSources: ").append(getTrafficSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachTrafficSourcesRequest == false)
            return false;
        DetachTrafficSourcesRequest other = (DetachTrafficSourcesRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTrafficSources() == null ^ this.getTrafficSources() == null)
            return false;
        if (other.getTrafficSources() != null && other.getTrafficSources().equals(this.getTrafficSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTrafficSources() == null) ? 0 : getTrafficSources().hashCode());
        return hashCode;
    }

    @Override
    public DetachTrafficSourcesRequest clone() {
        return (DetachTrafficSourcesRequest) super.clone();
    }

}
