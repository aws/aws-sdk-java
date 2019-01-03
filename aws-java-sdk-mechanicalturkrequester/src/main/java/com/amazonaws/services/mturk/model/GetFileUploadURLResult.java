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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetFileUploadURL" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFileUploadURLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A temporary URL for the file that the Worker uploaded for the answer.
     * </p>
     */
    private String fileUploadURL;

    /**
     * <p>
     * A temporary URL for the file that the Worker uploaded for the answer.
     * </p>
     * 
     * @param fileUploadURL
     *        A temporary URL for the file that the Worker uploaded for the answer.
     */

    public void setFileUploadURL(String fileUploadURL) {
        this.fileUploadURL = fileUploadURL;
    }

    /**
     * <p>
     * A temporary URL for the file that the Worker uploaded for the answer.
     * </p>
     * 
     * @return A temporary URL for the file that the Worker uploaded for the answer.
     */

    public String getFileUploadURL() {
        return this.fileUploadURL;
    }

    /**
     * <p>
     * A temporary URL for the file that the Worker uploaded for the answer.
     * </p>
     * 
     * @param fileUploadURL
     *        A temporary URL for the file that the Worker uploaded for the answer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileUploadURLResult withFileUploadURL(String fileUploadURL) {
        setFileUploadURL(fileUploadURL);
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
        if (getFileUploadURL() != null)
            sb.append("FileUploadURL: ").append(getFileUploadURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileUploadURLResult == false)
            return false;
        GetFileUploadURLResult other = (GetFileUploadURLResult) obj;
        if (other.getFileUploadURL() == null ^ this.getFileUploadURL() == null)
            return false;
        if (other.getFileUploadURL() != null && other.getFileUploadURL().equals(this.getFileUploadURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileUploadURL() == null) ? 0 : getFileUploadURL().hashCode());
        return hashCode;
    }

    @Override
    public GetFileUploadURLResult clone() {
        try {
            return (GetFileUploadURLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
