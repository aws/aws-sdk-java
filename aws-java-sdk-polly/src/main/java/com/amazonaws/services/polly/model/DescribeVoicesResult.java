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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVoicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     */
    private java.util.List<Voice> voices;
    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * 
     * @return A list of voices with their properties.
     */

    public java.util.List<Voice> getVoices() {
        return voices;
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * 
     * @param voices
     *        A list of voices with their properties.
     */

    public void setVoices(java.util.Collection<Voice> voices) {
        if (voices == null) {
            this.voices = null;
            return;
        }

        this.voices = new java.util.ArrayList<Voice>(voices);
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoices(java.util.Collection)} or {@link #withVoices(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param voices
     *        A list of voices with their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVoicesResult withVoices(Voice... voices) {
        if (this.voices == null) {
            setVoices(new java.util.ArrayList<Voice>(voices.length));
        }
        for (Voice ele : voices) {
            this.voices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * 
     * @param voices
     *        A list of voices with their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVoicesResult withVoices(java.util.Collection<Voice> voices) {
        setVoices(voices);
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code>
     *        is returned only if the response is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @return The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code>
     *         is returned only if the response is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of voices. <code>NextToken</code>
     *        is returned only if the response is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVoicesResult withNextToken(String nextToken) {
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
        if (getVoices() != null)
            sb.append("Voices: ").append(getVoices()).append(",");
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

        if (obj instanceof DescribeVoicesResult == false)
            return false;
        DescribeVoicesResult other = (DescribeVoicesResult) obj;
        if (other.getVoices() == null ^ this.getVoices() == null)
            return false;
        if (other.getVoices() != null && other.getVoices().equals(this.getVoices()) == false)
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

        hashCode = prime * hashCode + ((getVoices() == null) ? 0 : getVoices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVoicesResult clone() {
        try {
            return (DescribeVoicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
