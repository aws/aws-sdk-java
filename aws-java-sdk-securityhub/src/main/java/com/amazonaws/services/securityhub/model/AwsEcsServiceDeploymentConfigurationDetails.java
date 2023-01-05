/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional deployment parameters for the service.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServiceDeploymentConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceDeploymentConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether a service deployment fails if a service cannot reach a steady state.
     * </p>
     */
    private AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails deploymentCircuitBreaker;
    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks in a
     * service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, and for
     * tasks that use the EC2 launch type, when any container instances are in the <code>DRAINING</code> state. Provided
     * as a percentage of the desired number of tasks. The default value is 200%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types, and
     * tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the maximum percent value is not used.
     * </p>
     */
    private Integer maximumPercent;
    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks in a
     * service that must remain in the <code>RUNNING</code> state during a deployment, and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks using the EC2 launch type. Expressed as a
     * percentage of the desired number of tasks. The default value is 100%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and
     * tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the minimum healthy percent value is not used.
     * </p>
     */
    private Integer minimumHealthyPercent;

    /**
     * <p>
     * Determines whether a service deployment fails if a service cannot reach a steady state.
     * </p>
     * 
     * @param deploymentCircuitBreaker
     *        Determines whether a service deployment fails if a service cannot reach a steady state.
     */

    public void setDeploymentCircuitBreaker(AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails deploymentCircuitBreaker) {
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
    }

    /**
     * <p>
     * Determines whether a service deployment fails if a service cannot reach a steady state.
     * </p>
     * 
     * @return Determines whether a service deployment fails if a service cannot reach a steady state.
     */

    public AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker;
    }

    /**
     * <p>
     * Determines whether a service deployment fails if a service cannot reach a steady state.
     * </p>
     * 
     * @param deploymentCircuitBreaker
     *        Determines whether a service deployment fails if a service cannot reach a steady state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDeploymentConfigurationDetails withDeploymentCircuitBreaker(
            AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails deploymentCircuitBreaker) {
        setDeploymentCircuitBreaker(deploymentCircuitBreaker);
        return this;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks in a
     * service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, and for
     * tasks that use the EC2 launch type, when any container instances are in the <code>DRAINING</code> state. Provided
     * as a percentage of the desired number of tasks. The default value is 200%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types, and
     * tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the maximum percent value is not used.
     * </p>
     * 
     * @param maximumPercent
     *        For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks
     *        in a service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a
     *        deployment, and for tasks that use the EC2 launch type, when any container instances are in the
     *        <code>DRAINING</code> state. Provided as a percentage of the desired number of tasks. The default value is
     *        200%.</p>
     *        <p>
     *        For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types, and tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in
     *        the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *        </p>
     *        <p>
     *        For the Fargate launch type, the maximum percent value is not used.
     */

    public void setMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks in a
     * service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, and for
     * tasks that use the EC2 launch type, when any container instances are in the <code>DRAINING</code> state. Provided
     * as a percentage of the desired number of tasks. The default value is 200%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types, and
     * tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the maximum percent value is not used.
     * </p>
     * 
     * @return For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of
     *         tasks in a service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a
     *         deployment, and for tasks that use the EC2 launch type, when any container instances are in the
     *         <code>DRAINING</code> state. Provided as a percentage of the desired number of tasks. The default value
     *         is 200%.</p>
     *         <p>
     *         For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *         types, and tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in
     *         the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *         </p>
     *         <p>
     *         For the Fargate launch type, the maximum percent value is not used.
     */

    public Integer getMaximumPercent() {
        return this.maximumPercent;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks in a
     * service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, and for
     * tasks that use the EC2 launch type, when any container instances are in the <code>DRAINING</code> state. Provided
     * as a percentage of the desired number of tasks. The default value is 200%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types, and
     * tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the maximum percent value is not used.
     * </p>
     * 
     * @param maximumPercent
     *        For a service that uses the rolling update (<code>ECS</code>) deployment type, the maximum number of tasks
     *        in a service that are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a
     *        deployment, and for tasks that use the EC2 launch type, when any container instances are in the
     *        <code>DRAINING</code> state. Provided as a percentage of the desired number of tasks. The default value is
     *        200%.</p>
     *        <p>
     *        For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types, and tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in
     *        the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *        </p>
     *        <p>
     *        For the Fargate launch type, the maximum percent value is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDeploymentConfigurationDetails withMaximumPercent(Integer maximumPercent) {
        setMaximumPercent(maximumPercent);
        return this;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks in a
     * service that must remain in the <code>RUNNING</code> state during a deployment, and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks using the EC2 launch type. Expressed as a
     * percentage of the desired number of tasks. The default value is 100%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and
     * tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the minimum healthy percent value is not used.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks
     *        in a service that must remain in the <code>RUNNING</code> state during a deployment, and while any
     *        container instances are in the <code>DRAINING</code> state if the service contains tasks using the EC2
     *        launch type. Expressed as a percentage of the desired number of tasks. The default value is 100%.</p>
     *        <p>
     *        For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain
     *        in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *        </p>
     *        <p>
     *        For the Fargate launch type, the minimum healthy percent value is not used.
     */

    public void setMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks in a
     * service that must remain in the <code>RUNNING</code> state during a deployment, and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks using the EC2 launch type. Expressed as a
     * percentage of the desired number of tasks. The default value is 100%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and
     * tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the minimum healthy percent value is not used.
     * </p>
     * 
     * @return For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of
     *         tasks in a service that must remain in the <code>RUNNING</code> state during a deployment, and while any
     *         container instances are in the <code>DRAINING</code> state if the service contains tasks using the EC2
     *         launch type. Expressed as a percentage of the desired number of tasks. The default value is 100%.</p>
     *         <p>
     *         For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *         types and tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain
     *         in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *         </p>
     *         <p>
     *         For the Fargate launch type, the minimum healthy percent value is not used.
     */

    public Integer getMinimumHealthyPercent() {
        return this.minimumHealthyPercent;
    }

    /**
     * <p>
     * For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks in a
     * service that must remain in the <code>RUNNING</code> state during a deployment, and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks using the EC2 launch type. Expressed as a
     * percentage of the desired number of tasks. The default value is 100%.
     * </p>
     * <p>
     * For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment types and
     * tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     * </p>
     * <p>
     * For the Fargate launch type, the minimum healthy percent value is not used.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        For a service that uses the rolling update (<code>ECS</code>) deployment type, the minimum number of tasks
     *        in a service that must remain in the <code>RUNNING</code> state during a deployment, and while any
     *        container instances are in the <code>DRAINING</code> state if the service contains tasks using the EC2
     *        launch type. Expressed as a percentage of the desired number of tasks. The default value is 100%.</p>
     *        <p>
     *        For a service that uses the blue/green (<code>CODE_DEPLOY</code>) or <code>EXTERNAL</code> deployment
     *        types and tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain
     *        in the <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state.
     *        </p>
     *        <p>
     *        For the Fargate launch type, the minimum healthy percent value is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDeploymentConfigurationDetails withMinimumHealthyPercent(Integer minimumHealthyPercent) {
        setMinimumHealthyPercent(minimumHealthyPercent);
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
        if (getDeploymentCircuitBreaker() != null)
            sb.append("DeploymentCircuitBreaker: ").append(getDeploymentCircuitBreaker()).append(",");
        if (getMaximumPercent() != null)
            sb.append("MaximumPercent: ").append(getMaximumPercent()).append(",");
        if (getMinimumHealthyPercent() != null)
            sb.append("MinimumHealthyPercent: ").append(getMinimumHealthyPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsServiceDeploymentConfigurationDetails == false)
            return false;
        AwsEcsServiceDeploymentConfigurationDetails other = (AwsEcsServiceDeploymentConfigurationDetails) obj;
        if (other.getDeploymentCircuitBreaker() == null ^ this.getDeploymentCircuitBreaker() == null)
            return false;
        if (other.getDeploymentCircuitBreaker() != null && other.getDeploymentCircuitBreaker().equals(this.getDeploymentCircuitBreaker()) == false)
            return false;
        if (other.getMaximumPercent() == null ^ this.getMaximumPercent() == null)
            return false;
        if (other.getMaximumPercent() != null && other.getMaximumPercent().equals(this.getMaximumPercent()) == false)
            return false;
        if (other.getMinimumHealthyPercent() == null ^ this.getMinimumHealthyPercent() == null)
            return false;
        if (other.getMinimumHealthyPercent() != null && other.getMinimumHealthyPercent().equals(this.getMinimumHealthyPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentCircuitBreaker() == null) ? 0 : getDeploymentCircuitBreaker().hashCode());
        hashCode = prime * hashCode + ((getMaximumPercent() == null) ? 0 : getMaximumPercent().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyPercent() == null) ? 0 : getMinimumHealthyPercent().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServiceDeploymentConfigurationDetails clone() {
        try {
            return (AwsEcsServiceDeploymentConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServiceDeploymentConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
