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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PublishSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     * </p>
     */
    private String publishedSchemaArn;

    /**
     * <p>
     * The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     */

    public void setPublishedSchemaArn(String publishedSchemaArn) {
        this.publishedSchemaArn = publishedSchemaArn;
    }

    /**
     * <p>
     * The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     */

    public String getPublishedSchemaArn() {
        return this.publishedSchemaArn;
    }

    /**
     * <p>
     * The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The ARN that is associated with the published schema. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaResult withPublishedSchemaArn(String publishedSchemaArn) {
        setPublishedSchemaArn(publishedSchemaArn);
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
        if (getPublishedSchemaArn() != null)
            sb.append("PublishedSchemaArn: ").append(getPublishedSchemaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishSchemaResult == false)
            return false;
        PublishSchemaResult other = (PublishSchemaResult) obj;
        if (other.getPublishedSchemaArn() == null ^ this.getPublishedSchemaArn() == null)
            return false;
        if (other.getPublishedSchemaArn() != null && other.getPublishedSchemaArn().equals(this.getPublishedSchemaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublishedSchemaArn() == null) ? 0 : getPublishedSchemaArn().hashCode());
        return hashCode;
    }

    @Override
    public PublishSchemaResult clone() {
        try {
            return (PublishSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
