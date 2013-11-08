/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#listStackResources(ListStackResourcesRequest) ListStackResources operation}.
 * <p>
 * Returns descriptions of all resources of the specified stack.
 * </p>
 * <p>
 * For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#listStackResources(ListStackResourcesRequest)
 */
public class ListStackResourcesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable: <ul> <li>Running stacks: You can specify
     * either the stack's name or its unique stack ID.</li> <li>Deleted
     * stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     * There is no default value.
     */
    private String stackName;

    /**
     * String that identifies the start of the next list of stack resource
     * summaries, if there is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable: <ul> <li>Running stacks: You can specify
     * either the stack's name or its unique stack ID.</li> <li>Deleted
     * stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     * There is no default value.
     *
     * @return The name or the unique identifier associated with the stack, which are
     *         not always interchangeable: <ul> <li>Running stacks: You can specify
     *         either the stack's name or its unique stack ID.</li> <li>Deleted
     *         stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     *         There is no default value.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable: <ul> <li>Running stacks: You can specify
     * either the stack's name or its unique stack ID.</li> <li>Deleted
     * stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     * There is no default value.
     *
     * @param stackName The name or the unique identifier associated with the stack, which are
     *         not always interchangeable: <ul> <li>Running stacks: You can specify
     *         either the stack's name or its unique stack ID.</li> <li>Deleted
     *         stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     *         There is no default value.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable: <ul> <li>Running stacks: You can specify
     * either the stack's name or its unique stack ID.</li> <li>Deleted
     * stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     * There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or the unique identifier associated with the stack, which are
     *         not always interchangeable: <ul> <li>Running stacks: You can specify
     *         either the stack's name or its unique stack ID.</li> <li>Deleted
     *         stacks: You must specify the unique stack ID.</li> </ul> <p>Default:
     *         There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStackResourcesRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * String that identifies the start of the next list of stack resource
     * summaries, if there is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return String that identifies the start of the next list of stack resource
     *         summaries, if there is one. <p>Default: There is no default value.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stack resource
     * summaries, if there is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stack resource
     *         summaries, if there is one. <p>Default: There is no default value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stack resource
     * summaries, if there is one. <p>Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stack resource
     *         summaries, if there is one. <p>Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStackResourcesRequest withNextToken(String nextToken) {
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStackResourcesRequest == false) return false;
        ListStackResourcesRequest other = (ListStackResourcesRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    