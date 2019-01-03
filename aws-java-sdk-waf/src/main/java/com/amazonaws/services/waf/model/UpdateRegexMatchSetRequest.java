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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexMatchSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRegexMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     */
    private String regexMatchSetId;
    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * </p>
     */
    private java.util.List<RegexMatchSetUpdate> updates;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @return The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     *         <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public String getRegexMatchSetId() {
        return this.regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to update.
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexMatchSetRequest withRegexMatchSetId(String regexMatchSetId) {
        setRegexMatchSetId(regexMatchSetId);
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @return An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     *         <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     */

    public java.util.List<RegexMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     */

    public void setUpdates(java.util.Collection<RegexMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RegexMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexMatchSetRequest withUpdates(RegexMatchSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<RegexMatchSetUpdate>(updates.length));
        }
        for (RegexMatchSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexMatchSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexMatchSet</a>. For more information, see <a>RegexMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexMatchSetRequest withUpdates(java.util.Collection<RegexMatchSetUpdate> updates) {
        setUpdates(updates);
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

    public UpdateRegexMatchSetRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getRegexMatchSetId() != null)
            sb.append("RegexMatchSetId: ").append(getRegexMatchSetId()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRegexMatchSetRequest == false)
            return false;
        UpdateRegexMatchSetRequest other = (UpdateRegexMatchSetRequest) obj;
        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRegexMatchSetRequest clone() {
        return (UpdateRegexMatchSetRequest) super.clone();
    }

}
