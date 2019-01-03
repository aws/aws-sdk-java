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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSmartHomeAppliancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The smart home appliances.
     * </p>
     */
    private java.util.List<SmartHomeAppliance> smartHomeAppliances;
    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * 
     * @return The smart home appliances.
     */

    public java.util.List<SmartHomeAppliance> getSmartHomeAppliances() {
        return smartHomeAppliances;
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * 
     * @param smartHomeAppliances
     *        The smart home appliances.
     */

    public void setSmartHomeAppliances(java.util.Collection<SmartHomeAppliance> smartHomeAppliances) {
        if (smartHomeAppliances == null) {
            this.smartHomeAppliances = null;
            return;
        }

        this.smartHomeAppliances = new java.util.ArrayList<SmartHomeAppliance>(smartHomeAppliances);
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSmartHomeAppliances(java.util.Collection)} or {@link #withSmartHomeAppliances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param smartHomeAppliances
     *        The smart home appliances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesResult withSmartHomeAppliances(SmartHomeAppliance... smartHomeAppliances) {
        if (this.smartHomeAppliances == null) {
            setSmartHomeAppliances(new java.util.ArrayList<SmartHomeAppliance>(smartHomeAppliances.length));
        }
        for (SmartHomeAppliance ele : smartHomeAppliances) {
            this.smartHomeAppliances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * 
     * @param smartHomeAppliances
     *        The smart home appliances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesResult withSmartHomeAppliances(java.util.Collection<SmartHomeAppliance> smartHomeAppliances) {
        setSmartHomeAppliances(smartHomeAppliances);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @return The tokens used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesResult withNextToken(String nextToken) {
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
        if (getSmartHomeAppliances() != null)
            sb.append("SmartHomeAppliances: ").append(getSmartHomeAppliances()).append(",");
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

        if (obj instanceof ListSmartHomeAppliancesResult == false)
            return false;
        ListSmartHomeAppliancesResult other = (ListSmartHomeAppliancesResult) obj;
        if (other.getSmartHomeAppliances() == null ^ this.getSmartHomeAppliances() == null)
            return false;
        if (other.getSmartHomeAppliances() != null && other.getSmartHomeAppliances().equals(this.getSmartHomeAppliances()) == false)
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

        hashCode = prime * hashCode + ((getSmartHomeAppliances() == null) ? 0 : getSmartHomeAppliances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSmartHomeAppliancesResult clone() {
        try {
            return (ListSmartHomeAppliancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
