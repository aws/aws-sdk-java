/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * These errors are usually caused by a client action. Actions can include using an action or resource on behalf of an
 * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM principal</a> that
 * doesn't have permissions to use the action or resource or specifying an identifier that is not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientException extends com.amazonaws.services.eks.model.AmazonEKSException {
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
     * <p>
     * The Amazon EKS add-on name associated with the exception.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The Amazon EKS subscription ID with the exception.
     * </p>
     */
    private String subscriptionId;

    /**
     * Constructs a new ClientException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ClientException(String message) {
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

    public ClientException withClusterName(String clusterName) {
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

    public ClientException withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS add-on name associated with the exception.
     * </p>
     * 
     * @param addonName
     *        The Amazon EKS add-on name associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("addonName")
    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The Amazon EKS add-on name associated with the exception.
     * </p>
     * 
     * @return The Amazon EKS add-on name associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("addonName")
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The Amazon EKS add-on name associated with the exception.
     * </p>
     * 
     * @param addonName
     *        The Amazon EKS add-on name associated with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientException withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS subscription ID with the exception.
     * </p>
     * 
     * @param subscriptionId
     *        The Amazon EKS subscription ID with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The Amazon EKS subscription ID with the exception.
     * </p>
     * 
     * @return The Amazon EKS subscription ID with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The Amazon EKS subscription ID with the exception.
     * </p>
     * 
     * @param subscriptionId
     *        The Amazon EKS subscription ID with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientException withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

}
