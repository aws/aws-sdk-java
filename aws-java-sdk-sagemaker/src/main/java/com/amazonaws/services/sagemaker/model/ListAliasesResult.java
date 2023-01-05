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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of SageMaker image version aliases.
     * </p>
     */
    private java.util.List<String> sageMakerImageVersionAliases;
    /**
     * <p>
     * A token for getting the next set of aliases, if more aliases exist.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of SageMaker image version aliases.
     * </p>
     * 
     * @return A list of SageMaker image version aliases.
     */

    public java.util.List<String> getSageMakerImageVersionAliases() {
        return sageMakerImageVersionAliases;
    }

    /**
     * <p>
     * A list of SageMaker image version aliases.
     * </p>
     * 
     * @param sageMakerImageVersionAliases
     *        A list of SageMaker image version aliases.
     */

    public void setSageMakerImageVersionAliases(java.util.Collection<String> sageMakerImageVersionAliases) {
        if (sageMakerImageVersionAliases == null) {
            this.sageMakerImageVersionAliases = null;
            return;
        }

        this.sageMakerImageVersionAliases = new java.util.ArrayList<String>(sageMakerImageVersionAliases);
    }

    /**
     * <p>
     * A list of SageMaker image version aliases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSageMakerImageVersionAliases(java.util.Collection)} or
     * {@link #withSageMakerImageVersionAliases(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sageMakerImageVersionAliases
     *        A list of SageMaker image version aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withSageMakerImageVersionAliases(String... sageMakerImageVersionAliases) {
        if (this.sageMakerImageVersionAliases == null) {
            setSageMakerImageVersionAliases(new java.util.ArrayList<String>(sageMakerImageVersionAliases.length));
        }
        for (String ele : sageMakerImageVersionAliases) {
            this.sageMakerImageVersionAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of SageMaker image version aliases.
     * </p>
     * 
     * @param sageMakerImageVersionAliases
     *        A list of SageMaker image version aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withSageMakerImageVersionAliases(java.util.Collection<String> sageMakerImageVersionAliases) {
        setSageMakerImageVersionAliases(sageMakerImageVersionAliases);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of aliases, if more aliases exist.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of aliases, if more aliases exist.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of aliases, if more aliases exist.
     * </p>
     * 
     * @return A token for getting the next set of aliases, if more aliases exist.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of aliases, if more aliases exist.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of aliases, if more aliases exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withNextToken(String nextToken) {
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
        if (getSageMakerImageVersionAliases() != null)
            sb.append("SageMakerImageVersionAliases: ").append(getSageMakerImageVersionAliases()).append(",");
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

        if (obj instanceof ListAliasesResult == false)
            return false;
        ListAliasesResult other = (ListAliasesResult) obj;
        if (other.getSageMakerImageVersionAliases() == null ^ this.getSageMakerImageVersionAliases() == null)
            return false;
        if (other.getSageMakerImageVersionAliases() != null && other.getSageMakerImageVersionAliases().equals(this.getSageMakerImageVersionAliases()) == false)
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

        hashCode = prime * hashCode + ((getSageMakerImageVersionAliases() == null) ? 0 : getSageMakerImageVersionAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesResult clone() {
        try {
            return (ListAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
