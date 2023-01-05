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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     */
    private java.util.List<String> inputOrder;
    /**
     * <p>
     * List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services sources
     * from specific accounts and specific Regions.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, java.util.List<String>>> listAllDimensions;
    /**
     * <p>
     * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific
     * accounts or specific Regions.
     * </p>
     */
    private java.util.List<String> listSingleDimension;
    /**
     * <p>
     * Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources from
     * specific accounts or specific Regions.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> listTwoDimensions;
    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     * 
     * @return Lists the log sources in input order, namely Region, source type, and member account.
     * @see Dimension
     */

    public java.util.List<String> getInputOrder() {
        return inputOrder;
    }

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Lists the log sources in input order, namely Region, source type, and member account.
     * @see Dimension
     */

    public void setInputOrder(java.util.Collection<String> inputOrder) {
        if (inputOrder == null) {
            this.inputOrder = null;
            return;
        }

        this.inputOrder = new java.util.ArrayList<String>(inputOrder);
    }

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputOrder(java.util.Collection)} or {@link #withInputOrder(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputOrder
     *        Lists the log sources in input order, namely Region, source type, and member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public ListLogSourcesRequest withInputOrder(String... inputOrder) {
        if (this.inputOrder == null) {
            setInputOrder(new java.util.ArrayList<String>(inputOrder.length));
        }
        for (String ele : inputOrder) {
            this.inputOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Lists the log sources in input order, namely Region, source type, and member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public ListLogSourcesRequest withInputOrder(java.util.Collection<String> inputOrder) {
        setInputOrder(inputOrder);
        return this;
    }

    /**
     * <p>
     * Lists the log sources in input order, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Lists the log sources in input order, namely Region, source type, and member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public ListLogSourcesRequest withInputOrder(Dimension... inputOrder) {
        java.util.ArrayList<String> inputOrderCopy = new java.util.ArrayList<String>(inputOrder.length);
        for (Dimension value : inputOrder) {
            inputOrderCopy.add(value.toString());
        }
        if (getInputOrder() == null) {
            setInputOrder(inputOrderCopy);
        } else {
            getInputOrder().addAll(inputOrderCopy);
        }
        return this;
    }

    /**
     * <p>
     * List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services sources
     * from specific accounts and specific Regions.
     * </p>
     * 
     * @return List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services
     *         sources from specific accounts and specific Regions.
     */

    public java.util.Map<String, java.util.Map<String, java.util.List<String>>> getListAllDimensions() {
        return listAllDimensions;
    }

    /**
     * <p>
     * List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services sources
     * from specific accounts and specific Regions.
     * </p>
     * 
     * @param listAllDimensions
     *        List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services
     *        sources from specific accounts and specific Regions.
     */

    public void setListAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> listAllDimensions) {
        this.listAllDimensions = listAllDimensions;
    }

    /**
     * <p>
     * List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services sources
     * from specific accounts and specific Regions.
     * </p>
     * 
     * @param listAllDimensions
     *        List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services
     *        sources from specific accounts and specific Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withListAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> listAllDimensions) {
        setListAllDimensions(listAllDimensions);
        return this;
    }

    /**
     * Add a single ListAllDimensions entry
     *
     * @see ListLogSourcesRequest#withListAllDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest addListAllDimensionsEntry(String key, java.util.Map<String, java.util.List<String>> value) {
        if (null == this.listAllDimensions) {
            this.listAllDimensions = new java.util.HashMap<String, java.util.Map<String, java.util.List<String>>>();
        }
        if (this.listAllDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.listAllDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ListAllDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest clearListAllDimensionsEntries() {
        this.listAllDimensions = null;
        return this;
    }

    /**
     * <p>
     * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific
     * accounts or specific Regions.
     * </p>
     * 
     * @return List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from
     *         specific accounts or specific Regions.
     */

    public java.util.List<String> getListSingleDimension() {
        return listSingleDimension;
    }

    /**
     * <p>
     * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific
     * accounts or specific Regions.
     * </p>
     * 
     * @param listSingleDimension
     *        List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from
     *        specific accounts or specific Regions.
     */

    public void setListSingleDimension(java.util.Collection<String> listSingleDimension) {
        if (listSingleDimension == null) {
            this.listSingleDimension = null;
            return;
        }

        this.listSingleDimension = new java.util.ArrayList<String>(listSingleDimension);
    }

    /**
     * <p>
     * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific
     * accounts or specific Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListSingleDimension(java.util.Collection)} or {@link #withListSingleDimension(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param listSingleDimension
     *        List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from
     *        specific accounts or specific Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withListSingleDimension(String... listSingleDimension) {
        if (this.listSingleDimension == null) {
            setListSingleDimension(new java.util.ArrayList<String>(listSingleDimension.length));
        }
        for (String ele : listSingleDimension) {
            this.listSingleDimension.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific
     * accounts or specific Regions.
     * </p>
     * 
     * @param listSingleDimension
     *        List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from
     *        specific accounts or specific Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withListSingleDimension(java.util.Collection<String> listSingleDimension) {
        setListSingleDimension(listSingleDimension);
        return this;
    }

    /**
     * <p>
     * Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources from
     * specific accounts or specific Regions.
     * </p>
     * 
     * @return Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources
     *         from specific accounts or specific Regions.
     */

    public java.util.Map<String, java.util.List<String>> getListTwoDimensions() {
        return listTwoDimensions;
    }

    /**
     * <p>
     * Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources from
     * specific accounts or specific Regions.
     * </p>
     * 
     * @param listTwoDimensions
     *        Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources
     *        from specific accounts or specific Regions.
     */

    public void setListTwoDimensions(java.util.Map<String, java.util.List<String>> listTwoDimensions) {
        this.listTwoDimensions = listTwoDimensions;
    }

    /**
     * <p>
     * Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources from
     * specific accounts or specific Regions.
     * </p>
     * 
     * @param listTwoDimensions
     *        Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources
     *        from specific accounts or specific Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withListTwoDimensions(java.util.Map<String, java.util.List<String>> listTwoDimensions) {
        setListTwoDimensions(listTwoDimensions);
        return this;
    }

    /**
     * Add a single ListTwoDimensions entry
     *
     * @see ListLogSourcesRequest#withListTwoDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest addListTwoDimensionsEntry(String key, java.util.List<String> value) {
        if (null == this.listTwoDimensions) {
            this.listTwoDimensions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.listTwoDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.listTwoDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ListTwoDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest clearListTwoDimensionsEntries() {
        this.listTwoDimensions = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts for which the log sources are displayed.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @return The maximum number of accounts for which the log sources are displayed.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts for which the log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. You can repeat the call using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withNextToken(String nextToken) {
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
        if (getInputOrder() != null)
            sb.append("InputOrder: ").append(getInputOrder()).append(",");
        if (getListAllDimensions() != null)
            sb.append("ListAllDimensions: ").append(getListAllDimensions()).append(",");
        if (getListSingleDimension() != null)
            sb.append("ListSingleDimension: ").append(getListSingleDimension()).append(",");
        if (getListTwoDimensions() != null)
            sb.append("ListTwoDimensions: ").append(getListTwoDimensions()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListLogSourcesRequest == false)
            return false;
        ListLogSourcesRequest other = (ListLogSourcesRequest) obj;
        if (other.getInputOrder() == null ^ this.getInputOrder() == null)
            return false;
        if (other.getInputOrder() != null && other.getInputOrder().equals(this.getInputOrder()) == false)
            return false;
        if (other.getListAllDimensions() == null ^ this.getListAllDimensions() == null)
            return false;
        if (other.getListAllDimensions() != null && other.getListAllDimensions().equals(this.getListAllDimensions()) == false)
            return false;
        if (other.getListSingleDimension() == null ^ this.getListSingleDimension() == null)
            return false;
        if (other.getListSingleDimension() != null && other.getListSingleDimension().equals(this.getListSingleDimension()) == false)
            return false;
        if (other.getListTwoDimensions() == null ^ this.getListTwoDimensions() == null)
            return false;
        if (other.getListTwoDimensions() != null && other.getListTwoDimensions().equals(this.getListTwoDimensions()) == false)
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

        hashCode = prime * hashCode + ((getInputOrder() == null) ? 0 : getInputOrder().hashCode());
        hashCode = prime * hashCode + ((getListAllDimensions() == null) ? 0 : getListAllDimensions().hashCode());
        hashCode = prime * hashCode + ((getListSingleDimension() == null) ? 0 : getListSingleDimension().hashCode());
        hashCode = prime * hashCode + ((getListTwoDimensions() == null) ? 0 : getListTwoDimensions().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLogSourcesRequest clone() {
        return (ListLogSourcesRequest) super.clone();
    }

}
