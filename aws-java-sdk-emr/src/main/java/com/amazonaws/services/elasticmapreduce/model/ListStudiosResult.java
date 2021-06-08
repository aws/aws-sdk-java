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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListStudios" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudiosResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Studio summary objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StudioSummary> studios;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of Studio summary objects.
     * </p>
     * 
     * @return The list of Studio summary objects.
     */

    public java.util.List<StudioSummary> getStudios() {
        if (studios == null) {
            studios = new com.amazonaws.internal.SdkInternalList<StudioSummary>();
        }
        return studios;
    }

    /**
     * <p>
     * The list of Studio summary objects.
     * </p>
     * 
     * @param studios
     *        The list of Studio summary objects.
     */

    public void setStudios(java.util.Collection<StudioSummary> studios) {
        if (studios == null) {
            this.studios = null;
            return;
        }

        this.studios = new com.amazonaws.internal.SdkInternalList<StudioSummary>(studios);
    }

    /**
     * <p>
     * The list of Studio summary objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudios(java.util.Collection)} or {@link #withStudios(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param studios
     *        The list of Studio summary objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withStudios(StudioSummary... studios) {
        if (this.studios == null) {
            setStudios(new com.amazonaws.internal.SdkInternalList<StudioSummary>(studios.length));
        }
        for (StudioSummary ele : studios) {
            this.studios.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Studio summary objects.
     * </p>
     * 
     * @param studios
     *        The list of Studio summary objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withStudios(java.util.Collection<StudioSummary> studios) {
        setStudios(studios);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withMarker(String marker) {
        setMarker(marker);
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
        if (getStudios() != null)
            sb.append("Studios: ").append(getStudios()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudiosResult == false)
            return false;
        ListStudiosResult other = (ListStudiosResult) obj;
        if (other.getStudios() == null ^ this.getStudios() == null)
            return false;
        if (other.getStudios() != null && other.getStudios().equals(this.getStudios()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudios() == null) ? 0 : getStudios().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListStudiosResult clone() {
        try {
            return (ListStudiosResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
