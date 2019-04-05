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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about minimum healthy instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/MinimumHealthyHosts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MinimumHealthyHosts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     * 
     * @param value
     *        The minimum healthy instance value.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     * 
     * @return The minimum healthy instance value.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     * 
     * @param value
     *        The minimum healthy instance value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinimumHealthyHosts withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param type
     *        The minimum healthy instance type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The minimum number of healthy instance as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in
     *        the deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a
     *        time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the
     *        deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The
     *        deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment
     *        fails.
     *        </p>
     *        <note>
     *        <p>
     *        In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum
     *        healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     *        at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In
     *        addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one
     *        are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken
     *        offline for a new deployment, it also means that if the deployment to the last instance fails, the overall
     *        deployment is still successful.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy
     *        Instance Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * @see MinimumHealthyHostsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The minimum healthy instance type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         HOST_COUNT: The minimum number of healthy instance as an absolute value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in
     *         the deployment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a
     *         time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the
     *         deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The
     *         deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment
     *         fails.
     *         </p>
     *         <note>
     *         <p>
     *         In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum
     *         healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     *         at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In
     *         addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one
     *         are kept in a healthy state during the deployment. Although this allows one instance at a time to be
     *         taken offline for a new deployment, it also means that if the deployment to the last instance fails, the
     *         overall deployment is still successful.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy
     *         Instance Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * @see MinimumHealthyHostsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param type
     *        The minimum healthy instance type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The minimum number of healthy instance as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in
     *        the deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a
     *        time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the
     *        deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The
     *        deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment
     *        fails.
     *        </p>
     *        <note>
     *        <p>
     *        In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum
     *        healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     *        at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In
     *        addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one
     *        are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken
     *        offline for a new deployment, it also means that if the deployment to the last instance fails, the overall
     *        deployment is still successful.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy
     *        Instance Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumHealthyHostsType
     */

    public MinimumHealthyHosts withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param type
     *        The minimum healthy instance type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The minimum number of healthy instance as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in
     *        the deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a
     *        time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the
     *        deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The
     *        deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment
     *        fails.
     *        </p>
     *        <note>
     *        <p>
     *        In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum
     *        healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     *        at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In
     *        addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one
     *        are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken
     *        offline for a new deployment, it also means that if the deployment to the last instance fails, the overall
     *        deployment is still successful.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy
     *        Instance Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * @see MinimumHealthyHostsType
     */

    public void setType(MinimumHealthyHostsType type) {
        withType(type);
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time.
     * The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment
     * fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is
     * successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You
     * cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy
     * state during the deployment. Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance fails, the overall deployment is still
     * successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy Instance
     * Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param type
     *        The minimum healthy instance type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The minimum number of healthy instance as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in
     *        the deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a
     *        time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the
     *        deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The
     *        deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment
     *        fails.
     *        </p>
     *        <note>
     *        <p>
     *        In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum
     *        healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     *        at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In
     *        addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one
     *        are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken
     *        offline for a new deployment, it also means that if the deployment to the last instance fails, the overall
     *        deployment is still successful.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html">AWS CodeDeploy
     *        Instance Health</a> in the <i>AWS CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumHealthyHostsType
     */

    public MinimumHealthyHosts withType(MinimumHealthyHostsType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MinimumHealthyHosts == false)
            return false;
        MinimumHealthyHosts other = (MinimumHealthyHosts) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MinimumHealthyHosts clone() {
        try {
            return (MinimumHealthyHosts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.MinimumHealthyHostsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
