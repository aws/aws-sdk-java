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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents any errors encountered when attempting to delete multiple recipe versions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/RecipeVersionErrorDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipeVersionErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP status code for the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The text of the error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The identifier for the recipe version associated with this error.
     * </p>
     */
    private String recipeVersion;

    /**
     * <p>
     * The HTTP status code for the error.
     * </p>
     * 
     * @param errorCode
     *        The HTTP status code for the error.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The HTTP status code for the error.
     * </p>
     * 
     * @return The HTTP status code for the error.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The HTTP status code for the error.
     * </p>
     * 
     * @param errorCode
     *        The HTTP status code for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeVersionErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @return The text of the error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeVersionErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The identifier for the recipe version associated with this error.
     * </p>
     * 
     * @param recipeVersion
     *        The identifier for the recipe version associated with this error.
     */

    public void setRecipeVersion(String recipeVersion) {
        this.recipeVersion = recipeVersion;
    }

    /**
     * <p>
     * The identifier for the recipe version associated with this error.
     * </p>
     * 
     * @return The identifier for the recipe version associated with this error.
     */

    public String getRecipeVersion() {
        return this.recipeVersion;
    }

    /**
     * <p>
     * The identifier for the recipe version associated with this error.
     * </p>
     * 
     * @param recipeVersion
     *        The identifier for the recipe version associated with this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeVersionErrorDetail withRecipeVersion(String recipeVersion) {
        setRecipeVersion(recipeVersion);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getRecipeVersion() != null)
            sb.append("RecipeVersion: ").append(getRecipeVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipeVersionErrorDetail == false)
            return false;
        RecipeVersionErrorDetail other = (RecipeVersionErrorDetail) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getRecipeVersion() == null ^ this.getRecipeVersion() == null)
            return false;
        if (other.getRecipeVersion() != null && other.getRecipeVersion().equals(this.getRecipeVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersion() == null) ? 0 : getRecipeVersion().hashCode());
        return hashCode;
    }

    @Override
    public RecipeVersionErrorDetail clone() {
        try {
            return (RecipeVersionErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RecipeVersionErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
