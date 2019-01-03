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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>ListPresetsResponse</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPresetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Preset</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Preset> presets;
    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of <code>Preset</code> objects.
     * </p>
     * 
     * @return An array of <code>Preset</code> objects.
     */

    public java.util.List<Preset> getPresets() {
        if (presets == null) {
            presets = new com.amazonaws.internal.SdkInternalList<Preset>();
        }
        return presets;
    }

    /**
     * <p>
     * An array of <code>Preset</code> objects.
     * </p>
     * 
     * @param presets
     *        An array of <code>Preset</code> objects.
     */

    public void setPresets(java.util.Collection<Preset> presets) {
        if (presets == null) {
            this.presets = null;
            return;
        }

        this.presets = new com.amazonaws.internal.SdkInternalList<Preset>(presets);
    }

    /**
     * <p>
     * An array of <code>Preset</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPresets(java.util.Collection)} or {@link #withPresets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param presets
     *        An array of <code>Preset</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withPresets(Preset... presets) {
        if (this.presets == null) {
            setPresets(new com.amazonaws.internal.SdkInternalList<Preset>(presets.length));
        }
        for (Preset ele : presets) {
            this.presets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Preset</code> objects.
     * </p>
     * 
     * @param presets
     *        An array of <code>Preset</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withPresets(java.util.Collection<Preset> presets) {
        setPresets(presets);
        return this;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the presets fit on
     *        one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *        <code>null</code>.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @return A value that you use to access the second and subsequent pages of results, if any. When the presets fit
     *         on one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *         <code>null</code>.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the presets fit on
     *        one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getPresets() != null)
            sb.append("Presets: ").append(getPresets()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPresetsResult == false)
            return false;
        ListPresetsResult other = (ListPresetsResult) obj;
        if (other.getPresets() == null ^ this.getPresets() == null)
            return false;
        if (other.getPresets() != null && other.getPresets().equals(this.getPresets()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresets() == null) ? 0 : getPresets().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPresetsResult clone() {
        try {
            return (ListPresetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
