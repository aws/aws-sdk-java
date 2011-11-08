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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeConfigurationSettings(DescribeConfigurationSettingsRequest) DescribeConfigurationSettings operation}.
 * <p>
 * Returns a description of the settings for the specified configuration
 * set, that is, either a configuration template or the configuration set
 * associated with a running environment.
 * </p>
 * <p>
 * When describing the settings for the configuration set associated
 * with a running environment, it is possible to receive two sets of
 * setting descriptions. One is the deployed configuration set, and the
 * other is a draft configuration of an environment that is either in the
 * process of deployment or that failed to deploy.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * 
 * <ul>
 * <li> DeleteEnvironmentConfiguration </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeConfigurationSettings(DescribeConfigurationSettingsRequest)
 */
public class DescribeConfigurationSettingsRequest extends AmazonWebServiceRequest {

    /**
     * The application for the environment or configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template to describe. <p> Conditional:
     * You must specify either this parameter or an EnvironmentName, but not
     * both. If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * The name of the environment to describe. <p> Condition: You must
     * specify either this or a TemplateName, but not both. If you specify
     * both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * Default constructor for a new DescribeConfigurationSettingsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeConfigurationSettingsRequest() {}
    
    /**
     * Constructs a new DescribeConfigurationSettingsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The application for the environment or
     * configuration template.
     */
    public DescribeConfigurationSettingsRequest(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application for the environment or configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application for the environment or configuration template.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application for the environment or configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application for the environment or configuration template.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application for the environment or configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application for the environment or configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationSettingsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the configuration template to describe. <p> Conditional:
     * You must specify either this parameter or an EnvironmentName, but not
     * both. If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template to describe. <p> Conditional:
     *         You must specify either this parameter or an EnvironmentName, but not
     *         both. If you specify both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template to describe. <p> Conditional:
     * You must specify either this parameter or an EnvironmentName, but not
     * both. If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to describe. <p> Conditional:
     *         You must specify either this parameter or an EnvironmentName, but not
     *         both. If you specify both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template to describe. <p> Conditional:
     * You must specify either this parameter or an EnvironmentName, but not
     * both. If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to describe. <p> Conditional:
     *         You must specify either this parameter or an EnvironmentName, but not
     *         both. If you specify both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationSettingsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * The name of the environment to describe. <p> Condition: You must
     * specify either this or a TemplateName, but not both. If you specify
     * both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to describe. <p> Condition: You must
     *         specify either this or a TemplateName, but not both. If you specify
     *         both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to describe. <p> Condition: You must
     * specify either this or a TemplateName, but not both. If you specify
     * both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to describe. <p> Condition: You must
     *         specify either this or a TemplateName, but not both. If you specify
     *         both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to describe. <p> Condition: You must
     * specify either this or a TemplateName, but not both. If you specify
     * both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to describe. <p> Condition: You must
     *         specify either this or a TemplateName, but not both. If you specify
     *         both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not specify
     *         either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    