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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> assetModelTypes;

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetModelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 50
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetModelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of asset model.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *         component in another asset model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *         models. You can't create assets directly from this type of asset model.
     *         </p>
     *         </li>
     * @see AssetModelType
     */

    public java.util.List<String> getAssetModelTypes() {
        return assetModelTypes;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelTypes
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @see AssetModelType
     */

    public void setAssetModelTypes(java.util.Collection<String> assetModelTypes) {
        if (assetModelTypes == null) {
            this.assetModelTypes = null;
            return;
        }

        this.assetModelTypes = new java.util.ArrayList<String>(assetModelTypes);
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelTypes(java.util.Collection)} or {@link #withAssetModelTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetModelTypes
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public ListAssetModelsRequest withAssetModelTypes(String... assetModelTypes) {
        if (this.assetModelTypes == null) {
            setAssetModelTypes(new java.util.ArrayList<String>(assetModelTypes.length));
        }
        for (String ele : assetModelTypes) {
            this.assetModelTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelTypes
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public ListAssetModelsRequest withAssetModelTypes(java.util.Collection<String> assetModelTypes) {
        setAssetModelTypes(assetModelTypes);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelTypes
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public ListAssetModelsRequest withAssetModelTypes(AssetModelType... assetModelTypes) {
        java.util.ArrayList<String> assetModelTypesCopy = new java.util.ArrayList<String>(assetModelTypes.length);
        for (AssetModelType value : assetModelTypes) {
            assetModelTypesCopy.add(value.toString());
        }
        if (getAssetModelTypes() == null) {
            setAssetModelTypes(assetModelTypesCopy);
        } else {
            getAssetModelTypes().addAll(assetModelTypesCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAssetModelTypes() != null)
            sb.append("AssetModelTypes: ").append(getAssetModelTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetModelsRequest == false)
            return false;
        ListAssetModelsRequest other = (ListAssetModelsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAssetModelTypes() == null ^ this.getAssetModelTypes() == null)
            return false;
        if (other.getAssetModelTypes() != null && other.getAssetModelTypes().equals(this.getAssetModelTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAssetModelTypes() == null) ? 0 : getAssetModelTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetModelsRequest clone() {
        return (ListAssetModelsRequest) super.clone();
    }

}
