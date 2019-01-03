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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Configuration information for a search suggester. Each suggester has a unique name and specifies the text field you
 * want to use for suggestions. The following options can be configured for a suggester: <code>FuzzyMatching</code>,
 * <code>SortExpression</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Suggester implements Serializable, Cloneable {

    private String suggesterName;

    private DocumentSuggesterOptions documentSuggesterOptions;

    /**
     * @param suggesterName
     */

    public void setSuggesterName(String suggesterName) {
        this.suggesterName = suggesterName;
    }

    /**
     * @return
     */

    public String getSuggesterName() {
        return this.suggesterName;
    }

    /**
     * @param suggesterName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggester withSuggesterName(String suggesterName) {
        setSuggesterName(suggesterName);
        return this;
    }

    /**
     * @param documentSuggesterOptions
     */

    public void setDocumentSuggesterOptions(DocumentSuggesterOptions documentSuggesterOptions) {
        this.documentSuggesterOptions = documentSuggesterOptions;
    }

    /**
     * @return
     */

    public DocumentSuggesterOptions getDocumentSuggesterOptions() {
        return this.documentSuggesterOptions;
    }

    /**
     * @param documentSuggesterOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggester withDocumentSuggesterOptions(DocumentSuggesterOptions documentSuggesterOptions) {
        setDocumentSuggesterOptions(documentSuggesterOptions);
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
        if (getSuggesterName() != null)
            sb.append("SuggesterName: ").append(getSuggesterName()).append(",");
        if (getDocumentSuggesterOptions() != null)
            sb.append("DocumentSuggesterOptions: ").append(getDocumentSuggesterOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Suggester == false)
            return false;
        Suggester other = (Suggester) obj;
        if (other.getSuggesterName() == null ^ this.getSuggesterName() == null)
            return false;
        if (other.getSuggesterName() != null && other.getSuggesterName().equals(this.getSuggesterName()) == false)
            return false;
        if (other.getDocumentSuggesterOptions() == null ^ this.getDocumentSuggesterOptions() == null)
            return false;
        if (other.getDocumentSuggesterOptions() != null && other.getDocumentSuggesterOptions().equals(this.getDocumentSuggesterOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggesterName() == null) ? 0 : getSuggesterName().hashCode());
        hashCode = prime * hashCode + ((getDocumentSuggesterOptions() == null) ? 0 : getDocumentSuggesterOptions().hashCode());
        return hashCode;
    }

    @Override
    public Suggester clone() {
        try {
            return (Suggester) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
