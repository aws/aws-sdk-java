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
package com.amazonaws.services.eks.model;

import javax.annotation.Generated;

/**
 * <p>
 * At least one of your specified cluster subnets is in an Availability Zone that does not support Amazon EKS. The
 * exception output specifies the supported Availability Zones for your account, from which you can choose subnets for
 * your cluster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedAvailabilityZoneException extends com.amazonaws.services.eks.model.AmazonEKSException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The Amazon EKS cluster associated with the exception.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The supported Availability Zones for your account. Choose subnets in these Availability Zones for your cluster.
     * </p>
     */
    private java.util.List<String> validZones;

    /**
     * Constructs a new UnsupportedAvailabilityZoneException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedAvailabilityZoneException(String message) {
        super(message);
    }

    /**
     * <p>
     * The Amazon EKS cluster associated with the exception.
     * </p>
     * 
     * @param clusterName
     *        The Amazon EKS cluster associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The Amazon EKS cluster associated with the exception.
     * </p>
     * 
     * @return The Amazon EKS cluster associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The Amazon EKS cluster associated with the exception.
     * </p>
     * 
     * @param clusterName
     *        The Amazon EKS cluster associated with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedAvailabilityZoneException withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The supported Availability Zones for your account. Choose subnets in these Availability Zones for your cluster.
     * </p>
     * 
     * @return The supported Availability Zones for your account. Choose subnets in these Availability Zones for your
     *         cluster.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("validZones")
    public java.util.List<String> getValidZones() {
        return validZones;
    }

    /**
     * <p>
     * The supported Availability Zones for your account. Choose subnets in these Availability Zones for your cluster.
     * </p>
     * 
     * @param validZones
     *        The supported Availability Zones for your account. Choose subnets in these Availability Zones for your
     *        cluster.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("validZones")
    public void setValidZones(java.util.Collection<String> validZones) {
        if (validZones == null) {
            this.validZones = null;
            return;
        }

        this.validZones = new java.util.ArrayList<String>(validZones);
    }

    /**
     * <p>
     * The supported Availability Zones for your account. Choose subnets in these Availability Zones for your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidZones(java.util.Collection)} or {@link #withValidZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validZones
     *        The supported Availability Zones for your account. Choose subnets in these Availability Zones for your
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedAvailabilityZoneException withValidZones(String... validZones) {
        if (this.validZones == null) {
            setValidZones(new java.util.ArrayList<String>(validZones.length));
        }
        for (String ele : validZones) {
            this.validZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported Availability Zones for your account. Choose subnets in these Availability Zones for your cluster.
     * </p>
     * 
     * @param validZones
     *        The supported Availability Zones for your account. Choose subnets in these Availability Zones for your
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedAvailabilityZoneException withValidZones(java.util.Collection<String> validZones) {
        setValidZones(validZones);
        return this;
    }

}
