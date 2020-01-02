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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Lake Formation principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataLakePrincipal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakePrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     */
    private String dataLakePrincipalIdentifier;

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * 
     * @param dataLakePrincipalIdentifier
     *        An identifier for the AWS Lake Formation principal.
     */

    public void setDataLakePrincipalIdentifier(String dataLakePrincipalIdentifier) {
        this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
    }

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * 
     * @return An identifier for the AWS Lake Formation principal.
     */

    public String getDataLakePrincipalIdentifier() {
        return this.dataLakePrincipalIdentifier;
    }

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * 
     * @param dataLakePrincipalIdentifier
     *        An identifier for the AWS Lake Formation principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakePrincipal withDataLakePrincipalIdentifier(String dataLakePrincipalIdentifier) {
        setDataLakePrincipalIdentifier(dataLakePrincipalIdentifier);
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
        if (getDataLakePrincipalIdentifier() != null)
            sb.append("DataLakePrincipalIdentifier: ").append(getDataLakePrincipalIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakePrincipal == false)
            return false;
        DataLakePrincipal other = (DataLakePrincipal) obj;
        if (other.getDataLakePrincipalIdentifier() == null ^ this.getDataLakePrincipalIdentifier() == null)
            return false;
        if (other.getDataLakePrincipalIdentifier() != null && other.getDataLakePrincipalIdentifier().equals(this.getDataLakePrincipalIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakePrincipalIdentifier() == null) ? 0 : getDataLakePrincipalIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DataLakePrincipal clone() {
        try {
            return (DataLakePrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataLakePrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
