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
 * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ECSService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     */
    private String clusterName;

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     * 
     * @param serviceName
     *        The name of the target Amazon ECS service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     * 
     * @return The name of the target Amazon ECS service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     * 
     * @param serviceName
     *        The name of the target Amazon ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSService withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the Amazon ECS service is associated with.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     * 
     * @return The name of the cluster that the Amazon ECS service is associated with.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the Amazon ECS service is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSService withClusterName(String clusterName) {
        setClusterName(clusterName);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSService == false)
            return false;
        ECSService other = (ECSService) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        return hashCode;
    }

    @Override
    public ECSService clone() {
        try {
            return (ECSService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ECSServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
