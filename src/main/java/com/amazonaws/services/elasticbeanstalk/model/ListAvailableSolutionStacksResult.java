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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * A list of available AWS Elastic Beanstalk solution stacks.
 * </p>
 */
public class ListAvailableSolutionStacksResult {

    /**
     * A list of available solution stacks.
     */
    private java.util.List<String> solutionStacks;

    /**
     * A list of available solution stacks.
     *
     * @return A list of available solution stacks.
     */
    public java.util.List<String> getSolutionStacks() {
        if (solutionStacks == null) {
            solutionStacks = new java.util.ArrayList<String>();
        }
        return solutionStacks;
    }
    
    /**
     * A list of available solution stacks.
     *
     * @param solutionStacks A list of available solution stacks.
     */
    public void setSolutionStacks(java.util.Collection<String> solutionStacks) {
        java.util.List<String> solutionStacksCopy = new java.util.ArrayList<String>();
        if (solutionStacks != null) {
            solutionStacksCopy.addAll(solutionStacks);
        }
        this.solutionStacks = solutionStacksCopy;
    }
    
    /**
     * A list of available solution stacks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param solutionStacks A list of available solution stacks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAvailableSolutionStacksResult withSolutionStacks(String... solutionStacks) {
        for (String value : solutionStacks) {
            getSolutionStacks().add(value);
        }
        return this;
    }
    
    /**
     * A list of available solution stacks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param solutionStacks A list of available solution stacks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAvailableSolutionStacksResult withSolutionStacks(java.util.Collection<String> solutionStacks) {
        java.util.List<String> solutionStacksCopy = new java.util.ArrayList<String>();
        if (solutionStacks != null) {
            solutionStacksCopy.addAll(solutionStacks);
        }
        this.solutionStacks = solutionStacksCopy;

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
        sb.append("SolutionStacks: " + solutionStacks + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    