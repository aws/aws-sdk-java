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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code> and
     * <code>taskSets</code> parameters will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     */
    private Service service;

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code> and
     * <code>taskSets</code> parameters will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     * 
     * @param service
     *        The full description of your service following the create call.</p>
     *        <p>
     *        If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code>
     *        and <code>taskSets</code> parameters will not be returned.
     *        </p>
     *        <p>
     *        If the service is using the <code>CODE_DEPLOY</code> deployment controller, the
     *        <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be
     *        returned, however the <code>deployments</code> parameter will be an empty list.
     */

    public void setService(Service service) {
        this.service = service;
    }

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code> and
     * <code>taskSets</code> parameters will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     * 
     * @return The full description of your service following the create call.</p>
     *         <p>
     *         If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code>
     *         and <code>taskSets</code> parameters will not be returned.
     *         </p>
     *         <p>
     *         If the service is using the <code>CODE_DEPLOY</code> deployment controller, the
     *         <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be
     *         returned, however the <code>deployments</code> parameter will be an empty list.
     */

    public Service getService() {
        return this.service;
    }

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code> and
     * <code>taskSets</code> parameters will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     * 
     * @param service
     *        The full description of your service following the create call.</p>
     *        <p>
     *        If a service is using the <code>ECS</code> deployment controller, the <code>deploymentController</code>
     *        and <code>taskSets</code> parameters will not be returned.
     *        </p>
     *        <p>
     *        If the service is using the <code>CODE_DEPLOY</code> deployment controller, the
     *        <code>deploymentController</code>, <code>taskSets</code> and <code>deployments</code> parameters will be
     *        returned, however the <code>deployments</code> parameter will be an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceResult withService(Service service) {
        setService(service);
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
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceResult == false)
            return false;
        CreateServiceResult other = (CreateServiceResult) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceResult clone() {
        try {
            return (CreateServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
