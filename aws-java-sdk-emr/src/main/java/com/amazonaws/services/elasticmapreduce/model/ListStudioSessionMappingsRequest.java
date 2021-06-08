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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListStudioSessionMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioSessionMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * Specifies whether to return session mappings for users or groups. If not specified, the results include session
     * mapping details for both users and groups.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The pagination token that indicates the set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioSessionMappingsRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return session mappings for users or groups. If not specified, the results include session
     * mapping details for both users and groups.
     * </p>
     * 
     * @param identityType
     *        Specifies whether to return session mappings for users or groups. If not specified, the results include
     *        session mapping details for both users and groups.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * Specifies whether to return session mappings for users or groups. If not specified, the results include session
     * mapping details for both users and groups.
     * </p>
     * 
     * @return Specifies whether to return session mappings for users or groups. If not specified, the results include
     *         session mapping details for both users and groups.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * Specifies whether to return session mappings for users or groups. If not specified, the results include session
     * mapping details for both users and groups.
     * </p>
     * 
     * @param identityType
     *        Specifies whether to return session mappings for users or groups. If not specified, the results include
     *        session mapping details for both users and groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListStudioSessionMappingsRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return session mappings for users or groups. If not specified, the results include session
     * mapping details for both users and groups.
     * </p>
     * 
     * @param identityType
     *        Specifies whether to return session mappings for users or groups. If not specified, the results include
     *        session mapping details for both users and groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListStudioSessionMappingsRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioSessionMappingsRequest withMarker(String marker) {
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
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

        if (obj instanceof ListStudioSessionMappingsRequest == false)
            return false;
        ListStudioSessionMappingsRequest other = (ListStudioSessionMappingsRequest) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
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

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioSessionMappingsRequest clone() {
        return (ListStudioSessionMappingsRequest) super.clone();
    }

}
