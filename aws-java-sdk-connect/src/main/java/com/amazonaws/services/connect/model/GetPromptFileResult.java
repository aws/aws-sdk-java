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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetPromptFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPromptFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     */
    private String promptPresignedUrl;
    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @param promptPresignedUrl
     *        A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *        S3.
     */

    public void setPromptPresignedUrl(String promptPresignedUrl) {
        this.promptPresignedUrl = promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @return A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *         S3.
     */

    public String getPromptPresignedUrl() {
        return this.promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @param promptPresignedUrl
     *        A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *        S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptFileResult withPromptPresignedUrl(String promptPresignedUrl) {
        setPromptPresignedUrl(promptPresignedUrl);
        return this;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @return The timestamp when this resource was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptFileResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @return The Amazon Web Services Region where this resource was last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptFileResult withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
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
        if (getPromptPresignedUrl() != null)
            sb.append("PromptPresignedUrl: ").append(getPromptPresignedUrl()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPromptFileResult == false)
            return false;
        GetPromptFileResult other = (GetPromptFileResult) obj;
        if (other.getPromptPresignedUrl() == null ^ this.getPromptPresignedUrl() == null)
            return false;
        if (other.getPromptPresignedUrl() != null && other.getPromptPresignedUrl().equals(this.getPromptPresignedUrl()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptPresignedUrl() == null) ? 0 : getPromptPresignedUrl().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public GetPromptFileResult clone() {
        try {
            return (GetPromptFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
