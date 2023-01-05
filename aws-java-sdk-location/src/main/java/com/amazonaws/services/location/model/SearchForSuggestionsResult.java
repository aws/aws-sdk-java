/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a place suggestion resulting from a place suggestion query that is run on a place index resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchForSuggestionsResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchForSuggestionsResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the place
     * again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place indexes
     * that use HERE or Esri as data providers.
     * </p>
     * </note>
     */
    private String placeId;
    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address string.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the place
     * again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place indexes
     * that use HERE or Esri as data providers.
     * </p>
     * </note>
     * 
     * @param placeId
     *        The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the
     *        place again later.</p> <note>
     *        <p>
     *        For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place
     *        indexes that use HERE or Esri as data providers.
     *        </p>
     */

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * <p>
     * The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the place
     * again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place indexes
     * that use HERE or Esri as data providers.
     * </p>
     * </note>
     * 
     * @return The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the
     *         place again later.</p> <note>
     *         <p>
     *         For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place
     *         indexes that use HERE or Esri as data providers.
     *         </p>
     */

    public String getPlaceId() {
        return this.placeId;
    }

    /**
     * <p>
     * The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the place
     * again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place indexes
     * that use HERE or Esri as data providers.
     * </p>
     * </note>
     * 
     * @param placeId
     *        The unique identifier of the place. You can use this with the <code>GetPlace</code> operation to find the
     *        place again later.</p> <note>
     *        <p>
     *        For <code>SearchPlaceIndexForSuggestions</code> operations, the <code>PlaceId</code> is returned by place
     *        indexes that use HERE or Esri as data providers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchForSuggestionsResult withPlaceId(String placeId) {
        setPlaceId(placeId);
        return this;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address string.
     * </p>
     * 
     * @param text
     *        The text of the place suggestion, typically formatted as an address string.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address string.
     * </p>
     * 
     * @return The text of the place suggestion, typically formatted as an address string.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address string.
     * </p>
     * 
     * @param text
     *        The text of the place suggestion, typically formatted as an address string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchForSuggestionsResult withText(String text) {
        setText(text);
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
        if (getPlaceId() != null)
            sb.append("PlaceId: ").append(getPlaceId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchForSuggestionsResult == false)
            return false;
        SearchForSuggestionsResult other = (SearchForSuggestionsResult) obj;
        if (other.getPlaceId() == null ^ this.getPlaceId() == null)
            return false;
        if (other.getPlaceId() != null && other.getPlaceId().equals(this.getPlaceId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public SearchForSuggestionsResult clone() {
        try {
            return (SearchForSuggestionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.SearchForSuggestionsResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
