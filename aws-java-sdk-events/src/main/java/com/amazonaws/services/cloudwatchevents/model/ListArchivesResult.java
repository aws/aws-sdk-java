/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListArchives" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArchivesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Archive</code> objects that include details about an archive.
     * </p>
     */
    private java.util.List<Archive> archives;
    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Archive</code> objects that include details about an archive.
     * </p>
     * 
     * @return An array of <code>Archive</code> objects that include details about an archive.
     */

    public java.util.List<Archive> getArchives() {
        return archives;
    }

    /**
     * <p>
     * An array of <code>Archive</code> objects that include details about an archive.
     * </p>
     * 
     * @param archives
     *        An array of <code>Archive</code> objects that include details about an archive.
     */

    public void setArchives(java.util.Collection<Archive> archives) {
        if (archives == null) {
            this.archives = null;
            return;
        }

        this.archives = new java.util.ArrayList<Archive>(archives);
    }

    /**
     * <p>
     * An array of <code>Archive</code> objects that include details about an archive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchives(java.util.Collection)} or {@link #withArchives(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param archives
     *        An array of <code>Archive</code> objects that include details about an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchivesResult withArchives(Archive... archives) {
        if (this.archives == null) {
            setArchives(new java.util.ArrayList<Archive>(archives.length));
        }
        for (Archive ele : archives) {
            this.archives.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Archive</code> objects that include details about an archive.
     * </p>
     * 
     * @param archives
     *        An array of <code>Archive</code> objects that include details about an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchivesResult withArchives(java.util.Collection<Archive> archives) {
        setArchives(archives);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @return The token returned by a previous call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchivesResult withNextToken(String nextToken) {
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
        if (getArchives() != null)
            sb.append("Archives: ").append(getArchives()).append(",");
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

        if (obj instanceof ListArchivesResult == false)
            return false;
        ListArchivesResult other = (ListArchivesResult) obj;
        if (other.getArchives() == null ^ this.getArchives() == null)
            return false;
        if (other.getArchives() != null && other.getArchives().equals(this.getArchives()) == false)
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

        hashCode = prime * hashCode + ((getArchives() == null) ? 0 : getArchives().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListArchivesResult clone() {
        try {
            return (ListArchivesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
