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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a Neptune ML configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/MlConfigDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MlConfigDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN for the configuration.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The configuration name.
     * </p>
     * 
     * @param name
     *        The configuration name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The configuration name.
     * </p>
     * 
     * @return The configuration name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The configuration name.
     * </p>
     * 
     * @param name
     *        The configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MlConfigDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN for the configuration.
     * </p>
     * 
     * @param arn
     *        The ARN for the configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the configuration.
     * </p>
     * 
     * @return The ARN for the configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the configuration.
     * </p>
     * 
     * @param arn
     *        The ARN for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MlConfigDefinition withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MlConfigDefinition == false)
            return false;
        MlConfigDefinition other = (MlConfigDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public MlConfigDefinition clone() {
        try {
            return (MlConfigDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.MlConfigDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
