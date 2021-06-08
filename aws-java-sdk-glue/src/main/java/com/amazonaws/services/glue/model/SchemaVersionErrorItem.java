/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that contains the error details for an operation on a schema version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaVersionErrorItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaVersionErrorItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The details of the error for the schema version.
     * </p>
     */
    private ErrorDetails errorDetails;

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionErrorItem withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The details of the error for the schema version.
     * </p>
     * 
     * @param errorDetails
     *        The details of the error for the schema version.
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * The details of the error for the schema version.
     * </p>
     * 
     * @return The details of the error for the schema version.
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * The details of the error for the schema version.
     * </p>
     * 
     * @param errorDetails
     *        The details of the error for the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionErrorItem withErrorDetails(ErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaVersionErrorItem == false)
            return false;
        SchemaVersionErrorItem other = (SchemaVersionErrorItem) obj;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public SchemaVersionErrorItem clone() {
        try {
            return (SchemaVersionErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaVersionErrorItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
