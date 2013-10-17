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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the settings for a specified configuration set.
 * </p>
 */
public class DescribeConfigurationOptionsResult implements Serializable {

    /**
     * The name of the solution stack these configuration options belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * A list of <a>ConfigurationOptionDescription</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription> options;

    /**
     * The name of the solution stack these configuration options belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the solution stack these configuration options belong to.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the solution stack these configuration options belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack these configuration options belong to.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the solution stack these configuration options belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack these configuration options belong to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConfigurationOptionsResult withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * A list of <a>ConfigurationOptionDescription</a>.
     *
     * @return A list of <a>ConfigurationOptionDescription</a>.
     */
    public java.util.List<ConfigurationOptionDescription> getOptions() {
        if (options == null) {
              options = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription>();
              options.setAutoConstruct(true);
        }
        return options;
    }
    
    /**
     * A list of <a>ConfigurationOptionDescription</a>.
     *
     * @param options A list of <a>ConfigurationOptionDescription</a>.
     */
    public void setOptions(java.util.Collection<ConfigurationOptionDescription> options) {
        if (options == null) {
            this.options = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription> optionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription>(options.size());
        optionsCopy.addAll(options);
        this.options = optionsCopy;
    }
    
    /**
     * A list of <a>ConfigurationOptionDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options A list of <a>ConfigurationOptionDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConfigurationOptionsResult withOptions(ConfigurationOptionDescription... options) {
        if (getOptions() == null) setOptions(new java.util.ArrayList<ConfigurationOptionDescription>(options.length));
        for (ConfigurationOptionDescription value : options) {
            getOptions().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ConfigurationOptionDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options A list of <a>ConfigurationOptionDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConfigurationOptionsResult withOptions(java.util.Collection<ConfigurationOptionDescription> options) {
        if (options == null) {
            this.options = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription> optionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionDescription>(options.size());
            optionsCopy.addAll(options);
            this.options = optionsCopy;
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
        if (getSolutionStackName() != null) sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getOptions() != null) sb.append("Options: " + getOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode()); 
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigurationOptionsResult == false) return false;
        DescribeConfigurationOptionsResult other = (DescribeConfigurationOptionsResult)obj;
        
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null) return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false) return false; 
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        return true;
    }
    
}
    