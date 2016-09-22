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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of key aliases in the user's account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AliasListEntry> aliases;
    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your results were truncated, you can use the
     * <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in the list.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * A list of key aliases in the user's account.
     * </p>
     * 
     * @return A list of key aliases in the user's account.
     */

    public java.util.List<AliasListEntry> getAliases() {
        if (aliases == null) {
            aliases = new com.amazonaws.internal.SdkInternalList<AliasListEntry>();
        }
        return aliases;
    }

    /**
     * <p>
     * A list of key aliases in the user's account.
     * </p>
     * 
     * @param aliases
     *        A list of key aliases in the user's account.
     */

    public void setAliases(java.util.Collection<AliasListEntry> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new com.amazonaws.internal.SdkInternalList<AliasListEntry>(aliases);
    }

    /**
     * <p>
     * A list of key aliases in the user's account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        A list of key aliases in the user's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(AliasListEntry... aliases) {
        if (this.aliases == null) {
            setAliases(new com.amazonaws.internal.SdkInternalList<AliasListEntry>(aliases.length));
        }
        for (AliasListEntry ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key aliases in the user's account.
     * </p>
     * 
     * @param aliases
     *        A list of key aliases in the user's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(java.util.Collection<AliasListEntry> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param nextMarker
     *        When <code>Truncated</code> is true, this value is present and contains the value to use for the
     *        <code>Marker</code> parameter in a subsequent pagination request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When <code>Truncated</code> is true, this value is present and contains the value to use for the
     *         <code>Marker</code> parameter in a subsequent pagination request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param nextMarker
     *        When <code>Truncated</code> is true, this value is present and contains the value to use for the
     *        <code>Marker</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your results were truncated, you can use the
     * <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in the list.
     * </p>
     * 
     * @param truncated
     *        A flag that indicates whether there are more items in the list. If your results were truncated, you can
     *        use the <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in
     *        the list.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your results were truncated, you can use the
     * <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in the list.
     * </p>
     * 
     * @return A flag that indicates whether there are more items in the list. If your results were truncated, you can
     *         use the <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in
     *         the list.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your results were truncated, you can use the
     * <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in the list.
     * </p>
     * 
     * @param truncated
     *        A flag that indicates whether there are more items in the list. If your results were truncated, you can
     *        use the <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in
     *        the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your results were truncated, you can use the
     * <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in the list.
     * </p>
     * 
     * @return A flag that indicates whether there are more items in the list. If your results were truncated, you can
     *         use the <code>Marker</code> parameter to make a subsequent pagination request to retrieve more items in
     *         the list.
     */

    public Boolean isTruncated() {
        return this.truncated;
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getTruncated() != null)
            sb.append("Truncated: " + getTruncated());
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
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
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
