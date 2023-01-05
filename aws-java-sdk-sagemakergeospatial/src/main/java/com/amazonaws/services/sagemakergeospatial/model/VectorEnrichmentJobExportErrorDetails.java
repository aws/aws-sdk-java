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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * VectorEnrichmentJob export error details in response from GetVectorEnrichmentJob.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/VectorEnrichmentJobExportErrorDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorEnrichmentJobExportErrorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message providing details about the errors generated during the Vector Enrichment job.
     * </p>
     */
    private String message;
    /** <p/> */
    private String type;

    /**
     * <p>
     * The message providing details about the errors generated during the Vector Enrichment job.
     * </p>
     * 
     * @param message
     *        The message providing details about the errors generated during the Vector Enrichment job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message providing details about the errors generated during the Vector Enrichment job.
     * </p>
     * 
     * @return The message providing details about the errors generated during the Vector Enrichment job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message providing details about the errors generated during the Vector Enrichment job.
     * </p>
     * 
     * @param message
     *        The message providing details about the errors generated during the Vector Enrichment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorEnrichmentJobExportErrorDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     * @see VectorEnrichmentJobExportErrorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     * 
     * @return
     * @see VectorEnrichmentJobExportErrorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobExportErrorType
     */

    public VectorEnrichmentJobExportErrorDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobExportErrorType
     */

    public VectorEnrichmentJobExportErrorDetails withType(VectorEnrichmentJobExportErrorType type) {
        this.type = type.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VectorEnrichmentJobExportErrorDetails == false)
            return false;
        VectorEnrichmentJobExportErrorDetails other = (VectorEnrichmentJobExportErrorDetails) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public VectorEnrichmentJobExportErrorDetails clone() {
        try {
            return (VectorEnrichmentJobExportErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.VectorEnrichmentJobExportErrorDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
