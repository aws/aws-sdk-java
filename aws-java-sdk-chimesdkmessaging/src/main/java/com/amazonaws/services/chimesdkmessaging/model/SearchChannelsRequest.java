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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchChannels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchChannelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user making the API call.
     * </p>
     */
    private String chimeBearer;
    /**
     * <p>
     * A list of the <code>Field</code> objects in the channel being searched.
     * </p>
     */
    private java.util.List<SearchField> fields;
    /**
     * <p>
     * The maximum number of channels that you want returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from previous API requests until the number of channels is reached.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user making the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user making the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user making the API call.
     * </p>
     * 
     * @return The <code>AppInstanceUserArn</code> of the user making the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user making the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user making the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchChannelsRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
        return this;
    }

    /**
     * <p>
     * A list of the <code>Field</code> objects in the channel being searched.
     * </p>
     * 
     * @return A list of the <code>Field</code> objects in the channel being searched.
     */

    public java.util.List<SearchField> getFields() {
        return fields;
    }

    /**
     * <p>
     * A list of the <code>Field</code> objects in the channel being searched.
     * </p>
     * 
     * @param fields
     *        A list of the <code>Field</code> objects in the channel being searched.
     */

    public void setFields(java.util.Collection<SearchField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<SearchField>(fields);
    }

    /**
     * <p>
     * A list of the <code>Field</code> objects in the channel being searched.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of the <code>Field</code> objects in the channel being searched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchChannelsRequest withFields(SearchField... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<SearchField>(fields.length));
        }
        for (SearchField ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>Field</code> objects in the channel being searched.
     * </p>
     * 
     * @param fields
     *        A list of the <code>Field</code> objects in the channel being searched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchChannelsRequest withFields(java.util.Collection<SearchField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The maximum number of channels that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channels that you want returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channels that you want returned.
     * </p>
     * 
     * @return The maximum number of channels that you want returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of channels that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channels that you want returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchChannelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channels is reached.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels is reached.
     * </p>
     * 
     * @return The token returned from previous API requests until the number of channels is reached.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channels is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchChannelsRequest withNextToken(String nextToken) {
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
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchChannelsRequest == false)
            return false;
        SearchChannelsRequest other = (SearchChannelsRequest) obj;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchChannelsRequest clone() {
        return (SearchChannelsRequest) super.clone();
    }

}
