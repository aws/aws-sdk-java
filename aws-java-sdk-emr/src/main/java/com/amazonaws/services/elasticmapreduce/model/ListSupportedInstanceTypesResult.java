/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSupportedInstanceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSupportedInstanceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of instance types that the release specified in
     * <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services Region.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SupportedInstanceType> supportedInstanceTypes;
    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of instance types that the release specified in
     * <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services Region.
     * </p>
     * 
     * @return The list of instance types that the release specified in
     *         <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services
     *         Region.
     */

    public java.util.List<SupportedInstanceType> getSupportedInstanceTypes() {
        if (supportedInstanceTypes == null) {
            supportedInstanceTypes = new com.amazonaws.internal.SdkInternalList<SupportedInstanceType>();
        }
        return supportedInstanceTypes;
    }

    /**
     * <p>
     * The list of instance types that the release specified in
     * <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services Region.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        The list of instance types that the release specified in
     *        <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services
     *        Region.
     */

    public void setSupportedInstanceTypes(java.util.Collection<SupportedInstanceType> supportedInstanceTypes) {
        if (supportedInstanceTypes == null) {
            this.supportedInstanceTypes = null;
            return;
        }

        this.supportedInstanceTypes = new com.amazonaws.internal.SdkInternalList<SupportedInstanceType>(supportedInstanceTypes);
    }

    /**
     * <p>
     * The list of instance types that the release specified in
     * <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedInstanceTypes(java.util.Collection)} or
     * {@link #withSupportedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        The list of instance types that the release specified in
     *        <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedInstanceTypesResult withSupportedInstanceTypes(SupportedInstanceType... supportedInstanceTypes) {
        if (this.supportedInstanceTypes == null) {
            setSupportedInstanceTypes(new com.amazonaws.internal.SdkInternalList<SupportedInstanceType>(supportedInstanceTypes.length));
        }
        for (SupportedInstanceType ele : supportedInstanceTypes) {
            this.supportedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of instance types that the release specified in
     * <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services Region.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        The list of instance types that the release specified in
     *        <code>ListSupportedInstanceTypesInput$ReleaseLabel</code> supports, filtered by Amazon Web Services
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedInstanceTypesResult withSupportedInstanceTypes(java.util.Collection<SupportedInstanceType> supportedInstanceTypes) {
        setSupportedInstanceTypes(supportedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that marks the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that marks the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that marks the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedInstanceTypesResult withMarker(String marker) {
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
        if (getSupportedInstanceTypes() != null)
            sb.append("SupportedInstanceTypes: ").append(getSupportedInstanceTypes()).append(",");
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

        if (obj instanceof ListSupportedInstanceTypesResult == false)
            return false;
        ListSupportedInstanceTypesResult other = (ListSupportedInstanceTypesResult) obj;
        if (other.getSupportedInstanceTypes() == null ^ this.getSupportedInstanceTypes() == null)
            return false;
        if (other.getSupportedInstanceTypes() != null && other.getSupportedInstanceTypes().equals(this.getSupportedInstanceTypes()) == false)
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

        hashCode = prime * hashCode + ((getSupportedInstanceTypes() == null) ? 0 : getSupportedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListSupportedInstanceTypesResult clone() {
        try {
            return (ListSupportedInstanceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
