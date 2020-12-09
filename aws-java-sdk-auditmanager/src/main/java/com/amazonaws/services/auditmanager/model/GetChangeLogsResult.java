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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangeLogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of user activity for the control.
     * </p>
     */
    private java.util.List<ChangeLog> changeLogs;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of user activity for the control.
     * </p>
     * 
     * @return The list of user activity for the control.
     */

    public java.util.List<ChangeLog> getChangeLogs() {
        return changeLogs;
    }

    /**
     * <p>
     * The list of user activity for the control.
     * </p>
     * 
     * @param changeLogs
     *        The list of user activity for the control.
     */

    public void setChangeLogs(java.util.Collection<ChangeLog> changeLogs) {
        if (changeLogs == null) {
            this.changeLogs = null;
            return;
        }

        this.changeLogs = new java.util.ArrayList<ChangeLog>(changeLogs);
    }

    /**
     * <p>
     * The list of user activity for the control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeLogs(java.util.Collection)} or {@link #withChangeLogs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param changeLogs
     *        The list of user activity for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsResult withChangeLogs(ChangeLog... changeLogs) {
        if (this.changeLogs == null) {
            setChangeLogs(new java.util.ArrayList<ChangeLog>(changeLogs.length));
        }
        for (ChangeLog ele : changeLogs) {
            this.changeLogs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user activity for the control.
     * </p>
     * 
     * @param changeLogs
     *        The list of user activity for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsResult withChangeLogs(java.util.Collection<ChangeLog> changeLogs) {
        setChangeLogs(changeLogs);
        return this;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsResult withNextToken(String nextToken) {
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
        if (getChangeLogs() != null)
            sb.append("ChangeLogs: ").append(getChangeLogs()).append(",");
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

        if (obj instanceof GetChangeLogsResult == false)
            return false;
        GetChangeLogsResult other = (GetChangeLogsResult) obj;
        if (other.getChangeLogs() == null ^ this.getChangeLogs() == null)
            return false;
        if (other.getChangeLogs() != null && other.getChangeLogs().equals(this.getChangeLogs()) == false)
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

        hashCode = prime * hashCode + ((getChangeLogs() == null) ? 0 : getChangeLogs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetChangeLogsResult clone() {
        try {
            return (GetChangeLogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
