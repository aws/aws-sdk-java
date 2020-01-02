/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a Set Object Tagging operation. Amazon S3 batch operations passes each
 * value through to the underlying PUT Object tagging API. For more information about the parameters for this operation,
 * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html">PUT Object tagging</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3SetObjectTaggingOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectTaggingOperation implements Serializable, Cloneable {

    /** <p/> */
    private java.util.List<S3Tag> tagSet;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<S3Tag> getTagSet() {
        return tagSet;
    }

    /**
     * <p/>
     * 
     * @param tagSet
     */

    public void setTagSet(java.util.Collection<S3Tag> tagSet) {
        if (tagSet == null) {
            this.tagSet = null;
            return;
        }

        this.tagSet = new java.util.ArrayList<S3Tag>(tagSet);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSet(java.util.Collection)} or {@link #withTagSet(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tagSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectTaggingOperation withTagSet(S3Tag... tagSet) {
        if (this.tagSet == null) {
            setTagSet(new java.util.ArrayList<S3Tag>(tagSet.length));
        }
        for (S3Tag ele : tagSet) {
            this.tagSet.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param tagSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectTaggingOperation withTagSet(java.util.Collection<S3Tag> tagSet) {
        setTagSet(tagSet);
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
        if (getTagSet() != null)
            sb.append("TagSet: ").append(getTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SetObjectTaggingOperation == false)
            return false;
        S3SetObjectTaggingOperation other = (S3SetObjectTaggingOperation) obj;
        if (other.getTagSet() == null ^ this.getTagSet() == null)
            return false;
        if (other.getTagSet() != null && other.getTagSet().equals(this.getTagSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagSet() == null) ? 0 : getTagSet().hashCode());
        return hashCode;
    }

    @Override
    public S3SetObjectTaggingOperation clone() {
        try {
            return (S3SetObjectTaggingOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
