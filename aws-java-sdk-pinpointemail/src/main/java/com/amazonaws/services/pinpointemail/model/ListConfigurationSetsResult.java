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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of configuration sets in your Amazon Pinpoint account in the current AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListConfigurationSets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     */
    private java.util.List<String> configurationSets;
    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @return An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS
     *         Region.
     */

    public java.util.List<String> getConfigurationSets() {
        return configurationSets;
    }

    /**
     * <p>
     * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param configurationSets
     *        An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS
     *        Region.
     */

    public void setConfigurationSets(java.util.Collection<String> configurationSets) {
        if (configurationSets == null) {
            this.configurationSets = null;
            return;
        }

        this.configurationSets = new java.util.ArrayList<String>(configurationSets);
    }

    /**
     * <p>
     * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationSets(java.util.Collection)} or {@link #withConfigurationSets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param configurationSets
     *        An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsResult withConfigurationSets(String... configurationSets) {
        if (this.configurationSets == null) {
            setConfigurationSets(new java.util.ArrayList<String>(configurationSets.length));
        }
        for (String ele : configurationSets) {
            this.configurationSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param configurationSets
     *        An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsResult withConfigurationSets(java.util.Collection<String> configurationSets) {
        setConfigurationSets(configurationSets);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional configuration sets to list. To view additional
     *        configuration sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in
     *        the <code>NextToken</code> parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @return A token that indicates that there are additional configuration sets to list. To view additional
     *         configuration sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in
     *         the <code>NextToken</code> parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional configuration sets to list. To view additional
     *        configuration sets, issue another request to <code>ListConfigurationSets</code>, and pass this token in
     *        the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsResult withNextToken(String nextToken) {
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
        if (getConfigurationSets() != null)
            sb.append("ConfigurationSets: ").append(getConfigurationSets()).append(",");
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

        if (obj instanceof ListConfigurationSetsResult == false)
            return false;
        ListConfigurationSetsResult other = (ListConfigurationSetsResult) obj;
        if (other.getConfigurationSets() == null ^ this.getConfigurationSets() == null)
            return false;
        if (other.getConfigurationSets() != null && other.getConfigurationSets().equals(this.getConfigurationSets()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationSets() == null) ? 0 : getConfigurationSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationSetsResult clone() {
        try {
            return (ListConfigurationSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
