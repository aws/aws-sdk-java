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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedNotebookInstanceUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     */
    private String authorizedUrl;

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     * 
     * @param authorizedUrl
     *        A JSON object that contains the URL string.
     */

    public void setAuthorizedUrl(String authorizedUrl) {
        this.authorizedUrl = authorizedUrl;
    }

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     * 
     * @return A JSON object that contains the URL string.
     */

    public String getAuthorizedUrl() {
        return this.authorizedUrl;
    }

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     * 
     * @param authorizedUrl
     *        A JSON object that contains the URL string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookInstanceUrlResult withAuthorizedUrl(String authorizedUrl) {
        setAuthorizedUrl(authorizedUrl);
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
        if (getAuthorizedUrl() != null)
            sb.append("AuthorizedUrl: ").append(getAuthorizedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedNotebookInstanceUrlResult == false)
            return false;
        CreatePresignedNotebookInstanceUrlResult other = (CreatePresignedNotebookInstanceUrlResult) obj;
        if (other.getAuthorizedUrl() == null ^ this.getAuthorizedUrl() == null)
            return false;
        if (other.getAuthorizedUrl() != null && other.getAuthorizedUrl().equals(this.getAuthorizedUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizedUrl() == null) ? 0 : getAuthorizedUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedNotebookInstanceUrlResult clone() {
        try {
            return (CreatePresignedNotebookInstanceUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
