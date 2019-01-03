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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCelebrityInfoResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     */
    private java.util.List<String> urls;
    /**
     * <p>
     * The name of the celebrity.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @return An array of URLs pointing to additional celebrity information.
     */

    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     */

    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrls(java.util.Collection)} or {@link #withUrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityInfoResult withUrls(String... urls) {
        if (this.urls == null) {
            setUrls(new java.util.ArrayList<String>(urls.length));
        }
        for (String ele : urls) {
            this.urls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityInfoResult withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @param name
     *        The name of the celebrity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @return The name of the celebrity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @param name
     *        The name of the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityInfoResult withName(String name) {
        setName(name);
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
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityInfoResult == false)
            return false;
        GetCelebrityInfoResult other = (GetCelebrityInfoResult) obj;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetCelebrityInfoResult clone() {
        try {
            return (GetCelebrityInfoResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
