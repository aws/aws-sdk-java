/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Gets the category of test case.
     * </p>
     */
    private java.util.List<TestCaseCategory> categories;
    /**
     * <p>
     * Gets the configuration of root test group.
     * </p>
     */
    private java.util.Map<String, String> rootGroupConfiguration;
    /**
     * <p>
     * Gets the configuration of test group.
     * </p>
     */
    private java.util.Map<String, String> groupConfiguration;
    /**
     * <p>
     * Test cases next token response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Gets the category of test case.
     * </p>
     * 
     * @return Gets the category of test case.
     */

    public java.util.List<TestCaseCategory> getCategories() {
        return categories;
    }

    /**
     * <p>
     * Gets the category of test case.
     * </p>
     * 
     * @param categories
     *        Gets the category of test case.
     */

    public void setCategories(java.util.Collection<TestCaseCategory> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<TestCaseCategory>(categories);
    }

    /**
     * <p>
     * Gets the category of test case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        Gets the category of test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withCategories(TestCaseCategory... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<TestCaseCategory>(categories.length));
        }
        for (TestCaseCategory ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Gets the category of test case.
     * </p>
     * 
     * @param categories
     *        Gets the category of test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withCategories(java.util.Collection<TestCaseCategory> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * Gets the configuration of root test group.
     * </p>
     * 
     * @return Gets the configuration of root test group.
     */

    public java.util.Map<String, String> getRootGroupConfiguration() {
        return rootGroupConfiguration;
    }

    /**
     * <p>
     * Gets the configuration of root test group.
     * </p>
     * 
     * @param rootGroupConfiguration
     *        Gets the configuration of root test group.
     */

    public void setRootGroupConfiguration(java.util.Map<String, String> rootGroupConfiguration) {
        this.rootGroupConfiguration = rootGroupConfiguration;
    }

    /**
     * <p>
     * Gets the configuration of root test group.
     * </p>
     * 
     * @param rootGroupConfiguration
     *        Gets the configuration of root test group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withRootGroupConfiguration(java.util.Map<String, String> rootGroupConfiguration) {
        setRootGroupConfiguration(rootGroupConfiguration);
        return this;
    }

    /**
     * Add a single RootGroupConfiguration entry
     *
     * @see ListTestCasesResult#withRootGroupConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult addRootGroupConfigurationEntry(String key, String value) {
        if (null == this.rootGroupConfiguration) {
            this.rootGroupConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.rootGroupConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.rootGroupConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RootGroupConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult clearRootGroupConfigurationEntries() {
        this.rootGroupConfiguration = null;
        return this;
    }

    /**
     * <p>
     * Gets the configuration of test group.
     * </p>
     * 
     * @return Gets the configuration of test group.
     */

    public java.util.Map<String, String> getGroupConfiguration() {
        return groupConfiguration;
    }

    /**
     * <p>
     * Gets the configuration of test group.
     * </p>
     * 
     * @param groupConfiguration
     *        Gets the configuration of test group.
     */

    public void setGroupConfiguration(java.util.Map<String, String> groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
    }

    /**
     * <p>
     * Gets the configuration of test group.
     * </p>
     * 
     * @param groupConfiguration
     *        Gets the configuration of test group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withGroupConfiguration(java.util.Map<String, String> groupConfiguration) {
        setGroupConfiguration(groupConfiguration);
        return this;
    }

    /**
     * Add a single GroupConfiguration entry
     *
     * @see ListTestCasesResult#withGroupConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult addGroupConfigurationEntry(String key, String value) {
        if (null == this.groupConfiguration) {
            this.groupConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.groupConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.groupConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GroupConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult clearGroupConfigurationEntries() {
        this.groupConfiguration = null;
        return this;
    }

    /**
     * <p>
     * Test cases next token response.
     * </p>
     * 
     * @param nextToken
     *        Test cases next token response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Test cases next token response.
     * </p>
     * 
     * @return Test cases next token response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Test cases next token response.
     * </p>
     * 
     * @param nextToken
     *        Test cases next token response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withNextToken(String nextToken) {
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
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getRootGroupConfiguration() != null)
            sb.append("RootGroupConfiguration: ").append(getRootGroupConfiguration()).append(",");
        if (getGroupConfiguration() != null)
            sb.append("GroupConfiguration: ").append(getGroupConfiguration()).append(",");
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

        if (obj instanceof ListTestCasesResult == false)
            return false;
        ListTestCasesResult other = (ListTestCasesResult) obj;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getRootGroupConfiguration() == null ^ this.getRootGroupConfiguration() == null)
            return false;
        if (other.getRootGroupConfiguration() != null && other.getRootGroupConfiguration().equals(this.getRootGroupConfiguration()) == false)
            return false;
        if (other.getGroupConfiguration() == null ^ this.getGroupConfiguration() == null)
            return false;
        if (other.getGroupConfiguration() != null && other.getGroupConfiguration().equals(this.getGroupConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getRootGroupConfiguration() == null) ? 0 : getRootGroupConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGroupConfiguration() == null) ? 0 : getGroupConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestCasesResult clone() {
        try {
            return (ListTestCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
