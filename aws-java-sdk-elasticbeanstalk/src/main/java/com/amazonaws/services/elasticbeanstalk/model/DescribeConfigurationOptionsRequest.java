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
 * Result message containing a list of application version descriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application associated with the configuration template or environment. Only needed if you want to
     * describe the configuration options associated with either the configuration template or environment.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template whose configuration options you want to describe.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The name of the environment whose configuration options you want to describe.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The name of the solution stack whose configuration options you want to describe.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * If specified, restricts the descriptions to only the specified options.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSpecification> options;

    /**
     * <p>
     * The name of the application associated with the configuration template or environment. Only needed if you want to
     * describe the configuration options associated with either the configuration template or environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with the configuration template or environment. Only needed if you
     *        want to describe the configuration options associated with either the configuration template or
     *        environment.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template or environment. Only needed if you want to
     * describe the configuration options associated with either the configuration template or environment.
     * </p>
     * 
     * @return The name of the application associated with the configuration template or environment. Only needed if you
     *         want to describe the configuration options associated with either the configuration template or
     *         environment.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template or environment. Only needed if you want to
     * describe the configuration options associated with either the configuration template or environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with the configuration template or environment. Only needed if you
     *        want to describe the configuration options associated with either the configuration template or
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template whose configuration options you want to describe.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template whose configuration options you want to describe.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template whose configuration options you want to describe.
     * </p>
     * 
     * @return The name of the configuration template whose configuration options you want to describe.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template whose configuration options you want to describe.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template whose configuration options you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the environment whose configuration options you want to describe.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment whose configuration options you want to describe.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment whose configuration options you want to describe.
     * </p>
     * 
     * @return The name of the environment whose configuration options you want to describe.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment whose configuration options you want to describe.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment whose configuration options you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The name of the solution stack whose configuration options you want to describe.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack whose configuration options you want to describe.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack whose configuration options you want to describe.
     * </p>
     * 
     * @return The name of the solution stack whose configuration options you want to describe.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack whose configuration options you want to describe.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack whose configuration options you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the custom platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @return The ARN of the custom platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the custom platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * If specified, restricts the descriptions to only the specified options.
     * </p>
     * 
     * @return If specified, restricts the descriptions to only the specified options.
     */

    public java.util.List<OptionSpecification> getOptions() {
        if (options == null) {
            options = new com.amazonaws.internal.SdkInternalList<OptionSpecification>();
        }
        return options;
    }

    /**
     * <p>
     * If specified, restricts the descriptions to only the specified options.
     * </p>
     * 
     * @param options
     *        If specified, restricts the descriptions to only the specified options.
     */

    public void setOptions(java.util.Collection<OptionSpecification> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new com.amazonaws.internal.SdkInternalList<OptionSpecification>(options);
    }

    /**
     * <p>
     * If specified, restricts the descriptions to only the specified options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        If specified, restricts the descriptions to only the specified options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withOptions(OptionSpecification... options) {
        if (this.options == null) {
            setOptions(new com.amazonaws.internal.SdkInternalList<OptionSpecification>(options.length));
        }
        for (OptionSpecification ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, restricts the descriptions to only the specified options.
     * </p>
     * 
     * @param options
     *        If specified, restricts the descriptions to only the specified options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsRequest withOptions(java.util.Collection<OptionSpecification> options) {
        setOptions(options);
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
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationOptionsRequest == false)
            return false;
        DescribeConfigurationOptionsRequest other = (DescribeConfigurationOptionsRequest) obj;
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
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
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
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationOptionsRequest clone() {
        return (DescribeConfigurationOptionsRequest) super.clone();
    }

}
