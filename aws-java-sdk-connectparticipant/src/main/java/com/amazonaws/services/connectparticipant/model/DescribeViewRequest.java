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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DescribeView" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView block operation. Represents the desired
     * view.
     * </p>
     */
    private String viewToken;
    /**
     * <p>
     * The connection token.
     * </p>
     */
    private String connectionToken;

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView block operation. Represents the desired
     * view.
     * </p>
     * 
     * @param viewToken
     *        An encrypted token originating from the interactive message of a ShowView block operation. Represents the
     *        desired view.
     */

    public void setViewToken(String viewToken) {
        this.viewToken = viewToken;
    }

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView block operation. Represents the desired
     * view.
     * </p>
     * 
     * @return An encrypted token originating from the interactive message of a ShowView block operation. Represents the
     *         desired view.
     */

    public String getViewToken() {
        return this.viewToken;
    }

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView block operation. Represents the desired
     * view.
     * </p>
     * 
     * @param viewToken
     *        An encrypted token originating from the interactive message of a ShowView block operation. Represents the
     *        desired view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeViewRequest withViewToken(String viewToken) {
        setViewToken(viewToken);
        return this;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * 
     * @param connectionToken
     *        The connection token.
     */

    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * 
     * @return The connection token.
     */

    public String getConnectionToken() {
        return this.connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * 
     * @param connectionToken
     *        The connection token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeViewRequest withConnectionToken(String connectionToken) {
        setConnectionToken(connectionToken);
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
        if (getViewToken() != null)
            sb.append("ViewToken: ").append(getViewToken()).append(",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: ").append(getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeViewRequest == false)
            return false;
        DescribeViewRequest other = (DescribeViewRequest) obj;
        if (other.getViewToken() == null ^ this.getViewToken() == null)
            return false;
        if (other.getViewToken() != null && other.getViewToken().equals(this.getViewToken()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewToken() == null) ? 0 : getViewToken().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeViewRequest clone() {
        return (DescribeViewRequest) super.clone();
    }

}
