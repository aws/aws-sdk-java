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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a collection of API keys as represented by an <a>ApiKeys</a> resource.
 * </p>
 * <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html">Use
 * API Keys</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code> option is
     * set to true.
     * </p>
     */
    private java.util.List<String> warnings;

    private String position;
    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     */
    private java.util.List<ApiKey> items;

    /**
     * <p>
     * A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code> option is
     * set to true.
     * </p>
     * 
     * @return A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code>
     *         option is set to true.
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code> option is
     * set to true.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code>
     *        option is set to true.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code> option is
     * set to true.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code>
     *        option is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysResult withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code> option is
     * set to true.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages logged during the import of API keys when the <code>failOnWarnings</code>
     *        option is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * @param position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysResult withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @return The current page of elements from this collection.
     */

    public java.util.List<ApiKey> getItems() {
        return items;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @param items
     *        The current page of elements from this collection.
     */

    public void setItems(java.util.Collection<ApiKey> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ApiKey>(items);
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The current page of elements from this collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysResult withItems(ApiKey... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ApiKey>(items.length));
        }
        for (ApiKey ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @param items
     *        The current page of elements from this collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysResult withItems(java.util.Collection<ApiKey> items) {
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
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
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

        if (obj instanceof GetApiKeysResult == false)
            return false;
        GetApiKeysResult other = (GetApiKeysResult) obj;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
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

        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public GetApiKeysResult clone() {
        try {
            return (GetApiKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
