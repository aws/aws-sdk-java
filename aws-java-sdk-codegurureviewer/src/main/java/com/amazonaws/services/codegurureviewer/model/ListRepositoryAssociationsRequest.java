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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRepositoryAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoryAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     */
    private java.util.List<String> providerTypes;
    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * List of names to use as a filter.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the
     * GitHub account name.
     * </p>
     */
    private java.util.List<String> owners;
    /**
     * <p>
     * The maximum number of repository association results returned by <code>ListRepositoryAssociations</code> in
     * paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     * remaining results of the initial request can be seen by sending another <code>ListRepositoryAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is
     * not used, then <code>ListRepositoryAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListRepositoryAssociations</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * 
     * @return List of provider types to use as a filter.
     * @see ProviderType
     */

    public java.util.List<String> getProviderTypes() {
        return providerTypes;
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types to use as a filter.
     * @see ProviderType
     */

    public void setProviderTypes(java.util.Collection<String> providerTypes) {
        if (providerTypes == null) {
            this.providerTypes = null;
            return;
        }

        this.providerTypes = new java.util.ArrayList<String>(providerTypes);
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderTypes(java.util.Collection)} or {@link #withProviderTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListRepositoryAssociationsRequest withProviderTypes(String... providerTypes) {
        if (this.providerTypes == null) {
            setProviderTypes(new java.util.ArrayList<String>(providerTypes.length));
        }
        for (String ele : providerTypes) {
            this.providerTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListRepositoryAssociationsRequest withProviderTypes(java.util.Collection<String> providerTypes) {
        setProviderTypes(providerTypes);
        return this;
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListRepositoryAssociationsRequest withProviderTypes(ProviderType... providerTypes) {
        java.util.ArrayList<String> providerTypesCopy = new java.util.ArrayList<String>(providerTypes.length);
        for (ProviderType value : providerTypes) {
            providerTypesCopy.add(value.toString());
        }
        if (getProviderTypes() == null) {
            setProviderTypes(providerTypesCopy);
        } else {
            getProviderTypes().addAll(providerTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * 
     * @return List of states to use as a filter.
     * @see RepositoryAssociationState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * 
     * @param states
     *        List of states to use as a filter.
     * @see RepositoryAssociationState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        List of states to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public ListRepositoryAssociationsRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * 
     * @param states
     *        List of states to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public ListRepositoryAssociationsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * 
     * @param states
     *        List of states to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public ListRepositoryAssociationsRequest withStates(RepositoryAssociationState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (RepositoryAssociationState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
        return this;
    }

    /**
     * <p>
     * List of names to use as a filter.
     * </p>
     * 
     * @return List of names to use as a filter.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * List of names to use as a filter.
     * </p>
     * 
     * @param names
     *        List of names to use as a filter.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * List of names to use as a filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        List of names to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names to use as a filter.
     * </p>
     * 
     * @param names
     *        List of names to use as a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the
     * GitHub account name.
     * </p>
     * 
     * @return List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is
     *         the GitHub account name.
     */

    public java.util.List<String> getOwners() {
        return owners;
    }

    /**
     * <p>
     * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the
     * GitHub account name.
     * </p>
     * 
     * @param owners
     *        List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is
     *        the GitHub account name.
     */

    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }

        this.owners = new java.util.ArrayList<String>(owners);
    }

    /**
     * <p>
     * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the
     * GitHub account name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwners(java.util.Collection)} or {@link #withOwners(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param owners
     *        List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is
     *        the GitHub account name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withOwners(String... owners) {
        if (this.owners == null) {
            setOwners(new java.util.ArrayList<String>(owners.length));
        }
        for (String ele : owners) {
            this.owners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the
     * GitHub account name.
     * </p>
     * 
     * @param owners
     *        List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is
     *        the GitHub account name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
        return this;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by <code>ListRepositoryAssociations</code> in
     * paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     * remaining results of the initial request can be seen by sending another <code>ListRepositoryAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is
     * not used, then <code>ListRepositoryAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository association results returned by <code>ListRepositoryAssociations</code>
     *        in paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListRepositoryAssociations</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter is not used, then <code>ListRepositoryAssociations</code>
     *        returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by <code>ListRepositoryAssociations</code> in
     * paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     * remaining results of the initial request can be seen by sending another <code>ListRepositoryAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is
     * not used, then <code>ListRepositoryAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @return The maximum number of repository association results returned by <code>ListRepositoryAssociations</code>
     *         in paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListRepositoryAssociations</code> request with the returned <code>nextToken</code> value. This
     *         value can be between 1 and 100. If this parameter is not used, then
     *         <code>ListRepositoryAssociations</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by <code>ListRepositoryAssociations</code> in
     * paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     * remaining results of the initial request can be seen by sending another <code>ListRepositoryAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is
     * not used, then <code>ListRepositoryAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository association results returned by <code>ListRepositoryAssociations</code>
     *        in paginated output. When this parameter is used, <code>ListRepositoryAssociations</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListRepositoryAssociations</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter is not used, then <code>ListRepositoryAssociations</code>
     *        returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListRepositoryAssociations</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>ListRepositoryAssociations</code> request where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListRepositoryAssociations</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListRepositoryAssociations</code> request where <code>maxResults</code> was used and the results
     *         exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value. </p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListRepositoryAssociations</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>ListRepositoryAssociations</code> request where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryAssociationsRequest withNextToken(String nextToken) {
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
        if (getProviderTypes() != null)
            sb.append("ProviderTypes: ").append(getProviderTypes()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getOwners() != null)
            sb.append("Owners: ").append(getOwners()).append(",");
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

        if (obj instanceof ListRepositoryAssociationsRequest == false)
            return false;
        ListRepositoryAssociationsRequest other = (ListRepositoryAssociationsRequest) obj;
        if (other.getProviderTypes() == null ^ this.getProviderTypes() == null)
            return false;
        if (other.getProviderTypes() != null && other.getProviderTypes().equals(this.getProviderTypes()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
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

        hashCode = prime * hashCode + ((getProviderTypes() == null) ? 0 : getProviderTypes().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoryAssociationsRequest clone() {
        return (ListRepositoryAssociationsRequest) super.clone();
    }

}
