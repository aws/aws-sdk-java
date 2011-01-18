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
 * Result message containing a list of environment descriptions.
 * </p>
 */
public class DescribeEnvironmentsResult {

    /**
     * Returns an <a>EnvironmentDescription</a> list.
     */
    private java.util.List<EnvironmentDescription> environments;

    /**
     * Returns an <a>EnvironmentDescription</a> list.
     *
     * @return Returns an <a>EnvironmentDescription</a> list.
     */
    public java.util.List<EnvironmentDescription> getEnvironments() {
        if (environments == null) {
            environments = new java.util.ArrayList<EnvironmentDescription>();
        }
        return environments;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     */
    public void setEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        java.util.List<EnvironmentDescription> environmentsCopy = new java.util.ArrayList<EnvironmentDescription>();
        if (environments != null) {
            environmentsCopy.addAll(environments);
        }
        this.environments = environmentsCopy;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsResult withEnvironments(EnvironmentDescription... environments) {
        for (EnvironmentDescription value : environments) {
            getEnvironments().add(value);
        }
        return this;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsResult withEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        java.util.List<EnvironmentDescription> environmentsCopy = new java.util.ArrayList<EnvironmentDescription>();
        if (environments != null) {
            environmentsCopy.addAll(environments);
        }
        this.environments = environmentsCopy;

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
        sb.append("Environments: " + environments + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    