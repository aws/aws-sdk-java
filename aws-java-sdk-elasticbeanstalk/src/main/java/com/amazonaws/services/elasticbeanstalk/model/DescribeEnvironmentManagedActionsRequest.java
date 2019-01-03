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
 * Request to list an environment's upcoming and in-progress managed actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentManagedActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the target environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @return The name of the target environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the target environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @return The environment ID of the target environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * 
     * @param status
     *        To show only actions with a particular status, specify a status.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * 
     * @return To show only actions with a particular status, specify a status.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * 
     * @param status
     *        To show only actions with a particular status, specify a status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public DescribeEnvironmentManagedActionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * 
     * @param status
     *        To show only actions with a particular status, specify a status.
     * @see ActionStatus
     */

    public void setStatus(ActionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * 
     * @param status
     *        To show only actions with a particular status, specify a status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public DescribeEnvironmentManagedActionsRequest withStatus(ActionStatus status) {
        this.status = status.toString();
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentManagedActionsRequest == false)
            return false;
        DescribeEnvironmentManagedActionsRequest other = (DescribeEnvironmentManagedActionsRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentManagedActionsRequest clone() {
        return (DescribeEnvironmentManagedActionsRequest) super.clone();
    }

}
