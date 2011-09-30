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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeConfigurationOptions(DescribeConfigurationOptionsRequest) DescribeConfigurationOptions operation}.
 * <p>
 * Describes the configuration options that are used in a particular
 * configuration template or environment, or that a specified solution
 * stack defines. The description includes the values the options, their
 * default values, and an indication of the required action on a running
 * environment if an option value is changed.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeConfigurationOptions(DescribeConfigurationOptionsRequest)
 */
public class DescribeConfigurationOptionsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application associated with the configuration template
     * or environment. Only needed if you want to describe the configuration
     * options associated with either the configuration template or
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template whose configuration options you
     * want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * The name of the environment whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The name of the solution stack whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * If specified, restricts the descriptions to only the specified
     * options.
     */
    private java.util.List<OptionSpecification> options;

    /**
     * Default constructor for a new DescribeConfigurationOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeConfigurationOptionsRequest() {}
    
    /**
     * The name of the application associated with the configuration template
     * or environment. Only needed if you want to describe the configuration
     * options associated with either the configuration template or
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with the configuration template
     *         or environment. Only needed if you want to describe the configuration
     *         options associated with either the configuration template or
     *         environment.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with the configuration template
     * or environment. Only needed if you want to describe the configuration
     * options associated with either the configuration template or
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with the configuration template
     *         or environment. Only needed if you want to describe the configuration
     *         options associated with either the configuration template or
     *         environment.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with the configuration template
     * or environment. Only needed if you want to describe the configuration
     * options associated with either the configuration template or
     * environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with the configuration template
     *         or environment. Only needed if you want to describe the configuration
     *         options associated with either the configuration template or
     *         environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the configuration template whose configuration options you
     * want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template whose configuration options you
     *         want to describe.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template whose configuration options you
     * want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template whose configuration options you
     *         want to describe.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template whose configuration options you
     * want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template whose configuration options you
     *         want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * The name of the environment whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment whose configuration options you want to
     *         describe.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment whose configuration options you want to
     *         describe.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment whose configuration options you want to
     * describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment whose configuration options you want to
     *         describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * The name of the solution stack whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the solution stack whose configuration options you want to
     *         describe.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the solution stack whose configuration options you want to
     * describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack whose configuration options you want to
     *         describe.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the solution stack whose configuration options you want to
     * describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack whose configuration options you want to
     *         describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }
    
    
    /**
     * If specified, restricts the descriptions to only the specified
     * options.
     *
     * @return If specified, restricts the descriptions to only the specified
     *         options.
     */
    public java.util.List<OptionSpecification> getOptions() {
        
        if (options == null) {
            options = new java.util.ArrayList<OptionSpecification>();
        }
        return options;
    }
    
    /**
     * If specified, restricts the descriptions to only the specified
     * options.
     *
     * @param options If specified, restricts the descriptions to only the specified
     *         options.
     */
    public void setOptions(java.util.Collection<OptionSpecification> options) {
        java.util.List<OptionSpecification> optionsCopy = new java.util.ArrayList<OptionSpecification>();
        if (options != null) {
            optionsCopy.addAll(options);
        }
        this.options = optionsCopy;
    }
    
    /**
     * If specified, restricts the descriptions to only the specified
     * options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options If specified, restricts the descriptions to only the specified
     *         options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withOptions(OptionSpecification... options) {
        if (getOptions() == null) setOptions(new java.util.ArrayList<OptionSpecification>());
        for (OptionSpecification value : options) {
            getOptions().add(value);
        }
        return this;
    }
    
    /**
     * If specified, restricts the descriptions to only the specified
     * options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options If specified, restricts the descriptions to only the specified
     *         options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationOptionsRequest withOptions(java.util.Collection<OptionSpecification> options) {
        java.util.List<OptionSpecification> optionsCopy = new java.util.ArrayList<OptionSpecification>();
        if (options != null) {
            optionsCopy.addAll(options);
        }
        this.options = optionsCopy;

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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("SolutionStackName: " + solutionStackName + ", ");
        sb.append("Options: " + options + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    