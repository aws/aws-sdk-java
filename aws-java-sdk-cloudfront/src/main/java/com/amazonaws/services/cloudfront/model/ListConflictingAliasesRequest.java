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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListConflictingAliases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConflictingAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the provided
     * alias.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * The alias (also called a CNAME) to search for conflicting aliases.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     * response includes conflicting aliases in the list that occur after the marker. To get the next page of the list,
     * set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of conflicting aliases that you want in the response.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the provided
     * alias.
     * </p>
     * 
     * @param distributionId
     *        The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the
     *        provided alias.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the provided
     * alias.
     * </p>
     * 
     * @return The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the
     *         provided alias.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the provided
     * alias.
     * </p>
     * 
     * @param distributionId
     *        The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the
     *        provided alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConflictingAliasesRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * The alias (also called a CNAME) to search for conflicting aliases.
     * </p>
     * 
     * @param alias
     *        The alias (also called a CNAME) to search for conflicting aliases.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias (also called a CNAME) to search for conflicting aliases.
     * </p>
     * 
     * @return The alias (also called a CNAME) to search for conflicting aliases.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias (also called a CNAME) to search for conflicting aliases.
     * </p>
     * 
     * @param alias
     *        The alias (also called a CNAME) to search for conflicting aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConflictingAliasesRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     * response includes conflicting aliases in the list that occur after the marker. To get the next page of the list,
     * set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     *        response includes conflicting aliases in the list that occur after the marker. To get the next page of the
     *        list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     * response includes conflicting aliases in the list that occur after the marker. To get the next page of the list,
     * set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @return Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     *         response includes conflicting aliases in the list that occur after the marker. To get the next page of
     *         the list, set this field’s value to the value of <code>NextMarker</code> from the current page’s
     *         response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     * response includes conflicting aliases in the list that occur after the marker. To get the next page of the list,
     * set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The
     *        response includes conflicting aliases in the list that occur after the marker. To get the next page of the
     *        list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConflictingAliasesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of conflicting aliases that you want in the response.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases that you want in the response.
     * </p>
     * 
     * @return The maximum number of conflicting aliases that you want in the response.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of conflicting aliases that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConflictingAliasesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConflictingAliasesRequest == false)
            return false;
        ListConflictingAliasesRequest other = (ListConflictingAliasesRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListConflictingAliasesRequest clone() {
        return (ListConflictingAliasesRequest) super.clone();
    }

}
