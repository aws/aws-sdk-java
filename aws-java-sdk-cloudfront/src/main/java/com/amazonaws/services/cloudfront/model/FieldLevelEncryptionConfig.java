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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex data type that includes the profile configurations specified for field-level encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/FieldLevelEncryptionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be
     * provided as a query argument in a request.
     * </p>
     */
    private QueryArgProfileConfig queryArgProfileConfig;
    /**
     * <p>
     * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use
     * as by default in a request if a query argument doesn't specify a profile to use.
     * </p>
     */
    private ContentTypeProfileConfig contentTypeProfileConfig;

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures the request can't be replayed.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     * 
     * @return A unique number that ensures the request can't be replayed.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures the request can't be replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     * 
     * @param comment
     *        An optional comment about the configuration.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     * 
     * @return An optional comment about the configuration.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     * 
     * @param comment
     *        An optional comment about the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be
     * provided as a query argument in a request.
     * </p>
     * 
     * @param queryArgProfileConfig
     *        A complex data type that specifies when to forward content if a profile isn't found and the profile that
     *        can be provided as a query argument in a request.
     */

    public void setQueryArgProfileConfig(QueryArgProfileConfig queryArgProfileConfig) {
        this.queryArgProfileConfig = queryArgProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be
     * provided as a query argument in a request.
     * </p>
     * 
     * @return A complex data type that specifies when to forward content if a profile isn't found and the profile that
     *         can be provided as a query argument in a request.
     */

    public QueryArgProfileConfig getQueryArgProfileConfig() {
        return this.queryArgProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be
     * provided as a query argument in a request.
     * </p>
     * 
     * @param queryArgProfileConfig
     *        A complex data type that specifies when to forward content if a profile isn't found and the profile that
     *        can be provided as a query argument in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionConfig withQueryArgProfileConfig(QueryArgProfileConfig queryArgProfileConfig) {
        setQueryArgProfileConfig(queryArgProfileConfig);
        return this;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use
     * as by default in a request if a query argument doesn't specify a profile to use.
     * </p>
     * 
     * @param contentTypeProfileConfig
     *        A complex data type that specifies when to forward content if a content type isn't recognized and profiles
     *        to use as by default in a request if a query argument doesn't specify a profile to use.
     */

    public void setContentTypeProfileConfig(ContentTypeProfileConfig contentTypeProfileConfig) {
        this.contentTypeProfileConfig = contentTypeProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use
     * as by default in a request if a query argument doesn't specify a profile to use.
     * </p>
     * 
     * @return A complex data type that specifies when to forward content if a content type isn't recognized and
     *         profiles to use as by default in a request if a query argument doesn't specify a profile to use.
     */

    public ContentTypeProfileConfig getContentTypeProfileConfig() {
        return this.contentTypeProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use
     * as by default in a request if a query argument doesn't specify a profile to use.
     * </p>
     * 
     * @param contentTypeProfileConfig
     *        A complex data type that specifies when to forward content if a content type isn't recognized and profiles
     *        to use as by default in a request if a query argument doesn't specify a profile to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionConfig withContentTypeProfileConfig(ContentTypeProfileConfig contentTypeProfileConfig) {
        setContentTypeProfileConfig(contentTypeProfileConfig);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getQueryArgProfileConfig() != null)
            sb.append("QueryArgProfileConfig: ").append(getQueryArgProfileConfig()).append(",");
        if (getContentTypeProfileConfig() != null)
            sb.append("ContentTypeProfileConfig: ").append(getContentTypeProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionConfig == false)
            return false;
        FieldLevelEncryptionConfig other = (FieldLevelEncryptionConfig) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getQueryArgProfileConfig() == null ^ this.getQueryArgProfileConfig() == null)
            return false;
        if (other.getQueryArgProfileConfig() != null && other.getQueryArgProfileConfig().equals(this.getQueryArgProfileConfig()) == false)
            return false;
        if (other.getContentTypeProfileConfig() == null ^ this.getContentTypeProfileConfig() == null)
            return false;
        if (other.getContentTypeProfileConfig() != null && other.getContentTypeProfileConfig().equals(this.getContentTypeProfileConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getQueryArgProfileConfig() == null) ? 0 : getQueryArgProfileConfig().hashCode());
        hashCode = prime * hashCode + ((getContentTypeProfileConfig() == null) ? 0 : getContentTypeProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public FieldLevelEncryptionConfig clone() {
        try {
            return (FieldLevelEncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
