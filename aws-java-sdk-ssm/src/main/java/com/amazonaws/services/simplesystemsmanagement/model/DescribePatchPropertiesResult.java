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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the properties for patches matching the filter request parameters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> properties;
    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the properties for patches matching the filter request parameters.
     * </p>
     * 
     * @return A list of the properties for patches matching the filter request parameters.
     */

    public java.util.List<java.util.Map<String, String>> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>();
        }
        return properties;
    }

    /**
     * <p>
     * A list of the properties for patches matching the filter request parameters.
     * </p>
     * 
     * @param properties
     *        A list of the properties for patches matching the filter request parameters.
     */

    public void setProperties(java.util.Collection<java.util.Map<String, String>> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(properties);
    }

    /**
     * <p>
     * A list of the properties for patches matching the filter request parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        A list of the properties for patches matching the filter request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchPropertiesResult withProperties(java.util.Map<String, String>... properties) {
        if (this.properties == null) {
            setProperties(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(properties.length));
        }
        for (java.util.Map<String, String> ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the properties for patches matching the filter request parameters.
     * </p>
     * 
     * @param properties
     *        A list of the properties for patches matching the filter request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchPropertiesResult withProperties(java.util.Collection<java.util.Map<String, String>> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You use this token in the next call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchPropertiesResult withNextToken(String nextToken) {
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
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
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

        if (obj instanceof DescribePatchPropertiesResult == false)
            return false;
        DescribePatchPropertiesResult other = (DescribePatchPropertiesResult) obj;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
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

        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchPropertiesResult clone() {
        try {
            return (DescribePatchPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
