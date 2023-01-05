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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListBlueprints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBlueprintsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of names of blueprints in the account.
     * </p>
     */
    private java.util.List<String> blueprints;
    /**
     * <p>
     * A continuation token, if not all blueprint names have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of names of blueprints in the account.
     * </p>
     * 
     * @return List of names of blueprints in the account.
     */

    public java.util.List<String> getBlueprints() {
        return blueprints;
    }

    /**
     * <p>
     * List of names of blueprints in the account.
     * </p>
     * 
     * @param blueprints
     *        List of names of blueprints in the account.
     */

    public void setBlueprints(java.util.Collection<String> blueprints) {
        if (blueprints == null) {
            this.blueprints = null;
            return;
        }

        this.blueprints = new java.util.ArrayList<String>(blueprints);
    }

    /**
     * <p>
     * List of names of blueprints in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueprints(java.util.Collection)} or {@link #withBlueprints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blueprints
     *        List of names of blueprints in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBlueprintsResult withBlueprints(String... blueprints) {
        if (this.blueprints == null) {
            setBlueprints(new java.util.ArrayList<String>(blueprints.length));
        }
        for (String ele : blueprints) {
            this.blueprints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names of blueprints in the account.
     * </p>
     * 
     * @param blueprints
     *        List of names of blueprints in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBlueprintsResult withBlueprints(java.util.Collection<String> blueprints) {
        setBlueprints(blueprints);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint names have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all blueprint names have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint names have been returned.
     * </p>
     * 
     * @return A continuation token, if not all blueprint names have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint names have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all blueprint names have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBlueprintsResult withNextToken(String nextToken) {
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
        if (getBlueprints() != null)
            sb.append("Blueprints: ").append(getBlueprints()).append(",");
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

        if (obj instanceof ListBlueprintsResult == false)
            return false;
        ListBlueprintsResult other = (ListBlueprintsResult) obj;
        if (other.getBlueprints() == null ^ this.getBlueprints() == null)
            return false;
        if (other.getBlueprints() != null && other.getBlueprints().equals(this.getBlueprints()) == false)
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

        hashCode = prime * hashCode + ((getBlueprints() == null) ? 0 : getBlueprints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBlueprintsResult clone() {
        try {
            return (ListBlueprintsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
