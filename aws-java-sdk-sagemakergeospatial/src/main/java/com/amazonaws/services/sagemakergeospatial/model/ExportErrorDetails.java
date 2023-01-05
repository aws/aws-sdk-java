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
 * The structure for returning the export error details in a GetEarthObservationJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportErrorDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportErrorDetails implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private ExportErrorDetailsOutput exportResults;
    /** <p/> */
    private ExportErrorDetailsOutput exportSourceImages;

    /**
     * <p/>
     * 
     * @param exportResults
     */

    public void setExportResults(ExportErrorDetailsOutput exportResults) {
        this.exportResults = exportResults;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ExportErrorDetailsOutput getExportResults() {
        return this.exportResults;
    }

    /**
     * <p/>
     * 
     * @param exportResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportErrorDetails withExportResults(ExportErrorDetailsOutput exportResults) {
        setExportResults(exportResults);
        return this;
    }

    /**
     * <p/>
     * 
     * @param exportSourceImages
     */

    public void setExportSourceImages(ExportErrorDetailsOutput exportSourceImages) {
        this.exportSourceImages = exportSourceImages;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ExportErrorDetailsOutput getExportSourceImages() {
        return this.exportSourceImages;
    }

    /**
     * <p/>
     * 
     * @param exportSourceImages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportErrorDetails withExportSourceImages(ExportErrorDetailsOutput exportSourceImages) {
        setExportSourceImages(exportSourceImages);
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
        if (getExportResults() != null)
            sb.append("ExportResults: ").append(getExportResults()).append(",");
        if (getExportSourceImages() != null)
            sb.append("ExportSourceImages: ").append(getExportSourceImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportErrorDetails == false)
            return false;
        ExportErrorDetails other = (ExportErrorDetails) obj;
        if (other.getExportResults() == null ^ this.getExportResults() == null)
            return false;
        if (other.getExportResults() != null && other.getExportResults().equals(this.getExportResults()) == false)
            return false;
        if (other.getExportSourceImages() == null ^ this.getExportSourceImages() == null)
            return false;
        if (other.getExportSourceImages() != null && other.getExportSourceImages().equals(this.getExportSourceImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportResults() == null) ? 0 : getExportResults().hashCode());
        hashCode = prime * hashCode + ((getExportSourceImages() == null) ? 0 : getExportSourceImages().hashCode());
        return hashCode;
    }

    @Override
    public ExportErrorDetails clone() {
        try {
            return (ExportErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ExportErrorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
