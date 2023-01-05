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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportThemes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportThemesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the configuration of the exported themes.
     * </p>
     */
    private java.util.List<Theme> entities;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Represents the configuration of the exported themes.
     * </p>
     * 
     * @return Represents the configuration of the exported themes.
     */

    public java.util.List<Theme> getEntities() {
        return entities;
    }

    /**
     * <p>
     * Represents the configuration of the exported themes.
     * </p>
     * 
     * @param entities
     *        Represents the configuration of the exported themes.
     */

    public void setEntities(java.util.Collection<Theme> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Theme>(entities);
    }

    /**
     * <p>
     * Represents the configuration of the exported themes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        Represents the configuration of the exported themes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportThemesResult withEntities(Theme... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<Theme>(entities.length));
        }
        for (Theme ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the configuration of the exported themes.
     * </p>
     * 
     * @param entities
     *        Represents the configuration of the exported themes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportThemesResult withEntities(java.util.Collection<Theme> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportThemesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportThemesResult == false)
            return false;
        ExportThemesResult other = (ExportThemesResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ExportThemesResult clone() {
        try {
            return (ExportThemesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
