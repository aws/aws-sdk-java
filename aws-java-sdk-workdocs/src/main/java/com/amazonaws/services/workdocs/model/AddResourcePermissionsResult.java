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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddResourcePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The share results.
     * </p>
     */
    private java.util.List<ShareResult> shareResults;

    /**
     * <p>
     * The share results.
     * </p>
     * 
     * @return The share results.
     */

    public java.util.List<ShareResult> getShareResults() {
        return shareResults;
    }

    /**
     * <p>
     * The share results.
     * </p>
     * 
     * @param shareResults
     *        The share results.
     */

    public void setShareResults(java.util.Collection<ShareResult> shareResults) {
        if (shareResults == null) {
            this.shareResults = null;
            return;
        }

        this.shareResults = new java.util.ArrayList<ShareResult>(shareResults);
    }

    /**
     * <p>
     * The share results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareResults(java.util.Collection)} or {@link #withShareResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param shareResults
     *        The share results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsResult withShareResults(ShareResult... shareResults) {
        if (this.shareResults == null) {
            setShareResults(new java.util.ArrayList<ShareResult>(shareResults.length));
        }
        for (ShareResult ele : shareResults) {
            this.shareResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The share results.
     * </p>
     * 
     * @param shareResults
     *        The share results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsResult withShareResults(java.util.Collection<ShareResult> shareResults) {
        setShareResults(shareResults);
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
        if (getShareResults() != null)
            sb.append("ShareResults: ").append(getShareResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddResourcePermissionsResult == false)
            return false;
        AddResourcePermissionsResult other = (AddResourcePermissionsResult) obj;
        if (other.getShareResults() == null ^ this.getShareResults() == null)
            return false;
        if (other.getShareResults() != null && other.getShareResults().equals(this.getShareResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareResults() == null) ? 0 : getShareResults().hashCode());
        return hashCode;
    }

    @Override
    public AddResourcePermissionsResult clone() {
        try {
            return (AddResourcePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
