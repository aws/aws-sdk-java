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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * A list of item data.
     * </p>
     */
    private java.util.List<Item> items;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Items dataset you are adding the item or items to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemsRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * A list of item data.
     * </p>
     * 
     * @return A list of item data.
     */

    public java.util.List<Item> getItems() {
        return items;
    }

    /**
     * <p>
     * A list of item data.
     * </p>
     * 
     * @param items
     *        A list of item data.
     */

    public void setItems(java.util.Collection<Item> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Item>(items);
    }

    /**
     * <p>
     * A list of item data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of item data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemsRequest withItems(Item... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<Item>(items.length));
        }
        for (Item ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of item data.
     * </p>
     * 
     * @param items
     *        A list of item data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemsRequest withItems(java.util.Collection<Item> items) {
        setItems(items);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutItemsRequest == false)
            return false;
        PutItemsRequest other = (PutItemsRequest) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public PutItemsRequest clone() {
        return (PutItemsRequest) super.clone();
    }

}
