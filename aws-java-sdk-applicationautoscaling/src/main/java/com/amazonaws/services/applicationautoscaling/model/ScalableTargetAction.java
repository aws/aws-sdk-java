/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the minimum and maximum capacity for a scheduled action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/ScalableTargetAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalableTargetAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * <p>
     * For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet,
     * ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the minimum value
     * allowed is 1.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum capacity.
     * </p>
     * <p>
     * Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service
     * has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you
     * can request an increase. For more information, consult the documentation for that service. For information about
     * the default quotas for each service, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     * Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private Integer maxCapacity;

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * <p>
     * For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet,
     * ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the minimum value
     * allowed is 1.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity.</p>
     *        <p>
     *        For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot
     *        Fleet, ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the
     *        minimum value allowed is 1.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * <p>
     * For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet,
     * ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the minimum value
     * allowed is 1.
     * </p>
     * 
     * @return The minimum capacity.</p>
     *         <p>
     *         For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot
     *         Fleet, ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the
     *         minimum value allowed is 1.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * <p>
     * For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet,
     * ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the minimum value
     * allowed is 1.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity.</p>
     *        <p>
     *        For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot
     *        Fleet, ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the
     *        minimum value allowed is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalableTargetAction withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * <p>
     * Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service
     * has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you
     * can request an increase. For more information, consult the documentation for that service. For information about
     * the default quotas for each service, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     * Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity.</p>
     *        <p>
     *        Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each
     *        service has its own default quotas for the maximum capacity of the resource. If you want to specify a
     *        higher limit, you can request an increase. For more information, consult the documentation for that
     *        service. For information about the default quotas for each service, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     *        Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * <p>
     * Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service
     * has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you
     * can request an increase. For more information, consult the documentation for that service. For information about
     * the default quotas for each service, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     * Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The maximum capacity.</p>
     *         <p>
     *         Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each
     *         service has its own default quotas for the maximum capacity of the resource. If you want to specify a
     *         higher limit, you can request an increase. For more information, consult the documentation for that
     *         service. For information about the default quotas for each service, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     *         Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * <p>
     * Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service
     * has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you
     * can request an increase. For more information, consult the documentation for that service. For information about
     * the default quotas for each service, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     * Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity.</p>
     *        <p>
     *        Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each
     *        service has its own default quotas for the maximum capacity of the resource. If you want to specify a
     *        higher limit, you can request an increase. For more information, consult the documentation for that
     *        service. For information about the default quotas for each service, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-service-information.html">Service Endpoints and
     *        Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalableTargetAction withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalableTargetAction == false)
            return false;
        ScalableTargetAction other = (ScalableTargetAction) obj;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ScalableTargetAction clone() {
        try {
            return (ScalableTargetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.ScalableTargetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
