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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified node type doesn't match the expected node type for a node. You can specify the node type as branch,
 * sensor, actuator, or attribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidNodeException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The specified node type isn't valid.
     * </p>
     */
    private java.util.List<Node> invalidNodes;
    /**
     * <p>
     * The reason the node validation failed.
     * </p>
     */
    private String reason;

    /**
     * Constructs a new InvalidNodeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidNodeException(String message) {
        super(message);
    }

    /**
     * <p>
     * The specified node type isn't valid.
     * </p>
     * 
     * @return The specified node type isn't valid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidNodes")
    public java.util.List<Node> getInvalidNodes() {
        return invalidNodes;
    }

    /**
     * <p>
     * The specified node type isn't valid.
     * </p>
     * 
     * @param invalidNodes
     *        The specified node type isn't valid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidNodes")
    public void setInvalidNodes(java.util.Collection<Node> invalidNodes) {
        if (invalidNodes == null) {
            this.invalidNodes = null;
            return;
        }

        this.invalidNodes = new java.util.ArrayList<Node>(invalidNodes);
    }

    /**
     * <p>
     * The specified node type isn't valid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidNodes(java.util.Collection)} or {@link #withInvalidNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param invalidNodes
     *        The specified node type isn't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNodeException withInvalidNodes(Node... invalidNodes) {
        if (this.invalidNodes == null) {
            setInvalidNodes(new java.util.ArrayList<Node>(invalidNodes.length));
        }
        for (Node ele : invalidNodes) {
            this.invalidNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specified node type isn't valid.
     * </p>
     * 
     * @param invalidNodes
     *        The specified node type isn't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNodeException withInvalidNodes(java.util.Collection<Node> invalidNodes) {
        setInvalidNodes(invalidNodes);
        return this;
    }

    /**
     * <p>
     * The reason the node validation failed.
     * </p>
     * 
     * @param reason
     *        The reason the node validation failed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the node validation failed.
     * </p>
     * 
     * @return The reason the node validation failed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the node validation failed.
     * </p>
     * 
     * @param reason
     *        The reason the node validation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNodeException withReason(String reason) {
        setReason(reason);
        return this;
    }

}
