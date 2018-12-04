/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Definitions */
    private java.util.List<DefinitionInformation> definitions;
    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;

    /**
     * Definitions
     * 
     * @return Definitions
     */

    public java.util.List<DefinitionInformation> getDefinitions() {
        return definitions;
    }

    /**
     * Definitions
     * 
     * @param definitions
     *        Definitions
     */

    public void setDefinitions(java.util.Collection<DefinitionInformation> definitions) {
        if (definitions == null) {
            this.definitions = null;
            return;
        }

        this.definitions = new java.util.ArrayList<DefinitionInformation>(definitions);
    }

    /**
     * Definitions
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefinitions(java.util.Collection)} or {@link #withDefinitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param definitions
     *        Definitions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionDefinitionsResult withDefinitions(DefinitionInformation... definitions) {
        if (this.definitions == null) {
            setDefinitions(new java.util.ArrayList<DefinitionInformation>(definitions.length));
        }
        for (DefinitionInformation ele : definitions) {
            this.definitions.add(ele);
        }
        return this;
    }

    /**
     * Definitions
     * 
     * @param definitions
     *        Definitions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionDefinitionsResult withDefinitions(java.util.Collection<DefinitionInformation> definitions) {
        setDefinitions(definitions);
        return this;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionDefinitionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDefinitions() != null)
            sb.append("Definitions: ").append(getDefinitions()).append(",");
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

        if (obj instanceof ListSubscriptionDefinitionsResult == false)
            return false;
        ListSubscriptionDefinitionsResult other = (ListSubscriptionDefinitionsResult) obj;
        if (other.getDefinitions() == null ^ this.getDefinitions() == null)
            return false;
        if (other.getDefinitions() != null && other.getDefinitions().equals(this.getDefinitions()) == false)
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

        hashCode = prime * hashCode + ((getDefinitions() == null) ? 0 : getDefinitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscriptionDefinitionsResult clone() {
        try {
            return (ListSubscriptionDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
