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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetActiveNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     */
    private java.util.List<String> activeNames;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * 
     * @return The list of active names returned by the get active names request.
     */

    public java.util.List<String> getActiveNames() {
        return activeNames;
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * 
     * @param activeNames
     *        The list of active names returned by the get active names request.
     */

    public void setActiveNames(java.util.Collection<String> activeNames) {
        if (activeNames == null) {
            this.activeNames = null;
            return;
        }

        this.activeNames = new java.util.ArrayList<String>(activeNames);
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveNames(java.util.Collection)} or {@link #withActiveNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param activeNames
     *        The list of active names returned by the get active names request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActiveNamesResult withActiveNames(String... activeNames) {
        if (this.activeNames == null) {
            setActiveNames(new java.util.ArrayList<String>(activeNames.length));
        }
        for (String ele : activeNames) {
            this.activeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * 
     * @param activeNames
     *        The list of active names returned by the get active names request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActiveNamesResult withActiveNames(java.util.Collection<String> activeNames) {
        setActiveNames(activeNames);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get active names request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get active names request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get active names request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActiveNamesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getActiveNames() != null)
            sb.append("ActiveNames: ").append(getActiveNames()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetActiveNamesResult == false)
            return false;
        GetActiveNamesResult other = (GetActiveNamesResult) obj;
        if (other.getActiveNames() == null ^ this.getActiveNames() == null)
            return false;
        if (other.getActiveNames() != null && other.getActiveNames().equals(this.getActiveNames()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveNames() == null) ? 0 : getActiveNames().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetActiveNamesResult clone() {
        try {
            return (GetActiveNamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
