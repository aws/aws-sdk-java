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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>TerminationPolicyTypes</code> data type.
 * </p>
 */
public class DescribeTerminationPolicyTypesResult implements Serializable {

    /**
     * Termination policies supported by Auto Scaling. They are:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicyTypes;

    /**
     * Termination policies supported by Auto Scaling. They are:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>
     *
     * @return Termination policies supported by Auto Scaling. They are:
     *         <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     *         <code>Default</code>
     */
    public java.util.List<String> getTerminationPolicyTypes() {
        if (terminationPolicyTypes == null) {
              terminationPolicyTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              terminationPolicyTypes.setAutoConstruct(true);
        }
        return terminationPolicyTypes;
    }
    
    /**
     * Termination policies supported by Auto Scaling. They are:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>
     *
     * @param terminationPolicyTypes Termination policies supported by Auto Scaling. They are:
     *         <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     *         <code>Default</code>
     */
    public void setTerminationPolicyTypes(java.util.Collection<String> terminationPolicyTypes) {
        if (terminationPolicyTypes == null) {
            this.terminationPolicyTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicyTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(terminationPolicyTypes.size());
        terminationPolicyTypesCopy.addAll(terminationPolicyTypes);
        this.terminationPolicyTypes = terminationPolicyTypesCopy;
    }
    
    /**
     * Termination policies supported by Auto Scaling. They are:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicyTypes Termination policies supported by Auto Scaling. They are:
     *         <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     *         <code>Default</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(String... terminationPolicyTypes) {
        if (getTerminationPolicyTypes() == null) setTerminationPolicyTypes(new java.util.ArrayList<String>(terminationPolicyTypes.length));
        for (String value : terminationPolicyTypes) {
            getTerminationPolicyTypes().add(value);
        }
        return this;
    }
    
    /**
     * Termination policies supported by Auto Scaling. They are:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicyTypes Termination policies supported by Auto Scaling. They are:
     *         <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     *         <code>Default</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(java.util.Collection<String> terminationPolicyTypes) {
        if (terminationPolicyTypes == null) {
            this.terminationPolicyTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicyTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(terminationPolicyTypes.size());
            terminationPolicyTypesCopy.addAll(terminationPolicyTypes);
            this.terminationPolicyTypes = terminationPolicyTypesCopy;
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
        if (getTerminationPolicyTypes() != null) sb.append("TerminationPolicyTypes: " + getTerminationPolicyTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTerminationPolicyTypes() == null) ? 0 : getTerminationPolicyTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTerminationPolicyTypesResult == false) return false;
        DescribeTerminationPolicyTypesResult other = (DescribeTerminationPolicyTypesResult)obj;
        
        if (other.getTerminationPolicyTypes() == null ^ this.getTerminationPolicyTypes() == null) return false;
        if (other.getTerminationPolicyTypes() != null && other.getTerminationPolicyTypes().equals(this.getTerminationPolicyTypes()) == false) return false; 
        return true;
    }
    
}
    