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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/RemoveFacetFromObject"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFacetFromObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the directory in which the object resides.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The facet to remove. See <a>SchemaFacet</a> for details.
     * </p>
     */
    private SchemaFacet schemaFacet;
    /**
     * <p>
     * A reference to the object to remove the facet from.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * The ARN of the directory in which the object resides.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory in which the object resides.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory in which the object resides.
     * </p>
     * 
     * @return The ARN of the directory in which the object resides.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory in which the object resides.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory in which the object resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFacetFromObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The facet to remove. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        The facet to remove. See <a>SchemaFacet</a> for details.
     */

    public void setSchemaFacet(SchemaFacet schemaFacet) {
        this.schemaFacet = schemaFacet;
    }

    /**
     * <p>
     * The facet to remove. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @return The facet to remove. See <a>SchemaFacet</a> for details.
     */

    public SchemaFacet getSchemaFacet() {
        return this.schemaFacet;
    }

    /**
     * <p>
     * The facet to remove. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        The facet to remove. See <a>SchemaFacet</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFacetFromObjectRequest withSchemaFacet(SchemaFacet schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * A reference to the object to remove the facet from.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object to remove the facet from.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference to the object to remove the facet from.
     * </p>
     * 
     * @return A reference to the object to remove the facet from.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference to the object to remove the facet from.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object to remove the facet from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFacetFromObjectRequest withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getSchemaFacet() != null)
            sb.append("SchemaFacet: ").append(getSchemaFacet()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFacetFromObjectRequest == false)
            return false;
        RemoveFacetFromObjectRequest other = (RemoveFacetFromObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getSchemaFacet() == null ^ this.getSchemaFacet() == null)
            return false;
        if (other.getSchemaFacet() != null && other.getSchemaFacet().equals(this.getSchemaFacet()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFacetFromObjectRequest clone() {
        return (RemoveFacetFromObjectRequest) super.clone();
    }

}
