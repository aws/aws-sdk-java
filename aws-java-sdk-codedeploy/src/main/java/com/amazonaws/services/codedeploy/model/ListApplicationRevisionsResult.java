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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListApplicationRevisions operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplicationRevisions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of locations that contain the matching revisions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RevisionLocation> revisions;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * application revisions call to return the next set of application revisions in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of locations that contain the matching revisions.
     * </p>
     * 
     * @return A list of locations that contain the matching revisions.
     */

    public java.util.List<RevisionLocation> getRevisions() {
        if (revisions == null) {
            revisions = new com.amazonaws.internal.SdkInternalList<RevisionLocation>();
        }
        return revisions;
    }

    /**
     * <p>
     * A list of locations that contain the matching revisions.
     * </p>
     * 
     * @param revisions
     *        A list of locations that contain the matching revisions.
     */

    public void setRevisions(java.util.Collection<RevisionLocation> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new com.amazonaws.internal.SdkInternalList<RevisionLocation>(revisions);
    }

    /**
     * <p>
     * A list of locations that contain the matching revisions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisions(java.util.Collection)} or {@link #withRevisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisions
     *        A list of locations that contain the matching revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationRevisionsResult withRevisions(RevisionLocation... revisions) {
        if (this.revisions == null) {
            setRevisions(new com.amazonaws.internal.SdkInternalList<RevisionLocation>(revisions.length));
        }
        for (RevisionLocation ele : revisions) {
            this.revisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of locations that contain the matching revisions.
     * </p>
     * 
     * @param revisions
     *        A list of locations that contain the matching revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationRevisionsResult withRevisions(java.util.Collection<RevisionLocation> revisions) {
        setRevisions(revisions);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * application revisions call to return the next set of application revisions in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list application revisions call to return the next set of application revisions in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * application revisions call to return the next set of application revisions in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent list application revisions call to return the next set of application revisions in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * application revisions call to return the next set of application revisions in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list application revisions call to return the next set of application revisions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationRevisionsResult withNextToken(String nextToken) {
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
        if (getRevisions() != null)
            sb.append("Revisions: ").append(getRevisions()).append(",");
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

        if (obj instanceof ListApplicationRevisionsResult == false)
            return false;
        ListApplicationRevisionsResult other = (ListApplicationRevisionsResult) obj;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false)
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

        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationRevisionsResult clone() {
        try {
            return (ListApplicationRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
