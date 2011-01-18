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
 * Describes a LoadBalancer.
 * </p>
 */
public class LoadBalancer {

    /**
     * The name of the LoadBalancer.
     */
    private String name;

    /**
     * Default constructor for a new LoadBalancer object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LoadBalancer() {}
    
    /**
     * The name of the LoadBalancer.
     *
     * @return The name of the LoadBalancer.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the LoadBalancer.
     *
     * @param name The name of the LoadBalancer.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancer withName(String name) {
        this.name = name;
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
        sb.append("Name: " + name + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    