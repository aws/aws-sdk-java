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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class ListAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of alias records that match the list request.
     * </p>
     */
    private java.util.List<Alias> aliases;
    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of alias records that match the list request.
     * </p>
     * 
     * @return Collection of alias records that match the list request.
     */

    public java.util.List<Alias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * Collection of alias records that match the list request.
     * </p>
     * 
     * @param aliases
     *        Collection of alias records that match the list request.
     */

    public void setAliases(java.util.Collection<Alias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<Alias>(aliases);
    }

    /**
     * <p>
     * Collection of alias records that match the list request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        Collection of alias records that match the list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(Alias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<Alias>(aliases.length));
        }
        for (Alias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of alias records that match the list request.
     * </p>
     * 
     * @param aliases
     *        Collection of alias records that match the list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(java.util.Collection<Alias> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @return Token indicating where to resume retrieving results on the next call to this action. If no token is
     *         returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withNextToken(String nextToken) {
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
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAliasesResult == false)
            return false;
        ListAliasesResult other = (ListAliasesResult) obj;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
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

        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesResult clone() {
        try {
            return (ListAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
