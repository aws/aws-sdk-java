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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details the state of Amazon Inspector for each resource type Amazon Inspector scans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     */
    private State ec2;
    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     */
    private State ecr;

    private State lambda;

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @param ec2
     *        An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     */

    public void setEc2(State ec2) {
        this.ec2 = ec2;
    }

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @return An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     */

    public State getEc2() {
        return this.ec2;
    }

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @param ec2
     *        An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceState withEc2(State ec2) {
        setEc2(ec2);
        return this;
    }

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @param ecr
     *        An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     */

    public void setEcr(State ecr) {
        this.ecr = ecr;
    }

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @return An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     */

    public State getEcr() {
        return this.ecr;
    }

    /**
     * <p>
     * An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @param ecr
     *        An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceState withEcr(State ecr) {
        setEcr(ecr);
        return this;
    }

    /**
     * @param lambda
     */

    public void setLambda(State lambda) {
        this.lambda = lambda;
    }

    /**
     * @return
     */

    public State getLambda() {
        return this.lambda;
    }

    /**
     * @param lambda
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceState withLambda(State lambda) {
        setLambda(lambda);
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
        if (getEc2() != null)
            sb.append("Ec2: ").append(getEc2()).append(",");
        if (getEcr() != null)
            sb.append("Ecr: ").append(getEcr()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceState == false)
            return false;
        ResourceState other = (ResourceState) obj;
        if (other.getEc2() == null ^ this.getEc2() == null)
            return false;
        if (other.getEc2() != null && other.getEc2().equals(this.getEc2()) == false)
            return false;
        if (other.getEcr() == null ^ this.getEcr() == null)
            return false;
        if (other.getEcr() != null && other.getEcr().equals(this.getEcr()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2() == null) ? 0 : getEc2().hashCode());
        hashCode = prime * hashCode + ((getEcr() == null) ? 0 : getEcr().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public ResourceState clone() {
        try {
            return (ResourceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
