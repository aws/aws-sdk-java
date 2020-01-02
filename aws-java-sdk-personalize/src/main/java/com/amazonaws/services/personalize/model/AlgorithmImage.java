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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an algorithm image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/AlgorithmImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     */
    private String dockerURI;

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * 
     * @param name
     *        The name of the algorithm image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * 
     * @return The name of the algorithm image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * 
     * @param name
     *        The name of the algorithm image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmImage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @param dockerURI
     *        The URI of the Docker container for the algorithm image.
     */

    public void setDockerURI(String dockerURI) {
        this.dockerURI = dockerURI;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @return The URI of the Docker container for the algorithm image.
     */

    public String getDockerURI() {
        return this.dockerURI;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @param dockerURI
     *        The URI of the Docker container for the algorithm image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmImage withDockerURI(String dockerURI) {
        setDockerURI(dockerURI);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDockerURI() != null)
            sb.append("DockerURI: ").append(getDockerURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmImage == false)
            return false;
        AlgorithmImage other = (AlgorithmImage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDockerURI() == null ^ this.getDockerURI() == null)
            return false;
        if (other.getDockerURI() != null && other.getDockerURI().equals(this.getDockerURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDockerURI() == null) ? 0 : getDockerURI().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmImage clone() {
        try {
            return (AlgorithmImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.AlgorithmImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
