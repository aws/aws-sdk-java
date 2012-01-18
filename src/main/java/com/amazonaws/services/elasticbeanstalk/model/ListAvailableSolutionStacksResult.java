/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     */
    private java.util.List<SolutionStackDescription> solutionStackDetails;

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
        if (solutionStacks == null) {
            this.solutionStacks = null;
            return;
        }

        java.util.List<String> solutionStacksCopy = new java.util.ArrayList<String>(solutionStacks.size());
        solutionStacksCopy.addAll(solutionStacks);
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
        if (getSolutionStacks() == null) setSolutionStacks(new java.util.ArrayList<String>(solutionStacks.length));
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
        if (solutionStacks == null) {
            this.solutionStacks = null;
        } else {
            java.util.List<String> solutionStacksCopy = new java.util.ArrayList<String>(solutionStacks.size());
            solutionStacksCopy.addAll(solutionStacks);
            this.solutionStacks = solutionStacksCopy;
        }

        return this;
    }
    
    /**
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     *
     * @return A list of available solution stacks and their
     *         <a>SolutionStackDescription</a>.
     */
    public java.util.List<SolutionStackDescription> getSolutionStackDetails() {
        
        if (solutionStackDetails == null) {
            solutionStackDetails = new java.util.ArrayList<SolutionStackDescription>();
        }
        return solutionStackDetails;
    }
    
    /**
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     *
     * @param solutionStackDetails A list of available solution stacks and their
     *         <a>SolutionStackDescription</a>.
     */
    public void setSolutionStackDetails(java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        if (solutionStackDetails == null) {
            this.solutionStackDetails = null;
            return;
        }

        java.util.List<SolutionStackDescription> solutionStackDetailsCopy = new java.util.ArrayList<SolutionStackDescription>(solutionStackDetails.size());
        solutionStackDetailsCopy.addAll(solutionStackDetails);
        this.solutionStackDetails = solutionStackDetailsCopy;
    }
    
    /**
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param solutionStackDetails A list of available solution stacks and their
     *         <a>SolutionStackDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAvailableSolutionStacksResult withSolutionStackDetails(SolutionStackDescription... solutionStackDetails) {
        if (getSolutionStackDetails() == null) setSolutionStackDetails(new java.util.ArrayList<SolutionStackDescription>(solutionStackDetails.length));
        for (SolutionStackDescription value : solutionStackDetails) {
            getSolutionStackDetails().add(value);
        }
        return this;
    }
    
    /**
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param solutionStackDetails A list of available solution stacks and their
     *         <a>SolutionStackDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAvailableSolutionStacksResult withSolutionStackDetails(java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        if (solutionStackDetails == null) {
            this.solutionStackDetails = null;
        } else {
            java.util.List<SolutionStackDescription> solutionStackDetailsCopy = new java.util.ArrayList<SolutionStackDescription>(solutionStackDetails.size());
            solutionStackDetailsCopy.addAll(solutionStackDetails);
            this.solutionStackDetails = solutionStackDetailsCopy;
        }

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
        if (solutionStacks != null) sb.append("SolutionStacks: " + solutionStacks + ", ");
        if (solutionStackDetails != null) sb.append("SolutionStackDetails: " + solutionStackDetails + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSolutionStacks() == null) ? 0 : getSolutionStacks().hashCode()); 
        hashCode = prime * hashCode + ((getSolutionStackDetails() == null) ? 0 : getSolutionStackDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListAvailableSolutionStacksResult == false) return false;
        ListAvailableSolutionStacksResult other = (ListAvailableSolutionStacksResult)obj;
        
        if (other.getSolutionStacks() == null ^ this.getSolutionStacks() == null) return false;
        if (other.getSolutionStacks() != null && other.getSolutionStacks().equals(this.getSolutionStacks()) == false) return false; 
        if (other.getSolutionStackDetails() == null ^ this.getSolutionStackDetails() == null) return false;
        if (other.getSolutionStackDetails() != null && other.getSolutionStackDetails().equals(this.getSolutionStackDetails()) == false) return false; 
        return true;
    }
    
}
    