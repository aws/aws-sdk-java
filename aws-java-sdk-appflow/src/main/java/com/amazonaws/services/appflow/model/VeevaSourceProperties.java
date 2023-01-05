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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when using Veeva as a flow source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/VeevaSourceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VeevaSourceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Veeva flow source.
     * </p>
     */
    private String object;
    /**
     * <p>
     * The document type specified in the Veeva document extract flow.
     * </p>
     */
    private String documentType;
    /**
     * <p>
     * Boolean value to include source files in Veeva document extract flow.
     * </p>
     */
    private Boolean includeSourceFiles;
    /**
     * <p>
     * Boolean value to include file renditions in Veeva document extract flow.
     * </p>
     */
    private Boolean includeRenditions;
    /**
     * <p>
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * </p>
     */
    private Boolean includeAllVersions;

    /**
     * <p>
     * The object specified in the Veeva flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Veeva flow source.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Veeva flow source.
     * </p>
     * 
     * @return The object specified in the Veeva flow source.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Veeva flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Veeva flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VeevaSourceProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * The document type specified in the Veeva document extract flow.
     * </p>
     * 
     * @param documentType
     *        The document type specified in the Veeva document extract flow.
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The document type specified in the Veeva document extract flow.
     * </p>
     * 
     * @return The document type specified in the Veeva document extract flow.
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The document type specified in the Veeva document extract flow.
     * </p>
     * 
     * @param documentType
     *        The document type specified in the Veeva document extract flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VeevaSourceProperties withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * Boolean value to include source files in Veeva document extract flow.
     * </p>
     * 
     * @param includeSourceFiles
     *        Boolean value to include source files in Veeva document extract flow.
     */

    public void setIncludeSourceFiles(Boolean includeSourceFiles) {
        this.includeSourceFiles = includeSourceFiles;
    }

    /**
     * <p>
     * Boolean value to include source files in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include source files in Veeva document extract flow.
     */

    public Boolean getIncludeSourceFiles() {
        return this.includeSourceFiles;
    }

    /**
     * <p>
     * Boolean value to include source files in Veeva document extract flow.
     * </p>
     * 
     * @param includeSourceFiles
     *        Boolean value to include source files in Veeva document extract flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VeevaSourceProperties withIncludeSourceFiles(Boolean includeSourceFiles) {
        setIncludeSourceFiles(includeSourceFiles);
        return this;
    }

    /**
     * <p>
     * Boolean value to include source files in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include source files in Veeva document extract flow.
     */

    public Boolean isIncludeSourceFiles() {
        return this.includeSourceFiles;
    }

    /**
     * <p>
     * Boolean value to include file renditions in Veeva document extract flow.
     * </p>
     * 
     * @param includeRenditions
     *        Boolean value to include file renditions in Veeva document extract flow.
     */

    public void setIncludeRenditions(Boolean includeRenditions) {
        this.includeRenditions = includeRenditions;
    }

    /**
     * <p>
     * Boolean value to include file renditions in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include file renditions in Veeva document extract flow.
     */

    public Boolean getIncludeRenditions() {
        return this.includeRenditions;
    }

    /**
     * <p>
     * Boolean value to include file renditions in Veeva document extract flow.
     * </p>
     * 
     * @param includeRenditions
     *        Boolean value to include file renditions in Veeva document extract flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VeevaSourceProperties withIncludeRenditions(Boolean includeRenditions) {
        setIncludeRenditions(includeRenditions);
        return this;
    }

    /**
     * <p>
     * Boolean value to include file renditions in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include file renditions in Veeva document extract flow.
     */

    public Boolean isIncludeRenditions() {
        return this.includeRenditions;
    }

    /**
     * <p>
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * </p>
     * 
     * @param includeAllVersions
     *        Boolean value to include All Versions of files in Veeva document extract flow.
     */

    public void setIncludeAllVersions(Boolean includeAllVersions) {
        this.includeAllVersions = includeAllVersions;
    }

    /**
     * <p>
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include All Versions of files in Veeva document extract flow.
     */

    public Boolean getIncludeAllVersions() {
        return this.includeAllVersions;
    }

    /**
     * <p>
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * </p>
     * 
     * @param includeAllVersions
     *        Boolean value to include All Versions of files in Veeva document extract flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VeevaSourceProperties withIncludeAllVersions(Boolean includeAllVersions) {
        setIncludeAllVersions(includeAllVersions);
        return this;
    }

    /**
     * <p>
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * </p>
     * 
     * @return Boolean value to include All Versions of files in Veeva document extract flow.
     */

    public Boolean isIncludeAllVersions() {
        return this.includeAllVersions;
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
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getIncludeSourceFiles() != null)
            sb.append("IncludeSourceFiles: ").append(getIncludeSourceFiles()).append(",");
        if (getIncludeRenditions() != null)
            sb.append("IncludeRenditions: ").append(getIncludeRenditions()).append(",");
        if (getIncludeAllVersions() != null)
            sb.append("IncludeAllVersions: ").append(getIncludeAllVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VeevaSourceProperties == false)
            return false;
        VeevaSourceProperties other = (VeevaSourceProperties) obj;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getIncludeSourceFiles() == null ^ this.getIncludeSourceFiles() == null)
            return false;
        if (other.getIncludeSourceFiles() != null && other.getIncludeSourceFiles().equals(this.getIncludeSourceFiles()) == false)
            return false;
        if (other.getIncludeRenditions() == null ^ this.getIncludeRenditions() == null)
            return false;
        if (other.getIncludeRenditions() != null && other.getIncludeRenditions().equals(this.getIncludeRenditions()) == false)
            return false;
        if (other.getIncludeAllVersions() == null ^ this.getIncludeAllVersions() == null)
            return false;
        if (other.getIncludeAllVersions() != null && other.getIncludeAllVersions().equals(this.getIncludeAllVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getIncludeSourceFiles() == null) ? 0 : getIncludeSourceFiles().hashCode());
        hashCode = prime * hashCode + ((getIncludeRenditions() == null) ? 0 : getIncludeRenditions().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllVersions() == null) ? 0 : getIncludeAllVersions().hashCode());
        return hashCode;
    }

    @Override
    public VeevaSourceProperties clone() {
        try {
            return (VeevaSourceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.VeevaSourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
