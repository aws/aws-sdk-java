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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinSlotTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBuiltinSlotTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * </p>
     */
    private java.util.List<BuiltinSlotTypeMetadata> slotTypes;
    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can use in your next request to
     * fetch the next page of slot types.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * </p>
     * 
     * @return An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     */

    public java.util.List<BuiltinSlotTypeMetadata> getSlotTypes() {
        return slotTypes;
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     */

    public void setSlotTypes(java.util.Collection<BuiltinSlotTypeMetadata> slotTypes) {
        if (slotTypes == null) {
            this.slotTypes = null;
            return;
        }

        this.slotTypes = new java.util.ArrayList<BuiltinSlotTypeMetadata>(slotTypes);
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypes(java.util.Collection)} or {@link #withSlotTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinSlotTypesResult withSlotTypes(BuiltinSlotTypeMetadata... slotTypes) {
        if (this.slotTypes == null) {
            setSlotTypes(new java.util.ArrayList<BuiltinSlotTypeMetadata>(slotTypes.length));
        }
        for (BuiltinSlotTypeMetadata ele : slotTypes) {
            this.slotTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * </p>
     * 
     * @param slotTypes
     *        An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for each slot type returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinSlotTypesResult withSlotTypes(java.util.Collection<BuiltinSlotTypeMetadata> slotTypes) {
        setSlotTypes(slotTypes);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can use in your next request to
     * fetch the next page of slot types.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the response includes a pagination token that you can use in your next
     *        request to fetch the next page of slot types.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can use in your next request to
     * fetch the next page of slot types.
     * </p>
     * 
     * @return If the response is truncated, the response includes a pagination token that you can use in your next
     *         request to fetch the next page of slot types.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can use in your next request to
     * fetch the next page of slot types.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the response includes a pagination token that you can use in your next
     *        request to fetch the next page of slot types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinSlotTypesResult withNextToken(String nextToken) {
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

        if (obj instanceof GetBuiltinSlotTypesResult == false)
            return false;
        GetBuiltinSlotTypesResult other = (GetBuiltinSlotTypesResult) obj;
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
    public GetBuiltinSlotTypesResult clone() {
        try {
            return (GetBuiltinSlotTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
