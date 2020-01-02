/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The operating system type for which to list patches.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The patch property for which you want to view patch details.
     * </p>
     */
    private String property;
    /**
     * <p>
     * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable
     * for Linux operating systems.
     * </p>
     */
    private String patchSet;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The operating system type for which to list patches.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system type for which to list patches.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system type for which to list patches.
     * </p>
     * 
     * @return The operating system type for which to list patches.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system type for which to list patches.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system type for which to list patches.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public DescribePatchPropertiesRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system type for which to list patches.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system type for which to list patches.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public DescribePatchPropertiesRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * The patch property for which you want to view patch details.
     * </p>
     * 
     * @param property
     *        The patch property for which you want to view patch details.
     * @see PatchProperty
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The patch property for which you want to view patch details.
     * </p>
     * 
     * @return The patch property for which you want to view patch details.
     * @see PatchProperty
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The patch property for which you want to view patch details.
     * </p>
     * 
     * @param property
     *        The patch property for which you want to view patch details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchProperty
     */

    public DescribePatchPropertiesRequest withProperty(String property) {
        setProperty(property);
        return this;
    }

    /**
     * <p>
     * The patch property for which you want to view patch details.
     * </p>
     * 
     * @param property
     *        The patch property for which you want to view patch details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchProperty
     */

    public DescribePatchPropertiesRequest withProperty(PatchProperty property) {
        this.property = property.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable
     * for Linux operating systems.
     * </p>
     * 
     * @param patchSet
     *        Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not
     *        applicable for Linux operating systems.
     * @see PatchSet
     */

    public void setPatchSet(String patchSet) {
        this.patchSet = patchSet;
    }

    /**
     * <p>
     * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable
     * for Linux operating systems.
     * </p>
     * 
     * @return Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not
     *         applicable for Linux operating systems.
     * @see PatchSet
     */

    public String getPatchSet() {
        return this.patchSet;
    }

    /**
     * <p>
     * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable
     * for Linux operating systems.
     * </p>
     * 
     * @param patchSet
     *        Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not
     *        applicable for Linux operating systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchSet
     */

    public DescribePatchPropertiesRequest withPatchSet(String patchSet) {
        setPatchSet(patchSet);
        return this;
    }

    /**
     * <p>
     * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable
     * for Linux operating systems.
     * </p>
     * 
     * @param patchSet
     *        Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not
     *        applicable for Linux operating systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchSet
     */

    public DescribePatchPropertiesRequest withPatchSet(PatchSet patchSet) {
        this.patchSet = patchSet.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchPropertiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchPropertiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty()).append(",");
        if (getPatchSet() != null)
            sb.append("PatchSet: ").append(getPatchSet()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribePatchPropertiesRequest == false)
            return false;
        DescribePatchPropertiesRequest other = (DescribePatchPropertiesRequest) obj;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        if (other.getPatchSet() == null ^ this.getPatchSet() == null)
            return false;
        if (other.getPatchSet() != null && other.getPatchSet().equals(this.getPatchSet()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        hashCode = prime * hashCode + ((getPatchSet() == null) ? 0 : getPatchSet().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchPropertiesRequest clone() {
        return (DescribePatchPropertiesRequest) super.clone();
    }

}
