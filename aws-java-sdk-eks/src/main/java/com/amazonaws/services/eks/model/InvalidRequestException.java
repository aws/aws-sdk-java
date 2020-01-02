/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request is invalid given the state of the cluster. Check the state of the cluster and the associated operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.eks.model.AmazonEKSException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The Amazon EKS cluster associated with the exception.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The Amazon EKS managed node group associated with the exception.
     * </p>
     */
    private String nodegroupName;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
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

    public InvalidRequestException withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS managed node group associated with the exception.
     * </p>
     * 
     * @param nodegroupName
     *        The Amazon EKS managed node group associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("nodegroupName")
    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The Amazon EKS managed node group associated with the exception.
     * </p>
     * 
     * @return The Amazon EKS managed node group associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("nodegroupName")
    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The Amazon EKS managed node group associated with the exception.
     * </p>
     * 
     * @param nodegroupName
     *        The Amazon EKS managed node group associated with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

}
