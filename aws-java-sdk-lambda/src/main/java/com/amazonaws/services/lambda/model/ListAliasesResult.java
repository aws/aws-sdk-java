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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string, present if there are more aliases.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of aliases.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AliasConfiguration> aliases;

    /**
     * <p>
     * A string, present if there are more aliases.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more aliases.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more aliases.
     * </p>
     * 
     * @return A string, present if there are more aliases.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more aliases.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of aliases.
     * </p>
     * 
     * @return A list of aliases.
     */

    public java.util.List<AliasConfiguration> getAliases() {
        if (aliases == null) {
            aliases = new com.amazonaws.internal.SdkInternalList<AliasConfiguration>();
        }
        return aliases;
    }

    /**
     * <p>
     * A list of aliases.
     * </p>
     * 
     * @param aliases
     *        A list of aliases.
     */

    public void setAliases(java.util.Collection<AliasConfiguration> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new com.amazonaws.internal.SdkInternalList<AliasConfiguration>(aliases);
    }

    /**
     * <p>
     * A list of aliases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        A list of aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(AliasConfiguration... aliases) {
        if (this.aliases == null) {
            setAliases(new com.amazonaws.internal.SdkInternalList<AliasConfiguration>(aliases.length));
        }
        for (AliasConfiguration ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aliases.
     * </p>
     * 
     * @param aliases
     *        A list of aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(java.util.Collection<AliasConfiguration> aliases) {
        setAliases(aliases);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases());
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
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
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
