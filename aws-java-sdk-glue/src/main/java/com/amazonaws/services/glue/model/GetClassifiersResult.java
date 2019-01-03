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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifiers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClassifiersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     */
    private java.util.List<Classifier> classifiers;
    /**
     * <p>
     * A continuation token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * 
     * @return The requested list of classifier objects.
     */

    public java.util.List<Classifier> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * 
     * @param classifiers
     *        The requested list of classifier objects.
     */

    public void setClassifiers(java.util.Collection<Classifier> classifiers) {
        if (classifiers == null) {
            this.classifiers = null;
            return;
        }

        this.classifiers = new java.util.ArrayList<Classifier>(classifiers);
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassifiers(java.util.Collection)} or {@link #withClassifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param classifiers
     *        The requested list of classifier objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassifiersResult withClassifiers(Classifier... classifiers) {
        if (this.classifiers == null) {
            setClassifiers(new java.util.ArrayList<Classifier>(classifiers.length));
        }
        for (Classifier ele : classifiers) {
            this.classifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * 
     * @param classifiers
     *        The requested list of classifier objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassifiersResult withClassifiers(java.util.Collection<Classifier> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     * 
     * @param nextToken
     *        A continuation token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     * 
     * @return A continuation token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     * 
     * @param nextToken
     *        A continuation token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassifiersResult withNextToken(String nextToken) {
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
        if (getClassifiers() != null)
            sb.append("Classifiers: ").append(getClassifiers()).append(",");
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

        if (obj instanceof GetClassifiersResult == false)
            return false;
        GetClassifiersResult other = (GetClassifiersResult) obj;
        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null && other.getClassifiers().equals(this.getClassifiers()) == false)
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

        hashCode = prime * hashCode + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetClassifiersResult clone() {
        try {
            return (GetClassifiersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
