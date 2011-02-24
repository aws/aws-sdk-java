/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackEvents(DescribeStackEventsRequest) DescribeStackEvents operation}.
 * <p>
 * Returns all the stack related events for the AWS account. If
 * <code>StackName</code> is specified, returns events related to all the
 * stacks with the given name. If <code>StackName</code> is not
 * specified, returns all the events for the account. For more
 * information about a stack's event history, go to the <a
 * "http://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">
 * AWS CloudFormation User Guide </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>Events are returned, even if the stack never existed or
 * has been successfully deleted.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackEvents(DescribeStackEventsRequest)
 */
public class DescribeStackEventsRequest extends AmazonWebServiceRequest {

    /**
     * The name or the unique identifier associated with the stack.<br></br>
     * Default: There is no default value.
     */
    private String stackName;

    /**
     * String that identifies the start of the next list of events, if there
     * is one.<br></br> Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * The name or the unique identifier associated with the stack.<br></br>
     * Default: There is no default value.
     *
     * @return The name or the unique identifier associated with the stack.<br></br>
     *         Default: There is no default value.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.<br></br>
     * Default: There is no default value.
     *
     * @param stackName The name or the unique identifier associated with the stack.<br></br>
     *         Default: There is no default value.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.<br></br>
     * Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or the unique identifier associated with the stack.<br></br>
     *         Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStackEventsRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    
    
    /**
     * String that identifies the start of the next list of events, if there
     * is one.<br></br> Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return String that identifies the start of the next list of events, if there
     *         is one.<br></br> Default: There is no default value.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that identifies the start of the next list of events, if there
     * is one.<br></br> Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of events, if there
     *         is one.<br></br> Default: There is no default value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that identifies the start of the next list of events, if there
     * is one.<br></br> Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of events, if there
     *         is one.<br></br> Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStackEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("StackName: " + stackName + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    