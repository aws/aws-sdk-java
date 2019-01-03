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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListAccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Setting> settings;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     * results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * 
     * @return The account settings for the resource.
     */

    public java.util.List<Setting> getSettings() {
        if (settings == null) {
            settings = new com.amazonaws.internal.SdkInternalList<Setting>();
        }
        return settings;
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * 
     * @param settings
     *        The account settings for the resource.
     */

    public void setSettings(java.util.Collection<Setting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new com.amazonaws.internal.SdkInternalList<Setting>(settings);
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        The account settings for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsResult withSettings(Setting... settings) {
        if (this.settings == null) {
            setSettings(new com.amazonaws.internal.SdkInternalList<Setting>(settings.length));
        }
        for (Setting ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * 
     * @param settings
     *        The account settings for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsResult withSettings(java.util.Collection<Setting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     * results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     *        results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     * results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When
     *         the results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can
     *         be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     * results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListAccountSettings</code> request. When the
     *        results of a <code>ListAccountSettings</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsResult withNextToken(String nextToken) {
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
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
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

        if (obj instanceof ListAccountSettingsResult == false)
            return false;
        ListAccountSettingsResult other = (ListAccountSettingsResult) obj;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
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

        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountSettingsResult clone() {
        try {
            return (ListAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
