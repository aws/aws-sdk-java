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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetCustomEntityTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCustomEntityTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * </p>
     */
    private java.util.List<CustomEntityType> customEntityTypes;
    /**
     * <p>
     * A list of the names of custom patterns that were not found.
     * </p>
     */
    private java.util.List<String> customEntityTypesNotFound;

    /**
     * <p>
     * A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * </p>
     * 
     * @return A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     */

    public java.util.List<CustomEntityType> getCustomEntityTypes() {
        return customEntityTypes;
    }

    /**
     * <p>
     * A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * </p>
     * 
     * @param customEntityTypes
     *        A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     */

    public void setCustomEntityTypes(java.util.Collection<CustomEntityType> customEntityTypes) {
        if (customEntityTypes == null) {
            this.customEntityTypes = null;
            return;
        }

        this.customEntityTypes = new java.util.ArrayList<CustomEntityType>(customEntityTypes);
    }

    /**
     * <p>
     * A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomEntityTypes(java.util.Collection)} or {@link #withCustomEntityTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param customEntityTypes
     *        A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomEntityTypesResult withCustomEntityTypes(CustomEntityType... customEntityTypes) {
        if (this.customEntityTypes == null) {
            setCustomEntityTypes(new java.util.ArrayList<CustomEntityType>(customEntityTypes.length));
        }
        for (CustomEntityType ele : customEntityTypes) {
            this.customEntityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * </p>
     * 
     * @param customEntityTypes
     *        A list of <code>CustomEntityType</code> objects representing the custom patterns that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomEntityTypesResult withCustomEntityTypes(java.util.Collection<CustomEntityType> customEntityTypes) {
        setCustomEntityTypes(customEntityTypes);
        return this;
    }

    /**
     * <p>
     * A list of the names of custom patterns that were not found.
     * </p>
     * 
     * @return A list of the names of custom patterns that were not found.
     */

    public java.util.List<String> getCustomEntityTypesNotFound() {
        return customEntityTypesNotFound;
    }

    /**
     * <p>
     * A list of the names of custom patterns that were not found.
     * </p>
     * 
     * @param customEntityTypesNotFound
     *        A list of the names of custom patterns that were not found.
     */

    public void setCustomEntityTypesNotFound(java.util.Collection<String> customEntityTypesNotFound) {
        if (customEntityTypesNotFound == null) {
            this.customEntityTypesNotFound = null;
            return;
        }

        this.customEntityTypesNotFound = new java.util.ArrayList<String>(customEntityTypesNotFound);
    }

    /**
     * <p>
     * A list of the names of custom patterns that were not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomEntityTypesNotFound(java.util.Collection)} or
     * {@link #withCustomEntityTypesNotFound(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customEntityTypesNotFound
     *        A list of the names of custom patterns that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomEntityTypesResult withCustomEntityTypesNotFound(String... customEntityTypesNotFound) {
        if (this.customEntityTypesNotFound == null) {
            setCustomEntityTypesNotFound(new java.util.ArrayList<String>(customEntityTypesNotFound.length));
        }
        for (String ele : customEntityTypesNotFound) {
            this.customEntityTypesNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of custom patterns that were not found.
     * </p>
     * 
     * @param customEntityTypesNotFound
     *        A list of the names of custom patterns that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomEntityTypesResult withCustomEntityTypesNotFound(java.util.Collection<String> customEntityTypesNotFound) {
        setCustomEntityTypesNotFound(customEntityTypesNotFound);
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
        if (getCustomEntityTypes() != null)
            sb.append("CustomEntityTypes: ").append(getCustomEntityTypes()).append(",");
        if (getCustomEntityTypesNotFound() != null)
            sb.append("CustomEntityTypesNotFound: ").append(getCustomEntityTypesNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCustomEntityTypesResult == false)
            return false;
        BatchGetCustomEntityTypesResult other = (BatchGetCustomEntityTypesResult) obj;
        if (other.getCustomEntityTypes() == null ^ this.getCustomEntityTypes() == null)
            return false;
        if (other.getCustomEntityTypes() != null && other.getCustomEntityTypes().equals(this.getCustomEntityTypes()) == false)
            return false;
        if (other.getCustomEntityTypesNotFound() == null ^ this.getCustomEntityTypesNotFound() == null)
            return false;
        if (other.getCustomEntityTypesNotFound() != null && other.getCustomEntityTypesNotFound().equals(this.getCustomEntityTypesNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomEntityTypes() == null) ? 0 : getCustomEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getCustomEntityTypesNotFound() == null) ? 0 : getCustomEntityTypesNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCustomEntityTypesResult clone() {
        try {
            return (BatchGetCustomEntityTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
