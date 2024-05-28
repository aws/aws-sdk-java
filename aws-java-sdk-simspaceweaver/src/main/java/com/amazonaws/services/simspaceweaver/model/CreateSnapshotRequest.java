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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/CreateSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot file.
     * </p>
     * <p>
     * The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     * </p>
     */
    private S3Destination destination;
    /**
     * <p>
     * The name of the simulation.
     * </p>
     */
    private String simulation;

    /**
     * <p>
     * The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot file.
     * </p>
     * <p>
     * The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     * </p>
     * 
     * @param destination
     *        The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot
     *        file.</p>
     *        <p>
     *        The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     */

    public void setDestination(S3Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot file.
     * </p>
     * <p>
     * The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     * </p>
     * 
     * @return The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot
     *         file.</p>
     *         <p>
     *         The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     */

    public S3Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot file.
     * </p>
     * <p>
     * The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     * </p>
     * 
     * @param destination
     *        The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot
     *        file.</p>
     *        <p>
     *        The Amazon S3 bucket must be in the same Amazon Web Services Region as the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotRequest withDestination(S3Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation.
     */

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @return The name of the simulation.
     */

    public String getSimulation() {
        return this.simulation;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotRequest withSimulation(String simulation) {
        setSimulation(simulation);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getSimulation() != null)
            sb.append("Simulation: ").append(getSimulation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getSimulation() == null ^ this.getSimulation() == null)
            return false;
        if (other.getSimulation() != null && other.getSimulation().equals(this.getSimulation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotRequest clone() {
        return (CreateSnapshotRequest) super.clone();
    }

}
