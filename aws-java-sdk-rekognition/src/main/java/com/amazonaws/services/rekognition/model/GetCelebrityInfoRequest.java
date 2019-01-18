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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCelebrityInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a> operation,
     * which recognizes celebrities in an image.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a> operation,
     * which recognizes celebrities in an image.
     * </p>
     * 
     * @param id
     *        The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a>
     *        operation, which recognizes celebrities in an image.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a> operation,
     * which recognizes celebrities in an image.
     * </p>
     * 
     * @return The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a>
     *         operation, which recognizes celebrities in an image.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a> operation,
     * which recognizes celebrities in an image.
     * </p>
     * 
     * @param id
     *        The ID for the celebrity. You get the celebrity ID from a call to the <a>RecognizeCelebrities</a>
     *        operation, which recognizes celebrities in an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityInfoRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityInfoRequest == false)
            return false;
        GetCelebrityInfoRequest other = (GetCelebrityInfoRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetCelebrityInfoRequest clone() {
        return (GetCelebrityInfoRequest) super.clone();
    }

}
