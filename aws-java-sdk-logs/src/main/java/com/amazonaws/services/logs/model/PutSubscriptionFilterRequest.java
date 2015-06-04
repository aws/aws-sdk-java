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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#putSubscriptionFilter(PutSubscriptionFilterRequest) PutSubscriptionFilter operation}.
 * <p>
 * Creates or updates a subscription filter and associates it with the
 * specified log group. Subscription filters allow you to subscribe to a
 * real-time stream of log events ingested through
 * <code>PutLogEvents</code> requests and have them delivered to a
 * specific destination. Currently the only supported destination is an
 * Amazon Kinesis stream belonging to the same account as the
 * subscription filter.
 * </p>
 * <p>
 * Currently there can only be one subscription filter associated with a
 * log group.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#putSubscriptionFilter(PutSubscriptionFilterRequest)
 */
public class PutSubscriptionFilterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the log group to associate the subscription filter with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * A name for the subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered
     * stream of log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String filterPattern;

    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String destinationArn;

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * The name of the log group to associate the subscription filter with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The name of the log group to associate the subscription filter with.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The name of the log group to associate the subscription filter with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group to associate the subscription filter with.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The name of the log group to associate the subscription filter with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group to associate the subscription filter with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutSubscriptionFilterRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * A name for the subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return A name for the subscription filter.
     */
    public String getFilterName() {
        return filterName;
    }
    
    /**
     * A name for the subscription filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName A name for the subscription filter.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    /**
     * A name for the subscription filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName A name for the subscription filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutSubscriptionFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered
     * stream of log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return A valid CloudWatch Logs filter pattern for subscribing to a filtered
     *         stream of log events.
     */
    public String getFilterPattern() {
        return filterPattern;
    }
    
    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered
     * stream of log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A valid CloudWatch Logs filter pattern for subscribing to a filtered
     *         stream of log events.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }
    
    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered
     * stream of log events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A valid CloudWatch Logs filter pattern for subscribing to a filtered
     *         stream of log events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutSubscriptionFilterRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The ARN of an Amazon Kinesis stream to deliver matching log events to.
     */
    public String getDestinationArn() {
        return destinationArn;
    }
    
    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn The ARN of an Amazon Kinesis stream to deliver matching log events to.
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }
    
    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn The ARN of an Amazon Kinesis stream to deliver matching log events to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutSubscriptionFilterRequest withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutSubscriptionFilterRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getDestinationArn() != null) sb.append("DestinationArn: " + getDestinationArn() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutSubscriptionFilterRequest == false) return false;
        PutSubscriptionFilterRequest other = (PutSubscriptionFilterRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null) return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        return true;
    }
    
    @Override
    public PutSubscriptionFilterRequest clone() {
        
            return (PutSubscriptionFilterRequest) super.clone();
    }

}
    