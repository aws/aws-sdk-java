/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Result message containing all of the configuration settings for a specified solution stack or configuration template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     * Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentName;

    /**
     * Default constructor for DescribeConfigurationSettingsRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public DescribeConfigurationSettingsRequest() {
    }

    /**
     * Constructs a new DescribeConfigurationSettingsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The application for the environment or configuration template.
     */
    public DescribeConfigurationSettingsRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * 
     * @param applicationName
     *        The application for the environment or configuration template.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * 
     * @return The application for the environment or configuration template.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * 
     * @param applicationName
     *        The application for the environment or configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSettingsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     * Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to describe.</p>
     *        <p>
     *        Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify
     *        both, AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not
     *        specify either, AWS Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     * Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The name of the configuration template to describe.</p>
     *         <p>
     *         Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify
     *         both, AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not
     *         specify either, AWS Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     * Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to describe.</p>
     *        <p>
     *        Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify
     *        both, AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not
     *        specify either, AWS Elastic Beanstalk returns a <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSettingsRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to describe.</p>
     *        <p>
     *        Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The name of the environment to describe.</p>
     *         <p>
     *         Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to describe.</p>
     *        <p>
     *        Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterCombination</code> error. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSettingsRequest == false)
            return false;
        DescribeConfigurationSettingsRequest other = (DescribeConfigurationSettingsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationSettingsRequest clone() {
        return (DescribeConfigurationSettingsRequest) super.clone();
    }

}
