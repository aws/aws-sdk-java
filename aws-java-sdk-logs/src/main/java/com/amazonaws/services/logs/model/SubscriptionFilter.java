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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a subscription filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/SubscriptionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     */
    private String filterName;
    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;

    private String filterPattern;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     */
    private String destinationArn;
    /** <p/> */
    private String roleArn;

    private String distribution;
    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     * UTC.
     * </p>
     */
    private Long creationTime;

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @param filterName
     *        The name of the subscription filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @return The name of the subscription filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @param filterName
     *        The name of the subscription filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * @param filterPattern
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * @return
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @param filterPattern
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the destination.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param roleArn
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p/>
     * 
     * @param roleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param distribution
     * @see Distribution
     */

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    /**
     * @return
     * @see Distribution
     */

    public String getDistribution() {
        return this.distribution;
    }

    /**
     * @param distribution
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Distribution
     */

    public SubscriptionFilter withDistribution(String distribution) {
        setDistribution(distribution);
        return this;
    }

    /**
     * @param distribution
     * @see Distribution
     */

    public void setDistribution(Distribution distribution) {
        withDistribution(distribution);
    }

    /**
     * @param distribution
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Distribution
     */

    public SubscriptionFilter withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     * UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970
     *        00:00:00 UTC.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     * UTC.
     * </p>
     * 
     * @return The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970
     *         00:00:00 UTC.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     * UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970
     *        00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionFilter withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
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
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDistribution() != null)
            sb.append("Distribution: ").append(getDistribution()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriptionFilter == false)
            return false;
        SubscriptionFilter other = (SubscriptionFilter) obj;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDistribution() == null ^ this.getDistribution() == null)
            return false;
        if (other.getDistribution() != null && other.getDistribution().equals(this.getDistribution()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDistribution() == null) ? 0 : getDistribution().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public SubscriptionFilter clone() {
        try {
            return (SubscriptionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.SubscriptionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
