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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class ListTaskDefinitionsResult implements Serializable, Cloneable {

    /**
     * The list of task definition Amazon Resource Name (ARN) entries for the
     * <code>ListTaskDefintions</code> request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> taskDefinitionArns;

    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitions</code> request. When the results of a
     * <code>ListTaskDefinitions</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no
     * more results to return.
     */
    private String nextToken;

    /**
     * The list of task definition Amazon Resource Name (ARN) entries for the
     * <code>ListTaskDefintions</code> request.
     *
     * @return The list of task definition Amazon Resource Name (ARN) entries for the
     *         <code>ListTaskDefintions</code> request.
     */
    public java.util.List<String> getTaskDefinitionArns() {
        if (taskDefinitionArns == null) {
              taskDefinitionArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              taskDefinitionArns.setAutoConstruct(true);
        }
        return taskDefinitionArns;
    }
    
    /**
     * The list of task definition Amazon Resource Name (ARN) entries for the
     * <code>ListTaskDefintions</code> request.
     *
     * @param taskDefinitionArns The list of task definition Amazon Resource Name (ARN) entries for the
     *         <code>ListTaskDefintions</code> request.
     */
    public void setTaskDefinitionArns(java.util.Collection<String> taskDefinitionArns) {
        if (taskDefinitionArns == null) {
            this.taskDefinitionArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> taskDefinitionArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(taskDefinitionArns.size());
        taskDefinitionArnsCopy.addAll(taskDefinitionArns);
        this.taskDefinitionArns = taskDefinitionArnsCopy;
    }
    
    /**
     * The list of task definition Amazon Resource Name (ARN) entries for the
     * <code>ListTaskDefintions</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinitionArns The list of task definition Amazon Resource Name (ARN) entries for the
     *         <code>ListTaskDefintions</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsResult withTaskDefinitionArns(String... taskDefinitionArns) {
        if (getTaskDefinitionArns() == null) setTaskDefinitionArns(new java.util.ArrayList<String>(taskDefinitionArns.length));
        for (String value : taskDefinitionArns) {
            getTaskDefinitionArns().add(value);
        }
        return this;
    }
    
    /**
     * The list of task definition Amazon Resource Name (ARN) entries for the
     * <code>ListTaskDefintions</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinitionArns The list of task definition Amazon Resource Name (ARN) entries for the
     *         <code>ListTaskDefintions</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsResult withTaskDefinitionArns(java.util.Collection<String> taskDefinitionArns) {
        if (taskDefinitionArns == null) {
            this.taskDefinitionArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> taskDefinitionArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(taskDefinitionArns.size());
            taskDefinitionArnsCopy.addAll(taskDefinitionArns);
            this.taskDefinitionArns = taskDefinitionArnsCopy;
        }

        return this;
    }

    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitions</code> request. When the results of a
     * <code>ListTaskDefinitions</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no
     * more results to return.
     *
     * @return The <code>nextToken</code> value to include in a future
     *         <code>ListTaskDefinitions</code> request. When the results of a
     *         <code>ListTaskDefinitions</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the next
     *         page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitions</code> request. When the results of a
     * <code>ListTaskDefinitions</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no
     * more results to return.
     *
     * @param nextToken The <code>nextToken</code> value to include in a future
     *         <code>ListTaskDefinitions</code> request. When the results of a
     *         <code>ListTaskDefinitions</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the next
     *         page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitions</code> request. When the results of a
     * <code>ListTaskDefinitions</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no
     * more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> value to include in a future
     *         <code>ListTaskDefinitions</code> request. When the results of a
     *         <code>ListTaskDefinitions</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the next
     *         page of results. This value is <code>null</code> when there are no
     *         more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsResult withNextToken(String nextToken) {
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
        if (getTaskDefinitionArns() != null) sb.append("TaskDefinitionArns: " + getTaskDefinitionArns() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskDefinitionArns() == null) ? 0 : getTaskDefinitionArns().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTaskDefinitionsResult == false) return false;
        ListTaskDefinitionsResult other = (ListTaskDefinitionsResult)obj;
        
        if (other.getTaskDefinitionArns() == null ^ this.getTaskDefinitionArns() == null) return false;
        if (other.getTaskDefinitionArns() != null && other.getTaskDefinitionArns().equals(this.getTaskDefinitionArns()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTaskDefinitionsResult clone() {
        try {
            return (ListTaskDefinitionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    