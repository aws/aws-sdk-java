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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingPromotions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOfferingPromotionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the offering promotions.
     * </p>
     */
    private java.util.List<OfferingPromotion> offeringPromotions;
    /**
     * <p>
     * An identifier to be used in the next call to this operation, to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the offering promotions.
     * </p>
     * 
     * @return Information about the offering promotions.
     */

    public java.util.List<OfferingPromotion> getOfferingPromotions() {
        return offeringPromotions;
    }

    /**
     * <p>
     * Information about the offering promotions.
     * </p>
     * 
     * @param offeringPromotions
     *        Information about the offering promotions.
     */

    public void setOfferingPromotions(java.util.Collection<OfferingPromotion> offeringPromotions) {
        if (offeringPromotions == null) {
            this.offeringPromotions = null;
            return;
        }

        this.offeringPromotions = new java.util.ArrayList<OfferingPromotion>(offeringPromotions);
    }

    /**
     * <p>
     * Information about the offering promotions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOfferingPromotions(java.util.Collection)} or {@link #withOfferingPromotions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param offeringPromotions
     *        Information about the offering promotions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingPromotionsResult withOfferingPromotions(OfferingPromotion... offeringPromotions) {
        if (this.offeringPromotions == null) {
            setOfferingPromotions(new java.util.ArrayList<OfferingPromotion>(offeringPromotions.length));
        }
        for (OfferingPromotion ele : offeringPromotions) {
            this.offeringPromotions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the offering promotions.
     * </p>
     * 
     * @param offeringPromotions
     *        Information about the offering promotions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingPromotionsResult withOfferingPromotions(java.util.Collection<OfferingPromotion> offeringPromotions) {
        setOfferingPromotions(offeringPromotions);
        return this;
    }

    /**
     * <p>
     * An identifier to be used in the next call to this operation, to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be used in the next call to this operation, to return the next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to be used in the next call to this operation, to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier to be used in the next call to this operation, to return the next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to be used in the next call to this operation, to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be used in the next call to this operation, to return the next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingPromotionsResult withNextToken(String nextToken) {
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
        if (getOfferingPromotions() != null)
            sb.append("OfferingPromotions: ").append(getOfferingPromotions()).append(",");
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

        if (obj instanceof ListOfferingPromotionsResult == false)
            return false;
        ListOfferingPromotionsResult other = (ListOfferingPromotionsResult) obj;
        if (other.getOfferingPromotions() == null ^ this.getOfferingPromotions() == null)
            return false;
        if (other.getOfferingPromotions() != null && other.getOfferingPromotions().equals(this.getOfferingPromotions()) == false)
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

        hashCode = prime * hashCode + ((getOfferingPromotions() == null) ? 0 : getOfferingPromotions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOfferingPromotionsResult clone() {
        try {
            return (ListOfferingPromotionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
