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
 * Request to terminate an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/TerminateEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Indicates whether the associated AWS resources should shut down when the environment is terminated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling group
     * and LoadBalancer, are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     * resources continue to operate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS Elastic
     * Beanstalk User Guide. </a>
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean terminateResources;
    /**
     * <p>
     * Terminates the target environment even if another environment in the same group is dependent on it.
     * </p>
     */
    private Boolean forceTerminate;

    /**
     * <p>
     * The ID of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to terminate.</p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The ID of the environment to terminate.</p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to terminate.</p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateEnvironmentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to terminate.</p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The name of the environment to terminate.</p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment to terminate.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to terminate.</p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateEnvironmentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the associated AWS resources should shut down when the environment is terminated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling group
     * and LoadBalancer, are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     * resources continue to operate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS Elastic
     * Beanstalk User Guide. </a>
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param terminateResources
     *        Indicates whether the associated AWS resources should shut down when the environment is terminated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling
     *        group and LoadBalancer, are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     *        resources continue to operate.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS
     *        Elastic Beanstalk User Guide. </a>
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setTerminateResources(Boolean terminateResources) {
        this.terminateResources = terminateResources;
    }

    /**
     * <p>
     * Indicates whether the associated AWS resources should shut down when the environment is terminated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling group
     * and LoadBalancer, are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     * resources continue to operate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS Elastic
     * Beanstalk User Guide. </a>
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Indicates whether the associated AWS resources should shut down when the environment is terminated:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto
     *         Scaling group and LoadBalancer, are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the
     *         AWS resources continue to operate.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS
     *         Elastic Beanstalk User Guide. </a>
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getTerminateResources() {
        return this.terminateResources;
    }

    /**
     * <p>
     * Indicates whether the associated AWS resources should shut down when the environment is terminated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling group
     * and LoadBalancer, are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     * resources continue to operate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS Elastic
     * Beanstalk User Guide. </a>
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param terminateResources
     *        Indicates whether the associated AWS resources should shut down when the environment is terminated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling
     *        group and LoadBalancer, are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     *        resources continue to operate.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS
     *        Elastic Beanstalk User Guide. </a>
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateEnvironmentRequest withTerminateResources(Boolean terminateResources) {
        setTerminateResources(terminateResources);
        return this;
    }

    /**
     * <p>
     * Indicates whether the associated AWS resources should shut down when the environment is terminated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto Scaling group
     * and LoadBalancer, are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS
     * resources continue to operate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS Elastic
     * Beanstalk User Guide. </a>
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Indicates whether the associated AWS resources should shut down when the environment is terminated:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: The specified environment as well as the associated AWS resources, such as Auto
     *         Scaling group and LoadBalancer, are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: AWS Elastic Beanstalk resource management is removed from the environment, but the
     *         AWS resources continue to operate.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see the <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/ug/"> AWS
     *         Elastic Beanstalk User Guide. </a>
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isTerminateResources() {
        return this.terminateResources;
    }

    /**
     * <p>
     * Terminates the target environment even if another environment in the same group is dependent on it.
     * </p>
     * 
     * @param forceTerminate
     *        Terminates the target environment even if another environment in the same group is dependent on it.
     */

    public void setForceTerminate(Boolean forceTerminate) {
        this.forceTerminate = forceTerminate;
    }

    /**
     * <p>
     * Terminates the target environment even if another environment in the same group is dependent on it.
     * </p>
     * 
     * @return Terminates the target environment even if another environment in the same group is dependent on it.
     */

    public Boolean getForceTerminate() {
        return this.forceTerminate;
    }

    /**
     * <p>
     * Terminates the target environment even if another environment in the same group is dependent on it.
     * </p>
     * 
     * @param forceTerminate
     *        Terminates the target environment even if another environment in the same group is dependent on it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateEnvironmentRequest withForceTerminate(Boolean forceTerminate) {
        setForceTerminate(forceTerminate);
        return this;
    }

    /**
     * <p>
     * Terminates the target environment even if another environment in the same group is dependent on it.
     * </p>
     * 
     * @return Terminates the target environment even if another environment in the same group is dependent on it.
     */

    public Boolean isForceTerminate() {
        return this.forceTerminate;
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getTerminateResources() != null)
            sb.append("TerminateResources: ").append(getTerminateResources()).append(",");
        if (getForceTerminate() != null)
            sb.append("ForceTerminate: ").append(getForceTerminate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateEnvironmentRequest == false)
            return false;
        TerminateEnvironmentRequest other = (TerminateEnvironmentRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getTerminateResources() == null ^ this.getTerminateResources() == null)
            return false;
        if (other.getTerminateResources() != null && other.getTerminateResources().equals(this.getTerminateResources()) == false)
            return false;
        if (other.getForceTerminate() == null ^ this.getForceTerminate() == null)
            return false;
        if (other.getForceTerminate() != null && other.getForceTerminate().equals(this.getForceTerminate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getTerminateResources() == null) ? 0 : getTerminateResources().hashCode());
        hashCode = prime * hashCode + ((getForceTerminate() == null) ? 0 : getForceTerminate().hashCode());
        return hashCode;
    }

    @Override
    public TerminateEnvironmentRequest clone() {
        return (TerminateEnvironmentRequest) super.clone();
    }

}
