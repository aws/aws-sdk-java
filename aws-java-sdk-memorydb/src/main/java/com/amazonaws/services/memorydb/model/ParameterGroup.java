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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a CreateParameterGroup operation. A parameter group represents a combination of specific
 * values for the parameters that are passed to the engine software during startup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter group
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the parameter group family that this parameter group is compatible with.
     * </p>
     */
    private String family;
    /**
     * <p>
     * A description of the parameter group
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter group
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the parameter group
     * </p>
     * 
     * @param name
     *        The name of the parameter group
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter group
     * </p>
     * 
     * @return The name of the parameter group
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter group
     * </p>
     * 
     * @param name
     *        The name of the parameter group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group family that this parameter group is compatible with.
     * </p>
     * 
     * @param family
     *        The name of the parameter group family that this parameter group is compatible with.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of the parameter group family that this parameter group is compatible with.
     * </p>
     * 
     * @return The name of the parameter group family that this parameter group is compatible with.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The name of the parameter group family that this parameter group is compatible with.
     * </p>
     * 
     * @param family
     *        The name of the parameter group family that this parameter group is compatible with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroup withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * A description of the parameter group
     * </p>
     * 
     * @param description
     *        A description of the parameter group
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter group
     * </p>
     * 
     * @return A description of the parameter group
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter group
     * </p>
     * 
     * @param description
     *        A description of the parameter group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter group
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the parameter group
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter group
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the parameter group
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter group
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the parameter group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroup withARN(String aRN) {
        setARN(aRN);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterGroup == false)
            return false;
        ParameterGroup other = (ParameterGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public ParameterGroup clone() {
        try {
            return (ParameterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ParameterGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
