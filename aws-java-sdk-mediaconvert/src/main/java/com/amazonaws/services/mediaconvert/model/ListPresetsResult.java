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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListPresets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPresetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Use this string to request the next batch of presets. */
    private String nextToken;
    /** List of presets */
    private java.util.List<Preset> presets;

    /**
     * Use this string to request the next batch of presets.
     * 
     * @param nextToken
     *        Use this string to request the next batch of presets.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string to request the next batch of presets.
     * 
     * @return Use this string to request the next batch of presets.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string to request the next batch of presets.
     * 
     * @param nextToken
     *        Use this string to request the next batch of presets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * List of presets
     * 
     * @return List of presets
     */

    public java.util.List<Preset> getPresets() {
        return presets;
    }

    /**
     * List of presets
     * 
     * @param presets
     *        List of presets
     */

    public void setPresets(java.util.Collection<Preset> presets) {
        if (presets == null) {
            this.presets = null;
            return;
        }

        this.presets = new java.util.ArrayList<Preset>(presets);
    }

    /**
     * List of presets
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPresets(java.util.Collection)} or {@link #withPresets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param presets
     *        List of presets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withPresets(Preset... presets) {
        if (this.presets == null) {
            setPresets(new java.util.ArrayList<Preset>(presets.length));
        }
        for (Preset ele : presets) {
            this.presets.add(ele);
        }
        return this;
    }

    /**
     * List of presets
     * 
     * @param presets
     *        List of presets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPresetsResult withPresets(java.util.Collection<Preset> presets) {
        setPresets(presets);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPresets() != null)
            sb.append("Presets: ").append(getPresets());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPresets() == null ^ this.getPresets() == null)
            return false;
        if (other.getPresets() != null && other.getPresets().equals(this.getPresets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPresets() == null) ? 0 : getPresets().hashCode());
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
