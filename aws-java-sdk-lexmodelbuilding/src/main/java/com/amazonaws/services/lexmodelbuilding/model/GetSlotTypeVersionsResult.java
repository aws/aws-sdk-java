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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypeVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSlotTypeVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one for
     * the <code>$LATEST</code> version.
     * </p>
     */
    private java.util.List<SlotTypeMetadata> slotTypes;
    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one for
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @return An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus
     *         one for the <code>$LATEST</code> version.
     */

    public java.util.List<SlotTypeMetadata> getSlotTypes() {
        return slotTypes;
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one for
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one
     *        for the <code>$LATEST</code> version.
     */

    public void setSlotTypes(java.util.Collection<SlotTypeMetadata> slotTypes) {
        if (slotTypes == null) {
            this.slotTypes = null;
            return;
        }

        this.slotTypes = new java.util.ArrayList<SlotTypeMetadata>(slotTypes);
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one for
     * the <code>$LATEST</code> version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypes(java.util.Collection)} or {@link #withSlotTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one
     *        for the <code>$LATEST</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeVersionsResult withSlotTypes(SlotTypeMetadata... slotTypes) {
        if (this.slotTypes == null) {
            setSlotTypes(new java.util.ArrayList<SlotTypeMetadata>(slotTypes.length));
        }
        for (SlotTypeMetadata ele : slotTypes) {
            this.slotTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one for
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>SlotTypeMetadata</code> objects, one for each numbered version of the slot type plus one
     *        for the <code>$LATEST</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeVersionsResult withSlotTypes(java.util.Collection<SlotTypeMetadata> slotTypes) {
        setSlotTypes(slotTypes);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of slot type versions. If the response to this call is
     *        truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions,
     *        specify the pagination token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @return A pagination token for fetching the next page of slot type versions. If the response to this call is
     *         truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions,
     *         specify the pagination token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of slot type versions. If the response to this call is
     *        truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions,
     *        specify the pagination token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeVersionsResult withNextToken(String nextToken) {
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
        if (getSlotTypes() != null)
            sb.append("SlotTypes: ").append(getSlotTypes()).append(",");
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

        if (obj instanceof GetSlotTypeVersionsResult == false)
            return false;
        GetSlotTypeVersionsResult other = (GetSlotTypeVersionsResult) obj;
        if (other.getSlotTypes() == null ^ this.getSlotTypes() == null)
            return false;
        if (other.getSlotTypes() != null && other.getSlotTypes().equals(this.getSlotTypes()) == false)
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

        hashCode = prime * hashCode + ((getSlotTypes() == null) ? 0 : getSlotTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSlotTypeVersionsResult clone() {
        try {
            return (GetSlotTypeVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
