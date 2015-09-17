/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class SubscriptionFilter implements Serializable, Cloneable {

    private String filterName;

    private String logGroupName;

    private String filterPattern;

    private String destinationArn;

    private String roleArn;

    private Long creationTime;

    /**
     * Sets the value of the FilterName property for this object.
     * 
     * @param filterName
     *        The new value for the FilterName property for this object.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * Returns the value of the FilterName property for this object.
     * 
     * @return The value of the FilterName property for this object.
     */
    public String getFilterName() {
        return this.filterName;
    }

    /**
     * Sets the value of the FilterName property for this object.
     * 
     * @param filterName
     *        The new value for the FilterName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * Sets the value of the LogGroupName property for this object.
     * 
     * @param logGroupName
     *        The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * 
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Sets the value of the LogGroupName property for this object.
     * 
     * @param logGroupName
     *        The new value for the LogGroupName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * Sets the value of the FilterPattern property for this object.
     * 
     * @param filterPattern
     *        The new value for the FilterPattern property for this object.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * Returns the value of the FilterPattern property for this object.
     * 
     * @return The value of the FilterPattern property for this object.
     */
    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * Sets the value of the FilterPattern property for this object.
     * 
     * @param filterPattern
     *        The new value for the FilterPattern property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * Sets the value of the DestinationArn property for this object.
     * 
     * @param destinationArn
     *        The new value for the DestinationArn property for this object.
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * Returns the value of the DestinationArn property for this object.
     * 
     * @return The value of the DestinationArn property for this object.
     */
    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * Sets the value of the DestinationArn property for this object.
     * 
     * @param destinationArn
     *        The new value for the DestinationArn property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * Sets the value of the RoleArn property for this object.
     * 
     * @param roleArn
     *        The new value for the RoleArn property for this object.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * Returns the value of the RoleArn property for this object.
     * 
     * @return The value of the RoleArn property for this object.
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * Sets the value of the RoleArn property for this object.
     * 
     * @param roleArn
     *        The new value for the RoleArn property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Sets the value of the CreationTime property for this object.
     * 
     * @param creationTime
     *        The new value for the CreationTime property for this object.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Returns the value of the CreationTime property for this object.
     * 
     * @return The value of the CreationTime property for this object.
     */
    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * Sets the value of the CreationTime property for this object.
     * 
     * @param creationTime
     *        The new value for the CreationTime property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
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
        if (getFilterName() != null)
            sb.append("FilterName: " + getFilterName() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: " + getDestinationArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
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
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null
                && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getDestinationArn() == null
                ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SubscriptionFilter clone() {
        try {
            return (SubscriptionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}