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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotebookInstanceLifecycleConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     * configurations, use it in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle configuration.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     * configurations, use it in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     *        configurations, use it in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     * configurations, use it in the next request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     *         configurations, use it in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     * configurations, use it in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle
     *        configurations, use it in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstanceLifecycleConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle configuration.
     * </p>
     * 
     * @return An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle
     *         configuration.
     */

    public java.util.List<NotebookInstanceLifecycleConfigSummary> getNotebookInstanceLifecycleConfigs() {
        return notebookInstanceLifecycleConfigs;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigs
     *        An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle
     *        configuration.
     */

    public void setNotebookInstanceLifecycleConfigs(java.util.Collection<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs) {
        if (notebookInstanceLifecycleConfigs == null) {
            this.notebookInstanceLifecycleConfigs = null;
            return;
        }

        this.notebookInstanceLifecycleConfigs = new java.util.ArrayList<NotebookInstanceLifecycleConfigSummary>(notebookInstanceLifecycleConfigs);
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotebookInstanceLifecycleConfigs(java.util.Collection)} or
     * {@link #withNotebookInstanceLifecycleConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigs
     *        An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstanceLifecycleConfigsResult withNotebookInstanceLifecycleConfigs(
            NotebookInstanceLifecycleConfigSummary... notebookInstanceLifecycleConfigs) {
        if (this.notebookInstanceLifecycleConfigs == null) {
            setNotebookInstanceLifecycleConfigs(new java.util.ArrayList<NotebookInstanceLifecycleConfigSummary>(notebookInstanceLifecycleConfigs.length));
        }
        for (NotebookInstanceLifecycleConfigSummary ele : notebookInstanceLifecycleConfigs) {
            this.notebookInstanceLifecycleConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigs
     *        An array of <code>NotebookInstanceLifecycleConfiguration</code> objects, each listing a lifecycle
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookInstanceLifecycleConfigsResult withNotebookInstanceLifecycleConfigs(
            java.util.Collection<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs) {
        setNotebookInstanceLifecycleConfigs(notebookInstanceLifecycleConfigs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNotebookInstanceLifecycleConfigs() != null)
            sb.append("NotebookInstanceLifecycleConfigs: ").append(getNotebookInstanceLifecycleConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookInstanceLifecycleConfigsResult == false)
            return false;
        ListNotebookInstanceLifecycleConfigsResult other = (ListNotebookInstanceLifecycleConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigs() == null ^ this.getNotebookInstanceLifecycleConfigs() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigs() != null
                && other.getNotebookInstanceLifecycleConfigs().equals(this.getNotebookInstanceLifecycleConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigs() == null) ? 0 : getNotebookInstanceLifecycleConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListNotebookInstanceLifecycleConfigsResult clone() {
        try {
            return (ListNotebookInstanceLifecycleConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
