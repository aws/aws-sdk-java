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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model of the API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Model" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Model implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the smithy model of the API.
     * </p>
     */
    private String smithy;

    /**
     * <p>
     * Indicates the smithy model of the API.
     * </p>
     * 
     * @param smithy
     *        Indicates the smithy model of the API.
     */

    public void setSmithy(String smithy) {
        this.smithy = smithy;
    }

    /**
     * <p>
     * Indicates the smithy model of the API.
     * </p>
     * 
     * @return Indicates the smithy model of the API.
     */

    public String getSmithy() {
        return this.smithy;
    }

    /**
     * <p>
     * Indicates the smithy model of the API.
     * </p>
     * 
     * @param smithy
     *        Indicates the smithy model of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withSmithy(String smithy) {
        setSmithy(smithy);
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
        if (getSmithy() != null)
            sb.append("Smithy: ").append(getSmithy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Model == false)
            return false;
        Model other = (Model) obj;
        if (other.getSmithy() == null ^ this.getSmithy() == null)
            return false;
        if (other.getSmithy() != null && other.getSmithy().equals(this.getSmithy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSmithy() == null) ? 0 : getSmithy().hashCode());
        return hashCode;
    }

    @Override
    public Model clone() {
        try {
            return (Model) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
