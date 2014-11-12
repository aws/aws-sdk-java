/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the GetResourceConfigHistory action.
 * </p>
 */
public class GetResourceConfigHistoryResult implements Serializable {

    /**
     * A list that contains the configuration history of one or more
     * resources.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem> configurationItems;

    /**
     * A token used for pagination of results.
     */
    private String nextToken;

    /**
     * A list that contains the configuration history of one or more
     * resources.
     *
     * @return A list that contains the configuration history of one or more
     *         resources.
     */
    public java.util.List<ConfigurationItem> getConfigurationItems() {
        if (configurationItems == null) {
              configurationItems = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem>();
              configurationItems.setAutoConstruct(true);
        }
        return configurationItems;
    }
    
    /**
     * A list that contains the configuration history of one or more
     * resources.
     *
     * @param configurationItems A list that contains the configuration history of one or more
     *         resources.
     */
    public void setConfigurationItems(java.util.Collection<ConfigurationItem> configurationItems) {
        if (configurationItems == null) {
            this.configurationItems = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem> configurationItemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem>(configurationItems.size());
        configurationItemsCopy.addAll(configurationItems);
        this.configurationItems = configurationItemsCopy;
    }
    
    /**
     * A list that contains the configuration history of one or more
     * resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationItems A list that contains the configuration history of one or more
     *         resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryResult withConfigurationItems(ConfigurationItem... configurationItems) {
        if (getConfigurationItems() == null) setConfigurationItems(new java.util.ArrayList<ConfigurationItem>(configurationItems.length));
        for (ConfigurationItem value : configurationItems) {
            getConfigurationItems().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains the configuration history of one or more
     * resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationItems A list that contains the configuration history of one or more
     *         resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryResult withConfigurationItems(java.util.Collection<ConfigurationItem> configurationItems) {
        if (configurationItems == null) {
            this.configurationItems = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem> configurationItemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationItem>(configurationItems.size());
            configurationItemsCopy.addAll(configurationItems);
            this.configurationItems = configurationItemsCopy;
        }

        return this;
    }

    /**
     * A token used for pagination of results.
     *
     * @return A token used for pagination of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A token used for pagination of results.
     *
     * @param nextToken A token used for pagination of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A token used for pagination of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token used for pagination of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationItems() != null) sb.append("ConfigurationItems: " + getConfigurationItems() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationItems() == null) ? 0 : getConfigurationItems().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetResourceConfigHistoryResult == false) return false;
        GetResourceConfigHistoryResult other = (GetResourceConfigHistoryResult)obj;
        
        if (other.getConfigurationItems() == null ^ this.getConfigurationItems() == null) return false;
        if (other.getConfigurationItems() != null && other.getConfigurationItems().equals(this.getConfigurationItems()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    