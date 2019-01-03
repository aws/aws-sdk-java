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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code> for the
 * Elasticsearch domain to which the tags are attached that you want to view are attached.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view.
     * </p>
     * 
     * @param aRN
     *        Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to
     *        view.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view.
     * </p>
     * 
     * @return Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to
     *         view.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view.
     * </p>
     * 
     * @param aRN
     *        Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to
     *        view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withARN(String aRN) {
        setARN(aRN);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsRequest == false)
            return false;
        ListTagsRequest other = (ListTagsRequest) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsRequest clone() {
        return (ListTagsRequest) super.clone();
    }

}
