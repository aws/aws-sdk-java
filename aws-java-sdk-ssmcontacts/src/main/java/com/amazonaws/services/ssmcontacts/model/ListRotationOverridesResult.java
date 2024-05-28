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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListRotationOverrides" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRotationOverridesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of rotation overrides in the specified time range.
     * </p>
     */
    private java.util.List<RotationOverride> rotationOverrides;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of rotation overrides in the specified time range.
     * </p>
     * 
     * @return A list of rotation overrides in the specified time range.
     */

    public java.util.List<RotationOverride> getRotationOverrides() {
        return rotationOverrides;
    }

    /**
     * <p>
     * A list of rotation overrides in the specified time range.
     * </p>
     * 
     * @param rotationOverrides
     *        A list of rotation overrides in the specified time range.
     */

    public void setRotationOverrides(java.util.Collection<RotationOverride> rotationOverrides) {
        if (rotationOverrides == null) {
            this.rotationOverrides = null;
            return;
        }

        this.rotationOverrides = new java.util.ArrayList<RotationOverride>(rotationOverrides);
    }

    /**
     * <p>
     * A list of rotation overrides in the specified time range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRotationOverrides(java.util.Collection)} or {@link #withRotationOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param rotationOverrides
     *        A list of rotation overrides in the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationOverridesResult withRotationOverrides(RotationOverride... rotationOverrides) {
        if (this.rotationOverrides == null) {
            setRotationOverrides(new java.util.ArrayList<RotationOverride>(rotationOverrides.length));
        }
        for (RotationOverride ele : rotationOverrides) {
            this.rotationOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of rotation overrides in the specified time range.
     * </p>
     * 
     * @param rotationOverrides
     *        A list of rotation overrides in the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationOverridesResult withRotationOverrides(java.util.Collection<RotationOverride> rotationOverrides) {
        setRotationOverrides(rotationOverrides);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationOverridesResult withNextToken(String nextToken) {
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
        if (getRotationOverrides() != null)
            sb.append("RotationOverrides: ").append(getRotationOverrides()).append(",");
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

        if (obj instanceof ListRotationOverridesResult == false)
            return false;
        ListRotationOverridesResult other = (ListRotationOverridesResult) obj;
        if (other.getRotationOverrides() == null ^ this.getRotationOverrides() == null)
            return false;
        if (other.getRotationOverrides() != null && other.getRotationOverrides().equals(this.getRotationOverrides()) == false)
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

        hashCode = prime * hashCode + ((getRotationOverrides() == null) ? 0 : getRotationOverrides().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRotationOverridesResult clone() {
        try {
            return (ListRotationOverridesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
