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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A direct source or destination neighbor to an AWS media resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MediaResourceNeighbor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaResourceNeighbor implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of a resource used in AWS media workflows. */
    private String arn;
    /** The logical name of an AWS media resource. */
    private String name;

    /**
     * The ARN of a resource used in AWS media workflows.
     * 
     * @param arn
     *        The ARN of a resource used in AWS media workflows.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of a resource used in AWS media workflows.
     * 
     * @return The ARN of a resource used in AWS media workflows.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of a resource used in AWS media workflows.
     * 
     * @param arn
     *        The ARN of a resource used in AWS media workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResourceNeighbor withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @param name
     *        The logical name of an AWS media resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @return The logical name of an AWS media resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @param name
     *        The logical name of an AWS media resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResourceNeighbor withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaResourceNeighbor == false)
            return false;
        MediaResourceNeighbor other = (MediaResourceNeighbor) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public MediaResourceNeighbor clone() {
        try {
            return (MediaResourceNeighbor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MediaResourceNeighborMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
