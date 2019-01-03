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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs that contains information about the available blueprints.
     * </p>
     */
    private java.util.List<Blueprint> blueprints;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get blueprints request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs that contains information about the available blueprints.
     * </p>
     * 
     * @return An array of key-value pairs that contains information about the available blueprints.
     */

    public java.util.List<Blueprint> getBlueprints() {
        return blueprints;
    }

    /**
     * <p>
     * An array of key-value pairs that contains information about the available blueprints.
     * </p>
     * 
     * @param blueprints
     *        An array of key-value pairs that contains information about the available blueprints.
     */

    public void setBlueprints(java.util.Collection<Blueprint> blueprints) {
        if (blueprints == null) {
            this.blueprints = null;
            return;
        }

        this.blueprints = new java.util.ArrayList<Blueprint>(blueprints);
    }

    /**
     * <p>
     * An array of key-value pairs that contains information about the available blueprints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueprints(java.util.Collection)} or {@link #withBlueprints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blueprints
     *        An array of key-value pairs that contains information about the available blueprints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintsResult withBlueprints(Blueprint... blueprints) {
        if (this.blueprints == null) {
            setBlueprints(new java.util.ArrayList<Blueprint>(blueprints.length));
        }
        for (Blueprint ele : blueprints) {
            this.blueprints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contains information about the available blueprints.
     * </p>
     * 
     * @param blueprints
     *        An array of key-value pairs that contains information about the available blueprints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintsResult withBlueprints(java.util.Collection<Blueprint> blueprints) {
        setBlueprints(blueprints);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get blueprints request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get blueprints request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get blueprints request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get blueprints request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get blueprints request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get blueprints request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintsResult withNextPageToken(String nextPageToken) {
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
        if (getBlueprints() != null)
            sb.append("Blueprints: ").append(getBlueprints()).append(",");
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

        if (obj instanceof GetBlueprintsResult == false)
            return false;
        GetBlueprintsResult other = (GetBlueprintsResult) obj;
        if (other.getBlueprints() == null ^ this.getBlueprints() == null)
            return false;
        if (other.getBlueprints() != null && other.getBlueprints().equals(this.getBlueprints()) == false)
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

        hashCode = prime * hashCode + ((getBlueprints() == null) ? 0 : getBlueprints().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintsResult clone() {
        try {
            return (GetBlueprintsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
