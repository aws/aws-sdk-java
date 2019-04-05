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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to update a <a>SqlInjectionMatchSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSqlInjectionMatchSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSqlInjectionMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     */
    private String sqlInjectionMatchSetId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<SqlInjectionMatchSetUpdate> updates;

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     */

    public void setSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @return The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     *         <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *         <a>ListSqlInjectionMatchSets</a>.
     */

    public String getSqlInjectionMatchSetId() {
        return this.sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        The <code>SqlInjectionMatchSetId</code> of the <code>SqlInjectionMatchSet</code> that you want to update.
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSqlInjectionMatchSetRequest withSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        setSqlInjectionMatchSetId(sqlInjectionMatchSetId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSqlInjectionMatchSetRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     *         <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *         </p>
     *         </li>
     */

    public java.util.List<SqlInjectionMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setUpdates(java.util.Collection<SqlInjectionMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<SqlInjectionMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSqlInjectionMatchSetRequest withUpdates(SqlInjectionMatchSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<SqlInjectionMatchSetUpdate>(updates.length));
        }
        for (SqlInjectionMatchSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>SqlInjectionMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>SqlInjectionMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchSetUpdate</a>: Contains <code>Action</code> and <code>SqlInjectionMatchTuple</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchTuple</a>: Contains <code>FieldToMatch</code> and <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSqlInjectionMatchSetRequest withUpdates(java.util.Collection<SqlInjectionMatchSetUpdate> updates) {
        setUpdates(updates);
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
        if (getSqlInjectionMatchSetId() != null)
            sb.append("SqlInjectionMatchSetId: ").append(getSqlInjectionMatchSetId()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSqlInjectionMatchSetRequest == false)
            return false;
        UpdateSqlInjectionMatchSetRequest other = (UpdateSqlInjectionMatchSetRequest) obj;
        if (other.getSqlInjectionMatchSetId() == null ^ this.getSqlInjectionMatchSetId() == null)
            return false;
        if (other.getSqlInjectionMatchSetId() != null && other.getSqlInjectionMatchSetId().equals(this.getSqlInjectionMatchSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlInjectionMatchSetId() == null) ? 0 : getSqlInjectionMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSqlInjectionMatchSetRequest clone() {
        return (UpdateSqlInjectionMatchSetRequest) super.clone();
    }

}
