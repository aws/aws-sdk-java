/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetSetupHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSetupHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The historical information that's returned.
     * </p>
     */
    private java.util.List<SetupHistory> setupHistory;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next page
     * token using the pageToken parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The historical information that's returned.
     * </p>
     * 
     * @return The historical information that's returned.
     */

    public java.util.List<SetupHistory> getSetupHistory() {
        return setupHistory;
    }

    /**
     * <p>
     * The historical information that's returned.
     * </p>
     * 
     * @param setupHistory
     *        The historical information that's returned.
     */

    public void setSetupHistory(java.util.Collection<SetupHistory> setupHistory) {
        if (setupHistory == null) {
            this.setupHistory = null;
            return;
        }

        this.setupHistory = new java.util.ArrayList<SetupHistory>(setupHistory);
    }

    /**
     * <p>
     * The historical information that's returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSetupHistory(java.util.Collection)} or {@link #withSetupHistory(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param setupHistory
     *        The historical information that's returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSetupHistoryResult withSetupHistory(SetupHistory... setupHistory) {
        if (this.setupHistory == null) {
            setSetupHistory(new java.util.ArrayList<SetupHistory>(setupHistory.length));
        }
        for (SetupHistory ele : setupHistory) {
            this.setupHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The historical information that's returned.
     * </p>
     * 
     * @param setupHistory
     *        The historical information that's returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSetupHistoryResult withSetupHistory(java.util.Collection<SetupHistory> setupHistory) {
        setSetupHistory(setupHistory);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next page
     * token using the pageToken parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next
     *        page token using the pageToken parameter.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next page
     * token using the pageToken parameter.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         A next page token is not returned if there are no more results to display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the
     *         next page token using the pageToken parameter.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next page
     * token using the pageToken parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetSetupHistory</code> request and specify the next
     *        page token using the pageToken parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSetupHistoryResult withNextPageToken(String nextPageToken) {
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
        if (getSetupHistory() != null)
            sb.append("SetupHistory: ").append(getSetupHistory()).append(",");
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

        if (obj instanceof GetSetupHistoryResult == false)
            return false;
        GetSetupHistoryResult other = (GetSetupHistoryResult) obj;
        if (other.getSetupHistory() == null ^ this.getSetupHistory() == null)
            return false;
        if (other.getSetupHistory() != null && other.getSetupHistory().equals(this.getSetupHistory()) == false)
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

        hashCode = prime * hashCode + ((getSetupHistory() == null) ? 0 : getSetupHistory().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSetupHistoryResult clone() {
        try {
            return (GetSetupHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
