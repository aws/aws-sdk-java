/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The result of a <code>DefineSuggester</code> request. Contains the status of the newly-configured suggester.
 * </p>
 */
public class DefineSuggesterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private SuggesterStatus suggester;

    /**
     * @param suggester
     */

    public void setSuggester(SuggesterStatus suggester) {
        this.suggester = suggester;
    }

    /**
     * @return
     */

    public SuggesterStatus getSuggester() {
        return this.suggester;
    }

    /**
     * @param suggester
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefineSuggesterResult withSuggester(SuggesterStatus suggester) {
        setSuggester(suggester);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuggester() != null)
            sb.append("Suggester: " + getSuggester());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefineSuggesterResult == false)
            return false;
        DefineSuggesterResult other = (DefineSuggesterResult) obj;
        if (other.getSuggester() == null ^ this.getSuggester() == null)
            return false;
        if (other.getSuggester() != null && other.getSuggester().equals(this.getSuggester()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggester() == null) ? 0 : getSuggester().hashCode());
        return hashCode;
    }

    @Override
    public DefineSuggesterResult clone() {
        try {
            return (DefineSuggesterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
