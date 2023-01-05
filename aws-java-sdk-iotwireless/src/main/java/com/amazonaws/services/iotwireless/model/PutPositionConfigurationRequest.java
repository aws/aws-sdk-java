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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutPositionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPositionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource identifier used to update the position configuration.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * Resource type of the resource for which you want to update the position configuration.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The positioning solvers used to update the position configuration of the resource.
     * </p>
     */
    private PositionSolverConfigurations solvers;
    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * Resource identifier used to update the position configuration.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier used to update the position configuration.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier used to update the position configuration.
     * </p>
     * 
     * @return Resource identifier used to update the position configuration.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier used to update the position configuration.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier used to update the position configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPositionConfigurationRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which you want to update the position configuration.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which you want to update the position configuration.
     * @see PositionResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which you want to update the position configuration.
     * </p>
     * 
     * @return Resource type of the resource for which you want to update the position configuration.
     * @see PositionResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which you want to update the position configuration.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which you want to update the position configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public PutPositionConfigurationRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which you want to update the position configuration.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which you want to update the position configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public PutPositionConfigurationRequest withResourceType(PositionResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The positioning solvers used to update the position configuration of the resource.
     * </p>
     * 
     * @param solvers
     *        The positioning solvers used to update the position configuration of the resource.
     */

    public void setSolvers(PositionSolverConfigurations solvers) {
        this.solvers = solvers;
    }

    /**
     * <p>
     * The positioning solvers used to update the position configuration of the resource.
     * </p>
     * 
     * @return The positioning solvers used to update the position configuration of the resource.
     */

    public PositionSolverConfigurations getSolvers() {
        return this.solvers;
    }

    /**
     * <p>
     * The positioning solvers used to update the position configuration of the resource.
     * </p>
     * 
     * @param solvers
     *        The positioning solvers used to update the position configuration of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPositionConfigurationRequest withSolvers(PositionSolverConfigurations solvers) {
        setSolvers(solvers);
        return this;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destination
     *        The position data destination that describes the AWS IoT rule that processes the device's position data
     *        for use by AWS IoT Core for LoRaWAN.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @return The position data destination that describes the AWS IoT rule that processes the device's position data
     *         for use by AWS IoT Core for LoRaWAN.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destination
     *        The position data destination that describes the AWS IoT rule that processes the device's position data
     *        for use by AWS IoT Core for LoRaWAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPositionConfigurationRequest withDestination(String destination) {
        setDestination(destination);
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSolvers() != null)
            sb.append("Solvers: ").append(getSolvers()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPositionConfigurationRequest == false)
            return false;
        PutPositionConfigurationRequest other = (PutPositionConfigurationRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSolvers() == null ^ this.getSolvers() == null)
            return false;
        if (other.getSolvers() != null && other.getSolvers().equals(this.getSolvers()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSolvers() == null) ? 0 : getSolvers().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public PutPositionConfigurationRequest clone() {
        return (PutPositionConfigurationRequest) super.clone();
    }

}
