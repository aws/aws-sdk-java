/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A collection of the imported <a>DocumentationPart</a> identifiers.
 * </p>
 * <div class="remarks">This is used to return the result when documentation parts in an external (e.g., OpenAPI) file
 * are imported into API Gateway</div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an
 * API</a>, <a href="https://docs.aws.amazon.com/apigateway/api-reference/link-relation/documentationpart-import/">
 * documentationpart:import</a>, <a>DocumentationPart</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDocumentationPartsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * 
     * @return A list of the returned documentation part identifiers.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * 
     * @param ids
     *        A list of the returned documentation part identifiers.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        A list of the returned documentation part identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsResult withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * 
     * @param ids
     *        A list of the returned documentation part identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * 
     * @return A list of warning messages reported during import of documentation parts.
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages reported during import of documentation parts.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages reported during import of documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsResult withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages reported during import of documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDocumentationPartsResult == false)
            return false;
        ImportDocumentationPartsResult other = (ImportDocumentationPartsResult) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ImportDocumentationPartsResult clone() {
        try {
            return (ImportDocumentationPartsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
