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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the output from a model packaging job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ModelPackagingOutputDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackagingOutputDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the AWS IoT Greengrass component in a model packaging job.
     * </p>
     */
    private GreengrassOutputDetails greengrass;

    /**
     * <p>
     * Information about the AWS IoT Greengrass component in a model packaging job.
     * </p>
     * 
     * @param greengrass
     *        Information about the AWS IoT Greengrass component in a model packaging job.
     */

    public void setGreengrass(GreengrassOutputDetails greengrass) {
        this.greengrass = greengrass;
    }

    /**
     * <p>
     * Information about the AWS IoT Greengrass component in a model packaging job.
     * </p>
     * 
     * @return Information about the AWS IoT Greengrass component in a model packaging job.
     */

    public GreengrassOutputDetails getGreengrass() {
        return this.greengrass;
    }

    /**
     * <p>
     * Information about the AWS IoT Greengrass component in a model packaging job.
     * </p>
     * 
     * @param greengrass
     *        Information about the AWS IoT Greengrass component in a model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingOutputDetails withGreengrass(GreengrassOutputDetails greengrass) {
        setGreengrass(greengrass);
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
        if (getGreengrass() != null)
            sb.append("Greengrass: ").append(getGreengrass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackagingOutputDetails == false)
            return false;
        ModelPackagingOutputDetails other = (ModelPackagingOutputDetails) obj;
        if (other.getGreengrass() == null ^ this.getGreengrass() == null)
            return false;
        if (other.getGreengrass() != null && other.getGreengrass().equals(this.getGreengrass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGreengrass() == null) ? 0 : getGreengrass().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackagingOutputDetails clone() {
        try {
            return (ModelPackagingOutputDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ModelPackagingOutputDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
