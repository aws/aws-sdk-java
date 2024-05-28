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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprintConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentBlueprintConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * </p>
     */
    private java.util.List<EnvironmentBlueprintConfigurationItem> items;
    /**
     * <p>
     * When the number of blueprint configurations is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * configurations, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentBlueprintConfigurations</code> to list
     * the next set of configurations.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * </p>
     * 
     * @return The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     */

    public java.util.List<EnvironmentBlueprintConfigurationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * </p>
     * 
     * @param items
     *        The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     */

    public void setItems(java.util.Collection<EnvironmentBlueprintConfigurationItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EnvironmentBlueprintConfigurationItem>(items);
    }

    /**
     * <p>
     * The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintConfigurationsResult withItems(EnvironmentBlueprintConfigurationItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<EnvironmentBlueprintConfigurationItem>(items.length));
        }
        for (EnvironmentBlueprintConfigurationItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * </p>
     * 
     * @param items
     *        The results of the <code>ListEnvironmentBlueprintConfigurations</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintConfigurationsResult withItems(java.util.Collection<EnvironmentBlueprintConfigurationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * When the number of blueprint configurations is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * configurations, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentBlueprintConfigurations</code> to list
     * the next set of configurations.
     * </p>
     * 
     * @param nextToken
     *        When the number of blueprint configurations is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of configurations, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListEnvironmentBlueprintConfigurations</code> to list the next set of configurations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of blueprint configurations is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * configurations, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentBlueprintConfigurations</code> to list
     * the next set of configurations.
     * </p>
     * 
     * @return When the number of blueprint configurations is greater than the default value for the
     *         <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *         is less than the number of configurations, the response includes a pagination token named
     *         <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *         <code>ListEnvironmentBlueprintConfigurations</code> to list the next set of configurations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of blueprint configurations is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * configurations, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentBlueprintConfigurations</code> to list
     * the next set of configurations.
     * </p>
     * 
     * @param nextToken
     *        When the number of blueprint configurations is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of configurations, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListEnvironmentBlueprintConfigurations</code> to list the next set of configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintConfigurationsResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListEnvironmentBlueprintConfigurationsResult == false)
            return false;
        ListEnvironmentBlueprintConfigurationsResult other = (ListEnvironmentBlueprintConfigurationsResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentBlueprintConfigurationsResult clone() {
        try {
            return (ListEnvironmentBlueprintConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
