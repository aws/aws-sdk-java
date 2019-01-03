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
 * Request to delete a draft environment configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteEnvironmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEnvironmentConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application the environment is associated with.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the environment to delete the draft configuration from.
     * </p>
     */
    private String environmentName;

    /**
     * Default constructor for DeleteEnvironmentConfigurationRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public DeleteEnvironmentConfigurationRequest() {
    }

    /**
     * Constructs a new DeleteEnvironmentConfigurationRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application the environment is associated with.
     * @param environmentName
     *        The name of the environment to delete the draft configuration from.
     */
    public DeleteEnvironmentConfigurationRequest(String applicationName, String environmentName) {
        setApplicationName(applicationName);
        setEnvironmentName(environmentName);
    }

    /**
     * <p>
     * The name of the application the environment is associated with.
     * </p>
     * 
     * @param applicationName
     *        The name of the application the environment is associated with.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application the environment is associated with.
     * </p>
     * 
     * @return The name of the application the environment is associated with.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application the environment is associated with.
     * </p>
     * 
     * @param applicationName
     *        The name of the application the environment is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEnvironmentConfigurationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the environment to delete the draft configuration from.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to delete the draft configuration from.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to delete the draft configuration from.
     * </p>
     * 
     * @return The name of the environment to delete the draft configuration from.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment to delete the draft configuration from.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to delete the draft configuration from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEnvironmentConfigurationRequest withEnvironmentName(String environmentName) {
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

        if (obj instanceof DeleteEnvironmentConfigurationRequest == false)
            return false;
        DeleteEnvironmentConfigurationRequest other = (DeleteEnvironmentConfigurationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEnvironmentConfigurationRequest clone() {
        return (DeleteEnvironmentConfigurationRequest) super.clone();
    }

}
