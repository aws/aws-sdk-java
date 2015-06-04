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
 * Subscription Filter
 */
public class SubscriptionFilter implements Serializable, Cloneable {

    /**
     * A name for a metric or subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    private String logGroupName;

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String filterPattern;

    private String destinationArn;

    private String roleArn;

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * A name for a metric or subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return A name for a metric or subscription filter.
     */
    public String getFilterName() {
        return filterName;
    }
    
    /**
     * A name for a metric or subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName A name for a metric or subscription filter.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    /**
     * A name for a metric or subscription filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName A name for a metric or subscription filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     */
    public String getFilterPattern() {
        return filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * Returns the value of the DestinationArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the DestinationArn property for this object.
     */
    public String getDestinationArn() {
        return destinationArn;
    }
    
    /**
     * Sets the value of the DestinationArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn The new value for the DestinationArn property for this object.
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }
    
    /**
     * Sets the value of the DestinationArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn The new value for the DestinationArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * Returns the value of the RoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the RoleArn property for this object.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * Sets the value of the RoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The new value for the RoleArn property for this object.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * Sets the value of the RoleArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The new value for the RoleArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public Long getCreationTime() {
        return creationTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SubscriptionFilter withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
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
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() + ",");
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getDestinationArn() != null) sb.append("DestinationArn: " + getDestinationArn() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SubscriptionFilter == false) return false;
        SubscriptionFilter other = (SubscriptionFilter)obj;
        
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null) return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        return true;
    }
    
    @Override
    public SubscriptionFilter clone() {
        try {
            return (SubscriptionFilter) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    