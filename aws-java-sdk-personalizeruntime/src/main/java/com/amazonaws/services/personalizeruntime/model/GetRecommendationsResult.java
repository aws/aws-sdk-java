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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in
     * the list.
     * </p>
     */
    private java.util.List<PredictedItem> itemList;

    /**
     * <p>
     * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in
     * the list.
     * </p>
     * 
     * @return A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500
     *         items in the list.
     */

    public java.util.List<PredictedItem> getItemList() {
        return itemList;
    }

    /**
     * <p>
     * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in
     * the list.
     * </p>
     * 
     * @param itemList
     *        A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500
     *        items in the list.
     */

    public void setItemList(java.util.Collection<PredictedItem> itemList) {
        if (itemList == null) {
            this.itemList = null;
            return;
        }

        this.itemList = new java.util.ArrayList<PredictedItem>(itemList);
    }

    /**
     * <p>
     * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in
     * the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItemList(java.util.Collection)} or {@link #withItemList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param itemList
     *        A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500
     *        items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withItemList(PredictedItem... itemList) {
        if (this.itemList == null) {
            setItemList(new java.util.ArrayList<PredictedItem>(itemList.length));
        }
        for (PredictedItem ele : itemList) {
            this.itemList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in
     * the list.
     * </p>
     * 
     * @param itemList
     *        A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500
     *        items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withItemList(java.util.Collection<PredictedItem> itemList) {
        setItemList(itemList);
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
        if (getItemList() != null)
            sb.append("ItemList: ").append(getItemList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsResult == false)
            return false;
        GetRecommendationsResult other = (GetRecommendationsResult) obj;
        if (other.getItemList() == null ^ this.getItemList() == null)
            return false;
        if (other.getItemList() != null && other.getItemList().equals(this.getItemList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemList() == null) ? 0 : getItemList().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsResult clone() {
        try {
            return (GetRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
