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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>Config</code> items.
     * </p>
     */
    private java.util.List<ConfigListItem> configList;
    /**
     * <p>
     * Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>Config</code> items.
     * </p>
     * 
     * @return List of <code>Config</code> items.
     */

    public java.util.List<ConfigListItem> getConfigList() {
        return configList;
    }

    /**
     * <p>
     * List of <code>Config</code> items.
     * </p>
     * 
     * @param configList
     *        List of <code>Config</code> items.
     */

    public void setConfigList(java.util.Collection<ConfigListItem> configList) {
        if (configList == null) {
            this.configList = null;
            return;
        }

        this.configList = new java.util.ArrayList<ConfigListItem>(configList);
    }

    /**
     * <p>
     * List of <code>Config</code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigList(java.util.Collection)} or {@link #withConfigList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param configList
     *        List of <code>Config</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigsResult withConfigList(ConfigListItem... configList) {
        if (this.configList == null) {
            setConfigList(new java.util.ArrayList<ConfigListItem>(configList.length));
        }
        for (ConfigListItem ele : configList) {
            this.configList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>Config</code> items.
     * </p>
     * 
     * @param configList
     *        List of <code>Config</code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigsResult withConfigList(java.util.Collection<ConfigListItem> configList) {
        setConfigList(configList);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page
     *        of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @return Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListConfigs</code> call. Used to get the next page
     *        of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigsResult withNextToken(String nextToken) {
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
        if (getConfigList() != null)
            sb.append("ConfigList: ").append(getConfigList()).append(",");
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

        if (obj instanceof ListConfigsResult == false)
            return false;
        ListConfigsResult other = (ListConfigsResult) obj;
        if (other.getConfigList() == null ^ this.getConfigList() == null)
            return false;
        if (other.getConfigList() != null && other.getConfigList().equals(this.getConfigList()) == false)
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

        hashCode = prime * hashCode + ((getConfigList() == null) ? 0 : getConfigList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigsResult clone() {
        try {
            return (ListConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
