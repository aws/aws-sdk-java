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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexPatternSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRegexPatternSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     */
    private String regexPatternSetId;
    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexPatternSet</a>.
     * </p>
     */
    private java.util.List<RegexPatternSetUpdate> updates;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     */

    public void setRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @return The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     *         <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *         <a>ListRegexPatternSets</a>.
     */

    public String getRegexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to update.
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexPatternSetRequest withRegexPatternSetId(String regexPatternSetId) {
        setRegexPatternSetId(regexPatternSetId);
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexPatternSet</a>.
     * </p>
     * 
     * @return An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     *         <a>RegexPatternSet</a>.
     */

    public java.util.List<RegexPatternSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexPatternSet</a>.
     */

    public void setUpdates(java.util.Collection<RegexPatternSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RegexPatternSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexPatternSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexPatternSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexPatternSetRequest withUpdates(RegexPatternSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<RegexPatternSetUpdate>(updates.length));
        }
        for (RegexPatternSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     * <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RegexPatternSetUpdate</code> objects that you want to insert into or delete from a
     *        <a>RegexPatternSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexPatternSetRequest withUpdates(java.util.Collection<RegexPatternSetUpdate> updates) {
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

    public UpdateRegexPatternSetRequest withChangeToken(String changeToken) {
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
        if (getRegexPatternSetId() != null)
            sb.append("RegexPatternSetId: ").append(getRegexPatternSetId()).append(",");
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

        if (obj instanceof UpdateRegexPatternSetRequest == false)
            return false;
        UpdateRegexPatternSetRequest other = (UpdateRegexPatternSetRequest) obj;
        if (other.getRegexPatternSetId() == null ^ this.getRegexPatternSetId() == null)
            return false;
        if (other.getRegexPatternSetId() != null && other.getRegexPatternSetId().equals(this.getRegexPatternSetId()) == false)
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

        hashCode = prime * hashCode + ((getRegexPatternSetId() == null) ? 0 : getRegexPatternSetId().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRegexPatternSetRequest clone() {
        return (UpdateRegexPatternSetRequest) super.clone();
    }

}
