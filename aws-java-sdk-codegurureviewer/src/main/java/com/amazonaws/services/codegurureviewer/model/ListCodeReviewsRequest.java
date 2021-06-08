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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListCodeReviews" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCodeReviewsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     */
    private java.util.List<String> providerTypes;
    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * List of repository names for filtering that needs to be applied before displaying the result.
     * </p>
     */
    private java.util.List<String> repositoryNames;
    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     * 
     * @return List of provider types for filtering that needs to be applied before displaying the result. For example,
     *         <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * @see ProviderType
     */

    public java.util.List<String> getProviderTypes() {
        return providerTypes;
    }

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types for filtering that needs to be applied before displaying the result. For example,
     *        <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
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
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderTypes(java.util.Collection)} or {@link #withProviderTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types for filtering that needs to be applied before displaying the result. For example,
     *        <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListCodeReviewsRequest withProviderTypes(String... providerTypes) {
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
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types for filtering that needs to be applied before displaying the result. For example,
     *        <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListCodeReviewsRequest withProviderTypes(java.util.Collection<String> providerTypes) {
        setProviderTypes(providerTypes);
        return this;
    }

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before displaying the result. For example,
     * <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * </p>
     * 
     * @param providerTypes
     *        List of provider types for filtering that needs to be applied before displaying the result. For example,
     *        <code>providerTypes=[GitHub]</code> lists code reviews from GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public ListCodeReviewsRequest withProviderTypes(ProviderType... providerTypes) {
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
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return List of states for filtering that needs to be applied before displaying the result. For example,
     *         <code>states=[Pending]</code> lists code reviews in the Pending state. </p>
     *         <p>
     *         The valid code review states are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code>: The code review is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Pending</code>: The code review started and has not completed or failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: The code review failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>: The code review is being deleted.
     *         </p>
     *         </li>
     * @see JobState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param states
     *        List of states for filtering that needs to be applied before displaying the result. For example,
     *        <code>states=[Pending]</code> lists code reviews in the Pending state. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @see JobState
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
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        List of states for filtering that needs to be applied before displaying the result. For example,
     *        <code>states=[Pending]</code> lists code reviews in the Pending state. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public ListCodeReviewsRequest withStates(String... states) {
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
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param states
     *        List of states for filtering that needs to be applied before displaying the result. For example,
     *        <code>states=[Pending]</code> lists code reviews in the Pending state. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public ListCodeReviewsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying the result. For example,
     * <code>states=[Pending]</code> lists code reviews in the Pending state.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param states
     *        List of states for filtering that needs to be applied before displaying the result. For example,
     *        <code>states=[Pending]</code> lists code reviews in the Pending state. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public ListCodeReviewsRequest withStates(JobState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (JobState value : states) {
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
     * List of repository names for filtering that needs to be applied before displaying the result.
     * </p>
     * 
     * @return List of repository names for filtering that needs to be applied before displaying the result.
     */

    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before displaying the result.
     * </p>
     * 
     * @param repositoryNames
     *        List of repository names for filtering that needs to be applied before displaying the result.
     */

    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before displaying the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryNames(java.util.Collection)} or {@link #withRepositoryNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryNames
     *        List of repository names for filtering that needs to be applied before displaying the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeReviewsRequest withRepositoryNames(String... repositoryNames) {
        if (this.repositoryNames == null) {
            setRepositoryNames(new java.util.ArrayList<String>(repositoryNames.length));
        }
        for (String ele : repositoryNames) {
            this.repositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before displaying the result.
     * </p>
     * 
     * @param repositoryNames
     *        List of repository names for filtering that needs to be applied before displaying the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeReviewsRequest withRepositoryNames(java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
        return this;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * 
     * @param type
     *        The type of code reviews to list in the response.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * 
     * @return The type of code reviews to list in the response.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * 
     * @param type
     *        The type of code reviews to list in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public ListCodeReviewsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * 
     * @param type
     *        The type of code reviews to list in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public ListCodeReviewsRequest withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeReviewsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeReviewsRequest withNextToken(String nextToken) {
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
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: ").append(getRepositoryNames()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof ListCodeReviewsRequest == false)
            return false;
        ListCodeReviewsRequest other = (ListCodeReviewsRequest) obj;
        if (other.getProviderTypes() == null ^ this.getProviderTypes() == null)
            return false;
        if (other.getProviderTypes() != null && other.getProviderTypes().equals(this.getProviderTypes()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCodeReviewsRequest clone() {
        return (ListCodeReviewsRequest) super.clone();
    }

}
