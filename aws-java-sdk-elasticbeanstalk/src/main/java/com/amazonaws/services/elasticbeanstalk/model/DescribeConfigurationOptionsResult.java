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

/**
 * <p>
 * Describes the settings for a specified configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the solution stack these configuration options belong to.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The ARN of the platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * A list of <a>ConfigurationOptionDescription</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionDescription> options;

    /**
     * <p>
     * The name of the solution stack these configuration options belong to.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack these configuration options belong to.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack these configuration options belong to.
     * </p>
     * 
     * @return The name of the solution stack these configuration options belong to.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack these configuration options belong to.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack these configuration options belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsResult withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @return The ARN of the platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsResult withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * A list of <a>ConfigurationOptionDescription</a>.
     * </p>
     * 
     * @return A list of <a>ConfigurationOptionDescription</a>.
     */

    public java.util.List<ConfigurationOptionDescription> getOptions() {
        if (options == null) {
            options = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionDescription>();
        }
        return options;
    }

    /**
     * <p>
     * A list of <a>ConfigurationOptionDescription</a>.
     * </p>
     * 
     * @param options
     *        A list of <a>ConfigurationOptionDescription</a>.
     */

    public void setOptions(java.util.Collection<ConfigurationOptionDescription> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionDescription>(options);
    }

    /**
     * <p>
     * A list of <a>ConfigurationOptionDescription</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        A list of <a>ConfigurationOptionDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsResult withOptions(ConfigurationOptionDescription... options) {
        if (this.options == null) {
            setOptions(new com.amazonaws.internal.SdkInternalList<ConfigurationOptionDescription>(options.length));
        }
        for (ConfigurationOptionDescription ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ConfigurationOptionDescription</a>.
     * </p>
     * 
     * @param options
     *        A list of <a>ConfigurationOptionDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationOptionsResult withOptions(java.util.Collection<ConfigurationOptionDescription> options) {
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

        if (obj instanceof DescribeConfigurationOptionsResult == false)
            return false;
        DescribeConfigurationOptionsResult other = (DescribeConfigurationOptionsResult) obj;
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

        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationOptionsResult clone() {
        try {
            return (DescribeConfigurationOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
