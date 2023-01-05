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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListFrameworks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFrameworksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN),
     * description, number of controls, creation time, and deployment status.
     * </p>
     */
    private java.util.List<Framework> frameworks;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN),
     * description, number of controls, creation time, and deployment status.
     * </p>
     * 
     * @return A list of frameworks with details for each framework, including the framework name, Amazon Resource Name
     *         (ARN), description, number of controls, creation time, and deployment status.
     */

    public java.util.List<Framework> getFrameworks() {
        return frameworks;
    }

    /**
     * <p>
     * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN),
     * description, number of controls, creation time, and deployment status.
     * </p>
     * 
     * @param frameworks
     *        A list of frameworks with details for each framework, including the framework name, Amazon Resource Name
     *        (ARN), description, number of controls, creation time, and deployment status.
     */

    public void setFrameworks(java.util.Collection<Framework> frameworks) {
        if (frameworks == null) {
            this.frameworks = null;
            return;
        }

        this.frameworks = new java.util.ArrayList<Framework>(frameworks);
    }

    /**
     * <p>
     * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN),
     * description, number of controls, creation time, and deployment status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworks(java.util.Collection)} or {@link #withFrameworks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param frameworks
     *        A list of frameworks with details for each framework, including the framework name, Amazon Resource Name
     *        (ARN), description, number of controls, creation time, and deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFrameworksResult withFrameworks(Framework... frameworks) {
        if (this.frameworks == null) {
            setFrameworks(new java.util.ArrayList<Framework>(frameworks.length));
        }
        for (Framework ele : frameworks) {
            this.frameworks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN),
     * description, number of controls, creation time, and deployment status.
     * </p>
     * 
     * @param frameworks
     *        A list of frameworks with details for each framework, including the framework name, Amazon Resource Name
     *        (ARN), description, number of controls, creation time, and deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFrameworksResult withFrameworks(java.util.Collection<Framework> frameworks) {
        setFrameworks(frameworks);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFrameworksResult withNextToken(String nextToken) {
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
        if (getFrameworks() != null)
            sb.append("Frameworks: ").append(getFrameworks()).append(",");
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

        if (obj instanceof ListFrameworksResult == false)
            return false;
        ListFrameworksResult other = (ListFrameworksResult) obj;
        if (other.getFrameworks() == null ^ this.getFrameworks() == null)
            return false;
        if (other.getFrameworks() != null && other.getFrameworks().equals(this.getFrameworks()) == false)
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

        hashCode = prime * hashCode + ((getFrameworks() == null) ? 0 : getFrameworks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFrameworksResult clone() {
        try {
            return (ListFrameworksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
