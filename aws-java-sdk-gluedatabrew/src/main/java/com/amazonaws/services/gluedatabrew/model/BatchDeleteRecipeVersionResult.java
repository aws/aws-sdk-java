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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRecipeVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the recipe that was modified.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Errors, if any, that occurred while attempting to delete the recipe versions.
     * </p>
     */
    private java.util.List<RecipeVersionErrorDetail> errors;

    /**
     * <p>
     * The name of the recipe that was modified.
     * </p>
     * 
     * @param name
     *        The name of the recipe that was modified.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe that was modified.
     * </p>
     * 
     * @return The name of the recipe that was modified.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe that was modified.
     * </p>
     * 
     * @param name
     *        The name of the recipe that was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Errors, if any, that occurred while attempting to delete the recipe versions.
     * </p>
     * 
     * @return Errors, if any, that occurred while attempting to delete the recipe versions.
     */

    public java.util.List<RecipeVersionErrorDetail> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors, if any, that occurred while attempting to delete the recipe versions.
     * </p>
     * 
     * @param errors
     *        Errors, if any, that occurred while attempting to delete the recipe versions.
     */

    public void setErrors(java.util.Collection<RecipeVersionErrorDetail> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<RecipeVersionErrorDetail>(errors);
    }

    /**
     * <p>
     * Errors, if any, that occurred while attempting to delete the recipe versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors, if any, that occurred while attempting to delete the recipe versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionResult withErrors(RecipeVersionErrorDetail... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<RecipeVersionErrorDetail>(errors.length));
        }
        for (RecipeVersionErrorDetail ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors, if any, that occurred while attempting to delete the recipe versions.
     * </p>
     * 
     * @param errors
     *        Errors, if any, that occurred while attempting to delete the recipe versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionResult withErrors(java.util.Collection<RecipeVersionErrorDetail> errors) {
        setErrors(errors);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRecipeVersionResult == false)
            return false;
        BatchDeleteRecipeVersionResult other = (BatchDeleteRecipeVersionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRecipeVersionResult clone() {
        try {
            return (BatchDeleteRecipeVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
